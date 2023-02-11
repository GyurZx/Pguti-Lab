package org.example.PracticeOfLectures;

import java.util.ArrayList;
import java.util.List;

public class ListBark {
    public static void main(String[] args) {
        System.out.println("Hi world");
        List<String> stringList = new ArrayList<>();
        stringList.add("string1");
        stringList.add("string2");
        stringList.add("string3");

        for (String i : stringList) {
            System.out.println(i);
        }
    }
}
