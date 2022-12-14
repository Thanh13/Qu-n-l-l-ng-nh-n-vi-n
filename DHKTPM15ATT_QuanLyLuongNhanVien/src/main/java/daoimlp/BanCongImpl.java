package daoimlp;

import entity.BanCong;
import java.rmi.RemoteException;
import java.util.List;

import jakarta.persistence.EntityTransaction;

import dao.BanCongDAO;

public class BanCongImpl  extends AbstractImpl implements BanCongDAO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6672068482940626024L;

	public BanCongImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean themBC(BanCong bc) throws RemoteException {
		return them(bc);
	}

	@Override
	public boolean capNhatBC(BanCong bc) throws RemoteException {
		return capNhat(bc);
	}

	@Override
	public boolean xoaBC(String maBC) throws RemoteException {
		return xoa(maBC,BanCong.class);
	}

	@Override
	public BanCong layBCTheoMa(String maBC) throws RemoteException {
		return (BanCong) getSingle("select * from BanCong where maBC = '" +maBC+ "'", BanCong.class);
	}

	@Override
	public List<BanCong> layDSBCTheoTen(String tenBC) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BanCong> layDSBC() throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			@SuppressWarnings("unchecked")
			List<BanCong> list = em.createNativeQuery("select * from BanCong order by maBC DESC", BanCong.class).getResultList();
			tr.commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return null;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<BanCong> layLuongTheoThang(String dk, String dk2) throws RemoteException {
		List<?> ds = getList("select * from BanCong bc where bc.ngayTao >= '"+dk+"' and bc.ngayTao <= '"+ dk2 +"'", BanCong.class);
		return (List<BanCong>) ds;
	
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String getMaBCMoi() throws RemoteException {
		String maBC = null;
		jakarta.persistence.EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			List rs = em.createNativeQuery("select max( CONVERT(int , SUBSTRING(maHD,3 , 6))) from BanCong").setMaxResults(1).getResultList();
			maBC ="BC" + String.format("%06d", Integer.parseInt(rs.get(0).toString()) + 1 );
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return maBC;
	}

}
