package com.advanced.collections.maps;
import java.util.HashMap;
import java.util.Map;
public class LoginSystem {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("admin", "admin@123");
        users.put("user1", "pass1");
        users.put("user2", "pass2");
        System.out.println(users);
        users.put("admin", "admin@456"); // UPDATE
        System.out.println(users);
        // How do you fetch the password of a user?
        System.out.println(users.get("admin"));
    }
}
