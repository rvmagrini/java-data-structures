package com.rvmagrini;

import java.util.ArrayList;
import java.util.List;

public class TheLists {

    public static void main(String[] args) {

        // Creating
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("purple");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("blue"));
        System.out.println(colors.contains("red"));

        // Creating immutable list
        List<String> familyImmutableList = List.of("Jane", "Kate", "Kim");
        System.out.println(familyImmutableList);

        // Looping
        for (String color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i=0; i<colors.size(); i++) {
            System.out.println(colors.get(i));
        }

    }
}
