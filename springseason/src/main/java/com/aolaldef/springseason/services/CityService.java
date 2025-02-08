package com.aolaldef.springseason.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aolaldef.springseason.entities.City;
import com.aolaldef.springseason.repositories.CityRepository;

@Service
public class CityService {
    
    @Autowired CityRepository cityRepository;
    
    public CityService(){

    }

    public List<City> getCities(){
        return cityRepository.findAll();
    }

}
