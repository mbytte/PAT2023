/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author megan
 */
public class Diary
{
    //fields
    private final User CURRENT_USER;

    
    //makes a diary object for a particular user
    public Diary()
    {
        UserManager userManager = new UserManager();
        this.CURRENT_USER = userManager.getSelectedUser();
    }
    
    
    //gets a list of all the clue names
    public ArrayList<String> getListClues() throws SQLException
    {
        //Variables
        ArrayList<String> listNames = new ArrayList<>();
        
        //making a connection to the db and retrieving the clues
        UserManager userManager = new UserManager();
        ResultSet names = userManager.query("SELECT ClueName FROM tblClues");
        
        while(names.next())
        {
            listNames.add(names.getString("ClueName"));
        }
        
        return listNames;
    }
    
    
    //gets a list of all the character names
    public ArrayList<String> getCharacterList() throws SQLException
    {
        //Variables
        ArrayList<String> listNames = new ArrayList<>();
        
        //making a connection to the db and retrieving the clues
        UserManager userManager = new UserManager();
        ResultSet names = userManager.query("SELECT Name FROM tblCharacters");
        
        while(names.next())
        {
            listNames.add(names.getString("Name"));
        }
        
        //closing the connection
        names.close();
        
        return listNames;
    }
    
    
    //gets the information tied to that clue
    public String getClueData(String selectedClue) throws SQLException
    {
        //getting the game that the user wants
        if(selectedClue.equals("Picture"))
        {
            System.out.println("Data found");
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedMagicSquare())
            {
                return "Notes on " + selectedClue + " \n\n" + getData("Clue", "Picture");
            }
            else
            {
                String message = "No data found. \nTo get this information find the picture and complete the game. ";
                return message;
            }
        }
        
        else if(selectedClue.equals("Knife"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedKnife())
            {
                return "Notes on " + selectedClue + " \n\n" + getData("Clue", "Knife");
            }
            else
            {
                String message = "No data found. \nTo get this information find the knife.";
                return message;
            }
        }
            
        else if(selectedClue.equals("FireIron"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedFireIron())
            {
                return "Notes on " + selectedClue + " \n\n" + getData("Clue", "FireIron");
            }
            else
            {
                String message = "No data found. \nTo get this information find the fire iron.";
                return message;
            }
        }
        
        else if(selectedClue.equals("Letter"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedLetter())
            {
                return "Notes on " + selectedClue + " \n\n" + getData("Clue", "Letter");
            }
            else
            {
                String message = "No data found. \nTo get this information find the letter.";
                return message;
            }
        }
        
        else if(selectedClue.equals("SecretMessage"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedWordGame())
            {
                return "Notes on " + selectedClue + " \n\n" + getData("Clue", "SecretMessage");
            }
            else
            {
                String message = "No data found. \nTo get this information complete the task from Mylan first in order to get to the task that is required to get this information.";
                return message;
            }
        }
        
        else if(selectedClue.equals("Swords"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedSwords())
            {
                return "Notes on " + selectedClue + " \n\n" + getData("Clue", "Swords");
            }
            else
            {
                String message = "No data found. \nTo get this information find the swords.";
                return message;
            }
        }
        
        else if(selectedClue.equals("Tommy Winters"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedCrossword())
            {
                return "Notes on " + selectedClue + " \n\n" + getData("Motive", "Tommy Winters");
            }
            else
            {
                String message = "No data found. \nTo get this information complete the task from Ara.";
                return message;
            }
        }
        
        else if(selectedClue.equals("Astrid Berg"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedHangman())
            {
                return "Notes on " + selectedClue + " \n\n" + getData("Motive", "Astrid Berg");
            }
            else
            {
                String message = "No data found. \nTo get this information complete the task from Mylan";
                return message;
            }
        }
        
        else if(selectedClue.equals("Mylan Morea"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedTicTacToe())
            {
                return "Notes on " + selectedClue + " \n\n" + getData("Motive", "Mylan Morea");              
            }
            else
            {
                String message = "No data found. \nTo get this information complete the task from Emile.";
                return message;
            }
        }
        
        else if(selectedClue.equals("Camila Morea"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedFindKeys())
            {
                return "Notes on " + selectedClue + " \n\n" + getData("Motive", "Camila Morea");              
            }
            
            //returns the number of keys left to find
            else
            {
                Games game = new Games();
                String message = "No data found. \nTo get this information complete the task from Astrid.";
                message+="\n\nNumber of keys found: \n" + game.getNumKeysFound() + "/3";
                return message;
            }
        }
        
        else if(selectedClue.equals("Emile Beaufoy"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedFindMap() && CURRENT_USER.isCompletedSlidingPuzzle())
            {
                return "Notes on " + selectedClue + " \n\n" + getData("Motive", "Emile Beaufoy");
            }
            else
            {
                String message = "No data found. \nTo get this information complete the task from Camila.";
                return message;
            }
        }
        
        else
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedFindCane())
            {
                return "Notes on " + selectedClue + " \n\n" + getData("Motive", "Ara Bozoyan");
            }
            else
            {
                String message = "No data found. \nTo get this information complete the task from Tommy.";
                return message;
            }
        }
    }

    
    //gets the character data that is requested
    public String getCharacterData(String selectedCharacter) throws SQLException
    {
        return "Personal evaluation - " + selectedCharacter.toUpperCase() + " \n\n" + getData("CharInfo", selectedCharacter);
    }
    
    
    //helper method to the getCharacterInfo method
    private String getData(String dataNeeded, String subject) throws SQLException
    {
        //gets the character info, meaning that subject is the name of a character
        if(dataNeeded.equals("CharInfo"))
        {
            //variables
            String character = subject; //needs to be the full name of the character as that's what they are stored as in the db
            
            //running a query to get the data from the database
            UserManager userManager = new UserManager();
            ResultSet result = userManager.query("SELECT CharInfo FROM tblCharacters WHERE Name = \"" + character + "\"");
                
            //converting it into a String and returning it
            result.next();
            return result.getString("CharInfo");
        }
        
        //gets a character's motive, meaning that subject is a character
        else if(dataNeeded.equals("Motive"))
        {
            //variables
            String character = subject;
            
            //running a query to get the data from the database
            UserManager userManager = new UserManager();
            ResultSet result = userManager.query("SELECT Motive FROM tblCharacters WHERE Name= \"" + character + "\"");
                
            //converting it into a String and returning it
            result.next();
            return result.getString("Motive");
        }
            
        //isn't any of the previous methods, hence the subject is not a character, meaning that it is a clue
        else
        {
            //variables
            String clue = subject;
            
            //running a query to get the data from the database
            UserManager userManager = new UserManager();
            ResultSet result = userManager.query("SELECT Info FROM tblClues WHERE ClueName = \"" + clue + "\"");
                
            //converting it into a String and returning it
            result.next();
            return result.getString("Info");
        }
    }
}
