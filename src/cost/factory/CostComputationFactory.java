package cost.factory;

import cost.CostComputation;
import cost.FourWheelerCostComputation;
import cost.TwoWheelerCostComputation;
import ticket.Ticket;
import vehicle.VehicleType;

public class CostComputationFactory {
    public CostComputation getCostComputation(Ticket ticket) {
        if(ticket.getVehicle().getVehicleType().equals(VehicleType.TwoWheeler)) {
            return new TwoWheelerCostComputation();
        }
        else {
            return new FourWheelerCostComputation();
        }
    }
}
