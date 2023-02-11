package org.example.ChatGPT;

import java.util.ArrayList;
import java.util.Random;

public class MoodImprovementApp {

    private static ArrayList<String> quotes = new ArrayList<>();

    public static void main(String[] args) {
        quotes.add("Believe you can and you're halfway there.");
        quotes.add("Positive anything is better than negative nothing.");
        quotes.add("The only way to do great work is to love what you do.");
        quotes.add("The only limit to our realization of tomorrow will be our doubts of today.");
        quotes.add("Happiness is not something ready made. It comes from your own actions.");

        Random rand = new Random();
        int randomIndex = rand.nextInt(quotes.size());

        System.out.println(quotes.get(randomIndex));
    }
}
