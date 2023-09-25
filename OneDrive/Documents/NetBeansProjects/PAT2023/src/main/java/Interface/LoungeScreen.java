/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Backend.GameSwitchMethods;
import static Backend.GameSwitchMethods.*;
import Backend.Games;
import static Backend.SpeechMethods.getSpeechDB;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megan
 */
public class LoungeScreen extends javax.swing.JFrame
{
    Games game = new Games();
    
    /**
     * Creates new form LoungeScreen
     */
    public LoungeScreen()
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

        backButton = new javax.swing.JButton();
        diaryButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        fireIronButton = new javax.swing.JButton();
        knifeButton = new javax.swing.JButton();
        picButton = new javax.swing.JButton();
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

        fireIronButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\fireIron.png")); // NOI18N
        fireIronButton.setBorder(null);
        fireIronButton.setBorderPainted(false);
        fireIronButton.setContentAreaFilled(false);
        fireIronButton.setFocusPainted(false);
        getContentPane().add(fireIronButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, -30, 50, 430));

        knifeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\knife.png")); // NOI18N
        knifeButton.setBorder(null);
        knifeButton.setBorderPainted(false);
        knifeButton.setContentAreaFilled(false);
        knifeButton.setFocusPainted(false);
        getContentPane().add(knifeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, 70, 70));

        picButton.setOpaque(false);
        picButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                picButtonActionPerformed(evt);
            }
        });
        getContentPane().add(picButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 110, 90));

        keyButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\key.png")); // NOI18N
        keyButton.setBorder(null);
        keyButton.setContentAreaFilled(false);
        keyButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                keyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(keyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 500, 50, 40));

        keyFoundMessage.setBackground(new java.awt.Color(139, 118, 82));
        getContentPane().add(keyFoundMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 480, 100, 20));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\loungeBackground.jpeg")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -30, 1490, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        this.dispose();
        new HallwayScreen().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        this.dispose();
        new UserScreen().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void diaryButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_diaryButtonActionPerformed
    {//GEN-HEADEREND:event_diaryButtonActionPerformed
        try
        {
            new DiaryScreen().setVisible(true);
        } catch (SQLException ex)
        {
            Logger.getLogger(LoungeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_diaryButtonActionPerformed

    private void keyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_keyButtonActionPerformed
    {//GEN-HEADEREND:event_keyButtonActionPerformed
        //setting the message 
        remove(keyButton);
        keyFoundMessage.setText("KEY FOUND!");
        keyFoundMessage.setOpaque(true);
        
        try
        {
            //adding it to the keys found
            game.keyFound(2);
        } catch (SQLException ex)
        {
            Logger.getLogger(SeatCompartmentsScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(SeatCompartmentsScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_keyButtonActionPerformed

    private void picButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_picButtonActionPerformed
    {//GEN-HEADEREND:event_picButtonActionPerformed
        //set the variable for this game to true
        setMagicSquareSelected(true);
        //opens the next relative screen
        GameSwitchMethods gm = new GameSwitchMethods();
        try
        {
            gm.openGameScreen();
        } catch (IOException ex)
        {
            Logger.getLogger(LoungeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_picButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton diaryButton;
    private javax.swing.JButton fireIronButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton keyButton;
    private javax.swing.JLabel keyFoundMessage;
    private javax.swing.JButton knifeButton;
    private javax.swing.JButton picButton;
    // End of variables declaration//GEN-END:variables
}
