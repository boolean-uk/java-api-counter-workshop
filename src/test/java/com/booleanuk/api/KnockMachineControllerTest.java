package com.booleanuk.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KnockMachineControllerTest {

    @Test
    public void testGetLine3OfJoke1() {
        KnockJokesController knockJokes = new KnockJokesController();
        Assertions.assertEquals("Knock, knock.<br>Who’s there?<br>Hatch.", knockJokes.getLine3(1));
    }

    @Test
    public void testRandomJoke() {
        KnockJokesController knockJokes = new KnockJokesController();
        Assertions.assertDoesNotThrow(knockJokes::getRandomJoke);
    }


}
