/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.view;


import QLK.controller.NhaCungCapDao;
import QLK.model.NhaCungCap;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguye
 */
public class NhaCungCapView extends javax.swing.JFrame {

    String idUpdateNCC = "";
    String getIDNhaCungCap = "";
    int demNCC;
    DefaultTableModel dtmDanhSachNhaCungCap;
    NhaCungCapDao nhacungcapdao = new NhaCungCapDao();
    NhaCungCap nhacungcap = new NhaCungCap();

    public NhaCungCapView() {
        initComponents();
        addCbo();
        Clear();
        loadNhaCungCapToJTable();
        txtMaNCC.setEnabled(false);
    }

    public void addCbo() {
        cboSearch.addItem("Mã nhà cung cấp");
        cboSearch.addItem("Tên nhà cung cấp");
        cboSearch.addItem("Số điện thoại");
        cboSearch.addItem("Địa chỉ");
        cboSearch.setSelectedIndex(0);

    }

    public void Clear() {

        txtMaNCC.setText("");
        txtTenNCC.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        txtSearch.setText("");

        btnThem.setEnabled(true);
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnNhaplai.setEnabled(true);
    }

    public void SetIDNhaCungCap() {

        for (NhaCungCap dp : nhacungcapdao.getListIDNhaCungCap()) {
            if (nhacungcapdao.getListIDNhaCungCap().size() == 0) {
                getIDNhaCungCap = "NCC000";
            }
            getIDNhaCungCap = dp.getMaNCC();

        }
        demNCC = nhacungcapdao.CoutNhaCungCap();

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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaNCC = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtTenNCC = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnNhaplai = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhaCungCap = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cboSearch = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("NHÀ CUNG CẤP");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Mã nhà cung cấp:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Tên nhà cung cấp:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Số điện thoại       :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Địa chỉ                 :");

        txtMaNCC.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtTenNCC.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnSua.setBackground(new java.awt.Color(0, 204, 255));
        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLK/img/documents-white-edit-icon.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(0, 204, 255));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLK/img/trash-icon.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(51, 204, 255));
        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLK/img/iconAdd.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(0, 204, 255));
        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLK/img/Windows-Close-Program-icon.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnNhaplai.setBackground(new java.awt.Color(51, 204, 255));
        btnNhaplai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNhaplai.setForeground(new java.awt.Color(255, 255, 255));
        btnNhaplai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLK/img/quay_lai_35.png"))); // NOI18N
        btnNhaplai.setText("Nhập lại");
        btnNhaplai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaplaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnNhaplai, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                                    .addComponent(txtTenNCC)
                                    .addComponent(txtMaNCC)
                                    .addComponent(txtDiaChi)))
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhaplai, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        tblNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhaCungCapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhaCungCap);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Tìm kiếm:");

        btnSearch.setBackground(new java.awt.Color(0, 204, 255));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLK/img/icon_search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(360, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(840, 840, 840)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
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
        SetIDNhaCungCap();
        String idNCC = "";
        int chuoi2 = 0;
        String tenNCC = txtTenNCC.getText();
        String SDT = txtSDT.getText();
        String DiaChi = txtDiaChi.getText();

        if (demNCC == 0) {
            idNCC = "NCC000";
        } else {
            chuoi2 = Integer.parseInt(getIDNhaCungCap.substring(4));

            if (chuoi2 + 1 < 10) {
                idNCC = "NCC00" + (chuoi2 + 1);
            } else if (chuoi2 + 1 < 100) {
                idNCC = "NCC0" + (chuoi2 + 1);
            }
        }
        if (txtTenNCC.getText().trim().equals("")) {
            txtTenNCC.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập tên nhà cung cấp!");
            return;
        } else if (txtSDT.getText().trim().equals("")) {
            txtSDT.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập số điện thoại!");
            return;
        } else if (txtDiaChi.getText().trim().equals("")) {
            txtSDT.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập địa chỉ!");
            return;
        } else {

            if (nhacungcapdao.insert(new NhaCungCap(idNCC, tenNCC, DiaChi, SDT)) > 0) {

                JOptionPane.showMessageDialog(rootPane, "Thêm mới thành công!");
                loadNhaCungCapToJTable();

                Clear();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Thêm mới không thành công!");
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       try {
           
           if (txtMaNCC.getText().trim().equals("")) {
            txtMaNCC.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải chọn dữ liệu để xóa!");
           
           }
           else {
           int row = -1;
             int column = 0;
             String maNCC = txtMaNCC.getText();
             row = tblNhaCungCap.getSelectedRow();
             String value = tblNhaCungCap.getModel().getValueAt(row, column).toString();
             int k = JOptionPane.showConfirmDialog(null,"Bạn có muốn xóa?");
             if(k==0)
             {
                 nhacungcapdao.delete(new NhaCungCap(value));
                 JOptionPane.showMessageDialog(null," Xóa dữ liệu thành công!");
                
             }
             loadNhaCungCapToJTable();   
             Clear();
           }
           
             
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null," Bạn phải chọn dữ liệu để xóa!");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhaCungCapMouseClicked
        int index = tblNhaCungCap.getSelectedRow();
                String valueAt = (String) tblNhaCungCap.getValueAt(index, 0);
                NhaCungCap pUpdate = nhacungcapdao.get(valueAt+"").get();
                txtMaNCC.setText(pUpdate.getMaNCC());
                txtTenNCC.setText(pUpdate.getTenNCC());
                txtSDT.setText(pUpdate.getsdtNCC());
                txtDiaChi.setText(pUpdate.getDiaChi());
               
                idUpdateNCC = valueAt;
                
                btnThem.setEnabled(false);
                btnSua.setEnabled(true);
                btnXoa.setEnabled(true);
    }//GEN-LAST:event_tblNhaCungCapMouseClicked

    private void btnNhaplaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaplaiActionPerformed
       Clear();
    }//GEN-LAST:event_btnNhaplaiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       int confirm = JOptionPane.showConfirmDialog(rootPane, "Bạn thật sự muốn sửa ?", "Cảnh báo nguy hiểm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == 0) {
            try {
                String maNCC = txtMaNCC.getText();
         String tenNCC = txtTenNCC.getText();
        String SDT = txtSDT.getText();
       
        String DiaChi = txtDiaChi.getText();
         if (txtTenNCC.getText().trim().equals("")) {
            txtTenNCC.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập tên nhà cung cấp!");
            return;
        } else if (txtSDT.getText().trim().equals("")) {
            txtSDT.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập số điện thoại!");
            return;
        }
        else if (txtDiaChi.getText().trim().equals("")) {
            txtSDT.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập địa chỉ!");
            return;
        }
        else {   
            String IDNhaCungCap = idUpdateNCC;
            if (nhacungcapdao.update(new NhaCungCap(maNCC, tenNCC, DiaChi, SDT)) > 0) {
                JOptionPane.showMessageDialog(rootPane, "Sửa thành công!");
                
                loadNhaCungCapToJTable();
               
                Clear();
               
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sửa không thành công!");
            }
        }
            }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Phải nhập đúng kiểu dữ liệu !");
        }
        } else {
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String txtSearch=this.txtSearch.getText();
        String colName=(String) this.cboSearch.getSelectedItem();
        Vector row = null;
        String colNames = "";
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Mã nhà cung cấp");
        model.addColumn("Tên nhà cung cấp");
         model.addColumn("Số điện thoại");
        model.addColumn("Địa chỉ");
         if (colName.equals("Mã nhà cung cấp")) {
         colNames = "maNCC";
         }else if (colName.equals("Tên nhà cung cấp")){
          colNames = "tenNCC";
         }
         else if (colName.equals("Số điện thoại")){
          colNames = "sdtNCC";
         }
         else{
          colNames = "diaChi";
         }
         
        {NhaCungCap nccs;
        for (int i = 0; i < nhacungcapdao.find(txtSearch, colNames).size(); i++) {
            nccs=nhacungcapdao.find(txtSearch, colNames).get(i);
            row=new Vector();
            row.add(nccs.getMaNCC());
             row.add(nccs.getTenNCC());
              row.add(nccs.getsdtNCC());
               row.add(nccs.getDiaChi());
           
            model.addRow(row);
        }
        tblNhaCungCap.setModel(model);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(NhaCungCapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhaCungCapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhaCungCapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhaCungCapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhaCungCapView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhaplai;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNhaCungCap;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenNCC;
    // End of variables declaration//GEN-END:variables
private void loadNhaCungCapToJTable() {
        dtmDanhSachNhaCungCap = new DefaultTableModel();
        String[] columnTitle = {"Mã nhà cung cấp", "Tên nhà cung cấo", "Số điện thoại", "Địa chỉ"};
        dtmDanhSachNhaCungCap.setColumnIdentifiers(columnTitle);
        Object[] dataRow;

        List<NhaCungCap> listNhaCungCap = nhacungcapdao.getAll();
        for (NhaCungCap n : listNhaCungCap) {
            dataRow = new Object[]{n.getMaNCC(), n.getTenNCC(), n.getsdtNCC(), n.getDiaChi()};
            dtmDanhSachNhaCungCap.addRow(dataRow);
        }
        tblNhaCungCap.setModel(dtmDanhSachNhaCungCap);
    }

}
