package com.example.video;

public class SharpenAdapter {
    private LegacySharpen legacySharpen;
    public SharpenAdapter() {
        this.legacySharpen = new LegacySharpen();
    }

    public Frame[] applySharpen(Frame[] frames, int strength){
        String frame = frameToHandle(frames);
        String sharpenedFrame = legacySharpen.applySharpen(frame, strength);
        return handleToFrame(sharpenedFrame);
    }

    public String frameToHandle(Frame[] frames){
        return "HANDLE_FRAME";
    } 

    public Frame[] handleToFrame(String s){
        return new Frame[]{new Frame(1920, 1080)};
    }

}
