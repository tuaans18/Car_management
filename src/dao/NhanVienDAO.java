/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author tuann
 */
public class NhanVienDAO extends DAO{
    
    public NhanVienDAO(){
        
    }
    
    public boolean checkLogin(NhanVien nv){
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tblNhanVien WHERE TaiKhoan = ? AND MatKhau = ?");
            ps.setString(1, nv.getTaiKhoan());
            ps.setString(2, nv.getMatKhau());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                nv.setVaitro(rs.getString("VaiTro"));
                nv.setId((rs.getInt("ID")));
                nv.setTen(rs.getString("Ten"));
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return false;
    }
}
