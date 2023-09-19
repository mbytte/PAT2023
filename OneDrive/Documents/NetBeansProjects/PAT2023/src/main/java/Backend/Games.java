/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Interface.SpeechMiniScreen;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;

/**
 *
 * @author megan
 */
public class Games
{
    //TIC TAC TOE
    //fields
    private int numWins;
    private int numLoses;
    private int numDraws;
    private String[][] layout = new String[3][3];
    private ArrayList <String> openSpaces;
    
    //checks if the button pressed is free to be used
    public boolean isButtonUsed(String buttonText)
    {
        if(buttonText == "")
        {
            return false;
        }
        
        else
        {
            return true;
        }
    }
    
    //adds an X component to the button
    public void addSymbol(JButton button, String symbol)
    {
        //checking if button is free
        if(!isButtonUsed(button.getText()))
        {
            //adding symbol
            button.setText(symbol);
           
            //removing this button from the buttons used
            int numButton = Integer.parseInt(button.getName().substring(6));
            int index = openSpaces.indexOf("button" + numButton);
            openSpaces.remove(index);
            
            //adding this symbol to the layout
            int[] buttonPos = getButtonPos(button);
            layout[buttonPos[0]][buttonPos[1]] = symbol;
        }
    }
    
    //gets the button position
    public int[] getButtonPos(JButton button)
    {
        //variables
        int numButton = Integer.parseInt(button.getName().substring(6));
        int[] location = {0, 0};
        
        //getting the row first
        if(numButton == 1 || numButton == 2 || numButton == 3)
        {
            //getting the column
            //don't need to do it for the first column because the location is by default set to its position
            if(numButton == 2)
            {
                location[1] = 1;
            }
            if(numButton == 3)
            {
                location[1] = 2;
            }
            
            return location;
        }
        
        else if(numButton == 4 || numButton == 5 || numButton == 6)
        {
            location[0] = 1;
            
            //getting the column
            //don't need to do it for the first column because the location is by default set to its position
            if(numButton == 5)
            {
                location[1] = 1;
            }
            if(numButton == 6)
            {
                location[1] = 2;
            }
            
            return location;
        }
        
        else
        {
            location[0] = 2;
            
            //getting the column
            //don't need to do it for the first column because the location is by default set to its position
            if(numButton == 8)
            {
                location[1] = 1;
            }
            if(numButton == 9)
            {
                location[1] = 2;
            }
            
            return location;
        }
    }
    
    //generates the AI's move
    public String computerMove()
    {
        //randomly selecting one of the free positions
        int randPos = (int) (Math.random()*(openSpaces.size()));
        
        //setting up for the button to be changed
        String buttonName = (String) (openSpaces.toArray())[randPos];
        //from here the button name will be used to find the corrrect button in the UI and then the addSymbol method will be used in the UI
        
        return buttonName;
    }
   
    //resets the game
    public void resetTicTacToe()
    {
        //getting values
        //creating a defaultArrayList
        ArrayList<String> newAL = new ArrayList<>();
        for(int i = 0; i < 9; i++)
        {
            newAL.add("button" + i+1);
        }
        
        //setting values
        numWins = 0;
        numDraws = 0;
        numLoses = 0;
        layout = new String[3][3];
        openSpaces = newAL;
    }
    
    //checks if the round has been won and if the whole game is completed
    public boolean isTicTacToeWinCheck()
    {
        //all possible win scenarios
        if((layout[0][0] == layout[0][1] && layout[0][0]== layout[0][2]) || (layout[1][0] == layout[1][1] && layout[1][0]== layout[1][2]) || (layout[2][0] == layout[2][1] && layout[2][0]== layout[2][2]) || (layout[0][0] == layout[1][1] && layout[0][0]== layout[2][2]) || (layout[0][2] == layout[1][1] && layout[0][2]== layout[2][0]))
        {
            //checking who won
            if(layout[0][0].equals("X"))
            {
                numWins++;
                
                //checking if the whole game is won
                //WIN
                if(numWins == 3)
                {
                    return true;
                }
            }
            //LOSE
            else
            {
                numLoses++;
            }
        }
        
        //drawing
        else
        {
            numDraws++;
        }
        
        return false;
    }
    
