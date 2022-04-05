package main.fundamentals.mainTask;

public class Task2 {
    
    public static void main(String[] args) {
        
        int size = args.length;
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }
}
