/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.DichVu;

/**
 *
 * @author tuann
 */
public class DichVuDAO extends DAO{
    
    public DichVuDAO(){
    
    }
    public DichVu searchDichVu(String ten){
        DichVu dichVu = null;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM hoadon.tbldichvu WHERE Ten LIKE ?");
            ps.setString(1,ten);
            
            ResultSet rs = ps.executeQuery();
            dichVu = new DichVu();
            if(rs.next()){
                dichVu.setId(rs.getInt("ID"));
                dichVu.setGia(rs.getFloat("Gia"));
                dichVu.setTen(rs.getString("Ten"));
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         
        return dichVu;
    }
}
