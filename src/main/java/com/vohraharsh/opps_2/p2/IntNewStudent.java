package com.vohraharsh.opps_2.p2;

import com.vohraharsh.opps_2.p1.Student;

public class IntNewStudent extends Student {

    //By adding extends keyword IntNewStudent becomes child class of Student


    public void print(){
        System.out.println(name);

        //'age' is not public in 'com. vohraharsh. opps_2.p1.Student'. Cannot be accessed from outside package
        //System.out.println(age);
    }

}
