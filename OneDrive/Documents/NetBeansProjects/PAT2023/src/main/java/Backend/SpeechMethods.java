/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

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
    public static void getSpeechDB(String col) throws SQLException
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

    public static void setSpeech(String speech)
    {
        SpeechMethods.speech = speech;
    }
    
    
    
    //gets the picture filepath of the character
    public Icon getCharacterPic() throws IOException
    {
        BufferedImage img;
        if(characterSelected.equals("Tommy Winters"))
        {
            img = ImageIO.read(new File( "resources\\tommyWintersCloseUp.png"));
        }
        
        else if(characterSelected.equals("Astrid Berg"))
        {
            img = ImageIO.read(new File( "resources\\astridBergCloseUp.png"));
        }
        
        else if(characterSelected.equals("Emile Beaufoy"))
        {
            img = ImageIO.read(new File( "resources\\emileBeaufoyCloseUp.png"));
        }
        
        else  if(characterSelected.equals("Camila Morea"))
        {
            img = ImageIO.read(new File( "resources\\camilaMoreaCloseUp.png"));
        }
        
        else if(characterSelected.equals("Ara Bozoyan"))
        {
            img = ImageIO.read(new File( "resources\\araBozoyanCloseUp.png"));
        }
        
        else
        {
            img = ImageIO.read(new File( "resources\\mylanMoreaCloseUp.png"));
        }
        
        ImageIcon icon = new ImageIcon(img);
        return icon;
    }
}
