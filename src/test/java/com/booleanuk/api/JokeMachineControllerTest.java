package com.booleanuk.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JokeMachineControllerTest {

    @Test
    void testGettingJoke(){
        JokeMachineController theJoke = new JokeMachineController(100);
        Assertions.assertEquals("What do you call fake spaghetti? - An impasta!", theJoke.getJoke());
        Assertions.assertEquals("I only know 25 letters of the alphabet. I don't know y.", theJoke.getJoke());
        Assertions.assertEquals("I only know 25 letters of the alphabet. I don't know y.", theJoke.getJoke());
        Assertions.assertEquals("Why don't scientists trust atoms? - Because they make up everything!", theJoke.getJoke());
    }

    @Test
    void testGettingAmountOfJokes(){
        JokeMachineController theJoke = new JokeMachineController();
        Assertions.assertEquals(6, theJoke.numberOfJokes());
    }

    @Test
    void testGettingSpecificJokeWithIndex(){
        JokeMachineController theJoke = new JokeMachineController();
        Assertions.assertEquals("Why don't scientists trust atoms? - Because they make up everything!",
                theJoke.getSpecificJoke(0));
        Assertions.assertEquals("Index out of bounds", theJoke.getSpecificJoke(100));
    }
}
