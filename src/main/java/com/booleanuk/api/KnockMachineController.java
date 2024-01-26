package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/knocks")
public class KnockMachineController {
	private ArrayList<ArrayList<String>> jokes;
	Random rand;
	int jokeIndex = 0;

	public KnockMachineController() {
		this.jokes = new ArrayList<>();
		jokes.add(new ArrayList<>(List.of(new String[]{"Knock knock", "Who's there?", "Boo", "Boo who?", "Don't cry, it's only a joke"})));
		jokes.add(new ArrayList<>(List.of(new String[]{"Knock knock", "Who's there?", "Lettuce", "Lettuce who?", "Lettuce in, it's freezing out here!"})));
		jokes.add(new ArrayList<>(List.of(new String[]{"Knock knock", "Who's there?", "Atch", "Atch who?", "Bless you!"})));
		jokes.add(new ArrayList<>(List.of(new String[]{"Knock knock", "Who's there?", "Alpaca", "Alpaca who?", "Alpaca the suitcase, you load up the car!"})));
		jokes.add(new ArrayList<>(List.of(new String[]{"Knock knock", "Who's there?", "Orange", "Orange who?", "Orange you glad I didn't say banana?"})));
		jokes.add(new ArrayList<>(List.of(new String[]{"Knock knock", "Who's there?", "Cow says", "Cow says who?", "No silly, Cow says 'moo'!"})));
		this.rand = new Random();
	}

	@GetMapping
	public String getKnock() {
		this.jokeIndex = this.rand.nextInt(this.jokes.size());
		return this.jokes.get(jokeIndex).get(0);
	}

	@GetMapping("/line2")
	public String getLine2() {
		StringBuilder sb = new StringBuilder();
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(0));
		sb.append("</p>");
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(1));
		sb.append("</p>");

		return sb.toString();
	}

	@GetMapping("/line3")
	public String getLine3() {
		StringBuilder sb = new StringBuilder();
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(0));
		sb.append("</p>");
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(1));
		sb.append("</p>");
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(2));
		sb.append("</p>");

		return sb.toString();
	}

	@GetMapping("/line4")
	public String getLine4() {
		StringBuilder sb = new StringBuilder();
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(0));
		sb.append("</p>");
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(1));
		sb.append("</p>");
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(2));
		sb.append("</p>");
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(3));
		sb.append("</p>");
		return sb.toString();
	}

	@GetMapping("/line5")
	public String getLine5() {
		StringBuilder sb = new StringBuilder();
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(0));
		sb.append("</p>");
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(1));
		sb.append("</p>");
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(2));
		sb.append("</p>");
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(3));
		sb.append("</p>");
		sb.append("<p>");
		sb.append(this.jokes.get(jokeIndex).get(4));
		sb.append("</p>");

		return sb.toString();
	}

}