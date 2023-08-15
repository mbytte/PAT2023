/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NovemberTrials2022;

import java.time.LocalDate;

/**
 *
 * @author megan
 */
public class Module
{
    //fields
     private String courseID;
     private String moduleID;
     private String moduleName;
     private Assessment[] assessments;
     private int size;
     public static final int PASS_MARK = 50;
     
     
     //constructor
    public Module(String courseID, String moduleID, String moduleName)
    {
        this.courseID = courseID;
        this.moduleID = moduleID;
        this.moduleName = moduleName;
        
        //initialising array
        assessments = new Assessment[15];
    }
     
    
    //getters
    public String getModuleID()
    {
        return moduleID;
    }

    public String getModuleName()
    {
        return moduleName;
    }
    
    public LocalDate getExamDate()
    {
        //searching through the array to find the exam
        for(int i = 0; i < size; i++)
        {
            if(assessments[i].isExam())
            {
                return assessments[i].getDateWritten();
            }
        }
        
        //exam not found
        return null;
    }
    
    public double getModuleMark()
    {
        double totalMark = 0;
        for(int i = 0; i < size; i++)
        {
            totalMark+=assessments[i].getMark()*assessments[i].getWeighting();
        }
        
        //making the mark into 2 decimals
        totalMark = Math.round(totalMark*100)/100;
        
        return totalMark;
    }
    
    public boolean hasPassed()
    {
        if(getModuleMark() > PASS_MARK)
        {
            return true;
        }
        
        return false;
    }
    
    
    //setters
    public void addAssessment(Assessment assessment)
    {
        assessments[size] = assessment;
        size++;
    }
    
    
    //toString
    @Override
    public String toString()
    {
        String output = "MODULE: " + moduleName + " | " + "ASSESSMENTS: ";
        for(int i = 0; i < size; i++)
        {
            output+=assessments[i].toString() + " | ";
        }
        
        return output;
    }
    
}
