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
public class NhanVienLamDichVu implements Serializable{
    private int id;
    private DichVuDaSuDung dichVuDaSuDung;
    private NhanVien nhanVienKyThuat;

    public NhanVienLamDichVu() {
    }

    public NhanVienLamDichVu(int id, DichVuDaSuDung dichVuDaSuDung, NhanVien nhanVienKyThuat) {
        this.id = id;
        this.dichVuDaSuDung = dichVuDaSuDung;
        this.nhanVienKyThuat = nhanVienKyThuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DichVuDaSuDung getDichVuDaSuDung() {
        return dichVuDaSuDung;
    }

    public void setDichVuDaSuDung(DichVuDaSuDung dichVuDaSuDung) {
        this.dichVuDaSuDung = dichVuDaSuDung;
    }

    public NhanVien getNhanVienKyThuat() {
        return nhanVienKyThuat;
    }

    public void setNhanVienKyThuat(NhanVien nhanVienKyThuat) {
        this.nhanVienKyThuat = nhanVienKyThuat;
    }
    
}
