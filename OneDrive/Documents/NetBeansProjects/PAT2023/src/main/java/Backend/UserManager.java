/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.ResultSet;
import java.util.ArrayList;


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
    
    
    //constructs a usermanager object
    public UserManager()
    {
        //connect to the database 
        //create a list of users using the User contructor and adding them into the arraylist of user
    }
    
    
    //runs a MySQL query 
    public ResultSet query(String qry)
    {
        
    }
    
    
    //updates the database
    public void update(String qry)
    {
        
    }
    
    
    //Runs a specific query that obtains all the users
    public ArrayList<User> getUsers()
    {
        
    }
    
    
    //sets the users field to a new value
    public void setUsers(ArrayList<User> users)
    {
        
    }
    
    
    //sets the relevant field
    public static void UserIndex(int index)
    {
        
    }
    
    
    //creates the user and adds it to the db
    public void createUser(User user)
    {
        //use the numUsers field to get the primary key value into the databse
    }
    
    
    //gets a list of all the users' usernames
    public ArrayList<String> getListNames()
    {
        //creating a list of the names
        ArrayList<String> names = new ArrayList<>();
               
        //adding the list of names to the array list
        for(User user : users)
        {
            names.add(user.getUsername());
        }
        
        return names;
    }
    
    
    //deletes a user from the database
    public void delete(String username)
    {
        query(""); //use selectedIndex to delete 
    }
    
    
    //saves the changed information to the database
    public void save(int selectedIndex, String field, String value)
    {
        
    }
}
