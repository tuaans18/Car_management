/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.XeTrongHoaDon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.LinhKien;
import model.LinhKienDaSuDung;
/**
 *
 * @author tuann
 */
public class LinhKienDaSuDungDAO extends DAO{
    public LinhKienDaSuDungDAO(){
        
    }
    public void getLinhKienDaSungDung(XeTrongHoaDon xeTrongHoaDon){
        try {
            PreparedStatement ps = con.prepareStatement("SELECT b.ID as idlinhkiendasudung, b.SoLuong, b.Gia, c.ID as idlinhkien, c.Ten\n" +
                    "FROM tblxetronghoadon a,tbllinhkiendasudung b, tbllinhkien c\n" +
                    "WHERE a.ID=? AND b.tblXeTrongHoaDonID = a.ID AND c.ID = b.tblLinhKienID");
            
            ps.setInt(1, xeTrongHoaDon.getId());
            ResultSet rs = ps.executeQuery();
            ArrayList<LinhKienDaSuDung> listLinhKienDaSuDung = new ArrayList<>();
            while(rs.next()){
                LinhKien linhKien = new LinhKien();
                linhKien.setId(rs.getInt("idlinhkien"));
                linhKien.setTen(rs.getString("Ten"));
                
                LinhKienDaSuDung linhKienDaSuDung = new LinhKienDaSuDung();
                linhKienDaSuDung.setId(rs.getInt("idlinhkiendasudung"));
                linhKienDaSuDung.setSoLuong(rs.getInt("SoLuong"));
                linhKienDaSuDung.setGia(rs.getFloat("Gia"));
                linhKienDaSuDung.setLinhKien(linhKien);
                
                listLinhKienDaSuDung.add(linhKienDaSuDung);
            }
            xeTrongHoaDon.setListLinhKienDaSuDung(listLinhKienDaSuDung);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
     
    public boolean addLinhKienDaSuDung(LinhKienDaSuDung linhKienDaSuDung, int idXeTrongHoaDon){
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO tblLinhKienDaSuDung(SoLuong,Gia,tblLinhKienID,tblXeTrongHoaDonID) VALUES (?,?,?,?)");
            ps.setInt(1,linhKienDaSuDung.getSoLuong());
            ps.setFloat(2,linhKienDaSuDung.getGia());
            ps.setInt(3,linhKienDaSuDung.getLinhKien().getId());
            ps.setInt(4, idXeTrongHoaDon);
            
            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean deleteLinhKienDaSuDung(int id){
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM tblLinhKienDaSuDung WHERE ID = ?");
            ps.setInt(1,id);
            ps.executeUpdate();
            
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }       
    }
}
