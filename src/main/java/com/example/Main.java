package com.example;

public class Main {
    public static void main(String[] args) {

        String name;

        // Default case
        if (args.length == 0) {
            name = "World";
        } else {
            // Join all names with ", "
            name = String.join(", ", args);
        }

        System.out.println("Hello, " + name + "!");
    }
}