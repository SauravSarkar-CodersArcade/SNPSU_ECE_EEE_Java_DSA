package com.basics.strings.problems;
public class ReverseAString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("nohtyP");
        System.out.println("Original: " + str);
        str.reverse();
        System.out.println("Reverse: " + str);
    }
}
