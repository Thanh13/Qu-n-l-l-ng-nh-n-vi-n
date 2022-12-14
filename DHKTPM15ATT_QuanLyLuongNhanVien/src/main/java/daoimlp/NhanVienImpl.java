package daoimlp;

import java.rmi.RemoteException;
import java.util.List;

import dao.NhanVienDAO;
import entity.NhanVien;
import jakarta.persistence.EntityTransaction;
public class NhanVienImpl  extends AbstractImpl implements NhanVienDAO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2515533034531292018L;

	public NhanVienImpl() throws RemoteException {
		super();
	}
	@Override
	public boolean themNV(NhanVien NV) throws RemoteException {
		return them(NV);
	}

	public boolean capNhatNV(NhanVien NV) throws RemoteException {
		return capNhat(NV);
	}

	@Override
	public boolean xoaNV(String maNV) throws RemoteException {
		return xoa(maNV, NhanVien.class);
	}
	@Override
	public NhanVien layNVTheoMa(String maNV) throws RemoteException {
		return (NhanVien) getSingle("select * from NhanVien where maNV = '" + maNV + "'", NhanVien.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NhanVien> layDSNVTheoTen(String tenNV) throws RemoteException {
		List<?> ds = getList("select * from NhanVien where tenNV like '%" + tenNV + "%'", NhanVien.class);
//		for(Object o : ds)
//			System.out.println(o);
		return (List<NhanVien>) ds;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NhanVien> layDSNVTheoMa(String maNV) throws RemoteException {
		List<?> ds = getList("select * from NhanVien where maNV like '%" + maNV + "%'", NhanVien.class);
//		for(Object o : ds)
//			System.out.println(o);
		return (List<NhanVien>) ds;
	
	}

	@Override
	public List<NhanVien> layDSNV() throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			@SuppressWarnings("unchecked")
			List<NhanVien> list = em.createNativeQuery("select * from NhanVien", NhanVien.class).getResultList();
			tr.commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return null;
	}

	@Override
	public String getMaNVMoi() throws RemoteException {
		String maNV = null;
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			@SuppressWarnings("rawtypes")
			List rs = em.createNativeQuery("select max( CONVERT(int , SUBSTRING(maNV,5 , 6))) from NhanVien").setMaxResults(1).getResultList();
			maNV ="NVIE" + String.format("%04d", Integer.parseInt(rs.get(0).toString()) + 1 );
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return maNV;
	}

}
