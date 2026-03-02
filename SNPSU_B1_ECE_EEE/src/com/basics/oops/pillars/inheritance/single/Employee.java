package com.basics.oops.pillars.inheritance.single;
public class Employee {
    int id;
    String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Lecturer extends Employee{
    String subject;
    Lecturer(int id, String name, String subject){
        super(id, name);
        this.subject = subject;
    }
    void details(){
        System.out.println(id + " " + name + " " + subject);
    }
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer(100, "Rajeev", "SNS");
        lecturer.details();
    }
}
