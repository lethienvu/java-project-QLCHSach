package GUI;

import javax.swing.JFrame;
import BUS.NhanVienBUS;
import BUS.CheckText;
import DTO.NhanVienDTO;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.System.Logger;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.MessageFormat;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NhanVienGUI extends javax.swing.JFrame {
    NhanVienBUS nvBUS = new NhanVienBUS();

    public NhanVienGUI() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        /*
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        setSize((int)width,(int) height);
        */
        /*
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int)tk.getScreenSize().getWidth();
        int ysize = (int)tk.getScreenSize().getHeight();
        Insets scnMax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskBarSize = scnMax.bottom;
        this.setSize(xsize, ysize);
        */
        loadNhanVienlist();
        setLocationRelativeTo(null);       
    }
    
    public void loadNhanVienlist(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Mã nhân viên");
        dtm.addColumn("Họ đệm");
        dtm.addColumn("Tên");
        dtm.addColumn("Địa chỉ");
        dtm.addColumn("Ngày sinh");
        dtm.addColumn("Giới tính");
        dtm.addColumn("Email");
        dtm.addColumn("Sdt");
        //dtm.addColumn("Trạng thái");
        Table.setModel(dtm);
        Vector<NhanVienDTO> arr = new Vector<NhanVienDTO>();
        arr = nvBUS.getAllNhanVien();
        for(int i =0; i < arr.size(); i++){
            NhanVienDTO nv = arr.get(i);
            String MaNV = nv.getMaNV();
            String HoDem = nv.getHoDem();
            String Ten = nv.getTen();
            String DiaChi = nv.getDiaChi();
            String NgaySinh = nv.getNgaySinh();
            String GioiTinh = nv.getGioiTinh();
            //String GioiTinhString;
            //if(GioiTinh == 1)
            //    GioiTinhString ="nam";
            //else
            //    GioiTinhString ="nữ";
            String Email = nv.getEmail();
            String Sdt = nv.getSdt();
            // xoá thẳng nhân viên trên Data
            //int TrangThai = nv.getTrangThai();
            //Object[] row = {MaNV,HoDem,Ten,DiaChi,NgaySinh,GioiTinh,Email,Sdt,TrangThai};
            //dtm.addRow(row);
            //xoá tạm thời trên GUI
            int TrangThai = nv.getTrangThai();
            if(TrangThai == 1){
                Object[] row = {MaNV,HoDem,Ten,DiaChi,NgaySinh,GioiTinh,Email,Sdt,TrangThai};
                            dtm.addRow(row);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        paHoadon = new javax.swing.JPanel();
        lbHoadon = new javax.swing.JLabel();
        paSanpham = new javax.swing.JPanel();
        lbSanpham = new javax.swing.JLabel();
        paKhachhang = new javax.swing.JPanel();
        lbKhachhang = new javax.swing.JLabel();
        paNhanvien = new javax.swing.JPanel();
        lbNhanVien = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbTimnhanvien = new javax.swing.JLabel();
        btnTimkiem = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        lbDanhsach = new javax.swing.JLabel();
        Table_croll = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        lbManhanvien = new javax.swing.JLabel();
        lbHodem = new javax.swing.JLabel();
        lbTen = new javax.swing.JLabel();
        lbDiachi = new javax.swing.JLabel();
        lbNgaysinh = new javax.swing.JLabel();
        lbGioitinh = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbSdt = new javax.swing.JLabel();
        txtManhanvien = new javax.swing.JTextField();
        txtHodem = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtNgaysinh = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        btnLammoi = new javax.swing.JButton();
        cmbGioitinh = new javax.swing.JComboBox<>();
        checktxtManhanvien = new javax.swing.JLabel();
        checktxtHodem = new javax.swing.JLabel();
        checktxtTen = new javax.swing.JLabel();
        checktxtDiachi = new javax.swing.JLabel();
        checktxtNgaysinh = new javax.swing.JLabel();
        checktxtEmail = new javax.swing.JLabel();
        checktxtSdt = new javax.swing.JLabel();
        findMenubar = new javax.swing.JMenuBar();
        fmeuHethong = new javax.swing.JMenu();
        fmeuHoadon = new javax.swing.JMenu();
        fmeuSanpham = new javax.swing.JMenu();
        fmeuKhachhang = new javax.swing.JMenu();
        fmeuNhanvien = new javax.swing.JMenu();
        fmeuitemXoa = new javax.swing.JMenuItem();
        fmeuTaikhoan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý cửa hàng sách");

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        paHoadon.setBackground(new java.awt.Color(255, 153, 0));

        lbHoadon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbHoadon.setText("Hoá đơn");

        javax.swing.GroupLayout paHoadonLayout = new javax.swing.GroupLayout(paHoadon);
        paHoadon.setLayout(paHoadonLayout);
        paHoadonLayout.setHorizontalGroup(
            paHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paHoadonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paHoadonLayout.setVerticalGroup(
            paHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paHoadonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHoadon, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
        );

        paSanpham.setBackground(new java.awt.Color(255, 153, 0));

        lbSanpham.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSanpham.setText("Sản phẩm");

        javax.swing.GroupLayout paSanphamLayout = new javax.swing.GroupLayout(paSanpham);
        paSanpham.setLayout(paSanphamLayout);
        paSanphamLayout.setHorizontalGroup(
            paSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paSanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paSanphamLayout.setVerticalGroup(
            paSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paSanphamLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(lbSanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        paKhachhang.setBackground(new java.awt.Color(255, 153, 0));

        lbKhachhang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbKhachhang.setText("Khách hàng");

        javax.swing.GroupLayout paKhachhangLayout = new javax.swing.GroupLayout(paKhachhang);
        paKhachhang.setLayout(paKhachhangLayout);
        paKhachhangLayout.setHorizontalGroup(
            paKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paKhachhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );
        paKhachhangLayout.setVerticalGroup(
            paKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paKhachhangLayout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addComponent(lbKhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        paNhanvien.setBackground(new java.awt.Color(255, 153, 0));

        lbNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNhanVien.setText("Nhân viên");

        javax.swing.GroupLayout paNhanvienLayout = new javax.swing.GroupLayout(paNhanvien);
        paNhanvien.setLayout(paNhanvienLayout);
        paNhanvienLayout.setHorizontalGroup(
            paNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(paNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paNhanvienLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        paNhanvienLayout.setVerticalGroup(
            paNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
            .addGroup(paNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paNhanvienLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paSanpham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paHoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paKhachhang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paNhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(paSanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paKhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(paNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        lbTimnhanvien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTimnhanvien.setText("Tìm nhân viên:");

        btnTimkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTimkiem.setIcon(new javax.swing.ImageIcon("/home/thienvu/NetBeansProjects/Java/ProjectJava_QLCHSach/image/search.png")); // NOI18N
        btnTimkiem.setText("Tìm kiếm");

        txtTimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimkiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTimnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnTimkiem)
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTimnhanvien)
                    .addComponent(btnTimkiem)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon("/home/thienvu/NetBeansProjects/Java/ProjectJava_QLCHSach/image/add.png")); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon("/home/thienvu/NetBeansProjects/Java/ProjectJava_QLCHSach/image/edit.png")); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon("/home/thienvu/NetBeansProjects/Java/ProjectJava_QLCHSach/image/delete.png")); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        lbDanhsach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDanhsach.setText("Danh sách:");

        Table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ đệm", "Tên", "Địa chỉ", "Ngày sinh", "Giới tính", "Email", "Sđt"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        Table_croll.setViewportView(Table);

        lbManhanvien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbManhanvien.setText("Mã nhân viên:");

        lbHodem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbHodem.setText("Họ đệm:");

        lbTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTen.setText("Tên:");

        lbDiachi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDiachi.setText("Địa chỉ:");

        lbNgaysinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNgaysinh.setText("Ngày sinh:");

        lbGioitinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbGioitinh.setText("Giới tính:");
        lbGioitinh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbEmail.setText("Email:");

        lbSdt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSdt.setText("Sdt:");

        txtManhanvien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtManhanvienKeyReleased(evt);
            }
        });

        txtHodem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHodemKeyReleased(evt);
            }
        });

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });
        txtTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenKeyReleased(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        txtDiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiachiActionPerformed(evt);
            }
        });
        txtDiachi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiachiKeyReleased(evt);
            }
        });

        btnLammoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLammoi.setIcon(new javax.swing.ImageIcon("/home/thienvu/NetBeansProjects/Java/ProjectJava_QLCHSach/image/clear.png")); // NOI18N
        btnLammoi.setText("Clean");
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        cmbGioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cmbGioitinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGioitinhActionPerformed(evt);
            }
        });

        checktxtManhanvien.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N

        checktxtTen.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N

        checktxtDiachi.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N

        checktxtNgaysinh.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N

        checktxtEmail.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N

        checktxtSdt.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N

        fmeuHethong.setText("Hệ thống");
        fmeuHethong.setPreferredSize(new java.awt.Dimension(59, 19));
        findMenubar.add(fmeuHethong);

        fmeuHoadon.setText("Hóa đơn");
        findMenubar.add(fmeuHoadon);

        fmeuSanpham.setText("Sản phẩm");
        findMenubar.add(fmeuSanpham);

        fmeuKhachhang.setText("Khách hàng");
        findMenubar.add(fmeuKhachhang);

        fmeuNhanvien.setText("Nhân viên");
        fmeuNhanvien.setVerifyInputWhenFocusTarget(false);

        fmeuitemXoa.setText("Xóa");
        fmeuNhanvien.add(fmeuitemXoa);

        findMenubar.add(fmeuNhanvien);

        fmeuTaikhoan.setText("Tài khoản");
        findMenubar.add(fmeuTaikhoan);

        setJMenuBar(findMenubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbDanhsach, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Table_croll, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbManhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(checktxtManhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtManhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbHodem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHodem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(checktxtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(checktxtHodem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNgaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(cmbGioitinh, 0, 180, Short.MAX_VALUE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(checktxtNgaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(checktxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checktxtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(854, 854, 854)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checktxtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbDanhsach, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Table_croll, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbManhanvien)
                    .addComponent(txtManhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgaysinh)
                    .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checktxtManhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checktxtNgaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHodem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHodem)
                    .addComponent(lbGioitinh)
                    .addComponent(cmbGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checktxtHodem, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTen)
                            .addComponent(lbEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checktxtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(checktxtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDiachi)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSdt)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checktxtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checktxtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   public void clearField(){
       txtManhanvien.setText(null);
       txtHodem.setText(null);
       txtTen.setText(null);
       txtSdt.setText(null);
       txtNgaysinh.setText(null);
       //Gioi tinh
       txtEmail.setText(null);
       txtDiachi.setText(null);
   }
       
    public void TimKiem(String str){
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        Table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    private void txtTimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimkiemKeyReleased
        String serchString = txtTimkiem.getText();
        TimKiem(serchString);
    }//GEN-LAST:event_txtTimkiemKeyReleased

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        try{
            if(txtManhanvien.getText().trim().equals("") || txtHodem.getText().trim().equals("") 
                    || txtTen.getText().trim().equals("") || txtSdt.getText().trim().equals("") ||
                    txtNgaysinh.getText().trim().equals("") || txtEmail.getText().trim().equals("") ||
                    txtDiachi.getText().trim().equals(""))
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
            else{
                NhanVienDTO nv = new NhanVienDTO();
                nv.setMaNV(txtManhanvien.getText());
                nv.setHoDem(txtHodem.getText());
                nv.setTen(txtTen.getText());
                nv.setDiaChi(txtSdt.getText());
                nv.setNgaySinh(txtNgaysinh.getText());
                nv.setGioiTinh(cmbGioitinh.getSelectedItem().toString());
                nv.setEmail(txtEmail.getText());
                nv.setSdt(txtDiachi.getText());
                nv.setTrangThai(1);
                JOptionPane.showMessageDialog(this,nvBUS.addNhanVien(nv));
                loadNhanVienlist();
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Cập nhật thất bại");
        }
    }//GEN-LAST:event_btnThemActionPerformed
    
    
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        NhanVienDTO nvDTO = new NhanVienDTO();
        nvDTO.setMaNV(txtManhanvien.getText());
        NhanVienBUS nvBUS = new NhanVienBUS();
        if(txtManhanvien.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Bạn chưa chọn nhân viên để xoá");
        }else{
            int choice = JOptionPane.showConfirmDialog(this, "bạn muốn xóa", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if(choice == JOptionPane.YES_OPTION){
                try{
                String result = nvBUS.deleteNhanVien(nvDTO);
                int TrangThai = nvDTO.getTrangThai();
                loadNhanVienlist();
                clearField();
                }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Xóa thất bại");
                }
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        clearField();
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void cmbGioitinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGioitinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGioitinhActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int row = Table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        if(row != -1){
            txtManhanvien.setText(Table.getValueAt(row, 0).toString());
            txtHodem.setText(Table.getValueAt(row, 1).toString());
            txtTen.setText(Table.getValueAt(row, 2).toString());
            txtSdt.setText(Table.getValueAt(row, 3).toString());
            txtNgaysinh.setText(Table.getValueAt(row, 4).toString());
            cmbGioitinh.setName(Table.getValueAt(row, 5).toString());
            txtEmail.setText(Table.getValueAt(row, 6).toString());
            txtDiachi.setText(Table.getValueAt(row, 7).toString());
        }
    }//GEN-LAST:event_TableMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       DefaultTableModel model = (DefaultTableModel)Table.getModel();
       try{
           if(txtManhanvien.getText().trim().equals("") || txtHodem.getText().trim().equals("") 
                    || txtTen.getText().trim().equals("") || txtSdt.getText().trim().equals("") ||
                    txtNgaysinh.getText().trim().equals("") || txtEmail.getText().trim().equals("") ||
                    txtDiachi.getText().trim().equals(""))
                JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên cần sửa");
           else{
               NhanVienDTO nv = new NhanVienDTO();
               nv.setMaNV(txtManhanvien.getText());
               nv.setHoDem(txtHodem.getText());
               nv.setTen(txtTen.getText());
               nv.setDiaChi(txtSdt.getText());
               nv.setNgaySinh(txtNgaysinh.getText());
               nv.setGioiTinh(cmbGioitinh.getSelectedItem().toString());
               nv.setEmail(txtEmail.getText());
               nv.setSdt(txtDiachi.getText());
               JOptionPane.showMessageDialog(this, nvBUS.updateNhanVien(nv));
               loadNhanVienlist();
               clearField();
           }
       }catch(Exception ex){
           JOptionPane.showMessageDialog(this, "Cập nhật thất bại");
       }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiachiActionPerformed

    private void txtManhanvienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtManhanvienKeyReleased
        if(!CheckText.isNumber(txtManhanvien.getText()))
            //JOptionPane.showMessageDialog(null,"Vui lòng chỉ nhập số");
           checktxtManhanvien.setText("Vui lòng chỉ nhập số");
    }//GEN-LAST:event_txtManhanvienKeyReleased

    private void txtHodemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHodemKeyReleased
        if(CheckText.haveNumber(txtHodem.getText()))
            checktxtHodem.setText("Không nhập số");
        if(CheckText.isName(txtHodem.getText()))
            checktxtHodem.setText("Không nhập ký tự đặc biệt");
        if(CheckText.isLength50(txtHodem.getText()))
            checktxtHodem.setText("Không quá 50 ký tự");
    }//GEN-LAST:event_txtHodemKeyReleased

    private void txtTenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKeyReleased
        if(CheckText.haveNumber(txtTen.getText()));
            checktxtTen.setText("Không nhập số");
        if(CheckText.isName(txtTen.getText()))
            checktxtTen.setText("Không nhập ký tự đặc biệt");
    }//GEN-LAST:event_txtTenKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if(!CheckText.isGmail(txtEmail.getText()))
            checktxtEmail.setText("phải có ...@gmail.com");
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtDiachiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiachiKeyReleased
        if(!CheckText.isPhoneNumber(txtDiachi.getText()))
            checktxtSdt.setText("Số điện thoại không hợp lệ");
    }//GEN-LAST:event_txtDiachiKeyReleased
    
    

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane Table_croll;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel checktxtDiachi;
    private javax.swing.JLabel checktxtEmail;
    private javax.swing.JLabel checktxtHodem;
    private javax.swing.JLabel checktxtManhanvien;
    private javax.swing.JLabel checktxtNgaysinh;
    private javax.swing.JLabel checktxtSdt;
    private javax.swing.JLabel checktxtTen;
    private javax.swing.JComboBox<String> cmbGioitinh;
    private javax.swing.JMenuBar findMenubar;
    private javax.swing.JMenu fmeuHethong;
    private javax.swing.JMenu fmeuHoadon;
    private javax.swing.JMenu fmeuKhachhang;
    private javax.swing.JMenu fmeuNhanvien;
    private javax.swing.JMenu fmeuSanpham;
    private javax.swing.JMenu fmeuTaikhoan;
    private javax.swing.JMenuItem fmeuitemXoa;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbDanhsach;
    private javax.swing.JLabel lbDiachi;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbGioitinh;
    private javax.swing.JLabel lbHoadon;
    private javax.swing.JLabel lbHodem;
    private javax.swing.JLabel lbKhachhang;
    private javax.swing.JLabel lbManhanvien;
    private javax.swing.JLabel lbNgaysinh;
    private javax.swing.JLabel lbNhanVien;
    private javax.swing.JLabel lbSanpham;
    private javax.swing.JLabel lbSdt;
    private javax.swing.JLabel lbTen;
    private javax.swing.JLabel lbTimnhanvien;
    private javax.swing.JPanel paHoadon;
    private javax.swing.JPanel paKhachhang;
    private javax.swing.JPanel paNhanvien;
    private javax.swing.JPanel paSanpham;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHodem;
    private javax.swing.JTextField txtManhanvien;
    private javax.swing.JTextField txtNgaysinh;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables

}
