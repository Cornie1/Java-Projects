# ST10467076-PROG5121-POE
Aaron Kilbride : ST10467076

https://youtu.be/ruaVBGvdLbM





CHATGPT USAGE PROMPT

can you write me a java program that checks that the cellphone number entered meets the requirements of a area code and 9 digits not including the area code within those digits


ChatGPT said:
Sure! Here's a simple Java program that checks whether a cellphone number input meets the following criteria:

The number includes an area code.

The area code is 3 digits.

The cellphone number (excluding the area code) is 9 digits.

The total length must therefore be 12 digits (3 for the area code + 9 for the number).

It only allows digits (no special characters, spaces, or parentheses).

java
Copy
Edit
import java.util.Scanner;

public class CellphoneValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your cellphone number (including area code, no spaces or symbols):");
        String input = scanner.nextLine();

        if (isValidCellphoneNumber(input)) {
            System.out.println("Valid cellphone number.");
        } else {
            System.out.println("Invalid cellphone number. Make sure it includes a 3-digit area code and 9 digits for the number, no symbols or spaces.");
        }
    }

    public static boolean isValidCellphoneNumber(String number) {
        // Check if the string contains only digits
        if (!number.matches("\\d+")) {
            return false;
        }

        // Check if length is exactly 12
        if (number.length() != 12) {
            return false;
        }

        // Optional: You could add more validation for area code ranges or number formatting

        return true;
    }
}
Sample Valid Input:
Copy
Edit
123456789012
123 = area code

456789012 = cellphone number

Let me know if you'd like it to accept formatted input like (123) 456789012 or allow dashes, and I can adjust the code!







You said:
if the area code is south africa which is +27 can you implement that


ChatGPT said:
Absolutely! In South Africa, cellphone numbers typically follow this format:

+27 is the country code (replacing the leading zero of the mobile number).

The number is 9 digits after the country code (e.g., 82 123 4567).

So a full valid number would look like: +27821234567

Here’s an updated Java program that validates this format:

java
Copy
Edit
import java.util.Scanner;

public class SouthAfricanCellValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your South African cellphone number (e.g., +27821234567):");
        String input = scanner.nextLine();

        if (isValidSouthAfricanCell(input)) {
            System.out.println("Valid South African cellphone number.");
        } else {
            System.out.println("Invalid number. Make sure it starts with +27 and is followed by 9 digits (e.g., +27821234567).");
        }
    }

    public static boolean isValidSouthAfricanCell(String number) {
        // Check if the number starts with +27 and is followed by exactly 9 digits
        return number.matches("\\+27\\d{9}");
    }
}
Example Valid Input:
diff
Copy
Edit
+27821234567
Example Invalid Inputs:
0821234567 (missing +27)

+278212345 (too short)

+27 821234567 (contains a space)

+27821234567a (contains a letter)

Let me know if you'd like it to auto-convert 0821234567 into +27821234567, or accept numbers with spaces or dashes!







You said:
can you make the cell phone checker check if there are spaces and or dash or brackets 


ChatGPT said:
Sure! Let's upgrade the program so it can handle formats like:

+27 82 123 4567

+27-82-123-4567

(+27) 82 123 4567

Or even +27821234567 (clean format)

What this version does:
Removes all spaces, dashes, and brackets.

Then checks if the cleaned number matches the South African cellphone format: +27 followed by 9 digits.

Here's the improved Java program:

java
Copy
Edit
import java.util.Scanner;

public class SouthAfricanCellValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your South African cellphone number (e.g., +27 82 123 4567):");
        String input = scanner.nextLine();

        if (isValidSouthAfricanCell(input)) {
            System.out.println("Valid South African cellphone number.");
        } else {
            System.out.println("Invalid number. Make sure it starts with +27 and is followed by 9 digits.");
        }
    }

    public static boolean isValidSouthAfricanCell(String number) {
        // Remove spaces, dashes, and brackets
        String cleaned = number.replaceAll("[\\s\\-()]", "");

        // Check if it matches +27 followed by exactly 9 digits
        return cleaned.matches("\\+27\\d{9}");
    }
}
Accepted Examples:
+27821234567

+27 82 123 4567

+27-82-123-4567

(+27)821234567

Let me know if you'd like it to support numbers that start with 0 (like 0821234567) and automatically convert them to +27821234567.