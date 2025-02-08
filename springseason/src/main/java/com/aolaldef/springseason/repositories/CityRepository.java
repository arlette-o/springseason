package com.aolaldef.springseason.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aolaldef.springseason.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{
    
}
