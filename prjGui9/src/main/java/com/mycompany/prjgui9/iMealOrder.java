/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.prjgui9;

/**
 *
 * @author keaga
 */
public interface iMealOrder {
    double calculateTotal(int intNumMeals, double dblPrice);
    boolean validateData (String strMeal, int intNumMeals, double dblPrice);
    
}
