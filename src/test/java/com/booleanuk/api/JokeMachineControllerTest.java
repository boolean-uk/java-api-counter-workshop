package com.booleanuk.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JokeMachineControllerTest {

    @Test
    void testGetJoke() {
        JokeMachineController theJoke = new JokeMachineController();
        Assertions.assertEquals("What sort of car does an egg drive? - A yolkswagen!!!", theJoke.getJoke());
    }
}
