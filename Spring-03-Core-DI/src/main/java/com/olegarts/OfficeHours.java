package com.olegarts;

import org.springframework.stereotype.Component;

/**
 * The `OfficeHours` class is a Spring component that represents additional office hours.
 * It contains a method to get the number of office hours.
 */
@Component
public class OfficeHours {

    /**
     * Returns the number of office hours.
     *
     * @return the number of office hours
     */
    public int getHours(){
        return 5;
    }
}
