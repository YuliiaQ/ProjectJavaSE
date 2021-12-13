package ua.intita.qa.homework16.task2.dao;

import ua.intita.qa.homework16.task2.entity.Ticket;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class TicketDao implements CommonDao <Ticket> {
    private final Map<String, Ticket> tickets = new HashMap<>();

    @Override
    public Ticket save(Ticket ticket) {
        Ticket result = tickets.get(ticket.getTicketId());
        if (result != null){
            result.setPlaceOfDeparture(ticket.getPlaceOfDeparture());
            result.setPlaceOfDestination(ticket.getPlaceOfDestination());
            result.setDateTime(ticket.getDateTime());
            result.setPrice(ticket.getPrice());
        }
        tickets.put(ticket.getTicketId(), ticket);
        return ticket;
    }

    @Override
    public Ticket findById(String id) {
        return tickets.get(id);
    }

    @Override
    public Collection<Ticket> findAll() {
        return tickets.values();
    }

    @Override
    public void delete(String id) {
        tickets.remove(id);
    }

}
