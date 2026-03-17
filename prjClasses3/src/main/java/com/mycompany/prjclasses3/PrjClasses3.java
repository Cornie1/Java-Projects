/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses3;

import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class PrjClasses3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the doctor name: ");
        String strDoctor = scan.nextLine();
        
        System.out.print("Enter the Patient name: ");
        String strPatient = scan.nextLine();
        
        System.out.print("Enter the doctor name: ");
        double dblFee = scan.nextDouble();
        
        System.out.print("Enter the doctor name: ");
        int intConsultations = scan.nextInt();
        
        doctor d = new doctor(strDoctor,strPatient, dblFee, intConsultations);
        
        
        System.out.println("Doctor Name : " + d.getDoctor());
        System.out.println("Patient Name : " + d.getPatient());
        System.out.println("Total Due : " + d.getTotalDue());
               
    }
}
