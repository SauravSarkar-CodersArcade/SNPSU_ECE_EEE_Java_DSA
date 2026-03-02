package com.basics.oops.pillars.inheritance.single;
public class College {
    static String name = "SNPSU";
    String address;
    int pinCode;
    public College(String address, int pinCode) {
        this.address = address;
        this.pinCode = pinCode;
    }
}
class Department extends College {
    String block;
    int lecturerCount;
    Department(String address, int pinCode, String block, int lecturerCount){
        super(address, pinCode);
        this.block = block;
        this.lecturerCount = lecturerCount;
    }
    void departmentDetails(){
        System.out.println(block + " " + lecturerCount + " " +
                address + " " + pinCode + " " + College.name);
    }
    public static void main(String[] args) {
        Department department = new Department("Bangalore",
                560057, "A", 15);
        department.departmentDetails();
    }
}
/*
Points to remember:
✅ super.something -> variable from Parent Class
☑ super() -> constructor of the Parent Class
❌ Don't use super. for constructor
ℹ These are important for interviews & vivas  ️ ️
 */
