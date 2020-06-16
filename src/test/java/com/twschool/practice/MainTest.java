package com.twschool.practice;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
public class MainTest {
    @Test
    public void should_return_4A0B_init_1234() throws IOException {

        GuessNumber guessNumber = new GuessNumber();
        String input = "1234";
        assertEquals("4A0B",guessNumber);

    }

}
