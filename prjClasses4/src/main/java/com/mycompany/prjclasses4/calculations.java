/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjclasses4;

/**
 *
 * @author lab_services_student
 */
public class calculations {
    
    private int num1, num2;
    
    public calculations(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getAddition(){
        return (num1 + num2);
    }
    
    public int getSubtraction(){
        return (num1 - num2);
    }
    
    public int getMultiplication(){
        return (num1 * num2);
    }
    
    public int getDivision(){
        return (num1 / num2);
    }
}
