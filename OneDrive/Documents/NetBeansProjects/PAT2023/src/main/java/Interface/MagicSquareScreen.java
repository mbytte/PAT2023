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
public class MagicSquareScreen extends javax.swing.JFrame
{

    /**
     * Creates new form MagicSquareScreen
     */
    public MagicSquareScreen()
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

        backButton = new javax.swing.JButton();
        diaryButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        infoButton = new javax.swing.JButton();
        comboBox1 = new javax.swing.JComboBox<>();
        comboBox3 = new javax.swing.JComboBox<>();
        comboBox4 = new javax.swing.JComboBox<>();
        comboBox5 = new javax.swing.JComboBox<>();
        comboBox9 = new javax.swing.JComboBox<>();
        comboBox13 = new javax.swing.JComboBox<>();
        comboBox6 = new javax.swing.JComboBox<>();
        comboBox10 = new javax.swing.JComboBox<>();
        comboBox14 = new javax.swing.JComboBox<>();
        comboBox7 = new javax.swing.JComboBox<>();
        comboBox11 = new javax.swing.JComboBox<>();
        comboBox8 = new javax.swing.JComboBox<>();
        comboBox12 = new javax.swing.JComboBox<>();
        comboBox15 = new javax.swing.JComboBox<>();
        comboBox16 = new javax.swing.JComboBox<>();
        comboBox2 = new javax.swing.JComboBox<>();
        answerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 90, 90));

        comboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 90, 90));

        comboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 90, 90));

        comboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 90, 90));

        comboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 90, 90));

        comboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 90, 90));

        comboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 90, 90));

        comboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 90, 90));

        comboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 90, 90));

        comboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 90, 90));

        comboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 90, 90));

        comboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 90, 90));

        comboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 90, 90));

        comboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 90, 90));

        comboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, 90, 90));

        comboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 90, 90));

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
        getContentPane().add(answerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 570, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\magicSquareGrid.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 430, 430));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\tommyAstridPic.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, 470));

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

    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_answerButtonActionPerformed
    {//GEN-HEADEREND:event_answerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JComboBox<String> comboBox10;
    private javax.swing.JComboBox<String> comboBox11;
    private javax.swing.JComboBox<String> comboBox12;
    private javax.swing.JComboBox<String> comboBox13;
    private javax.swing.JComboBox<String> comboBox14;
    private javax.swing.JComboBox<String> comboBox15;
    private javax.swing.JComboBox<String> comboBox16;
    private javax.swing.JComboBox<String> comboBox2;
    private javax.swing.JComboBox<String> comboBox3;
    private javax.swing.JComboBox<String> comboBox4;
    private javax.swing.JComboBox<String> comboBox5;
    private javax.swing.JComboBox<String> comboBox6;
    private javax.swing.JComboBox<String> comboBox7;
    private javax.swing.JComboBox<String> comboBox8;
    private javax.swing.JComboBox<String> comboBox9;
    private javax.swing.JButton diaryButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton infoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
