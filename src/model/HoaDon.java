/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author tuann
 */
public class HoaDon implements Serializable{
    private int id;
    private float tongTien;
    private KhachHang khachHang;
    private NhanVien nhanVienThuNgan;
    private ArrayList<XeTrongHoaDon> listXeTrongHoaDon;

    public HoaDon() {
    }

    public HoaDon(int id, float tongTien, KhachHang khachHang, NhanVien nhanVienThuNgan, ArrayList<XeTrongHoaDon> listXeTrongHoaDon) {
        this.id = id;
        this.tongTien = tongTien;
        this.khachHang = khachHang;
        this.nhanVienThuNgan = nhanVienThuNgan;
        this.listXeTrongHoaDon = listXeTrongHoaDon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTinhTien() {
        for(XeTrongHoaDon xeTrongHoaDon : listXeTrongHoaDon){
            for(DichVuDaSuDung dichVuDaSuDung : xeTrongHoaDon.getListDichVuDaSuDung()){
                tongTien += dichVuDaSuDung.getThanhtien();
            }
            for(LinhKienDaSuDung linhKienDaSuDung : xeTrongHoaDon.getListLinhKienDaSuDung()){
                tongTien += linhKienDaSuDung.getThanhTien();
            }
        }
        return tongTien;
    }
    public float getTongTien(){
        return tongTien;
    }
    public void setTongTien(float tongTien){
        this.tongTien = tongTien;
    }
    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVienThuNgan() {
        return nhanVienThuNgan;
    }

    public void setNhanVienThuNgan(NhanVien nhanVienThuNgan) {
        this.nhanVienThuNgan = nhanVienThuNgan;
    }

    public ArrayList<XeTrongHoaDon> getListXeTrongHoaDon() {
        if(listXeTrongHoaDon == null){
            listXeTrongHoaDon = new ArrayList<XeTrongHoaDon>();
        }
        return listXeTrongHoaDon;
    }

    public void setListXeTrongHoaDon(ArrayList<XeTrongHoaDon> listXeTrongHoaDon) {
        this.listXeTrongHoaDon = listXeTrongHoaDon;
    }
    
}
