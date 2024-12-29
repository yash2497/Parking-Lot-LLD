import cost.factory.CostComputationFactory;
import gates.EntryGate;
import gates.ExitGate;
import parkingspot.ParkingSpot;
import parkingspot.TwowheelerParkingSpot;
import parkingspot.manager.factory.ParkingSpotManagerFactory;
import ticket.Ticket;
import vehicle.Vehicle;
import vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotRunner {
    public static void main(String[] args) throws InterruptedException {
        List<ParkingSpot> twoWheelerSpots = new ArrayList<>();
        for(int i=0; i<10; i++) {
            twoWheelerSpots.add(new TwowheelerParkingSpot());
        }
        List<ParkingSpot> fourWheelerSpots = new ArrayList<>();
        for(int i=0; i<5; i++) {
            twoWheelerSpots.add(new TwowheelerParkingSpot());
        }

        Vehicle ktm = new Vehicle("MP-20-NC-2845", VehicleType.TwoWheeler);

        EntryGate gate = new EntryGate(new ParkingSpotManagerFactory());

        Ticket ticket = gate.findParkingSpotAndGenerateTicket(twoWheelerSpots, ktm);

        Thread.sleep(10000);

        ExitGate exitGate = new ExitGate(new ParkingSpotManagerFactory(), new CostComputationFactory());
        long price = exitGate.cumputeCostAndVacateParkingSpace(ticket, twoWheelerSpots);
        System.out.println(price);

    }
}