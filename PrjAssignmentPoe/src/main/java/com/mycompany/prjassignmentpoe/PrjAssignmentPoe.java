package com.mycompany.prjassignmentpoe;

import javax.swing.*;

public class PrjAssignmentPoe {
    
    public static void main(String[] args) { // (Farrell, 2022)
        String strName = JOptionPane.showInputDialog("Please enter your name:");
        String strSurname = JOptionPane.showInputDialog("Please enter your Surname");

        String strUsername = promptUntilValid( // (Farrell, 2022)
                "Enter a username (must contain an underscore and be no more than 5 characters):",
                "Username is not correct. Must contain underscore and be no more than 5 chars.",
                PrjAssignmentPoe::UsernameValid,
                "Username successful."
        );

        String strPassword = promptUntilValid( // (Farrell, 2022)
                "Enter a password (min 8 chars, 1 capital letter, 1 number, 1 special character):",
                "Password incorrectly formatted.",
                PrjAssignmentPoe::PasswordValid,
                "Password successfully captured."
        );

        String strCellPhoneNumber = promptUntilValid( // (Farrell, 2022)
                "Enter your phone number (e.g. +27831234567):",
                "Cell phone number incorrectly formatted.",
                PrjAssignmentPoe::CellNumberValidation, // (Farrell, 2022)
                "Cell phone number successful."
        );

        while (true) { // (Gregg1989, 2014)
            String strInputUsername = JOptionPane.showInputDialog("Login - Enter your username:");
            String strInputPassword = JOptionPane.showInputDialog("Login - Enter your password:");
            if (isLoginSuccessful(strInputUsername, strInputPassword, strUsername, strPassword)) { // (Farrell, 2022)
                JOptionPane.showMessageDialog(null, "Logged in successfully");
                PrjMessageManager.showMainMenu(strCellPhoneNumber, strName, strSurname); // (Farrell, 2022)
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username or password."); 
            }
        }
    }
 
    public static String promptUntilValid(String prompt, String error, java.util.function.Predicate<String> validator, String success) { // (Farrell, 2022)
        String input;
        while (true) { // (Gregg1989, 2014)
            input = JOptionPane.showInputDialog(prompt);
            if (validator.test(input)) {
                JOptionPane.showMessageDialog(null, success);
                return input;
            } else {
                JOptionPane.showMessageDialog(null, error);
            }
        }
    }

    public static boolean UsernameValid(String strUsername) { // (Martin, 2019)
        return strUsername.contains("_") && strUsername.length() <= 5;
    }

    public static boolean PasswordValid(String strPassword) { // (Martin, 2019)
        return strPassword.length() >= 8 &&
               strPassword.matches(".*[A-Z].*") &&
               strPassword.matches(".*[0-9].*") &&
               strPassword.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }

    public static boolean CellNumberValidation(String strPhoneNumber) { // (OpenAI, 2025)
        return strPhoneNumber.matches("^\\+27\\d{9}$");
    }

    public static boolean isLoginSuccessful(String user, String pass, String realUser, String realPass) { // (Martin, 2019)
        return user.equals(realUser) && pass.equals(realPass);
    }
}

/*
References

Farrell, J. (2022) *Java Programming*. 10th edn. Boston, MA: Cengage Learning. [source code]

Gregg1989.2014. *What condition does while(true) test? When is it true and false?*, 19 March. Stack Overflow.[source code] Available at: https://stackoverflow.com/questions/22512830/what-condition-does-whiletrue-test-when-is-it-true-and-false .[Accessed: 11 June 2025].

Martin, R.C. (2019) *Best practice on how to organize methods*, 10 March. Stack Overflow.[source code] Available at: https://stackoverflow.com/questions/38846698/best-practice-on-how-to-organize-methods (Accessed: 11 June 2025).

OpenAI. (2025) *ChatGPT* [Large language model]. Available at: https://chat.openai.com (Accessed: 11 June 2025).

Oracle. (2025) *Java Platform, Standard Edition API Specification*.[source code] Available at: https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html (Accessed: 11 June 2025).

eatSleepCode (2020) *Regex for South African phone numbers*, 26 August. Stack Overflow.[source code] Available at: https://stackoverflow.com/questions/XXXXX (Accessed: 11 June 2025).

JUnit 5 User Guide (n.d.) *JUnit 5 documentation*. Available at: https://junit.org/junit5/docs/current/user-guide/ (Accessed: 11 June 2025).
*/