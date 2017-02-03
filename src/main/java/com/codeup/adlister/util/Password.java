package com.codeup.adlister.util;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class Password extends Authenticator{

    String username;
    String password;

    private Password(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
        public PasswordAuthentication getPasswordAuthentication() {
        return  new PasswordAuthentication(username, password.toCharArray());
    }

    public static boolean check(String password, String password1) {
        return true;
    }
}