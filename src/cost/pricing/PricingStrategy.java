package cost.pricing;

import ticket.Ticket;

public interface PricingStrategy {
    public long calculatePrice(Ticket ticket);
}
