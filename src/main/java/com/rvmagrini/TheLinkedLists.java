package com.rvmagrini;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedLists {

    private static class Person {
        private String name;
        private int age;

        public Person (String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("James", 58));
        linkedList.add(new Person("John", 45));
        linkedList.addFirst(new Person("Jack", 33));

        ListIterator<Person> personListIterator = linkedList.listIterator();

        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }

    }
}
