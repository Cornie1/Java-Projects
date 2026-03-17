package com.mycompany.prjSectionA;

import java.util.ArrayList;
import java.util.Scanner;

public class Series {
    //Arrays
    private ArrayList<String> seriesIDs = new ArrayList<>(); //(W3Schools, 2025)
    private ArrayList<String> seriesNames = new ArrayList<>(); //(W3Schools, 2025)
    private ArrayList<Integer> seriesAges = new ArrayList<>(); //(W3Schools, 2025)
    private ArrayList<Integer> seriesEpisodes = new ArrayList<>(); //(W3Schools, 2025)

    // Add new series with all details
    public boolean CaptureSeries(String id, String name, int age, int episodes) { // (Martin, 2019)
        // (In Class but here) // (GeekForGeeks, 2025)
        if (id == null || id.trim().isEmpty() || name == null || name.trim().isEmpty() || age < 2 || age > 18 || episodes < 0) {
            return false; // invalid input
        }
        // Check if ID already exists
        if (seriesIDs.contains(id.trim())) {
            return false; // duplicate ID not allowed
        }
        //(W3Schools, 2025)
        seriesIDs.add(id.trim()); 
        seriesNames.add(name.trim());
        seriesAges.add(age);
        seriesEpisodes.add(episodes);
        return true;
    }

    // Search series by ID, return index or -1 if not found
    public int SearchSeries(String id) { // (Martin, 2019)
        return seriesIDs.indexOf(id.trim());
    }

    // Update series details by index
    public boolean UpdateSeries(int index, String newName, int newAge, int newEpisodes) { //(W3Schools, 2025)
        if (index < 0 || index >= seriesIDs.size()) {  // (Oracle, 2025)
            return false;
        }
        if (newName == null || newName.trim().isEmpty() || newAge < 2 || newAge > 18 || newEpisodes < 0) {
            return false;
        }
        //(W3Schools, 2025)
        seriesNames.set(index, newName.trim());
        seriesAges.set(index, newAge);
        seriesEpisodes.set(index, newEpisodes); 
        return true;
    }

    // Remove series by index
    public boolean DeleteSeries(int index) { //(W3Schools, 2025)
        if (index < 0 || index >= seriesIDs.size()) {  // (Oracle, 2025)
            return false;
        }
        //(W3Schools, 2025)
        seriesIDs.remove(index);
        seriesNames.remove(index);
        seriesAges.remove(index);
        seriesEpisodes.remove(index);
        return true;
    }

    // Get all series count
    public int getSeriesCount() { // (Martin, 2019)
        return seriesIDs.size();
    }

    // Get series details by index
    public String getSeriesID(int index) { // (Martin, 2019)
        return seriesIDs.get(index);
    }

    public String getSeriesName(int index) { // (Martin, 2019)
        return seriesNames.get(index);
    }

    public int getSeriesAge(int index) { // (Martin, 2019)
        return seriesAges.get(index);
    }

    public int getSeriesEpisodes(int index) { // (Martin, 2019)
        return seriesEpisodes.get(index);
    }
    public static String getNumericID(Scanner scan, String prompt) {
        String id;
        while (true) {
            System.out.println(prompt);
            id = scan.nextLine().trim();
            if (id.matches("\\d+")) { // regex for digits only
                break;
            } else {
                System.out.println("Invalid ID. Please enter numeric digits only.");
            }
        }
        return id;
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
