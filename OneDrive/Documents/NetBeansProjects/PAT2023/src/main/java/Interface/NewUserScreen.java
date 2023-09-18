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
public class NewUserScreen extends javax.swing.JFrame
{

    /**
     * Creates new form NewUserScreen
     */
    public NewUserScreen()
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

        title = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        usernameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        createUserButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\title.png")); // NOI18N
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 560, -1));

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
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, 50));

        usernameTextField.setBackground(new java.awt.Color(15, 28, 33));
        usernameTextField.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(139, 118, 82));
        usernameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        getContentPane().add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 520, 80));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(139, 118, 82));
        jLabel1.setText("USERNAME:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 160, 70));

        createUserButton.setBackground(new java.awt.Color(15, 28, 33));
        createUserButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        createUserButton.setForeground(new java.awt.Color(139, 118, 82));
        createUserButton.setText("CREATE USER");
        createUserButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        createUserButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                createUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(createUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 480, 170, 50));

        background.setBackground(new java.awt.Color(15, 28, 33));
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\trainTicket.png")); // NOI18N
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 28, 33), 10, true));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_createUserButtonActionPerformed
    {//GEN-HEADEREND:event_createUserButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createUserButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton createUserButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel title;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
