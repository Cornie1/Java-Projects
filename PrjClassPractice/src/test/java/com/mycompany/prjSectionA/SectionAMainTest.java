package com.mycompany.prjSectionA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SectionAMainTest {

    private Series series;

    @BeforeEach
    public void setUp() { //(Junit5, 2025)
        series = new Series();
        // Add some sample series for testing
        series.CaptureSeries("1001", "Test Series One", 10, 12);
        series.CaptureSeries("1002", "Test Series Two", 15, 24);
    }

    @Test
    public void TestSearchSeries() { //(Junit5, 2025)
        int index = series.SearchSeries("1001");
        assertTrue(index != -1, "Series with ID 1001 should be found");
        assertEquals("Test Series One", series.getSeriesName(index));
        assertEquals(10, series.getSeriesAge(index));
        assertEquals(12, series.getSeriesEpisodes(index));
    }

    @Test
    public void TestSearchSeries_SeriesNotFound() { //(Junit5, 2025)
        int index = series.SearchSeries("9999");
        assertEquals(-1, index, "Series with ID 9999 should not be found");
    }

    @Test
    public void TestUpdateSeries() { //(Junit5, 2025)
        int index = series.SearchSeries("1002");
        assertTrue(index != -1, "Series with ID 1002 should be found");

        boolean updated = series.UpdateSeries(index, "Updated Series Two", 12, 30);
        assertTrue(updated, "Series should be updated successfully");

        assertEquals("Updated Series Two", series.getSeriesName(index));
        assertEquals(12, series.getSeriesAge(index));
        assertEquals(30, series.getSeriesEpisodes(index));
    }

    @Test
    public void TestDeleteSeries() { //(Junit5, 2025)
        int index = series.SearchSeries("1001");
        assertTrue(index != -1, "Series with ID 1001 should be found");

        boolean removed = series.DeleteSeries(index);
        assertTrue(removed, "Series should be deleted successfully");

        int newIndex = series.SearchSeries("1001");
        assertEquals(-1, newIndex, "Series with ID 1001 should no longer exist");
    }

    @Test
    public void TestDeleteSeries_SeriesNotFound() { //(Junit5, 2025)
        int index = series.SearchSeries("8888");
        assertEquals(-1, index, "Series with ID 8888 should not be found");

        // Attempt to remove with invalid index
        boolean removed = series.DeleteSeries(index);
        assertFalse(removed, "Removing non-existent series should fail");
    }

    // Helper method to simulate age validation (2-18)
    private boolean isValidAge(int age) { //(Junit5, 2025)
        return age >= 2 && age <= 18;
    }

    @Test
    public void TestSeriesAgeRestriction_AgeValid() { //(Junit5, 2025)
        assertTrue(isValidAge(2), "Age 2 should be valid");
        assertTrue(isValidAge(10), "Age 10 should be valid");
        assertTrue(isValidAge(18), "Age 18 should be valid");
    }

    @Test
    public void TestSeriesAgeRestriction_SeriesAgeinValid() { //(Junit5, 2025)
        assertFalse(isValidAge(1), "Age 1 should be invalid");
        assertFalse(isValidAge(0), "Age 0 should be invalid");
        assertFalse(isValidAge(19), "Age 19 should be invalid");
        assertFalse(isValidAge(-5), "Negative age should be invalid");
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

