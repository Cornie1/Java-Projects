/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses1;

import javax.swing.JOptionPane;

/**
 *
 * @author keaga
 */
public class PrjClasses1 {
    
    private static students s = new students();

    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Please enter student Name");
        String strCourse = JOptionPane.showInputDialog(null, "Please enter student Course");
        double dblAvg = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter Student Course"));
        
        s.setName(strName);
        s.setCourse(strCourse);
        s.setAverage(dblAvg);
        print();
    }
    
    public static void print(){
        String strDisplay = "The updated student average results are: \n" + 
                "STUDENT: " + s.getName() + "\n" +
                "COURSE: " + s.getCourse()+ "\n" +
                "UPDATED AVERAGE: " + s.getAverage()+ "\n";
        
        JOptionPane.showMessageDialog(null, strDisplay);
        
    }
    
    
    
    
    
}