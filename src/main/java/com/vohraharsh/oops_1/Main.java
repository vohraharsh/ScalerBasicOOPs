package com.vohraharsh.oops_1;

public class Main {
    public static void main(String[] args) {

        //How to create object

        //Type of the object = Student
        //Then variable name = harsh
        //new keyword to create the object

        Student harsh = new Student();

        //How to access attributes of the class we use .
        harsh.age = 18;
        harsh.name = "Harsh";
        harsh.psp = (float) 98.65;

        //This will give error because course has a private access modifier
        //harsh.course = "DSA";


        //How to access methods of the class we use .
        harsh.changeBatch();


        Student aayushi = new Student();
        aayushi.age = 23;
        aayushi.name = "Aayushi";
        aayushi.psp = (float) 94.65;


        //This will give error because course has a private access modifier
        //aayushi.course = "Java";
    }
}
