package org.Aufgabe1;

public class Flour extends PopularGrocery {

    public Flour(int quantity, int discountThreshold, int popularityLevel) {
        super(discountThreshold, 15, popularityLevel);
        this.quantity = quantity;
        this.discountThreshold = discountThreshold;
    }

    public int getBulkDiscount() {
        if (quantity >= discountThreshold)
            return 5;
        else
            return 0;
    }

}
