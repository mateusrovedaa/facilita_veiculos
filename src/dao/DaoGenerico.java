package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import functions.HibernateUtil;
import functions.Log;
import java.io.Serializable;
import org.hibernate.Query;

public class DaoGenerico {

    public static DaoGenerico daoGenerico = null;

    private static String userName;
    private SessionFactory factory;
    private Transaction transaction;

    public void setarNome(String email) {
        userName = email;
    }

    public String pegarNome() {
        return userName;
    }

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
            Query query = sessao.createSQLQuery("SET SESSION \"myapp.user\" = '" + userName + "'");
            query.executeUpdate();
            sessao.save(o);
            transaction.commit();
            retorno = true;
        } catch (Exception e) {
            transaction.rollback();
            retorno = false;
            e.printStackTrace();
            Log.geraLogBD(userName, "inserir", o.getClass(), e.toString());
        } finally {
            sessao.close();
        }
        return retorno;
    }

    public int inserirVeiculo(Object o) {
        boolean retorno = false;
        int id = 0;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Query query = sessao.createSQLQuery("SET SESSION \"myapp.user\" = '" + userName + "'");
            query.executeUpdate();
            id = (Integer) sessao.save(o);
            transaction.commit();
            retorno = true;
        } catch (Exception e) {
            transaction.rollback();
            retorno = false;
            e.printStackTrace();
            Log.geraLogBD(userName, "inserir", o.getClass(), e.toString());
        } finally {
            sessao.close();
        }

        return id;
    }

    public boolean atualizar(Object o) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Query query = sessao.createSQLQuery("SET SESSION \"myapp.user\" = '" + userName + "'");
            query.executeUpdate();
            sessao.update(o);
            transaction.commit();
            retorno = true;
        } catch (Exception e) {
            transaction.rollback();
            retorno = false;
            e.printStackTrace();
            Log.geraLogBD(userName, "atualizar", o.getClass(), e.toString());
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
            Query query = sessao.createSQLQuery("SET SESSION \"myapp.user\" = '" + userName + "'");
            query.executeUpdate();

            sessao.delete(entidade);

            transaction.commit();

            retorno = true;
        } catch (Exception e) {
            transaction.rollback();
            retorno = false;
            e.printStackTrace();
            Log.geraLogBD(userName, "excluir", classe, e.toString());
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

        } catch (Exception e) {
            e.printStackTrace();
            Log.geraLogBD(userName, "obterPorId", classe, e.toString());
        } finally {
            sessao.close();
        }
        return null;
    }

}
//        List dogs = (List)session.createQuery("from Dog").list();
//        System.out.println("Dogs: " + Arrays.toString(dogs.toArray()));
