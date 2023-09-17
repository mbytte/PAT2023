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
public class SpeechMiniScreen extends javax.swing.JFrame
{

    /**
     * Creates new form SpeechMiniScreen
     */
    public SpeechMiniScreen()
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
        infoTextArea = new javax.swing.JTextArea();
        characterPic = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoTextArea.setEditable(false);
        infoTextArea.setBackground(new java.awt.Color(15, 28, 33));
        infoTextArea.setColumns(20);
        infoTextArea.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        infoTextArea.setForeground(new java.awt.Color(139, 118, 82));
        infoTextArea.setLineWrap(true);
        infoTextArea.setRows(5);
        infoTextArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        jScrollPane1.setViewportView(infoTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 900, -1));

        characterPic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        getContentPane().add(characterPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, 150, 170));

        nextButton.setBackground(new java.awt.Color(15, 28, 33));
        nextButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        nextButton.setForeground(new java.awt.Color(139, 118, 82));
        nextButton.setText("NEXT");
        nextButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 118, 82), 5, true));
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 110, 40));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\megan\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\resources\\redBackground.png")); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1110, 580));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel characterPic;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
