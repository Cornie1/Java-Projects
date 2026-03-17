/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjgui5;

/**
 *
 * @author ajkil
 */
public abstract class prjProductSales implements IProductSales{
    
    public int GetProductSales(int intSalesMicroPhone, int intSalesSpeakers, int intSalesMixingDesk){
        return (intSalesMicroPhone + intSalesSpeakers + intSalesMixingDesk);
    }
    
    public int GetTotalSales(int intSalesMicroPhone, int intSalesSpeakers, int intSalesMixingDesk){
       return (intSalesMicroPhone + intSalesSpeakers + intSalesMixingDesk); 
    }
    public int GetSalesOverLimit(int intSalesMixingDesk){
        return intSalesMixingDesk;
    }
    int GetSalesUnderlimit(int intSalesMicroPhone){
        return intSalesMicroPhone;
    }
    int GetProductsProcessed(int ProductProcessed){
        return ProductProcessed;
    }
    public double GetAverageSales(int intSalesMicroPhone, int intSalesSpeakers, int intSalesMixingDesk){
        return intSalesMicroPhone + intSalesSpeakers + intSalesMixingDesk/6;
    
    }
}
