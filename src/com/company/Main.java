package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numDiscs;

        System.out.println("Let's play Tower of Hanoi!\nPlease input the number of discs you would like to play with (0 - 14).\nAny other number will throw an error or will be extensively long to read or compute.");

        numDiscs = sc.nextInt();

        System.out.println("\nInstructions:");
        Solve.shift(numDiscs, 1, 2, 3);
        
        System.out.println("\nThat is how you solve the Tower of Hanoi with " + numDiscs + " discs.");
    }
}
