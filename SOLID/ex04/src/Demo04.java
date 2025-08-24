
public class Demo04 {
    public static void main(String[] args) {
        Payment p1 = new Payment(new CardService(), 4030);
        Payment p2 = new Payment(new UpiService(), 9500);
        Payment p3 = new Payment(new WalletService(), 1300);

        System.out.println("Payment 1 = " + p1.pay());
        System.out.println("Payment 2 = " + p2.pay());
        System.out.println("Payment 3 = " + p3.pay());
    }
}
