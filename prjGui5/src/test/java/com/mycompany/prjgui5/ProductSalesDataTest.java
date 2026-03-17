/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prjgui5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ajkil
 */
public class ProductSalesDataTest {

    @Test
    public void GetSalesOverLimit_ReturnNumberOfSales() {
        assertTrue(prjProductSales.GetSalesOverLimit(300,200));
    }
    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {
        assertTrue(prjProductSales.GetSalesUnderlimit(300,200));
    }
}
