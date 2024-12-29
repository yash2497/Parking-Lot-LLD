package parkingspot;

import vehicle.Vehicle;

public class ParkingSpot {
    private int price;
    private Vehicle vehicle;
    private boolean isEmpty;

    public ParkingSpot(int price) {
        this.price=price;
        this.vehicle=null;
        this.isEmpty=true;
    }
    public void parkVehicle(Vehicle vehicle) {
        this.vehicle=vehicle;
        this.isEmpty=false;
    }
    public void removeVehicle() {
        this.vehicle=null;
        this.isEmpty=true;
    }

    public int getPrice() {
        return price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
