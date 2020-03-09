/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opmanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
public class BookDoctorPage extends javax.swing.JFrame {

    Connection conn;
    ResultSet res;
    PreparedStatement pst;
    public BookDoctorPage(String bid,String bname) {
        initComponents();
        pdoctorid.setText(bid);
       pdoctorname.setText(bname);
       conn = DataBase.DBconnect();
    }

    private BookDoctorPage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pdesease = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        page = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        paddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pphone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pdoctorname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pdoctorid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pexit = new javax.swing.JButton();
        pbook1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));

        jLabel1.setFont(new java.awt.Font("Oswald", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOOK DOCTOR");

        pname.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel3.setText("Patient Name");

        pdesease.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        pdesease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdeseaseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel4.setText("Doctor ID");

        page.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel5.setText("Patient Age");

        paddress.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        paddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paddressActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel6.setText("Patient Address");

        pphone.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        pphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pphoneActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel7.setText("Phone");

        pdoctorname.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        pdoctorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdoctornameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel8.setText("Doctor Name");

        pdoctorid.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        pdoctorid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdoctoridActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel9.setText("Place");

        pexit.setBackground(new java.awt.Color(255, 51, 51));
        pexit.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-logout-rounded-left-24.png"))); // NOI18N
        pexit.setText("Close");
        pexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pexitActionPerformed(evt);
            }
        });

        pbook1.setBackground(new java.awt.Color(0, 107, 179));
        pbook1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pbook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-ticket-24.png"))); // NOI18N
        pbook1.setText("Book");
        pbook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbook1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(pdoctorid, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(pdoctorname, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pphone, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(paddress, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(pdesease, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pbook1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(pexit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addComponent(paddress, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pphone, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(9, 9, 9)
                .addComponent(pdoctorname, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pdoctorid, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pdesease, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pexit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbook1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pageActionPerformed

    private void paddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paddressActionPerformed

    private void pphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pphoneActionPerformed

    private void pdoctornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdoctornameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pdoctornameActionPerformed

    private void pdoctoridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdoctoridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pdoctoridActionPerformed

    private void pexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_pexitActionPerformed

    private void pbook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbook1ActionPerformed
        String name = pname.getText();
        String age = page.getText();
        String address = paddress.getText();
        String phone = pphone.getText();
        String doctor = pdoctorname.getText();
        String doctorid = pdoctorid.getText();
        String place = pdesease.getText();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now(); 
        String strDate = dtf.format(now); 
        String sql = "INSERT INTO patients(name,age,viewdate,address,phone,doctorname,doctorid,place) VALUES(?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, age);
            pst.setString(3, strDate);
            pst.setString(4, address);
            pst.setString(5, phone);
            pst.setString(6, doctor);
            pst.setString(7, doctorid);
            pst.setString(8,place);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Booking Successfull");
            pname.setText("");
            page.setText("");
            paddress.setText("");
            pphone.setText("");
            pdesease.setText("");
            pdoctorname.setText("");
            pdoctorid.setText("");
            pname.requestFocus();
            this.setVisible(false);
        } catch(Exception ex)
        {
            System.out.println("Something Went Wrong !" + ex);
        }
    }//GEN-LAST:event_pbook1ActionPerformed

    private void pdeseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdeseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pdeseaseActionPerformed

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
            java.util.logging.Logger.getLogger(BookDoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookDoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookDoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookDoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookDoctorPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField paddress;
    private javax.swing.JTextField page;
    private javax.swing.JButton pbook1;
    private javax.swing.JTextField pdesease;
    private javax.swing.JTextField pdoctorid;
    private javax.swing.JTextField pdoctorname;
    private javax.swing.JButton pexit;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pphone;
    // End of variables declaration//GEN-END:variables
}
