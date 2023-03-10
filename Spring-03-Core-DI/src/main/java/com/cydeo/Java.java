package com.cydeo;

import org.springframework.stereotype.Component;

@Component
public class Java {

    // Field Injection
    //  @Autowired
    //  OfficeHours officeHours;

    //Constructor Injection
    OfficeHours officeHours;

//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    
    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : 15" + (20 + officeHours.getHours()));

    }
}
