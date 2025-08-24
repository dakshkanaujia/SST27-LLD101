public class WalletService implements PaymentService{

    @Override
    public String pay(Double amount) {
        return "Charged wallet: " + amount;
    }

    
}