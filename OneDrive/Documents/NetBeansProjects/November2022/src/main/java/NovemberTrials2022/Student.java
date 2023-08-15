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
public class Student
{
    //fields
    private String studentName;
    private LocalDate dateOfBirth;
    private String studentID;
    private  Module[] modules;
    private int size;
    
    
    //constructor
    public Student(String studentName, LocalDate dateOfBirth)
    {
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
    }
    
    
    //getters
    public String getAcademicRecord()
    {
        
    }
    
    public String getExamSchedule()
    {
        
    }
    
    
    //sorters
    public void sortByDate()
    {
        
    }
    
    //setters and generators
    private void addAssessment(Assessment assessment, String assessmentModuleID)
    {
        
    }
    
    private void generateStudentID()
    {
        
    }
    
    
    //toString
    @Override
    public String toString()
    {
        return "Student{" + '}';
    }
    
}
