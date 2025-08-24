public class Overnight implements IShipmentType {
    
    @Override
    public double calculateTotal(double w) {
        return 120 + 10*w;
    }

}