/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjpart1;

/**
 *
 * @author ajkil
 */
public class LoginSystem {
    private User user;
    private boolean isLoggedIn = false;

    public LoginSystem(User user) {
        this.user = user;
    }

    public String registerUser() {
        if (!Validator.checkUserName(user.getUsername())) {
            return "Username is not correctly formatted...";
        } else if (!Validator.checkPasswordComplexity(user.getPassword())) {
            return "Password is not correctly formatted...";
        } else {
            return "Username and password successfully captured.";
        }
    }

    public String checkPhoneNumber() {
        return Validator.checkCellPhoneNumber(user.getPhoneNumber()) ?
               "Cell phone number successfully added." :
               "Cell phone number incorrectly formatted...";
    }

    public boolean loginUser(String username, String password) {
        isLoggedIn = username.equals(user.getUsername()) && password.equals(user.getPassword());
        return isLoggedIn;
    }

    public String returnLoginStatus() {
        return isLoggedIn ? 
            "Welcome " + user.getFirstName() + ", " + user.getLastName() + " it is great to see you again." :
            "Username or password incorrect, please try again.";
    }
}
