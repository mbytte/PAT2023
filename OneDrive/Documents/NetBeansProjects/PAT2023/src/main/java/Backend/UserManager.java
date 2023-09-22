/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.* ;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author megan
 */
public class UserManager
{
    //fields
   private static final String driver  = "com.mysql.cj.jdbc.Driver";
   private static final String url = "jdbc:mysql://102.130.115.69.3306/meganldb";
   private static final String username = "meganl";
   private static final String password = "Reddam2021";
   private ArrayList<User> users;
   private static int currentUserIndex;
   private int numUsers;
   private int lastUserID; //will use this value when adding to the db
    
    
    //constructs a usermanager object
    public UserManager() 
    {
       try
       {
           //connect to the database
           Connection connection = createConnection();
           Statement stmt = connection.createStatement();
           
           //getting all the users and applying to the fields
           ResultSet allUsers = stmt.executeQuery("SELECT * FROM tblUsers");
           numUsers = stmt.getFetchSize();
           
           //making user objects and putting them into a Array list
           while(!allUsers.isAfterLast())
           {
               //moving to the next row
               
               allUsers.next();
               //getting all the data for the user in that row
               int userID = allUsers.getInt("UserID");
               String username = allUsers.getString("Username");
               boolean completedCrossword = allUsers.getBoolean("Crossword");
               boolean completedFinalReveal = allUsers.getBoolean("Crossword");
               boolean completedFindCane = allUsers.getBoolean("Crossword");
               boolean completedFindKeys = allUsers.getBoolean("Crossword");
               boolean completedFindMap = allUsers.getBoolean("Crossword");
               boolean completedHangman = allUsers.getBoolean("Crossword");
               boolean completedMagicSquare = allUsers.getBoolean("Crossword");
               boolean completedRiddle = allUsers.getBoolean("Crossword");
               boolean completedSlidingPuzzle = allUsers.getBoolean("Crossword");
               boolean completedSpeakingToCharacters = allUsers.getBoolean("Crossword");
               boolean completedTicTacToe = allUsers.getBoolean("Crossword");
               boolean completedWordGame = allUsers.getBoolean("Crossword");
               boolean investigatedKnife = allUsers.getBoolean("Crossword");
               boolean investigatedFireIron = allUsers.getBoolean("Crossword");
               
               //adding the user to the array list
               User user = new User(userID, username, completedCrossword, completedFinalReveal, completedFindCane, completedFindKeys, completedFindMap, completedHangman, completedMagicSquare, completedRiddle, completedSlidingPuzzle, completedSpeakingToCharacters, completedTicTacToe, completedWordGame, investigatedKnife, investigatedFireIron);
               users.add(user);
           }
           
           //closing the connection
           connection.close();
           
           //gets the lastUserID in the db
           User lastUser = users.get(numUsers-1);
           lastUserID = lastUser.getUserID();
       } catch (SQLException ex)
       {
           Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    
    //creates a connection to the database
    public Connection createConnection()
    {
        //connecting to the database 
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            //Registering drivers using DriverManager
            Connection con = DriverManager.getConnection(url, username, password);

            return con;
         }
 
        catch (SQLException | ClassNotFoundException e)
        {
            System.out.println(e);
            return null;
        }
    }
    
    
    //runs a MySQL query 
    //this can be used even when the query returns no results (updates, inserts, deletes)
    public ResultSet query(String qry) throws SQLException
    {
        //creating the connection
        Connection connection = createConnection();
        
        //creating a result set by running qry
        Statement stmt = connection.createStatement();
        ResultSet results = stmt.executeQuery(qry);
        
        //returning it as a string
        return results;
    }
    
    
    //creates the user and adds it to the db
    public void createUser(String username) throws SQLException
    {
        //getting the value for the UserID
        int userID = lastUserID + 1;
        
        //adding to the db
        query("INSERT INTO tblUsers (UserID, Username, Crossword, FinalReveal, FindCane, FindKeys, FindMap, Hangman, MagicSquare, Riddle, SlidingPuzzle, SpeakToCharacters, TicTacToe, WordGame, Knife, FireIron) VALUES (" + userID + ", " + username + " , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);");

    }
    
    
    //gets a list of all the users' usernames
    public ArrayList<String> getListNames()
    {
        //creating a list of the names
        ArrayList<String> names = new ArrayList<>();
               
        //adding the list of names to the array list
        for(User user : users)
        { 
            names.add(user.getUserID() + ". " + user.getUsername());
        }
        
        return names;
    }
    
    
    //deletes a user from the database
    public void delete(int userIndex) throws SQLException
    {
        //variables
        int userID = users.get(userIndex).getUserID();
        
        //removing from the current list
        users.remove(userIndex);
        setUsers(users);
        
        //removing from the db
        query("DELETE FROM tblUsers WHERE UserID = " + userID); 
    }
    
    
    //saves the changed information to the database
    public void save(int userID, String field, int value) throws SQLException
    {
        query("UPDATE tblUsers SET " + field + " = " + value + "WHERE UserID = " + userID);
    }
    
    
    //getters
    public ArrayList<User> getUsers()
    {
        return users;
    }
    public static int getCurrentUserIndex()
    {
        return currentUserIndex;
    }
    public User getSelectedUser(int selectedIndex)
    {
        User currentUser = users.get(selectedIndex);
        return currentUser;
    }
    
    
    //setters
    public void setUsers(ArrayList<User> users)
    {
        this.users = users;
    }
    public static void setCurrentUserIndex(int index)
    {
        currentUserIndex = index;
    }
    public void setLastUserID(int lastUserID)
    {
        this.lastUserID = lastUserID;
    }
}
