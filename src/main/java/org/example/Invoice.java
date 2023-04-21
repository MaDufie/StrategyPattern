package org.example;

public class Invoice {
    private double originalPrice;
    private double discountedPrice;

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "originalPrice=" + originalPrice +
                ", discountedPrice=" + discountedPrice +
                '}';
    }
}
