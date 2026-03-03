package com.basics.strings.problems;
import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char[] a = s1.toCharArray(); // l,i,s,t,e,n
        char[] b = s2.toCharArray(); // s,i,l,e,n,t
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if (Arrays.equals(a,b)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}
