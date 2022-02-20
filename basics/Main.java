package com.Ghanem;

import java.time.Clock;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(1);
        clock();
    }

    /***********************************************************************************************************************************/
    public static String pluralize(String s, int num) {
        if (num == 0 || num > 1) {
            return s += "s";

        } else {
            return s;
        }


    }


    /***********************************************************************************************************************************/
    public static void flipNHeads(int n) {


        Random random = new Random();

        int headCounter = 0;

        for (int i = 0; i < n; i++) {
            float ran = random.nextFloat();
            if (ran < 0.5) {
                System.out.println("tails\n");
            } else {
                headCounter++;
                System.out.println("heads\n");

            }

            System.out.println("It took " + n + " flips to flip " + headCounter + " head in a row.");

        }
    }

/***********************************************************************************************************************************/
        public static void clock () throws InterruptedException {

            while (true) {

                while (true) {

                    LocalDateTime time = LocalDateTime.now();
                    String now = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    System.out.println(now);
                    break;
                }
                Thread.sleep(1000);

            }

        }
    }

