package com.basics.strings;
public class StringMethods {
    public static void main(String[] args) {
        String str = "Tripillar Solutions";
        System.out.println("Length: " + str.length());
        System.out.println("Char at index 2: " +
                str.charAt(2));
        System.out.println("Char at last index: " +
                str.charAt(str.length() - 1));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring(0:9): " + str.substring(0,9));
        System.out.println("Equals (Tripillar Solutions): " +
                str.equals("Tripillar Solutions"));

        System.out.println("Equals (Case Doesn't Matter): " +
                str.equalsIgnoreCase("tripillar solutions"));
        String jumbled = "Sheethal1Is1From1EEE1Sec1B";
        // "Sheethal, Is, From, EEE, Sec, B";
        String[] words = jumbled.split("1");
        System.out.println(words[3]);
        String name = "       Likitha B     ";
        System.out.println(name.trim()); // Remove spaces from s & e
        char[] letters = {'M','a','l','l','i','k','a','r','j','u','n'};
        // Mallikarjun
        // String word = letters.toString(); // Not correct - Wrapper
        String word = new String(letters);
        System.out.println(word);

    }
}
