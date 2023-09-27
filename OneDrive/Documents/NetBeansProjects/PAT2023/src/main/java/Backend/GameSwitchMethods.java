/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Interface.CrosswordScreen;
import Interface.DiningRoom;
import Interface.FindingGameScreen;
import Interface.HangmanScreen;
import Interface.LoungeScreen;
import Interface.MagicSquareScreen;
import Interface.RiddleScreen;
import Interface.SceneScreen;
import Interface.SlidingPuzzleScreen;
import Interface.TicTacToeScreen;
import Interface.WordGameScreen;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megan
 */
public class GameSwitchMethods
{
    //fields
    private static boolean findingMapSelected;
    private static boolean riddleSelected;
    private static boolean hangmanSelected;
    private static boolean slidingPuzzleSelected;
    private static boolean magicSquareSelected;
    private static boolean ticTacToeSelected;
    private static boolean crosswordSelected;
    private static boolean wordGameSelected;
    private static boolean sceneGameSelected;
    private static boolean diningRoomSelected;
    private static boolean loungeSelected;
    
    //setters
    public static void setFindingMapSelected(boolean findingMapSelected)
    {
        GameSwitchMethods.findingMapSelected = findingMapSelected;
    }

    public static void setRiddleSelected(boolean riddleSelected)
    {
        GameSwitchMethods.riddleSelected = riddleSelected;
    }

    public static void setHangmanSelected(boolean hangmanSelected)
    {
        GameSwitchMethods.hangmanSelected = hangmanSelected;
    }

    public static void setSlidingPuzzleSelected(boolean slidingPuzzleSelected)
    {
        GameSwitchMethods.slidingPuzzleSelected = slidingPuzzleSelected;
    }

    public static void setMagicSquareSelected(boolean magicSquareSelected)
    {
        GameSwitchMethods.magicSquareSelected = magicSquareSelected;
    }

    public static void setTicTacToeSelected(boolean ticTacToeSelected)
    {
        GameSwitchMethods.ticTacToeSelected = ticTacToeSelected;
    }

    public static void setCrosswordSelected(boolean crosswordSelected)
    {
        GameSwitchMethods.crosswordSelected = crosswordSelected;
    }

    public static void setWordGameSelected(boolean wordGameSelected)
    {
        GameSwitchMethods.wordGameSelected = wordGameSelected;
    }

    public static void setSceneGameSelected(boolean sceneGameSelected)
    {
        GameSwitchMethods.sceneGameSelected = sceneGameSelected;
    }

    public static void setDiningRoomSelected(boolean diningRoomSelected)
    {
        GameSwitchMethods.diningRoomSelected = diningRoomSelected;
    }

    public static void setLoungeSelected(boolean loungeSelected)
    {
        GameSwitchMethods.loungeSelected = loungeSelected;
    }
    
    
    //resets all the variables to false
    public static void resetOptionVariables()
    {
        findingMapSelected = false;
        riddleSelected = false;
        hangmanSelected = false;
        slidingPuzzleSelected = false;
        magicSquareSelected = false;
        ticTacToeSelected = false;
        crosswordSelected = false;
        wordGameSelected = false;
        sceneGameSelected = false;
        diningRoomSelected = false;
        loungeSelected = false;
    }
    
    
    //gets the current game
    private String getSelectedGame()
    {
        if(findingMapSelected)
        {
            return "FindMap";
        }
        
        else if(riddleSelected)
        {
            return "Riddle";
        }
        
        else if(hangmanSelected)
        {
            return "Hangman";
        }
        
        else if(slidingPuzzleSelected)
        {
            return "SlidingPuzzle";
        }
        
        else if(magicSquareSelected)
        {
            return "MagicSquare";
        }
        
        else if(ticTacToeSelected)
        {
            return "TicTacToe";
        }
        
        else if(crosswordSelected)
        {
            return "Crossword";
        }
        
        else if(wordGameSelected)
        {
            return "WordGame";
        }
        
        else if(sceneGameSelected)
        {
            return "FinalScene";
        }
        
        return "none selected";
    }
    
    
    //fetches the data from the db
    private String fetchData(String col) throws SQLException
    {
        //variables
        String output = "";
        String game = getSelectedGame();

        //running a query to fetch the data
        UserManager userManager = new UserManager();
        String query = "SELECT " + col + " FROM tblTaskMessages WHERE Task = \"" + game + "\"";
        ResultSet results = userManager.query(query);

        //changing it into a string
        try
        {
            results.next();
            output = results.getString(col);
        } catch (SQLException ex)
        {
            Logger.getLogger(GameSwitchMethods.class.getName()).log(Level.SEVERE, null, ex);
        }

        return output;
    }
    
    
    //gets whatever info is needed for this game
    public String getData(String infoNeeded) throws SQLException
    {
        return fetchData(infoNeeded);
    } 
    
    
    //opens the next game screen required based off of what the user's previous choices were
    public void openGameScreen() throws IOException, SQLException
    {
        if(findingMapSelected)
        {
            new FindingGameScreen().setVisible(true);
        }
        
        else if(crosswordSelected)
        {
            new CrosswordScreen().setVisible(true);
        } 
        
        else if(hangmanSelected)
        {
            new HangmanScreen().setVisible(true);
        }
        
        else if(magicSquareSelected)
        {
            new MagicSquareScreen().setVisible(true);
        }
        
        else if(riddleSelected)
        {
            new RiddleScreen().setVisible(true);
        }
        
        else if(sceneGameSelected)
        {
            new SceneScreen().setVisible(true);
        }
        
        else if(slidingPuzzleSelected)
        {
            new SlidingPuzzleScreen().setVisible(true);
        }
        
        else if(ticTacToeSelected)
        {
            new TicTacToeScreen().setVisible(true);
        }
        
        else if(wordGameSelected)
        {
            new WordGameScreen().setVisible(true);
        }
        
        else if(diningRoomSelected)
        {
            new DiningRoom().setVisible(true);
        }
        
        else if(loungeSelected)
        {
            new LoungeScreen().setVisible(true);
        }
        
        //the tasks that do not have a screen will not open a screen
    }
}

