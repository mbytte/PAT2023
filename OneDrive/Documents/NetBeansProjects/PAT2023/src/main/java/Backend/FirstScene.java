/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Interface.DiningRoom;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author megan
 */
public class FirstScene
{ 
    //gets the characters info
    public String getCharInfo(int characterNum) throws SQLException
    {
        String character = getCharName(characterNum);
        
        //running a query to get the data from the database
        UserManager userManager = new UserManager();
        ResultSet result = userManager.query("SELECT CharInfo FROM tblCharacters WHERE Name = \"" + character + "\"");

        //converting it into a String and returning it
        result.next();
        return result.getString("CharInfo");
    }
    
    //gets the name of the character according the the number provided
    private String getCharName(int charNum)
    {
        //getting the name according to the charNum
        String characterSelected = "";
        
        characterSelected = switch (charNum)
        {
            case 3 -> "Tommy Winters";
            case 4 -> "Astrid Berg";
            case 5 -> "Mylan Morea";
            case 6 -> "Camila Morea";
            case 7 -> "Emile Beaufoy";
            case 8 -> "Ara Bozoyan";
            default -> "Nicolas Peeters";
        };
        
        return characterSelected;
    }
    
    
    //gets the picture filepath of the character
    public Icon getCharacterPic(int charNum)
    {
        //gets the picture
        ImageIcon img;
        String characterSelected = getCharName(charNum);
        
        img = switch (characterSelected)
        {
            case "Tommy Winters" -> new ImageIcon(getClass().getResource("/images/tommyWintersCloseUp.png"));
            case "Astrid Berg" -> new ImageIcon(getClass().getResource("/images/astridBergCloseUp.png"));
            case "Emile Beaufoy" -> new ImageIcon(getClass().getResource("/images/emileBeaufoyCloseUp.png"));
            case "Camila Morea" -> new ImageIcon(getClass().getResource("/images/camilaMoreaCloseUp.png"));
            case "Ara Bozoyan" -> new ImageIcon(getClass().getResource("/images/araBozoyanCloseUp.png"));
            case "Nicolas Peeters" -> new ImageIcon(getClass().getResource("/images/nicolasPeeters.png"));
            default -> new ImageIcon(getClass().getResource("/images/mylanMoreaCloseUp.png"));
        };
        
        return img;
    }
    
    
    
    
    //FIRST SCENE
    //gets the part needed
    public void firstScene(int partOfScene, JLabel characterPic, JTextArea infoArea) throws SQLException
    {
        //variables
        String text = "";
        Icon pic = null;
        
        //gets only the part of scene indicated
        switch (partOfScene)
        {
            case 1 -> text = "Welcome to the Edelweiss Orient Express! From here you will embark on an exclusive two-week journey traveling from the countryside of Switzerland, through various Austrian mountain ranges to reach your final destination, the Austrian Alps.\n\nPress 'next' to continue.";
            case 2 -> text = "After a few days of mingling, everyone gets to know the bare minimum of their fellow passengers.";
            case 3, 4, 5, 6, 7, 8, 9 ->
            {
                text = getCharName(partOfScene) + "\n\n" + getCharInfo(partOfScene);
                pic = getCharacterPic(partOfScene);
            }
            case 10 -> text = "On the 4th day of the trip, Nicolas Peeters is found stabbed to death in his compartment. As a murder mystery novelist, you decide to start compiling clues and possibly solve the murder of Nicolas Peeters";
            case 11 -> text = "Begin by checking up on all the passengers. Once you have done this, you will be able to complete the tasks that they will have for you.";
            default ->
            {
                //setting this task as done
                UserManager um = new UserManager();
                um.getSelectedUser().setCompletedFirstRevealTrue();
                um.updateCurrentArrayList();
                um.save(um.getSelectedUser().getUserID(), "FirstReveal", 1);
                GameSwitchMethods gm = new GameSwitchMethods();
                gm.closeScreens();
                new DiningRoom().setVisible(true);
            }
        }
        //this gets all the character info
        //end of the scene
        
        //sets the values accordingly
        infoArea.setText(text);
        characterPic.setIcon(pic); 
    }
            
}
