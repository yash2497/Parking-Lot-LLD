package parkingspot.strategy;

import parkingspot.ParkingSpot;

import java.util.List;

public class DefaultParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot find(List<ParkingSpot> parkingSpotList) {
        for(ParkingSpot ps: parkingSpotList) {
            if(ps.isEmpty()) {
                return ps;
            }
        }
        return null;
    }
}
