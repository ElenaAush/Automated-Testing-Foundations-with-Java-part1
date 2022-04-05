package main.fundamentals.optionalTask2;

public class Task2 {
    
    public static void main(String[] args) {
    
        if (args.length == 0) {
            System.out.println("Empty String[] args");
        } else if (!args[0].matches("[0-9]+")) {
            System.out.println("Enter size (number)");
        } else {
        
            int[][] array = inputArray(Integer.parseInt(args[0]));
            int count = 0;
            int tempCount;
            int temp;
    
            for (int[] ints : array) {
        
                tempCount = 0;
                temp = 0;
        
                for (int j = 1; j < ints.length; j++) {
            
                    if (ints[j - 1] > ints[j]) {
                        temp++;
                    }
                    if (ints[j - 1] <= ints[j]) {
                        temp = 0;
                    }
            
                    if (temp > tempCount) {
                        tempCount = temp;
                    }
                }
        
                if (tempCount > count) {
                    count = tempCount;
                }
            }
        
            System.out.println("Largest number of increasing elements in rows " + count);
        }
    }
    
    static int [] [] inputArray(int size) {
        
        int [] [] array = new int [size] [size];
    
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = ((int)(Math.random() * 10));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        return array;
    }
}
