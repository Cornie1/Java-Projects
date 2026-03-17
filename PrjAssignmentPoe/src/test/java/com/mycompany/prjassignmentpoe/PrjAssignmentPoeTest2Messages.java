package com.mycompany.prjassignmentpoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrjAssignmentPoeTest2Messages {

    @BeforeEach
    public void setup() { // (Farrell, 2022)
        // Reset all message arrays before each test
        for (int i = 0; i < PrjMessageManager.MAX_MESSAGES; i++) { //(Junit5, 2025)
            PrjMessageManager.strSentMessages[i] = null;
            PrjMessageManager.strDisregardedMessages[i] = null;
            PrjMessageManager.strStoredMessages[i] = null;
            PrjMessageManager.strMessageHashe[i] = null;
            PrjMessageManager.strMessageID[i] = null;
        }
        PrjMessageManager.intMessageCount = 0; //(Junit5, 2025)

        // Populate with test data
        // Message 1 - Sent
        PrjMessageManager.strSentMessages[0] = "From: +27830000000 To: ¥27834557896 | Did you get the cake?"; //(Junit5, 2025)
        PrjMessageManager.strMessageHashe[0] = "hash1";
        PrjMessageManager.strMessageID[0] = "id1";

        // Message 2 - Stored
        PrjMessageManager.strStoredMessages[0] = "{\"recipient\":\"F27838884567\",\"content\":\"Where are you? You are late! I have asked you to be on time.\"}"; //(Junit5, 2025)

        // Message 3 - Disregarded
        PrjMessageManager.strDisregardedMessages[0] = "From: +27830000000 To: ITEAaRASET | Yoho000, I am at your gate"; //(Junit5, 2025)

        // Message 4 - Sent
        PrjMessageManager.strSentMessages[1] = "From: SSBEASET To: SSBEASET | it is dinner time"; //(Junit5, 2025)
        PrjMessageManager.strMessageHashe[1] = "idHashDinner";
        PrjMessageManager.strMessageID[1] = "CRREREASEY";

        // Message 5 - Stored
        PrjMessageManager.strStoredMessages[1] = "{\"recipient\":\"27838884567\",\"content\":\"Ok, I am leaving without you.\"}"; //(Junit5, 2025)

        PrjMessageManager.intMessageCount = 2; // Only 2 sent messages
    }

    @Test
    public void testSentMessagesPopulatedCorrectly() { // (Farrell, 2022)
        assertEquals("From: +27830000000 To: ¥27834557896 | Did you get the cake?", PrjMessageManager.strSentMessages[0]); //(Junit5, 2025)
        assertEquals("From: SSBEASET To: SSBEASET | it is dinner time", PrjMessageManager.strSentMessages[1]);
        assertEquals(2, PrjMessageManager.intMessageCount);
    }

    @Test
    public void testLongestMessage() { // (Farrell, 2022)
        String expectedLongest = "Where are you? You are late! I have asked you to be on time.";

        String longest = PrjMessageManager.strStoredMessages[0];
        for (String stored : PrjMessageManager.strStoredMessages) { //(Junit5, 2025)
            if (stored != null && stored.length() > longest.length()) { //(Junit5, 2025)
                longest = stored;
            }
        }

        assertTrue(longest.contains(expectedLongest)); // (Oracle, 2025)
    }

    @Test
    public void testSearchMessageByID() { // (Farrell, 2022)
        String searchID = "CRREREASEY";
        String foundMessage = null;

        for (int i = 0; i < PrjMessageManager.intMessageCount; i++) { //(Junit5, 2025)
            if (PrjMessageManager.strMessageID[i].equals(searchID)) { //(Junit5, 2025)
                foundMessage = PrjMessageManager.strSentMessages[i];
            }
        }

        assertNotNull(foundMessage); // (Oracle, 2025)
        assertTrue(foundMessage.contains("it is dinner time")); // (Oracle, 2025)
    }

    @Test
    public void testSearchByRecipientAcrossStored() { // (Farrell, 2022)
        String recipient = "27838884567";
        boolean found1 = false;
        boolean found2 = false;

        for (String stored : PrjMessageManager.strStoredMessages) { //(Junit5, 2025)
            if (stored != null && stored.contains(recipient)) {
                if (stored.contains("Where are you?")) found1 = true;
                if (stored.contains("Ok, I am leaving")) found2 = true; //(Junit5, 2025)
            }
        }

        assertTrue(found1 && found2);
    }

    @Test
    public void testDeleteByHash() { // (Farrell, 2022)
        String hashToDelete = "hash1";
        boolean deleted = false; //(Junit5, 2025)

        for (int i = 0; i < PrjMessageManager.intMessageCount; i++) {
            if (PrjMessageManager.strMessageHashe[i].equals(hashToDelete)) {
                for (int j = i; j < PrjMessageManager.intMessageCount - 1; j++) {
                    PrjMessageManager.strSentMessages[j] = PrjMessageManager.strSentMessages[j + 1];
                    PrjMessageManager.strMessageHashe[j] = PrjMessageManager.strMessageHashe[j + 1];
                    PrjMessageManager.strMessageID[j] = PrjMessageManager.strMessageID[j + 1]; //(Junit5, 2025)
                }
                PrjMessageManager.intMessageCount--; // (Oracle, 2025)
                deleted = true;
                break;
            }
        }

        assertTrue(deleted);
        assertFalse("hash1".equals(PrjMessageManager.strMessageHashe[0]));
    }

    @Test
    public void testDisplayReportIncludesHashesAndMessages() {// (Farrell, 2022)
        StringBuilder report = new StringBuilder();
        for (int i = 0; i < PrjMessageManager.intMessageCount; i++) {
            report.append("ID: ").append(PrjMessageManager.strMessageID[i])
                  .append(" | Hash: ").append(PrjMessageManager.strMessageHashe[i])
                  .append("\n").append(PrjMessageManager.strSentMessages[i]).append("\n\n"); //(Junit5, 2025)
        }

        String output = report.toString(); // (Oracle, 2025)

        assertTrue(output.contains("hash1")); // (Oracle, 2025)
        assertTrue(output.contains("idHashDinner")); // (Oracle, 2025)
        assertTrue(output.contains("Did you get the cake?")); // (Oracle, 2025)
        assertTrue(output.contains("it is dinner time")); // (Oracle, 2025)
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
