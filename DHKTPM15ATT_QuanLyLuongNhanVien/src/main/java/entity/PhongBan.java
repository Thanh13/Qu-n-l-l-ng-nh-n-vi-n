package entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class PhongBan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4371582851637178956L;
	@Id
	private String maPhongBan;
	@Column(columnDefinition = "nvarchar(255)")
	private String tenPhongBan;
	
	@OneToMany(mappedBy = "phongBan")
	private List<NhanVien> nhanVien;
	
	public String getMaPhongBan() {
		return maPhongBan;
	}
	public void setMaPhongBan(String maphongBan) {
		this.maPhongBan = maphongBan;
	}
	public String getTenPhongBan() {
		return tenPhongBan;
	}
	public void setTenPhongBan(String tenphongBan) {
		this.tenPhongBan = tenphongBan;
	}
	
	public List<NhanVien> getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(List<NhanVien> nhanvien) {
		this. nhanVien =  nhanvien;
	}
	public PhongBan(String maphongBan, String tenphongBan) {
		super();
		this.maPhongBan = maphongBan;
		this.tenPhongBan = tenphongBan;
	}
	public PhongBan(String maphongBan) {
		super();
		this.maPhongBan = maphongBan;
	}
	public PhongBan() {
	}
	@Override
	public String toString() {
		return "LoaiSP [maphongBan=" + maPhongBan + ", tenphongBan=" + tenPhongBan + "]";
	}
}
