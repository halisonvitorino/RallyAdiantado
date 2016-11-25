package dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Utils.HibernateUtils.HibernateUtil;
import modelo.Carro;

public abstract class CarroDAO implements InterfaceDAO {

	public void salvar(Carro carro) throws Exception {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction tran = null;
		try {
			tran = sessao.beginTransaction();
			sessao.save(carro);
			tran.commit();
		} catch (Exception e) {
			if (tran != null) {
				tran.rollback();
			}
			System.out.println("erro ao salvar");
			throw e;
		} finally {
			sessao.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<Carro> listar() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Carro> anuncio = null;
		try {
			Query consulta = sessao.getNamedQuery("Carro.listar");
			anuncio = consulta.list();
		} catch (RuntimeException ex) {
			throw ex;
		} finally {
			sessao.close();
		}
		return anuncio;
	}

	@SuppressWarnings("unchecked")
	public List<Carro> listar(Long id) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Carro> carro = null;

		try {
			Query consulta = sessao.getNamedQuery("Carro.busca II");
			consulta.setLong("numero", id);
			carro = consulta.list();
		} catch (RuntimeException ex) {
			throw ex;
		} finally {
			sessao.close();
		}
		return carro;
	}

	public Carro buscar(Long id) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Carro carro = null;
		try {
			Query consulta = sessao.getNamedQuery("Anuncio.buscar");
			consulta.setLong("id", id);
			carro = (Carro) consulta.uniqueResult();
		} catch (RuntimeException ex) {
			throw ex;
		} finally {
			sessao.close();
		}
		return carro;
	}

	public void excluir(Carro carro) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction tran = null;
		try {
			tran = sessao.beginTransaction();
			sessao.delete(carro);
			tran.commit();
		} catch (Exception e) {
			if (tran != null) {
				tran.rollback();
			}
			System.out.println("ERRO!!!");
		} finally {
			sessao.close();
		}
	}
}
