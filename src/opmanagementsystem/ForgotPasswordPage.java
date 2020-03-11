/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opmanagementsystem;

import java.sql.*;
public class ForgotPasswordPage extends javax.swing.JFrame {

    Connection conn;
    ResultSet res;
    PreparedStatement pst;
    public ForgotPasswordPage() {
        initComponents();
        conn = DataBase.DBconnect();
        loadList();
    }

    public void loadList(){
        String sql = "SELECT DISTINCT security FROM user";
        try{
            pst = conn.prepareStatement(sql);
            res = pst.executeQuery();
            while(res.next())
            {
                String qes = res.getString("security");
                question.addItem(qes);
            }
        }catch(Exception ex){
            System.out.println("Something Went Wrong !" + ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        question = new javax.swing.JComboBox();
        answer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Oswald", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password Recovery");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        question.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        question.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pick Question ?" }));
        question.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionActionPerformed(evt);
            }
        });
        jPanel1.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 408, 40));

        answer.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jPanel1.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 408, 40));

        jLabel3.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Your Answer ?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        jLabel4.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pick Your Question ?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        enter.setBackground(new java.awt.Color(51, 153, 0));
        enter.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        enter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-login-rounded-24.png"))); // NOI18N
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        jPanel1.add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 650, 117, 53));

        exit1.setBackground(new java.awt.Color(255, 51, 51));
        exit1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-logout-rounded-left-24.png"))); // NOI18N
        exit1.setText("Exit");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        jPanel1.add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, 117, 53));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—lock vector icon_3730780.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 333, 310));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pina-messina-iIDiRMITYik-unsplash.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        String qq = question.getSelectedItem().toString();
        String ans = answer.getText();
        try{
            String sql = "SELECT * FROM user WHERE security=? and answer=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, qq);
            pst.setString(2, ans);
            res = pst.executeQuery();
            if(res.next())
            {
                int id = res.getInt("id");
                SetPasswordPage set = new SetPasswordPage(id);
                set.setVisible(true);
            }
            else{
                System.out.println("You Jammed");
            }
        }catch(Exception ex){
            System.out.println("Something Went Wrong !" + ex);
        }
    }//GEN-LAST:event_enterActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exit1ActionPerformed

    private void questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionActionPerformed
        
    }//GEN-LAST:event_questionActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPasswordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JButton enter;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox question;
    // End of variables declaration//GEN-END:variables
}
