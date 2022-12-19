package com.example.githubcispringtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StringManagerTest {

    private final StringManager stringManager;
    @Autowired
    StringManagerTest(StringManager stringManager) {
        this.stringManager = stringManager;
    }

    @Test
    void getReverseUppercaseString() {
        String source = "Hello world!";
        String expected = "!DLROW OLLEH";

        String actual = stringManager.getReverseUppercaseString(source);

        assertEquals(expected, actual);
    }

}