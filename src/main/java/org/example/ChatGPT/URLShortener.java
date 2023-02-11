package org.example.ChatGPT;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class URLShortener {
    private HashMap<String, String> urlMap;

    public URLShortener() {
        // Initialize the HashMap
        urlMap = new HashMap<String, String>();
    }

    public String shorten(String longUrl) {
        // Generate a random 6-character string for the short URL
        String shortUrl = generateShortUrl();
        // Add the long URL and short URL to the HashMap
        urlMap.put(shortUrl, longUrl);
        // Return the short URL
        return shortUrl;
    }

    public void redirect(String shortUrl) throws Exception {
        // Look up the long URL in the HashMap
        String longUrl = urlMap.get(shortUrl);
        // If the short URL is not found in the HashMap, throw an exception
        if (longUrl == null) {
            throw new Exception("Invalid short URL");
        }
        // Redirect to the long URL
        URL url = new URL(longUrl);
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setInstanceFollowRedirects(false);
        httpCon.setRequestMethod("GET");
        httpCon.setDoOutput(true);
        httpCon.connect();
        int responseCode = httpCon.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_MOVED_PERM || responseCode == HttpURLConnection.HTTP_MOVED_TEMP) {
            String location = httpCon.getHeaderField("Location");
            httpCon.disconnect();
            redirect(location);
        }
        else {
            System.out.println("Redirected to: " + longUrl);
        }
    }

    private String generateShortUrl() {
        // Generate a random 6-character string
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String shortUrl = "";
        for (int i = 0; i < 6; i++) {
            int randomIndex = (int)(Math.random() * characters.length());
            shortUrl += characters.charAt(randomIndex);
        }
        return shortUrl;
    }
}
