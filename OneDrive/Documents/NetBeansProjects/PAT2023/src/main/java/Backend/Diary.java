/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author megan
 */
public class Diary
{
    //fields
    private String selectedClue;
    private String selectedCharacter;
    private User currentUser;

    
    //makes a diary object for a particular user
    public Diary(User currentUser)
    {
        this.currentUser = currentUser;
    }
    
    
    //setters
    public void setSelectedClue(String clue)
    {
        selectedClue = clue;
    }

    public void setSelectedCharacter(String character)
    {
        selectedCharacter = character;
    }
    
    
    //getters
    public String getClueData() throws SQLException
    {
        //getting the game that the user wants
        if(selectedClue.equals("Picture"))
        {
            //checking if the clue has been obtained
            if(currentUser.isCompletedMagicSquare())
            {
                //running a query to obtain the data from the database
                UserManager userManager = new UserManager();
                ResultSet result = userManager.query("");
                
                //converting it into a String and returning it
                return result.getString("Clue"); 
            }
        }
        
        else if(selectedClue.equals("Knife"))
        {
            //checking if the clue has been obtained
            if(currentUser.isInvestigatedKnife())
            {
                //running a query to obtain the data from the database
                UserManager userManager = new UserManager();
                ResultSet result = userManager.query("");
                
                //converting it into a String and returning it
                return result.getString("Clue");
            }
        }
            
        else if(selectedClue.equals("Fire Iron"))
        {
            //checking if the clue has been obtained
            if(currentUser.isInvestigatedFireIron())
            {
                //running a query to obtain the data from the database
                UserManager userManager = new UserManager();
                ResultSet result = userManager.query("");
                
                //converting it into a String and returning it
                return result.getString("Clue");
            }
        }
        
        else if(selectedClue.equals("Tommy"))
        {
            //checking if the clue has been obtained
            if(currentUser.isInvestigatedKnife())
            {
                //running a query to obtain the data from the database
                UserManager userManager = new UserManager();
                ResultSet result = userManager.query("");
                
                //converting it into a String and returning it
                return result.getString("Clue");
                
            }
        }
        
        else if(selectedClue.equals("Astrid"))
        {
            //checking if the clue has been obtained
            if(currentUser.isInvestigatedKnife())
            {
                //running a query to obtain the data from the database
                UserManager userManager = new UserManager();
                ResultSet result = userManager.query("");
                
                //converting it into a String and returning it
                return result.getString("Clue");
                
            }
        }
        
        else if(selectedClue.equals("Mylan"))
        {
            //checking if the clue has been obtained
            if(currentUser.isInvestigatedKnife())
            {
                //running a query to obtain the data from the database
                UserManager userManager = new UserManager();
                ResultSet result = userManager.query("");
                
                //converting it into a String and returning it
                return result.getString("Clue");
                
            }
        }
        
        else if(selectedClue.equals("Camila"))
        {
            //checking if the clue has been obtained
            if(currentUser.isInvestigatedKnife())
            {
                //running a query to obtain the data from the database
                UserManager userManager = new UserManager();
                ResultSet result = userManager.query("");
                
                //converting it into a String and returning it
                return result.getString("Clue");
                
            }
        }
        
        else if(selectedClue.equals("Emile"))
        {
            //checking if the clue has been obtained
            if(currentUser.isInvestigatedKnife())
            {
                //running a query to obtain the data from the database
                UserManager userManager = new UserManager();
                ResultSet result = userManager.query("");
                
                //converting it into a String and returning it
                return result.getString("Clue");
                
            }
        }
        
        else if(selectedClue.equals("Ara"))
        {
            //checking if the clue has been obtained
            if(currentUser.isInvestigatedKnife())
            {
                //running a query to obtain the data from the database
                UserManager userManager = new UserManager();
                ResultSet result = userManager.query("");
                
                //converting it into a String and returning it
                return result.getString("Clue");
                
            }
        }
        
        return "No data found";
    }

    public String getCharacterData()
    {
        
        return selectedCharacter;
    }
    
}
