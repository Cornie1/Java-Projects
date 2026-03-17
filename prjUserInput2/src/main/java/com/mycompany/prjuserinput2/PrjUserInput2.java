/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjuserinput2;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class PrjUserInput2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String studentNumber = "", strName = "";
        double dblTest = 0.0, dblAssignment = 0.0, dblExam = 0.0, dblAverage = 0.0;
        
        
        System.out.println("Please enter your student Number: ");
        studentNumber = scan.nextLine();
        
        System.out.println("Please enter your student Name: ");
        strName = scan.nextLine();
        
        System.out.println("Plesae enter your test results:");
        dblTest = scan.nextDouble();
        
        System.out.println("Plesae enter your Assignment results:");
        dblAssignment = scan.nextDouble();
        
        System.out.println("Plesae enter your Exam results:");
        dblExam = scan.nextDouble();
        
        dblAverage = (dblTest + dblAssignment +dblExam)/3;
        System.out.println("Student Academic report:");
        System.err.println("-----------------------");
        System.err.println("Name:" + strName);
        System.err.println("Student Number:\t" + studentNumber);
        System.err.println("Test result: " + dblTest);
        System.err.println("Assignment result: " + dblAssignment);
        System.err.println("Exam result: " + dblExam);
        System.err.println("Average result: " + dblAverage);
    }
}
