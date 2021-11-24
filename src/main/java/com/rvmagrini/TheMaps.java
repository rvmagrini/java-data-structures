package com.rvmagrini;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {


    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Alex");
        map.put(2, "John");
        map.put(3, "Mike");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());

        map.entrySet().forEach(System.out::println);

        map.entrySet().forEach(person ->
                System.out.println(person.getKey() + " : " + person.getValue()));

        map.remove(2);

        map.forEach((key, person) ->
                System.out.println(key + " - " + person));

    }
}
