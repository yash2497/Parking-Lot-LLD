package gates;

import parkingspot.ParkingSpot;
import parkingspot.manager.ParkingSpotManager;
import parkingspot.manager.factory.ParkingSpotManagerFactory;
import ticket.Ticket;
import vehicle.Vehicle;

import java.util.Date;
import java.util.List;

public class EntryGate {
    private ParkingSpotManagerFactory factory;

    public EntryGate(ParkingSpotManagerFactory factory) {
        this.factory=factory;
    }

    public Ticket findParkingSpotAndGenerateTicket(List<ParkingSpot> parkingSpotList, Vehicle v) {
        ParkingSpotManager parkingSpotManager = this.factory.getManager(v.getVehicleType(), parkingSpotList);
        ParkingSpot ps = parkingSpotManager.parkVehicle(v);
        return this.generateTicket(ps, v);
    }

    private Ticket generateTicket(ParkingSpot parkingSpot, Vehicle v) {
        return new Ticket(new Date(), v, parkingSpot);
    }

}
