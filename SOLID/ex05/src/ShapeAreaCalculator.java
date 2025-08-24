public class ShapeAreaCalculator {
    Shape shape;
    int height;
    int width;
    ShapeAreaCalculator(Shape shape, int h, int w){
        this.shape = shape;
        this.height = h;
        this.width = w;
    }
    int area(){
        return shape.area(this.height, this.width);
    }
}