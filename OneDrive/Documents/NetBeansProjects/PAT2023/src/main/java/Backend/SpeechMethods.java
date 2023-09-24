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
    private static String characterSelected;
    
    
    //gets the speech needed from the database
    public void setSpeech(String col) throws SQLException
    {
        //running a query to fetch the data
        UserManager userManager = new UserManager();
        String query = "SELECT " + col + " FROM tblCharacters WHERE Name = \"" + characterSelected + "\""; //use the characterSelected field here and the col variable
        ResultSet results = userManager.query(query);

        //changing it into a string
        try
        {
            results.next();
            speech = results.getString(col);
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
    
    
    //setters
    public static void setCharacterSelected(String characterSelected)
    {
        SpeechMethods.characterSelected = characterSelected;
    }
    
    
    //gets the picture filepath of the character
    public String getCharacterPic()
    {
        if(characterSelected.equals("Tommy Winters"))
        {
            return "\\resources\\tommyWintersCloseUp.png";
        }
        
        else if(characterSelected.equals("Astrid Berg"))
        {
            return "\\resources\\astridBergCloseUp.png";
        }
        
        else if(characterSelected.equals("Emile Beaufoy"))
        {
            return "\\resources\\emileBeaufoyCloseUp.png";
        }
        
        else  if(characterSelected.equals("Camila Morea"))
        {
            return "\\resources\\camilaMoreaCloseUp.png";
        }
        
        else if(characterSelected.equals("Ara Bozoyan"))
        {
            return "\\resources\\araBozoyanCloseUp.png";
        }
        
        else
        {
            return "\\resources\\mylanMoreaCloseUp.png";
        }
    }
}
