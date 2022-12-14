package daoimlp;

import java.rmi.RemoteException;
import java.util.List;

import jakarta.persistence.EntityTransaction;
import dao.ChiTietBanCongDAO;
import entity.BanCong;
import entity.ChiTietBanCong;

public class ChiTietBanCongImpl extends AbstractImpl implements ChiTietBanCongDAO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7863554822368746893L;

	public ChiTietBanCongImpl() throws RemoteException {
		super();
	}

	@Override
	public boolean themCTBC(ChiTietBanCong bc) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(bc);
			tr.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();	
		}
		return false;
	}

	@Override
	public boolean capNhatCTBC(ChiTietBanCong bc) throws RemoteException {
		// TODO Auto-generated method stub
		return capNhat(bc);
	}

	@Override
	public boolean xoaCTBC(String maBC) throws RemoteException {
		// TODO Auto-generated method stub
		return xoa(maBC, BanCong.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ChiTietBanCong> layBCTheoMa(String maBC) throws RemoteException {
		// TODO Auto-generated method stub
		return (List<ChiTietBanCong>) getList("select * from ChiTietBanCong where maBC ='" +maBC+ "'", ChiTietBanCong.class);
	}



	@SuppressWarnings("unchecked")
	@Override
	public List<ChiTietBanCong> layDSCTBC() throws RemoteException {
		// TODO Auto-generated method stub
		return (List<ChiTietBanCong>) getList("select * from ChiTietBanCong", ChiTietBanCong.class);
	}

	@Override
	public int demBCTheoMaNV(String maNV) throws RemoteException {
		EntityTransaction tr = em.getTransaction();		
		try {
			tr.begin();
		String query = "select count(maBC)\r\n"
				+ "from [dbo].[NhanVien], [dbo].[ChiTietBanCong]where [dbo].[NhanVien].maNV=[dbo].[ChiTietBanCong].maNV and [dbo].[NhanVien].maNV='"+maNV+"'";

		int soHoaDon = (int) em.createNativeQuery(query).getSingleResult();
		tr.commit();
		return  soHoaDon;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return 0;
	}

	
}
