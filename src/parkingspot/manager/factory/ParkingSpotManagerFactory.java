package parkingspot.manager.factory;

import parkingspot.FourWheelerParkingSpot;
import parkingspot.ParkingSpot;
import parkingspot.TwowheelerParkingSpot;
import parkingspot.manager.FourWheelerManager;
import parkingspot.manager.ParkingSpotManager;
import parkingspot.manager.TwoWheelerManager;
import vehicle.VehicleType;

import java.util.List;

public class ParkingSpotManagerFactory {
    public ParkingSpotManager getManager(VehicleType type, List<ParkingSpot> parkingSpotList) {
        ParkingSpot ps = parkingSpotList.getFirst();
        if(type.equals(VehicleType.TwoWheeler)) {
            if(!(ps instanceof TwowheelerParkingSpot)) {
                throw new RuntimeException("Pass in the correct list");
            }
            return new TwoWheelerManager(parkingSpotList);
        }
        else {
            if(!(ps instanceof FourWheelerParkingSpot)) {
                throw new RuntimeException("Pass in the correct list");
            }
            return new FourWheelerManager(parkingSpotList);
        }
    }
}
