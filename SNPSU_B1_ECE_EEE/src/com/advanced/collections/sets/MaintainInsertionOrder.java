package com.advanced.collections.sets;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class MaintainInsertionOrder {
    public static void main(String[] args) {
        HashSet<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(21);
        set.add(12);
        set.add(22);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
    }
}
