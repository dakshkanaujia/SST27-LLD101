package com.example.report;

// import java.io.UncheckedIOException;
import java.nio.file.*;
import java.util.Map;
// import java.util.Objects;

public class ReportBundleFacade {
    private JsonWriter writer;
    private Zipper zipper; 
    private AuditLog log; 


    public ReportBundleFacade(){
        this.writer = new JsonWriter();
        this.zipper = new Zipper();
        this.log = new AuditLog();
    }

    public Path export(Map<String, Object> data, Path outDir, String baseName) {
        if(data == null || outDir == null || baseName == null || baseName.isBlank()){
            throw new IllegalArgumentException("Invalid input(s) to export");
        }

        Path json = writer.write(data, outDir, baseName);
        Path zip = outDir.resolve(baseName + ".zip");
        Path result = zipper.zip(json, zip);
        log.log("exported " + result);

        return result;
    }
}
