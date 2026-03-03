package com.basics.exceptions;
public class E1 {
    public static void main(String[] args) {
        int i, j, k=0;
        i = 10;
        j = 10;
        try {
            k = i / j;
            String name = "Java";
            System.out.println(name.charAt(6));
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
            e.printStackTrace();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("The index of string is OOB");
        }catch (Exception e){
            System.out.println("Something unexpected happened.");
        }
        finally {
            System.out.println("This block will always execute.");
            System.out.println("No matter what happens to the code.");
            System.out.println("We use this block for releasing resources.");
            System.out.println("All internet, db, files, etc are closed here.");
        }
        System.out.println("The value of k is: " + k);

    }
}
