package com.deloitte.lab9.ex3;

import java.util.function.BiPredicate;

public class Authentication {
    public static void main(String[] args) {
        BiPredicate<String, String> authenticate = (username, password) -> 
            "admin".equals(username) && "password".equals(password);
        
        System.out.println("Authentication successful: " + authenticate.test("admin", "password"));
        System.out.println("Authentication successful: " + authenticate.test("user", "pass"));
    }
}
