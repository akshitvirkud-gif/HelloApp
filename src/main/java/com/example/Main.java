package com.example;

public class Main {
    public static void main(String[] args) {

        String name;

        // Default case
        if (args.length == 0) {
            name = "World";
        } else {
            StringBuilder builder = new StringBuilder();

            // Add all names with comma
            for (String arg : args) {
                builder.append(arg).append(", ");
            }

            // Remove last ", "
            name = builder.substring(0, builder.length() - 2);
        }

        System.out.println("Hello, " + name + "!");
    }
}