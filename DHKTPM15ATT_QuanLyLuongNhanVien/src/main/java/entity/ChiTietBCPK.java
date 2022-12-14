package entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;


@Embeddable
public class ChiTietBCPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7196050546704497968L;
	private String banCong;
	private String nhanVien;
	
	public ChiTietBCPK() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((banCong == null) ? 0 : banCong.hashCode());
		result = prime * result + ((nhanVien == null) ? 0 : nhanVien.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietBCPK other = (ChiTietBCPK) obj;
		if (banCong == null) {
			if (other.banCong != null)
				return false;
		} else if (!banCong.equals(other.banCong))
			return false;
		if (nhanVien == null) {
			if (other.nhanVien != null)
				return false;
		} else if (!nhanVien.equals(other.nhanVien))
			return false;
		return true;
	}

	
}
