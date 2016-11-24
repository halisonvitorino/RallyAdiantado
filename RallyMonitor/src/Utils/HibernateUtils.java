package Utils;

import org.hibernate.SessionFactory;

public class HibernateUtils {

	public static class HibernateUtil {

		private static SessionFactory sessionFactory;

		private HibernateUtil() {
		}

		public static SessionFactory getSessionFactory() {
			if (sessionFactory == null) {
				try {
					sessionFactory = getSessionFactory();
				} catch (Throwable ex) {
					System.err.println("Initial SessionFactory creation failed." + ex);
					throw new ExceptionInInitializerError(ex);
				}
				return sessionFactory;
			} else {
				return sessionFactory;
			}
		}
	}
}
