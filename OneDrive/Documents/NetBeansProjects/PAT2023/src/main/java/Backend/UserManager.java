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
   private static final String driver = "com.mysql.cj.jdbc.Driver";
   private static final String url = "jdbc:mysql://102.130.115.69:3306/meganlDB";
   private static final String username = "meganl";
   private static final String password = "Reddam2021";
   private ArrayList<User> users;
   private static int currentUserIndex;
   private int numUsers;
   private int lastUserID; //will use this value when adding to the db
    
    
    //constructs a usermanager object
    public UserManager() 
    {
        //instantiating
        users = new ArrayList<User>();
        
       try
       {
           //connect to the database
           Connection connection = createConnection();
           Statement stmt = connection.createStatement();
           
           //getting all the users and applying to the fields
           ResultSet allUsers = stmt.executeQuery("SELECT * FROM tblUsers;");
           
           //making user objects and putting them into a Array list
           while(allUsers.next())
           {        
               //getting all the data for the user in that row
               int userID = allUsers.getInt("UserID");
               String username = allUsers.getString("Username");
               boolean completedCrossword = allUsers.getBoolean("Crossword");
               boolean completedFinalReveal = allUsers.getBoolean("FinalReveal");
               boolean completedFirstReveal = allUsers.getBoolean("FirstReveal");
               boolean completedFindCane = allUsers.getBoolean("FindCane");
               boolean completedFindKeys = allUsers.getBoolean("FindKeys");
               boolean completedFindMap = allUsers.getBoolean("FindMap");
               boolean completedHangman = allUsers.getBoolean("Hangman");
               boolean completedMagicSquare = allUsers.getBoolean("MagicSquare");
               boolean completedRiddle = allUsers.getBoolean("Riddle");
               boolean completedSlidingPuzzle = allUsers.getBoolean("SlidingPuzzle");
               boolean completedSpeakingToCharacters = allUsers.getBoolean("SpeakToCharacters");
               boolean completedTicTacToe = allUsers.getBoolean("TicTacToe");
               boolean completedWordGame = allUsers.getBoolean("WordGame");
               boolean investigatedKnife = allUsers.getBoolean("Knife");
               boolean investigatedFireIron = allUsers.getBoolean("FireIron");
               
               //adding the user to the array list
               User user = new User(userID, username, completedCrossword, completedFinalReveal, completedFirstReveal, completedFindCane, completedFindKeys, completedFindMap, completedHangman, completedMagicSquare, completedRiddle, completedSlidingPuzzle, completedSpeakingToCharacters, completedTicTacToe, completedWordGame, investigatedKnife, investigatedFireIron);
               users.add(user);
               numUsers++;
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
            Class.forName(driver);

            //Registering drivers using DriverManager
            Connection con = DriverManager.getConnection(url, username, password);

            return con;
         }
 
        catch (SQLException | ClassNotFoundException e)
        {
            System.out.println("not found");
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
        
        //closing connecion
        connection.close();
        
        //returning it as a string
        return results;
    }
    
    
    //updates, inserts or deletes from the db
    public void update(String qry) throws SQLException
    {
        //creating the connection
        Connection connection = createConnection();
        
        //creating a result set by running qry
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(qry);
        
        //closing connecion
        connection.close();
    }
    
    
    //inserts a new user into the database
    private void insert(int userID, String username, String sql) throws SQLException
    {
        //creating the connection
        Connection connection = createConnection();
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, userID);
        statement.setString(2, username);
        statement.setBoolean(3, false);
        statement.setBoolean(4, false);
        statement.setBoolean(5, false);
        statement.setBoolean(6, false);
        statement.setBoolean(7, false);
        statement.setBoolean(8, false);
        statement.setBoolean(9, false);
        statement.setBoolean(10, false);
        statement.setBoolean(11, false);
        statement.setBoolean(12, false);
        statement.setBoolean(13, false);
        statement.setBoolean(14, false);
        statement.setBoolean(15, false);
        statement.setBoolean(16, false);
        statement.setBoolean(17, false);
        
        statement.executeUpdate();
        statement.close();
    }
    
    
    //creates the user and adds it to the db
    public void createUser(String username) throws SQLException
    {
        //getting the value for the UserID
        int userID = lastUserID + 1;
        
        String sql = "INSERT INTO tblUsers (UserID, Username, Crossword, FinalReveal, FirstReveal, FindCane, FindKeys, FindMap, Hangman, MagicSquare, Riddle, SlidingPuzzle, SpeakToCharacters, TicTacToe, WordGame, Knife, FireIron) " + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        insert(userID, username, sql);

    }
    
    
    //gets a list of all the users' usernames
    public ArrayList<String> getListNames()
    {
        //creating a list of the names
        ArrayList<String> names = new ArrayList<String>();
               
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
        
        String qry = "DELETE FROM tblUsers WHERE UserID = " + userID; 
        
        //creating the connection
        Connection connection = createConnection();
        PreparedStatement statement = connection.prepareStatement(qry);
        
        //removing from the db
        statement.execute();
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
