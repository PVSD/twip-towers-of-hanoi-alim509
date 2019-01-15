package com.company;

import java.util.Scanner;

/**
 * Created by al5091 on 1/14/19.
 */
public class Solve {

    public static void shift(int n, int startPole, int otherPole, int endPole)
    {
        if (n == 0)
        {
            return;
        }
        shift(n - 1, startPole, endPole, otherPole);
        System.out.println("Move disc " + n + " from tower " + startPole + " to " + endPole);
        shift(n - 1, otherPole, startPole, endPole);
    }

}