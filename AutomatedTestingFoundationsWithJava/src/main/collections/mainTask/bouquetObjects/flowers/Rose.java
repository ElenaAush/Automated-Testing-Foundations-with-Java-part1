package main.collections.mainTask.bouquetObjects.flowers;

import main.collections.mainTask.model.Freshness;

public class Rose extends Flower {
    
    public Rose(int price, double stemLength) {
        super(price, stemLength);
    }
    
    public Rose(int price, double stemLength, Freshness freshness) {
        super(price, stemLength, freshness);
    }
    
    @Override
    public void changePrice(Freshness freshnessNew) {
        if ((freshness == Freshness.FULL && freshnessNew == Freshness.MIDDLE) || (freshness == Freshness.MIDDLE && freshnessNew == Freshness.OLD)) {
            price = price - (int)(price * 0.25);
        }
        if (freshness == Freshness.FULL && freshnessNew == Freshness.OLD) {
            price = price - (int)(price * 0.5);
        }
    }
    
    @Override
    public String toString() {
        return super.toString().replace("Flower", "Rose");
    }
}
