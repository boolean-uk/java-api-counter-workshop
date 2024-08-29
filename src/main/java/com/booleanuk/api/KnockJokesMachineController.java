package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
@RequestMapping("/knockknock")
public class KnockJokesMachineController {
    private ArrayList<ArrayList<String>> knockKnockJokes;
    public Random rand;

    public KnockJokesMachineController() {
        this.knockKnockJokes = new ArrayList<>();


        ArrayList<String> joke1 = new ArrayList<>();
        joke1.add("Knock, knock.");
        joke1.add("Who's there?");
        joke1.add("Boo.");
        joke1.add("Boo who?");
        joke1.add("Don't cry, it's just a joke!");
        this.knockKnockJokes.add(joke1);

        ArrayList<String> joke2 = new ArrayList<>();
        joke2.add("Knock, knock.");
        joke2.add("Who's there?");
        joke2.add("Lettuce.");
        joke2.add("Lettuce who?");
        joke2.add("Lettuce in, it's cold out here!");
        this.knockKnockJokes.add(joke2);

        ArrayList<String> joke3 = new ArrayList<>();
        joke3.add("Knock, knock.");
        joke3.add("Who's there?");
        joke3.add("Atch.");
        joke3.add("Atch who?");
        joke3.add("Bless you!");
        this.knockKnockJokes.add(joke3);

        this.rand = new Random();
    }

    @GetMapping
    public String getJokesInfo() {
        return "Welcome to the Knock-Knock Joke Machine! Use /joke/{index} to get a joke by index or /random for a random joke.";
    }

    @GetMapping("/joke/{index}")
    public String getJokeLine(@PathVariable int index) {
        return getJokeLines(index, 1);
    }

    @GetMapping("/joke/{index}/line{line}")
    public String getJokeLine(@PathVariable int index, @PathVariable int line) {
        return getJokeLines(index, line);
    }

    private String getJokeLines(int index, int lines) {
        ArrayList<String> joke = knockKnockJokes.get(index);
        StringBuilder jokeLines = new StringBuilder();
        for (int i = 0; i < lines; i++) {
            jokeLines.append(joke.get(i)).append("\n");
        }
        return jokeLines.toString().trim();
    }

    @GetMapping("/random")
    public String getRandomJokeLine() {
        int randomJokeIndex = rand.nextInt(knockKnockJokes.size());
        return getJokeLine(randomJokeIndex);
    }

    @GetMapping("/random/line{line}")
    public String getRandomJokeLine(@PathVariable int line) {
        int randomJokeIndex = rand.nextInt(knockKnockJokes.size());
        return getJokeLine(randomJokeIndex, line);
    }
}