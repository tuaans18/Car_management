/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tuann
 */
public class XeTrongHoaDon implements Serializable{
    private int id;
    private Xe xe;
    private ArrayList<LinhKienDaSuDung> listLinhKienDaSuDung;
    private ArrayList<DichVuDaSuDung> listDichVuDaSuDung;
    private Date date;
    public XeTrongHoaDon() {
    }

    public XeTrongHoaDon(int id, Xe xe, ArrayList<LinhKienDaSuDung> listLinhKienDaSuDung, ArrayList<DichVuDaSuDung> listDichVuDaSuDung,Date date) {
        this.id = id;
        this.xe = xe;
        this.listLinhKienDaSuDung = listLinhKienDaSuDung;
        this.listDichVuDaSuDung = listDichVuDaSuDung;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Xe getXe() {
        return xe;
    }

    public void setXe(Xe xe) {
        this.xe = xe;
    }

    public ArrayList<LinhKienDaSuDung> getListLinhKienDaSuDung() {
        if(listLinhKienDaSuDung == null) {
            listLinhKienDaSuDung = new ArrayList<LinhKienDaSuDung>();
        }
        return listLinhKienDaSuDung;
    }

    public void setListLinhKienDaSuDung(ArrayList<LinhKienDaSuDung> listLinhKienDaSuDung) {
        this.listLinhKienDaSuDung = listLinhKienDaSuDung;
    }

    public ArrayList<DichVuDaSuDung> getListDichVuDaSuDung() {
        if(listDichVuDaSuDung == null) {
            listDichVuDaSuDung = new ArrayList<DichVuDaSuDung>();
        }
        return listDichVuDaSuDung;
    }

    public void setListDichVuDaSuDung(ArrayList<DichVuDaSuDung> listDichVuDaSuDung) {
        this.listDichVuDaSuDung = listDichVuDaSuDung;
    }
    
}
