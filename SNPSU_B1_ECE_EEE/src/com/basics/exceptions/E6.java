package com.basics.exceptions;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class E6 {
    public static void main(String[] args) throws Exception{
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter any data:");
            str = br.readLine();
            System.out.println(str);
            br.close();
        }
    }
}
