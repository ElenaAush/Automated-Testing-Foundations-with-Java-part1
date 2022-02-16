package javaClasses.mainTask;

import java.time.LocalTime;

class Train {
    
    private int trainNumber;
    private Destination destination;
    private LocalTime dispatchTime;
    private int numberOfPlace;
    
    {
        dispatchTime = LocalTime.of(0,0);
        numberOfPlace = 120;
    }
    
    public Train(int trainNumber, Destination destination) {
        this.trainNumber = trainNumber;
        this.destination = destination;
    }
    
    public Train(int trainNumber, Destination destination, LocalTime dispatchTime) {
        this.trainNumber = trainNumber;
        this.destination = destination;
        this.dispatchTime = dispatchTime;
    }
    
    public Train(int trainNumber, Destination destination, LocalTime dispatchTime, int numberOfPlace) {
        this.trainNumber = trainNumber;
        this.destination = destination;
        this.dispatchTime = dispatchTime;
        this.numberOfPlace = numberOfPlace;
    }
    
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
    
    public Destination getDestination() {
        return destination;
    }
    
    public void setDestination(Destination destination) {
        this.destination = destination;
    }
    
    public LocalTime getDispatchTime() {
        return dispatchTime;
    }
    
    public int getNumberOfPlace() {
        return numberOfPlace;
    }
    
    @Override
    public String toString() {
        return "Train{" +
                "trainNumber=" + trainNumber +
                ", destination='" + destination + '\'' +
                ", dispatchTime=" + dispatchTime +
                ", numberOfPlace=" + numberOfPlace +
                '}';
    }
}
