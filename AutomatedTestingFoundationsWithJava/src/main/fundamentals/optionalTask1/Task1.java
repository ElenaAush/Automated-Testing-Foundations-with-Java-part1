package main.fundamentals.optionalTask1;

import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args) {
        
        int [] array = inputArray();
        int minNumb = array[0];
        int maxNumb = array[0];
        int countMinNumber;
        int countMaxNumber;
        countMinNumber = countMaxNumber = totalLength(array[0]);
        int len;
    
        for (int i = 1; i < array.length; i++) {
    
            len = totalLength(array[i]);
            
            if (len < countMinNumber) {
                countMinNumber = len;
                minNumb = array[i];
            }
            
            if (len > countMaxNumber) {
                countMaxNumber = len;
                maxNumb = array[i];
            }
    
        }
    
        System.out.println("Min number is " + minNumb + " with length " + countMinNumber);
        System.out.println("Max number is " + maxNumb + " with length " + countMaxNumber);
        
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
    
    static int totalLength(int number){
        
        int count = 1;
        
        while (number <= 0 || number >= 10){
            number /= 10;
            count++;
        }
        
        return count;
    }
    
}
