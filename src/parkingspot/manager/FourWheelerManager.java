package parkingspot.manager;

import parkingspot.FourWheelerParkingSpot;
import parkingspot.ParkingSpot;
import parkingspot.strategy.DefaultParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerManager extends ParkingSpotManager{
    public FourWheelerManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList, new DefaultParkingStrategy());
    }

    @Override
    public void addParkingSpace(int spaces) {
        for(int i=0; i<spaces; i++) {
            this.getParkingSpotList().add(new FourWheelerParkingSpot());
        }
    }
}
