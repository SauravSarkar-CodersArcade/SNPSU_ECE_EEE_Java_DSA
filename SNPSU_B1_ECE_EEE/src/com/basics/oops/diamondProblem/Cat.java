package com.basics.oops.diamondProblem;
public interface Cat {
    default void sound(){
        System.out.println("Meow!");
    }
}
interface Dog{
    default void sound(){
        System.out.println("Woof!");
    }
}
class Cog implements Cat, Dog{
    public void sound(){
        // You can use any one of these - it removes ambiguity/confusion
        // System.out.println("Some new sound!!!");
        // Cat.super.sound();
        Dog.super.sound();
    }
}
class Demo {
    public static void main(String[] args) {
        Cog cog = new Cog();
        cog.sound();
    }
}
