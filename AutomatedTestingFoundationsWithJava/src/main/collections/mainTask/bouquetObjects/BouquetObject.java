package main.collections.mainTask.bouquetObjects;

public abstract class BouquetObject {
    
    protected int price;
    
    public BouquetObject(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
}
