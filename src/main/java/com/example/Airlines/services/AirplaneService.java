package com.example.Airlines.services;

import com.example.Airlines.models.Airplane;
import com.example.Airlines.repositories.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirplaneService {
    @Autowired
    private AirplaneRepository airplaneRepository;

    public Iterable<Airplane> getAll() {
        return this.airplaneRepository.getAirplanes();
    }

    public Airplane create(Airplane airplane) {

    return  airplane;
    }
}
