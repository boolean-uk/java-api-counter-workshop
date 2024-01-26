package com.booleanuk.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
    @GetMapping("line/{lineNumber}")
    public String getLine(@PathVariable int lineNumber){
        if(lineNumber > 5){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found");
        }
        else if(lineNumber == 1){
            this.index = rand.nextInt(jokes.size());
            return this.jokes.get(index).get(0);
        }
        else{
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < lineNumber; i++){
                sb.append(jokes.get(index).get(i)).append("<br><br>");
            }
            return sb.toString();
        }

    }



}
