/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.view;

import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import QLK.model.SanPham;
import QLK.controller.SanPhamController;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
/**
 *
 * @author Pham Thang <Thangyb2706@gmail.com>
 */
public class SanPhamView extends javax.swing.JFrame {
    public String state;
    DefaultTableModel defaultTableModel;
    SanPhamController sanPhamController=new SanPhamController();
    List<SanPham> listSpCurrent=new ArrayList<>();
    String idInsert="";
    /**
     * Creates new form SanPham
     */
    public SanPhamView() {
        initComponents();
        setColorButton();
        loadJTable();
        state="reset";
        setTextChange();
        loadbtn(state);
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtMoTaSP = new javax.swing.JTextArea();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(99, 184, 255));

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");

        jPanel5.setBackground(new java.awt.Color(99, 184, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("MÃ SẢN PHẨM:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TÊN SẢN PHẨM:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("MÔ TẢ SẢN PHẨM:");

        txtMoTaSP.setColumns(20);
        txtMoTaSP.setRows(5);
        jScrollPane6.setViewportView(txtMoTaSP);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMaSP)
                        .addComponent(jLabel16)
                        .addComponent(txtTenSP)
                        .addComponent(jLabel17)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15))
                .addGap(21, 21, 21))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLuu.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnLamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TÌM KIẾM:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(549, 549, 549)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
         state="insert";
         for (SanPham sanPham : listSpCurrent) {
                    if(listSpCurrent.size()==0)
                     idInsert="sp001";
                    else
                     idInsert=sanPham.getMaSanPham();
      
                }
                int chuoi2 = Integer.parseInt(idInsert.substring(4)); 
                if (chuoi2 + 1 < 10) {
                idInsert = "sp00" + (chuoi2 + 1);
            } else if (chuoi2 + 1 < 100) {
                idInsert = "sp0" + (chuoi2 + 1);
            }
                txtMaSP.setText(idInsert);
         loadbtn(state);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        state="update";
        loadbtn(state);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        state="delete";
        int confirm=JOptionPane.showConfirmDialog(rootPane, "Bạn có thực sự muốn xóa?","Cảnh báo",JOptionPane.YES_NO_OPTION);
        if(confirm==0)
        {
            String maSP=txtMaSP.getText().trim();
            SanPham sp= new SanPham(maSP,"","");
            if(maSP.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Vui lòng click vào bảng để chọn đối tượng cần xóa");
            }
            else{
                if(sanPhamController.delete(sp)>0)
            {
                JOptionPane.showMessageDialog(rootPane, "Bạn đã xóa thành công");
                loadJTable();
                loadbtn(state);
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Bạn đã xóa thất bại");
            }
            
        }
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
         state="reset";
        loadbtn(state);
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        switch(state)
        {
            case "insert":
                boolean checkError=false;        
                String maSP= txtMaSP.getText().trim();
                String tenSP= txtTenSP.getText().trim();
                String moTa=txtMoTaSP.getText().trim();
                
                if(tenSP.length()>50)
                {        
                    JOptionPane.showMessageDialog(rootPane, "Bạn đã nhập quá 50 kí tự! Yêu cầu nhập lại!","Cảnh báo",JOptionPane.WARNING_MESSAGE);
                    txtTenSP.setText("");
                    txtTenSP.requestFocus();
                }
                else{                   
                    SanPham sanPham= new SanPham(maSP,tenSP,moTa);
                    SanPham checkmaSP = null;
                    checkmaSP=sanPhamController.get(maSP);
                    
                    if(checkmaSP.getTenSanPham()!=null){                     
                        JOptionPane.showMessageDialog(rootPane, "Đã tồn tại sản phẩm này","Cảnh báo",JOptionPane.WARNING_MESSAGE);
                        txtMaSP.requestFocus();
                    }              
                    else{
                        if(checkError==false)
                        {
                            if(sanPhamController.insert(sanPham)==1) {
                        JOptionPane.showMessageDialog(rootPane, "Bạn đã thêm mới thành công","Chúc mừng",JOptionPane.PLAIN_MESSAGE);
                        loadJTable();
                        state="reset";
                        loadbtn(state);
                    }
                    else {
                       JOptionPane.showMessageDialog(rootPane, "Bạn đã thêm mới thất bại","Chia buồn",JOptionPane.PLAIN_MESSAGE);
                     }
                        }
                    }
                }
                break;

            case "update":
                boolean checkUpdate=false;                 
                maSP= txtMaSP.getText().trim();
                tenSP= txtTenSP.getText().trim();
                moTa=txtMoTaSP.getText().trim();
                
                
                if(maSP.length()==0)
                {        
                    JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã sản phẩm","Cảnh báo",JOptionPane.WARNING_MESSAGE);
                }
                else{


                    
                    SanPham checkmaSP = null;
                    SanPham sanPham= new SanPham(maSP,tenSP,moTa);
                    checkmaSP=sanPhamController.get(maSP);
                  
                        if(checkUpdate==false)
                        {
                            if(sanPhamController.update(sanPham)==1) {
                        JOptionPane.showMessageDialog(rootPane, "Bạn đã sửa thành công","Chúc mừng",JOptionPane.PLAIN_MESSAGE);
                        loadJTable();
                        state="reset";
                        loadbtn(state);
                    }
                    else {
                       JOptionPane.showMessageDialog(rootPane, "Bạn đã sửa thất bại","Chia buồn",JOptionPane.PLAIN_MESSAGE);
                     }
                        }
                    
                }   
                break;
           
                
              
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
                int index = tblSanPham.getSelectedRow();
                String valueAt =  (String) tblSanPham.getValueAt(index, 0);
                SanPham pUpdate = sanPhamController.get(valueAt);
                txtMaSP.setText(pUpdate.getMaSanPham());
                txtTenSP.setText(pUpdate.getTenSanPham());
                txtMoTaSP.setText(pUpdate.getMoTa());
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
        System.out.println(txtTimKiem.getText());
    }//GEN-LAST:event_txtTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPhamView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextArea txtMoTaSP;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void loadbtn(String state) {
        switch(state)
        {
            case "reset":
                txtMaSP.setText("");
                txtTenSP.setText("");
                txtMoTaSP.setText("");          
                txtMaSP.setEnabled(false);
                txtTenSP.setEnabled(false); 
                txtMoTaSP.setEnabled(false);
               
                
                btnLuu.setEnabled(false);
                btnThem.setEnabled(true);
                btnXoa.setEnabled(true);
                btnSua.setEnabled(true);
                break;
            case "insert":
                
                txtMaSP.setEnabled(false);
                txtTenSP.setEnabled(true);
                txtMoTaSP.setEnabled(true);
                
                btnLuu.setEnabled(true);
                btnXoa.setEnabled(false);
                btnThem.setEnabled(false);
                btnSua.setEnabled(false);
                
      
                break;
            case "update":
                txtMaSP.setEnabled(false);
                txtTenSP.setEnabled(true);
                txtMoTaSP.setEnabled(true);
                
                
                btnLuu.setEnabled(true);
                btnXoa.setEnabled(false);
                btnThem.setEnabled(false);
                btnSua.setEnabled(false);
                break;
            case "delete":
                txtMaSP.setText("");
                txtTenSP.setText("");
                txtMoTaSP.setText("");    
                break;
        }
    }

    
    
    private void loadJTable() {
        listSpCurrent.clear();
        defaultTableModel=new DefaultTableModel();
        String[] columnTitle = {"Mã sản phẩm", "Tên sản phẩm", "Mô tả"};
        defaultTableModel.setColumnIdentifiers(columnTitle);
        Object[] dataRow;
        List<SanPham> listSP = sanPhamController.getAll();
        listSpCurrent.addAll(listSP);
        for (SanPham sp : listSP) {
            dataRow = new Object[]{sp.getMaSanPham(), sp.getTenSanPham(), sp.getMoTa()};
            defaultTableModel.addRow(dataRow);
        }
        
        tblSanPham.setModel(defaultTableModel);
        tblSanPham.getColumnModel().getColumn(0).setMaxWidth(100);
        tblSanPham.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblSanPham.getColumnModel().getColumn(2).setPreferredWidth(100);
//            System.out.println(listSP.size());
    }

    private void setColorButton() {
        btnSua.setBackground(new Color(255,193,7));
        btnThem.setBackground(new Color(0,0,255));
        btnLamMoi.setBackground(new Color(0,204,0));
        btnXoa.setBackground(new Color(238,0,0));
        btnLuu.setBackground(new Color(253,126,20));
    }

    private void setTextChange() {
        txtTimKiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                change();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                change();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                change();
                
            }
            public void change(){
                String search=txtTimKiem.getText();
                SanPham sanPham=new SanPham(search,search,"");
                
                List<SanPham> list=sanPhamController.find(sanPham);
                
                defaultTableModel=new DefaultTableModel();
                String[] columnTitle = {"Mã sản phẩm", "Tên sản phẩm", "Mô tả"};
                defaultTableModel.setColumnIdentifiers(columnTitle);
                Object[] dataRow;

                for (SanPham sp : list) {
                    dataRow = new Object[]{sp.getMaSanPham(), sp.getTenSanPham(), sp.getMoTa()};
                    defaultTableModel.addRow(dataRow);
                }

                tblSanPham.setModel(defaultTableModel);
                tblSanPham.getColumnModel().getColumn(0).setMaxWidth(100);
                tblSanPham.getColumnModel().getColumn(1).setPreferredWidth(50);
                tblSanPham.getColumnModel().getColumn(2).setPreferredWidth(100);
            }
        });
    }

    

    
    }

    

