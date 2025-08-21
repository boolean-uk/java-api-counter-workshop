package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CounterShopController {
    private final List<String[]> jokes;
    private String returnString;


    public CounterShopController(){
        String[] joke1 = {"Knock, knock.<br>", "Who's there?<br>", "Lettuce<br>", "Lettuce Who?<br>", "Lettuce in, it's cold out here!"};
        String[] joke2 = {"Knock, knock.<br>", "Who's there?<br>", "Cow says.<br>", "Cow says who?<br>", "No silly, cow says moooo!"};
        String[] joke3 = {"Knock, knock.<br>", "Who's there?<br>", "Boo.<br>", "Boo who?<br>", "Don’t cry, it’s just a joke!"};
        String[] joke4 = {"Knock, knock.<br>", "Who's there?<br>", "Tank.<br>", "Tank who?<br>", "You’re welcome!"};
        String[] joke5 = {"Knock, knock.<br>", "Who's there?<br>", "Atch.<br>", "Atch who?<br>", "Bless you!"};
        this.jokes = new ArrayList<>(Arrays.asList(joke1, joke2, joke3, joke4, joke5));
    }

    @GetMapping
    public String getJoke (){

        return "Hello! To get a very funny joke, add / and a number to the url, and watch the magic happen...";
    }
    @GetMapping("/{index}")
    public String getFirstLine(@PathVariable int index) {
        if (index<0 || index>=jokes.size()){
            return "Number must be between 0 and "+ (this.jokes.size()-1);
        }

        return this.getJokes().get(index)[0];
    }
    @GetMapping("/{index}/line2")
    public String getSecondLine(@PathVariable int index) {
        returnString = this.getJokes().get(index)[0]+ this.getJokes().get(index)[1] ;
    return returnString;
    }
    @GetMapping("/{index}/line3")
    public String getThirdLine(@PathVariable int index) {
        returnString = this.getJokes().get(index)[0]+ this.getJokes().get(index)[1]+this.getJokes().get(index)[2];
        return returnString;
    }
    @GetMapping("/{index}/line4")
    public String getFourthLine(@PathVariable int index) {
       returnString = this.getJokes().get(index)[0]+ this.getJokes().get(index)[1]+this.getJokes().get(index)[2]+this.getJokes().get(index)[3];
        return returnString;
    }
    @GetMapping("/{index}/line5")
    public String getFifthLine(@PathVariable int index) {
       returnString = this.getJokes().get(index)[0]+ this.getJokes().get(index)[1]+this.getJokes().get(index)[2]+this.getJokes().get(index)[3]+this.getJokes().get(index)[4];
        return returnString;
    }

    public List<String[]> getJokes() {
        return jokes;
    }
}
