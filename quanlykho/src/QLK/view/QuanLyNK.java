/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.view;

import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import QLK.controller.NhapKhoControl;

/**
 *
 * @author ADMIN
 */
public class QuanLyNK extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyNK
     */
    NhapKhoControl nkc;
    String maNV="NV01";
    
    public QuanLyNK() {
        
        initComponents();
        nkc=new NhapKhoControl(this);
        table.setDefaultEditor(Object.class, null);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
        table.setModel(nkc.getModelTable(maNV));
        
    }
   
     public void reset()
     {
        this.removeAll();
        this.setLayout(new CardLayout());
        this.add(new QuanLyNK());
        this.validate();
        this.repaint();
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnChiTiet = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnSearch1 = new javax.swing.JButton();
        btnSearch2 = new javax.swing.JButton();
        btnSearch3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlk/img/baseline_clear_black_24dp.png"))); // NOI18N
        jButton4.setText("Xóa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("Chức năng");

        btnChiTiet.setBackground(new java.awt.Color(255, 255, 51));
        btnChiTiet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnChiTiet.setForeground(new java.awt.Color(51, 51, 51));
        btnChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlk/img/baseline_update_black_24dp.png"))); // NOI18N
        btnChiTiet.setText("Cập nhật");
        btnChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSearch.setBackground(new java.awt.Color(51, 102, 255));
        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlk/img/icons8-sorting-24.png"))); // NOI18N
        btnSearch.setText("Trạng thái");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Sắp xếp");

        btnRefresh.setBackground(new java.awt.Color(51, 255, 51));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlk/img/baseline_refresh_black_24dp.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnSearch1.setBackground(new java.awt.Color(51, 102, 255));
        btnSearch1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlk/img/icons8-sorting-24.png"))); // NOI18N
        btnSearch1.setText("Nhà cung cấp");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        btnSearch2.setBackground(new java.awt.Color(51, 102, 255));
        btnSearch2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlk/img/icons8-sorting-24.png"))); // NOI18N
        btnSearch2.setText("Thành tiền");
        btnSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch2ActionPerformed(evt);
            }
        });

        btnSearch3.setBackground(new java.awt.Color(51, 102, 255));
        btnSearch3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlk/img/icons8-sorting-24.png"))); // NOI18N
        btnSearch3.setText("Thời gian");
        btnSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );

        table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            int row = -1;
            int column = 0;
            row = table.getSelectedRow();
            String value = table.getModel().getValueAt(row, column).toString();
            int k=JOptionPane.showConfirmDialog(null,"Bạn có muốn xóa?");
            if(k==0)
            {
                nkc.delete(Integer.parseInt(value));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null," Bạn phải chọn hàng trước !");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed

        try {
            int row = -1;
            int column = 0;
            row = table.getSelectedRow();
            int value = Integer.parseInt(table.getModel().getValueAt(row, column).toString());
         this.removeAll();
         this.setLayout(new CardLayout());
         this.add(new TTPhieuNhap(value));
         this.validate();
         this.repaint();  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null," Bạn phải chọn hàng trước !");
        }

    }//GEN-LAST:event_btnChiTietActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
              table.setModel(nkc.getModelBy(4,maNV));
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        table.setModel(nkc.getModelTable(maNV));
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        table.setModel(nkc.getModelBy(1, maNV));
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void btnSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch2ActionPerformed
        table.setModel(nkc.getModelBy(3, maNV));
    }//GEN-LAST:event_btnSearch2ActionPerformed

    private void btnSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch3ActionPerformed
        table.setModel(nkc.getModelBy(2, maNV));
    }//GEN-LAST:event_btnSearch3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnSearch2;
    private javax.swing.JButton btnSearch3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
