package ua.intita.qa.homework16.task2.dao;

import static org.junit.Assert.*;
import org.junit.Test;
import ua.intita.qa.homework16.task2.entity.Ticket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TicketDaoTest {
    private final CommonDao<Ticket> dao = new TicketDao();

    @Test
    public void save() {
        Map<String, Ticket> tickets = new HashMap<>();
        String ticketCsv = "data/ticket.csv";
        String comma = ",";
        String line = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ticketCsv))){
            while ((line = bufferedReader.readLine()) != null){
                String[] lineArray = line.split(comma);
                tickets.put(lineArray[0], new Ticket(lineArray[0], lineArray[1], lineArray[2], lineArray[3],
                        lineArray[4], lineArray[5]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(tickets.values());

        System.out.println("Saved");
        Map <String, Ticket> savedTickets = new HashMap<>();
        for (String id : tickets.keySet()){
            savedTickets.put(id, dao.save(tickets.get(id)));
        }
        System.out.println(savedTickets.values());

        System.out.println("FindAll");
        Collection<Ticket> allTickets = dao.findAll();
        for (Ticket ticket : allTickets){
            System.out.println(ticket);
        }

        System.out.println("FindById");
        for (String id : tickets.keySet()){
            Ticket ticketById = dao.findById(id);
            System.out.println(ticketById);
        }

        System.out.println("Delete");
        Iterator<String> iterator = savedTickets.keySet().iterator();
        while(iterator.hasNext()){
            dao.delete(iterator.next());
        }

        System.out.println(allTickets);
    }
}