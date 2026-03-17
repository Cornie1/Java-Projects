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
public class ValidatorTest {

    @Test
    public void testCheckUserName_Valid() {
        boolean expected = true;
        boolean actual = Validator.checkUserName("kyl_1");
        System.out.println("Username 'kyl_1' valid: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckUserName_Invalid_NoUnderscore() {
        boolean expected = false;
        boolean actual = Validator.checkUserName("kyle!!!!!!!");
        System.out.println("Username 'kyle!!!!!!!' valid (missing underscore): " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckUserName_Invalid_TooLong() {
        boolean expected = false;
        boolean actual = Validator.checkUserName("kyle!!!!!!!");
        System.out.println("Username 'kyle!!!!!!!' valid (too long): " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckPasswordComplexity_Valid() {
        boolean expected = true;
        boolean actual = Validator.checkPasswordComplexity("Ch&&sec@ke99!");
        System.out.println("Password 'Ch&&sec@ke99!' valid: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckPasswordComplexity_NoCapital() {
        boolean expected = false;
        boolean actual = Validator.checkPasswordComplexity("password");
        System.out.println("Password 'password' valid (no capital): " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckCellPhoneNumber_Valid() {
        boolean expected = true;
        boolean actual = Validator.checkCellPhoneNumber("+27838968976");
        System.out.println("Phone number '+27838968976' valid: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckCellPhoneNumber_Invalid() {
        boolean expected = false;
        boolean actual = Validator.checkCellPhoneNumber("0831234567");
        System.out.println("Phone number '0831234567' valid (missing +27): " + actual);
        assertEquals(expected, actual);
    }
}
