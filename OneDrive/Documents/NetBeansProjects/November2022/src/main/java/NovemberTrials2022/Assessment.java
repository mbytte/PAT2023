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
public class Assessment
{
    //fields
    private String moduleID;
    private String assessmentName;
    private int total;
    private int mark;
    private double weighting;
    private LocalDate dateWritten;
    private boolean isExam;
    
    
    //constructor
    public Assessment(String moduleID, String assessmentName, int total, int mark, double weighting, LocalDate dateWritten, boolean isExam)
    {
        this.moduleID = moduleID;
        this.assessmentName = assessmentName;
        this.total = total;
        this.mark = mark;
        this.weighting = weighting;
        this.dateWritten = dateWritten;
        this.isExam = isExam;
    }
    
    
    //getters
    public String getAssessmentName()
    {
        return assessmentName;
    }

    public int getTotal()
    {
        return total;
    }

    public int getMark()
    {
        return mark;
    }

    public double getWeighting()
    {
        return weighting;
    }

    public LocalDate getDateWritten()
    {
        return dateWritten;
    }

    public boolean isExam()
    {
        return isExam;
    }
    
    
    //toString
    @Override
    public String toString()
    {
        return assessmentName + " : " + mark + "/" + total;
    }
    
}
