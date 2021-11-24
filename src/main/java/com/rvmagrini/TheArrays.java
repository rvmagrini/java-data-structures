package com.rvmagrini;

import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {

        // Creating Arrays

        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        System.out.println(Arrays.toString(colors));

        int[] numbers = {1, 2};
        System.out.println(Arrays.toString(numbers));


        // Looping Arrays

        for (int i=0; i<colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (int i=colors.length-1; i>=0; i--) {
            System.out.println(colors[i]);
        }

        for (String color : colors) {
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);

    }
}
