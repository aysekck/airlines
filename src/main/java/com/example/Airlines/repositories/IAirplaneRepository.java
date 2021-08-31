package com.example.Airlines.repositories;

import com.example.Airlines.models.Airplane;
import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

public interface IAirplaneRepository extends CrudRepository<Airplane, Integer> {

        Airplane saveAirplane(Airplane airplane);
        List<Airplane> getAirplanes();

        List<Airplane> getAirplanesById(int id);

        List<Airplane> deleteAirplane(int id);
        Airplane updateAirplane(Airplane airplane);
        Airplane getAirplaneById(int id);
    }
    //boolean getAirplanesById(int id);

