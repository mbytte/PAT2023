/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static Backend.GameSwitchMethods.resetOptionVariables;

/**
 *
 * @author megan
 */
public class HallwayScreen extends javax.swing.JFrame
{

    /**
     * Creates new form HallwayScreen
     */
    public HallwayScreen()
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        diningButton = new javax.swing.JButton();
        loungeButton = new javax.swing.JButton();
        seatingButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        walkingStickFoundMessage = new javax.swing.JLabel();
        walkingStickButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(15, 28, 33));
        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(139, 118, 82));
        jLabel3.setText("DINING");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 100, 40));

        jLabel4.setBackground(new java.awt.Color(15, 28, 33));
        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(139, 118, 82));
        jLabel4.setText("LOUNGE");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 100, 40));

        jLabel5.setBackground(new java.awt.Color(15, 28, 33));
        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(139, 118, 82));
        jLabel5.setText("SEATING");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 100, 40));

        diningButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\door - Copy.png")); // NOI18N
        diningButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                diningButtonActionPerformed(evt);
            }
        });
        getContentPane().add(diningButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 350, 640));

        loungeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\door - Copy.png")); // NOI18N
        loungeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loungeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loungeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, 350, 640));

        seatingButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\door - Copy.png")); // NOI18N
        seatingButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                seatingButtonActionPerformed(evt);
            }
        });
        getContentPane().add(seatingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 350, 640));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\plant.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 150, 320));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\plant.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 150, 320));

        walkingStickFoundMessage.setBackground(new java.awt.Color(139, 118, 82));
        getContentPane().add(walkingStickFoundMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 100, 20));

        walkingStickButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\walking_stick.png")); // NOI18N
        walkingStickButton.setBorder(null);
        walkingStickButton.setBorderPainted(false);
        walkingStickButton.setContentAreaFilled(false);
        walkingStickButton.setFocusPainted(false);
        walkingStickButton.setOpaque(false);
        walkingStickButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                walkingStickButtonActionPerformed(evt);
            }
        });
        getContentPane().add(walkingStickButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, 100, 320));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\woodPanel.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 1200, 770));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\woodPanel.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 650, 780));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\whiteBackground.jpg")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -30, 1490, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seatingButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_seatingButtonActionPerformed
    {//GEN-HEADEREND:event_seatingButtonActionPerformed
        this.dispose();
        new SeatCompartmentsScreen().setVisible(true);
    }//GEN-LAST:event_seatingButtonActionPerformed

    private void diningButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_diningButtonActionPerformed
    {//GEN-HEADEREND:event_diningButtonActionPerformed
        this.dispose();
        new DiningRoom().setVisible(true);
    }//GEN-LAST:event_diningButtonActionPerformed

    private void loungeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loungeButtonActionPerformed
    {//GEN-HEADEREND:event_loungeButtonActionPerformed
        this.dispose();
        new LoungeScreen().setVisible(true);
    }//GEN-LAST:event_loungeButtonActionPerformed

    private void walkingStickButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_walkingStickButtonActionPerformed
    {//GEN-HEADEREND:event_walkingStickButtonActionPerformed
        walkingStickButton.setIcon(null);
        remove(walkingStickButton);
        walkingStickFoundMessage.setText("CANE FOUND!");
        walkingStickFoundMessage.setOpaque(true);
    }//GEN-LAST:event_walkingStickButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton diningButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton loungeButton;
    private javax.swing.JButton seatingButton;
    private javax.swing.JButton walkingStickButton;
    private javax.swing.JLabel walkingStickFoundMessage;
    // End of variables declaration//GEN-END:variables
}
