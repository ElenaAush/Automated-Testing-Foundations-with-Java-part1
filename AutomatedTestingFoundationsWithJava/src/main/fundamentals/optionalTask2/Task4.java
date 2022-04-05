package main.fundamentals.optionalTask2;

public class Task4 {
    
    public static void main(String[] args) {
    
        if (args.length == 0) {
            System.out.println("Empty String[] args");
        } else if (!args[0].matches("[0-9]+")) {
            System.out.println("Enter size (number)");
        } else {
    
            int size = Integer.parseInt(args[0]);
            int[][] array = inputArray(size);
            int[][] resultArray = new int[size - 1][size - 1];
            int remoteRow = 0;
            int remoteColumn = 0;
            int elemMax = array[0][0];
            int p = 0;
            int q;
    
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (elemMax < array[i][j]) {
                        elemMax = array[i][j];
                        remoteRow = i;
                        remoteColumn = j;
                    }
                }
            }
    
            for (int i = 0; i < size; i++) {
        
                if (i == remoteRow) {
                    continue;
                }
        
                q = 0;
                for (int j = 0; j < size; j++) {
                    
                    if (j == remoteColumn) {
                        continue;
                    }
            
                    resultArray[p][q] = array[i][j];
                    System.out.print(resultArray[p][q] + " ");
                    q++;
                }
                System.out.println();
        
                p++;
            }
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
