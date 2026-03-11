package com.advanced.collections.maps;
import java.util.HashMap;
import java.util.Map;
public class APILogs {
    public static void main(String[] args) {
        // String str = "Hello";
        // System.out.println(str.hashCode());
        Map<String, String> logs = new HashMap<>();
        logs.put("50", "SignUp");
        logs.put("2", "Login");
        logs.put("100", "Browse Instagram Reels");
        logs.put("7", "Scroll Up & Down");
        logs.put("1", "Logout");
        System.out.println("API Logs: " + logs);
    }
}
