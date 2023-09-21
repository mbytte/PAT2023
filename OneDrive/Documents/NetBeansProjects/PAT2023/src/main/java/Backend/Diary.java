/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

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
    public String getClueData(String game)
    {
        //checks if the clue has been obtained
        
        //connects to the database if yes
        //gets the information
        //returns the clue
        //returns "no data found" if clue has not been found
            
        return selectedClue;
    }

    public String getCharacterData()
    {
        
        return selectedCharacter;
    }
    
}
