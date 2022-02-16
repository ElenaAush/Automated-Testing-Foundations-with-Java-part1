package javaClasses.mainTask;

import java.time.LocalTime;

class TrainChoice {
    
    public static void selectAll (Train [] train) {
    
        for (Train value : train) {
            System.out.println(value.toString());
        }
    }
    
    public static void selectDestination (Train[] train, Destination inputDestination) {
        
        for (Train value : train) {
            Destination tempDestination = value.getDestination();
            if (inputDestination.equals(tempDestination)) {
                System.out.println(value);
            }
        }
    }
    
    public static void selectDestinationAndAfterTime (Train[] train, Destination inputDestination, LocalTime time) {
    
        for (Train value : train) {
            Destination tempDestination = value.getDestination();
            if (inputDestination.equals(tempDestination)) {
                LocalTime tempTime = value.getDispatchTime();
                if (time.isBefore(tempTime) || time.equals(tempTime)) {
                    System.out.println(value);
                }
            }
        }
    }
    
    public static void selectDestinationAndPlaces (Train[] train, Destination inputDestination, int places) {
    
        for (Train value : train) {
            Destination tempDestination = value.getDestination();
            if (inputDestination.equals(tempDestination)) {
                int tempPlaces = value.getNumberOfPlace();
                if (tempPlaces == places) {
                    System.out.println(value);
                }
            }
        }
    }
}
