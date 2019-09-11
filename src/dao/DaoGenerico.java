package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import functions.HibernateUtil;

public class DaoGenerico {

    public static DaoGenerico daoGenerico = null;

    private SessionFactory factory;
    private Transaction transaction;

    public DaoGenerico() {
        factory = HibernateUtil.getSessionFactory();
    }

    public static DaoGenerico getInstance() {
        if (daoGenerico == null) {
            daoGenerico = new DaoGenerico();
        }
        return daoGenerico;
    }

    public boolean inserir(Object o) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            sessao.save(o);
            transaction.commit();
            retorno = true;
        } catch (Exception e) {
            transaction.rollback();
            retorno = false;
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
    }

    public boolean atualizar(Object o) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            sessao.update(o);
            transaction.commit();
            retorno = true;
        } catch (Exception e) {
            transaction.rollback();
            retorno = false;
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
    }

    public boolean excluir(Class classe, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();

            Object entidade = sessao.load(classe, id);

            sessao.delete(entidade);

            transaction.commit();

            retorno = true;
        } catch (Exception e) {
            transaction.rollback();
            retorno = false;
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
    }

    public Object obterPorId(Class classe, int id) {

        Session sessao = factory.openSession();
        try {
            Object entidade = sessao.get(classe, id);
            
            return entidade;
            
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return null;
    }

}
