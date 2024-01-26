package com.booleanuk.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@RestController
@RequestMapping("/knock")
public class KnockKnockController {
    private ArrayList<ArrayList<String>> jokes;
    private Random rand;

    private int index;

    public KnockKnockController(int seed){
        this.jokes = KnockKnockJokes.getKnockKnockJokes();
        this.rand = new Random(seed);
        this.index = rand.nextInt(jokes.size());
    }
    public KnockKnockController(){
        this.jokes = KnockKnockJokes.getKnockKnockJokes();
        this.rand = new Random();
        this.index = rand.nextInt(jokes.size());
    }

    @GetMapping("/line1")
    public String getFirstLine(){
        this.index = rand.nextInt(jokes.size());
        return this.jokes.get(index).get(0);
    }
    @GetMapping("/line2")
    public String getSecondLine(){
        return this.jokes.get(index).get(0) +
                "\n\n" + this.jokes.get(index).get(1);
    }
    @GetMapping("/line3")
    public String getThirdLine(){
        return this.jokes.get(index).get(0) +
                "\n\n" + this.jokes.get(index).get(1) +
                "\n\n" + this.jokes.get(index).get(2);
    }
    @GetMapping("/line4")
    public String getFourthLine(){
        return this.jokes.get(index).get(0) +
                "\n\n" + this.jokes.get(index).get(1) +
                "\n\n" + this.jokes.get(index).get(2) +
                "\n\n" + this.jokes.get(index).get(3);
    }
    @GetMapping("/line5")
    public String getFifthLine(){
        return this.jokes.get(index).get(0) +
                "\n\n" + this.jokes.get(index).get(1) +
                "\n\n" + this.jokes.get(index).get(2) +
                "\n\n" + this.jokes.get(index).get(3) +
                "\n\n" + this.jokes.get(index).get(4);
    }
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Path not found")
    public static class NotFoundException extends RuntimeException {
        public NotFoundException(String message) {
            super(message);
        }
    }
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFoundException(NotFoundException ex) {
        return "Page does not exist";
    }


}
