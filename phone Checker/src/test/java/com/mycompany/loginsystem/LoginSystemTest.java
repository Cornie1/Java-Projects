/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.loginsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ajkil
 */
public class LoginSystemTest {

    @Test
    public void testSuccessfulLogin() {
        User user = new User("Sam", "Smith", "sam_", "Test1234!", "+27831234567");
        LoginSystem loginSystem = new LoginSystem(user);

        boolean loginResult = loginSystem.loginUser("sam_", "Test1234!");
        System.out.println("Login with correct credentials: " + loginResult);
        System.out.println("Login message: " + loginSystem.returnLoginStatus());

        assertTrue(loginResult);
        assertEquals("Welcome Sam, Smith it is great to see you again.", loginSystem.returnLoginStatus());
    }

    @Test
    public void testFailedLogin() {
        User user = new User("Sam", "Smith", "sam_", "Test1234!", "+27831234567");
        LoginSystem loginSystem = new LoginSystem(user);

        boolean loginResult = loginSystem.loginUser("wrong", "wrong");
        System.out.println("Login with incorrect credentials: " + loginResult);
        System.out.println("Login message: " + loginSystem.returnLoginStatus());

        assertFalse(loginResult);
        assertEquals("Username or password incorrect, please try again.", loginSystem.returnLoginStatus());
    }
}
