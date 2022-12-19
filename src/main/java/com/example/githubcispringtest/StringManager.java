package com.example.githubcispringtest;

import org.springframework.stereotype.Service;

@Service
public class StringManager {
    public String getReverseUppercaseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.toLowerCase());
        //
        return stringBuilder.reverse().toString();
    }
}
