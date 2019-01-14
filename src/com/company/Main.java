package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numDiscs = 0;
        int pegBoard[][];

        System.out.println("Let's play Tower of Hanoi!");
        System.out.println("Please input the number of discs you would like to play with (3 - 8).");

        numDiscs = sc.nextInt();
        pegBoard = new int[numDiscs][3];

        System.out.println("\nInstructions:");
        for (int i = 1; i <= numDiscs; i++) {
            System.out.println(i + ": Move one disk from tower " + i + " to " + i);
        }
    }
}
