package util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;


public class HibernateUtil {
	private static HibernateUtil instance;
	private EntityManager entityManager;

	private HibernateUtil() {
		entityManager = Persistence.createEntityManagerFactory("DHKTPM15ATT_QuanLyLuongNhanVien") 
				.createEntityManager();
	}

	public synchronized static HibernateUtil getInstance() {
		if (instance == null)
			instance = new HibernateUtil();
		return instance;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

}
