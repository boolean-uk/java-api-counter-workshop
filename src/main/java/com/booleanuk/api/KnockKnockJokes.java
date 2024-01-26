package com.booleanuk.api;

import java.util.ArrayList;
import java.util.Arrays;

public record KnockKnockJokes() {
    public static ArrayList<ArrayList<String>> getKnockKnockJokes(){
        return new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(
                        "Knock, Knock.",
                        "Who's There?",
                        "Lettuce.",
                        "Lettuce who?",
                        "Lettuce in, it's freezing out here"
                )),
                new ArrayList<>(Arrays.asList(
                        "Knock, Knock.",
                        "Who's There?",
                        "Atch.",
                        "Atch who?",
                        "Bless you!"
                )),
                new ArrayList<>(Arrays.asList(
                        "Knock, Knock.",
                        "Who's There?",
                        "Cow says.",
                        "Cow says who?",
                        "No silly, cow says moo!"
                )),
                new ArrayList<>(Arrays.asList(
                        "Knock, Knock.",
                        "Who's There?",
                        "Honeydew.",
                        "Honeydew who?",
                        "Honeydew you know how funny these jokes can be?"
                )),
                new ArrayList<>(Arrays.asList(
                        "Knock, Knock.",
                        "Who's There?",
                        "Justin.",
                        "Justin who?",
                        "Justin time for dinner!"
                ))
        ));
    }
}
