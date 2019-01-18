package com.company;

import java.util.Scanner;

/**
 * Created by al5091 on 1/14/19.
 */
public class Solve {

    private static int counter = 1;

    public static void shift(int n, int startPole, int otherPole, int endPole)
    {
        if (n == 0)
        {
            return;
        }
        shift(n - 1, startPole, endPole, otherPole);
        System.out.println(counter + ": Move disc " + n + " from tower " + startPole + " to " + endPole);
        counter++;
        shift(n - 1, otherPole, startPole, endPole);
    }

}
