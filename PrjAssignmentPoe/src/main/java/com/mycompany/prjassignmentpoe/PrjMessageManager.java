/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjassignmentpoe;

import java.util.*;
import java.io.*;
import org.json.*;

import javax.swing.JOptionPane;

public class PrjMessageManager { // (Farrell, 2022)
    static final int MAX_MESSAGES = 100;

    static String[] strSentMessages = new String[MAX_MESSAGES]; //(W3Schools, 2025)
    static String[] strDisregardedMessages = new String[MAX_MESSAGES]; //(W3Schools, 2025)
    static String[] strStoredMessages = new String[MAX_MESSAGES]; //(W3Schools, 2025)
    static String[] strMessageHashe = new String[MAX_MESSAGES]; //(W3Schools, 2025)
    static String[] strMessageID = new String[MAX_MESSAGES]; //(W3Schools, 2025)
    static int intMessageCount = 0;

    public static void showMainMenu(String strPhoneNumber, String strName, String strSurname) { // (Farrell, 2022)
        JOptionPane.showMessageDialog(null, "Welcome to quick chat, " + strName + " " + strSurname + "!");
        loadStoredMessagesFromJSON(); // (OpenAI, 2025)

        while (true) { // (Gregg1989, 2014)
            String strInput = JOptionPane.showInputDialog("""
                Choose an option:
                1) Send Messages
                2) Display Sent Messages
                3) Display Longest Message
                4) Search Message by ID
                5) Search Messages by Recipient
                6) Delete Message by Hash
                7) Display Full Report
                8) Exit""");

            switch (strInput) { // (Farrell, 2022)
                case "1" -> sendMessages(strPhoneNumber);
                case "2" -> showSendersAndRecipients();
                case "3" -> showLongestMessage();
                case "4" -> searchByMessageID();
                case "5" -> searchByRecipient();
                case "6" -> deleteByHash();
                case "7" -> displayFullReport();
                case "8" -> {
                    JOptionPane.showMessageDialog(null, "Goodbye");
                    return;
                }
                default -> JOptionPane.showMessageDialog(null, "Invalid option.");
            }
        }
    }

    public static void sendMessages(String strSenderPhone) { // (Farrell, 2022)
        Random rand = new Random();  // (Oracle, 2025)
        String strInput = JOptionPane.showInputDialog("How many messages to send?");
        int intCount = Integer.parseInt(strInput);

        for (int i = 0; i < intCount && intMessageCount < MAX_MESSAGES; ) { // (Gregg1989, 2014)
            String strRecipient = JOptionPane.showInputDialog("Enter recipient number:");
            String strContent = JOptionPane.showInputDialog("Enter message content:");

            if (strContent.length() > 250) { // (Farrell, 2022)
                JOptionPane.showMessageDialog(null, "Message exceeds 250 characters.");
                continue;
            }

            String strOption = JOptionPane.showInputDialog("1) Send\n2) Discard\n3) Store only"); 

            long id = 1000000000L + (Math.abs(rand.nextLong()) % 9000000000L);
            String strHash = Integer.toHexString(Objects.hash(strContent, strRecipient)); // (Farrell, 2022)
            String strMsg = "From: " + strSenderPhone + " To: " + strRecipient + " | " + strContent;

            if (strOption.equals("1")) {
                strSentMessages[intMessageCount] = strMsg;
                strMessageHashe[intMessageCount] = strHash;
                strMessageID[intMessageCount] = String.valueOf(id);
                intMessageCount++;
                JOptionPane.showMessageDialog(null, "Message sent.");
                i++;
            } else if (strOption.equals("2")) { // (Farrell, 2022)
                strDisregardedMessages[i] = strMsg;
                JOptionPane.showMessageDialog(null, "Message discarded.");
            } else if (strOption.equals("3")) { // (Farrell, 2022)
                JSONObject obj = new JSONObject(); // (OpenAI, 2025)
                obj.put("recipient", strRecipient);
                obj.put("content", strContent); // (Farrell, 2022)
                strStoredMessages[i] = obj.toString();
                JOptionPane.showMessageDialog(null, "Message stored only.");
                i++;
            } else { // (Farrell, 2022)
                JOptionPane.showMessageDialog(null, "Invalid option.");
            }
        }

        saveMessagesToJSON(); // (OpenAI, 2025)
    }

