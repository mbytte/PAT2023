/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Backend.Games;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megan
 */
public class RiddleScreen extends javax.swing.JFrame
{
    Games game = new Games();
    
    /**
     * Creates new form RiddleScreen
     */
    public RiddleScreen()
    {
        initComponents();
        //setting full screen
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        if(!game.isRiddleChosen())
        {
            //setting the riddle into the text
            game.selectRiddle();
        }
        
        //inserting the riddle onto the screen
        riddleTextArea.setText(game.getRiddle());
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
        answerButton = new javax.swing.JButton();
        infoButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        answerTextField = new javax.swing.JTextField();
        homeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        riddleTextArea = new javax.swing.JTextArea();
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
        getContentPane().add(answerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 580, 110, 70));

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
        getContentPane().add(infoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 110, 70, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\emileBeaufoyCloseUpBig.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 500, 410));

        answerTextField.setBackground(new java.awt.Color(15, 28, 33));
        answerTextField.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        answerTextField.setForeground(new java.awt.Color(139, 118, 82));
        answerTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        answerTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                answerTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(answerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 520, 80));

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

        riddleTextArea.setEditable(false);
        riddleTextArea.setBackground(new java.awt.Color(15, 28, 33));
        riddleTextArea.setColumns(20);
        riddleTextArea.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        riddleTextArea.setForeground(new java.awt.Color(139, 118, 82));
        riddleTextArea.setLineWrap(true);
        riddleTextArea.setRows(5);
        riddleTextArea.setWrapStyleWord(true);
        riddleTextArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        jScrollPane1.setViewportView(riddleTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 520, 280));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\redBackground.png")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -330, 1400, 1200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        this.dispose();
        new DiningRoom().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void diaryButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_diaryButtonActionPerformed
    {//GEN-HEADEREND:event_diaryButtonActionPerformed
        try
        {
            new DiaryScreen().setVisible(true);
        } catch (SQLException ex)
        {
            Logger.getLogger(RiddleScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_diaryButtonActionPerformed

    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_answerButtonActionPerformed
    {//GEN-HEADEREND:event_answerButtonActionPerformed
        try
        {
            game.inputCheck(answerTextField.getText());
        } catch (SQLException ex)
        {
            Logger.getLogger(RiddleScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(RiddleScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_answerButtonActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_infoButtonActionPerformed
    {//GEN-HEADEREND:event_infoButtonActionPerformed
        new ObjectiveScreen().setVisible(true);
    }//GEN-LAST:event_infoButtonActionPerformed

    private void answerTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_answerTextFieldActionPerformed
    {//GEN-HEADEREND:event_answerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerTextFieldActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        this.dispose();
        new UserScreen().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerButton;
    private javax.swing.JTextField answerTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton diaryButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton infoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea riddleTextArea;
    // End of variables declaration//GEN-END:variables
}
