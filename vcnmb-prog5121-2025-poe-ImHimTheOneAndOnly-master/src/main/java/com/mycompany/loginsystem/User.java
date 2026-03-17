/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginsystem;

public class User {
    private String strFirstName, strLastName, strUsername, strPassword, strPhoneNumber;
    /*Storage facilities yes*/
    public User(String strFirstName, String strLastName, String strUsername, String strPassword, String strPhoneNumber) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strUsername = strUsername;
        this.strPassword = strPassword;
        this.strPhoneNumber = strPhoneNumber;
    }
    /*Storage facilities 2 yes */
    public String getFirstName() { return strFirstName; }
    public String getLastName() { return strLastName; }
    public String getUsername() { return strUsername; }
    public String getPassword() { return strPassword; }
    public String getPhoneNumber() { return strPhoneNumber; }
}

/*OpenAI. (2025). ChatGPT [Large language model]. https://chat.openai.com
    [1] Java SE Specifications, The Java Language Specification, Java SE 17 Edition. Oracle, 2021. [Online]. Available: 
*/