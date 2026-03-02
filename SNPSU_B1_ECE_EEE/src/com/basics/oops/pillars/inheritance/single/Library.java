package com.basics.oops.pillars.inheritance.single;
public class Library {
    String name;
    int id;

    public Library(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class Book extends Library{
    double price;
    Book(String name, int id, double price){
        super(name, id);
        this.price = price;
    }
    void bookDetails(){
        System.out.println(name + " " + id + " " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("You Can Win", 100, 200);
        book.bookDetails();
    }
}
