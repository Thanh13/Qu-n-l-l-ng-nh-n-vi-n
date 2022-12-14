package app;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import dao.BanCongDAO;
import dao.ChiTietBanCongDAO;
import dao.NhanVienDAO;
import dao.PhongBanDAO;
import dao.TaiKhoanDAO;
import daoimlp.BanCongImpl;
import daoimlp.ChiTietBanCongImpl;
import daoimlp.NhanVienImpl;
import daoimlp.PhongBanImpl;
import daoimlp.TaiKhoanImpl;
import entity.BanCong;
import entity.ChiTietBanCong;
import entity.NhanVien;
import entity.PhongBan;
import entity.TaiKhoan;
import jakarta.persistence.EntityManager;
import util.HibernateUtil;

public class App {
	private static EntityManager entityManager;

	public static void main(String[] args) throws RemoteException {
		entityManager = HibernateUtil.getInstance().getEntityManager();
		EntityManager em = HibernateUtil.getInstance().getEntityManager();
		NhanVienDAO nhanVienDAO = new NhanVienImpl();
		BanCongDAO banCongDAO= new BanCongImpl();
		ChiTietBanCongDAO chiTietBanCongDAO= new ChiTietBanCongImpl();
		PhongBanDAO phongBanDAO = new PhongBanImpl();
		TaiKhoanDAO taiKhoanDAO= new TaiKhoanImpl();
		
		
	
//		PhongBan phongBan= new PhongBan("PHB0003","Phòng CNTT");
//		boolean t=phongBanDAO.themPB(phongBan);
//		if (t) {
//			System.out.println("Thêm thành công nhé..!");
//		}
//		else {
//			System.out.println("Thêm thất bại rồi");
//		}

//		TaiKhoan taiKhoan=new TaiKhoan("1111");
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(2020, 10, 15);
//		Date date = calendar.getTime();
//		PhongBan phongBan= new PhongBan("PHB0002");
//		NhanVien nhanVien= new NhanVien("NVIE0001","Phạm Thành", "124 Hai Bà Trưng , P.3, Q.Tân Phú, Tp.Hồ Chí Minh", "Nam","nguyenthanh@gmail.com",  date, "0898105360","Nhân viên", phongBan,taiKhoan);
//		boolean s=nhanVienDAO.themNV(nhanVien);
//		if (s) {
//			System.out.println("Thêm thành công nhé..!");
//		}
//		else {
//			System.out.println("Thêm thất bại rồi");
//		}
		
		
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(2020, 12, 1);
//		Date date = calendar.getTime();
//		BanCong banCong = new BanCong("BC000003",date);
//		banCongDAO.themBC(banCong);
		
		
//		NhanVien nhanVien= new NhanVien("NVIE0001");
//		BanCong banCong= new BanCong("BC000003");
//		ChiTietBanCong chiTietBanCong = new ChiTietBanCong(nhanVien,banCong , 20, 40);
//		boolean t=chiTietBanCongDAO.themCTBC(chiTietBanCong);
//		if (t) {
//			System.out.println("Thêm thành công nhé..!");
//		}
//		else {
//			System.out.println("Thêm thất bại rồi");
//		}
	}
}
