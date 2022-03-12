package main.collections.mainTask;

import static main.collections.mainTask.model.Freshness.*;
import static main.collections.mainTask.model.Color.*;

import main.collections.mainTask.bouquetObjects.BouquetObject;
import main.collections.mainTask.bouquetObjects.accessories.Ribbon;
import main.collections.mainTask.bouquetObjects.flowers.*;
import main.collections.mainTask.comparators.ComparatorFreshnessOfFlower;

import java.util.*;

public class Task1 {
    
    public static void main(String[] args) {
        
        List<BouquetObject> bouquet = Arrays.asList(
                new Ribbon(10, RED),
                new Rose(135,10, FULL),
                new Bluebell(90, 9.5, MIDDLE),
                new Lily(150, 10, FULL),
                new Sunflower(50, 15.5, OLD),
                new Tulip(87, 8.3)
        );
    
        System.out.println(bouquet);
        System.out.println("--- Total ---");
        System.out.println(totalPrice(bouquet));
        
        List<Flower> flowers = createOnlyFlower(bouquet);
        System.out.println("--- Sort by freshness ---");
        flowers.sort(new ComparatorFreshnessOfFlower());
        System.out.println(flowers);
        
        List<Flower> flowersInRangeStemLength = sortedByStemLengthRange(flowers);
        System.out.println(flowersInRangeStemLength);
    }
    
    static int totalPrice (List<? extends BouquetObject> bouquet) {
        int totalPrice = 0;
    
        ListIterator<? extends BouquetObject> iterator = bouquet.listIterator();
        while (iterator.hasNext()) {
            totalPrice += iterator.next().getPrice();
        }
        
        return totalPrice;
    }
    
    static List<Flower> createOnlyFlower (List<BouquetObject> list) {
        List<Flower> flowers = new ArrayList<>();
    
        for (BouquetObject bouquetObject : list) {
            try {
                flowers.add((Flower) bouquetObject);
            } catch (Exception e) {
                System.out.println("not added to flowers: " + bouquetObject.toString());
            }
        }
        
        return flowers;
    }
    
    static List<Flower> sortedByStemLengthRange (List<Flower> flowers) {
        List<Flower> flowersInRangeStemLength = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Range: ");
        double fromStemLength = scanner.nextDouble();
        double toStemLength = scanner.nextDouble();
    
        for (Flower flower: flowers) {
            if (flower.getStemLength() > fromStemLength && flower.getStemLength() < toStemLength) {
                flowersInRangeStemLength.add(flower);
            }
        }
        
        return flowersInRangeStemLength;
    }
}
