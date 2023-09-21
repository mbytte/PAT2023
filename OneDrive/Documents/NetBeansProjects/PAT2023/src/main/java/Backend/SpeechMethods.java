/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megan
 */
public class SpeechMethods
{
    //fields
    private static String speech;
    
    
    //gets the speech needed from the database
    public void setSpeech(String col)
    {
        //running a query to fetch the data
        UserManager userManager = new UserManager();
        String query = ""; //use the characterSelected field here and the col variable
        ResultSet results = userManager.query(query);

        //changing it into a string
        try
        {
            speech = results.getString("Speech");
        } catch (SQLException ex)
        {
            Logger.getLogger(GameSwitchMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    //getters
    public String getSpeech()
    {
        return speech;
    }
    
    
    //gets the picture filepath of the character
    public String getCharacterPic(String characterSelected)
    {
        if(characterSelected.equals("Tommy"))
        {
            return "";
        }
        
        else if(characterSelected.equals("Astrid"))
        {
            return "";
        }
        
        else if(characterSelected.equals("Emile"))
        {
            return "";
        }
        
        else  if(characterSelected.equals("Camila"))
        {
            return "";
        }
        
        else if(characterSelected.equals("Ara"))
        {
            return "";
        }
        
        else
        {
            return "";
        }
    }
}
