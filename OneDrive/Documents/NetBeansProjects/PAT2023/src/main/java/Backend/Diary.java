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
    
    
    //setters
//    public void setSelectedClue(String clue)
//    {
//        selectedClue = clue;
//    }
//
//    public void setSelectedCharacter(String character)
//    {
//        selectedCharacter = character;
//    }
    
    
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
            
        else if(selectedClue.equals("FireIron"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedFireIron())
            {
                return getData("Clue", "FireIron");
            }
        }
        
        else if(selectedClue.equals("Letter"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedLetter())
            {
                return getData("Clue", "Letter");
            }
        }
        
        else if(selectedClue.equals("Secret message"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedWordGame())
            {
                return getData("Clue", "SecretMessage");
            }
        }
        
        else if(selectedClue.equals("Swords"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isInvestigatedSwords())
            {
                return getData("Clue", "Swords");
            }
        }
        
        else if(selectedClue.equals("Tommy Winters"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedCrossword())
            {
                return getData("Motive", "Tommy Winters");
                
            }
        }
        
        else if(selectedClue.equals("Astrid Berg"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedHangman())
            {
                return getData("Motive", "Astrid Berg");
                
            }
        }
        
        else if(selectedClue.equals("Mylan Morea"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedTicTacToe())
            {
                return getData("Motive", "Mylan Morea");              
            }
        }
        
        else if(selectedClue.equals("Camila Morea"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedFindKeys())
            {
                return getData("Motive", "Camila Morea");              
            }
        }
        
        else if(selectedClue.equals("Emile Beaufoy"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedFindMap() && CURRENT_USER.isCompletedSlidingPuzzle())
            {
                return getData("Motive", "Emile Beaufoy");
            }
        }
        
        else if(selectedClue.equals("Ara Bozoyan"))
        {
            //checking if the clue has been obtained
            if(CURRENT_USER.isCompletedFindCane())
            {
                return getData("Motive", "Ara Bozoyan");
            }
        }
        
        //game has not been completed and hence no data has been found
        return "No data found";
    }

    
    //gets the character data that is requested
    public String getCharacterData(String selectedCharacter) throws SQLException
    {
        return getData("CharInfo", selectedCharacter);
   
//        if(selectedCharacter.equals("Tommy Winters"))
//        {
//            return getData("CharInfo", "Tommy Winters");
//        }
//        
//        else if(selectedCharacter.equals("Astrid Berg"))
//        {
//            return getData("CharInfo", "Astrid Berg");
//        }
//        
//        else if(selectedCharacter.equals("Mylan"))
//        {
//            return getData("CharInfo", "Mylan");
//        }
//        
//        else if(selectedCharacter.equals("Camila"))
//        {
//            return getData("CharInfo", "Camila");
//        }
//        
//        else if(selectedCharacter.equals("Emile"))
//        {
//            return getData("CharInfo", "Emile");
//        }
//        
//        else //this is for Ara
//        {
//            return getData("CharInfo", "Ara");
//        }
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
