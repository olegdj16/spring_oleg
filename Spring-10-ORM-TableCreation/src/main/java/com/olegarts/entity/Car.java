package com.olegarts.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String make;
    private String model;

    //we will create a constructor without primary key.
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
