package parkingspot.strategy;

import parkingspot.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {
    public ParkingSpot find(List<ParkingSpot> parkingSpotList);
}
