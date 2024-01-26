package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@RestController
@RequestMapping("/jokes")
public class JokeMachineController {
    private ArrayList<String> jokes;
    Random rand;

    public JokeMachineController(int seed){
        this.jokes = jokeStore();
        this.rand = new Random(seed);
    }
    public JokeMachineController(){
        this.jokes = jokeStore();
        this.rand = new Random();
    }

    @GetMapping
    public String getJoke(){
        return this.jokes.get(this.rand.nextInt(this.jokes.size()));
    }
    @GetMapping("/number")
    public int numberOfJokes(){
        return this.jokes.size();
    }
    @GetMapping("/number/{index}")
    public String getSpecificJoke(@PathVariable int index){
        if(index >= this.jokes.size()){
            return "Index out of bounds";
        }
        else{
            return this.jokes.get(index);
        }
    }

    private ArrayList<String> jokeStore(){
        return new ArrayList<>(Arrays.asList(
                "Why don't scientists trust atoms? - Because they make up everything!",
                "What do you call fake spaghetti? - An impasta!",
                "Why did the scarecrow win an award? - Because he was outstanding in his field!",
                "Why did the bicycle fall over? - Because it was two-tired!",
                "I only know 25 letters of the alphabet. I don't know y.",
                "Why don't skeletons fight each other? - They don't have the guts!"
        ));


    }

}
