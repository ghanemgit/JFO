package com.Ghanem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class lab01 {
    public  String pluralize(String s, int num) {
        if (num == 0 || num > 1) {
            return s += "s";

        } else {
            return s;
        }


    }


    /***********************************************************************************************************************************/
    public  void flipNHeads(int n) {


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
    public  void clock () throws InterruptedException {

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
