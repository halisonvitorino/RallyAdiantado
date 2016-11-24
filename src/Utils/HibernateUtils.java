package Utils;

import org.hibernate.SessionFactory;
import rallyModel.Carro;

@SuppressWarnings("deprecation")
public class HibernateUtils {
	
	public class HibernateUtil {
		 
		private SessionFactory sessionFactory;
		 
		private HibernateUtil() {
		}
		 
		public SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
		try {
		sessionFactory = ac.configure().buildSessionFactory();
		} catch (Throwable ex) {
				
			
		System.err.println("Initial SessionFactory creation failed." + ex);
		throw new ExceptionInInitializerError(ex);
			}
				return sessionFactory;
			} else {
				return sessionFactory;
}}}}
	


