package ticket;

import parkingspot.ParkingSpot;
import vehicle.Vehicle;

import java.util.Date;

public class Ticket {
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot spot;

    public Ticket(Date entryTime, Vehicle v, ParkingSpot spot) {
        this.entryTime=entryTime;
        this.vehicle =v;
        this.spot=spot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }
}
