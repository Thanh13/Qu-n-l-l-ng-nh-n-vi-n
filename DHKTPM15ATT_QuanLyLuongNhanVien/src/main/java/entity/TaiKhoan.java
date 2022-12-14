package entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class TaiKhoan implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8388586631175879012L;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TaiKhoan(String password) {
		super();
		this.password = password;
	}

	public TaiKhoan() {
		super();
	}

	@Override
	public String toString() {
		return "TaiKhoan [password=" + password + "]";
	}

	
}