    //toString
    public String ticTacToeToString()
    {
        return "WINS : " + numWins + "\n\nDRAWS : " + numDraws + "\n\nLOSSES : " + numLoses;
    }
    
    
    
    
    //HANGMAN
    //fields
    private String[] correctWordArray = new String[8];
    private String correctWordString = "";
    private String[] usersWordArray = {"_", "_", "_", "_", "_", "_", "_", "_"};
    private static final int CORRECT_WORD_LENGTH = 8; //final as all the words are 8 letter words
    private String wrongLettersString = "";
    private int numWrongAnswers = 0;
    private int progressBarValue = 0;
    private boolean closeScreen = false;
    
    //getters
    //converts the userArray into a string and returns that string
    public String getDisplayString()
    {
        //variables
        String displayString = "";
        //adding all the letters from the userArray into a string
        for(int arrayPosition = 0; arrayPosition < CORRECT_WORD_LENGTH; arrayPosition++)
        {
           displayString += usersWordArray[arrayPosition] + " "; 
        }
        
        return displayString;
    }
    
    public String getWrongAnswers()
    {
        return wrongLettersString;
    }
    
    public int getProgressBarValue()
    {
        return progressBarValue;
    }
    
    //resets to original values
    public void resetHangman()
    {
        //resets everything in the  user array
        for(int arrayPos = 0; arrayPos < CORRECT_WORD_LENGTH; arrayPos++)
        {
            usersWordArray[arrayPos] = "_";
        }
 
        //resetting to original values
        numWrongAnswers = 0;
        wrongLettersString = "";
    }
    
    //checks if the letter is a part of the word and updates the screen
    public void letterCheck(String inputLetter)
    {
        //variables
        int numRight = 0;
        
        //checks through each postion of the completedWordArray individually
        for(int arrayPos = 0; arrayPos < CORRECT_WORD_LENGTH; arrayPos++)
        {
            //correct letter
            if(correctWordArray[arrayPos].equals(inputLetter))
            {
                usersWordArray[arrayPos] = inputLetter;
                numRight++;
            }
            
        }
        //wrong letter
        if(numRight == 0)
        {
            wrongLettersString+=inputLetter + ", ";
            numWrongAnswers++;
            progressBarValue = numWrongAnswers*20;
        }
    }
    
    //randomly selects a word and assigns it
    public void getWord()
    {
        //variables
        String[] possibleWords = {"artistic", "bachelor", "mountain"};
        int index = (int)(Math.random()*(3));
        
        //making the fields match this selected word
        //string
        correctWordString = possibleWords[index];
        //array
        for(int i = 0; i < CORRECT_WORD_LENGTH; i++)
        {
            correctWordArray[i] = correctWordString.charAt(i) + "";
        }
    }
    
    //checks if the user has user up all their chances
    public void hangmanWinCheck()        
    {
        //win
        if(Arrays.equals(correctWordArray, usersWordArray))
        {
            new SpeechMiniScreen().setVisible(true);
            //setting the completed variable to true (for data sheet)
            Diary.setCompletedHangman(true);
            //closing the screen
            closeScreen = true;
            
            //sets the user objects variable to be true and changes the information
            currentUser.setMusicBoxTrue();
            updateCurrentArrayList();
            userManager.setUsers(currentArrayList);
            userManager.save(UserManager.getCurrentUserIndex(), currentUser);
        }
        
        //lose
        //the user only gets 5 chances
        if(numWrongAnswers  == 5)
        {
            new SpeechMiniScreen().setVisible(true);
            //closing the screen
            closeScreen = true;
        }
    }
    
    
  
    
    //RIDDLE
    //fields
    private String riddle = "";
    private String riddleAnswer = "";
    
    //selecting a riddle
    public void selectRiddle()
    {
        //variables
        String riddle1 = "";
        String riddle1Ans = "";
        String riddle2 = "";
        String riddle2Ans = "";
        String riddle3 = "";
        String riddle3Ans = "";
        String[] riddles = {riddle1, riddle2, riddle3};
        String[] answers = {riddle1Ans, riddle2Ans, riddle3Ans};
        
        //getting a random index
        int index = (int)(Math.random()*(3));
        
        //adding it to the fields
        riddle = riddles[index];
        riddleAnswer = answers[index];
    }
}
