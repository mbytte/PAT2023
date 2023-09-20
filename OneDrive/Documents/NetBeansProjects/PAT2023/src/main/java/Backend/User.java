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
    private String username;
    private boolean completedCrossword;
    private boolean completedFinalReveal;
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

    
    //creates a user object
    public User(String username, boolean completedCrossword, boolean completedFinalReveal, boolean completedFindCane, boolean completedFindKeys, boolean completedFindMap, boolean completedHangman, boolean completedMagicSquare, boolean completedRiddle, boolean completedSlidingPuzzle, boolean completedSpeakingToCharacters, boolean completedTicTacToe, boolean completedWordGame)
    {
        this.username = username;
        this.completedCrossword = completedCrossword;
        this.completedFinalReveal = completedFinalReveal;
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
    }
    
    
    //getters
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
    
    
    //setters
    public void setCompletedCrosswordTrue()
    {
        this.completedCrossword = true;
    }

    public void setCompletedFinalRevealTrue()
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
    
}
