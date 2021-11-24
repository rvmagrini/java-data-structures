package com.rvmagrini;

import java.util.Stack;

public class TheStacks {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("peek: " + stack.peek());
        System.out.println("size: " + stack.size());
        System.out.println("pop: " + stack.pop());
        System.out.println("peek: " + stack.peek());
        System.out.println("size: " + stack.size());
        System.out.println("isEmpty: " + stack.isEmpty());

    }
}
