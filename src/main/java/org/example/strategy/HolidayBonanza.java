package org.example.strategy;

public class HolidayBonanza implements DiscountStrategy{
    @Override
    public double getDiscountedPrice(double originalPrice) {
        return originalPrice - (originalPrice * 0.1);
    }
}
