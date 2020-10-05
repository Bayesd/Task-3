package com.company;
import java.util.Scanner;

public class TheGame {
    static boolean isRunning = true;

    public static void main(String[] args) {

        while (isRunning) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.println("Welcome to The Game");
                boolean in = sc.nextBoolean();
                System.out.println("You lost The Game.");
                if (in) {
                    isRunning = false;
                }
            } catch (Exception e) {
                System.err.println("You lost The Game.");
            }

        }
    }
}
//          https://sv.wikipedia.org/wiki/The_Game_(tankespel)