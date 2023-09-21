/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

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
    

    
    //resets all the variables to false
    public void resetOptionVariables()
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
    }
    
    
    //gets whatever info is needed for this game
    public String getData(String infoNeeded)
    {
        if(findingMapSelected)
        {
            //variables
            String output = "";
            
            //running a query to fetch the data
            UserManager userManager = new UserManager();
            String query = ""; //use th infoNeeded variable here
            ResultSet results = userManager.query(query);
            
            //changing it into a string
            try
            {
                output = results.getString("Objective");
            } catch (SQLException ex)
            {
                Logger.getLogger(GameSwitchMethods.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return output;
        }
        
        else if(riddleSelected)
        {
            //variables
            String output = "";
            
            //running a query to fetch the data
            UserManager userManager = new UserManager();
            String query = "";
            ResultSet results = userManager.query(query);
            
            //changing it into a string
            try
            {
                output = results.getString("Data");
            } catch (SQLException ex)
            {
                Logger.getLogger(GameSwitchMethods.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return output;
        }
        
        else if(hangmanSelected)
        {
            //variables
            String output = "";
            
            //running a query to fetch the data
            UserManager userManager = new UserManager();
            String query = "";
            ResultSet results = userManager.query(query);
            
            //changing it into a string
            try
            {
                output = results.getString("Data");
            } catch (SQLException ex)
            {
                Logger.getLogger(GameSwitchMethods.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return output;
        }
        
        else if(slidingPuzzleSelected)
        {
            //variables
            String output = "";
            
            //running a query to fetch the data
            UserManager userManager = new UserManager();
            String query = "";
            ResultSet results = userManager.query(query);
            
            //changing it into a string
            try
            {
                output = results.getString("Data");
            } catch (SQLException ex)
            {
                Logger.getLogger(GameSwitchMethods.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return output;
        }
        
        else if(magicSquareSelected)
        {
            //variables
            String output = "";
            
            //running a query to fetch the data
            UserManager userManager = new UserManager();
            String query = "";
            ResultSet results = userManager.query(query);
            
            //changing it into a string
            try
            {
                output = results.getString("Data");
            } catch (SQLException ex)
            {
                Logger.getLogger(GameSwitchMethods.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return output;
        }
        
        else if(ticTacToeSelected)
        {
            //variables
            String output = "";
            
            //running a query to fetch the data
            UserManager userManager = new UserManager();
            String query = "";
            ResultSet results = userManager.query(query);
            
            //changing it into a string
            try
            {
                output = results.getString("Data");
            } catch (SQLException ex)
            {
                Logger.getLogger(GameSwitchMethods.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return output;
        }
        
        else if(crosswordSelected)
        {
            //variables
            String output = "";
            
            //running a query to fetch the data
            UserManager userManager = new UserManager();
            String query = "";
            ResultSet results = userManager.query(query);
            
            //changing it into a string
            try
            {
                output = results.getString("Data");
            } catch (SQLException ex)
            {
                Logger.getLogger(GameSwitchMethods.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return output;
        }
        
        else if(wordGameSelected)
        {
            //variables
            String output = "";
            
            //running a query to fetch the data
            UserManager userManager = new UserManager();
            String query = "";
            ResultSet results = userManager.query(query);
            
            //changing it into a string
            try
            {
                output = results.getString("Data");
            } catch (SQLException ex)
            {
                Logger.getLogger(GameSwitchMethods.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return output;
        }
        
        else if(sceneGameSelected)
        {
            //variables
            String output = "";
            
            //running a query to fetch the data
            UserManager userManager = new UserManager();
            String query = "";
            ResultSet results = userManager.query(query);
            
            //changing it into a string
            try
            {
                output = results.getString("Data");
            } catch (SQLException ex)
            {
                Logger.getLogger(GameSwitchMethods.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return output;
        }
        
        else
        {
            //variables
            String output = "";
            
            //running a query to fetch the data
            UserManager userManager = new UserManager();
            String query = "";
            ResultSet results = userManager.query(query);
            
            //changing it into a string
            try
            {
                output = results.getString("Data");
            } catch (SQLException ex)
            {
                Logger.getLogger(GameSwitchMethods.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return output;
        }
    } 
}

