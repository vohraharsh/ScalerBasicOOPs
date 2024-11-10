package com.vohraharsh.constructors;

import com.vohraharsh.oops_1.Student;

//This is no args constructor - created by developer
class noargsConst {
    int age;
    String name;

    private noargsConst(int age, String name) {
        this.age = 20;
        this.name = "ABC";
    }
}

public class NoArgsConst {

    public static void main(String[] args) {
        Student student = new Student();

        student.age = 28;
        student.name = "ABCD";
    }
}
