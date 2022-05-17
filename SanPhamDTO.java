/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author thienvu
 */
public class SanPhamDTO {
    private String maSP;
    private String tenSP;
    private int giaBan;
    private int soLuong;
    private String nhaXuatBan;
    private String nhaCungCap;
    private int tinhTrang = 1;

    public SanPhamDTO() {
    }

    public SanPhamDTO(String maSP, String tenSP, int giaBan, int soLuong, String nhaXuatBan, String nhaCungCap) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
        this.nhaCungCap = nhaCungCap;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
