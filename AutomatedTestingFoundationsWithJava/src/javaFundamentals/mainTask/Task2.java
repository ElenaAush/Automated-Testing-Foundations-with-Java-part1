package javaFundamentals.mainTask;

import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        
        final int SIZE;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        SIZE = scanner.nextInt();
        array = new int[SIZE];
        
        // Input array
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        System.out.println();
        
        // Output array
        for (int i = SIZE - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
    }
}
