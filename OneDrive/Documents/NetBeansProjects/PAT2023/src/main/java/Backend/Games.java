/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.ArrayList;
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
    @Override
    public String toString()
    {
        return "WINS : " + numWins + "\n\nDRAWS : " + numDraws + "\n\nLOSSES : " + numLoses;
    }
}
