public class Demo03 {
    public static void main(String[] args) {
        // System.out.println(new ShippingCostCalculator().cost(new Shipment("EXPRESS", 2.0)));
        Shipment s1 = new Shipment(new Standard(), 10);
        Shipment s2 = new Shipment(new Express(), 10);
        Shipment s3 = new Shipment(new Overnight(), 10);

        System.out.println("Express:   " + s1.cost());
        System.out.println("Standard:  " + s2.cost());
        System.out.println("Overnight: " + s3.cost());

    }
}
