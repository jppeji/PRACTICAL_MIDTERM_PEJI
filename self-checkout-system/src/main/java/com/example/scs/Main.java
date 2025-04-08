package com.example.scs;

import java.util.Scanner;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select what to retrieve");
        System.out.println("1 - Retrieve Item Details");
        System.out.println("2 - Retrieve");

        System.out.println("Enter choice: ");
        int choice = scanner.nextInt();
    }
}
