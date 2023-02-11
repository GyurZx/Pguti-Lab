package org.example.ChatGPT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
//import org.json.JSONObject;

public class CoinRates {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the crypto-currencies you want to check the rate for (separated by commas):");
        String crypto = sc.nextLine();

        String[] cryptoArray = crypto.split(",");
        for (String cryptoName : cryptoArray) {
            cryptoName = cryptoName.trim();
            String url = "https://api.coingecko.com/api/v3/simple/price?ids=" + cryptoName + "&vs_currencies=usd";
            URL obj = new URL(url);
            // дальше дебри
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                //JSONObject json = new JSONObject(response.toString());
                //if (json.has(cryptoName)) {
                  //  JSONObject cryptoJson = json.getJSONObject(cryptoName);
                    //String cryptoRate = cryptoJson.getString("usd");
                    //System.out.println(cryptoName + " rate in USD : $" + cryptoRate);
                //} else {
                  //  System.out.println("Invalid crypto-currency entered: " + cryptoName);
                //}
            } else {
                System.out.println("Unable to retrieve rates from API");
            }
        }
    }
}