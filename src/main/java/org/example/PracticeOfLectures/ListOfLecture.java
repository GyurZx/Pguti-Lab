package org.example.PracticeOfLectures;

import java.util.ArrayList;
import java.util.List;

public class ListOfLecture {
    public static void main(String[] args) {
        System.out.println("World good by, o-o-o!");
        List<String> stringList = new ArrayList<String>();
        stringList.add("string1");
        stringList.add("string2");
        stringList.add("string3");
        stringList.add("string4");

        for(String i:stringList) {
            System.out.println(i);
        }
    }
}