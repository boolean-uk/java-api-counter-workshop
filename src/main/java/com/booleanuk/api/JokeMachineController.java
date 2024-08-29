package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
@RequestMapping("/jokes")
public class JokeMachineController {
    private ArrayList<String> jokes;
    Random rand;

    public JokeMachineController() {
        this.jokes = new ArrayList<>();
        this.jokes.add("What sort of car does an egg drive? - A yolkswagen!!");
        this.jokes.add("What's the best thing about Switzerland? - I don't know, but the flag is a big plus.");
        this.jokes.add("What has more letters than the alphabet? - The post office!");
        this.jokes.add("How do you make 7 even? - Take away the s!");
        this.jokes.add("I used to be addicted to soap, but I'm clean now.");
        this.jokes.add("A guy walked into a bar... and was disqualified from the limbo contest.");
        this.rand = new Random();
    }

    @GetMapping
    public String getJoke() {
        return this.jokes.get(this.rand.nextInt(this.jokes.size()));
    }

    @GetMapping("/number")
    public int numberOfJokes() {
        return this.jokes.size();
    }

    @GetMapping("/number/{index}")
    public String getSpecificJoke(@PathVariable (name = "index") int index) {
        if (index >= this.jokes.size()) {
            return "I'm sorry please choose a smaller number.";
        }
        return this.jokes.get(index);
    }


}