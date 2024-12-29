package cost.pricing;

import ticket.Ticket;

import java.util.Date;

public class MinuteStrategy implements PricingStrategy{

    @Override
    public long calculatePrice(Ticket ticket) {
        Date entryTime = ticket.getEntryTime();
        Date currentTime = new Date();
        long diffInMillis = currentTime.getTime() - entryTime.getTime();
        long minsElapsed = diffInMillis / (1000 * 60);
        return minsElapsed * ticket.getSpot().getPrice();
    }
}
