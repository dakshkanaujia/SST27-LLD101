public class Standard implements IShipmentType {
    
    @Override
    public double calculateTotal(double w) {
        return 50 + 5*w;
    }

}