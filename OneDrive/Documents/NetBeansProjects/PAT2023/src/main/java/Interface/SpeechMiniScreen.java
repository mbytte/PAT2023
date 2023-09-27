/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Backend.GameSwitchMethods;
import Backend.SpeechMethods;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megan
 */
public class SpeechMiniScreen extends javax.swing.JFrame
{

    /**
     * Creates new form SpeechMiniScreen
     */
    public SpeechMiniScreen() throws IOException
    {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //setting all the components to the info they need to be
        SpeechMethods sm = new SpeechMethods();
        infoTextArea.setText(sm.getSpeech());
        characterPic.setIcon(sm.getCharacterPic());
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        characterPic = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1, 1));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoTextArea.setEditable(false);
        infoTextArea.setBackground(new java.awt.Color(15, 28, 33));
        infoTextArea.setColumns(20);
        infoTextArea.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        infoTextArea.setForeground(new java.awt.Color(234, 232, 231));
        infoTextArea.setLineWrap(true);
        infoTextArea.setRows(5);
        infoTextArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        jScrollPane1.setViewportView(infoTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 900, 120));

        characterPic.setBackground(new java.awt.Color(139, 118, 82));
        characterPic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        characterPic.setOpaque(true);
        getContentPane().add(characterPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, 150, 170));

        nextButton.setBackground(new java.awt.Color(15, 28, 33));
        nextButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        nextButton.setForeground(new java.awt.Color(139, 118, 82));
        nextButton.setText("NEXT");
        nextButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        nextButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 110, 40));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\redBackground.png")); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1110, 580));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nextButtonActionPerformed
    {//GEN-HEADEREND:event_nextButtonActionPerformed
        GameSwitchMethods gm = new GameSwitchMethods(); 
        //closing the screens that are open
        gm.closeScreens();

        //opens the next relative screen
        try
        {
            //game is started and therefore being opened
            if(gm.isIsGameBeingOpened())
            {
                new ObjectiveScreen().setVisible(true);
                gm.openGameScreen();
            }
            //game has ended and therefore the next screen opened is the dining room
            else
            {
                new DiningRoom().setVisible(true);
            }
            
            
        } catch (IOException ex)
        {
            Logger.getLogger(SpeechMiniScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(SpeechMiniScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel characterPic;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
