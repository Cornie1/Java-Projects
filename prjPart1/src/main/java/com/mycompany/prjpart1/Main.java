/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjpart1;

/**
 *
 * @author ajkil
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Gather user registration details
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Username (must contain _ and be <= 5 characters): ");
        String username = scanner.nextLine();

        System.out.print("Enter Password (min 8 chars, 1 capital, 1 number, 1 special char): ");
        String password = scanner.nextLine();

        System.out.print("Enter South African Cell Phone (+27...): ");
        String phoneNumber = scanner.nextLine();

        // Create User object
        User newUser = new User(firstName, lastName, username, password, phoneNumber);
        LoginSystem loginSystem = new LoginSystem(newUser);

        // Step 2: Registration process
        System.out.println("\n--- Registration Result ---");
        System.out.println(loginSystem.registerUser());

        // Step 3: Cell phone number validation
        System.out.println(loginSystem.checkPhoneNumber());

        // Step 4: Attempt login
        System.out.println("\n--- Login ---");
        System.out.print("Enter Username: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Enter Password: ");
        String loginPassword = scanner.nextLine();

        boolean loginSuccess = loginSystem.loginUser(loginUsername, loginPassword);
        System.out.println(loginSystem.returnLoginStatus());

        scanner.close();
    }
}

