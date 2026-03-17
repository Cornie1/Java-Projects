/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjgui8;

/**
 *
 * @author keaga
 */
public class Calculator {
     public double add(double txtInputlblFirstNum, double txtInputlblSecondNum ){
         return txtInputlblFirstNum + txtInputlblSecondNum;
}
    public double subtract(double txtInputlblFirstNum, double txtInputlblSecondNum ){
         return txtInputlblFirstNum - txtInputlblSecondNum;
    }
    public double multiply(double txtInputlblFirstNum, double txtInputlblSecondNum ){
         return txtInputlblFirstNum * txtInputlblSecondNum;
    }
    public double divide(double txtInputlblFirstNum, double txtInputlblSecondNum ){
         if (txtInputlblSecondNum == 0){
             throw new IllegalArgumentException("Cannot divide by zero!");
             
         } 
         return  txtInputlblFirstNum / txtInputlblSecondNum;
    }
  
  
}
