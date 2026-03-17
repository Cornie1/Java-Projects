/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjifexample6;
import java.util.ArrayList;
/**
 *
 * @author lab_services_student
 */
public class Customer {
    private ArrayList<String> customers = new ArrayList<>();
    
    public boolean addCustomer(String strName){
        if (strName == null || strName.trim().isEmpty()){
        return false;
        }
        customers.add(strName.trim());
        return true;
    }
    public int searchCustomer(String strName){
        return customers.indexOf(strName.trim());
    }
    public boolean updateCustomer(String strOldName, String strNewName){
        int  index= searchCustomer(strOldName);
        if (index != -1 && strNewName != null && !strNewName.trim().isEmpty()){
            customers.set(index, strNewName.trim());
            return true;
        }
        return false;
    }
    public boolean removeCustomer (String strName){
        return customers.remove(strName.trim());
    }
    public ArrayList<String> getAllCustomers(){
        return new ArrayList<>(customers);
    }
}
