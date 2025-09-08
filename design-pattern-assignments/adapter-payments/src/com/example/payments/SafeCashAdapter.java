package com.example.payments;

public class SafeCashAdapter implements PaymentGateway {
    private SafeCashClient safeCashClient;

    public SafeCashAdapter(SafeCashClient sfc) {
        this.safeCashClient = sfc;
    }

    @Override
    public String charge(String customerId, int amountCents) {
        SafeCashPayment safeCashPayment = safeCashClient.createPayment(amountCents, customerId);
        return safeCashPayment.confirm();
    }
    
}
