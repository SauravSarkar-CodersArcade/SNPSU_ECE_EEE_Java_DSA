package com.basics.oops.thisKeywordExample;
public class Demo {
    // Instance Variable
    String i;
    void change(String i){
        // To remove ambiguity, we use this keyword
        this.i = i; // Ambiguity - Confusion
    }
    void display(){
        System.out.println("The value of i is: " + i);
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.change("Demo");
        obj.display();
    }
}
