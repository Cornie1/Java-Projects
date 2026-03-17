/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.prjgui5;

/**
 *
 * @author ajkil
 */
public interface IProductSales {
    int [] GetProductSales();
    int GetTotalSales();
    int GetSalesOverLimit();
    int GetSalesUnderlimit();
    int GetProductsProcessed();
    double GetAverageSales(int intSalesMicroPhone, int intSalesSpeakers, int intSalesMixingDesk);
}
