package cost.pricing;

import ticket.Ticket;

import java.util.Date;

public class HourlyStrategy implements PricingStrategy{
    @Override
    public long calculatePrice(Ticket ticket) {
        Date entryTime = ticket.getEntryTime();
        Date currentTime = new Date();
        long diffInMillis = currentTime.getTime() - entryTime.getTime();
        long hoursElapsed = diffInMillis / 1000;
        return hoursElapsed * ticket.getSpot().getPrice();
    }
}
