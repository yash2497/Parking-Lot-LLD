package cost;

import cost.pricing.PricingStrategy;
import ticket.Ticket;

public class CostComputation {

    private PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy=pricingStrategy;
    }

    public long calculateCost(Ticket ticket) {
        return this.pricingStrategy.calculatePrice(ticket);
    }
}
