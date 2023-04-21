package org.example.context;

import org.example.Invoice;
import org.example.strategy.DiscountStrategy;

public class InvoiceGenerator {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public Invoice generateInvoice(double totalPrice) {
        Invoice invoice = new Invoice();
        invoice.setOriginalPrice(totalPrice);
        invoice.setDiscountedPrice(discountStrategy.getDiscountedPrice(totalPrice));
        return invoice;
    }
}
