package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int number;
        double rand= Math.random();
        int random = (int) (rand*100);

        System.out.println("random number is : " + random);
        System.out.println("You have only 3 Lives");
        int count=0;

        do {
            System.out.println("Please Guess a number");
            number = sc.nextInt();
            count++;
            if (number > random) {
                System.out.println("You guess too high, try again ");
                if ( count == 3){
                    System.out.println("Oops...No More Lives left!!!");
                    break;
                }
            } else if (number < random) {
                System.out.println("You guess too low, try again ");
                if ( count == 3) {
                    System.out.println("Oops...No More Lives left!!!");
                    break;
                }

            }
        } while ( ! (number == random)  );
        if ( number == random)
             System.out.println("Congratulations!!!! You guessed the correct number ");

    }
}
