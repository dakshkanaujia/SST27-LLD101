package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    Decoder decoder; FilterEngine filterEngine; Encoder encoder; SharpenAdapter  sharpenAdapter;

    public VideoPipelineFacade(Decoder d, FilterEngine f, Encoder e, SharpenAdapter s){
        this.decoder = d;
        this.filterEngine = f;
        this.encoder = e;
        sharpenAdapter = s;
    }

    Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength){
        Frame[] frames = decoder.decode(src);
        if(gray == true){
            frames = filterEngine.grayscale(frames);
        }
        if(scale != null){
            frames = filterEngine.scale(frames, scale);
        }
        if(sharpenStrength != null){
            frames = sharpenAdapter.applySharpen(frames, sharpenStrength);
        }
        return encoder.encode(frames, out);
    }
}
