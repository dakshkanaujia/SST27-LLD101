public class UpiService implements PaymentService{

    @Override
    public String pay(Double amount) {
        return "Charged upi: " + amount;
    }

    
}