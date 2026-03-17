

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjclasses1;

/**
 *
 * @author keaga
 */
public class students {
    
    private String strStudentName, strStudentcurse;
    
    private double dblStudentAverage;
    
    
    public void setName( String strName){
        
        strStudentName=strName;
    }
    
    public String getName(){
        return strStudentName;
    }
     public void setCourse( String strCourse){
        
        strStudentcurse=strCourse;
    }
     public String getCourse(){
        return strStudentcurse;
    }
     
     public void setAverage(double dblAverage){
        
        dblStudentAverage=dblAverage;
    }
     public double getAverage(){
        return (dblStudentAverage + (dblStudentAverage*0.10));
    }



}