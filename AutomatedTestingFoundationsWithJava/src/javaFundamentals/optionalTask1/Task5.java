package javaFundamentals.optionalTask1;

import java.util.Scanner;

public class Task5 {
    
    public static void main(String[] args) {
        
        int[] array = inputArray();
        int countEven = 0;
        int countEvenOdd = 0;
        boolean evNum = true;
        boolean evOdNum = true;
        
        for (int i = 0; i < array.length; i++) {
            
            evNum = evenNumber(array[i]);
            if (evNum) countEven++;
            
            evOdNum = evenOddNumb(array[i]);
            if (evOdNum) countEvenOdd++;
            
        }
        
        System.out.println("Number of numbers with even digits = " + countEven);
        System.out.println("Number of numbers with an equal number of even and odd digits = " + countEvenOdd);
        
    }
    
    static boolean evenNumber(int number) {
        
        while (number != 0) {
            if (number % 2 != 0) return false;
            number /= 10;
        }
        
        return true;
    }
    
    static boolean evenOddNumb(int number) {
        
        int even = 0;
        int odd = 0;
        
        while (number != 0) {
            
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            
            number /= 10;
        }
        
        return (even == odd) ? true : false;
    }
    
    static int[] inputArray() {
        
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
