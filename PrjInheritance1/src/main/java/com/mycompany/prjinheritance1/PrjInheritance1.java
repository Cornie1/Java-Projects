/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinheritance1;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjInheritance1 {

    public static void main(String[] args) {
        
        String strUserPrompt = JOptionPane.showInputDialog(null,"Input Sport event eg. cricket");
        SportEvent strSportEvent = new SportEvent (strUserPrompt);
        
        SportEvent event = new SportEvent(strUserPrompt);
        if(event.getFee()==0){
            JOptionPane.showMessageDialog(null,"Fee cannot be located");
        }else{
            JOptionPane.showMessageDialog(null, "Sport event" + strUserPrompt.toUpperCase()+ "\n"+"Event fee" + event.getFee());
        }
    }
}
