/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlk.view;


import java.awt.CardLayout;
import java.awt.Font;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import QLK.controller.TTPhieuNhapControl;
import QLK.controller.ThemPhieuNhapControl;
import QLK.model.ChiTietNhap;
import QLK.model.NhaCungCap;
import QLK.model.Nhap;

/**
 *
 * @author ADMIN
 */
public class TTPhieuNhap extends javax.swing.JPanel {

    /**
     * Creates new form PanelDatDichVu
     */
    TTPhieuNhapControl nc=new TTPhieuNhapControl(this);
    int ma;
    public TTPhieuNhap(int maPN) {
        ma=maPN;
        initComponents();
        table.setDefaultEditor(Object.class, null);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
        table.setModel(nc.getModelTable(maPN));
    }
    public void next(int key)
    {
        this.removeAll();
        this.setLayout(new CardLayout());
       JPanel themCT=new ThemCTPN(key);
        this.add(themCT);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnAdd1 = new javax.swing.JButton();
        btnAdd2 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Cập nhật phiếu nhập");

        table.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
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

        btnAdd1.setBackground(new java.awt.Color(255, 51, 51));
        btnAdd1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlk/img/baseline_clear_black_24dp.png"))); // NOI18N
        btnAdd1.setText("Xóa");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        btnAdd2.setBackground(new java.awt.Color(255, 51, 51));
        btnAdd2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlk/img/outline_reply_black_24dp.png"))); // NOI18N
        btnAdd2.setText("Quay lại");
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1413, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(533, 533, 533)
                .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

      public void reset()
    {
        this.removeAll();
        this.setLayout(new CardLayout());
       JPanel themCT=new TTPhieuNhap(ma);
        this.add(themCT);
        this.validate();
        this.repaint();
    }
    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
         try {
            int row = -1;
            int column = 0;
            row = table.getSelectedRow();
            String value = table.getModel().getValueAt(row, column).toString();
            String value1 = table.getModel().getValueAt(row, 4).toString();
            String value2 = table.getModel().getValueAt(row, 5).toString();
            String value3 = table.getModel().getValueAt(row, 1).toString();
            int k=JOptionPane.showConfirmDialog(null,"Bạn có muốn xóa ? ");
            if(k==0)
            {
                ChiTietNhap ctn=new ChiTietNhap();
                ctn.setMaCTNhap(Integer.parseInt(value));
                ctn.setSoLuong(Integer.parseInt(value1));
                ctn.setGiaNhap(Float.parseFloat(value2));
                ctn.setMaNhap(Integer.parseInt(value3));
                nc.delete(ctn);
            }
        } catch (Exception e) {
             System.out.println(e.toString());
            JOptionPane.showMessageDialog(null," Bạn phải chọn hàng trước !");
        }
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
       this.removeAll();
        this.setLayout(new CardLayout());
       JPanel themCT=new QuanLyNK();
        this.add(themCT);
        this.validate();
        this.repaint();
    }//GEN-LAST:event_btnAdd2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
