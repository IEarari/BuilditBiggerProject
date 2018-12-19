package com.example.joketeller;

import java.util.Random;

public class Joke {

    public static String[] jokes = {
            "Programmer Definition :\nA Machine That Turns Tea OR Coffee Into a Programme . ",
            "Hear about the new restaurant called Karma?" + "\n\nThere is no menu: You get what you deserve.",
            "How Do I See My APP : " + "\nUI" + "\nLogic" + "\nData" + "\n\n How Do Users See it :" + "\nUI" + "\nMagic"
    };

    public static String getJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }
}
