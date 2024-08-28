package com.booleanuk.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KnockMachineControllerTest {

	@Test
	void testGetKnock() {
		KnockMachineController knockMachine = new KnockMachineController();
		knockMachine.rand.setSeed(100);
		String expected = "Knock knock";
		Assertions.assertEquals(expected, knockMachine.getKnock());
		Assertions.assertEquals(1, knockMachine.jokeIndex);
		knockMachine = new KnockMachineController();
		knockMachine.rand.setSeed(200);
		Assertions.assertEquals(expected, knockMachine.getKnock());
		Assertions.assertEquals(5, knockMachine.jokeIndex);

	}

	@Test
	void testGetLine2() {
		KnockMachineController knockMachine = new KnockMachineController();
		knockMachine.jokeIndex = 0;
		String expected = "<p>Knock knock</p><p>Who's there?</p>";
		Assertions.assertEquals(expected, knockMachine.getLine2());
		knockMachine.jokeIndex = 5;
		expected = "<p>Knock knock</p><p>Who's there?</p>";
		Assertions.assertEquals(expected, knockMachine.getLine2());

	}

	@Test
	void testGetLine3() {
		KnockMachineController knockMachine = new KnockMachineController();
		knockMachine.jokeIndex = 0;
		String expected = "<p>Knock knock</p><p>Who's there?</p><p>Boo</p>";
		Assertions.assertEquals(expected, knockMachine.getLine3());
		knockMachine.jokeIndex = 5;
		expected = "<p>Knock knock</p><p>Who's there?</p><p>Cow says</p>";
		Assertions.assertEquals(expected, knockMachine.getLine3());
	}

	@Test
	void testGetLine4() {
		KnockMachineController knockMachine = new KnockMachineController();
		knockMachine.jokeIndex=0;
		String expected = "<p>Knock knock</p><p>Who's there?</p><p>Boo</p><p>Boo who?</p>";
		Assertions.assertEquals(expected, knockMachine.getLine4());
		knockMachine.jokeIndex=5;
		 expected = "<p>Knock knock</p><p>Who's there?</p><p>Cow says</p><p>Cow says who?</p>";
		Assertions.assertEquals(expected, knockMachine.getLine4());
	}

	@Test
	void testGetLine5() {
		KnockMachineController knockMachine = new KnockMachineController();
		knockMachine.jokeIndex=0;
		String expected = "<p>Knock knock</p><p>Who's there?</p><p>Boo</p><p>Boo who?</p><p>Don't cry, it's only a joke</p>";
		Assertions.assertEquals(expected, knockMachine.getLine5());
		knockMachine.jokeIndex=5;
		expected ="<p>Knock knock</p><p>Who's there?</p><p>Cow says</p><p>Cow says who?</p><p>No silly, Cow says 'moo'!</p>";
		Assertions.assertEquals(expected, knockMachine.getLine5());

	}
}
