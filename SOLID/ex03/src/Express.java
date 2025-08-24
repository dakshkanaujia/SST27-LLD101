public class Express implements IShipmentType {
    @Override
    public double calculateTotal(double w) {
        return 80 + 8*w;
    }
}