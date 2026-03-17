/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.prjgui9.mealOrder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author keaga
 */
public class TestMeal {
    
    public TestMeal() {
    }
    @Test
    public void testCalculateTotalMealPrice(){
        mealOrder order = new mealOrder ("Pizza" , 2, 100.0);
        
        double expected = 230.00; //(2*100) + 15% = 230.00
        double actual = order.calculateTotal(2, 100.00);
        
        assertEquals(expected, actual, 0.01, "Expect total price including " + "VAT to be R230.00");
   
    }
    @Test
    public void testValidateDataValid(){
        
        mealOrder order = new mealOrder("Burger", 2, 75.0);
        
        boolean actual = order.validateData("Burger", 2, 75.0);
        
        assertTrue(actual, "Expect validation to pass for valid data");
       
    
}
    
    @Test
    public void testValidateDataEmpty(){
        mealOrder order = new mealOrder("", 0, 0);
        
        boolean actual = order.validateData("", 0, 0);
        
        assertFalse(actual, "Expect validation to fail for meal name, price and quantity");
    }
    
    @Test
    public void testValidateDataNegativePrice(){
        mealOrder order = new mealOrder("Burger", 1, -100);
        
        boolean actual = order.validateData("Burger", 2, -100);
        
        assertFalse(actual, "Expect validation to fail for price as its negative");
    }
    
    @Test
    public void testValidateDataZeroQuantity(){
        //
        mealOrder order = new mealOrder("Burger", 0, 100);
        
        boolean actual = order.validateData("Burger", 0, 100);
        
        assertFalse(actual, "Expect validation to fail for quantity");
    }
    @Test
    public void testGetMealName(){
        //
        mealOrder order = new mealOrder("Burger", 0, 100);
        
        String expected = "Burger";
        String actual = order.getMealName();
        
        assertEquals(expected,actual, "Expect validation to fail for quantity");
    }
    @Test
    public void testGetMealPrice(){
        mealOrder order = new mealOrder("Burger", 0, 100);
        
        double expected = 90.0;
        double actual = order.getMealPrice();
        
        assertEquals(expected,actual, "Expect validation to fail for quantity");
    }
    }
    

