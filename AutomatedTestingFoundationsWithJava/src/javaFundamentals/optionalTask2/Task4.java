package javaFundamentals.optionalTask2;

import java.util.Scanner;

public class Task4 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        final int SIZE1;
        final int SIZE2;
        
        System.out.print("Enter 1 size = ");
        SIZE1 = scanner.nextInt();
        System.out.print("Enter 2 size = ");
        SIZE2 = scanner.nextInt();
        
        int [] [] array = inputArray(SIZE1, SIZE2);
        int [] [] resultArray = new int [SIZE1-1] [SIZE2-1];
        int remoteRow = 0;
        int remoteColumn = 0;
        int elemMax = array[0][0];
        int p = 0;
        int q;
        
        // Find position max element
        for (int i = 0; i < SIZE1; i++) {
            for (int j = 0; j < SIZE2; j++) {
                if (elemMax < array[i][j]) {
                    elemMax = array[i][j];
                    remoteRow = i;
                    remoteColumn = j;
                }
            }
        }
        
        // Delete
        for (int i = 0; i < SIZE1; i++) {
            
            if (i == remoteRow) continue;
            
            q = 0;
            for (int j = 0; j < SIZE2; j++) {
                if (j == remoteColumn) continue;
                
                resultArray[p][q] = array[i][j];
                System.out.print(resultArray[p][q] + " ");
                q++;
                
            }
            System.out.println();
            
            p++;
        }
        
    }
    
    static int [] [] inputArray(int SIZE1, int SIZE2) {
        
        int [] [] array;
        
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
