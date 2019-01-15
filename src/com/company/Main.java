package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numDiscs;

        System.out.println("Let's play Tower of Hanoi!");
        System.out.println("Please input the number of discs you would like to play with (3 - 8).");

        numDiscs = sc.nextInt();

        System.out.println("\nInstructions:");
        Solve.shift(numDiscs, 1, 2, 3);
    }
}
