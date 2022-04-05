package main.fundamentals.optionalTask1;

public class Task3 {
    
    public static void main(String[] args) {
    
        if (args.length == 0) {
            System.out.println("Empty String[] args");
        } else {
    
            int[] array = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                array[i] = Integer.parseInt(args[i]);
            }
            int averageLen = averageLength(array);
            int length;
            boolean checkNoOneNumber = true;
    
            for (int j : array) {
        
                length = totalLength(j);
        
                if (length < averageLen) {
                    System.out.println("Number is " + j + " with length " + length);
                    checkNoOneNumber = false;
                }
            }
            
            if (checkNoOneNumber) {
                System.out.println("No one number");
            }
        }
    }
    
    static int averageLength(int[] arr) {
        
        int avLen = 0;
        int len;
    
        for (int j : arr) {
            len = totalLength(j);
            avLen += len;
        }
        
        avLen /= arr.length;
        
        return avLen;
    }
    
    static int totalLength(int number) {
        
        int count = 1;
        
        while (number <= 0 || number >= 10) {
            number /= 10;
            count++;
        }
        
        return count;
    }
}
