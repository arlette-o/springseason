package com.aolaldef.springseason.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aolaldef.springseason.entities.City;
import com.aolaldef.springseason.services.CityService;

@RestController
public class HomeController {
    @Autowired
    CityService cityService;

    @GetMapping("hello")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("cities")
    public List<City> getCities(){
        return cityService.getCities();
    }
}