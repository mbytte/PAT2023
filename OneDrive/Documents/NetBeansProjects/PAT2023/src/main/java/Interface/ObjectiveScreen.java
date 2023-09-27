/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Backend.GameSwitchMethods;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megan
 */
public class ObjectiveScreen extends javax.swing.JFrame
{

    GameSwitchMethods gm = new GameSwitchMethods();
    /**
     * Creates new form ObjectiveScreen
     */
    public ObjectiveScreen() throws SQLException
    {
        initComponents();
        
        //setting it to be in the centre of the screen
        setLocationRelativeTo (null);  
        
        //resetting all the game variables to be false
        infoTextArea.setText(gm.getData("HowToPlay"));
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
        homeButton = new javax.swing.JButton();
        hintButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoTextArea.setEditable(false);
        infoTextArea.setBackground(new java.awt.Color(15, 28, 33));
        infoTextArea.setColumns(20);
        infoTextArea.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        infoTextArea.setForeground(new java.awt.Color(234, 232, 231));
        infoTextArea.setLineWrap(true);
        infoTextArea.setRows(5);
        infoTextArea.setWrapStyleWord(true);
        infoTextArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        jScrollPane1.setViewportView(infoTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 850, 330));

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
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 110, 40));

        hintButton.setBackground(new java.awt.Color(15, 28, 33));
        hintButton.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        hintButton.setForeground(new java.awt.Color(139, 118, 82));
        hintButton.setText("HINT");
        hintButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        hintButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                hintButtonActionPerformed(evt);
            }
        });
        getContentPane().add(hintButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 90, 40));

        closeButton.setBackground(new java.awt.Color(15, 28, 33));
        closeButton.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        closeButton.setForeground(new java.awt.Color(139, 118, 82));
        closeButton.setText("X");
        closeButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        closeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 40, 50, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redBackground.png"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1110, 580));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        //closing all the screens because they will not longer be needed
        GameSwitchMethods gm = new GameSwitchMethods();
        gm.closeScreens();
        
        new UserScreen().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void hintButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_hintButtonActionPerformed
    {//GEN-HEADEREND:event_hintButtonActionPerformed
        try
        {
            //resetting all the game variables to be false
            infoTextArea.setText(gm.getData("Help"));
        } catch (SQLException ex)
        {
            Logger.getLogger(ObjectiveScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hintButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_closeButtonActionPerformed
    {//GEN-HEADEREND:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton hintButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
