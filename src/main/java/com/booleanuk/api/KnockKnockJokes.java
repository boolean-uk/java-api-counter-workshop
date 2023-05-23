package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/knock-knock-jokes")
public class KnockKnockJokes {
    List<String> line3;
    List<String> line5;
    Random random;
    int index;

    public KnockKnockJokes() {
        this.line3 = new ArrayList<>();
        this.line3.add("Wendy");
        this.line3.add("Police");
        this.line3.add("Owl");

        this.line5 = new ArrayList<>();
        this.line5.add("Wendy you think we can go on a date?");
        this.line5.add("Police tell me I’m your type!");
        this.line5.add("Owl be seeing you soon, right?");

        this.random = new Random();
    }

    @GetMapping
    public String random() {
        this.index = random.nextInt(line3.size());
        return "<h1>Knock, knock.</h1>";
    }

    @GetMapping("/line2")
    public String line2 () {
        return "<h1>Knock, knock. </br></br> Who's there?</h1>";
    }

    @GetMapping("line2/line3")
    public String line3() {
        return "<h1>Knock, knock. </br></br> Who's there? </br></br>" + line3.get(index) + "</h1>";
    }

    @GetMapping("line2/line3/line4")
    public String line4() {
        return "<h1>Knock, knock. </br></br> Who's there? </br></br>" + line3.get(index) + "</br></br>"
                + line3.get(index) + " who?</h1>";
    }

    @GetMapping("line2/line3/line4/line5")
    public String line5() {
    return "<h1>Knock, knock. </br></br> Who's there? </br></br>" + line3.get(index) + "</br></br>"
            + line3.get(index) + " who? </br></br>" + line5.get(index) + "</h1>";
}

}
