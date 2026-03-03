package com.basics.strings.problems;
// programming -> r  -> pogamming
public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(str);
        char ch = 'r';
        String result = "";
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) != ch){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
