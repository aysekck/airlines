package com.example.Airlines;

import com.example.Airlines.controllers.AirplaneController;
import com.example.Airlines.models.Airplane;
import com.example.Airlines.repositories.AirplaneRepository;
import com.example.Airlines.repositories.IAirplaneRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class AirplaneTest {

    @Mock
    AirplaneRepository mockedService;

    @InjectMocks
    AirplaneController airplaneController=new AirplaneController();

    @Test
    public void getAirplaneById () {

        Airplane testAirplane=new Airplane(0,"airbus","xyz123n",200);
        List<Airplane> airplaneList=new ArrayList<>();
        airplaneList.add(testAirplane);
        airplaneController.getAirplaneById(0);


        // Arrange
        //int testAirplane = 1;
        when(mockedService.getAirplaneById(testAirplane.getId())).thenReturn(new Airplane());
        // Act
        Airplane airplane = airplaneController.getAirplaneById(0);
        // Assert
        Assertions.assertEquals(3,airplane);

}}
