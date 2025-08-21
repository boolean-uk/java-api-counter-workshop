package com.booleanuk.api;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CounterShopControllerTest {


    @Test
    public void shouldViewInitalPage() {
        CounterShopController jokes = new CounterShopController();
        assertEquals("Hello! To get a very funny joke, add / and a number to the url, and watch the magic happen...", jokes.getJoke());

    }
    @Test
    public void shouldViewFirstLine() {
        CounterShopController jokes = new CounterShopController();
        int index = 1;
        assertEquals("Knock, knock.<br>", jokes.getFirstLine(index));

    }
    @Test
    public void shouldViewSecondLine() {
        CounterShopController jokes = new CounterShopController();
        int index = 0;
        assertEquals("Knock, knock.<br>Who's there?<br>", jokes.getSecondLine(index));
    }
    @Test
    public void shouldViewThirdLine() {
        CounterShopController jokes = new CounterShopController();
        int index = 4;
        assertEquals("Knock, knock.<br>Who's there?<br>Atch.<br>", jokes.getThirdLine(index));

    }
    @Test
    public void shouldViewFourthLine() {
        CounterShopController jokes = new CounterShopController();
        int index = 3;
        assertEquals("Knock, knock.<br>Who's there?<br>Tank.<br>Tank who?<br>", jokes.getFourthLine(index));

    }
    @Test
    public void shouldViewFifthLine() {
        CounterShopController jokes = new CounterShopController();
        int index = 2;
        assertEquals("Knock, knock.<br>Who's there?<br>Boo.<br>Boo who?<br>Don’t cry, it’s just a joke!", jokes.getFifthLine(index));

    }

}
