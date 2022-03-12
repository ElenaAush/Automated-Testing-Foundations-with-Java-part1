package main.fundamentals.optionalTask1;

import java.util.Scanner;

public class Task3 {
    
    public static void main(String[] args) {
    
        int [] array = inputArray();
        int averageLen = averageLength(array);
        int length;
    
        for (int i = 0; i < array.length; i++) {
            
            length = totalLength(array[i]);
            
            if (length <= averageLen){
                System.out.println("Number is " + array[i] + " with length " + length);
            }
        }
        
    }
    
    static int averageLength(int [] arr){
        
        int avLen = 0;
        int len;
    
        for (int i = 0; i < arr.length; i++) {
            len = totalLength(arr[i]);
            avLen += len;
        }
        
        avLen /= arr.length;
        
        return avLen;
        
    }
    
    static int totalLength(int number){
        
        int count = 1;
        
        while (number <= 0 || number >= 10){
            number /= 10;
            count++;
        }
        
        return count;
    }
    
    static int [] inputArray() {
        
        final int N;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of numbers: ");
        N = scanner.nextInt();
        array = new int[N];
        System.out.println();
        
        // Input array
        System.out.print("Enter " + N + " numbers: ");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
            System.out.print(" ");
        }
        System.out.println();
        
        return array;
    }
    
}
