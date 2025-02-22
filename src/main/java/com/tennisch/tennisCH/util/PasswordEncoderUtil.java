package com.tennisch.tennisCH.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderUtil {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "123";
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println("EncodedPassword " + encodedPassword);
    }
}
