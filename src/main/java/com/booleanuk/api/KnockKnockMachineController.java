package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
@RequestMapping("/knock")
public class KnockKnockMachineController {

    String[][] jokes;
    Random random = new Random();
    boolean finished = false;
    int id;

    public KnockKnockMachineController() {
        jokes = new String[4][];

        jokes[0] = new String[] {"Who’s there?", "Nobel." , "Nobel who?" , "Nobel…that’s why I knocked!"};
        jokes[1] = new String[] {"Who’s there?", "Tank.", "Tank who?", "You’re welcome."};
        jokes[2] = new String[] {"Who’s there?", "Annie.", "Annie who?", "Annie thing you can do, I can do too!"};
        jokes[3] = new String[] {"Who’s there?", "Honey bee.", "Honey bee who?", "Honey bee a dear and get that for me please!"};
        id = random.nextInt(jokes.length);

    }



    @GetMapping("/{id}/line{num}")
    public String getLineX(@PathVariable (name = "id") int id, @PathVariable (name = "num") int num) {
        return getLine(num, id);
    }

    @GetMapping("/random/line{num}")
    public String getRandomLineX(@PathVariable (name = "num") int num) {

        if (finished) {
            id = random.nextInt(jokes.length);
            finished = false;
        }

        if (num == jokes[id].length) {
            finished = true;
        }
        return getLine(num, id);
    }

    private String getLine(int num, int id) {
        if (num <= 0) {
            return "Lines start from /'line1'";
        }

        if (num > jokes[id].length) {
            num = jokes[id].length;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num ; i++) {
            sb.append(jokes[id][i] + "<br>" + "<br>" );
        }
        return sb.toString();
    }
}
