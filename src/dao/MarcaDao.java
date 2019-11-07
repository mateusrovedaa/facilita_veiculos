package dao;

import entidade.Marca;
import static facilitaveiculos.FacilitaVeiculos.conexao;
import functions.ConexaoBD;
import functions.Formatacao;
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
import java.util.Vector;
import java.util.stream.Collectors;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MarcaDao implements IDAO_T<Marca>
{

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

        if (marcas.size() == 25)
        {
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
        }

        int lin = 0;

        model.addRow(new Object[]
        {
        });

        for (Marca marca : marcas)
        {
            model.addRow(new Object[]
            {
                marca.getId(), marca.getNome()
            });

            lin++;
        }
    }

    public void recarregaTabela(JTable tabela, int linhas)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Marca> marcas = newSession.createQuery("FROM Marca WHERE id < :limit ORDER BY id DESC").setParameter("limit", linhas).setMaxResults(25).list();

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        if (marcas.size() == 25)
        {
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
        }

        int lin = 0;

        for (Marca marca : marcas)
        {
            model.insertRow(0, new Object[]
            {
                marca.getId(), marca.getNome()
            });

            lin++;
        }

        if (marcas.size() == 25)
        {
            model.addRow(new Object[]
            {
            });
        }
    }

    public void criaTabela(JTable tabela, JScrollPane barraScroll)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Marca> marcas = newSession.createQuery("FROM Marca ORDER BY id").setFirstResult(0).setMaxResults(25).list();

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        model.addColumn("Id");
        model.addColumn("Nome");

        int lin = 0;

        model.addRow(new Object[]
        {
        });

        for (Marca marca : marcas)
        {
            model.addRow(new Object[]
            {
                marca.getId(), marca.getNome()
            });

            lin++;
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
                        int id = (int) tabela.getValueAt(tabela.getRowCount() - 2, 0);
                        dao.incrementaTabela(tabela, id);
                        tabela.scrollRectToVisible(tabela.getCellRect(1, 0, true));
                    } else if (e.getValue() == 0)
                    {
                        int id = (int) tabela.getValueAt(1, 0);
                        dao.recarregaTabela(tabela, id);
                        tabela.scrollRectToVisible(tabela.getCellRect(24, 0, true));
                    }
                }
            }
        });
    }

    public void popularTabela(JTable tabela, String criterio)
    {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[2];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";

        // cria matriz de acordo com nº de registros da tabela
        try
        {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM marcas AS m WHERE m.NOME ILIKE '%" + criterio + "%' AND "
                    + "m.id IN (SELECT id FROM marcas WHERE NOME ILIKE '%" + criterio + "%' LIMIT 50)");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][2];

        } catch (Exception e)
        {
            System.out.println("Erro ao consultar marca: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try
        {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM marcas "
                    + "WHERE "
                    + "NOME ILIKE '%" + criterio + "%' "
                    + "ORDER BY CRIADO_EM DESC "
                    + "LIMIT 50");

            while (resultadoQ.next())
            {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e)
        {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho)
        {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column)
            {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class
                    getColumnClass(int column)
            {

                if (column == 2)
                {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
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
//                case 2:
//                    column.setPreferredWidth(14);
//                    break;
            }
        }
        // renderizacao das linhas da tabela = mudar a cor
//        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value,
//                    boolean isSelected, boolean hasFocus, int row, int column) {
//                super.getTableCellRendererComponent(table, value, isSelected,
//                        hasFocus, row, column);
//                if (row % 2 == 0) {
//                    setBackground(Color.GREEN);
//                } else {
//                    setBackground(Color.LIGHT_GRAY);
//                }
//                return this;
//            }
//        });
    }
}
