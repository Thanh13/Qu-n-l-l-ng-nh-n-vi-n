package entity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class NhanVien implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4994751618467610179L;
	@Id
	private String maNV;
	@Column(columnDefinition = "nvarchar(255)")
	private String tenNV;
	@Column(columnDefinition = "nvarchar(255)")
	private String diaChi;
	@Column(columnDefinition = "nvarchar(255)")
	private String gioiTinh;
	@Column(columnDefinition = "nvarchar(255)")
	private String email;
	private Date ngayVaoLam;
	@Column(columnDefinition = "nvarchar(255)")
	private String sdt;
	@Column(columnDefinition = "nvarchar(255)")
	private String chucVu;

	
	@ManyToOne
	@JoinColumn(name = "maPhongBan")
	private PhongBan phongBan;
	

	@Embedded
	private TaiKhoan taiKhoan;

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNgayVaoLam() {
		return ngayVaoLam;
	}

	public void setNgayVaoLam(Date ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}



//	public List<HoaDon> getHoaDon() {
//		return hoaDon;
//	}
//
//	public void setHoaDon(List<HoaDon> hoaDon) {
//		this.hoaDon = hoaDon;
//	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}



	public NhanVien(String maNV, TaiKhoan taiKhoan) {
		super();
		this.maNV = maNV;
		this.taiKhoan = taiKhoan;
	}

	public NhanVien(String maNV, String tenNV, String diaChi, String gioiTinh, String email, Date ngayVaoLam,
			String sdt, String chucVu, TaiKhoan taiKhoan) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.ngayVaoLam = ngayVaoLam;
		this.sdt = sdt;
		this.chucVu = chucVu;
		this.taiKhoan = taiKhoan;
	}

	public NhanVien(String maNV, String tenNV, String diaChi, String gioiTinh, String email, Date ngayVaoLam,
			String sdt, String chucVu, PhongBan phongBan, TaiKhoan taiKhoan) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.ngayVaoLam = ngayVaoLam;
		this.sdt = sdt;
		this.chucVu = chucVu;
		this.phongBan = phongBan;
		this.taiKhoan = taiKhoan;
	}


	public NhanVien(String maNV) {
		super();
		this.maNV = maNV;
	}

	public NhanVien() {
	
	}

//	@Override
//	public String toString() {
//		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh
//				+ ", email=" + email + ", ngayVaoLam=" + ngayVaoLam + ", sdt=" + sdt + ", chucVu=" + chucVu
//				+ ", quanLy=" + quanLy + ", taiKhoan=" + taiKhoan + "]";
//	}



	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh
				+ ", email=" + email + ", ngayVaoLam=" + ngayVaoLam + ", sdt=" + sdt + ", chucVu=" + chucVu
				+ ", taiKhoan=" + taiKhoan + "]";
	}

	
	
}
