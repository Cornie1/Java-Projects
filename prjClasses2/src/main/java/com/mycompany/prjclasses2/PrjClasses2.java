/** Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses2;

import javax.swing.JOptionPane;

/**
 *
 * @author keaga
 */
public class PrjClasses2 {
    
    

    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Please enter Prodct Name");
        double dblPrice= Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Prodct Price"));
       
        
       product p = new product();
       
       p.setName(strName);
       p.setPrice(dblPrice);
       
       product pN = new product();
       
       pN.setName(strName);
       pN.setPrice(dblPrice);
       
       product pNm = new product();
       
       pNm.setName(strName);
       pNm.setPrice(dblPrice);
       
       double dblDiscount = 0.0;
       
       
       
       if(p.getPrice()>= 5000){
           
           dblDiscount = p.getPrice()*10/100;
           
           JOptionPane.showMessageDialog(null,"PRODUCT NAME: " + p.getName()+ "\n"+ 
                                               "PRODUCT PRICE: " + p.getPrice() + "\n" +
                                                "DISCOUNT: " + dblDiscount);
           
       }
       
    }
    
}