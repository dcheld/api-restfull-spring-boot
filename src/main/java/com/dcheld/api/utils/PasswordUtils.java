package com.dcheld.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
    public static String generateBcrypt(String password) {
        if (password == null)
            return null;

        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
        return bCryptEncoder.encode(password);
    }

    public static boolean isValidPassword(String password, String encodedPassword) {
        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
        return bCryptEncoder.matches(password, encodedPassword);
    }
}
