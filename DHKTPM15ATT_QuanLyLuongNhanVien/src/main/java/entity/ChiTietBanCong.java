package entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
@IdClass(ChiTietBCPK.class)
public class ChiTietBanCong implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6344306518551781485L;
	@Id
	@ManyToOne
	@JoinColumn(name = "maNV")
	private NhanVien nhanVien;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "maBC")
	private BanCong banCong;

	@Id
	private int soNgayLamCong;
	private int soGioLamCong;
	
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanvien) {
		this.nhanVien = nhanvien;
	}
	public BanCong getBanCong() {
		return banCong;
	}
	public void setBanCong(BanCong bancong) {
		this.banCong = bancong;
	}
	public int getSoNgayLamCong() {
		return soNgayLamCong;
	}
	public void setSoNgayLamCong(int songayLamCong) {
		this.soNgayLamCong = songayLamCong;
	}
	public int getSoGioLamCong() {
		return soGioLamCong;
	}
	public void setSoGioLamCong(int sogioLamCong) {
		this.soGioLamCong = sogioLamCong;
	}
	
	public ChiTietBanCong(NhanVien nhanvien, BanCong banCong, int soNgayLamCong, int soGioLamCong) {
		super();
		this.nhanVien =  nhanvien;
		this.banCong = banCong;
		this.soNgayLamCong = soNgayLamCong;
		this.soGioLamCong = soGioLamCong;
	}
	public ChiTietBanCong() {
		super();
	}
	
	public float getThanhTien() {
		return (float) (this.soNgayLamCong *100000 + this.soGioLamCong*15000);
	}
	
	@Override
	public String toString() {
		return "ChiTietBanCong [ nhanVien=" + nhanVien.getMaNV() + ", banCong=" + banCong.getMaBC() + ", soNgayLamCong=" + soNgayLamCong + ", soGioLamCong="
				+ soGioLamCong+ ", ThanhTien=" + getThanhTien()  + "]";
	}
}
