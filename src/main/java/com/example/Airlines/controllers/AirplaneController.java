package com.example.Airlines.controllers;

import com.example.Airlines.exceptions.AirplaneException;
import com.example.Airlines.models.Airplane;
import com.example.Airlines.repositories.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@RestController
@RequestMapping("api")
public class AirplaneController {

    @Autowired
   AirplaneRepository airplaneRepository;

    @GetMapping("/airplanes")
    public List<Airplane> getAirplanes(){ return this.airplaneRepository.getAirplanes();}

    @GetMapping("/airplanebyid/{id}")
    public Airplane getAirplaneById(@PathVariable int id){
        return this.airplaneRepository.getAirplaneById(id);

    }
    @ExceptionHandler(AirplaneException.class)
    public ResponseEntity<String> AirplaneException(AirplaneException ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);

    }

    @PostMapping("/airplane")
    public Airplane saveAirplane(@RequestBody Airplane airplane){
        this.airplaneRepository.saveAirplane(airplane);
        return airplane;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAirplane(@PathVariable int id){
        this.airplaneRepository.deleteAirplane(id);
    }

    @PutMapping("/update/{id}" )
    public Airplane updateAirplane(@RequestBody Airplane airplane){
        return this.airplaneRepository.updateAirplane(airplane);

    }

}

