package daoimlp;

import java.rmi.RemoteException;
import java.util.List;

import jakarta.persistence.EntityTransaction;

import dao.TaiKhoanDAO;
import entity.NhanVien;
import entity.TaiKhoan;

public class TaiKhoanImpl extends AbstractImpl implements TaiKhoanDAO{

	public TaiKhoanImpl() throws RemoteException {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2450651112955563560L;

	@Override
	public boolean themUS(TaiKhoan tk) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean capNhatUS(TaiKhoan tk) throws RemoteException {
		// TODO Auto-generated method stub
		return capNhat(tk);
	}

	@Override
	public boolean xoaUS(String maUS) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TaiKhoan layUSTheoMa(String maUS) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TaiKhoan> layDSUSTheoTen(String tenUS) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TaiKhoan> layDSUS() {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			@SuppressWarnings("unchecked")
			List<TaiKhoan> list = em.createNativeQuery("select [password] from[dbo].[NhanVien]", NhanVien.class).getResultList();
			tr.commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return null;
	}

}
 