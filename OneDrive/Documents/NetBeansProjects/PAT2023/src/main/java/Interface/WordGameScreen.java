/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Backend.Games;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megan
 */
public class WordGameScreen extends javax.swing.JFrame
{
    Games game = new Games();
    /**
     * Creates new form WordGameScreen
     */
    public WordGameScreen()
    {
        initComponents();
        //setting full screen
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        //setting the required data
        crypticMessageTextArea.setText(game.getMessage());
        riddle1.setText(game.getRiddle1());
        riddle2.setText(game.getRiddle2());
        riddle3.setText(game.getRiddle3());
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

        diaryButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        infoButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        riddle1 = new javax.swing.JTextArea();
        riddle1TextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        crypticMessageTextArea = new javax.swing.JTextArea();
        riddle2TextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        riddle2 = new javax.swing.JTextArea();
        riddle3TextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        riddle3 = new javax.swing.JTextArea();
        answerButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(diaryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, -1, 70));

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
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 30, 90, 70));

        infoButton.setBackground(new java.awt.Color(15, 28, 33));
        infoButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        infoButton.setForeground(new java.awt.Color(139, 118, 82));
        infoButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\infoIcon.png")); // NOI18N
        infoButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        infoButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                infoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(infoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 110, -1, 60));

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
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 80, 50));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(139, 118, 82));
        jLabel3.setText("ANSWER HERE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 190, -1));

        riddle1.setEditable(false);
        riddle1.setBackground(new java.awt.Color(15, 28, 33));
        riddle1.setColumns(20);
        riddle1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        riddle1.setForeground(new java.awt.Color(234, 231, 231));
        riddle1.setLineWrap(true);
        riddle1.setRows(5);
        riddle1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        jScrollPane1.setViewportView(riddle1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 320, 230));

        riddle1TextField.setBackground(new java.awt.Color(15, 28, 33));
        riddle1TextField.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        riddle1TextField.setForeground(new java.awt.Color(234, 231, 231));
        riddle1TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        riddle1TextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                riddle1TextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(riddle1TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 630, 320, 50));

        crypticMessageTextArea.setEditable(false);
        crypticMessageTextArea.setBackground(new java.awt.Color(15, 28, 33));
        crypticMessageTextArea.setColumns(20);
        crypticMessageTextArea.setFont(new java.awt.Font("Perpetua Titling MT", 0, 36)); // NOI18N
        crypticMessageTextArea.setForeground(new java.awt.Color(234, 231, 231));
        crypticMessageTextArea.setLineWrap(true);
        crypticMessageTextArea.setRows(5);
        crypticMessageTextArea.setWrapStyleWord(true);
        crypticMessageTextArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        jScrollPane2.setViewportView(crypticMessageTextArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 1030, 230));

        riddle2TextField.setBackground(new java.awt.Color(15, 28, 33));
        riddle2TextField.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        riddle2TextField.setForeground(new java.awt.Color(234, 231, 231));
        riddle2TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        riddle2TextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                riddle2TextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(riddle2TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 630, 360, 50));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(139, 118, 82));
        jLabel4.setText("ANSWER HERE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 190, -1));

        riddle2.setEditable(false);
        riddle2.setBackground(new java.awt.Color(15, 28, 33));
        riddle2.setColumns(20);
        riddle2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        riddle2.setForeground(new java.awt.Color(234, 231, 231));
        riddle2.setLineWrap(true);
        riddle2.setRows(5);
        riddle2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        jScrollPane3.setViewportView(riddle2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 360, 230));

        riddle3TextField.setBackground(new java.awt.Color(15, 28, 33));
        riddle3TextField.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        riddle3TextField.setForeground(new java.awt.Color(234, 231, 231));
        riddle3TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        riddle3TextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                riddle3TextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(riddle3TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 630, 330, 50));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(139, 118, 82));
        jLabel5.setText("ANSWER HERE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 190, -1));

        riddle3.setEditable(false);
        riddle3.setBackground(new java.awt.Color(15, 28, 33));
        riddle3.setColumns(20);
        riddle3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        riddle3.setForeground(new java.awt.Color(234, 231, 231));
        riddle3.setLineWrap(true);
        riddle3.setRows(5);
        riddle3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        jScrollPane4.setViewportView(riddle3);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 330, 230));

        answerButton.setBackground(new java.awt.Color(15, 28, 33));
        answerButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        answerButton.setForeground(new java.awt.Color(139, 118, 82));
        answerButton.setText("ANSWER");
        answerButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        answerButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                answerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(answerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 610, 170, 70));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\redBackground.png")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -340, 1400, 1200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diaryButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_diaryButtonActionPerformed
    {//GEN-HEADEREND:event_diaryButtonActionPerformed
        try
        {
            new DiaryScreen().setVisible(true);
        } catch (SQLException ex)
        {
            Logger.getLogger(WordGameScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_diaryButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        this.dispose();
        new UserScreen().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_infoButtonActionPerformed
    {//GEN-HEADEREND:event_infoButtonActionPerformed
        new ObjectiveScreen().setVisible(true);
    }//GEN-LAST:event_infoButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        this.dispose();
        new DiningRoom().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void riddle1TextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_riddle1TextFieldActionPerformed
    {//GEN-HEADEREND:event_riddle1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_riddle1TextFieldActionPerformed

    private void riddle2TextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_riddle2TextFieldActionPerformed
    {//GEN-HEADEREND:event_riddle2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_riddle2TextFieldActionPerformed

    private void riddle3TextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_riddle3TextFieldActionPerformed
    {//GEN-HEADEREND:event_riddle3TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_riddle3TextFieldActionPerformed

    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_answerButtonActionPerformed
    {//GEN-HEADEREND:event_answerButtonActionPerformed
        //checks if all the answers are correct'
        //riddle 1
        if(game.checkRiddle1Ans(riddle1TextField.getText()))
        {
            riddle1TextField.setBackground(Color.green);
            crypticMessageTextArea.setText(game.getMessage());
        }
        else
        {
            riddle1TextField.setBackground(Color.red);
        }
        
        //riddle 2
        if(game.checkRiddle2Ans(riddle2TextField.getText()))
        {
            riddle2TextField.setBackground(Color.green);
            crypticMessageTextArea.setText(game.getMessage());
        }
        else
        {
            riddle2TextField.setBackground(Color.red);
        }
        
        //riddle 3
        if(game.checkRiddle3Ans(riddle3TextField.getText()))
        {
            riddle3TextField.setBackground(Color.green);
            crypticMessageTextArea.setText(game.getMessage());
        }
        else
        {
            riddle3TextField.setBackground(Color.red);
        }
        
        try
        {
            //checking if the whole game has been won
            game.wordGameWinCheck();
        } catch (SQLException ex)
        {
            Logger.getLogger(WordGameScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(WordGameScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_answerButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JTextArea crypticMessageTextArea;
    private javax.swing.JButton diaryButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton infoButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea riddle1;
    private javax.swing.JTextField riddle1TextField;
    private javax.swing.JTextArea riddle2;
    private javax.swing.JTextField riddle2TextField;
    private javax.swing.JTextArea riddle3;
    private javax.swing.JTextField riddle3TextField;
    // End of variables declaration//GEN-END:variables
}
