public class Player {
    private Frame last;
    void play(byte[] fileBytes){
        // decode
        Frame f = new Frame(fileBytes); // pretend decoding
        last = f;
        // draw UI
        DrawUI di = new DrawUI();
        di.drawui(fileBytes);
        // cache
        System.out.println("Cached last frame? " + (last!=null));
    }
}