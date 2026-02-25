package com.basics.oops.pillars.encapsulation;

public class EncapDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        // use of setters
        e1.setId(101);
        e1.setEmail("abc@gmal.com");
        // use of getters
        System.out.println(e1.getId());
        System.out.println(e1.getEmail());
    }
}
