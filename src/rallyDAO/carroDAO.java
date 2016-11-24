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
		public Carro getLivro(long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return (Carro) session.load(Carro.class, id);
		}
		public List<livro> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery("from Livro").list();
		t.commit();
		return lista;
		}
		public void remove(Livro livro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(livro);
		t.commit();
		}
		public void update(Livro livro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(livro);
		t.commit();
		}
		}

}
