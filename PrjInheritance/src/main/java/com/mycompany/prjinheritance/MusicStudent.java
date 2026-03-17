/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance;

/**
 *
 * @author lab_services_student
 */
    public class MusicStudent extends Student {
        //Child Class
        public MusicStudent(String strName){
            super(strName);
        }
        
        public void PlayInstrument (){
            System.out.println(strName + " is playing piano");
        }
    }

