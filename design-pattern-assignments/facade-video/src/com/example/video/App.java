package com.example.video;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        Decoder dec = new Decoder();
        FilterEngine fe = new FilterEngine();
        Encoder enc = new Encoder();
        SharpenAdapter sa = new SharpenAdapter();
        VideoPipelineFacade vpf = new VideoPipelineFacade(dec, fe, enc, sa);
        // TODO: Replace all above with VideoPipelineFacade.process(...)

        Path out = vpf.process(Path.of("in.mp4"), Path.of("out.p4"), true, 0.5, 2);
        System.out.println("Wrote " + out);

    }
}
