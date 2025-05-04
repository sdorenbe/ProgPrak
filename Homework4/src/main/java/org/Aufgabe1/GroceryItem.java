package org.Aufgabe1;

public abstract class GroceryItem extends Article {

    boolean isPopular;

    public GroceryItem(int discountThreshold, int householdLimit) {
        super(discountThreshold, householdLimit);
    }
}
