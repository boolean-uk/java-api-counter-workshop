package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/knock")
public class KnockJokesController {

    private String[][] knockJokes;
    Random random;
    private int randomIndex;

    public KnockJokesController() {
        knockJokes = new String[][]{
                {"Knock, knock.", "Who’s there?", "Tank.", "Tank who?", "You’re welcome."},
                {"Knock, knock.", "Who’s there?", "Hatch.", "Hatch who?", "Bless you!"},
                {"Knock, knock.", "Who’s there?", "Spell.", "Spell who?", "Okay, W-H-O!!"}
        };
        random = new Random();
    }

    public String[][] getKnockJokes() {
        return knockJokes;
    }

    public int getRandomIndex() {
        return randomIndex;
    }

    @GetMapping("{index}")
    public String getSpecificKnockJoke(@PathVariable int index) {
        return this.knockJokes[index][0];
    }

    @GetMapping("{index}/line2")
    public String getLine2(@PathVariable int index) {
        return this.knockJokes[index][0]
                + "<br>" + this.knockJokes[index][1];
    }

    @GetMapping("{index}/line2/line3")
    public String getLine3(@PathVariable int index) {
        return this.knockJokes[index][0]
                + "<br>" + this.knockJokes[index][1]
                + "<br>" + this.knockJokes[index][2];
    }

    @GetMapping("{index}/line2/line3/line4")
    public String getLine4(@PathVariable int index) {
        return this.knockJokes[index][0]
                + "<br>" + this.knockJokes[index][1]
                + "<br>" + this.knockJokes[index][2]
                + "<br>" + this.knockJokes[index][3];
    }

    @GetMapping("{index}/line2/line3/line4/line5")
    public String getLine5(@PathVariable int index) {
        return this.knockJokes[index][0]
                + "<br>" + this.knockJokes[index][1]
                + "<br>" + this.knockJokes[index][2]
                + "<br>" + this.knockJokes[index][3]
                + "<br>" + this.knockJokes[index][4];
    }

    @GetMapping("/random")
    public String getRandomJoke() {
        randomIndex = random.nextInt(knockJokes.length);
        return this.knockJokes[randomIndex][0];
    }

    @GetMapping("random/line2")
    public String getRandomJokeLine2() {
        return this.knockJokes[randomIndex][0]
                + "<br>" + this.knockJokes[randomIndex][1];
    }

    @GetMapping("random/line2/line3")
    public String getRandomJokeLine3() {
        return this.knockJokes[randomIndex][0]
                + "<br>" + this.knockJokes[randomIndex][1]
                + "<br>" + this.knockJokes[randomIndex][2];
    }

    @GetMapping("random/line2/line3/line4")
    public String getRandomJokeLine4() {
        return this.knockJokes[randomIndex][0]
                + "<br>" + this.knockJokes[randomIndex][1]
                + "<br>" + this.knockJokes[randomIndex][2]
                + "<br>" + this.knockJokes[randomIndex][3];
    }

    @GetMapping("random/line2/line3/line4/line5")
    public String getRandomJokeLine5() {
        return this.knockJokes[randomIndex][0]
                + "<br>" + this.knockJokes[randomIndex][1]
                + "<br>" + this.knockJokes[randomIndex][2]
                + "<br>" + this.knockJokes[randomIndex][3]
                + "<br>" + this.knockJokes[randomIndex][4];
    }

}
