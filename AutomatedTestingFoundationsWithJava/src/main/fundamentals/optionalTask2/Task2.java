package main.fundamentals.optionalTask2;

import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
    
        int [] [] array = inputArray();
        int count = 0;
        int tempCount;
        int temp;
    
        for (int i = 0; i < array.length; i++) {
            
            tempCount = 0;
            temp = 0;
            
            for (int j = 1; j < array[i].length; j++) {
                
                if (array[i][j-1] > array[i][j]) temp++;
                if (array[i][j-1] <= array[i][j]) temp = 0;
                
                if (temp > tempCount) tempCount = temp;
                
            }
            
            if (tempCount > count) {
                count = tempCount;
            }
            System.out.println("tempCount " + tempCount);
            System.out.println("count " + count);
        }
    
        System.out.println("Largest number of increasing elements in rows " + count);
    
    }
    
    static int [] [] inputArray() {
    
        Scanner scanner = new Scanner(System.in);
        final int SIZE1;
        final int SIZE2;
        int [] [] array;
    
        System.out.print("Enter 1 size = ");
        SIZE1 = scanner.nextInt();
        System.out.print("Enter 2 size = ");
        SIZE2 = scanner.nextInt();
        
        array = new int [SIZE1] [SIZE2];
    
        for (int i = 0; i < SIZE1; i++) {
            for (int j = 0; j < SIZE2; j++) {
                array[i][j] = ((int)(Math.random() * 10));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        return array;
        
    }
    
}
