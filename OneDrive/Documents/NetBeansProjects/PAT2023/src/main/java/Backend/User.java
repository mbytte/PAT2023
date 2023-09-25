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
public class User
{
    //fields
    private int userID;
    private String username;
    private boolean completedCrossword;
    private boolean completedFinalReveal;
    private boolean completedFirstReveal;
    private boolean completedFindCane;
    private boolean completedFindKeys;
    private boolean completedFindMap;
    private boolean completedHangman;
    private boolean completedMagicSquare;
    private boolean completedRiddle;
    private boolean completedSlidingPuzzle;
    private boolean completedSpeakingToCharacters;
    private boolean completedTicTacToe;
    private boolean completedWordGame;
    private boolean investigatedKnife;
    private boolean investigatedFireIron;
    private boolean investigatedLetter;
    private boolean investigatedSwords;


    
    //creates a user object
    public User(int userID, String username, boolean completedCrossword, boolean completedFinalReveal, boolean completedFirstReveal, boolean completedFindCane, boolean completedFindKeys, boolean completedFindMap, boolean completedHangman, boolean completedMagicSquare, boolean completedRiddle, boolean completedSlidingPuzzle, boolean completedSpeakingToCharacters, boolean completedTicTacToe, boolean completedWordGame, boolean investigatedKnife, boolean investigatedFireIron, boolean investigatedLetter, boolean investigatedSwords)
    {
        this.userID = userID;
        this.username = username;
        this.completedCrossword = completedCrossword;
        this.completedFinalReveal = completedFinalReveal;
        this.completedFirstReveal = completedFirstReveal;
        this.completedFindCane = completedFindCane;
        this.completedFindKeys = completedFindKeys;
        this.completedFindMap = completedFindMap;
        this.completedHangman = completedHangman;
        this.completedMagicSquare = completedMagicSquare;
        this.completedRiddle = completedRiddle;
        this.completedSlidingPuzzle = completedSlidingPuzzle;
        this.completedSpeakingToCharacters = completedSpeakingToCharacters;
        this.completedTicTacToe = completedTicTacToe;
        this.completedWordGame = completedWordGame;
        this.investigatedKnife = investigatedKnife;
        this.investigatedFireIron = investigatedFireIron;
        this.investigatedLetter = investigatedLetter;
        this.investigatedSwords = investigatedSwords;
    }
    
    
    
    //getters
    public int getUserID()
    {
        return userID;
    }

    public String getUsername()
    {
        return username;
    }

    public boolean isCompletedCrossword()
    {
        return completedCrossword;
    }

    public boolean isCompletedFinalReveal()
    {
        return completedFinalReveal;
    }

    public boolean isCompletedFirstReveal()
    {
        return completedFirstReveal;
    }

    public boolean isCompletedFindCane()
    {
        return completedFindCane;
    }

    public boolean isCompletedFindKeys()
    {
        return completedFindKeys;
    }

    public boolean isCompletedFindMap()
    {
        return completedFindMap;
    }

    public boolean isCompletedHangman()
    {
        return completedHangman;
    }

    public boolean isCompletedMagicSquare()
    {
        return completedMagicSquare;
    }

    public boolean isCompletedRiddle()
    {
        return completedRiddle;
    }

    public boolean isCompletedSlidingPuzzle()
    {
        return completedSlidingPuzzle;
    }

    public boolean isCompletedSpeakingToCharacters()
    {
        return completedSpeakingToCharacters;
    }

    public boolean isCompletedTicTacToe()
    {
        return completedTicTacToe;
    }

    public boolean isCompletedWordGame()
    {
        return completedWordGame;
    }

    public boolean isInvestigatedKnife()
    {
        return investigatedKnife;
    }

    public boolean isInvestigatedFireIron()
    {
        return investigatedFireIron;
    }

    public boolean isInvestigatedLetter()
    {
        return investigatedLetter;
    }

    public boolean isInvestigatedSwords()
    {
        return investigatedSwords;
    }
    
    
    
    //setters
    public void setCompletedCrosswordTrue()
    {
        this.completedCrossword = true;
    }

    public void setCompletedFinalRevealTrue()
    {
        this.completedFinalReveal = true;
    }
    
    public void setCompletedFirstRevealTrue()
    {
        this.completedFinalReveal = true;
    }

    public void setCompletedFindCaneTrue()
    {
        this.completedFindCane = true;
    }

    public void setCompletedFindKeysTrue()
    {
        this.completedFindKeys = true;
    }

    public void setCompletedFindMapTrue()
    {
        this.completedFindMap = true;
    }

    public void setCompletedHangmanTrue()
    {
        this.completedHangman = true;
    }

    public void setCompletedMagicSquareTrue()
    {
        this.completedMagicSquare = true;
    }

    public void setCompletedRiddleTrue()
    {
        this.completedRiddle = true;
    }

    public void setCompletedSlidingPuzzleTrue()
    {
        this.completedSlidingPuzzle = true;
    }

    public void setCompletedSpeakingToCharactersTrue()
    {
        this.completedSpeakingToCharacters = true;
    }

    public void setCompletedTicTacToeTrue()
    {
        this.completedTicTacToe = true;
    }

    public void setCompletedWordGameTrue()
    {
        this.completedWordGame = true;
    }

    public void setInvestigatedKnifeTrue()
    {
        this.investigatedKnife = true;
    }

    public void setInvestigatedFireIronTrue()
    {
        this.investigatedFireIron = true;
    }
    
    public void setInvestigatedLetterTrue()
    {
        this.investigatedLetter = true;
    }
    
    public void setInvestigatedSwordsTrue()
    {
        this.investigatedSwords = true;
    }
    
    //checks if all the tasks before the end are completed
    public boolean isGameComplete()
    {
        if(completedFindCane && completedFindKeys && completedFindMap && completedHangman && completedMagicSquare && completedSlidingPuzzle && completedTicTacToe && completedWordGame && investigatedKnife && investigatedFireIron && investigatedLetter && investigatedSwords)
        {
            return true;
        }
        
        //not all of the tasks are completed and hence the user cannot move on to the final reveal
        return false;
    }

}
