package parkingspot.manager;

import parkingspot.ParkingSpot;
import parkingspot.TwowheelerParkingSpot;
import parkingspot.strategy.DefaultParkingStrategy;
import parkingspot.strategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager{
    public TwoWheelerManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList, new DefaultParkingStrategy());
    }

    @Override
    public void addParkingSpace(int spaces) {
        for(int i=0; i<spaces; i++) {
            this.getParkingSpotList().add(new TwowheelerParkingSpot());
        }
    }
}