    public static void showSendersAndRecipients() { // (Martin, 2019)
        if (intMessageCount == 0) { // (Farrell, 2022)
            JOptionPane.showMessageDialog(null, "No sent messages.");
            return;
        }
        StringBuilder strResult = new StringBuilder("Sent Messages:\n");
        for (int i = 0; i < intMessageCount; i++) { // (Farrell, 2022)
            strResult.append(strSentMessages[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, strResult.toString());
    }

    public static void showLongestMessage() { // (Martin, 2019)
        if (intMessageCount == 0) { // (Farrell, 2022)
            JOptionPane.showMessageDialog(null, "No sent messages.");
            return;
        }
        String strLong = strSentMessages[0]; // (GeekForGeeks, 2025)
        for (int i = 1; i < intMessageCount; i++) {
            if (strSentMessages[i].length() > strLong.length()) {
                strLong = strSentMessages[i]; // (GeekForGeeks, 2025)
            }
        }
        JOptionPane.showMessageDialog(null, "Longest Message:\n" + strLong);
    }

    public static void searchByMessageID() { // (Martin, 2019)
        String searchID = JOptionPane.showInputDialog("Enter message ID:");
        for (int i = 0; i < intMessageCount; i++) {
            if (strMessageID[i].equals(searchID)) { // (Farrell, 2022)
                JOptionPane.showMessageDialog(null, strSentMessages[i]);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Message ID not found.");
    }

    public static void searchByRecipient() { // (Martin, 2019)
        String strRecipient = JOptionPane.showInputDialog("Enter recipient number:");
        StringBuilder strResult = new StringBuilder("Messages to " + strRecipient + ":\n"); // (GeekForGeeks, 2025)
        for (int i = 0; i < intMessageCount; i++) {
            if (strSentMessages[i].contains("To: " + strRecipient)) { // (Farrell, 2022)
                strResult.append(strSentMessages[i]).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, strResult.length() > 0 ? strResult.toString() : "No messages found.");
    }

    public static void deleteByHash() { // (Martin, 2019)
        String strHash2 = JOptionPane.showInputDialog("Enter message hash to delete:");
        for (int i = 0; i < intMessageCount; i++) { // (Farrell, 2022)
            if (strMessageHashe[i].equals(strHash2)) { // (GeekForGeeks, 2025)
                for (int j = i; j < intMessageCount - 1; j++) {
                    strSentMessages[j] = strSentMessages[j + 1];
                    strMessageHashe[j] = strMessageHashe[j + 1];
                    strMessageID[j] = strMessageID[j + 1];
                }
                intMessageCount--;
                JOptionPane.showMessageDialog(null, "Message deleted.");
                return; // (Farrell, 2022)
            }
        }
        JOptionPane.showMessageDialog(null, "Hash not found.");
    }
    
    // Returns and deletes a message by hash (used in unit testing)
    public static String deleteMessageByHash(String hash) { // (Farrell, 2022)
        for (int i = 0; i < intMessageCount; i++) {
            if (strMessageHashe[i].equals(hash)) { // (GeekForGeeks, 2025)
                String deleted = strSentMessages[i];
                for (int j = i; j < intMessageCount - 1; j++) {
                    strSentMessages[j] = strSentMessages[j + 1];
                    strMessageHashe[j] = strMessageHashe[j + 1];
                    strMessageID[j] = strMessageID[j + 1];
                }
                strSentMessages[intMessageCount - 1] = null;
                strMessageHashe[intMessageCount - 1] = null;
                strMessageID[intMessageCount - 1] = null;
                intMessageCount--; // (Farrell, 2022)
                return deleted; // return deleted message
            }
        }
        return null; // (Martin, 2019)
    }

    // Finds a message by hash (used in unit testing)
    public static String getMessageByHash(String hash) { // (Martin, 2019)
        for (int i = 0; i < intMessageCount; i++) {
            if (strMessageHashe[i].equals(hash)) {
                return strSentMessages[i]; // (Farrell, 2022)
            }
        }
        return null; // (Farrell, 2022)
    }

    public static void displayFullReport() { // (Martin, 2019)
        StringBuilder report = new StringBuilder("Message Report:\n");
        for (int i = 0; i < intMessageCount; i++) { 
            report.append("ID: ").append(strMessageID[i]) // (Oracle, 2025)
                  .append(" | Hash: ").append(strMessageHashe[i]) // (GeekForGeeks, 2025)
                  .append("\n").append(strSentMessages[i]).append("\n\n"); // (Oracle, 2025)
        }
        JOptionPane.showMessageDialog(null, report.toString());
    }

    public static void saveMessagesToJSON() { // (Martin, 2019)
        JSONArray arr = new JSONArray(); // (OpenAI, 2025)
        for (String strMsg2 : strStoredMessages) {
            if (strMsg2 != null) arr.put(new JSONObject(strMsg2)); // (OpenAI, 2025)
        }
        try (FileWriter writer = new FileWriter("messages.json")) {
            writer.write(arr.toString(4)); // (OpenAI, 2025)
        } catch (IOException e) { // (Oracle, 2025)
            JOptionPane.showMessageDialog(null, "Error saving messages: " + e.getMessage());
        }
    }

    public static void loadStoredMessagesFromJSON() { // (Martin, 2019)
        File file = new File("messages.json"); // (OpenAI, 2025)
        if (!file.exists()) return; // (Farrell, 2022)

        try {
            String strContent = new String(java.nio.file.Files.readAllBytes(file.toPath())); // (GeekForGeeks, 2025)
            JSONArray array = new JSONArray(strContent); // (OpenAI, 2025)
            for (int i = 0; i < array.length() && i < MAX_MESSAGES; i++) {
                strStoredMessages[i] = array.getJSONObject(i).toString(); // (OpenAI, 2025)
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error loading stored messages.");
        }
    }
}

/*
References

Farrell, J. (2022) *Java Programming*. 10th edn. Boston, MA: Cengage Learning. [source code]

Gregg1989.2014. *What condition does while(true) test? When is it true and false?*, 19 March. Stack Overflow.[source code] Available at: https://stackoverflow.com/questions/22512830/what-condition-does-whiletrue-test-when-is-it-true-and-false .[Accessed: 11 June 2025].

Martin, R.C. (2019) *Best practice on how to organize methods*, 10 March. Stack Overflow.[source code] Available at: https://stackoverflow.com/questions/38846698/best-practice-on-how-to-organize-methods (Accessed: 11 June 2025).

OpenAI. (2025) *ChatGPT* [Large language model]. Available at: https://chat.openai.com (Accessed: 11 June 2025).

Oracle. (2025) *Java Platform, Standard Edition API Specification*.[source code] Available at: https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html (Accessed: 11 June 2025).

eatSleepCode (2020) *Regex for South African phone numbers*, 26 August. Stack Overflow.[source code] Available at: [source code] https://stackoverflow.com/questions/XXXXX (Accessed: 11 June 2025).

JUnit 5 User Guide (n.d.) *JUnit 5 documentation*. Available at: [source code] https://junit.org/junit5/docs/current/user-guide/ (Accessed: 11 June 2025).

GeekForGeeks String Builder (2025) [source code]https://www.geeksforgeeks.org/java/stringbuilder-class-in-java-with-examples/ (Accessed:  08 Apr, 2025).

Oracle. (2025) *Java Platform, Standard Edition API Specification*.[source code] Available at: [source code] https://docs.oracle.com/javase/8/docs/api/java/util/Random.html For Rand Function (Accessed: 11 June 2025).

Copyright 1999-2025 by Refsnes Data. All Rights Reserved. W3Schools is Powered by W3.CSS. [Source Code] https://www.w3schools.com/java/java_arrays.asp  (Accessed: 25 June 2025).
*/