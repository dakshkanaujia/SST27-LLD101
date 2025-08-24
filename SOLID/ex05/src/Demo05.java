
public class Demo05 {
    public static void main(String[] args) {
        ShapeAreaCalculator rect = new ShapeAreaCalculator(new Rectangle(), 10, 15);
        ShapeAreaCalculator sq = new ShapeAreaCalculator(new Square(), 10, 10);

        System.out.println("Area resized of Rectangle = " + rect.area());
        System.out.println("Area resized of Square = " + sq.area());
    }
}
