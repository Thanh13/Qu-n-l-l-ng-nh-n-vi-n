package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import entity.BanCong;


public interface BanCongDAO extends Remote {
	public boolean themBC(BanCong bc) throws RemoteException;
	public boolean capNhatBC(BanCong bc) throws RemoteException;
	public boolean xoaBC(String maBC) throws RemoteException;
	public BanCong layBCTheoMa(String maBC) throws RemoteException;
	public List<BanCong> layDSBCTheoTen(String tenBC) throws RemoteException;
	public List<BanCong> layDSBC() throws RemoteException;

	public List<BanCong> layLuongTheoThang(String dk, String dk2) throws RemoteException;
	public String getMaBCMoi()throws RemoteException;
}
