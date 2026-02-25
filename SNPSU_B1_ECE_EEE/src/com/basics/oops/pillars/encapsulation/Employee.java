package com.basics.oops.pillars.encapsulation;

public class Employee {
    private int id;
    private String email;
    // setters
    public void setId(int id){
        this.id = id;
    }
    public void setEmail(String email){
        this.email = email;
    }
    // getters
    public int getId(){
        return this.id;
    }
    public String getEmail(){
        return this.email;
    }
}
