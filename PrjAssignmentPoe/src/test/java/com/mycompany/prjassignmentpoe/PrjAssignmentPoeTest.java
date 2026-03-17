package com.mycompany.prjassignmentpoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrjAssignmentPoeTest { // (Farrell, 2022)

    @Test 
    public void testValidUsername() { //(Junit5, 2025)
        assertTrue(PrjAssignmentPoe.UsernameValid("abc_"));
        assertFalse(PrjAssignmentPoe.UsernameValid("abcdef")); // too long
        assertFalse(PrjAssignmentPoe.UsernameValid("abcde"));  // missing underscore
    }

    @Test
    public void testValidPassword() { //(Junit5, 2025)
        assertTrue(PrjAssignmentPoe.PasswordValid("Pass123!")); // valid
        assertFalse(PrjAssignmentPoe.PasswordValid("pass123!")); // missing capital
        assertFalse(PrjAssignmentPoe.PasswordValid("Password")); // missing number/symbol
    }

    @Test
    public void testValidCellNumber() { //(Junit5, 2025)
        assertTrue(PrjAssignmentPoe.CellNumberValidation("+27831234567")); // valid
        assertFalse(PrjAssignmentPoe.CellNumberValidation("0831234567"));  // missing +27
        assertFalse(PrjAssignmentPoe.CellNumberValidation("+27123"));      // too short
    }

    @Test
    public void testLoginSuccess() { //(Junit5, 2025)
        assertTrue(PrjAssignmentPoe.isLoginSuccessful("user", "pass", "user", "pass"));
        assertFalse(PrjAssignmentPoe.isLoginSuccessful("user", "wrong", "user", "pass"));
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