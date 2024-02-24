package com.kbtg.bootcamp.posttest.service;


import com.kbtg.bootcamp.posttest.lottery.Ticket;
import com.kbtg.bootcamp.posttest.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getTicketList(){
        return ticketRepository.findAll();
    }


    public Ticket createTicket(Integer userid, String ticketid) {
        Ticket ticket = new Ticket();
        ticket.setUserid(userid);
        ticket.setTicketid(ticketid);
        ticketRepository.save(ticket);
        return ticket;
    }

    public List<Ticket> getTicketByUser(Integer userid) {
    return ticketRepository.findByUserid(userid);
    }




    public void deleteTicket(Integer userid, String ticketid) {

        ticketRepository.deleteAll(ticketRepository.findByUserid(userid).stream().filter(ticket -> ticket.getTicketid().equals(ticketid)).toList());
        System.out.println("ticket : "+ ticketid);
    }


}
