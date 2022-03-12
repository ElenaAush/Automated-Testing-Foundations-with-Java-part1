package main.collections.mainTask.comparators;

import main.collections.mainTask.bouquetObjects.flowers.Flower;

import java.util.Comparator;

public class ComparatorFreshnessOfFlower implements Comparator<Flower> {
    
    @Override
    public int compare(Flower o1, Flower o2) {
        return Integer.compare(o1.getFreshness().ordinal(), o2.getFreshness().ordinal());
    }
}
