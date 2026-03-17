/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjexamprep2;

/**
 *
 * @author keaga
 */
public class BookData {
    
    private final String strBookTitle;
    private final double dblPrice;
    private final int intNumBooks;
    
    
    public BookData(String strBookTitle, double dblPrice, int intNumBooks) {
        this.strBookTitle = strBookTitle;
        this.dblPrice = dblPrice;
        this.intNumBooks = intNumBooks;
    }

    public String getBookTitle(){
        return strBookTitle;
    }
    
    public double getPrice(){
        return dblPrice;
    }
    
    public int getNumBooks(){
        return intNumBooks;
    }
 
    
}
