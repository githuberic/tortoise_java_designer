package com.lgq.tortoise.oop.practices.p1;

/**
 * @author lgq
 */
public class NormalStrategy implements BillingStrategy {
    @Override
    public double getActPrice(double rawPrice) {
        return rawPrice;
    }
}
