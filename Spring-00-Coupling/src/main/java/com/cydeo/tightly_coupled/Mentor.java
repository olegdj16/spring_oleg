package com.cydeo.tightly_coupled;

public class Mentor {

    // creating: has a relationship
    // so, instead of extending, do this
    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;

    //MI

    public Mentor(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor) { //MI
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMentor = partTimeMentor;
    }

    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
        //MI
    }
}
