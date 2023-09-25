package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/jokes")
public class JokeMachineController {

    Random random;

    private String[] jokes = new String[3];

    public JokeMachineController() {
        this.jokes[0] = "What sort of car does an egg drive? - A yolkswagen!!!";
        this.jokes[1] = "Hear about the new restaurant called Karma? There’s no menu: You get what you deserve.";
        this.jokes[2] = "Did you hear about the claustrophobic astronaut? He just needed a little space.";
        random = new Random();
    }

    @GetMapping
    public String getJoke() {
        int randomIndex = random.nextInt(jokes.length);
        return this.jokes[randomIndex];
    }

    @GetMapping("/number")
    public int numberOfJokes() {
        return this.jokes.length;
    }

    @GetMapping("number/{index}")
    public String getSpecificJoke(@PathVariable int index) {
        return this.jokes[index];
    }


//    private String joke;
//
//    public JokeMachineController() {
//        this.joke = "What sort of car does an egg drive? - A yolkswagen!!!";
//    }
//
//    @GetMapping
//    public String getJoke() {
//        return this.joke;
//    }

}
