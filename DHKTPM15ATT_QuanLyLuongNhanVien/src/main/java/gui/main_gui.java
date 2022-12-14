package gui;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import com.toedter.calendar.JDateChooser;

public class main_gui extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4217490781647369768L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNhanVien, mnPhongBan, mnBanCong, mnCTBanCong;
	private JMenuItem mnNhanVien1, mnPhongBan2, mnBanCong3, mnCTBanCong4;
	private JTabbedPane tabbedPane;
	private JPanel pnTrangChu, pnNhanVien, pnPhongBan, pnBanCong, pnCTBanCong;
	
	private JRadioButton radNam1, radNu1;
	private JComboBox<String> cboPhongBan1, cboChucVu1;
	private JTextField txtMaNV1, txtTenNV1, txtDiaChi1, txtEmail1, txtSDT1;
	private JDateChooser dateNgayVaoLam1;
	private JTextField txtMaPhongBan2, txtTenPhongBan2;
	private JButton btnThemNV1, btnXoaNV1, btnSuaNV1, btnThemPhong2, btnXoaPhong2, btnSuaPhong2;
	private DefaultTableModel tableModelNV, tableModelPB, tableModelBC, tableModelCT;
	private JTable tableNV1, tablePB2, tableBC3, tableCT4;
	
	private JLabel lblChucVu1;
	private JLabel lblPhongBan1;
	private JLabel lblNgayVaoLam1;
	private JPanel pnPhongBan2;
	private JLabel lblMaPhong2;
	private JLabel lblTenPhong2;
	private JPanel pnBanCong3;
	private JLabel lblMaBanCong3;
	private JLabel lblTenBanCong3;
	private JTextField txtMaBanCong3;
	private JTextField txtTenBanCong3;
	private JButton btnThemBanCong3;
	private JButton btnXoaBanCong3;
	private JButton btnSuaBanCong3;
	private JPanel pnCTBanCong4;
	private JLabel lblMaNV4;
	private JLabel lblTenNV4;
	private JLabel lblMaBanCong4;
	private JLabel lblBanCong4;
	private JLabel lblSoNgay4;
	private JLabel lblSoGio4;
	private JTextField txtMaNV4;
	private JTextField txtMaBanCong4;
	private JTextField txtSoNgay4;
	private JTextField txtSoGio4;
	private JComboBox<String> cboTenNV4, cboTenBanCong4;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_gui frame = new main_gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main_gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setVisible(true);
		setTitle("Hệ thống quản lý lương");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 884, 539);
		contentPane.add(tabbedPane);
		
