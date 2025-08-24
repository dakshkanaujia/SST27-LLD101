public class CardService implements PaymentService{

    @Override
    public String pay(Double amount) {
        return "Charged card: " + amount;
    }

    
}