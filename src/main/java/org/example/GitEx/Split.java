package org.example.GitEx;

import javax.swing.*;
import java.util.Arrays;

public class Split {
    public static void split(String[] args) {
        String str = "Java is lang";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String str = "Java is lang";
        String[] words = str.split(" ");
        String[] words2 = str.split(" ", 2);
        for (String word : words) {
            System.out.println(word);
        }
        for (String word : words2) {
            System.out.println(word);
        }
    }
}