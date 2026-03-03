package com.basics.strings.problems;
// education
// cauliflower
// Mozambique
public class CountVowels {
    public static void main(String[] args) {
        String str = "education";
        int count = 0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Vowels: " + count);
    }
}
