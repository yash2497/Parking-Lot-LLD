package parkingspot.manager;

import parkingspot.ParkingSpot;
import parkingspot.strategy.ParkingStrategy;
import vehicle.Vehicle;

import java.util.List;

public class ParkingSpotManager {
    private List<ParkingSpot> parkingSpotList;
    private ParkingStrategy strategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
        this.parkingSpotList=parkingSpotList;
        this.strategy=parkingStrategy;
    }

    private ParkingSpot findParkingSpot() {
        return this.strategy.find(this.parkingSpotList);
    }

    public void addParkingSpace(int spaces) {

    }

    public void removeParkingSpace(int spaces) {

    }

    public ParkingSpot parkVehicle(Vehicle v) {
        ParkingSpot ps = this.findParkingSpot();
        if(ps!=null) {
            ps.parkVehicle(v);
            return ps;
        }
        else {
            throw new RuntimeException("Parking spot full");
        }

    }

    public void freeParkingSpot(Vehicle v) {
        ParkingSpot ps = this.findVehicleSpot(v);
        if(ps!=null) {
            ps.removeVehicle();
        }
        else {
            throw new RuntimeException("Vehicle not found");
        }

    }

    private ParkingSpot findVehicleSpot(Vehicle v) {
        for(ParkingSpot ps: this.parkingSpotList) {
            if(ps.getVehicle().getVehicleNo().equals(v.getVehicleNo())) {
                return ps;
            }
        }
        return null;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public ParkingStrategy getStrategy() {
        return strategy;
    }
}
