public class Payment {
    PaymentService ps; double amount;
    Payment(PaymentService p, double a){ 
        this.ps=p; 
        amount=a; 
    }
    String pay(){
        return ps.pay(amount);
    }
}