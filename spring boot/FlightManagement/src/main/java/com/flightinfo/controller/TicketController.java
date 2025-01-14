package com.flightinfo.controller;

import com.flightinfo.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ticket/")
public class TicketController {

   @Autowired
    private TicketService ticketService;
}
