package com.booleanuk.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JokeMachineControllerTest {
	@Test
	void testGetJoke() {
		JokeMachineController theJoke = new JokeMachineController();
		theJoke.rand.setSeed(100);
		Assertions.assertEquals("What's the best thing about Switzerland? - I don't know, but the flag is a big plus.", theJoke.getJoke());
		Assertions.assertEquals("I used to be addicted to soap, but I'm clean now.", theJoke.getJoke());
		Assertions.assertEquals("I used to be addicted to soap, but I'm clean now.", theJoke.getJoke());
		Assertions.assertEquals("What sort of car does an egg drive? - A yolkswagen!!!", theJoke.getJoke());
	}
	@Test
	void testGetSpecificJoke() {
		JokeMachineController theJoke = new JokeMachineController();
		Assertions.assertEquals("What's the best thing about Switzerland? - I don't know, but the flag is a big plus.", theJoke.getSpecificJoke(1));
		Assertions.assertEquals("I used to be addicted to soap, but I'm clean now.", theJoke.getSpecificJoke(4));
		Assertions.assertEquals("A guy walked into a bar... and was disqualified from the limbo contest.", theJoke.getSpecificJoke(5));
	}
}