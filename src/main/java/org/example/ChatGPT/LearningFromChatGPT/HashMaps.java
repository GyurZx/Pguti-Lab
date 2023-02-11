package org.example.ChatGPT.LearningFromChatGPT;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> name = new HashMap<>();
        name.put(140, "Roach");
        name.put(142, "Ghost");
        name.put(141, "Price");
        name.put(143, "Like");
        System.out.println(name.get(141));
        System.out.println(name.size());
    }
}
