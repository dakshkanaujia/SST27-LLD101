
public class Square implements Shape {
    int size;
    public void setSize(int s){
        this.size = s;
    } 

    @Override
    public int area(int h, int w){
        if(h == w){
            return h*w;
        }
        throw new Error("Invalid height width for square, should be same");
    }
}