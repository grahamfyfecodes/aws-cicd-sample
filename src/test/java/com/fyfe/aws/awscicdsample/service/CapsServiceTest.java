package com.fyfe.aws.awscicdsample.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class CapsServiceTest {

    @Autowired
    public CapsService testObject;

    @BeforeEach
    void setUp() {
        testObject = new CapsService();
    }

    @Test
    public void capitaliseEmpty() {
        String input = "";
        String res = testObject.capitalise(input);

        assertEquals(input, res);
    }

    @Test
    public void capitaliseNull() {
        assertThrows(
                NullPointerException.class,
                () -> testObject.capitalise(null)
        );
    }

    @Test
    public void capitaliseNum() {
        String input = "1234";
        String res = testObject.capitalise(input);

        assertEquals(input, res);
    }

    @Test
    public void capitaliseSymbol() {
        String input = ".,][]/";
        String res = testObject.capitalise(input);

        assertEquals(input, res);
    }

    @Test
    public void capitalise() {
        String input = "word";
        String res = testObject.capitalise(input);

        assertEquals("WORD", res);
    }

}