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
    private final User CURRENT_USER;

    
    //makes a diary object for a particular user
    public Diary(User currentUser)
    {
        this.CURRENT_USER = currentUser;
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
    public String getClueData(String dataNeeded) throws SQLException
    {
        //getting the game that the user wants
        if(selectedClue.equals("Picture"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedMagicSquare())
            {
                return getData("Clue", "Picture");
            }
        }
        
        else if(selectedClue.equals("Knife"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedKnife())
            {
                return getData("Clue", "Knife");
            }
        }
            
        else if(selectedClue.equals("Fire Iron"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedFireIron())
            {
                return getData("Clue", "Fire Iron");
            }
        }
        
        else if(selectedClue.equals("Tommy"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedKnife())
            {
                return getData("Clue", "Tommy");
                
            }
        }
        
        else if(selectedClue.equals("Astrid"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedKnife())
            {
                return getData("Clue", "Astrid");
                
            }
        }
        
        else if(selectedClue.equals("Mylan"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedKnife())
            {
                return getData("Clue", "Mylan");              
            }
        }
        
        else if(selectedClue.equals("Camila"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedKnife())
            {
                return getData("Clue", "Camila");              
            }
        }
        
        else if(selectedClue.equals("Emile"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedKnife())
            {
                return getData("Clue", "Emile");
            }
        }
        
        else if(selectedClue.equals("Ara"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedKnife())
            {
                return getData("Clue", "Ara");
            }
        }
        
        //game has not been completed and hence no data has been found
        return "No data found";
    }

    
    //gets the character data that is requested
    public String getCharacterData(String dataNeeded) throws SQLException
    {
        if(selectedCharacter.equals("Tommy"))
        {
            return getData("CharInfo", "Tommy");
        }
        
        else if(selectedCharacter.equals("Astrid"))
        {
            return getData("CharInfo", "Astrid");
        }
        
        else if(selectedCharacter.equals("Mylan"))
        {
            return getData("CharInfo", "Mylan");
        }
        
        else if(selectedCharacter.equals("Camila"))
        {
            return getData("CharInfo", "Camila");
        }
        
        else if(selectedCharacter.equals("Emile"))
        {
            return getData("CharInfo", "Emile");
        }
        
        else //this is for Ara
        {
            return getData("CharInfo", "Ara");
        }
    }
    
    //helper method to the getCharacterInfo method
    private String getData(String dataNeeded, String subject) throws SQLException
    {
        //gets the character info, meaning that subject is the name of a character
        if(dataNeeded.equals("CharInfo"))
        {
            //variables
            String character = subject;
            
            //running a query to get the data from the database
            UserManager userManager = new UserManager();
            ResultSet result = userManager.query(""); //add in the character variable and "CharInfo"
                
            //converting it into a String and returning it
            return result.getString("CharInfo");
        }
        
        //gets a character's motive, meaning that subject is a character
        else if(dataNeeded.equals("Motive"))
        {
            //variables
            String character = subject;
            
            //running a query to get the data from the database
            UserManager userManager = new UserManager();
            ResultSet result = userManager.query(""); //add in the character variable and "Motive"
                
            //converting it into a String and returning it
            return result.getString("Motive");
        }
            
        //isn't any of the previous methods, hence the subject is not a character, meaning that it is a clue
        else
        {
            //variables
            String clue = subject;
            
            //running a query to get the data from the database
            UserManager userManager = new UserManager();
            ResultSet result = userManager.query(""); //add in the clue variable and "Motive"
                
            //converting it into a String and returning it
            return result.getString("Info");
        }
    }
}
