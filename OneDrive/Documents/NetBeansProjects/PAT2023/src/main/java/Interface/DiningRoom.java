/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static Backend.GameSwitchMethods.*;
import Backend.Games;
import static Backend.SpeechMethods.*;
import Backend.UserManager;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megan
 */
public class DiningRoom extends javax.swing.JFrame
{
    UserManager userManager = new UserManager();
    Games game = new Games();
    /**
     * Creates new form DiningRoomScreen
     */
    public DiningRoom()
    {
        initComponents();
        //setting full screen
        this.setExtendedState(this.MAXIMIZED_BOTH); 
        
        //ensuring all the games are false
        resetOptionVariables();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        tommyWintersButton = new javax.swing.JButton();
        emileBeaufoyButton = new javax.swing.JButton();
        araBozoyanButton = new javax.swing.JButton();
        camilaMoreaButton = new javax.swing.JButton();
        mylanMoreaButton = new javax.swing.JButton();
        astridBergButton = new javax.swing.JButton();
        swordsButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        diaryButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        boxButton = new javax.swing.JButton();
        keyButton = new javax.swing.JButton();
        keyFoundMessage = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tommyWintersButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\tommyWinters.png")); // NOI18N
        tommyWintersButton.setBorder(null);
        tommyWintersButton.setBorderPainted(false);
        tommyWintersButton.setContentAreaFilled(false);
        tommyWintersButton.setFocusPainted(false);
        tommyWintersButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tommyWintersButtonActionPerformed(evt);
            }
        });
        getContentPane().add(tommyWintersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 250, 130, 360));

        emileBeaufoyButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\emileBeaufoyFullShot.png")); // NOI18N
        emileBeaufoyButton.setBorder(null);
        emileBeaufoyButton.setBorderPainted(false);
        emileBeaufoyButton.setContentAreaFilled(false);
        emileBeaufoyButton.setFocusPainted(false);
        emileBeaufoyButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                emileBeaufoyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(emileBeaufoyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, 70, 110));

        araBozoyanButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\araBozoyanFullShot.png")); // NOI18N
        araBozoyanButton.setBorder(null);
        araBozoyanButton.setBorderPainted(false);
        araBozoyanButton.setContentAreaFilled(false);
        araBozoyanButton.setFocusPainted(false);
        araBozoyanButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                araBozoyanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(araBozoyanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 90, 130));

        camilaMoreaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\camilaMoreaFullShot.png")); // NOI18N
        camilaMoreaButton.setBorder(null);
        camilaMoreaButton.setBorderPainted(false);
        camilaMoreaButton.setContentAreaFilled(false);
        camilaMoreaButton.setFocusPainted(false);
        camilaMoreaButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                camilaMoreaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(camilaMoreaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 100, 140));

        mylanMoreaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\mylanMoreaFullShot2.png")); // NOI18N
        mylanMoreaButton.setBorder(null);
        mylanMoreaButton.setBorderPainted(false);
        mylanMoreaButton.setContentAreaFilled(false);
        mylanMoreaButton.setFocusPainted(false);
        mylanMoreaButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mylanMoreaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(mylanMoreaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 140, 150));

        astridBergButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\astridBergFullShot.png")); // NOI18N
        astridBergButton.setBorder(null);
        astridBergButton.setBorderPainted(false);
        astridBergButton.setContentAreaFilled(false);
        astridBergButton.setFocusPainted(false);
        astridBergButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                astridBergButtonActionPerformed(evt);
            }
        });
        getContentPane().add(astridBergButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 300, 60, 160));

        swordsButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\swords.png")); // NOI18N
        swordsButton.setBorder(null);
        swordsButton.setBorderPainted(false);
        swordsButton.setContentAreaFilled(false);
        getContentPane().add(swordsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 100, 130));

        backButton.setBackground(new java.awt.Color(15, 28, 33));
        backButton.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(139, 118, 82));
        backButton.setText("<<");
        backButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        backButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 50));

        diaryButton.setBackground(new java.awt.Color(15, 28, 33));
        diaryButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        diaryButton.setForeground(new java.awt.Color(139, 118, 82));
        diaryButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\diaryIcon.jpg")); // NOI18N
        diaryButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        diaryButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                diaryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(diaryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 70, 70));

        homeButton.setBackground(new java.awt.Color(15, 28, 33));
        homeButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(139, 118, 82));
        homeButton.setText("HOME");
        homeButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        homeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 110, 70));

        boxButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\box.png")); // NOI18N
        boxButton.setBorder(null);
        boxButton.setBorderPainted(false);
        boxButton.setContentAreaFilled(false);
        boxButton.setFocusPainted(false);
        getContentPane().add(boxButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 90, 70));

        keyButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\key.png")); // NOI18N
        keyButton.setBorder(null);
        keyButton.setBorderPainted(false);
        keyButton.setContentAreaFilled(false);
        keyButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                keyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(keyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, 50, 40));

        keyFoundMessage.setBackground(new java.awt.Color(139, 118, 82));
        getContentPane().add(keyFoundMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 550, 100, 20));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\diningRoomBackground.jpg")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -30, 1490, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        this.dispose();
        new HallwayScreen().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void diaryButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_diaryButtonActionPerformed
    {//GEN-HEADEREND:event_diaryButtonActionPerformed
        try
        {
            new DiaryScreen().setVisible(true);
        } catch (SQLException ex)
        {
            Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_diaryButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        this.dispose();
        new UserScreen().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void keyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_keyButtonActionPerformed
    {//GEN-HEADEREND:event_keyButtonActionPerformed
        //setting the message 
        remove(keyButton);
        keyFoundMessage.setText("KEY FOUND!");
        keyFoundMessage.setOpaque(true);
        
        try
        {
            //adding it to the keys found
            game.keyFound(1);
        } catch (SQLException ex)
        {
            Logger.getLogger(SeatCompartmentsScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(SeatCompartmentsScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_keyButtonActionPerformed

    private void mylanMoreaButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mylanMoreaButtonActionPerformed
    {//GEN-HEADEREND:event_mylanMoreaButtonActionPerformed
        //setting the relevant character variable to true
        setCharacterSelected("Mylan Morea");
            
        if(!userManager.getSelectedUser().isCompletedSpeakingToCharacters())
        {
            try
                {
                    //opening the speech screen
                    getSpeechDB("CheckUpSpeech");
                try
                {
                    new SpeechMiniScreen().setVisible(true);
                } catch (IOException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        //is completed and can move on to other tasks
        else
        {
            //checking if the game has been completed yet or not
            //uncompleted
            if(!userManager.getSelectedUser().isCompletedHangman())
            {
                //set the variable for this game to true
                setHangmanSelected(true);

                try
                {
                    //opening the speech screen
                    getSpeechDB("TaskSpeech");
                    try
                    {
                        new SpeechMiniScreen().setVisible(true);
                    } catch (IOException ex)
                    {
                        Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            //completed
            else
            {
                try
                {
                    //opening the speech screen
                    getSpeechDB("ExtraSpeech");
                    try
                    {
                        new SpeechMiniScreen().setVisible(true);
                    } catch (IOException ex)
                    {
                        Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_mylanMoreaButtonActionPerformed

    private void camilaMoreaButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_camilaMoreaButtonActionPerformed
    {//GEN-HEADEREND:event_camilaMoreaButtonActionPerformed
        //setting the relevant character variable to true
        setCharacterSelected("Camila Morea");
            
        if(!userManager.getSelectedUser().isCompletedSpeakingToCharacters())
        {
            try
                {
                    //opening the speech screen
                    getSpeechDB("CheckUpSpeech");
                try
                {
                    new SpeechMiniScreen().setVisible(true);
                } catch (IOException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        //is completed and can move on to other tasks
        else
        {
            //checking if the game has been completed yet or not
            //uncompleted
            if(!userManager.getSelectedUser().isCompletedFindMap())
            {
                 //set the variable for this game to true
                setFindingMapSelected(true);

                try
                {
                    //opening the speech screen
                    getSpeechDB("TaskSpeech");
                    try
                    {
                        new SpeechMiniScreen().setVisible(true);
                    } catch (IOException ex)
                    {
                        Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            //completed
            else
            {
                try
                {
                    //opening the speech screen
                    getSpeechDB("ExtraSpeech");
                    try
                    {
                        new SpeechMiniScreen().setVisible(true);
                    } catch (IOException ex)
                    {
                        Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_camilaMoreaButtonActionPerformed

    private void araBozoyanButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_araBozoyanButtonActionPerformed
    {//GEN-HEADEREND:event_araBozoyanButtonActionPerformed
        //setting the relevant character variable to true
        setCharacterSelected("Ara Bozoyan");
            
        if(!userManager.getSelectedUser().isCompletedSpeakingToCharacters())
        {
            try
                {
                    //opening the speech screen
                    getSpeechDB("CheckUpSpeech");
                try
                {
                    new SpeechMiniScreen().setVisible(true);
                } catch (IOException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        //is completed and can move on to other tasks
        else
        {
            //checking if the game has been completed yet or not
            //uncompleted
            if(!userManager.getSelectedUser().isCompletedCrossword())
            {
                 //set the variable for this game to true
                setCrosswordSelected(true);

                try
                {
                    //opening the speech screen
                    getSpeechDB("TaskSpeech");
                    try
                    {
                        new SpeechMiniScreen().setVisible(true);
                    } catch (IOException ex)
                    {
                        Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            //completed
            else
            {
                try
                {
                    //opening the speech screen
                    getSpeechDB("ExtraSpeech");
                    try
                    {
                        new SpeechMiniScreen().setVisible(true);
                    } catch (IOException ex)
                    {
                        Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_araBozoyanButtonActionPerformed

    private void emileBeaufoyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_emileBeaufoyButtonActionPerformed
    {//GEN-HEADEREND:event_emileBeaufoyButtonActionPerformed
        //setting the relevant character variable to true
        setCharacterSelected("Emile Beaufoy");
            
        if(!userManager.getSelectedUser().isCompletedSpeakingToCharacters())
        {
            try
                {
                    //opening the speech screen
                    getSpeechDB("CheckUpSpeech");
                try
                {
                    new SpeechMiniScreen().setVisible(true);
                } catch (IOException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        //is completed and can move on to other tasks
        else
        {
            //checking if the game has been completed yet or not
            //uncompleted
            if(!userManager.getSelectedUser().isCompletedTicTacToe())
            {
                //set the variable for this game to true
                setTicTacToeSelected(true);

                try
                {
                    //opening the speech screen
                    getSpeechDB("TaskSpeech");
                    try
                    {
                        new SpeechMiniScreen().setVisible(true);
                    } catch (IOException ex)
                    {
                        Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            //completed
            else
            {
                try
                {
                    //checking if the last game is viable
                    if(userManager.getSelectedUser().isGameComplete())
                    {
                        //set the variable for this game to true
                        setRiddleSelected(true);
                        
                        setSpeech("I have something that may point you in the right direction in this investigation. But first, tell me, can you solve my riddle?");
                        try
                        {
                            new SpeechMiniScreen().setVisible(true);
                        } catch (IOException ex)
                        {
                            Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    //still have not completed all of the tasks
                    else
                    {
                        //opening the speech screen
                        getSpeechDB("ExtraSpeech");
                        try
                        {
                            new SpeechMiniScreen().setVisible(true);
                        } catch (IOException ex)
                        {
                            Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_emileBeaufoyButtonActionPerformed

    private void astridBergButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_astridBergButtonActionPerformed
    {//GEN-HEADEREND:event_astridBergButtonActionPerformed
        //setting the relevant character variable to true
        setCharacterSelected("Astrid Berg");
            
        if(!userManager.getSelectedUser().isCompletedSpeakingToCharacters())
        {
            try
                {
                    //opening the speech screen
                    getSpeechDB("CheckUpSpeech");
                try
                {
                    new SpeechMiniScreen().setVisible(true);
                } catch (IOException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        //is completed and can move on to other tasks
        else
        {
            //checking if the game has been completed yet or not
            //uncompleted
            if(!userManager.getSelectedUser().isCompletedFindKeys())
            {
                try
                {
                    //opening the speech screen
                    getSpeechDB("TaskSpeech");
                    try
                    {
                        new SpeechMiniScreen().setVisible(true);
                    } catch (IOException ex)
                    {
                        Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            //completed
            else
            {
                try
                {
                    //opening the speech screen
                    getSpeechDB("ExtraSpeech");
                    try
                    {
                        new SpeechMiniScreen().setVisible(true);
                    } catch (IOException ex)
                    {
                        Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_astridBergButtonActionPerformed

    private void tommyWintersButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tommyWintersButtonActionPerformed
    {//GEN-HEADEREND:event_tommyWintersButtonActionPerformed
        //setting the relevant character variable to true
        setCharacterSelected("Tommy Winters");
            
        if(!userManager.getSelectedUser().isCompletedSpeakingToCharacters())
        {
            try
                {
                    //opening the speech screen
                    getSpeechDB("CheckUpSpeech");
                try
                {
                    new SpeechMiniScreen().setVisible(true);
                } catch (IOException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        //is completed and can move on to other tasks
        else
        {
            //checking if the game has been completed yet or not
            //uncompleted
            if(!userManager.getSelectedUser().isCompletedFindKeys())
            {
                try
                {
                    //opening the speech screen
                    getSpeechDB("TaskSpeech");
                    try
                    {
                        new SpeechMiniScreen().setVisible(true);
                    } catch (IOException ex)
                    {
                        Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            //completed
            else
            {
                try
                {
                    //opening the speech screen
                    getSpeechDB("ExtraSpeech");
                    try
                    {
                        new SpeechMiniScreen().setVisible(true);
                    } catch (IOException ex)
                    {
                        Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex)
                {
                    Logger.getLogger(DiningRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_tommyWintersButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton araBozoyanButton;
    private javax.swing.JButton astridBergButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton boxButton;
    private javax.swing.JButton camilaMoreaButton;
    private javax.swing.JButton diaryButton;
    private javax.swing.JButton emileBeaufoyButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton keyButton;
    private javax.swing.JLabel keyFoundMessage;
    private javax.swing.JButton mylanMoreaButton;
    private javax.swing.JButton swordsButton;
    private javax.swing.JButton tommyWintersButton;
    // End of variables declaration//GEN-END:variables
}
