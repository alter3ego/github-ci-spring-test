package com.example.githubcispringtest;

import org.springframework.stereotype.Service;

@Service
public class StringManager {
    public String getReverseUppercaseString(String string) {
        //wrong case
        //ver2
        StringBuilder stringBuilder = new StringBuilder(string.toLowerCase());
        return stringBuilder.reverse().toString();
    }
}
