/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opmanagementsystem;

import java.awt.Color;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author prave
 */
public class DoctorDashBordPage extends javax.swing.JFrame {

    Connection conn;
    ResultSet res;
    PreparedStatement pst;
    int newid;
    public DoctorDashBordPage(int id) {
        initComponents();
        conn = DataBase.DBconnect();
        patienttable.getTableHeader().setBackground(new Color(32,136,203));
        patienttable.getTableHeader().setForeground(Color.WHITE);
        patienttable.setSelectionForeground(Color.WHITE);
        patienttable.setSelectionBackground(Color.RED);
        newid = id;
        drefresh2.doClick();
    }

    private DoctorDashBordPage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        phistory = new javax.swing.JButton();
        dprescription = new javax.swing.JButton();
        pexit = new javax.swing.JButton();
        drefresh2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patienttable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—doctors medical hospital doctors_3811025.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        phistory.setBackground(new java.awt.Color(0, 107, 179));
        phistory.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        phistory.setForeground(new java.awt.Color(255, 255, 255));
        phistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-activity-history-24.png"))); // NOI18N
        phistory.setText("Patient History");
        phistory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        phistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phistoryActionPerformed(evt);
            }
        });

        dprescription.setBackground(new java.awt.Color(0, 107, 179));
        dprescription.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        dprescription.setForeground(new java.awt.Color(255, 255, 255));
        dprescription.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-plus-24.png"))); // NOI18N
        dprescription.setText("Prescription");
        dprescription.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dprescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dprescriptionActionPerformed(evt);
            }
        });

        pexit.setBackground(new java.awt.Color(0, 107, 179));
        pexit.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        pexit.setForeground(new java.awt.Color(255, 255, 255));
        pexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-logout-rounded-left-30.png"))); // NOI18N
        pexit.setText("    Exit");
        pexit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pexitActionPerformed(evt);
            }
        });

        drefresh2.setBackground(new java.awt.Color(0, 107, 179));
        drefresh2.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        drefresh2.setForeground(new java.awt.Color(255, 255, 255));
        drefresh2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-refresh-24.png"))); // NOI18N
        drefresh2.setText("   Refresh");
        drefresh2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        drefresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drefresh2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drefresh2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pexit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phistory, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dprescription, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(drefresh2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(dprescription, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(phistory, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(pexit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(110, 89, 222));

        jLabel2.setFont(new java.awt.Font("Oswald", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctor Dashboard");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(296, 296, 296))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        patienttable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        patienttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "AGE", "VIEW DATE", "ADDRESS", "PHONE", "DESEASE"
            }
        ));
        patienttable.setFocusable(false);
        patienttable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        patienttable.setRowHeight(50);
        jScrollPane1.setViewportView(patienttable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void phistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phistoryActionPerformed

    }//GEN-LAST:event_phistoryActionPerformed

    private void dprescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dprescriptionActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) patienttable.getModel();
        int row = patienttable.getSelectedRow();
        String id = tableModel.getValueAt(row, 0).toString();
        String name = tableModel.getValueAt(row, 1).toString();
        String age = tableModel.getValueAt(row, 2).toString();
        String date = tableModel.getValueAt(row,3).toString();
        String desease = tableModel.getValueAt(row,6).toString();
        PriscriptionPage pric = new PriscriptionPage(id,name,age,date,desease);
        pric.setVisible(true);
    }//GEN-LAST:event_dprescriptionActionPerformed

    private void pexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_pexitActionPerformed

    private void drefresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drefresh2ActionPerformed
      DefaultTableModel tableModel = (DefaultTableModel) patienttable.getModel();
      String sql = "SELECT * FROM patients WHERE doctorid=? AND done is null";
      try {
          pst = conn.prepareStatement(sql);
          pst.setInt(1, newid);
          res = pst.executeQuery();
          while(res.next())
          {
              int id = res.getInt("id");
              String nid = id+"";
              String name = res.getString("name");
              int age = res.getInt("age");
              String newage = age+"";
              String date = res.getString("viewdate");
              String addr = res.getString("address");
              int phone = res.getInt("phone");
              String newphone = phone+"";
              String desease = res.getString("desease");
              tableModel.addRow(new Object [] {id,name,newage,date,addr,newphone,desease});
          }
         
      } catch(Exception ex)
      {
          System.out.println("Something Went Wrong !" +ex);
      }
    }//GEN-LAST:event_drefresh2ActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorDashBordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDashBordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDashBordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDashBordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDashBordPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dprescription;
    private javax.swing.JButton drefresh2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patienttable;
    private javax.swing.JButton pexit;
    private javax.swing.JButton phistory;
    // End of variables declaration//GEN-END:variables
}
