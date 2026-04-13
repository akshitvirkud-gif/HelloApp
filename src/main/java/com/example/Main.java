package com.example;

public class Main {
    public static void main(String[] args) {

        String result = "";

        // If no arguments → default
        if (args.length == 0) {
            result = "World";
        } else {
            // Loop through all names
            for (int i = 0; i < args.length; i++) {
                result += args[i];

                // Add comma if not last element
                if (i < args.length - 1) {
                    result += ", ";
                }
            }
        }

        System.out.println("Hello, " + result + "!");
    }
}