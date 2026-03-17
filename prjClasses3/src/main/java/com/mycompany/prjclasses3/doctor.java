/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjclasses3;

/**
 *
 * @author lab_services_student
 */
public class doctor {
    
    private String strDoctor,strPatient;
    private double dblFee;
    private int intConsultations;
    
    public doctor(String strDoctorName,String strPatientName, double dblConsultationFee, int intConsultationAmt){
    
    
        strDoctor = strDoctorName;
        strPatient = strPatientName;
        dblFee = dblConsultationFee;
        intConsultations = intConsultationAmt;
    }
    public String getDoctor()
    {
        return strDoctor;
    }
    public String getPatient()
    {
        return strPatient;
    }
    public double getTotalDue()
    {
        return(dblFee * intConsultations);
    }
}
