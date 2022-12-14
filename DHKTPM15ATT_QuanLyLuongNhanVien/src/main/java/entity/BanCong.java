package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class BanCong implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1050204362250290723L;
	@Id
	private String maBC;
	private Date ngayTao;
	@OneToMany(mappedBy = "banCong")
	private List<ChiTietBanCong> chiTietBanCongs;
	public String getMaBC() {
		return maBC;
	}
	public void setMaBanCong(String maBC) {
		this.maBC = maBC;
	}
	public Date getNgayTao() {
		return ngayTao;
	}
	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}
	public List<ChiTietBanCong> getChiTietBanCongs() {
		return chiTietBanCongs;
	}
	public void setChiTietBanCongs(List<ChiTietBanCong> chiTietBanCongs) {
		this.chiTietBanCongs = chiTietBanCongs;
	}
	
	public BanCong() {
	}
	public BanCong(String maBC) {
		super();
		this.maBC = maBC;
	}
	public BanCong(String maBC, Date ngayTao) {
		super();
		this.maBC = maBC;
		this.ngayTao = ngayTao;
	}
	public BanCong(String maBC, Date ngayTao, List<ChiTietBanCong> chiTietBanCongs) {
		super();
		this.maBC = maBC;
		this.ngayTao = ngayTao;
		this.chiTietBanCongs = chiTietBanCongs;
	}
	public float getThanhTien(){
		float tong = 0;
		for(ChiTietBanCong ct : chiTietBanCongs) 
			tong += ct.getThanhTien();
		return tong;
	}
	@Override
	public String toString() {
		return "BanCong [maBC=" + maBC + ", ngayTao=" + ngayTao  + ", ThanhTien=" + getThanhTien() + "]";
	}
	
}
