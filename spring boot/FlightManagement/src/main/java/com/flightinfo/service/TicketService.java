package com.flightinfo.service;

import com.flightinfo.entity.Ticket;
import com.flightinfo.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getAllProduct()
    {
        return ticketRepository.findAll();
    }
    public Optional<Ticket> getProductById(int id)
    {
        return ticketRepository.findById(id);
    }

    public Ticket createProduct(Ticket ticket)
    {
        return ticketRepository.save(ticket);
    }

    public Ticket updateProduct(int id ,Ticket ticket)
    {
        return ticketRepository.save(ticket);
    }


    public void deleteById( int id)
    {
        ticketRepository.deleteById(id);
    }
}
