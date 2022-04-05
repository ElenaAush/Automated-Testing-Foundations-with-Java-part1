package main.fundamentals.mainTask;

import java.util.Random;

public class Task3 {
    
    public static void main(String[] args) {
    
        int size = Integer.parseInt(args[0]);
        int[] array = new int[size];
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        for (int elem : array) {
            System.out.println(elem);
        }
    }
}
