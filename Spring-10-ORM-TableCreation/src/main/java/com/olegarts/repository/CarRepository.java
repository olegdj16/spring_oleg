package com.olegarts.repository;

import com.olegarts.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

    //custom methods
    //sql methods



}
