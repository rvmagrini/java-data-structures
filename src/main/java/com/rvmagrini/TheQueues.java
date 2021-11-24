package com.rvmagrini;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueues {

    private static class Person {
        private String name;
        private int age;

        public Person (String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {

        Queue<Person> supermarketQueue = new LinkedList<>();

        supermarketQueue.add(new Person("Alex", 21));
        supermarketQueue.add(new Person("Mary", 48));
        supermarketQueue.add(new Person("Kate", 14));

        System.out.println("peek: " + supermarketQueue.peek().name);
        System.out.println("poll: " + supermarketQueue.poll().name);
        System.out.println("size: " + supermarketQueue.size());
        System.out.println("peek: " + supermarketQueue.peek().name);


    }
}
