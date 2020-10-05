package com.company;
import java.util.Scanner;
import java.net.URI;


public class TheGame {
    static boolean isRunning = true;



    public static void main(String[] args) {
    int i = 0;
        while (isRunning) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.println("The Game is afoot.");
                boolean in = sc.nextBoolean();
                if (in) {
                    isRunning = false;
                    System.out.println("You lost The Game.");
                }  else if (i >= 1){
                    secondLevel();
                    isRunning = false;
                } else {
                    System.err.println("You are losing The Game.");
                    i++;
                }
            } catch (Exception e) {
                System.err.println("True or False?");
            }

        }
    }
    public static void secondLevel(){
        System.out.println("You are still losing The Game...");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        try {
            switch (in) {
                case "what":
                case "What?":
                case "What game?":
                case "What is The Game?":
                    URI uri = new URI("https://sv.wikipedia.org/wiki/The_Game_(tankespel)");
                    java.awt.Desktop.getDesktop().browse(uri);
                    System.out.println("You lost The Game.");
                    break;
                default :
                    System.out.println("You lost The Game.");
            }
        } catch (Exception e) {
            System.err.println("You lost The Game.");
        }
    }
}
