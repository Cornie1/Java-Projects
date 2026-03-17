/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjsport;

/**
 *
 * @author lab_services_student
 */
public class PrjSport {
    final private double dblTennis=500;
    final private double dblCricket=350;
    final private double dblGolf=750;
    final private double dblSoccer=385;
    private String strSportEvent="";
    
    public Sport (String strEvent){
        strSportEvent = strEvent.toLowerCase();
    }
}
