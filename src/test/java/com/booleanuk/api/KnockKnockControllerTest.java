package com.booleanuk.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KnockKnockControllerTest {

    @Test
    public void testGettingRandomJokeLineByLine(){
        KnockKnockController knockKnockController = new KnockKnockController(100);
        knockKnockController.getLine(1);
        Assertions.assertEquals("Knock, Knock.<br><br>Who's There?<br><br>Lettuce." +
                "<br><br>Lettuce who?<br><br>Lettuce in, it's freezing out here<br><br>", knockKnockController.getLine(5));

        knockKnockController.getLine(1);
        Assertions.assertEquals("Knock, Knock.<br><br>Who's There?<br><br>Justin." +
                "<br><br>Justin who?<br><br>Justin time for dinner!<br><br>", knockKnockController.getLine(5));

    }
}
