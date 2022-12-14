package daoimlp;

import java.rmi.RemoteException;
import java.util.List;

import dao.PhongBanDAO;
import entity.PhongBan;
import jakarta.persistence.EntityTransaction;

public class PhongBanImpl extends AbstractImpl implements PhongBanDAO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5177087130670582080L;

	public PhongBanImpl() throws RemoteException {
		super();
	}
	
	@Override
	public List<PhongBan> layDSPB() throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			@SuppressWarnings("unchecked")
			List<PhongBan> list = em.createNativeQuery("select * from PhongBan", PhongBan.class).getResultList();
			tr.commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return null;
	}

	@Override
	public PhongBan getPhongBanTheoMa(String maPhongBan) throws RemoteException {
		return (PhongBan) getSingle("select * from PhongBan where maPhongBan = '" + maPhongBan + "'", PhongBan.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PhongBan> getPhongBanCTheoTen(String tenPhongBan) throws RemoteException {
		List<?> ds = getList("Select * from PhongBan where tenPhongBan = N'"+tenPhongBan+"' order by maPhongBan", PhongBan.class);

		return (List<PhongBan>) ds;
	}

	@Override
	public PhongBan getPBTheoTenFirst(String tenPhongBan) throws RemoteException {
		// TODO Auto-generated method stub
		return (PhongBan) getSingle("Select * from PhongBan where tenPhongBan = N'" +tenPhongBan+"' order by maPhongBan", PhongBan.class);
	}

	@Override
	public boolean themPB(PhongBan NV) throws RemoteException {
		// TODO Auto-generated method stub
		return them(NV);
	}

	@Override
	public boolean capNhatPB(PhongBan NV) throws RemoteException {
		// TODO Auto-generated method stub
		return capNhat(NV);
	}

	@Override
	public boolean xoaPB(String maPB) throws RemoteException {
		// TODO Auto-generated method stub
		return xoa(maPB, PhongBan.class);
	}

}
