package org.example.ChatGPT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//import org.json.JSONObject;

public class WeatherForecast {
    public static void main(String[] args) throws IOException {
        // API key for OpenWeatherMap
        String apiKey = "YOUR_API_KEY";
        // Location for which to get the forecast
        String location = "Moskow,RU";

        // Construct the URL for the API request
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + apiKey;
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Read the response from the API
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Parse the JSON response
        //JSONObject json = new JSONObject(response.toString());
        //String weather = json.getJSONArray("weather").getJSONObject(0).getString("main");
        //String temperature = json.getJSONObject("main").getString("temp");
        //String humidity = json.getJSONObject("main").getString("humidity");
        //String windSpeed = json.getJSONObject("wind").getString("speed");

        // Display the forecast
        //System.out.println("Weather in " + location + ":");
        //System.out.println("Current weather: " + weather);
        //System.out.println("Temperature: " + temperature + " Kelvin");
        //System.out.println("Humidity: " + humidity + "%");
        //System.out.println("Wind speed: " + windSpeed + " m/s");
    }
}
