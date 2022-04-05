package main.fundamentals.optionalTask1;

public class Task5 {
    
    public static void main(String[] args) {
    
        if (args.length == 0) {
            System.out.println("Empty String[] args");
        } else {
    
            int[] array = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                array[i] = Integer.parseInt(args[i]);
            }
            int countEven = 0;
            int countEvenOdd = 0;
            boolean evNum;
            boolean evOdNum;
    
            for (int j : array) {
        
                evNum = evenNumber(j);
                if (evNum) {
                    countEven++;
                }
        
                evOdNum = evenOddNumb(j);
                if (evOdNum) {
                    countEvenOdd++;
                }
            }
    
            System.out.println("Number of numbers with even digits = " + countEven);
            System.out.println("Number of numbers with an equal number of even and odd digits = " + countEvenOdd);
        }
    }
    
    static boolean evenNumber(int number) {
        
        while (number != 0) {
            if (number % 2 != 0) {
                return false;
            }
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
        
        return even == odd;
    }
}
