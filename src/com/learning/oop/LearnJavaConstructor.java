package com.learning.oop;

public class LearnJavaConstructor {
    public static void main(String[] args) {
        // constructor = special method that is called when an object is instantiated
        // (created)
        Human human = new Human("SAY", 32, 80.32);

        System.out.println(human.name);
    }
}
