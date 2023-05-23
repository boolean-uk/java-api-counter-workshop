package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jokes")
public class JokeMachineController {
    private String[] jokes = new String[5];

    public JokeMachineController() {
        jokes[0] = "What sort of car does an egg drive? - A yolkswagen!!";
        jokes[1] = "There are three types of people in the world:  - Those who can count and those who can’t.";
        jokes[2] = "I sold my vacuum the other day. - All it was doing was collecting dust.";
        jokes[3] = "Did you hear about the guy who invented the knock-knock joke?  -  He won the “no-bell” prize.";
        jokes[4] = "What’s red and bad for your teeth?  - A brick.";

    }

    @GetMapping
    public String getJoke() {
        int randomIndex = (int) (Math.random() * (5 - 0) );
        return jokes[randomIndex];
    }

    @GetMapping("/number")
    public int getNumber() {
        return jokes.length;
    }

    @GetMapping("/{id}")
    public String getJokeById(@PathVariable (name = "id") int id) {
        if (id < jokes.length) {
            return jokes[id];
        } else {
            return "Please choose a number between 0 and 4";
        }
    }
}
