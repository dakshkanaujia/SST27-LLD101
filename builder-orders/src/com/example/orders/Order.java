package com.example.orders;

import java.util.ArrayList;
import java.util.List;

/**
 * Telescoping constructors + setters. Allows invalid states.
 */
public class Order {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines = new ArrayList<>();
    private final Integer discountPercent; // 0..100 expected, but not enforced
    private final boolean expedited;
    private final String notes;

    

    public Order(Builder builder) {
        this.id = builder.id;
        this.customerEmail = builder.customerEmail;
        this.lines.addAll(builder.lines);
        this.discountPercent = builder.discountPercent;
        this.expedited = builder.expedited;
        this.notes = builder.notes;
    }

    public String getId() {
        return id;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public List<OrderLine> getLines() {
        return new ArrayList<>(lines);
    } // leaks internal list : fixed by returning a copy

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public boolean isExpedited() {
        return expedited;
    }

    public String getNotes() {
        return notes;
    }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines)
            sum += l.getQuantity() * l.getUnitPriceCents();
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null)
            return base;
        return base - (base * discountPercent / 100);
    }

    public static class Builder {
        private String id;
        private String customerEmail;
        private final List<OrderLine> lines = new ArrayList<>();
        private Integer discountPercent; // 0..100 expected, but not enforced
        private boolean expedited;
        private String notes;

        public Builder(String id, String customerEmail, List<OrderLine> initLines) {
            this.id = id;
            this.customerEmail = customerEmail;
            if(initLines != null){
                this.lines.addAll(initLines);
            }
        }

        public Builder discountPercent(Integer discountPercent) {
            this.discountPercent = discountPercent;
            return this;
        }

        public Builder expedited(boolean expedited) {
            this.expedited = expedited;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public Builder addLine(OrderLine line) {
            lines.add(line);
            return this;
        }

        public Order build() {
            if(PricingRules.isValidEmail(customerEmail) && PricingRules.isValidDiscount(discountPercent) && !lines.isEmpty()) {
                return new Order(this);
            }

            throw new IllegalArgumentException("Invalid order parameters");
        }
    }
}
