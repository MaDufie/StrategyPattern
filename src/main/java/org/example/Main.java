package org.example;

import org.example.context.InvoiceGenerator;
import org.example.strategy.NewYearDiscount;
import org.example.strategy.EasterBonanza;

public class Main {
    public static void main(String[] args) {
        double totalPrice = 500;
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        invoiceGenerator.setDiscountStrategy(new NewYearDiscount());
        System.out.println(invoiceGenerator.generateInvoice(totalPrice));

        invoiceGenerator.setDiscountStrategy(new EasterBonanza());
        System.out.println(invoiceGenerator.generateInvoice(totalPrice));
    }
}