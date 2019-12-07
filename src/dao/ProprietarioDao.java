package dao;

import entidade.Cliente;
import entidade.Proprietario;
import functions.ConexaoBD;
import functions.GerenciarJTable;
import functions.HibernateUtil;
import functions.IDAO_T;
import functions.LazyLoading;
import java.awt.event.AdjustmentEvent;
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

public class ProprietarioDao implements LazyLoading {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
    private final int registros = 100;

    @Override
    public void incrementaTabela(JTable tabela, int linhas)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Proprietario> proprietarios = newSession.createQuery("FROM Proprietario WHERE id > :limit ORDER BY id").setParameter("limit", linhas).setMaxResults(this.registros).list();

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        if (proprietarios.size() == this.registros)
        {
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.addRow(new Object[]
            {
            });
        }

        for (Proprietario proprietario : proprietarios)
        {
            model.addRow(new Object[]
            {
                proprietario.getId(), proprietario.getNome(), proprietario.getCidade_id().getNome()
            });
        }
    }

    @Override
    public void recarregaTabela(JTable tabela, int linhas)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Proprietario> proprietarios = newSession.createQuery("FROM Proprietario WHERE id < :limit ORDER BY id DESC").setParameter("limit", linhas).setMaxResults(this.registros).list();

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        if (proprietarios.size() == this.registros)
        {
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
        }

        for (Proprietario proprietario : proprietarios)
        {
            model.insertRow(0, new Object[]
            {
                proprietario.getId(), proprietario.getNome(), proprietario.getCidade_id().getNome()
            });
        }

        if (proprietarios.size() == this.registros)
        {
            model.addRow(new Object[]
            {
            });
        }

        if (tabela.getRowCount() == this.registros + 1)
        {
            if (proprietarios.size() != 0)
            {
                tabela.scrollRectToVisible(tabela.getCellRect(this.registros - 1, 0, true));
            }
        }
    }

    @Override
    public void criaTabela(JTable tabela, JScrollPane barraScroll)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Proprietario> proprietarios = newSession.createQuery("FROM Proprietario ORDER BY id").setFirstResult(0).setMaxResults(this.registros).list();

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        if (model.getColumnCount() < 1)
        {
            model.addColumn("Código");
            model.addColumn("Nome");
            model.addColumn("Cidade");
        }

        model.addRow(new Object[]
        {
        });

        for (Proprietario proprietario : proprietarios)
        {
            model.addRow(new Object[]
            {
                proprietario.getId(), proprietario.getNome(), proprietario.getCidade_id().getNome()
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
        ClienteDao dao = new ClienteDao();
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
                }
            }
        });
    }

    public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[3];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Cidade/Estado";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM proprietarios AS p "
                    + "INNER JOIN cidades AS c "
                    + "ON p.cidade_id = c.id "
                    + "INNER JOIN estados AS e "
                    + "ON c.estado_id = e.id "
                    + "WHERE p.NOME ILIKE '%" + criterio + "%' AND "
                    + "p.id IN (SELECT p.id FROM proprietarios AS p "
                    + "INNER JOIN cidades AS c "
                    + "ON p.cidade_id = c.id "
                    + "INNER JOIN estados AS e "
                    + "ON c.estado_id = e.id"
                    + " WHERE p.NOME ILIKE '%" + criterio + "%' LIMIT 50)");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][3];

        } catch (Exception e) {
            System.out.println("Erro ao consultar proprietário: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT p.id AS proprietario_id, "
                    + "p.nome, "
                    + "CONCAT(c.nome, ' - ', e.nome) AS cidade_estado "
                    + "FROM proprietarios AS p "
                    + "INNER JOIN cidades AS c "
                    + "ON p.cidade_id = c.id "
                    + "INNER JOIN estados AS e "
                    + "ON c.estado_id = e.id "
                    + "WHERE "
                    + "p.NOME ILIKE '%" + criterio + "%' "
                    + "ORDER BY p.CRIADO_EM DESC "
                    + "LIMIT 50");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("proprietario_id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("cidade_estado");
                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
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
            public Class getColumnClass(int column) {

                if (column == 2) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
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

    @Override
    public void tabelaFiltro(JTable tabela, String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
