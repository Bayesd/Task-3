package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hej världen!");
        static String[] Characters = {"Hulk", "Wolverine", "Thor", "Groot"};

        static int haha;

        public static void main(String[] args) {


            try {
                System.out.println(haha);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println(e);
            } finally {
                System.out.println("Always execute this code");
            }
    }
}
