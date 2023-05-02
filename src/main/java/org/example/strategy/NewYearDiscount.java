package org.example.strategy;

public class NewYearDiscount implements DiscountStrategy{
    @Override
    public double getDiscountedPrice(double originalPrice) {
        return originalPrice - (originalPrice * 0.2);
    }
}
