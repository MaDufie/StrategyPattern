package org.example.strategy;

public class EasterBonanza implements DiscountStrategy{
    @Override
    public double getDiscountedPrice(double originalPrice) {
        return originalPrice - (originalPrice * 0.1);
    }
}
