/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Backend.GameSwitchMethods;
import Backend.Games;
import Backend.UserManager;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megan
 */
public class SeatCompartmentsScreen extends javax.swing.JFrame
{
    UserManager um = new UserManager();
    Games game = new Games();
    
    /**
     * Creates new form SeatCompartmentsScreen
     */
    public SeatCompartmentsScreen()
    {
        initComponents();
        //setting full screen
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        //resetting the GameSwitch variables to all be false
        GameSwitchMethods.resetOptionVariables();
        
        //checks if the letter has already been found or not
        if(um.getSelectedUser().isInvestigatedLetter())
        {
            letterButton.setIcon(null);
            remove(letterButton);
        }
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

        backButton = new javax.swing.JButton();
        diaryButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        letterButton = new javax.swing.JButton();
        keyButton = new javax.swing.JButton();
        keyFoundMessage = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        diaryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diaryIcon.jpg"))); // NOI18N
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

        letterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/letter.jpg"))); // NOI18N
        letterButton.setBorder(null);
        letterButton.setBorderPainted(false);
        letterButton.setContentAreaFilled(false);
        letterButton.setFocusPainted(false);
        letterButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                letterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(letterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 380, 120, 70));

        keyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key.png"))); // NOI18N
        keyButton.setBorder(null);
        keyButton.setContentAreaFilled(false);
        keyButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                keyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(keyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 50, 40));

        keyFoundMessage.setBackground(new java.awt.Color(139, 118, 82));
        getContentPane().add(keyFoundMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 100, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seatingBackground.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, -450, 1760, 1200));

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
            Logger.getLogger(SeatCompartmentsScreen.class.getName()).log(Level.SEVERE, null, ex);
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
        keyButton.setIcon(null);
        remove(keyButton);
        keyFoundMessage.setText("KEY FOUND!");
        keyFoundMessage.setOpaque(true);
        
        try
        {
            //adding it to the keys found
            game.keyFound(3);
        } catch (SQLException ex)
        {
            Logger.getLogger(SeatCompartmentsScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(SeatCompartmentsScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_keyButtonActionPerformed

    private void letterButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_letterButtonActionPerformed
    {//GEN-HEADEREND:event_letterButtonActionPerformed
        letterButton.setIcon(null);
        remove(letterButton);
        um.getSelectedUser().setInvestigatedLetterTrue();
        um.updateCurrentArrayList();
        try
        {
            um.save(um.getSelectedUser().getUserID(), "Letter", 1);
        } catch (SQLException ex)
        {
            Logger.getLogger(SeatCompartmentsScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try
        {
            new DiaryScreen().setVisible(true);
        } catch (SQLException ex)
        {
            Logger.getLogger(SeatCompartmentsScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_letterButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton diaryButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton keyButton;
    private javax.swing.JLabel keyFoundMessage;
    private javax.swing.JButton letterButton;
    // End of variables declaration//GEN-END:variables
}
