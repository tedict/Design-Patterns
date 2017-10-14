package com.tedict.learning.behavioral.strategy;

/**
 * Created by raghuteja on 12/10/17.
 */
public interface BillingStrategy {
  double getActPrice(final double rawPrice);
}
