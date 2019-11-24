package dao;

import entidade.Marca;
import functions.GerenciarJTable;
import functions.HibernateUtil;
import functions.LazyLoading;
import java.awt.event.AdjustmentEvent;
import java.util.List;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MarcaDao implements LazyLoading
{

    private final int registros = 100;

    @Override
    public void incrementaTabela(JTable tabela, int linhas)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Marca> marcas = newSession.createQuery("FROM Marca WHERE id > :limit ORDER BY id").setParameter("limit", linhas).setMaxResults(this.registros).list();

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        if (marcas.size() == this.registros)
        {
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.addRow(new Object[]
            {
            });
        }

        for (Marca marca : marcas)
        {
            model.addRow(new Object[]
            {
                marca.getId(), marca.getNome()
            });
        }
    }

    @Override
    public void recarregaTabela(JTable tabela, int linhas)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Marca> marcas = newSession.createQuery("FROM Marca WHERE id < :limit ORDER BY id DESC").setParameter("limit", linhas).setMaxResults(this.registros).list();

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        if (marcas.size() == this.registros)
        {
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
        }

        for (Marca marca : marcas)
        {
            model.insertRow(0, new Object[]
            {
                marca.getId(), marca.getNome()
            });
        }

        if (marcas.size() == this.registros)
        {
            model.addRow(new Object[]
            {
            });
        }
    }

    @Override
    public void criaTabela(JTable tabela, JScrollPane barraScroll)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Marca> marcas = newSession.createQuery("FROM Marca ORDER BY id").setFirstResult(0).setMaxResults(this.registros).list();

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        if (model.getColumnCount() < 1)
        {
            model.addColumn("Id");
            model.addColumn("Nome");
        }

        model.addRow(new Object[]
        {
        });

        for (Marca marca : marcas)
        {
            model.addRow(new Object[]
            {
                marca.getId(), marca.getNome()
            });
        }

        tabela.setSelectionMode(0);

        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++)
        {
            column = tabela.getColumnModel().getColumn(i);
            switch (i)
            {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
            }
        }

        tabela.scrollRectToVisible(tabela.getCellRect(1, 0, true));
        scrollTable(tabela, barraScroll);

    }

    @Override
    public void scrollTable(JTable tabela, JScrollPane barraScroll)
    {
        MarcaDao dao = new MarcaDao();
        GerenciarJTable gjt = new GerenciarJTable();
        int registros = this.registros;

        barraScroll.getVerticalScrollBar().addAdjustmentListener((AdjustmentEvent e) ->
        {
            if (!e.getValueIsAdjusting())
            {
                JScrollBar scrollBar = (JScrollBar) e.getAdjustable();
                int extent = scrollBar.getModel().getExtent();
                int maximum = scrollBar.getModel().getMaximum();
                if (extent + e.getValue() == maximum)
                {
                    int id = gjt.obterValorUltimaLinha(tabela);
                    if (tabela.getRowCount() > 99)
                    {
                        dao.incrementaTabela(tabela, id);
                    }
                    if (tabela.getRowCount() == registros + 1)
                    {
                        tabela.scrollRectToVisible(tabela.getCellRect(1, 0, true));
                    }
                } else if (e.getValue() == 0)
                {
                    int id = gjt.obterValorPrimeiraLinha(tabela);
                    if (tabela.getRowCount() > 99)
                    {
                        dao.recarregaTabela(tabela, id);
                    }
                    if (tabela.getRowCount() == registros + 1)
                    {
                        tabela.scrollRectToVisible(tabela.getCellRect(registros - 1, 0, true));
                    }
                }
            }
        });
    }

    @Override
    public void tabelaFiltro(JTable tabela, String filtro)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Marca> marcas = newSession.createQuery("FROM Marca WHERE nome LIKE :filtro ORDER BY id").setParameter("filtro", "%" + filtro + "%").setFirstResult(0).setMaxResults(90).list();

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        for (Marca marca : marcas)
        {
            model.addRow(new Object[]
            {
                marca.getId(), marca.getNome()
            });
        }

        tabela.setSelectionMode(0);

        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++)
        {
            column = tabela.getColumnModel().getColumn(i);
            switch (i)
            {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
            }
        }
    }
}
