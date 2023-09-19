/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Interface.SpeechMiniScreen;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
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
    private boolean riddleChosen = false;
    
    
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
    public void inputCheck(String userInput)
    {
        //right answer
        if(userInput.equals(riddleAnswer))
        {
            new SpeechMiniScreen().setVisible(true);
            //setting the completed variable to true (for data sheet)
            Diary.setCompletedBrokenPicFrames(true);
            //sets the user objects variable to be true
            currentUser.setBrokenPicFramesTrue();
            updateCurrentArrayList();
            userManager.setUsers(currentArrayList);
            userManager.save(UserManager.getCurrentUserIndex(), currentUser);
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
            case "button6" -> buttonNumber = 6;
            //no default because it will never be used
        }
        return buttonNumber;
    }
    
    
    //finds what position the blank picture(pic2) is currently in
    public int getBlankPicPos()
    {
        //variables
        int blankPicPos = 0;
        String blankPic = "/images/2.jpg";  //the blank picture is saved as "/images/2.jpg"
        
        //looking through all the positions in the ray to find which one is the blank picture
        //loops 6 times because there are 6 positions
        for(int i = 0; i < 6; i++)
        {
            if(blankPic.equals(currentPicOrder[i]))
            {
                blankPicPos = i;
            }
        }    
        return blankPicPos;
    }
    
    
    //swaps two buttons' pictures
    //helper method to framePicSwap
    private void pictureSwap(JButton button1, JButton button2, String button1Str, String button2Str)
    {    
        //getting the image icons in those current buttons
        String button1Icon = getPic(button1Str);
        String button2Icon = getPic(button2Str);
        
        //setting the icons
        button2.setIcon(new ImageIcon(getClass().getResource(button1Icon)));
        button1.setIcon(new ImageIcon(getClass().getResource(button2Icon)));
        
        //setting the current image array to be updated according to what images are there
        int btn1ScreenNumber = getButtonNumber(button1Str);
        currentPicOrder[btn1ScreenNumber] = button2Icon;
        int btn2ScreenNumber = getButtonNumber(button2Str);
        currentPicOrder[btn2ScreenNumber] = button1Icon;
    }
    
    //swaps the pics depending on which frame they are in
    public void framePicSwap(int frameNum, int blankPicFrame, JButton frame0, JButton frame1, JButton frame2, JButton frame3, JButton frame4, JButton frame5)
    {
        //making a swappics object
        Games swapPics = new Games();       
        
        //only swapping pics if the blank space is next to frame0 (frame1, frame3)
        if(frameNum == 0)
        {
            switch (blankPicFrame)
            {
                case 1 -> //swapping the pictures
                    swapPics.pictureSwap(frame0, frame1, buttonOrder[0], buttonOrder[1]);
                case 3 -> //swapping the pictures
                    swapPics.pictureSwap(frame0, frame3, buttonOrder[0], buttonOrder[3]);
            }
        }
        
        //only swapping pics if the blank space is next to frame1 (frame0, frame2, frame4)
        if(frameNum == 1)
        {        
            switch (blankPicFrame)
            {
                case 0 -> //swapping the pictures
                    swapPics.pictureSwap(frame1, frame0, buttonOrder[1], buttonOrder[0]);
                case 2 -> //swapping the pictures
                    swapPics.pictureSwap(frame1, frame2, buttonOrder[1], buttonOrder[2]);
                case 4 -> //swapping the pictures
                    swapPics.pictureSwap(frame1, frame4, buttonOrder[1], buttonOrder[4]);
            }
        }
        
        //only swapping pics if the blank space is next to frame2 (frame1, frame5)
        if(frameNum == 2)
        {           
            switch (blankPicFrame)
            {
                case 1 -> //swapping the pictures
                    swapPics.pictureSwap(frame2, frame1, buttonOrder[2], buttonOrder[1]);
                case 5 -> //swapping the pictures
                    swapPics.pictureSwap(frame2, frame5, buttonOrder[2], buttonOrder[5]);
            }
        }
        
        //only swapping pics if the blank space is next to frame3 (frame0, frame4)
        if(frameNum == 3)
        {            
            switch (blankPicFrame)
            {
                case 0 -> //swapping the pictures
                    swapPics.pictureSwap(frame3, frame0, buttonOrder[3], buttonOrder[0]);
                case 4 -> //swapping the pictures
                    swapPics.pictureSwap(frame3, frame4, buttonOrder[3], buttonOrder[4]);
            }
        }
        
        //only swapping pics if the blank space is next to frame4 (frame1, frame3, frame5)        
        if(frameNum == 4)
        {
            switch (blankPicFrame)
            {
                case 1 -> //swapping the pictures
                    swapPics.pictureSwap(frame4, frame1, buttonOrder[4], buttonOrder[1]);
                case 3 -> //swapping the pictures
                    swapPics.pictureSwap(frame4, frame3, buttonOrder[4], buttonOrder[3]);
                case 5 -> //swapping the pictures
                    swapPics.pictureSwap(frame4, frame5, buttonOrder[4], buttonOrder[5]);
            }        
        }
        
        //only swapping pics if the blank space is next to frame5 (frame2, frame4)
        if(frameNum == 5)
        {
            switch (blankPicFrame)
            {
                case 2 -> //swapping the pictures
                    swapPics.pictureSwap(frame5, frame2, buttonOrder[5], buttonOrder[2]);
                case 4 -> //swapping the pictures
                    swapPics.pictureSwap(frame5, frame4, buttonOrder[5], buttonOrder[4]);
            }
        }
    }
    
    
    //checks if the order that the user has arranged the pictures in is the exact way they are supposed to be arranged
    public void puzzleWin()
    {
        //variables
        //the order that the pictures should be arranged in in order for the player to win
        String[] correctOrder = new String[6];
        correctOrder[0] = "/images/0.jpg";
        correctOrder[1] = "/images/1.jpg";
        correctOrder[2] = "/images/2.jpg";
        correctOrder[3] = "/images/3.jpg";
        correctOrder[4] = "/images/4.jpg";
        correctOrder[5] = "/images/5.jpg";
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
            new Interface.SpeechMiniScreen().setVisible(true);
            //setting the completed variable to true (for data sheet)
            Diary.setSlidingPuzzle(true);
            //setting the win variable to true to be used to close the screen
            puzzleWin = true;
            //sets the user objects variable to be true
            currentUser.setTornPicsTrue();
            userManager.save(UserManager.getCurrentUserIndex(), currentUser);
        }
    }
    
    
    //creates a randomly sorted picture set up
    public void createPicSetup()
    {
        //variables
        ArrayList <String> picsInOrder = new ArrayList<String>(); //start in order
        String[] picOrder = new String[6];
        
        //making the array list
        for(int i = 1; i < 7; i++)
        {
            picsInOrder.add("resources/" + i + ".png");
        }
        
        //assigning the new order to be solved
        for(int i = 0; i < 6; i++)
        {
            //getting a random number within the length of he pics avaialble still
            int index = (int)(Math.random()*(picsInOrder.size()));
            //adding it to the pic order and removing that picture from the array
            picOrder[i] = picsInOrder.get(index); 
        }
    }
    
    
    
    
    //FIND MAP 
    //fields
    private int mapFragmentsLeft = 6;
    
    
    //the user has found a fragment
    public void fragmentFound()
    {
        mapFragmentsLeft--;
        
        //checking to see if the game has been won or not yet
        if(mapFragmentsLeft == 0)
        {
            new SpeechMiniScreen().setVisible(true);
            //setting the completed variable to true (for data sheet)
            Diary.setCompletedMapPuzzle(true);
            //sets the user objects variable to be true
            currentUser.setBrokenPicFramesTrue();
            updateCurrentArrayList();
            userManager.setUsers(currentArrayList);
            userManager.save(UserManager.getCurrentUserIndex(), currentUser);
        }
    }
    
    //gets the number of fragments found
    public int getNumFragmentsFound()
    {
        return 6-mapFragmentsLeft;
    }
    
    
    
    
    //FIND KEYS
    //fields
    private int keysLeft = 6;
    
    
    //the user has found a fragment
    public void keyFound()
    {
        keysLeft--;
        
        //checking to see if the game has been won or not yet
        if(keysLeft == 0)
        {
            new SpeechMiniScreen().setVisible(true);
            //setting the completed variable to true (for data sheet)
            Diary.setCompletedMapPuzzle(true);
            //sets the user objects variable to be true
            currentUser.setBrokenPicFramesTrue();
            updateCurrentArrayList();
            userManager.setUsers(currentArrayList);
            userManager.save(UserManager.getCurrentUserIndex(), currentUser);
        }
    }
    
    //gets the number of fragments found
    public int getNumKeysFound()
    {
        return 3-keysLeft;
    }
    
    
    
    
    //CANE GAME
    //fields
    private boolean caneFound;
    
    
    //marks this task as complete
    public void foundCane()
    {
        new SpeechMiniScreen().setVisible(true);
        //setting the completed variable to true (for data sheet)
        Diary.setFoundCane(true);
        //sets the user objects variable to be true
        currentUser.setBrokenPicFramesTrue();
        updateCurrentArrayList();
        userManager.setUsers(currentArrayList);
        userManager.save(UserManager.getCurrentUserIndex(), currentUser);
    }
}
