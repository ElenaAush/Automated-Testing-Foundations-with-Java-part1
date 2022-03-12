package main.collections.optionalTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
    
        String fileName = "C:\\data\\temp\\Automated-Testing-Foundations-with-Java-part1\\AutomatedTestingFoundationsWithJava\\data\\song";
        
        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(fileName)));
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
