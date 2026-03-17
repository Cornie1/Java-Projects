/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjexamprep2;

/**
 *
 * @author keaga
 */
public class BookPurchase implements IBookPurchase {
 
    @Override
    public double calculatePrice(int intNumBooks, double dblPrice) {
        double dblTotalAmout;
        dblTotalAmout = dblPrice * intNumBooks;
        dblTotalAmout += (dblTotalAmout * 0.15);
        return dblTotalAmout;
    }

    @Override
    public boolean validateData(BookData bookData) {
        boolean bValidateData = true;

        if (bookData.getBookTitle().length() <= 0) {
            bValidateData = false;
        }

        double dblPrice = bookData.getPrice();
        if (dblPrice <= 0) {
            bValidateData = false;
        }

        int intNumBooks = bookData.getNumBooks();
        if (intNumBooks <= 0) {
            return false;
        }
        return bValidateData;

    }

}
