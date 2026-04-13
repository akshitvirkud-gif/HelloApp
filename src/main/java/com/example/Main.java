package com.example;

public class Main {
    public static void main(String[] args) {

        // Check if argument is given
        if (args.length > 0) {
            String name = args[0];   // take first argument
            System.out.println("Hello, " + name + "!");
        } else {
            // default output if no argument
            System.out.println("Hello, World!");
        }
    }
}