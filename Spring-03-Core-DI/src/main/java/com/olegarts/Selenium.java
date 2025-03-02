package com.olegarts;

import org.springframework.stereotype.Component;

/**
 * The `Selenium` class is a Spring component that represents a teaching resource.
 * It contains a method to print the weekly teaching hours.
 */
@Component
public class Selenium {

    /**
     * Prints the weekly teaching hours to the console.
     */
    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : 15");

    }
}
