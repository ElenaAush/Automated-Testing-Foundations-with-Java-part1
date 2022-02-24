import planes.ExperimentalPlane;
import models.MilitaryType;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;

import java.util.*;
import java.util.stream.Collectors;

public class Airport {
    
    private final List<? extends Plane> planes;
    
    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }
    
    public List<? extends Plane> getPlanes() {
        return planes;
    }
    
    public List<PassengerPlane> getPassengerPlane() {
        return planes.stream().filter(o -> o instanceof PassengerPlane).map(o -> (PassengerPlane) o).collect(Collectors.toList());
    }
    
    public List<MilitaryPlane> getMilitaryPlanes() {
        return planes.stream().filter(o -> o instanceof MilitaryPlane).map(o -> (MilitaryPlane) o).collect(Collectors.toList());
    }
    
    public List<ExperimentalPlane> getExperimentalPlanes() {
        return planes.stream().filter(o -> o instanceof ExperimentalPlane).map(o -> (ExperimentalPlane) o).collect(Collectors.toList());
    }
    
    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        return planes.stream().filter(o -> o instanceof PassengerPlane).map(o -> ((PassengerPlane) o))
                .reduce((PassengerPlane) planes.get(0), (o1, o2) -> o1.getPassengersCapacity() > o2.getPassengersCapacity() ? o1 : o2);
    }
    
    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        return planes.stream().filter(o -> o instanceof MilitaryPlane).map(o -> ((MilitaryPlane) o))
                .filter(o -> o.getType() == MilitaryType.TRANSPORT).collect(Collectors.toList());
    }
    
    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        return planes.stream().filter(o -> o instanceof MilitaryPlane).map(o -> ((MilitaryPlane) o))
                .filter(o -> o.getType() == MilitaryType.BOMBER).collect(Collectors.toList());
    }
    
    public Airport sortByMaxDistance() {
        planes.sort(Comparator.comparingInt(Plane::getMaxFlightDistance));
        return this;
    }
    
    public Airport sortByMaxSpeed() {
        planes.sort(Comparator.comparingInt(Plane::getMaxSpeed));
        return this;
    }
    
    public Airport sortByMaxLoadCapacity() {
        planes.sort(Comparator.comparingInt(Plane::getMaxLoadCapacity));
        return this;
    }
    
    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(planes, airport.planes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(planes);
    }
}
