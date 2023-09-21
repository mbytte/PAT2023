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
    private static String selectedClue;
    private static String selectedCharacter;
    
    
    //setters
    public static void setSelectedClue(String clue)
    {
        Diary.selectedClue = selectedClue;
    }

    public static void setSelectedCharacter(String character)
    {
        Diary.selectedCharacter = selectedCharacter;
    }
    
    
    //getters
    public static String getClueData()
    {
        //checks if the clue has been obtained
        //connects to the database if yes
        //gets the information
        //returns the clue
        //returns "no data found" if clue has not been found
        return selectedClue;
    }

    public static String getCharacterData()
    {
        return selectedCharacter;
    }
    
}
