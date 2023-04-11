package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //creates a table through hibernate
public class Employee {

    @Id
    private int id;
    private String firstName;
    private String lastName;

}


