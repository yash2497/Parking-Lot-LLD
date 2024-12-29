package gates;

import cost.CostComputation;
import cost.factory.CostComputationFactory;
import parkingspot.ParkingSpot;
import parkingspot.manager.ParkingSpotManager;
import parkingspot.manager.factory.ParkingSpotManagerFactory;
import ticket.Ticket;

import java.util.List;

public class ExitGate {
    private ParkingSpotManagerFactory parkingSpotManagerFactory;
    CostComputationFactory computationFactory;

    public ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory, CostComputationFactory computationFactory) {
        this.parkingSpotManagerFactory=parkingSpotManagerFactory;
        this.computationFactory = computationFactory;
    }

    public long cumputeCostAndVacateParkingSpace(Ticket ticket, List<ParkingSpot> parkingSpotList) {
        CostComputation costComputation = computationFactory.getCostComputation(ticket);
        this.vacateParkingSpace(ticket, parkingSpotList);
        return costComputation.calculateCost(ticket);
    }

    public void collectPayment() {
        //payment collection logic
    }

    private void vacateParkingSpace(Ticket ticket, List<ParkingSpot> parkingSpotList) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getManager(ticket.getVehicle().getVehicleType(), parkingSpotList);
        parkingSpotManager.freeParkingSpot(ticket.getVehicle());
    }


}
