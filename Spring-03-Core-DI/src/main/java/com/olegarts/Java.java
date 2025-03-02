package com.olegarts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {

    // Field Injection
    //  @Autowired <--- being Deprecated, will not use it
    //  OfficeHours officeHours;

    //Constructor Injection
    OfficeHours officeHours;

    /**
     * Starting with Spring 4.3, if a class has only one constructor,
     * the @Autowired annotation is optional.
     * However, if there are multiple constructors, you must explicitly
     * specify the constructor to be used with the @Autowired annotation.
     */

    // @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));

    }
}
