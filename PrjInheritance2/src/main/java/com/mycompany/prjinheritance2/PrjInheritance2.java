/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinheritance2;

import javax.swing.JOptionPane;
import javax.swing.plaf.nimbus.NimbusStyle;

/**
 *
 * @author lab_services_student
 */
public class PrjInheritance2 {

    public static void main(String[] args) {
        String strType = JOptionPane.showInputDialog(null, "Enter employee type:\n- normal \n = overtime employee");
        
        String strName = JOptionPane.showInputDialog(null, "Enter employee name");
        
        double dblBaseSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your salary"));
        
        
        Employee emp;
        
        if(strType.equals("")){
            int intOvertimeHours = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter overtime hours"));
            double dblOvertimeRate = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Overtime rate per hours:"));
        
        emp = new OvertimeEmployee(strName, dblBaseSalary, intOvertimeHours, dblBaseSalary);
        
        }else{
            emp = new Employee(strName, dblBaseSalary);
        }
        JOptionPane.showMessageDialog(null, emp.getName()+"total pay: R" + emp.calculatePay());
    }
}