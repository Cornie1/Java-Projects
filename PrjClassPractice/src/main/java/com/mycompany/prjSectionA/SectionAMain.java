package com.mycompany.prjSectionA;

import java.util.Scanner;

public class SectionAMain {

    private static Series seri = new Series();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean blnRunning = true;

        while (blnRunning) {
            System.out.println("1, Capture a new series");
            System.out.println("2, Search for a series");
            System.out.println("3, Update a series age restriction");
            System.out.println("4, Delete a series");
            System.out.println("5, Print series report - 2025");
            System.out.println("6, Exit application");

            int intChoice = scan.nextInt();
            scan.nextLine();

            switch (intChoice) {
                case 1:
                    // Allows for input of a new series
                    String id = Series.getNumericID(scan, "Enter Series ID (numbers only):"); // (Farrell, 2022)

                    System.out.println("Enter Series Name:");
                    String name = scan.nextLine().trim(); // (Farrell, 2022)

                    int age = 0;
                    // Age restricition checks if age is between 2-18 and prompts if incorrect
                    while (true) { // (Gregg1989, 2014)
                        System.out.println("Enter Series Age Restriction (2-18):");
                        String ageInput = scan.nextLine().trim(); // (Farrell, 2022)
                        try {
                            age = Integer.parseInt(ageInput);
                            if (age >= 2 && age <= 18) {
                                break;
                            } else {
                                System.out.println("Invalid age restriction. Please enter a number between 2 and 18.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid number for age restriction.");
                        }
                    }

                    int episodes = -1;
                    // Episode Count
                    while (true) { // (Gregg1989, 2014)
                        System.out.println("Enter Number of Episodes (0 or more):");
                        String epInput = scan.nextLine().trim(); // (Farrell, 2022)
                        try {
                            episodes = Integer.parseInt(epInput);
                            if (episodes >= 0) {
                                break;
                            } else {
                                System.out.println("Number of episodes cannot be negative. Please enter 0 or more.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid number for episodes.");
                        }
                    }
                    //Captures data inputed into array
                    if (seri.CaptureSeries(id, name, age, episodes)) {
                        System.out.println("Series details saved successfully.");
                    } else {
                        System.out.println("Failed to save series. Possible reasons: duplicate ID or invalid input.");
                    }
                    break;
                
                case 2:
                    // Search for series by ID
                    // (Gregg1989, 2014)
                        String searchID = Series.getNumericID(scan, "Enter Series ID to search for (numbers only):");
                    int index = seri.SearchSeries(searchID); // (Farrell, 2022)
                        //Outputs data from series id that has been found
                        if (index != -1) {
                            System.out.println("Series found:");
                            System.out.println("Series ID: " + seri.getSeriesID(index));
                            System.out.println("Series Name: " + seri.getSeriesName(index));
                            System.out.println("Age Restriction: " + seri.getSeriesAge(index));
                            System.out.println("Number of Episodes: " + seri.getSeriesEpisodes(index));
                        } else {
                            //Checks ID
                            System.out.println("Series with ID '" + searchID + "' not found.\n");
                        }
                        break;
                    
                case 3:
                    // Update series by ID
                    String updateID = Series.getNumericID(scan, "Enter Series ID to update (numbers only):");
                    int updateIndex = seri.SearchSeries(updateID); // (Farrell, 2022)
                    //Checks ID
                    if (updateIndex == -1) {
                        System.out.println("Series with ID '" + updateID + "' not found.\n");
                        break;
                    }

                    System.out.println("Enter new Series Name:");
                    String newName = scan.nextLine().trim(); // (Farrell, 2022)
                    //Capturing new information
                    int newAge = 0;
                    while (true) { // (Gregg1989, 2014)
                        System.out.println("Enter new Age Restriction (2-18):");
                        String newAgeInput = scan.nextLine().trim(); // (Farrell, 2022)
                        try {
                            newAge = Integer.parseInt(newAgeInput);
                            if (newAge >= 2 && newAge <= 18) {
                                break;
                            } else {
                                System.out.println("Invalid age restriction. Please enter a number between 2 and 18.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid number for age restriction.");
                        }
                    }
                    //Capturing new information
                    int newEpisodes = -1;
                    while (true) { // (Gregg1989, 2014)
                        System.out.println("Enter new Number of Episodes (0 or more):");
                        String newEpInput = scan.nextLine().trim(); // (Farrell, 2022)
                        try {
                            newEpisodes = Integer.parseInt(newEpInput);
                            if (newEpisodes >= 0) {
                                break;
                            } else {
                                System.out.println("Number of episodes cannot be negative. Please enter 0 or more.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid number for episodes.");
                        }
                    }
                    //Updates the arrays in Series Class to new information
                    if (seri.UpdateSeries(updateIndex, newName, newAge, newEpisodes)) {
                        System.out.println("Series updated successfully.");
                    } else {
                        System.out.println("Failed to update series. Please check your inputs.");
                    }
                    break;

                case 4:
                    // Delete series by ID
                    String deleteID = Series.getNumericID(scan, "Enter Series ID to delete (numbers only):");
                    int deleteIndex = seri.SearchSeries(deleteID); // (Farrell, 2022)
                    if (deleteIndex == -1) {
                        //Checks ID
                        System.out.println("Series with ID '" + deleteID + "' not found.\n");
                        break;
                    }
                    System.out.println("Are you sure you want to delete series '" + seri.getSeriesName(deleteIndex) + "'? (y/n)");
                    String confirm = scan.nextLine().trim(); // (Farrell, 2022)
                    //if statement to have a check if you want to delete the series or not
                    if (confirm.equalsIgnoreCase("Y")) { 
                        if (seri.DeleteSeries(deleteIndex)) {
                            System.out.println("Series deleted successfully.");
                        } else {
                            System.out.println("Failed to delete series.");
                        }
                    } else {
                        System.out.println("Delete operation cancelled.");
                    }
                    break;

                case 5:
                    // Print series report
                    int count = seri.getSeriesCount();
                    if (count == 0) {
                        System.out.println("No Series to display.");
                    } else {
                        //Displays Series information if selected
                        for (int i = 0; i < count; i++) {
                            System.out.println("Series " + (i + 1));
                            System.out.println("------------------------------------------------------");
                            System.out.println("Series ID: " + seri.getSeriesID(i));
                            System.out.println("Series Name: " + seri.getSeriesName(i));
                            System.out.println("Series Age Restriction: " + seri.getSeriesAge(i));
                            System.out.println("Number of Episodes: " + seri.getSeriesEpisodes(i));
                            System.out.println("------------------------------------------------------");
                        }
                    }
                    break;

                case 6:
                    blnRunning = false;
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("Invalid option, try again.");
            }
        }
        scan.close();
    }
}



/*
References

Farrell, J. (2022) *Java Programming*. 10th edn. Boston, MA: Cengage Learning. [source code]

Gregg1989.2014. *What condition does while(true) test? When is it true and false?*, 19 March. Stack Overflow.[source code] Available at: https://stackoverflow.com/questions/22512830/what-condition-does-whiletrue-test-when-is-it-true-and-false .[Accessed: 11 June 2025].

Martin, R.C. (2019) *Best practice on how to organize methods*, 10 March. Stack Overflow.[source code] Available at: https://stackoverflow.com/questions/38846698/best-practice-on-how-to-organize-methods (Accessed: 11 June 2025).

Oracle. (2025) *Java Platform, Standard Edition API Specification*.[source code] Available at: https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html (Accessed: 11 June 2025).

JUnit 5 User Guide (n.d.) *JUnit 5 documentation*. Available at: https://junit.org/junit5/docs/current/user-guide/ (Accessed: 11 June 2025).
*/
