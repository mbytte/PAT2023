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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author megan
 */
public class SceneMethods
{
    //fields
    private static boolean firstScene;
    private static boolean lastScene;
    private boolean waitForAction = false;

    
    //getters
    public boolean isFirstScene()
    {
        return firstScene;
    }

    public boolean isLastScene()
    {
        return lastScene;
    }
    
    
    //setters
    public void setFirstScene(boolean firstScene)
    {
        SceneMethods.firstScene = firstScene;
    }

    public void setLastScene(boolean lastScene)
    {
        SceneMethods.lastScene = lastScene;
    }
    
    
    //waits until a button is pressed
    public void isButtonsPressed(JButton button1, JButton button2, JButton button3, JButton button4)
    {
        System.out.println("Sup");
        waitForAction = true;
        
        while(waitForAction)
        {
            if(button1.isSelected() || button2.isSelected() || button3.isSelected() || button4.isSelected())
            {
                waitForAction = false;
            }
        }
    }
    
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(2);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(SceneMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //gets the characters info
    public String getCharInfo(String character) throws SQLException
    {
        //running a query to get the data from the database
        UserManager userManager = new UserManager();
        ResultSet result = userManager.query("SELECT CharInfo FROM tblCharacters WHERE Name = \"" + character + "\"");

        //converting it into a String and returning it
        result.next();
        return result.getString("CharInfo");
    }
    
    
    //gets the picture filepath of the character
    public Icon getCharacterPic(String characterSelected) throws IOException
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
    
    public void playFirstScene(JLabel characterPicLabel, JTextArea textArea, JButton button1, JButton button2, JButton button3, JButton button4) throws SQLException, IOException, InterruptedException
    {
        textArea.setText("Welcome to the Edelweiss Orient Express! From here you will embark on an exclusive two-week journey traveling from the countryside of Switzerland, through various Austrian mountain ranges to reach your final destination, the Austrian Alps.\n\nPress any of the button beside to continue.");
        
        //wait until one of the buttons are pressed
        //wait(1000);
        
        //textArea.setText("After a few days of mingling, everyone gets to know the bare minimum of their fellow passengers.");      
        //wait until one of the buttons are pressed
        //wait(1000);
    }
    
    //plays the first scene of the game
    public void playFirstScene2(JLabel characterPicLabel, JTextArea textArea, JButton button1, JButton button2, JButton button3, JButton button4) throws SQLException, IOException
    {
        textArea.setText("Welcome to the Edelweiss Orient Express! From here you will embark on an exclusive two-week journey traveling from the countryside of Switzerland, through various Austrian mountain ranges to reach your final destination, the Austrian Alps.\n\nPress any of the button beside to continue.");
        System.out.println(textArea.getText());
        
        //wait until one of the buttons are pressed
        isButtonsPressed(button1, button2, button3, button4);
        
        textArea.setText("After a few days of mingling, everyone gets to know the bare minimum of their fellow passengers.");      
        //wait until one of the buttons are pressed
        isButtonsPressed(button1, button2, button3, button4);
        
        //this will go on for all of the characters
        //Tommy
        textArea.setText(getCharInfo("Tommy Winters"));
        characterPicLabel.setIcon(getCharacterPic("Tommy Winters"));
        //wait until one of the buttons are pressed
        isButtonsPressed(button1, button2, button3, button4);
        
        //Astrid
        textArea.setText(getCharInfo("Astrid Berg"));
        characterPicLabel.setIcon(getCharacterPic("Astrid Berg"));
        //wait until one of the buttons are pressed
        isButtonsPressed(button1, button2, button3, button4);
        
        //Mylan
        textArea.setText(getCharInfo("Mylan Morea"));
        characterPicLabel.setIcon(getCharacterPic("Mylan Morea"));
        //wait until one of the buttons are pressed
        isButtonsPressed(button1, button2, button3, button4);
        
        //Canila
        textArea.setText(getCharInfo("Camila Morea"));
        characterPicLabel.setIcon(getCharacterPic("Camila Morea"));
        //wait until one of the buttons are pressed
        isButtonsPressed(button1, button2, button3, button4);
        
        //Emile
        textArea.setText(getCharInfo("Emile Beaufoy"));
        characterPicLabel.setIcon(getCharacterPic("Emile Beaufoy"));
        //wait until one of the buttons are pressed
        isButtonsPressed(button1, button2, button3, button4);
        
        //Ara
        textArea.setText(getCharInfo("Ara Bozoyan"));
        characterPicLabel.setIcon(getCharacterPic("Ara Bozoyan"));
        //wait until one of the buttons are pressed
        isButtonsPressed(button1, button2, button3, button4);
        
        //Nicolas
        textArea.setText(getCharInfo("Nicolas Peeters"));
        characterPicLabel.setIcon(getCharacterPic("Nicolas Peeters"));
        //wait until one of the buttons are pressed
        isButtonsPressed(button1, button2, button3, button4);
        
        textArea.setText("On the 4th day of the trip, Nicolas Peeters is found stabbed to death in his compartment. As a murder mystery novelist, you decide to start compiling clues and possibly solve the murder of Nicolas Peeters.");
        //wait until one of the buttons are pressed
        isButtonsPressed(button1, button2, button3, button4);
        
        textArea.setText("Begin by checking up on all the passengers. Once you have done this, you will be able to complete the tasks that they will have for you.");
        //wait until one of the buttons are pressed
        isButtonsPressed(button1, button2, button3, button4);
        
        //setting variable to false as it will be used to close the screen
        firstScene = false;
        
        //setting the scene as done
        UserManager um = new UserManager();
        um.getSelectedUser().setCompletedFirstRevealTrue();
    }
}
