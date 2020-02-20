package com.itnear.pattern.structural.facade;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.open();
        System.out.println("玩一会电脑...");
        computer.close();
    }
}
