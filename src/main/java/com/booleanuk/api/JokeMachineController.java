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
    final ArrayList<String> jokes;
    final Random rand;

    public JokeMachineController() {
        this.jokes = new ArrayList<>() {{
            add("Why is it always hot in the corner of a room? - Because a corner is 90 degrees.");
            add("I was wondering why the baseball was getting bigger. - Then it hit me.");
            add("Why can't you play poker on the African Savanna? - There's too many cheetahs.");
            add("I'm thinking of reasons to go to Switzerland. - The flag is a big plus.");
            add("I was up all night wondering where the sun went - but then it dawned on me.");
        }};
        this.rand = new Random();
    }

    @GetMapping
    public String getAllJokes() {
        return this.jokes.stream().reduce("", (x, y) -> x.concat(String.format(
                "<p>%s</p>", y
        )));
    }
    @GetMapping("/random")
    public String getJoke() {
        return String.format(
                "<p>%s</p>", this.jokes.get(this.rand.nextInt(this.jokes.size()))
        );
    }
    @GetMapping("/quantity")
    public int quantityOfJokes() {
        return this.jokes.size();
    }

    @GetMapping("/{index}")
    public String getSpecificJoke(@PathVariable(name = "index") int index) {
        if(index >= this.jokes.size()) {
            return "Please choose a smaller number";
        }
        return this.jokes.get(index);
    }

}
