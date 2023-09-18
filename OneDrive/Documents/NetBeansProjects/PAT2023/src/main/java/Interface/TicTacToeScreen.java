/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author megan
 */
public class TicTacToeScreen extends javax.swing.JFrame
{

    /**
     * Creates new form TicTacToeScreen
     */
    public TicTacToeScreen()
    {
        initComponents();
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
        wrongLettersTextArea = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        diaryButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        infoButton = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wrongLettersTextArea.setEditable(false);
        wrongLettersTextArea.setBackground(new java.awt.Color(15, 28, 33));
        wrongLettersTextArea.setColumns(20);
        wrongLettersTextArea.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        wrongLettersTextArea.setForeground(new java.awt.Color(139, 118, 82));
        wrongLettersTextArea.setLineWrap(true);
        wrongLettersTextArea.setRows(5);
        wrongLettersTextArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        jScrollPane1.setViewportView(wrongLettersTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 210, 430));

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

        button2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        button2.setBorder(null);
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 120, 120));

        button3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        button3.setBorder(null);
        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 120, 120));

        button4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        button4.setBorder(null);
        getContentPane().add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 120, 120));

        button5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        button5.setBorder(null);
        getContentPane().add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 120, 120));

        button6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        button6.setBorder(null);
        getContentPane().add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 120, 120));

        button7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        button7.setBorder(null);
        getContentPane().add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 120, 120));

        button8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        button8.setBorder(null);
        getContentPane().add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 120, 120));

        jButton8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jButton8.setBorder(null);
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 120, 120));

        button1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        button1.setBorder(null);
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 120, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\ticTacToeGrid.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 430, 430));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(139, 118, 82));
        jLabel2.setText("STATISTICS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\redBackground.png")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -330, 1400, 1200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void diaryButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_diaryButtonActionPerformed
    {//GEN-HEADEREND:event_diaryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaryButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_infoButtonActionPerformed
    {//GEN-HEADEREND:event_infoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoButtonActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton diaryButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton infoButton;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea wrongLettersTextArea;
    // End of variables declaration//GEN-END:variables
}
