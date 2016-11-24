package rallyDAO;

import rallyModel.Carro;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Utils.HibernateUtils.HibernateUtil;

public class carroDAO {
	
	public class carroDao {
		 
		public void save(Carro carro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(carro);
		t.commit();
		}
		public Carro getCarro(long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return (Carro) session.load(Carro.class, id);
		}
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public List<Carro> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery("from carro").list();
		t.commit();
		return lista;
		}
		public void remove(Carro carro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(carro);
		t.commit();
		}
		public void update(Carro carro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(carro);
		t.commit();
		}
		}

}
