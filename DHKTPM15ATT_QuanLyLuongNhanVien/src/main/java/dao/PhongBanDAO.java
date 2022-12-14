package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.PhongBan;

public interface PhongBanDAO extends Remote {
	public List<PhongBan> layDSPB() throws RemoteException;
	public PhongBan getPhongBanTheoMa(String maPhongBan) throws RemoteException;
	public List<PhongBan> getPhongBanCTheoTen(String tenPhongBan) throws RemoteException;
	public PhongBan getPBTheoTenFirst(String tenPhongBan) throws RemoteException;
	
	public boolean themPB(PhongBan NV) throws RemoteException;
	public boolean capNhatPB(PhongBan NV) throws RemoteException;
	public boolean xoaPB(String maPB) throws RemoteException;

}
