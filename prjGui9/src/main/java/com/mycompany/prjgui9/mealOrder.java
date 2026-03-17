/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjgui9;

/**
 *
 * @author keaga
 */
public class mealOrder implements iMealOrder{
    
    private static final double VAT = 0.15;
    private String strMeal;
    private int intNumMeals;
    private double dblPrice;
    
    public mealOrder (String strMealName, int intNumOfMeals, double dblMealPrice){
        this.strMeal = strMealName;
        this.intNumMeals = intNumOfMeals;
        this.dblPrice = dblMealPrice;
    }
    
    @Override
    public double calculateTotal (int intNumOfMeals, double dblMealPrice){
        double dblSubTotal = intNumOfMeals * dblMealPrice;
        double dblVat = dblSubTotal * 0.15;
        return dblSubTotal + dblVat;
    }

    @Override
    public boolean validateData (String mealName, int numberOfMeals, double mealPrice){
        if(mealName == null || mealName.isEmpty()){
            return false;
        }
        if (mealPrice <= 0){
            return false;
        }
        if (numberOfMeals <=0){
            return false;
        }
        return true;
    }
    public double calculateVat()
    {
        return (intNumMeals * dblPrice)*VAT;
    }
    
    //getters for dispplaying if needed
    
    public String getMealName(){
        return strMeal;
    }
    
    public int getNumberOfMeals(){
        return intNumMeals;
    }
    
    public double getMealPrice(){
        return dblPrice;
    }
    
}
