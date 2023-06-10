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
public class DichVuDaSuDung implements Serializable{
    private int id;
    private int soluong;
    private float gia;
    private float thanhtien;
    private DichVu dichVu;

    public DichVuDaSuDung() {
    }

    public DichVuDaSuDung(int id, int soluong, float gia, float thanhtien, DichVu dichVu) {
        this.id = id;
        this.soluong = soluong;
        this.gia = gia;
        this.thanhtien = thanhtien;
        this.dichVu = dichVu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public float getThanhtien() {
        return soluong*gia;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }
    
}
