package main.classes.mainTask;

import java.time.LocalTime;
import java.util.Scanner;

public class Task10 {
    
    public static void main(String[] args) {
        
        Train [] train =  new Train[5];
        createEntries(train);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter destination: ");
        String destination = scanner.next();
        
        if (destination.equals("all")) {
    
            TrainChoice.selectAll(train);
            
        } else {
    
            try {
                Destination des = Destination.valueOf(destination.toUpperCase().trim());
    
                System.out.println("Select list (only destination - 1, destination and time - 2, destination and places - 3): ");
                int choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        TrainChoice.selectDestination(train, des);
                        break;
                    case 2:
                        System.out.println("Enter time: ");
                        LocalTime time = LocalTime.of(scanner.nextInt(), scanner.nextInt());
                        TrainChoice.selectDestinationAndAfterTime(train, des, time);
                        break;
                    case 3:
                        System.out.println("Enter places: ");
                        int places = scanner.nextInt();
                        TrainChoice.selectDestinationAndPlaces(train, des, places);
                        break;
                    default:
                        System.out.println("Wrong choice");
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("No such destination");
            }
    
        }
    }
    
    static Train[] createEntries(Train[] train) {
    
        train[0] = new Train(2345,Destination.MOLODECHNO,LocalTime.of(13,25),100);
        train[1] = new Train(7643,Destination.VITEBSK, LocalTime.of(14,45));
        train[2] = new Train(2846,Destination.ORSHA);
        train[2].setTrainNumber(4532);
        train[2].setDestination(Destination.MOLODECHNO);
        train[3] = new Train(1276,Destination.BREST,LocalTime.of(18,5),95);
        train[4] = new Train(6753,Destination.BREST,LocalTime.of(18,30));
        
        return  train;
    }
}
