package com.basics.strings.problems;
// madam, radar, malayalam
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madame";
        String reverse = "";
        for (int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
