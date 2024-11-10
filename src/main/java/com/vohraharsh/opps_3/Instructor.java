package com.vohraharsh.opps_3;

public class Instructor extends User {

    String batchName;
    double avgRating;

    void scheduleClass(){
        System.out.println(username + "is taking " + batchName + " class");
    }
}
