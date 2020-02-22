/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opmanagementsystem;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import java.sql.*;
public class PharmasistDashbordPage extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;
    ResultSet res;
    public PharmasistDashbordPage() {
        initComponents();
        conn = DataBase.DBconnect();
        prefresh.doClick();
        pharmasisttable.getTableHeader().setBackground(new Color(32,136,203));
        pharmasisttable.getTableHeader().setForeground(Color.WHITE);
        pharmasisttable.setSelectionForeground(Color.WHITE);
        pharmasisttable.setSelectionBackground(Color.RED);
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
        prefresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pharmasisttable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—colorful pharmacy and medicine icon_5007377.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        phistory.setBackground(new java.awt.Color(0, 107, 179));
        phistory.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        phistory.setForeground(new java.awt.Color(255, 255, 255));
        phistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-medical-bag-26.png"))); // NOI18N
        phistory.setText("Add Stock");
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
        dprescription.setText("Add Drug");
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

        prefresh.setBackground(new java.awt.Color(0, 107, 179));
        prefresh.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        prefresh.setForeground(new java.awt.Color(255, 255, 255));
        prefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-refresh-24.png"))); // NOI18N
        prefresh.setText("   Refresh");
        prefresh.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        prefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pexit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phistory, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dprescription, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(dprescription, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(phistory, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(pexit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 830));

        jPanel3.setBackground(new java.awt.Color(110, 89, 222));

        jLabel2.setFont(new java.awt.Font("Oswald", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pharmasist Dashboard");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(246, 246, 246))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 106, 1040, -1));

        pharmasisttable.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        pharmasisttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRIC_ID", "NAME", "VIEWDATE", "DESEASE", "AGE", "PRISCRIPTION", "P_ID"
            }
        ));
        pharmasisttable.setFocusable(false);
        pharmasisttable.setRowHeight(50);
        pharmasisttable.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(pharmasisttable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 960, 560));

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
        DefaultTableModel tableModel = (DefaultTableModel) pharmasisttable.getModel();
        int row = pharmasisttable.getSelectedRow();
        String id = tableModel.getValueAt(row, 6).toString();
        String name = tableModel.getValueAt(row, 1).toString();
        AddDrugPage drug = new AddDrugPage(id,name);
        drug.setVisible(true);
    }//GEN-LAST:event_dprescriptionActionPerformed

    private void pexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_pexitActionPerformed

    private void prefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefreshActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) pharmasisttable.getModel();
        String sql = "SELECT * FROM priscription WHERE done is null";
        try {
            pst = conn.prepareStatement(sql);
            res = pst.executeQuery();
            tableModel.setRowCount(0);
            while(res.next())
            {
                int id = res.getInt("pric_id");
                String newid = id + "";
                String name = res.getString("name");
                String date = res.getString("viewdate");
                String desease = res.getString("desease");
                int age = res.getShort("age");
                String newage = age + "";
                String priscription = res.getString("priscription");
                int patient = res.getInt("p_id");
                String patientId = patient + "";
                tableModel.addRow(new Object [] {newid,name,date,desease,newage,priscription,patientId});
                
            }
        } catch(Exception ex) {
            System.out.println("Something Went Wrong !" + ex);
        }
    }//GEN-LAST:event_prefreshActionPerformed

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
            java.util.logging.Logger.getLogger(PharmasistDashbordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PharmasistDashbordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PharmasistDashbordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PharmasistDashbordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PharmasistDashbordPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dprescription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pexit;
    private javax.swing.JTable pharmasisttable;
    private javax.swing.JButton phistory;
    private javax.swing.JButton prefresh;
    // End of variables declaration//GEN-END:variables
}
