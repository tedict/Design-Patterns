package com.tedict.learning.behavioral.strategy;

/**
 * Created by raghuteja on 12/10/17.
 */
public class HappyHourStrategy implements BillingStrategy {

  public double getActPrice(final double rawPrice) {
    return rawPrice*0.5;
  }

}
