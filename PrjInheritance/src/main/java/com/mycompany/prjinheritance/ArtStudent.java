/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance;

/**
 *
 * @author lab_services_student
 */

    public class ArtStudent extends Student{
        //Child Class
        public ArtStudent(String strName){
            super(strName);
        }
        
        public void Paint(){
            System.out.println(strName + " is doing art");
        }
    }
