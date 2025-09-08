package beverages_decorator;

public abstract class BeverageDecorator extends Beverage {
    protected Beverage beverage;  // wrapped object

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
