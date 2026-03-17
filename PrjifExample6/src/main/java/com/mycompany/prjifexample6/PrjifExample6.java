/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjifexample6;

import javax.swing.JOptionPane;

public class PrjifExample6 {

    public static void main(String[] args) {
        double dblOrderAmount=0.0;
        String strMembership="";
        String strShippingLocation="";

        dblOrderAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter order amount:"));
        strMembership = JOptionPane.showInputDialog("Enter membership type (Premium, Standard, None):");
        strShippingLocation = JOptionPane.showInputDialog("Enter shipping location (Local, National, International):");

        double discount = calculateDiscount(strMembership, dblOrderAmount);
        double shippingCost = calculateShipping(dblOrderAmount, strShippingLocation);
        double finalTotal = dblOrderAmount - discount + shippingCost;

        JOptionPane.showMessageDialog(null, "Original Order Amount: R" + dblOrderAmount + "\n" +
                                            "Discount Applied: R" + discount + "\n" +
                                            "Shipping Cost: R" + shippingCost + "\n" +
                                            "Final Total: R" + finalTotal);
    }
    private static double calculateDiscount(String strMembership, double dblOrderAmount) {
        strMembership = strMembership.toLowerCase();
        if (strMembership.toLowerCase().equals("premium")) {
            return dblOrderAmount * 0.20; 
        } else if (strMembership.toLowerCase().equals("standard")) {
            return dblOrderAmount * 0.10; 
        } else {
            return 0; 
        }
    }

    private static double calculateShipping(double dblOrderAmount, String strShippingLocation) {
        if (dblOrderAmount >= 500) {
            return 0; 
        } else {
            strShippingLocation = strShippingLocation.toLowerCase();
            switch (strShippingLocation) {
                case "local": return 30;
                case "national": return 60;
                case "international": return 120;
                default: return 0;
            }
        }
    }
}