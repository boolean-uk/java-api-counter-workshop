package com.booleanuk.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KnockKnockControllerTest {

    @Test
    public void testGettingRandomJokeLineByLine(){
        KnockKnockController knockKnockController = new KnockKnockController(100);
        knockKnockController.getFirstLine();
        Assertions.assertEquals("Knock, Knock.\n\nWho's There?\n\nLettuce." +
                "\n\nLettuce who?\n\nLettuce in, it's freezing out here", knockKnockController.getFifthLine());

        knockKnockController.getFirstLine();
        Assertions.assertEquals("Knock, Knock.\n\nWho's There?\n\nJustin." +
                "\n\nJustin who?\n\nJustin time for dinner!", knockKnockController.getFifthLine());

    }
}
