public class Shipment {
    IShipmentType shipType; double weightKg;
    Shipment(IShipmentType shipType, double w){ 
        this.shipType=shipType; 
        this.weightKg=w; 
    }
    double cost(){
        return shipType.calculateTotal(weightKg);
    }
}