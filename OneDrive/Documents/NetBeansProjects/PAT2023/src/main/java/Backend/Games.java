/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Interface.DiningRoom;
import Interface.ObjectiveScreen;
import Interface.SpeechMiniScreen;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import Interface.SlidingPuzzleScreen;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author megan
 */
public class Games 
{
    //class fields specific for the user
    private UserManager userManager = new UserManager();
    private static ArrayList<User> currentArrayList = new ArrayList<User>();
    private static int currentUserIndex = UserManager.getCurrentUserIndex();
    private User currentUser = userManager.getSelectedUser();
    private Diary diary = new Diary();
    
    
    
    
    //TIC TAC TOE
    //fields
    private int numWins;
    private int numLoses;
    private int numDraws;
    private String[][] layout = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
    private ArrayList <String> openSpaces = new ArrayList<>();
    
    
    //instantiates the layout 2d array
    public void instantiateLayout()
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                layout[i][j] = " ";
            }
        }
    }
    
    
    //instantiates the array list
    public void instantiateOpenSpaces()
    {
        openSpaces.add("button1");
        openSpaces.add("button2");
        openSpaces.add("button3");
        openSpaces.add("button4");
        openSpaces.add("button5");
        openSpaces.add("button6");
        openSpaces.add("button7");
        openSpaces.add("button8");
        openSpaces.add("button9");
    }
    
    
    //checks if there are still open spaces
    public boolean checkIfOpenSpaces()
    {
        if(openSpaces.size() > 0)
        {
            return true;
        }
        
        return false;
    }
    
    
    //checks if the button pressed is free to be used
    public boolean isButtonUsed(String buttonText)
    {
        if(buttonText == " ")
        {
            return false;
        }
        
        else
        {
            return true;
        }
    }
    
    
    //adds an X component to the button
    public void addSymbol(JButton button, int numButton, String symbol)
    {
        //checking if button is free
        if(!isButtonUsed(button.getText()))
        {
            System.out.println("Made it");
            System.out.println(symbol);
            
            //adding symbol
            button.setText(symbol);
            System.out.println(button.getText());
            
           
            //removing this button from the buttons used
            openSpaces.remove("button" + numButton);
            
            //adding this symbol to the layout
            int[] buttonPos = getButtonPos(button, numButton);
            layout[buttonPos[0]][buttonPos[1]] = symbol;
            System.out.println(layout[buttonPos[0]][buttonPos[1]]);
        }
    }
    
    
    //gets the button position
    public int[] getButtonPos(JButton button, int numButton)
    {
        //variables
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
        for(int i = 1; i < 10; i++)
        {
            newAL.add("button" + i);
        }
        
        //creating a default array for the layout (need this because the winCheck needs the thingys to be not null)
        String[][] newLayout = new String[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                newLayout[i][j] = " ";
            }
        }
        
        //setting values
        layout = newLayout;
        openSpaces = newAL;
    }
    
    
    //checks if the whole game has been won
    public void isTicTacToeComplete() throws SQLException, IOException
    {
        if(numWins == 3)
        {
            //setting the speech
            SpeechMethods.getSpeechDB("InformationSpeech");
            
            //opening the screens that are required
            new SpeechMiniScreen().setVisible(true);
            
            //updating the variables
            currentUser.setCompletedTicTacToeTrue();
            userManager.updateCurrentArrayList();
            userManager.setUsers(currentArrayList);
            userManager.save(currentUser.getUserID(), "TicTacToe", 1);
            
            //setting this variable to false so that the next screen opened is not a repeat of this game
            GameSwitchMethods gm = new GameSwitchMethods();
            gm.setIsGameBeingOpened(false);
        }
    }
    
    //checks if the round has been won and if the whole game is completed
    //boolean to be used in the GUI to reset the UI version of the grid
    public boolean isTicTacToeRoundComplete()
    {
        //all possible win scenarios
        //#1
        if((layout[0][0] == layout[0][1] && layout[0][0]== layout[0][2]))
        {
            //checking who won
            if(layout[0][0].equals("X"))
            {
                numWins++;
            }
            
            //LOSE
            else if(layout[0][0].equals("O"))
            {
                numLoses++;
            }
            
            //resetting the grid
            resetTicTacToe();
            return true; 
        }
        
        //#2
        else if(layout[1][0] == layout[1][1] && layout[1][0]== layout[1][2])
        {
            if(layout[1][0].equals("X"))
            {
                numWins++;
            }

            else if(layout[1][0].equals("O")) 
            {
                numLoses++;
            }
            
            //resetting the grid
            resetTicTacToe();
            return true; 
        }
        
        
        //#3
        else if((layout[2][0] == layout[2][1] && layout[2][0]== layout[2][2]))
        {
            if(layout[2][0].equals("X"))
            {
                numWins++;
            }

            else if(layout[2][0].equals("O"))
            {
                numLoses++;
            }
            
            //resetting the grid
            resetTicTacToe();
            return true; 
        }
        
        //#4
         else if((layout[0][0] == layout[1][1] && layout[0][0]== layout[2][2]))
        {
            if(layout[0][0].equals("X"))
            {
                numWins++;
            }

            else if(layout[0][0].equals("O"))
            {
                numLoses++;
            }
            
            //resetting the grid
            resetTicTacToe();
            return true; 
        }
         
        //#5 
        else if((layout[0][2] == layout[1][1] && layout[0][2]== layout[2][0]))
        {
            if(layout[0][2].equals("X"))
            {
                numWins++;
            }

            else if(layout[0][2].equals("O"))
            {
                numLoses++;
            }
            
            //resetting the grid
            resetTicTacToe();
            return true; 
        }
        
        //#6
        else if((layout[0][0] == layout[1][0] && layout[0][0]== layout[2][0]))
        {
            if(layout[0][0].equals("X"))
            {
                numWins++;
            }

            else if(layout[0][0].equals("O"))
            {
                numLoses++;
            }
            
            //resetting the grid
            resetTicTacToe();
            return true; 
        }
        
        //#7
        else if((layout[0][1] == layout[1][1] && layout[0][1]== layout[2][1]))
        {
            if(layout[0][1].equals("X"))
            {
                numWins++;
            }

            else if(layout[0][1].equals("O"))
            {
                numLoses++;
            }
            
            //resetting the grid
            resetTicTacToe();
            return true; 
        }
        
        //#8
        else if((layout[0][2] == layout[1][2] && layout[0][2]== layout[2][2]))
        {
            if(layout[0][2].equals("X"))
            {
                numWins++;
            }

            else if(layout[0][2].equals("O"))
            {
                numLoses++;
            }
            
            //resetting the grid
            resetTicTacToe();
            return true; 
        }
        
        //drawing
        else if(!checkIfOpenSpaces())
        {
            numDraws++;
            //resetting the grid
            resetTicTacToe();
            return true; 
        }
        
        //there is no win and there are still open spaces
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
           displayString += " " + usersWordArray[arrayPosition]; 
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

    public boolean isCloseScreen()
    {
        return closeScreen;
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
    public void hangmanWinCheck() throws SQLException, IOException        
    {
        //win
        if(Arrays.equals(correctWordArray, usersWordArray))
        {
            //setting the speech
            SpeechMethods.getSpeechDB("InformationSpeech");
            
            new SpeechMiniScreen().setVisible(true);
            //closing the screen
            closeScreen = true;
            
            //sets the user objects variable to be true and changes the information
            currentUser.setCompletedHangmanTrue();            
            userManager.updateCurrentArrayList();
            userManager.setUsers(currentArrayList);
            userManager.save(currentUser.getUserID(), "Hangman", 1);
            
            //setting this variable to false so that the next screen opened is not a repeat of this game
            GameSwitchMethods gm = new GameSwitchMethods();
            gm.setIsGameBeingOpened(false);
        }
        
        //lose
        //the user only gets 5 chances
        if(numWrongAnswers  == 5)
        {
            new DiningRoom().setVisible(true);
            //closing the screen
            closeScreen = true;
        }
    }
    
    
  
    
    //RIDDLE
    //fields
    private static String riddle = "";
    private static String riddleAnswer = "";
    private static boolean riddleChosen = false; //once the riddle is chosen, it will not be chosen again
    
    
    //selecting a riddle
    public void selectRiddle()
    {
        //variables
        String riddle1 = "What has to be broken before you can use it?";
        String riddle1Ans = "egg";
        String riddle2 = "I shave everyday, but I still have a beard. What am I?";
        String riddle2Ans = "barber";
        String riddle3 = "I am an odd number. Take away a letter and I become even. What number am I?";
        String riddle3Ans = "seven";
        String[] riddles = {riddle1, riddle2, riddle3};
        String[] answers = {riddle1Ans, riddle2Ans, riddle3Ans};
        
        //getting a random index
        int index = (int)(Math.random()*(3));
        
        //adding it to the fields
        riddle = riddles[index];
        riddleAnswer = answers[index];
    }

    
    //getters
    public String getRiddle()
    {
        return riddle;
    }

    public boolean isRiddleChosen()
    {
        return riddleChosen;
    }
    
    
    //checks if the answer is right
    public void inputCheck(String userInput) throws SQLException, IOException
    {
        //right answer
        if(userInput.equals(riddleAnswer))
        {
            //setting the speech
            SpeechMethods.getSpeechDB("InformationSpeech");
            
            new SpeechMiniScreen().setVisible(true);
            
            //sets the user objects variable to be true
            currentUser.setCompletedRiddleTrue();
            userManager.updateCurrentArrayList();
            userManager.setUsers(currentArrayList);
            userManager.save(currentUser.getUserID(), "Riddle", 1);
            
            //setting this variable to false so that the next screen opened is not a repeat of this game
            GameSwitchMethods gm = new GameSwitchMethods();
            gm.setIsGameBeingOpened(false);
        }
    }
    
    
    
    
    //SLIDING PUZZLE
    //fields
    private static String[] currentPicOrder = new String[6];
    private static String[] buttonOrder = {"button1", "button2", "button3", "button4", "button5", "button6"};
    private boolean puzzleWin = false;
    
    
    //gets the current picture being presented on a specific jbutton
    public String getPic(String screenStr)
    {
        //getting the screen number
        int screenNumber = getButtonNumber(screenStr);
        
        //setting the image to screenIcon
        String screenIcon = currentPicOrder[screenNumber];
        
        //returning screenIcon to be able to use the file paths of the images
        return screenIcon;   
    }
    
    
    //getters
    //gets the value of 'win'
    public boolean isPuzzleWin()
    {
        return puzzleWin;
    }
    
    //gets the current picture order
    public String[] getCurrentPicOrder()
    {
        return currentPicOrder;
    }   
    
    
    //gets the button number 
    public int getButtonNumber(String buttonStr)
    {
        int buttonNumber = 0;
        //getting the screen number depending on which screen is in question
        switch (buttonStr)
        {
            case "button1" -> buttonNumber = 1;
            case "button2" -> buttonNumber = 2;
            case "button3" -> buttonNumber = 3;
            case "button4" -> buttonNumber = 4;
            case "button5" -> buttonNumber = 5;
            //no default because it will never be used
        }
        return buttonNumber;
    }
    
    
    //finds what position the blank picture(mapPiece6) is currently in
    public int getCirclePicPos()
    {
        //variables
        int circlePicPos = 0;
        String circlePicPath = "resources\\mapPiece6.jpg";  //what the circle pic is saved as
        
        //looking through all the positions in the ray to find which one is the blank picture
        //loops 6 times because there are 6 positions
        for(int i = 0; i < 6; i++)
        {
            if(circlePicPath.equals(currentPicOrder[i]))
            {
                circlePicPos = i;
            }
        }    
        
        
        return circlePicPos;
    }
    
    
    //swaps two buttons' pictures
    //helper method to framePicSwap
    private void pictureSwap(JButton button1, JButton button2, String button1Str, String button2Str) throws IOException
    {    
        //getting the image icons in those current buttons
        String button1Icon = getPic(button1Str);
        String button2Icon = getPic(button2Str);
        
        //setting the icons
        BufferedImage img = ImageIO.read(new File(button1Icon)); 
        button2.setIcon(new ImageIcon(img));
        
        img = ImageIO.read(new File(button2Icon)); 
        button1.setIcon(new ImageIcon(img));
        
        //setting the current image array to be updated according to what images are there
        int btn1ScreenNumber = getButtonNumber(button1Str);
        currentPicOrder[btn1ScreenNumber] = button2Icon;
        int btn2ScreenNumber = getButtonNumber(button2Str);
        currentPicOrder[btn2ScreenNumber] = button1Icon;
    }
    
    //swaps the pics depending on which frame they are in
    public void buttonPicSwap(int buttonNum, int blankPicButton, JButton button0, JButton button1, JButton button2, JButton button3, JButton button4, JButton button5) throws IOException
    {
        
        //only swapping pics if the blank space is next to button0 (button1, button3)
        if(buttonNum == 0)
        {
            switch (blankPicButton)
            {
                case 1 -> //swapping the pictures
                    pictureSwap(button0, button1, buttonOrder[0], buttonOrder[1]);
                case 3 -> //swapping the pictures
                    pictureSwap(button0, button3, buttonOrder[0], buttonOrder[3]);
            }
        }
        
        //only swapping pics if the blank space is next to button1 (button0, button2, button4)
        if(buttonNum == 1)
        {        
            switch (blankPicButton)
            {
                case 0 -> //swapping the pictures
                    pictureSwap(button1, button0, buttonOrder[1], buttonOrder[0]);
                case 2 -> //swapping the pictures
                    pictureSwap(button1, button2, buttonOrder[1], buttonOrder[2]);
                case 4 -> //swapping the pictures
                    pictureSwap(button1, button4, buttonOrder[1], buttonOrder[4]);
            }
        }
        
        //only swapping pics if the blank space is next to button2 (button1, button5)
        if(buttonNum == 2)
        {           
            switch (blankPicButton)
            {
                case 1 -> //swapping the pictures
                    pictureSwap(button2, button1, buttonOrder[2], buttonOrder[1]);
                case 5 -> //swapping the pictures
                    pictureSwap(button2, button5, buttonOrder[2], buttonOrder[5]);
            }
        }
        
        //only swapping pics if the blank space is next to button3 (button0, button4)
        if(buttonNum == 3)
        {            
            switch (blankPicButton)
            {
                case 0 -> //swapping the pictures
                    pictureSwap(button3, button0, buttonOrder[3], buttonOrder[0]);
                case 4 -> //swapping the pictures
                    pictureSwap(button3, button4, buttonOrder[3], buttonOrder[4]);
            }
        }
        
        //only swapping pics if the blank space is next to button4 (button1, button3, button5)        
        if(buttonNum == 4)
        {
            switch (blankPicButton)
            {
                case 1 -> //swapping the pictures
                    pictureSwap(button4, button1, buttonOrder[4], buttonOrder[1]);
                case 3 -> //swapping the pictures
                    pictureSwap(button4, button3, buttonOrder[4], buttonOrder[3]);
                case 5 -> //swapping the pictures
                    pictureSwap(button4, button5, buttonOrder[4], buttonOrder[5]);
            }        
        }
        
        //only swapping pics if the blank space is next to button5 (button2, button4)
        if(buttonNum == 5)
        {
            switch (blankPicButton)
            {
                case 2 -> //swapping the pictures
                    pictureSwap(button5, button2, buttonOrder[5], buttonOrder[2]);
                case 4 -> //swapping the pictures
                    pictureSwap(button5, button4, buttonOrder[5], buttonOrder[4]);
            }
        }
    }
    
    
    //checks if the order that the user has arranged the pictures in is the exact way they are supposed to be arranged
    public void puzzleWin() throws SQLException, IOException
    {
        //variables
        //the order that the pictures should be arranged in in order for the player to win
        String[] correctOrder = new String[6];
        correctOrder[0] = "resources\\mapPiece1.jpg";
        correctOrder[1] = "resources\\mapPiece2.jpg";
        correctOrder[2] = "resources\\mapPiece3.jpg";
        correctOrder[3] = "resources\\mapPiece4.jpg";
        correctOrder[4] = "resources\\mapPiece5.jpg";
        correctOrder[5] = "resources\\mapPiece6.jpg";
        //changeable variable
        int numCorrectPicPlace = 0;
        
        
        //check to see if everything is the same
        for(int i = 0; i < 6; i++)
        {
            if(currentPicOrder[i].equals(correctOrder[i]))
            {
                numCorrectPicPlace++;
            }
        }
        
        //winning screen displayed if all the pictures were in the same place
        if(numCorrectPicPlace == 6)
        {
            //setting the speech
            SpeechMethods.getSpeechDB("InformationSpeech");
            
            new Interface.SpeechMiniScreen().setVisible(true);

            //setting the win variable to true to be used to close the screen
            puzzleWin = true;
            //sets the user objects variable to be true
            currentUser.setCompletedSlidingPuzzleTrue();
            userManager.save(currentUser.getUserID(), "SlidingPuzzle", 1);
            
            //setting this variable to false so that the next screen opened is not a repeat of this game
            GameSwitchMethods gm = new GameSwitchMethods();
            gm.setIsGameBeingOpened(false);
        }
    }
    
    
    //creates a randomly sorted picture set up
    public void createPicSetup()
    {
        //variables
        ArrayList <String> picsInOrder = new ArrayList<String>(); //start in order
        
        //making the array list
        for(int i = 1; i < 7; i++)
        {
            picsInOrder.add("resources\\mapPiece" + i + ".jpg");
        }
        
        //assigning the new order to be solved
        for(int i = 0; i < 6; i++)
        {
            //getting a random number within the length of he pics avaialble still
            int index = (int)(Math.random()*(picsInOrder.size()));
            //adding it to the pic order and removing that picture from the array
            currentPicOrder[i] = picsInOrder.get(index); 
            picsInOrder.remove(index);
        }
    }
    
    
    
    
    //FIND MAP 
    //fields
    private int mapFragmentsLeft = 6;
    
    
    //the user has found a fragment
    public void fragmentFound() throws SQLException, IOException
    {
        mapFragmentsLeft--;
        
        //checking to see if the game has been won or not yet
        if(mapFragmentsLeft == 0)
        {
            //setting the speech
            SpeechMethods.setSpeech("Very much thanks for finding my map, but it still in pieces! ");
            
            //sets the user objects variable to be true
            currentUser.setCompletedFindMapTrue();
            userManager.updateCurrentArrayList();
            userManager.setUsers(currentArrayList);
            userManager.save(currentUser.getUserID(), "FindMap", 1);
            
            //setting this variable to false so that the next screen opened is not a repeat of this game
            GameSwitchMethods gm = new GameSwitchMethods();
            gm.setFindingMapSelected(false);
            gm.setSlidingPuzzleSelected(true);
            
            //opens the next stage of this game
            new ObjectiveScreen().setVisible(true);
            new SlidingPuzzleScreen().setVisible(true);
        }
    }
    
    //gets the number of fragments found
    public int getNumFragmentsFound()
    {
        return 6-mapFragmentsLeft;
    }
    
    
    
    
    //FIND KEYS
    //fields
    private static int keysLeft = 3;
    private static ArrayList<Integer> keysFound = new ArrayList<Integer>();
    
    //the user has found a fragment
    public void keyFound(int keyNum) throws SQLException, IOException
    {
        //checking if that key has been found yet
        if(!keysFound.contains(keyNum))
        {
            keysLeft--;
        
            //checking to see if the game has been won or not yet
            if(keysLeft == 0)
            {
                //setting the speech and character (have to for this game because the user can complete other games while this one is still ongoing)
                SpeechMethods.setCharacterSelected("Astrid Berg");
                SpeechMethods.getSpeechDB("InformationSpeech");
                
                new SpeechMiniScreen().setVisible(true);

                //sets the user objects variable to be true
                currentUser.setCompletedFindKeysTrue();
                userManager.updateCurrentArrayList();
                userManager.setUsers(currentArrayList);
                userManager.save(currentUser.getUserID(), "FindKeys", 1);
                
                //setting this variable to false so that the next screen opened is not a repeat of this game
                GameSwitchMethods gm = new GameSwitchMethods();
                gm.setIsGameBeingOpened(false);
            }
        }
    }
    
    //gets the number of fragments found
    public int getNumKeysFound()
    {
        return 3-keysLeft;
    }
    
    
    
    
    
    
    //CANE GAME
    //marks this task as complete
    public void foundCane() throws SQLException, IOException
    {
        //setting the character selected to Tommy
        SpeechMethods.setCharacterSelected("Tommy Winters");
        SpeechMethods.getSpeechDB("InformationSpeech");
        
        new SpeechMiniScreen().setVisible(true);
        
        //sets the user objects variable to be true
        currentUser.setCompletedFindCaneTrue();
        userManager.updateCurrentArrayList();
        userManager.setUsers(currentArrayList);
        userManager.save(currentUser.getUserID(), "FindCane", 1);
        
        //setting this variable to false so that the next screen opened is not a repeat of this game
        GameSwitchMethods gm = new GameSwitchMethods();
        gm.setIsGameBeingOpened(false);
    }
    
    
    
    
    //SPEAK TO ALL CHARACTERS TASK
    //fields
    private static boolean speakToTommy;
    private static boolean speakToAstrid;
    private static boolean speakToMylan;
    private static boolean speakToCamila;
    private static boolean speakToEmile;
    private static boolean speakToAra;
    private static int numCharactersSpokenTo;
    
    
    //setters
    public void setSpeakToTommy()
    {
        //checking if the task has already been conpleted or not
        if(speakToTommy == false)
        {
            speakToTommy = true;
            numCharactersSpokenTo++;
        }
    }
    public void setSpeakToAstrid()
    {
        //checking if the task has already been conpleted or not
        if(speakToAstrid == false)
        {
            speakToAstrid = true;
            numCharactersSpokenTo++;
        }
    }
    public void setSpeakToMylan()
    {
        //checking if the task has already been conpleted or not
        if(speakToMylan == false)
        {
            speakToMylan = true;
            numCharactersSpokenTo++;
        }
    }
    public void setSpeakToCamila()
    {
        //checking if the task has already been conpleted or not
        if(speakToCamila == false)
        {
            speakToCamila = true;
            numCharactersSpokenTo++;
        }
    }
    public void setSpeakToEmile()
    {
        //checking if the task has already been conpleted or not
        if(speakToEmile == false)
        {
            speakToEmile = true;
            numCharactersSpokenTo++;
        }
    }
    public void setSpeakToAra()
    {
        //checking if the task has already been conpleted or not
        if(speakToAra == false)
        {
            speakToAra = true;
            numCharactersSpokenTo++;
        }
    }
    
    //checks if all the characters have been spoken to
    public boolean isCharactersSpokenTo() throws SQLException
    {
        if(numCharactersSpokenTo == 6)
        {
            //sets the user objects variable to be true
            currentUser.setCompletedSpeakingToCharactersTrue();
            userManager.updateCurrentArrayList();
            userManager.setUsers(currentArrayList);
            userManager.save(currentUser.getUserID(), "SpeakToCharacters", 1);
            return true;
        }
        
        return false;
    }
    
    
    
    
    //CROSSWORD
    //fields
    private String crosswordPicturePathway = "";
    private String crosswordHintPathway = "";
    private String[] crosswordAnswers = new String[5];
    private int numCorrectAnswers = 0;
    private ArrayList<String> answeredQuestions = new ArrayList<String>();
    
    
    //checks if the answer inputted was correct
    public boolean checkAnswer(int questionNumber, String ans) throws SQLException, IOException
    {
        //checks if the question has already been answered or not
        if(!answeredQuestions.contains(ans))
        {
            if(crosswordAnswers[questionNumber-1].equals(ans))
            {
                answeredQuestions.add(ans);
                numCorrectAnswers++;
                
                System.out.println("YAY");
                
                //checking if the game is won
                if(checkGameWin())
                {
                    //setting the speech
                    SpeechMethods.getSpeechDB("InformationSpeech");
                    
                    new SpeechMiniScreen().setVisible(true);

                    //sets the user objects variable to be true
                    currentUser.setCompletedCrosswordTrue();
                    userManager.updateCurrentArrayList();
                    userManager.setUsers(currentArrayList);
                    userManager.save(currentUser.getUserID(), "Crossword", 1);
                    
                    //setting this variable to false so that the next screen opened is not a repeat of this game
                    GameSwitchMethods gm = new GameSwitchMethods();
                    gm.setIsGameBeingOpened(false);
                }
                
                return true; //this will then be used to make the answer block either red or green in the UI
            }
            
            else
            {
                return false;
            }
        }    
        
        //this means that the answer has been inputted beforehand and is currently green
        return true;
    }
    
    
    private boolean checkGameWin()
    {
        if(numCorrectAnswers == 5)
        {
            return true;
        }
        
        return false;
    }
    
    
    //gets a random crossword
    public void setCrossword()
    {
        //variables
        String[] crosswordPaths = {}; 
        int index = (int) Math.round(Math.random()*(1));
        
        //getting the crosswords
        if(index == 0)
        {
            crosswordPicturePathway = "resources\\crossword2.png";
            crosswordHintPathway = "resources\\crossword2Clues.png";           
            crosswordAnswers[0] = "comb";
            crosswordAnswers[1] = "towel";
            crosswordAnswers[2] = "library";
            crosswordAnswers[3] = "staircase";
            crosswordAnswers[4] = "clock";
        }
        
        else
        {
            crosswordPicturePathway = "resources\\crossword1.png";
            crosswordHintPathway = "resources\\crossword1Clues.png";           
            crosswordAnswers[0] = "sponge";
            crosswordAnswers[1] = "dictionary";
            crosswordAnswers[2] = "candle";
            crosswordAnswers[3] = "keyboard";
            crosswordAnswers[4] = "fence";
        }
    }
    
    
    //getters
    public String getCrosswordPicturePathway()
    {
        return crosswordPicturePathway;
    }

    public String getCrosswordAnswerPathway()
    {
        return crosswordHintPathway;
    }
    
    
    
    
    //MAGIC  SQUARE
    //fields
    private static int[][] correctSetup = {{3, 14, 15, 2},{8, 9, 12, 5},{10, 7, 6, 11},{13, 4, 1, 16}};
    private static int[][] userSetup = {{3, 14, 0, 2},{0, 9, 0, 0},{10, 0, 6, 0},{0, 4, 0, 0}};
    
    
    //checks if the answers are correct
    public boolean checkAnswers() throws SQLException, IOException
    {
        //variables
        int numCorrectAnswers = 0;
        
        //running through the rows
        for(int i = 0; i < 4; i++)
        {
            //running through the data in the row
            for(int j = 0; j < 4; j++)
            {
                if(correctSetup[i][j] == userSetup[i][j])
                {
                    numCorrectAnswers++;
                }
            }
        }
        
        //everything is correct and the game has been won
        if(numCorrectAnswers == 16)
        {
            //this does not belong to any character task and hence will not open any screens
            
            //sets the user objects variable to be true
            currentUser.setCompletedMagicSquareTrue();
            userManager.updateCurrentArrayList();
            userManager.setUsers(currentArrayList);
            userManager.save(currentUser.getUserID(), "MagicSquare", 1);
            
            //setting this variable to false so that the next screen opened is not a repeat of this game
            GameSwitchMethods gm = new GameSwitchMethods();
            gm.setIsGameBeingOpened(false);
            
            return true;
        }
        
        return false;
    }
    
    
    //changes the user array to fit whatever the user has changed
    public void changeUserArray(int row, int col, int inputNum)
    {
        userSetup[row][col] = inputNum;
    }
    
    
    
    
    //WORD GAME
    //fields
    private static String message = "*********************************************************************************************************************************************************************************************************************************************************************************************************************************************************";
    private static String completeMessage = "Ah, Nicolas. You have cracked my secret message! Good! One can never be too careful. When you get to France come visit me. I am curious of all the new supplies you have found through your source. You have a talent my boy. It is time for you to show it to the world. Looking forward to seeing you, Claude. P.S. Burn this when you are done reading";
    private static String riddle1 = "A man is looking at a photograph of someone. His friend asks who it is. The man replies, “Brothers and sisters, I have none. But that man’s father is my father’s son.” Who was in the photograph?";
    private static String riddle2 = "A sundial has the fewest moving parts of any timepiece. Which has the most?";
    private static String riddle3 = "Your parents have six sons including you and each son has one sister. How many people are in the family?";
    private static String ans1 = "his son";
    private static String ans2 = "hourglass";
    private static String ans3 = "nine";
    
    
    //getters
    public String getMessage()
    {
        return message;
    }

    public String getRiddle1()
    {
        return riddle1;
    }

    public String getRiddle2()
    {
        return riddle2;
    }

    public String getRiddle3()
    {
        return riddle3;
    }
    
    
    //checks if that specific riddle has been answered correctly or not
    public boolean checkRiddle1Ans(String input)
    {
        if(ans1.equals(input))
        {
            //decrypts part of the message
            String decrypted = "Ah, Nicolas. You have cracked my secret message! Good! One can never be too careful. When you get to France come visit me."; 
            message = decrypted + message.substring(122); //number should be from the next index after the length of the decrypted message
            
            return true;
        }
        
        return false;
    }
    
    public boolean checkRiddle2Ans(String input)
    {
        if(ans2.equals(input))
        {
            //decrypts part of the message
            String decrypted = " I am curious of all the new supplies you have found through your source. You have a talent my boy. "; //change this to be what you want
            message = message.substring(0, 122) + decrypted + message.substring(222); //number should be from the next index after the length of the decrypted message
            
            return true;
        }
        
        return false;
    }
    
    public boolean checkRiddle3Ans(String input)
    {
        if(ans3.equals(input))
        {
            //decrypts part of the message
            String decrypted = "It is time for you to show it to the world. Looking forward to seeing you, Claude. P.S. Burn this when you are done reading"; //change this to be what you want
            message = message.substring(0,222)  + decrypted; //number should be from the next index after the length of the decrypted message
            
            return true;
        }
        
        return false;
    }
    
    
    //checks if the game has been win or not
    public boolean wordGameWinCheck() throws SQLException, IOException
    {
        //checks if all riddles have been answered correctly
        if(message.equals(completeMessage))
        {
            new DiningRoom().setVisible(true);
            
            //sets the user objects variable to be true
            currentUser.setCompletedMagicSquareTrue();
            userManager.updateCurrentArrayList();
            userManager.setUsers(currentArrayList);
            userManager.save(currentUser.getUserID(), "WordGame", 1);
            
            //setting this variable to false so that the next screen opened is not a repeat of this game
            GameSwitchMethods gm = new GameSwitchMethods();
            gm.setIsGameBeingOpened(false);
            
            return true;
        }
        
        return false;
    }
}
