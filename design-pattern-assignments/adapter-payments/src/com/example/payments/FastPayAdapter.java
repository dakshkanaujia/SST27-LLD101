package com.example.payments;

public class FastPayAdapter implements PaymentGateway{
    FastPayClient fastPayClient;
    public FastPayAdapter(FastPayClient fsc){
        this.fastPayClient = fsc;
    }

    @Override
    public String charge(String customerId, int amountCents) {
        return fastPayClient.payNow(customerId, amountCents);
    }
    
}
