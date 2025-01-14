package com.flightinfo.service;

import com.flightinfo.entity.Flight;
import com.flightinfo.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllProduct()
    {
        return flightRepository.findAll();
    }
    public Optional<Flight> getProductById(int id)
    {
        return flightRepository.findById(id);
    }

    public Flight createProduct(Flight flight)
    {
        return flightRepository.save(flight);
    }

    public Flight updateProduct(int id ,Flight flight)
    {
        return flightRepository.save(flight);
    }


    public void deleteById( int id)
    {
        flightRepository.deleteById(id);
    }
}
