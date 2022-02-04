package javaFundamentals.mainTask;

import java.util.Scanner;

public class Task4 {
    
    public static void main(String[] args) {
    
        final int SIZE;
        int [] array;
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter number of numbers: ");
        SIZE = scanner.nextInt();
        array = new int[SIZE];
        System.out.println();
    
        // Input array
        System.out.print("Enter " + SIZE + " numbers: ");
        for (int i = 0; i < SIZE; i++) {
            array[i] = scanner.nextInt();
            System.out.print(" ");
        }
        System.out.println();
    
        System.out.println("" + SumNum(array));
    }
    
    static int SumNum(int [] arrayInt){
        
        int sum = 1;
    
        for (int i = 0; i < arrayInt.length; i++) {
            sum *= arrayInt[i];
        }
        
        return sum;
    }
}
