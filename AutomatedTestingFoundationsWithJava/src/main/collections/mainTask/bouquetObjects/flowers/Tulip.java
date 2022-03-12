package main.collections.mainTask.bouquetObjects.flowers;

import main.collections.mainTask.model.Freshness;

public class Tulip extends Flower {
    
    public Tulip(int price, double stemLength) {
        super(price, stemLength);
    }
    
    public Tulip(int price, double stemLength, Freshness freshness) {
        super(price, stemLength, freshness);
    }
    
    @Override
    public void changePrice(Freshness freshnessNew) {
        if ((freshness == Freshness.FULL && freshnessNew == Freshness.MIDDLE) || (freshness == Freshness.MIDDLE && freshnessNew == Freshness.OLD)) {
            price = price - (int)(price * 0.08);
        }
        if (freshness == Freshness.FULL && freshnessNew == Freshness.OLD) {
            price = price - (int)(price * 0.14);
        }
    }
    
    @Override
    public String toString() {
        return super.toString().replace("Flower", "Tulip");
    }
}
