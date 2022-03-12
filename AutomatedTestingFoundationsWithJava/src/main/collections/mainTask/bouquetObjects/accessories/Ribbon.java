package main.collections.mainTask.bouquetObjects.accessories;

import main.collections.mainTask.bouquetObjects.BouquetObject;
import main.collections.mainTask.model.Color;

public class Ribbon extends BouquetObject {

    private final Color color;
    
    public Ribbon(int price, Color color) {
        super(price);
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "\nRibbon{" +
                "price=" + price +
                ", color=" + color +
                '}';
    }
}
