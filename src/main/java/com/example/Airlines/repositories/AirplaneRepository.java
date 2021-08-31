package com.example.Airlines.repositories;

import com.example.Airlines.models.Airplane;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Repository
public class AirplaneRepository{

    List<Airplane> airplanes = new ArrayList<>(Arrays.asList(new Airplane(0, "Airbus", "XYZ1245", 2000)));

    public Airplane saveAirplane(Airplane airplane) {
        airplanes.add(airplane);
        return airplane;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public List<Airplane> getAirplanesById(int id) {
        for (Airplane airplane: airplanes){
            if(airplane.getId()== id){
                return (List<Airplane>) airplane;
            }
        }
        return null;
    }


    public List<Airplane> deleteAirplane(@PathVariable int id) {

       return airplanes;
        }


    public Airplane updateAirplane(Airplane airplane) {
        return null;
    }

    public Airplane getAirplaneById(int id) {
        return null;
    }

}