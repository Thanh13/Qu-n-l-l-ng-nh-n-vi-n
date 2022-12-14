package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.NhanVien;

public interface NhanVienDAO extends Remote {
	public boolean themNV(NhanVien NV) throws RemoteException;
	public static boolean capNhatNV(NhanVien NV) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean xoaNV(String maNV) throws RemoteException;
	public NhanVien layNVTheoMa(String maNV) throws RemoteException;
	public List<NhanVien> layDSNVTheoTen(String tenNV) throws RemoteException;
	public List<NhanVien> layDSNVTheoMa(String maNV) throws RemoteException;
	public List<NhanVien> layDSNV() throws RemoteException;
	public String getMaNVMoi() throws RemoteException ;
}
