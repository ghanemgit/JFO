package com.Ghanem;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        lab01 test = new lab01();
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + test.pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + test.pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + test.pluralize("turtle", turtleCount) + ".");

        test.flipNHeads(1);
        test.clock();
    }
}



