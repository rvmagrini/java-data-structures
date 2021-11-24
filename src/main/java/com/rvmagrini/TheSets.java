package com.rvmagrini;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TheSets {

    private static class Ball {
        private String color;

        public Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("red"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));

        System.out.println(balls.size());
        balls.forEach(System.out::println);

        balls.remove(new Ball("blue"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);

    }
}
