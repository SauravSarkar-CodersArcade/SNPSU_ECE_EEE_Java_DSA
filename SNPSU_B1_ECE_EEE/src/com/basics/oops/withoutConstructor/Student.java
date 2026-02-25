package com.basics.oops.withoutConstructor;
public class Student {
    // Instance Variables
    int USN;
    String name;
    int marks;
    void evaluateMarks(){
        if (marks < 45){
            System.out.println(name + " has FAILED");
        }else {
            System.out.println(name + " has PASSED");
        }
    }
    public static void main(String[] args) {
        // Object Creation Syntax: ClassName obj = new ClassName();
        Student s1 = new Student();
        s1.USN = 101;
        s1.name = "Sahana";
        s1.marks = 42;
        Student s2 = new Student();
        s2.USN = 102;
        s2.name = "Jaya";
        s2.marks = 60;
        s1.evaluateMarks();
        s2.evaluateMarks();
    }
}