//		pnTrangChu = new JPanel();
//		tabbedPane.addTab("TrangChu", null, pnTrangChu, null);
//		pnTrangChu.setLayout(null);
		
		pnNhanVien = new JPanel();
		tabbedPane.addTab("NhanVien", null, pnNhanVien, null);
		pnNhanVien.setLayout(null);
		
		JPanel pnNhanVien1 = new JPanel();
		pnNhanVien1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Qu\u1EA3n l\u00FD th\u00F4ng tin nh\u00E2n vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnNhanVien1.setBounds(43, 11, 776, 221);
		pnNhanVien.add(pnNhanVien1);
		pnNhanVien1.setLayout(null);
		
		JLabel lblMaNV1 = new JLabel("Mã nhân viên");
		lblMaNV1.setBounds(20, 23, 93, 14);
		pnNhanVien1.add(lblMaNV1);
		
		JLabel lblTenNV1 = new JLabel("Tên nhân viên");
		lblTenNV1.setBounds(285, 23, 93, 14);
		pnNhanVien1.add(lblTenNV1);
		
		JLabel lblGioiTinh1 = new JLabel("Giới tính");
		lblGioiTinh1.setBounds(20, 58, 93, 14);
		pnNhanVien1.add(lblGioiTinh1);
		
		JLabel lblDiaChi1 = new JLabel("Địa chỉ");
		lblDiaChi1.setBounds(285, 58, 93, 14);
		pnNhanVien1.add(lblDiaChi1);
		
		JLabel lblEmail1 = new JLabel("Email");
		lblEmail1.setBounds(20, 99, 93, 14);
		pnNhanVien1.add(lblEmail1);
		
		JLabel lblSDT1 = new JLabel("Số điện thoại");
		lblSDT1.setBounds(285, 99, 93, 14);
		pnNhanVien1.add(lblSDT1);
		
		btnThemNV1 = new JButton("Thêm");
		btnThemNV1.setBounds(653, 19, 89, 23);
		pnNhanVien1.add(btnThemNV1);
		
		btnSuaNV1 = new JButton("Sửa");
		btnSuaNV1.setBounds(653, 129, 89, 23);
		pnNhanVien1.add(btnSuaNV1);
		
		btnXoaNV1 = new JButton("Xóa");
		btnXoaNV1.setBounds(653, 69, 89, 23);
		pnNhanVien1.add(btnXoaNV1);
		
		lblChucVu1 = new JLabel("Chức vụ");
		lblChucVu1.setBounds(285, 145, 93, 14);
		pnNhanVien1.add(lblChucVu1);
		
		lblPhongBan1 = new JLabel("Phòng ban");
		lblPhongBan1.setBounds(20, 145, 93, 14);
		pnNhanVien1.add(lblPhongBan1);
		
		txtMaNV1 = new JTextField();
		txtMaNV1.setBounds(115, 20, 162, 20);
		pnNhanVien1.add(txtMaNV1);
		txtMaNV1.setColumns(10);
		
		cboPhongBan1 = new JComboBox();
		cboPhongBan1.setBounds(115, 141, 162, 22);
		pnNhanVien1.add(cboPhongBan1);
		
		cboChucVu1 = new JComboBox();
		cboChucVu1.setBounds(388, 141, 162, 22);
		pnNhanVien1.add(cboChucVu1);
		
		radNam1 = new JRadioButton("Nam");
		radNam1.setBounds(118, 54, 58, 23);
		radNam1.setSelected(true);
		pnNhanVien1.add(radNam1);
		
		radNu1 = new JRadioButton("Nữ");
		radNu1.setBounds(221, 54, 58, 23);
		pnNhanVien1.add(radNu1);
		
		ButtonGroup groupGioiTinh = new ButtonGroup();
		groupGioiTinh.add(radNam1);
		groupGioiTinh.add(radNu1);
		
		txtTenNV1 = new JTextField();
		txtTenNV1.setColumns(10);
		txtTenNV1.setBounds(388, 20, 162, 20);
		pnNhanVien1.add(txtTenNV1);
		
		txtDiaChi1 = new JTextField();
		txtDiaChi1.setColumns(10);
		txtDiaChi1.setBounds(388, 55, 162, 20);
		pnNhanVien1.add(txtDiaChi1);
		
		txtEmail1 = new JTextField();
		txtEmail1.setColumns(10);
		txtEmail1.setBounds(115, 96, 162, 20);
		pnNhanVien1.add(txtEmail1);
		
		txtSDT1 = new JTextField();
		txtSDT1.setColumns(10);
		txtSDT1.setBounds(388, 96, 162, 20);
		pnNhanVien1.add(txtSDT1);
		
		lblNgayVaoLam1 = new JLabel("Ngày vào làm");
		lblNgayVaoLam1.setBounds(20, 186, 93, 14);
		pnNhanVien1.add(lblNgayVaoLam1);
		
		dateNgayVaoLam1 = new JDateChooser();
		dateNgayVaoLam1.setDateFormatString("dd-MM-yyyy");
		dateNgayVaoLam1.setBounds(115, 186, 162, 20);
		pnNhanVien1.add(dateNgayVaoLam1);
		
		pnPhongBan = new JPanel();
		tabbedPane.addTab("PhongBan", null, pnPhongBan, null);
		pnPhongBan.setLayout(null);
		
		pnPhongBan2 = new JPanel();
		pnPhongBan2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Qu\u1EA3n l\u00FD ph\u00F2ng ban", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnPhongBan2.setBounds(26, 11, 381, 152);
		pnPhongBan.add(pnPhongBan2);
		pnPhongBan2.setLayout(null);
		
		lblMaPhong2 = new JLabel("Mã phòng ban");
		lblMaPhong2.setBounds(29, 28, 77, 14);
		pnPhongBan2.add(lblMaPhong2);
		
		lblTenPhong2 = new JLabel("Tên phòng ban");
		lblTenPhong2.setBounds(29, 75, 77, 14);
		pnPhongBan2.add(lblTenPhong2);
		
		txtMaPhongBan2 = new JTextField();
		txtMaPhongBan2.setBounds(132, 25, 183, 20);
		pnPhongBan2.add(txtMaPhongBan2);
		txtMaPhongBan2.setColumns(10);
		
		txtTenPhongBan2 = new JTextField();
		txtTenPhongBan2.setColumns(10);
		txtTenPhongBan2.setBounds(132, 72, 183, 20);
		pnPhongBan2.add(txtTenPhongBan2);
		
		btnThemPhong2 = new JButton("Thêm");
		btnThemPhong2.setBounds(29, 108, 89, 23);
		pnPhongBan2.add(btnThemPhong2);
		
		btnXoaPhong2 = new JButton("Xóa");
		btnXoaPhong2.setBounds(153, 108, 89, 23);
		pnPhongBan2.add(btnXoaPhong2);
		
		btnSuaPhong2 = new JButton("Sửa");
		btnSuaPhong2.setBounds(270, 108, 89, 23);
		pnPhongBan2.add(btnSuaPhong2);
		
		pnBanCong = new JPanel();
		tabbedPane.addTab("BanCong", null, pnBanCong, null);
		pnBanCong.setLayout(null);
		
		pnBanCong3 = new JPanel();
		pnBanCong3.setLayout(null);
		pnBanCong3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Qu\u1EA3n l\u00FD b\u00E0n c\u00F4ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnBanCong3.setBounds(37, 11, 381, 152);
		pnBanCong.add(pnBanCong3);
		
		lblMaBanCong3 = new JLabel("Mã bàn công");
		lblMaBanCong3.setBounds(29, 28, 77, 14);
		pnBanCong3.add(lblMaBanCong3);
		
		lblTenBanCong3 = new JLabel("Tên bàn công");
		lblTenBanCong3.setBounds(29, 75, 77, 14);
		pnBanCong3.add(lblTenBanCong3);
		
		txtMaBanCong3 = new JTextField();
		txtMaBanCong3.setColumns(10);
		txtMaBanCong3.setBounds(132, 25, 183, 20);
		pnBanCong3.add(txtMaBanCong3);
		
		txtTenBanCong3 = new JTextField();
		txtTenBanCong3.setColumns(10);
		txtTenBanCong3.setBounds(132, 72, 183, 20);
		pnBanCong3.add(txtTenBanCong3);
		
		btnThemBanCong3 = new JButton("Thêm");
		btnThemBanCong3.setBounds(29, 108, 89, 23);
		pnBanCong3.add(btnThemBanCong3);
		
		btnXoaBanCong3 = new JButton("Xóa");
		btnXoaBanCong3.setBounds(153, 108, 89, 23);
		pnBanCong3.add(btnXoaBanCong3);
		
		btnSuaBanCong3 = new JButton("Sửa");
		btnSuaBanCong3.setBounds(270, 108, 89, 23);
		pnBanCong3.add(btnSuaBanCong3);
		
		pnCTBanCong = new JPanel();
		tabbedPane.addTab("CTBanCong", null, pnCTBanCong, null);
		pnCTBanCong.setLayout(null);
		
		pnCTBanCong4 = new JPanel();
		pnCTBanCong4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Qu\u1EA3n l\u00FD chi ti\u1EBFt b\u00E0n c\u00F4ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnCTBanCong4.setBounds(33, 11, 789, 180);
		pnCTBanCong.add(pnCTBanCong4);
		pnCTBanCong4.setLayout(null);
		
		lblMaNV4 = new JLabel("Mã nhân viên");
		lblMaNV4.setBounds(29, 26, 87, 14);
		pnCTBanCong4.add(lblMaNV4);
		
		lblTenNV4 = new JLabel("Tên nhân viên");
		lblTenNV4.setBounds(330, 26, 87, 14);
		pnCTBanCong4.add(lblTenNV4);
		
		lblMaBanCong4 = new JLabel("Mã bàn công");
		lblMaBanCong4.setBounds(29, 68, 87, 14);
		pnCTBanCong4.add(lblMaBanCong4);
		
		lblBanCong4 = new JLabel("Tên Bàn Công");
		lblBanCong4.setBounds(330, 68, 87, 14);
		pnCTBanCong4.add(lblBanCong4);
		
		lblSoNgay4 = new JLabel("Số ngày làm công");
		lblSoNgay4.setBounds(29, 111, 87, 14);
		pnCTBanCong4.add(lblSoNgay4);
		
		lblSoGio4 = new JLabel("Số giờ làm công");
		lblSoGio4.setBounds(330, 111, 87, 14);
		pnCTBanCong4.add(lblSoGio4);
		
		txtMaNV4 = new JTextField();
		txtMaNV4.setBounds(138, 23, 168, 20);
		txtMaNV4.setEditable(false);
		pnCTBanCong4.add(txtMaNV4);
		txtMaNV4.setColumns(10);
		
		txtMaBanCong4 = new JTextField();
		txtMaBanCong4.setColumns(10);
		txtMaBanCong4.setBounds(138, 65, 168, 20);
		txtMaBanCong4.setEditable(false);
		pnCTBanCong4.add(txtMaBanCong4);
		
		txtSoNgay4 = new JTextField();
		txtSoNgay4.setColumns(10);
		txtSoNgay4.setBounds(138, 108, 168, 20);
		pnCTBanCong4.add(txtSoNgay4);
		
		txtSoGio4 = new JTextField();
		txtSoGio4.setColumns(10);
		txtSoGio4.setBounds(450, 108, 168, 20);
		pnCTBanCong4.add(txtSoGio4);
		
		cboTenNV4 = new JComboBox();
		cboTenNV4.setBounds(450, 22, 168, 22);
		pnCTBanCong4.add(cboTenNV4);
		
		cboTenBanCong4 = new JComboBox();
		cboTenBanCong4.setBounds(450, 64, 168, 22);
		pnCTBanCong4.add(cboTenBanCong4);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		mnNhanVien = new JMenu("Nhân Viên");
		menuBar.add(mnNhanVien);
		mnPhongBan = new JMenu("Phòng Ban");
		
		menuBar.add(mnPhongBan);
		mnBanCong = new JMenu("Bàn Công");
		
		menuBar.add(mnBanCong);
		mnCTBanCong = new JMenu("Chi Tiết Bàn Công");

		menuBar.add(mnCTBanCong);
		
		mnNhanVien1 = new JMenuItem("Quản lý nhân viên");
		mnNhanVien.add(mnNhanVien1);
		mnPhongBan2 = new JMenuItem("Quản lý phòng ban");
		mnPhongBan.add(mnPhongBan2);
		mnBanCong3 = new JMenuItem("Quản lý bàn công");
		mnBanCong.add(mnBanCong3);
		mnCTBanCong4 = new JMenuItem("Quản lý chi tiết bàn công");
		mnCTBanCong.add(mnCTBanCong4);
		

		String[] headersNV = "Mã Nv;Tên Nv;Giới tính;Địa chỉ;Email;SDT;Phòng ban;Chức vụ;Ngày vào làm".split(";");
		tableModelNV  = new DefaultTableModel(headersNV,0);
		JScrollPane scrollNV = new JScrollPane();
		scrollNV.setBounds(21, 243, 836, 257);
		pnNhanVien.add(scrollNV);
		scrollNV.setViewportBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		scrollNV.setViewportView(tableNV1 = new JTable(tableModelNV));
		tableNV1.setRowHeight(25);
		tableNV1.setAutoCreateRowSorter(true);
		tableNV1.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		
		String[] headersPB = "Mã phòng ban;Tên phòng ban".split(";");
		tableModelPB  = new DefaultTableModel(headersPB,0);
		JScrollPane scrollPB = new JScrollPane();
		scrollPB.setBounds(429, 4, 440, 161);
		pnPhongBan.add(scrollPB);
		scrollPB.setViewportBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		scrollPB.setViewportView(tablePB2 = new JTable(tableModelPB));
		tablePB2.setRowHeight(25);
		tablePB2.setAutoCreateRowSorter(true);
		tablePB2.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		
		String[] headersBC = "Mã bàn công;Tên bàn công".split(";");
		tableModelBC  = new DefaultTableModel(headersBC,0);
		JScrollPane scrollBC = new JScrollPane();
		scrollBC.setBounds(429, 4, 440, 161);
		pnBanCong.add(scrollBC);
		scrollBC.setViewportBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		scrollBC.setViewportView(tableBC3 = new JTable(tableModelBC));
		tableBC3.setRowHeight(25);
		tableBC3.setAutoCreateRowSorter(true);
		tableBC3.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		
		String[] headersCT = "Mã Nv;Tên Nv;Mã bàn công;Tên bàn công;Số ngày làm công;Số giờ làm công".split(";");
		tableModelCT  = new DefaultTableModel(headersCT,0);
		JScrollPane scrollCT = new JScrollPane();
		scrollCT.setBounds(21, 243, 836, 257);
		pnCTBanCong.add(scrollCT);
		scrollCT.setViewportBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		scrollCT.setViewportView(tableCT4 = new JTable(tableModelCT));
		tableCT4.setRowHeight(25);
		tableCT4.setAutoCreateRowSorter(true);
		tableCT4.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		
//		JLabel lblTrangChuImg;
//		lblTrangChuImg = new JLabel();
//		lblTrangChuImg.setBounds(20, 10, 859, 501);
//		pnTrangChu.add(lblTrangChuImg);
//		lblTrangChuImg.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage(main_gui.class.getResource("mainbg_img.png"))));
		mnNhanVien1.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage(main_gui.class.getResource("nhanvien_icon.png"))));
		mnPhongBan2.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage(main_gui.class.getResource("phongban_icon.png"))));
		mnBanCong3.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage(main_gui.class.getResource("quanly_icon.png"))));
		mnCTBanCong4.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage(main_gui.class.getResource("thongke_icon.png"))));	
		
		mnNhanVien1.addActionListener(this);
		mnPhongBan2.addActionListener(this);
		mnBanCong3.addActionListener(this);
		mnCTBanCong4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if(o.equals(mnNhanVien1)) tabbedPane.setSelectedIndex(0);
		if(o.equals(mnPhongBan2)) tabbedPane.setSelectedIndex(1);
		if(o.equals(mnBanCong3)) tabbedPane.setSelectedIndex(2);
		if(o.equals(mnCTBanCong4)) tabbedPane.setSelectedIndex(3);
		
	}
}
