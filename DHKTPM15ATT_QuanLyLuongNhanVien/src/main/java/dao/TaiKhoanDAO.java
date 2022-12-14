package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.TaiKhoan;

public interface TaiKhoanDAO extends Remote {
	public boolean themUS(TaiKhoan tk) throws RemoteException;
	public boolean capNhatUS(TaiKhoan tk) throws RemoteException;
	public boolean xoaUS(String maUS) throws RemoteException;
	public TaiKhoan layUSTheoMa(String maUS) throws RemoteException;
	public List<TaiKhoan> layDSUSTheoTen(String tenUS) throws RemoteException;
	public List<TaiKhoan> layDSUS() throws RemoteException;

}
