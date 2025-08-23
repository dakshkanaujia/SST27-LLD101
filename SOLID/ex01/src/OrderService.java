public class OrderService {
    EmailClient email = new EmailClient();
    TaxService ts = new TaxService();
    
    void checkout(String customerEmail, double subtotal) {
        double total = ts.totalWithTax(subtotal);
        email.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}