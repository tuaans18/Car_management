/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author tuann
 */
public class NhanVienLamLinhKien implements Serializable{
    private int id;
    private LinhKienDaSuDung linhKienDaSuDung;
    private NhanVien nhanVienKyThuat;

    public NhanVienLamLinhKien() {
    }

    public NhanVienLamLinhKien(int id, LinhKienDaSuDung linhKienDaSuDung, NhanVien nhanVienKyThuat) {
        this.id = id;
        this.linhKienDaSuDung = linhKienDaSuDung;
        this.nhanVienKyThuat = nhanVienKyThuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinhKienDaSuDung getLinhKienDaSuDung() {
        return linhKienDaSuDung;
    }

    public void setLinhKienDaSuDung(LinhKienDaSuDung linhKienDaSuDung) {
        this.linhKienDaSuDung = linhKienDaSuDung;
    }

    public NhanVien getNhanVienKyThuat() {
        return nhanVienKyThuat;
    }

    public void setNhanVienKyThuat(NhanVien nhanVienKyThuat) {
        this.nhanVienKyThuat = nhanVienKyThuat;
    }
    
}
