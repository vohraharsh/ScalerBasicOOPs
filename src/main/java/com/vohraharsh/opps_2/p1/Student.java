package com.vohraharsh.opps_2.p1;

public class Student {
    //Class is similar to blueprint

    //These are attributes of the class
    int age;
    float psp;
    protected String name;
    private String course;


    //These are methods/behaviours

    void changeBatch(){
        System.out.println("Batch Changed");
    }

    void joinClass(){
        System.out.println(name + " - Join Class");
    }

    void printDetails(){
        System.out.println("Age: " + age);
        System.out.println("PSP: " + psp);
        System.out.println("Name: " + name);
    }
}

