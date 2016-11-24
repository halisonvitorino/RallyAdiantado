package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import Utils.HibernateUtils.HibernateUtil;

public class DAO implements InterfaceDAO {

	private static SessionFactory sessao;
	private Transaction transacao;

	@Override
	public void save(Object bean) {
		sessao = HibernateUtil.getSessionFactory();
		transacao = sessao.beginTransaction();
		sessao.save(obj);
		sessao.flush();
		transacao.commit();
		sessao.close();

	}

	@Override
	public Object getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override

	public List<Object> getAll() {
		sessao = HibernateUtil.getSessionFactory();
        transacao = sessao.beginTransaction();
        List objts;
        objts = null;
        Criteria selectAll = sessao.createCriteria(clazz);
        transacao.commit();
        objts = selectAll.list();
        sessao.close();
        return objts;
	}

	@Override
	public void remove(int id) {
		sessao = HibernateUtil.getSessionFactory();
        transacao = sessao.beginTransaction();
        sessao.delete(obj);
        sessao.flush();
        transacao.commit();
        sessao.close();
	}

	@Override
	public void update(Object bean) {
		sessao = HibernateUtil.getSessionFactory();
        transacao = sessao.beginTransaction();
        sessao.update(obj);
        sessao.flush();
        transacao.commit();
        sessao.close();
	}
	
	public void closeConnection() throws Exception
    {
            sessao = HibernateUtil.getSessionFactory();
            sessao.connection().createStatement().execute("SHUTDOWN");
    }
	
	
}
