package main.collections.mainTask.bouquetObjects.flowers;

import main.collections.mainTask.bouquetObjects.BouquetObject;
import main.collections.mainTask.model.Freshness;

public abstract class Flower extends BouquetObject {
    
    protected double stemLength;
    protected Freshness freshness;
    
    {
        freshness = Freshness.FULL;
    }
    
    public Flower(int price, double stemLength) {
        super(price);
        this.stemLength = stemLength;
    }
    
    public Flower(int price, double stemLength, Freshness freshness) {
        super(price);
        this.stemLength = stemLength;
        this.freshness = freshness;
    }
    
    public double getStemLength() {
        return stemLength;
    }
    
    public Freshness getFreshness() {
        return freshness;
    }
    
    public abstract void changePrice(Freshness freshnessNew);
    
    @Override
    public String toString() {
        return "\nFlower{" +
                "price=" + price +
                ", stemLength=" + stemLength +
                ", freshness=" + freshness +
                '}';
    }
}
