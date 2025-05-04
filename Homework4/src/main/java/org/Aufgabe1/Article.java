package org.Aufgabe1;

public abstract class Article {

    int discountThreshold;
    int householdLimit;

    public Article(int discountThreshold, int householdLimit) {
        this.discountThreshold = discountThreshold;
        this.householdLimit = householdLimit;
    }

    abstract int getBulkDiscount();
    abstract boolean showWarning();
}
