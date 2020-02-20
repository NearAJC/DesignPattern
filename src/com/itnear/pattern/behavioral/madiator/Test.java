package com.itnear.pattern.behavioral.madiator;

public class Test {
    public static void main(String[] args) {
        User near = new User("Near");
        User tom = new User("Tom");

        near.sendMessage("Hey,Tom!");
        tom.sendMessage("Hey,Near!");
    }
}
