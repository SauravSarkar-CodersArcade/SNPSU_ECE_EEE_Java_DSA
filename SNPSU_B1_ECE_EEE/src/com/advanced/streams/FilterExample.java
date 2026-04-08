package com.advanced.streams;
import java.util.Arrays;
import java.util.List;
public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22,44,11,13,21,45,67,89);
        // Give me the list of even numbers
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        // Give me the list of numbers divisible by 11
        numbers.stream()
                .filter(n -> n % 11 == 0)
                .forEach(System.out::println);
    }
}
