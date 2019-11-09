package dao;

import entidade.Marca;
import functions.ConexaoBD;
import functions.GerenciarJTable;
import functions.HibernateUtil;
import functions.IDAO_T;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MarcaDao implements IDAO_T<Marca>
{
    private final int registros = 25;
    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(Marca o)
    {
        return null;
    }

    @Override
    public String atualizar(Marca o)
    {
        return null;
    }

    @Override
    public String excluir(int id)
    {
        return null;
    }

    @Override
    public ArrayList<Marca> consultarTodos()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Marca> consultar(String criterio)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Marca consultarId(int id)
    {
        Marca marca = null;

        try
        {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM marcas "
                    + "WHERE id = " + id;

            System.out.println("Sql: " + sql);

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next())
            {
                marca = new Marca();

                marca.setId(id);
                marca.setNome(resultadoQ.getString("nome"));
            }

        } catch (Exception e)
        {
            System.out.println("Erro consultar marca = " + e);
        }

        return marca;
    }

    public void incrementaTabela(JTable tabela, int linhas)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Marca> marcas = newSession.createQuery("FROM Marca WHERE id > :limit ORDER BY id").setParameter("limit", linhas).setMaxResults(25).list();

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

    public void recarregaTabela(JTable tabela, int linhas)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Marca> marcas = newSession.createQuery("FROM Marca WHERE id < :limit ORDER BY id").setParameter("limit", linhas).setMaxResults(25).list();

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

    public void criaTabela(JTable tabela, JScrollPane barraScroll, String filtro)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Marca> marcas = newSession.createQuery("FROM Marca WHERE slug like '% :filtro %' ORDER BY id").setParameter("filtro", filtro).setFirstResult(0).setMaxResults(this.registros).list();

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        model.addColumn("Id");
        model.addColumn("Nome");

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

    private void scrollTable(JTable tabela, JScrollPane barraScroll)
    {
        MarcaDao dao = new MarcaDao();
        GerenciarJTable gjt = new GerenciarJTable();
        int registros = this.registros;

        barraScroll.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener()
        {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e)
            {
                if (!e.getValueIsAdjusting())
                {
                    JScrollBar scrollBar = (JScrollBar) e.getAdjustable();
                    int extent = scrollBar.getModel().getExtent();
                    int maximum = scrollBar.getModel().getMaximum();
                    if (extent + e.getValue() == maximum)
                    {
                        int id = gjt.obterValorUltimaLinha(tabela);
                        dao.incrementaTabela(tabela, id);
                        if (tabela.getRowCount() == registros + 1)
                        {
                            tabela.scrollRectToVisible(tabela.getCellRect(1, 0, true));
                        }
                    } else if (e.getValue() == 0)
                    {
                        int id = gjt.obterValorPrimeiraLinha(tabela);
                        dao.recarregaTabela(tabela, id);
                        if (tabela.getRowCount() == registros + 1)
                        {
                            tabela.scrollRectToVisible(tabela.getCellRect(registros - 1, 0, true));
                        }
                    }
                }
            }
        });
    }
}
