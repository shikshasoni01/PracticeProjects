package com.flightinfo.service;

import com.flightinfo.entity.Airport;
import com.flightinfo.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirportService {
    @Autowired
    private AirportRepository airportRepository;

    public List<Airport> getAllProduct()
    {
        return airportRepository.findAll();
    }
    public Optional<Airport> getProductById(int id)
    {
        return airportRepository.findById(id);
    }

    public Airport createProduct(Airport airport)
    {
        return airportRepository.save(airport);
    }

    public Airport updateProduct(int id ,Airport airport)
    {
        return airportRepository.save(airport);
    }


    public void deleteById( int id)
    {
        airportRepository.deleteById(id);
    }
}
