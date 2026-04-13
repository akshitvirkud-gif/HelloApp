package com.example;

public class Main {
    public static void main(String[] args) {

        String name;

        // Default case
        if (args.length == 0) {
            name = "World";
        } else {
            StringBuilder builder = new StringBuilder();
            boolean first = true;

            // Enhanced for loop
            for (String arg : args) {

                if (!first) {
                    builder.append(", ");
                }

                builder.append(arg);
                first = false;
            }

            name = builder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}