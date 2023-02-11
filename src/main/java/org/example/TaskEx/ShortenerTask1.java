package org.example.TaskEx;

import java.util.HashMap;
import java.util.Map;

public class ShortenerTask1 {
    private final String ALP = "abcdefghiklmnoparstuyikjwxyz";
    private final String BASE_URL = "short.ly/";
    private final Map<String, String> shortMap = new HashMap<>();
    private final Map<String, String> longMap = new HashMap<>();
    public String urlShortener(String longURL) {
        if (longMap.containsKey(longURL)) {
            return longMap.get(longURL);
        }

        String generatedPath = generatedPath();
        longMap.put(longURL, BASE_URL + generatedPath);
        shortMap.put(generatedPath, longURL);

        return BASE_URL + generatedPath;
    }
    public String urlRedirector(String shortURL) {
        String notBase = shortURL.replace(BASE_URL, "");
        return shortMap.get(notBase);
    }
    // короче тут доделать, а то нихера не получается
    public String generatedPath() {
        boolean correct = false;
        StringBuilder generatedString;
        do {
            generatedString = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                int index = (int) Math.round(Math.random() * 25);
                generatedString.append(ALP.charAt(index));
            }
            if (!shortMap.containsKey(generatedString.toString())) {
                correct = true;
            }
        } while(!correct);

        return generatedString.toString();
    }
}
