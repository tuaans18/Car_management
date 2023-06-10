/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.HoaDon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DichVuDaSuDung;
import model.KhachHang;
import model.Xe;
import model.XeTrongHoaDon;
/**
 *
 * @author tuann
 */
public class HoaDonDAO extends DAO{
        
    public HoaDonDAO(){
    }
    
    public HoaDon searchHoaDon(int id){
        HoaDon hoaDon = null;
        
        try {
            PreparedStatement ps = con.prepareStatement("SELECT a.ID as idhoadon, b.ID as idxetronghoadon, b.ngay,\n" +
                                                        "c.ID as idxe, c.BienSo, c.HangXe, c.LoaiXe, \n" +
                                                        "d.ID as idkhachhang, d.Ten, d.DiaChi, d.Sdt\n" +
                                                        "FROM tblhoadon a, tblxetronghoadon b, tblxe c, tblkhachhang d\n" +
                                                        "WHERE a.ID=? AND b.tblHoaDonID = a.ID AND c.ID = b.tblXeID AND d.ID = a.tbKhachHangID");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            hoaDon = new HoaDon();
            hoaDon.setId(id);
            while(rs.next()){
        
                KhachHang khachHang = new KhachHang();
                khachHang.setId(rs.getInt("idkhachhang"));
                khachHang.setTen(rs.getString("Ten"));
                khachHang.setDiaChi(rs.getString("DiaChi"));
                khachHang.setSdt(rs.getString("Sdt"));
                hoaDon.setKhachHang(khachHang);
                
                XeTrongHoaDon xeTrongHoaDon = new XeTrongHoaDon();
                xeTrongHoaDon.setId(rs.getInt("idxetronghoadon"));
                xeTrongHoaDon.setDate(rs.getDate("ngay"));

                Xe xe = new Xe();
                xe.setId(rs.getInt("idxe"));
                xe.setBienSo(rs.getString("BienSo"));
                xe.setHangXe(rs.getString("HangXe"));
                xe.setLoaiXe(rs.getString("LoaiXe"));
                xeTrongHoaDon.setXe(xe);
                
                hoaDon.getListXeTrongHoaDon().add(xeTrongHoaDon);
                
            }
            
            for(XeTrongHoaDon xeTrongHoaDon: hoaDon.getListXeTrongHoaDon()){
                DichVuDaSuDungDAO dichVuDaSuDungDAO = new DichVuDaSuDungDAO();
                dichVuDaSuDungDAO.getDichVuDaSuDung(xeTrongHoaDon);
            }
            
            for(XeTrongHoaDon xeTrongHoaDon: hoaDon.getListXeTrongHoaDon()){
                LinhKienDaSuDungDAO linhKienDaSuDungDAO = new LinhKienDaSuDungDAO();
                linhKienDaSuDungDAO.getLinhKienDaSungDung(xeTrongHoaDon);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return hoaDon;
    } 
    
    public boolean LuuHoaDon(HoaDon b){
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE tblhoadon SET TrangThai = 1 WHERE ID = ?");
            ps.setInt(1,b.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
