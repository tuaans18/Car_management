/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.DichVuDAO;
import dao.LinhKienDAO;
import dao.LinhKienDaSuDungDAO;
import dao.DichVuDaSuDungDAO;
import dao.HoaDonDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DichVu;
import model.DichVuDaSuDung;
import model.HoaDon;
import model.LinhKien;
import model.LinhKienDaSuDung;
import model.NhanVien;
import model.Xe;
import model.XeTrongHoaDon;

/**
 *
 * @author tuann
 */
public class XacNhanFrm extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form XacNhanFrm
     */
    private NhanVien nv;
    private HoaDon hoaDon;
    private XeTrongHoaDon xeTrongHoaDon;
    private DichVuDaSuDung dichVuDaSuDung;
    private LinhKienDaSuDung linhKienDaSuDung;
    private ArrayList<XeTrongHoaDon> listXeTrongHoaDon;
    private ArrayList<DichVuDaSuDung> listDichVuDaSuDung;
    private ArrayList<LinhKienDaSuDung> listLinhKienDaSuDung;

    public XacNhanFrm(NhanVien nv, HoaDon hoaDon) {
        initComponents();
        this.nv =nv;
        this.hoaDon = hoaDon;
        
        txtTenKhachHang.setText(hoaDon.getKhachHang().getTen());
        txtDiaChi.setText(hoaDon.getKhachHang().getDiaChi());
        txtSoDienThoai.setText(hoaDon.getKhachHang().getSdt());
        
        listXeTrongHoaDon = hoaDon.getListXeTrongHoaDon();
        listDichVuDaSuDung = new ArrayList<>();
        listLinhKienDaSuDung = new ArrayList<>();
        btnXacNhan.addActionListener(this);
        for (int i = 0; i < listXeTrongHoaDon.size(); i++) {
            for (int j = 0; j < listXeTrongHoaDon.get(i).getListDichVuDaSuDung().size(); j++) {
                listDichVuDaSuDung.add(listXeTrongHoaDon.get(i).getListDichVuDaSuDung().get(j));
            }
            for (int j = 0; j < listXeTrongHoaDon.get(i).getListLinhKienDaSuDung().size(); j++) {
                listLinhKienDaSuDung.add(listXeTrongHoaDon.get(i).getListLinhKienDaSuDung().get(j));
            }
        }

        String data1[][] = new String[listXeTrongHoaDon.size()][3];
        for (int i = 0; i < listXeTrongHoaDon.size(); i++) {
            Xe xe = listXeTrongHoaDon.get(i).getXe();
            data1[i][0] = xe.getBienSo();
            data1[i][1] = xe.getHangXe();
            data1[i][2] = xe.getLoaiXe();
        }
        String[] columnNames1 = {"Bien xe", "Hang xe", "Loai xe"};
        DefaultTableModel dtm1 = new DefaultTableModel(data1, columnNames1);
        tblXe.setModel(dtm1);
      
        String data2[][] = new String[listDichVuDaSuDung.size()][5];
        for (int i = 0; i < listDichVuDaSuDung.size(); i++) {
            DichVu dichVu = listDichVuDaSuDung.get(i).getDichVu();
            data2[i][0] = (i + 1) + "";
            data2[i][1] = dichVu.getTen();
            data2[i][2] = listDichVuDaSuDung.get(i).getGia() + "";
            data2[i][3] = listDichVuDaSuDung.get(i).getSoluong() + "";
            data2[i][4] = listDichVuDaSuDung.get(i).getThanhtien() + "";
        }

        String[] columnNames2 = {"TT", "Ten", "Don gia", "So Luong", "Thanh Tien"};
        DefaultTableModel dtm2 = new DefaultTableModel(data2, columnNames2);
        tblDichVu.setModel(dtm2);
        
        String data3[][] = new String[listLinhKienDaSuDung.size()][5];
        for (int i = 0; i < listLinhKienDaSuDung.size(); i++) {
            LinhKien linhKien = listLinhKienDaSuDung.get(i).getLinhKien();
            data3[i][0] = (i + 1) + "";
            data3[i][1] = linhKien.getTen();
            data3[i][2] = listLinhKienDaSuDung.get(i).getGia() + "";
            data3[i][3] = listLinhKienDaSuDung.get(i).getSoLuong() + "";
            data3[i][4] = listLinhKienDaSuDung.get(i).getThanhTien() + "";
        }

        String[] columnNames3 = {"TT", "Ten", "Don gia", "So Luong", "Thanh Tien"};
        DefaultTableModel dtm3 = new DefaultTableModel(data3, columnNames3);
        tblLinhKien.setModel(dtm3);
        
        txtTongTien.setText(hoaDon.getTongTien()+"");
        
        // chon xe can them dich vu/linhkien
        xeTrongHoaDon = new XeTrongHoaDon();
        tblXe.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                int column = tblXe.getColumnModel().getColumnIndexAtX(e.getX());
                int row = e.getY() / tblXe.getRowHeight();
                
                 if (row < tblXe.getRowCount() && row >= 0 && 
                            column < tblXe.getColumnCount() && column >= 0) {
                    xeTrongHoaDon = listXeTrongHoaDon.get(row);
                 }
            }
        });
        // them dichvu/linhkien
        btnThem.addActionListener((e) -> {
            if(radiobtnDichVu.isSelected()){
                DichVu dichVu = new DichVu();
                DichVuDAO dichVuDAO = new DichVuDAO();
                dichVu = dichVuDAO.searchDichVu(txtTen.getText());
                
                dichVuDaSuDung = new DichVuDaSuDung();
                dichVuDaSuDung.setSoluong(Integer.parseInt(txtSoLuong.getText()));
                dichVuDaSuDung.setDichVu(dichVu);
                dichVuDaSuDung.setGia(dichVu.getGia());
                
                DichVuDaSuDungDAO dichVuDaSuDungDAO = new DichVuDaSuDungDAO();
                if(dichVuDaSuDungDAO.addDichVuDaSuDung(dichVuDaSuDung,xeTrongHoaDon.getId())){
                    listDichVuDaSuDung.add(dichVuDaSuDung);
                    xeTrongHoaDon.getListDichVuDaSuDung().add(dichVuDaSuDung);
                    dtm2.addRow(new Object[]{listDichVuDaSuDung.size(),dichVu.getTen(),dichVuDaSuDung.getGia(),dichVuDaSuDung.getSoluong(),dichVuDaSuDung.getThanhtien()});
                    float TongTien = hoaDon.getTongTien()+ dichVuDaSuDung.getThanhtien();
                    hoaDon.setTongTien(TongTien);
                    txtTongTien.setText(hoaDon.getTongTien()+ "");
                }   
            }
            else{
                LinhKien linhKien = new LinhKien();
                LinhKienDAO linhKienDAO = new LinhKienDAO();
                linhKien = linhKienDAO.searchLinhKien(txtTen.getText());
                
                linhKienDaSuDung = new LinhKienDaSuDung();
                linhKienDaSuDung.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
                linhKienDaSuDung.setLinhKien(linhKien);
                linhKienDaSuDung.setGia(linhKien.getGia());
                
                LinhKienDaSuDungDAO linhKienDaSuDungDAO = new LinhKienDaSuDungDAO();
                if(linhKienDaSuDungDAO.addLinhKienDaSuDung(linhKienDaSuDung, xeTrongHoaDon.getId())){
                    listLinhKienDaSuDung.add(linhKienDaSuDung);
                    xeTrongHoaDon.getListLinhKienDaSuDung().add(linhKienDaSuDung);
                    dtm3.addRow(new Object[]{listLinhKienDaSuDung.size(),linhKien.getTen(),linhKienDaSuDung.getGia(),linhKienDaSuDung.getSoLuong(),linhKienDaSuDung.getThanhTien()});
                    float TongTien = hoaDon.getTongTien()+ linhKienDaSuDung.getThanhTien();
                    hoaDon.setTongTien(TongTien);
                    txtTongTien.setText(hoaDon.getTongTien()+"");
                }
            }
        });
        // Xoa dich vu/linh kien
        btnBot.addActionListener((e)->{
            if(radiobtnDichVu.isSelected()){
                int row = tblDichVu.getSelectedRow();
                dichVuDaSuDung = new DichVuDaSuDung();
                dichVuDaSuDung = listDichVuDaSuDung.get(row);
                if(row < 0 || row > tblDichVu.getRowCount()-1){
                    JOptionPane.showMessageDialog(this, "chon dong trong pham vi");
                }else{
                    DichVuDaSuDungDAO dichVuDaSuDungDAO = new DichVuDaSuDungDAO();
                    if(dichVuDaSuDungDAO.deleteDichVuDaSuDung(dichVuDaSuDung.getId())){
                        dtm2.removeRow(row);
                        listDichVuDaSuDung.remove(row);
                        xeTrongHoaDon.setListDichVuDaSuDung(listDichVuDaSuDung);
                        float TongTien = hoaDon.getTongTien() - dichVuDaSuDung.getThanhtien();
                        hoaDon.setTongTien(TongTien);
                        txtTongTien.setText(hoaDon.getTongTien()+"");
                    }
                }             
            }else{
                int row = tblLinhKien.getSelectedRow();
                linhKienDaSuDung = new LinhKienDaSuDung();
                linhKienDaSuDung = listLinhKienDaSuDung.get(row);
                if(row < 0 || row > tblLinhKien.getRowCount()-1){
                    JOptionPane.showMessageDialog(this, "chon dong trong pham vi");
                }else{
                    LinhKienDaSuDungDAO linhKienDaSuDungDAO = new LinhKienDaSuDungDAO();
                    if(linhKienDaSuDungDAO.deleteLinhKienDaSuDung(linhKienDaSuDung.getId())){
                        dtm3.removeRow(row);
                        listLinhKienDaSuDung.remove(row);
                        xeTrongHoaDon.setListLinhKienDaSuDung(listLinhKienDaSuDung);
                        float TongTien = hoaDon.getTongTien() - linhKienDaSuDung.getThanhTien();
                        hoaDon.setTongTien(TongTien);
                        txtTongTien.setText(hoaDon.getTongTien()+"");
                    }
                }   
            }
        });
        
        //Thoat khoi trang xac nhan
        btnThoat.addActionListener((e) -> {
            (new NVThuNganFrm(nv)).setVisible(true);
            this.dispose();
        });
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnBot = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblXe = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDichVu = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLinhKien = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JLabel();
        btnXacNhan = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        radiobtnDichVu = new javax.swing.JRadioButton();
        radiobtnLinhKien = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Xac Nhan");

        btnThem.setText("Them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnBot.setText("Bot");

        jLabel2.setText("Ten Khach Hang:");

        jLabel3.setText("Dia Chi:");

        jLabel4.setText("So Dien Thoai:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Xe");

        tblXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bien So", "Hang Xe", "Loai Xe"
            }
        ));
        jScrollPane1.setViewportView(tblXe);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Dich Vu Da Dung");

        tblDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TT", "Ten", "Don Gia", "So Luong", "Thanh Tien"
            }
        ));
        jScrollPane2.setViewportView(tblDichVu);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Linh Kien Da Dung");

        tblLinhKien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TT", "Ten", "Don Gia", "So Luong", "Thanh Tien"
            }
        ));
        jScrollPane3.setViewportView(tblLinhKien);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Tong Tien:");

        txtTongTien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        btnXacNhan.setText("Xac Nhan");

        btnThoat.setText("Thoat");

        jLabel9.setText("Ten:");

        jLabel10.setText("So Luong:");

        buttonGroup1.add(radiobtnDichVu);
        radiobtnDichVu.setText("Dich Vu");

        buttonGroup1.add(radiobtnLinhKien);
        radiobtnLinhKien.setText("LinhKien");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(radiobtnDichVu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radiobtnLinhKien))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)
                                .addComponent(jScrollPane3)))
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBot)
                                .addGap(149, 149, 149)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtTenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(btnXacNhan)
                        .addGap(125, 125, 125)
                        .addComponent(btnThoat)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnBot)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXacNhan)
                            .addComponent(btnThoat))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiobtnLinhKien)
                            .addComponent(radiobtnDichVu))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    /**
     * @param args the command line arguments
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        HoaDonDAO hoaDonDAO = new HoaDonDAO();
        if(hoaDonDAO.LuuHoaDon(hoaDon)){
    
            JOptionPane.showMessageDialog(this, "Da luu thanh cong vao csdl");
            (new NVThuNganFrm(nv)).setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Co loi trong qua trinh luu");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBot;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton radiobtnDichVu;
    private javax.swing.JRadioButton radiobtnLinhKien;
    private javax.swing.JTable tblDichVu;
    private javax.swing.JTable tblLinhKien;
    private javax.swing.JTable tblXe;
    private javax.swing.JLabel txtDiaChi;
    private javax.swing.JLabel txtSoDienThoai;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTen;
    private javax.swing.JLabel txtTenKhachHang;
    private javax.swing.JLabel txtTongTien;
    // End of variables declaration//GEN-END:variables
}
