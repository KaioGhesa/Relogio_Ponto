/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import javax.swing.JOptionPane;

/**
 *
 * @author Meu Computador
 */
public class punch_the_clock extends javax.swing.JFrame {

    /**
     * Creates new form punch_the_clock
     */
    public punch_the_clock() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        Login = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        BtEnter = new javax.swing.JButton();
        BtExit = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relogio de Ponto");
        setMinimumSize(new java.awt.Dimension(700, 390));
        getContentPane().setLayout(null);

        jLabel1.setText("CPF");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 130, 24, 16);

        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(390, 150, 160, 30);

        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 190, 36, 16);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(390, 220, 160, 22);

        BtEnter.setText("Enter");
        BtEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEnterActionPerformed(evt);
            }
        });
        getContentPane().add(BtEnter);
        BtEnter.setBounds(390, 270, 69, 33);

        BtExit.setText("Exit");
        BtExit.setMaximumSize(new java.awt.Dimension(41, 24));
        BtExit.setMinimumSize(new java.awt.Dimension(41, 24));
        BtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExitActionPerformed(evt);
            }
        });
        getContentPane().add(BtExit);
        BtExit.setBounds(490, 270, 80, 30);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images1458667175-removebg-preview.png"))); // NOI18N
        getContentPane().add(img);
        img.setBounds(50, 90, 310, 320);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("                    Relogio de Ponto");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 40, 240, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void BtEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEnterActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Voce bateu o ponto, tenha um ótimo dia");
    }//GEN-LAST:event_BtEnterActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void BtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Voce esta saindo, tenha bom descanso!");
    }//GEN-LAST:event_BtExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(punch_the_clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(punch_the_clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(punch_the_clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(punch_the_clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new punch_the_clock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtEnter;
    private javax.swing.JButton BtExit;
    private javax.swing.JFormattedTextField Login;
    private javax.swing.JLabel img;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
