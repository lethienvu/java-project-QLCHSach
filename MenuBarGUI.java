/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.*;

/**
 *
 * @author thienvu
 */
public class MenuBarGUI {
    private JMenuBar mb;
    private JMenu heThong, hoaDon, sanPham, phieuNhap, khachHang, nhanVien, taiKhoan;
    private JMenuItem themHD, suaHD, xoaHD, xemHD;
    private JMenuItem themSP, suaSP, xoaSP, xemSP;
    private JMenuItem themPN, suaPN, xoaPN, xemPN;
    private JMenuItem themKH, suaKH, xoaKH, xemKH;
    private JMenuItem themNV, suaNV, xoaNV, xemNV;
    public MenuBarGUI(){}
    public JMenuBar createMenuBar(){
        mb = new JMenuBar();
        //Các menu
        heThong = new JMenu("Hệ thống");
        hoaDon = new JMenu("Hóa đơn");
        sanPham = new JMenu("Sản phẩm");
        phieuNhap = new JMenu("Phiếu nhập");
        khachHang = new JMenu("Khách hàng");
        nhanVien = new JMenu("Nhân viên");
        taiKhoan = new JMenu("Tài khoản");
        
        //Các MenuItem
        themHD = new JMenuItem("Tạo hóa đơn");
        suaHD = new JMenuItem("Chỉnh sửa hóa đơn");
        xoaHD = new JMenuItem("Xóa hóa đơn");
        xemHD = new JMenuItem("Xem hóa đơn");
        
        themSP = new JMenuItem("Thêm sản phẩm");
        suaSP = new JMenuItem("Chỉnh sửa sản phẩm");
        xoaSP = new JMenuItem("Xóa sản phẩm");
        xemSP = new JMenuItem("Xem sản phẩm");
        
        themPN = new JMenuItem("Tạo phiếu nhập");
        suaPN = new JMenuItem("Chỉnh sửa phiếu nhập");
        xoaPN = new JMenuItem("Xóa phiếu nhập");
        xemPN = new JMenuItem("Xem phiếu nhập");
        
        themKH = new JMenuItem("Thêm khách hàng");
        suaKH = new JMenuItem("Chỉnh sửa khách hàng");
        xoaKH = new JMenuItem("Xóa khách hàng");
        xemKH = new JMenuItem("Xem khách hàng");
        
        themNV = new JMenuItem("Thêm nhân viên");
        suaNV = new JMenuItem("Chỉnh sửa nhân viên");
        xoaNV = new JMenuItem("Xóa nhân viên");
        xemNV = new JMenuItem("Xem nhân viên");
        
        hoaDon.add(themHD);      hoaDon.add(suaHD);     hoaDon.add(xoaHD);      hoaDon.add(xemHD); 
        sanPham.add(themSP);    sanPham.add(suaSP);    sanPham.add(xoaSP);    sanPham.add(xemSP);  
        phieuNhap.add(themPN);  phieuNhap.add(suaPN);  phieuNhap.add(xoaPN);  phieuNhap.add(xemPN);
        khachHang.add(themKH);  khachHang.add(suaKH);  khachHang.add(xoaKH);  khachHang.add(xemKH);
        nhanVien.add(themNV);   nhanVien.add(suaNV);   nhanVien.add(xoaNV);   nhanVien.add(xemNV);   
        mb.add(heThong); mb.add(hoaDon); mb.add(sanPham); mb.add(phieuNhap); mb.add(khachHang); mb.add(nhanVien);   mb.add(taiKhoan);   
        
        return mb;
    }
}
