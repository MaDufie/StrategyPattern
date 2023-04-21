package org.example;

import org.example.context.InvoiceGenerator;
import org.example.strategy.FriendsAndFamilyDiscount;
import org.example.strategy.HolidayBonanza;

public class Main {
    public static void main(String[] args) {
        double totalPrice = 500;
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        invoiceGenerator.setDiscountStrategy(new FriendsAndFamilyDiscount());
        System.out.println(invoiceGenerator.generateInvoice(totalPrice));

        invoiceGenerator.setDiscountStrategy(new HolidayBonanza());
        System.out.println(invoiceGenerator.generateInvoice(totalPrice));
    }
}