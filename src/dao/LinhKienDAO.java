/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.LinhKien;

/**
 *
 * @author tuann
 */
public class LinhKienDAO extends DAO{
    
    public LinhKienDAO(){
        
    }
    
    public LinhKien searchLinhKien(String ten){
        LinhKien linhKien =null;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM hoadon.tbllinhkien WHERE Ten LIKE ?");
            ps.setString(1,ten);
            
            ResultSet rs = ps.executeQuery();
            linhKien = new LinhKien();
            if(rs.next()){
                linhKien.setId(rs.getInt("ID"));
                linhKien.setGia(rs.getFloat("Gia"));
                linhKien.setTen(rs.getString("Ten"));
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return linhKien;
    }
}
