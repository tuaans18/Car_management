/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.XeTrongHoaDon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DichVu;
import model.DichVuDaSuDung;

/**
 *
 * @author tuann
 */
public class DichVuDaSuDungDAO extends DAO{
  
    public DichVuDaSuDungDAO(){
        
    }
    
    public void getDichVuDaSuDung(XeTrongHoaDon xeTrongHoaDon){
        try {
            PreparedStatement ps = con.prepareStatement("SELECT b.ID as iddichvudasudung, b.SoLuong, b.Gia, c.ID as iddichvu, c.Ten\n" +
                    "FROM tblxetronghoadon a,tbldichvudasudung b, tbldichvu c\n" +
                    "WHERE a.ID=? AND b.tblXeTrongHoaDonID = a.ID AND c.ID = b.tblDichVuID");
            
            ps.setInt(1, xeTrongHoaDon.getId());
            ResultSet rs = ps.executeQuery();
            ArrayList<DichVuDaSuDung> listDichVuDaSuDung = new ArrayList<>();
            while(rs.next()){
                DichVu dichVu = new DichVu();
                dichVu.setId(rs.getInt("iddichvu"));
                dichVu.setTen(rs.getString("Ten"));
                
                DichVuDaSuDung dichVuDaSuDung = new DichVuDaSuDung();
                dichVuDaSuDung.setId(rs.getInt("iddichvudasudung"));
                dichVuDaSuDung.setSoluong(rs.getInt("SoLuong"));
                dichVuDaSuDung.setGia(rs.getFloat("Gia"));
                dichVuDaSuDung.setDichVu(dichVu);
                
                listDichVuDaSuDung.add(dichVuDaSuDung);
            }
            xeTrongHoaDon.setListDichVuDaSuDung(listDichVuDaSuDung);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean addDichVuDaSuDung(DichVuDaSuDung dichVuDaSuDung, int idXeTrongHoaDon){
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO tblDichVuDaSuDung(SoLuong,Gia,tblDichVuID,tblXeTrongHoaDonID) VALUES (?,?,?,?)");
            ps.setInt(1,dichVuDaSuDung.getSoluong());
            ps.setFloat(2,dichVuDaSuDung.getGia());
            ps.setInt(3,dichVuDaSuDung.getDichVu().getId());
            ps.setInt(4, idXeTrongHoaDon);
            
            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean deleteDichVuDaSuDung(int id){
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM tblDichVuDaSuDung WHERE ID = ?");
            ps.setInt(1,id);
            ps.executeUpdate();
            
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }       
    }
}
