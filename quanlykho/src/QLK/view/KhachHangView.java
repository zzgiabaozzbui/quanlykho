/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.view;


import QLK.controller.KhachHangDao;
import QLK.model.KhachHang;

import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author nguye
 */
public class KhachHangView extends javax.swing.JFrame {

    String idUpdateKH = "";
    String getIDKhachHang = "";
     int demKhachHang ;
     DefaultTableModel dtmDanhSachKhachHang;
     KhachHangDao khachhangdao = new KhachHangDao();
     KhachHang khachhang = new KhachHang();
    public KhachHangView() {
        initComponents();
        
        loadKhachHangToJTable();
        addCbo();
        
    }
    
    public void addCbo () {
    cboSearch.addItem("Mã khách hàng");
    cboSearch.addItem("Tên khách hàng");
    cboSearch.addItem("Số điện thoại");
    cboSearch.addItem("CMND");
    cboSearch.addItem("Địa chỉ");
    cboSearch.setSelectedIndex(0);
    txtMaKH.setEnabled(false);
    }
    public void Clear (){
        
        txtMaKH.setText("");
                txtTenKH.setText("");
                txtSDT.setText("");
                txtCMND.setText("");
                txtDiaChi.setText("");
                txtSearch.setText("");
                 
    btnThem.setEnabled(true);
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnNhaplai.setEnabled(true);
    }
    public void SetIDDatPhong() {

        for (KhachHang dp : khachhangdao.getListIDKhachHang()) {
            if (khachhangdao.getListIDKhachHang().size() == 0){
            getIDKhachHang = "KH000";
            }
                 getIDKhachHang = dp.getMaKH();
            
        }
        demKhachHang = khachhangdao.CoutKhachHang();

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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cboSearch = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnNhaplai = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("KHÁCH HÀNG");

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Mã khách hàng:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Tên khách hàng:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Số điện thoại:");

        txtMaKH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtTenKH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("CMND:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Địa chỉ:");

        txtCMND.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addGap(116, 116, 116))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel6))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        tblKhachHang.setBackground(new java.awt.Color(240, 240, 240));
        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("Tìm kiếm :");

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(0, 204, 255));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLK/img/btnSearch.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(cboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnThem.setBackground(new java.awt.Color(0, 204, 255));
        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLK/img/iconAdd_1.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(51, 204, 255));
        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLK/img/documents-white-edit-icon.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(51, 204, 255));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLK/img/trash-icon.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnNhaplai.setBackground(new java.awt.Color(51, 204, 255));
        btnNhaplai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNhaplai.setForeground(new java.awt.Color(255, 255, 255));
        btnNhaplai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLK/img/quay_lai_35_1.png"))); // NOI18N
        btnNhaplai.setText("Nhập lại");
        btnNhaplai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaplaiActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(51, 204, 255));
        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLK/img/Windows-Close-Program-icon.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(834, 834, 834)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246)
                .addComponent(btnNhaplai, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNhaplai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int confirm = JOptionPane.showConfirmDialog(rootPane, "Bạn thật sự muốn sửa ?", "Cảnh báo nguy hiểm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == 0) {
            try {
                String maKH = txtMaKH.getText();
         String tenKH = txtTenKH.getText();
        String SDT = txtSDT.getText();
        String CMND = txtCMND.getText();
        String DiaChi = txtDiaChi.getText();
         if (txtTenKH.getText().trim().equals("")) {
            txtTenKH.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập tên khách hàng!");
            return;
        } else if (txtSDT.getText().trim().equals("")) {
            txtSDT.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập số điện thoại!");
            return;
        }else if (txtCMND.getText().trim().equals("")) {
            txtSDT.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập chứng minh nhân dân!");
            return;
        }
        else if (txtDiaChi.getText().trim().equals("")) {
            txtSDT.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập địa chỉ!");
            return;
        }
        else {   
            String IDDatPhong = idUpdateKH;
            if (khachhangdao.update(new KhachHang(maKH, tenKH, DiaChi, SDT, CMND)) > 0) {
                JOptionPane.showMessageDialog(rootPane, "Sửa thành công!");
                
                loadKhachHangToJTable();
               
                Clear();
               
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sửa không thành công! Backend có lỗi");
            }
        }
            }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Phải nhập đúng kiểu dữ liệu !");
        }
        } else {
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        SetIDDatPhong();
        String idKH = "";
        int chuoi2 = 0;
        String tenKH = txtTenKH.getText();
        String SDT = txtSDT.getText();
        String CMND = txtCMND.getText();
        String DiaChi = txtDiaChi.getText();
       
        
       
        
        if (demKhachHang == 0){
        idKH = "KH000";
        }
        else {
        chuoi2 = Integer.parseInt(getIDKhachHang.substring(3));
           
        if (chuoi2 + 1 < 10) {
            idKH = "KH00" + (chuoi2 + 1);
        } else if (chuoi2 + 1 < 100) {
            idKH = "KH0" + (chuoi2 + 1);
        }
        }
        if (txtTenKH.getText().trim().equals("")) {
            txtTenKH.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập tên khách hàng!");
            return;
        } else if (txtSDT.getText().trim().equals("")) {
            txtSDT.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập số điện thoại!");
            return;
        }else if (txtCMND.getText().trim().equals("")) {
            txtSDT.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập chứng minh nhân dân!");
            return;
        }
        else if (txtDiaChi.getText().trim().equals("")) {
            txtSDT.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập địa chỉ!");
            return;
        }
        else {

            if (khachhangdao.insert(new KhachHang(idKH, tenKH, DiaChi, SDT, CMND))> 0) {
               
                JOptionPane.showMessageDialog(rootPane, "Thêm mới thành công!");
                loadKhachHangToJTable();
               
                Clear ();
                
              
            } else {
                JOptionPane.showMessageDialog(rootPane, "Thêm mới không thành công!");
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
             int row = -1;
             int column = 0;
             String maKH = txtMaKH.getText();
             row = tblKhachHang.getSelectedRow();
             String value = tblKhachHang.getModel().getValueAt(row, column).toString();
             int k = JOptionPane.showConfirmDialog(null,"Bạn có muốn xóa?");
             if(k==0)
             {
                 khachhangdao.delete(new KhachHang(value));
                 JOptionPane.showMessageDialog(null," Xóa dữ liệu thành công!");
                
             }
             loadKhachHangToJTable();   
             Clear();
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null," Bạn phải chọn dữ liệu để xóa!");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
       int index = tblKhachHang.getSelectedRow();
                String valueAt = (String) tblKhachHang.getValueAt(index, 0);
                KhachHang pUpdate = khachhangdao.get(valueAt+"").get();
                txtMaKH.setText(pUpdate.getMaKH());
                txtTenKH.setText(pUpdate.getTenKH());
                txtSDT.setText(pUpdate.getSDT());
                txtCMND.setText(pUpdate.getCMND());
                txtDiaChi.setText(pUpdate.getDiaChi());
               
                idUpdateKH = valueAt;
                
                btnThem.setEnabled(false);
                btnSua.setEnabled(true);
                btnXoa.setEnabled(true);
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnNhaplaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaplaiActionPerformed
       Clear();
    }//GEN-LAST:event_btnNhaplaiActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       String txtSearch=this.txtSearch.getText();
        String colName=(String) this.cboSearch.getSelectedItem();
        Vector row = null;
        String colNames = "";
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Mã khách hàng");
        model.addColumn("Tên khách hàng");
         model.addColumn("Số điện thoại");
           model.addColumn("CMND");
        model.addColumn("Địa chỉ");
         if (colName.equals("Mã khách hàng")) {
         colNames = "maKH";
         }else if (colName.equals("Tên khách hàng")){
          colNames = "tenKH";
         }
         else if (colName.equals("Số điện thoại")){
          colNames = "SDT";
         }
         else if (colName.equals("CMND")){
          colNames = "CMND";
         }
         else{
          colNames = "diaChi";
         }
         
        {KhachHang kh;
        for (int i = 0; i < khachhangdao.find(txtSearch, colNames).size(); i++) {
            kh=khachhangdao.find(txtSearch, colNames).get(i);
            row=new Vector();
            row.add(kh.getMaKH());
             row.add(kh.getTenKH());
              row.add(kh.getSDT());
               row.add(kh.getCMND());
                 row.add(kh.getDiaChi());
           
            model.addRow(row);
        }
        tblKhachHang.setModel(model);
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
            java.util.logging.Logger.getLogger(KhachHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHangView().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables

    private void loadKhachHangToJTable() {
       dtmDanhSachKhachHang = new DefaultTableModel();
        String[] columnTitle = {"Mã khách hàng", "Tên khách hàng", "Số điện thoại", "CMND", "Địa chỉ"};
        dtmDanhSachKhachHang.setColumnIdentifiers(columnTitle);
        Object[] dataRow;

        List<KhachHang> listKhachHang = khachhangdao.getAll();
        for (KhachHang k : listKhachHang) {
            dataRow = new Object[]{k.getMaKH(), k.getTenKH(), k.getSDT(), k.getCMND(), k.getDiaChi()};
            dtmDanhSachKhachHang.addRow(dataRow);
        }
        tblKhachHang.setModel(dtmDanhSachKhachHang);
    }
}