package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.ChiTietBanCong;


public interface ChiTietBanCongDAO extends Remote {
	public boolean themCTBC(ChiTietBanCong bc) throws RemoteException;
	public boolean capNhatCTBC(ChiTietBanCong bc) throws RemoteException;
	public boolean xoaCTBC(String maBC) throws RemoteException;
	public List<ChiTietBanCong> layBCTheoMa(String maBC) throws RemoteException;
	public List<ChiTietBanCong> layDSCTBC() throws RemoteException;
	public int demBCTheoMaNV(String maNV) throws RemoteException;
}
