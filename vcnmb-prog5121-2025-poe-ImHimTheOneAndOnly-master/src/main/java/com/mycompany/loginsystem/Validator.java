/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginsystem;

public class Validator {
    /*Checks stuff... mainly usernames*/
    public static boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    /*PASSSSWORDDD CHECKERRRR*/
    public static boolean checkPasswordComplexity(String password) {
        boolean length = password.length() >= 8;
        boolean upper = password.matches(".*[A-Z].*");
        boolean digit = password.matches(".*\\d.*");
        boolean special = password.matches(".*[^a-zA-Z0-9].*");
        return length && upper && digit && special;
    }
    /*CELLPHONE CHECKER OpenAI. (2025). ChatGPT [Large language model]. https://chat.openai.com*/
    public static boolean checkCellPhoneNumber(String phoneNumber) {
        return phoneNumber.replaceAll("[\\s\\-]", "").matches("\\+\\d{1,2}\\d{9}");
    }

}

/*OpenAI. (2025). ChatGPT [Large language model]. https://chat.openai.com
    [1] Java SE Specifications, The Java Language Specification, Java SE 17 Edition. Oracle, 2021. [Online]. Available: 
*/
