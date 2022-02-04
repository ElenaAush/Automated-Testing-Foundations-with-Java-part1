package javaFundamentals.mainTask;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    
    public static void main(String[] args) {
    
        final int SIZE;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Enter number of numbers: ");
        SIZE = scanner.nextInt();
        array = new int[SIZE];
        System.out.println();
        
        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt();
        }
        
        String arrayString = Arrays.toString(array);
        System.out.print(arrayString);
        System.out.println(arrayString);
        
    }
}
