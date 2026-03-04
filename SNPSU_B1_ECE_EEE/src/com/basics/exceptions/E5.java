package com.basics.exceptions;
import java.io.IOException;
public class E5 {
    static void readFile() throws IOException { // Ducking
        throw new IOException("Trying to read the file.");
    }
    public static void main(String[] args)  {
        try {
            function_a();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    static void function_a() throws IOException{
        function_b();
    }
    static void function_b() throws IOException{
        readFile();
    }
}
/*
⭐ For checked exceptions we always use a try-catch block or throws
⭐ The 'throws' keyword doesn't handle the exception
⭐ It only passes on the information to the calling method
⭐ The calling method has to handle the exception
⭐ The 'throws' keyword is used in the "method signature"
⭐ The 'process' of passing on the information is called "DUCKING"
 */
