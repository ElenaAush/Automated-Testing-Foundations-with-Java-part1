package main.collections.optionalTask;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();
        
        while (number >= 1) {
            stack.push(number % 10);
            number /= 10;
        }
    
        for (int i = 1; !stack.isEmpty(); i *= 10) {
            number = number + stack.pop() * i;
        }
    
        System.out.println(number);
    }
}
