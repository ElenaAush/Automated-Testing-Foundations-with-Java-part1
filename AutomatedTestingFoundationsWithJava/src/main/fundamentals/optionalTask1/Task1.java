package main.fundamentals.optionalTask1;

public class Task1 {
    
    public static void main(String[] args) {
    
        if (args.length == 0) {
            System.out.println("Empty String[] args");
        } else {
            
            int[] array = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                array[i] = Integer.parseInt(args[i]);
            }
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
