package com.booleanuk.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KnockJokesMachineControllerTest {

    @Test
    void testGetJokeLine() {
        KnockJokesMachineController controller = new KnockJokesMachineController();
        Assertions.assertEquals("Knock, knock.", controller.getJokeLine(0));
        System.out.println( controller.getJokeLine(0));
        System.out.println( controller.getJokeLine(1, 2));
        Assertions.assertEquals("Knock, knock.\n" +
                "Who's there?", controller.getJokeLine(1, 2));
    }



    @Test
    void testGetRandomJokeLine() {
        KnockJokesMachineController controller = new KnockJokesMachineController();
        controller.rand.setSeed(100);

        String randomJoke = controller.getRandomJokeLine();
        Assertions.assertTrue(randomJoke.startsWith("Knock, knock."));
    }

    @Test
    void testGetRandomJokeLineSpecificLine() {
        KnockJokesMachineController controller = new KnockJokesMachineController();
        controller.rand.setSeed(100);
        String randomJoke = controller.getRandomJokeLine(3);
        System.out.println(randomJoke);
        Assertions.assertTrue(randomJoke.contains("Lettuce."));
    }
}