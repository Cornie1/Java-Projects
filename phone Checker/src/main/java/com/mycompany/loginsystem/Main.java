/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*User info gatherer a glorious scanner moment*/
        System.out.print("Enter First Name: ");
        String strFirstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String strLastName = scanner.nextLine();

        System.out.print("Enter Username (must contain _ and be <= 5 characters): ");
        String strUserName = scanner.nextLine();

        System.out.print("Enter Password (min 8 chars, 1 capital, 1 number, 1 special char): ");
        String strPassword = scanner.nextLine();

        System.out.print("Enter South African Cell Phone (+27...): ");
        String strPhoneNumber = scanner.nextLine();

        /*Object creation yes*/
        User newUser = new User(strFirstName, strLastName, strUserName, strPassword, strPhoneNumber);
        LoginSystem loginSystem = new LoginSystem(newUser);

        /*Registration hmmm wonder how i figured that out*/
        System.out.println("\n--- Registration Result ---");
        System.out.println(loginSystem.registerUser());

        /*Cellphone yes*/
        System.out.println(loginSystem.checkPhoneNumber());

        /*THE GLORIOUS login moment*/
        System.out.println("\n--- Login ---");
        System.out.print("Enter Username: ");
        String strloginUsername = scanner.nextLine();

        System.out.print("Enter Password: ");
        String strLoginPassword = scanner.nextLine();
        
        /*And this is success yes :)*/
        boolean loginSuccess = loginSystem.loginUser(strloginUsername, strLoginPassword);
        System.out.println(loginSystem.returnLoginStatus());

       
    }
}

/*OpenAI. (2025). ChatGPT [Large language model]. https://chat.openai.com
    [1] Java SE Specifications, The Java Language Specification, Java SE 17 Edition. Oracle, 2021. [Online]. Available: 
*/