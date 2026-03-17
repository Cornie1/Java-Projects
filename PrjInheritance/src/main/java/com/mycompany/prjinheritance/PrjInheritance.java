/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinheritance;

/**
 *
 * @author lab_services_student
 */
public class PrjInheritance {

    public static void main(String[] args) {
        SportStudent Sport = new SportStudent("David");
        Sport.attendclass();
        Sport.submitassignment();
        Sport.PlaySport();
        
        System.out.println("-------------------");
        
        MusicStudent music = new MusicStudent("Alice");
        music.attendclass();
        music.submitassignment();
        music.PlayInstrument();
        
        System.out.println("-------------------");
        
        ArtStudent art = new ArtStudent("Bob");
        art.attendclass();
        art.submitassignment();
        art.Paint();
        
        System.out.println("-------------------");
    }
}
