package dao;

import entidade.Conforto;
import entidade.Estilo;
import entidade.Extra;
import entidade.Marca;
import entidade.Seguranca;
import entidade.Tecnologia;
import entidade.Veiculo;
import functions.ConexaoBD;
import functions.Formatacao;
import functions.GerenciarJTable;
import functions.HibernateUtil;
import functions.LazyLoading;
import java.awt.event.AdjustmentEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class VeiculoDao implements LazyLoading {

    ResultSet resultadoQ = null;
    private final int registros = 100;
    final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

    @Override
    public void incrementaTabela(JTable tabela, int linhas) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Veiculo> veiculos = newSession.createQuery("FROM Veiculo WHERE id > :limit ORDER BY id").setParameter("limit", linhas).setMaxResults(this.registros).list();

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        if (veiculos.size() == this.registros) {
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.addRow(new Object[]{});
        }

        for (Veiculo veiculo : veiculos) {
            model.addRow(new Object[]{
                veiculo.getId(),
                veiculo.getCriadoEm().get(Calendar.DATE) + "/" + veiculo.getCriadoEm().get(Calendar.MONTH) + "/" + veiculo.getCriadoEm().get(Calendar.YEAR),
                veiculo.getSituacao_veiculo_id().getNome(),
                veiculo.getPlaca(),
                veiculo.getVersao_id().getNome(),
                veiculo.getVersao_id().getModelo_id().getNome(),
                veiculo.getVersao_id().getModelo_id().getMarca_id().getNome()
            });
        }
    }

    @Override
    public void recarregaTabela(JTable tabela, int linhas) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();

        List<Veiculo> veiculos = newSession.createQuery("FROM Veiculo WHERE id < :limit ORDER BY id DESC").setParameter("limit", linhas).setMaxResults(this.registros).list();

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        if (veiculos.size() == this.registros) {
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
        }

        for (Veiculo veiculo : veiculos) {
            model.insertRow(0, new Object[]{
                veiculo.getId(),
                veiculo.getCriadoEm().get(Calendar.DATE) + "/" + veiculo.getCriadoEm().get(Calendar.MONTH) + "/" + veiculo.getCriadoEm().get(Calendar.YEAR),
                veiculo.getSituacao_veiculo_id().getNome(),
                veiculo.getPlaca(),
                veiculo.getVersao_id().getNome(),
                veiculo.getVersao_id().getModelo_id().getNome(),
                veiculo.getVersao_id().getModelo_id().getMarca_id().getNome()
            });
        }

        if (veiculos.size() == this.registros) {
            model.addRow(new Object[]{});
        }

        if (tabela.getRowCount() == this.registros + 1) {
            if (veiculos.size() != 0) {
                tabela.scrollRectToVisible(tabela.getCellRect(this.registros - 1, 0, true));
            }
        }
    }

    @Override
    public void criaTabela(JTable tabela, JScrollPane barraScroll) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session newSession = sessionFactory.openSession();
        
        List<Veiculo> veiculos = newSession.createQuery("FROM Veiculo ORDER BY id").setFirstResult(0).setMaxResults(this.registros).list();

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        if (model.getColumnCount() < 1) {
            model.addColumn("Código");
            model.addColumn("Data");
            model.addColumn("Situação");
            model.addColumn("Placa");
            model.addColumn("Versão");
            model.addColumn("Modelo");
            model.addColumn("Marca");
        }

        model.addRow(new Object[]{});

        for (Veiculo veiculo : veiculos) {
            model.addRow(new Object[]{
                veiculo.getId(),
                veiculo.getCriadoEm().get(Calendar.DATE) + "/" + veiculo.getCriadoEm().get(Calendar.MONTH) + "/" + veiculo.getCriadoEm().get(Calendar.YEAR),
                veiculo.getSituacao_veiculo_id().getNome(),
                veiculo.getPlaca(),
                veiculo.getVersao_id().getNome(),
                veiculo.getVersao_id().getModelo_id().getNome(),
                veiculo.getVersao_id().getModelo_id().getMarca_id().getNome()
            });
        }

        tabela.setSelectionMode(0);

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
            }
        }

        tabela.scrollRectToVisible(tabela.getCellRect(1, 0, true));
        scrollTable(tabela, barraScroll);

    }

    @Override
    public void scrollTable(JTable tabela, JScrollPane barraScroll) {
        VeiculoDao dao = new VeiculoDao();
        GerenciarJTable gjt = new GerenciarJTable();
        int registros = this.registros;

        barraScroll.getVerticalScrollBar().addAdjustmentListener((AdjustmentEvent e)
                -> {
            if (!e.getValueIsAdjusting()) {
                JScrollBar scrollBar = (JScrollBar) e.getAdjustable();
                int extent = scrollBar.getModel().getExtent();
                int maximum = scrollBar.getModel().getMaximum();
                if (extent + e.getValue() == maximum) {
                    int id = gjt.obterValorUltimaLinha(tabela);
                    if (tabela.getRowCount() > 99) {
                        dao.incrementaTabela(tabela, id);
                    }
                    if (tabela.getRowCount() == registros + 1) {
                        tabela.scrollRectToVisible(tabela.getCellRect(1, 0, true));
                    }
                } else if (e.getValue() == 0) {
                    int id = gjt.obterValorPrimeiraLinha(tabela);
                    if (tabela.getRowCount() > 99) {
                        dao.recarregaTabela(tabela, id);
                    }
                }
            }
        });
    }

    @Override
    public void tabelaFiltro(JTable tabela, String filtro) {
    }

    public void popularTabela(JTable tabela, String placa, String versao, String modelo, String marca_id, String situacao_id, String data_de, String data_ate) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[7];
        cabecalho[0] = "Código";
        cabecalho[1] = "Data";
        cabecalho[2] = "Situação";
        cabecalho[3] = "Placa";
        cabecalho[4] = "Versão";
        cabecalho[5] = "Modelo";
        cabecalho[6] = "Marca";

        String marca = marca_id != "" ? "ma.ID = " + marca_id + " " : " 1 = 1 ";
        String situacao = situacao_id != "" ? "sv.ID = " + situacao_id + " " : " 1 = 1 ";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM veiculos AS v INNER JOIN situacoes_veiculos AS sv "
                    + "ON v.situacao_veiculo_id = sv.id "
                    + "INNER JOIN versoes AS ve "
                    + "ON v.versao_id = ve.id "
                    + "INNER JOIN modelos AS mo "
                    + "ON ve.modelo_id = mo.id "
                    + "INNER JOIN marcas AS ma "
                    + "ON mo.marca_id = ma.id "
                    + "WHERE v.PLACA ILIKE '%" + placa + "%' AND "
                    + "ve.NOME ILIKE '%" + versao + "%' AND "
                    + "mo.NOME ILIKE '%" + modelo + "%' AND "
                    + "v.criado_em BETWEEN " + "'" + Formatacao.ajustaDataAMD(data_de) + "' AND "
                    + "'" + Formatacao.ajustaDataAMD(data_ate) + " 23:59:00" + "' AND "
                    + marca + " AND "
                    + situacao + " AND "
                    + "v.id IN (SELECT v.id FROM veiculos AS v INNER JOIN situacoes_veiculos AS sv "
                    + "ON v.situacao_veiculo_id = sv.id "
                    + "INNER JOIN versoes AS ve "
                    + "ON v.versao_id = ve.id "
                    + "INNER JOIN modelos AS mo "
                    + "ON ve.modelo_id = mo.id "
                    + "INNER JOIN marcas AS ma "
                    + "ON mo.marca_id = ma.id "
                    + "WHERE v.PLACA ILIKE '%" + placa + "%' AND "
                    + "ve.NOME ILIKE '%" + versao + "%' AND "
                    + "mo.NOME ILIKE '%" + modelo + "%' AND "
                    + "v.criado_em BETWEEN " + "'" + Formatacao.ajustaDataAMD(data_de) + "' AND "
                    + "'" + Formatacao.ajustaDataAMD(data_ate) + " 23:59:00" + "' AND "
                    + marca + " AND "
                    + situacao + " "
                    + "LIMIT 50)");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][7];

        } catch (Exception e) {
            System.out.println("Erro ao consultar veículo: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT v.id AS id" + ","
                    + "v.criado_em AS criado_em" + ","
                    + "sv.nome AS situacao" + ","
                    + "v.placa AS placa" + ","
                    + "ve.nome AS versao" + ","
                    + "mo.nome AS modelo" + ","
                    + "ma.nome AS marca "
                    + "FROM veiculos AS v "
                    + "INNER JOIN situacoes_veiculos AS sv "
                    + "ON v.situacao_veiculo_id = sv.id "
                    + "INNER JOIN versoes AS ve "
                    + "ON v.versao_id = ve.id "
                    + "INNER JOIN modelos AS mo "
                    + "ON ve.modelo_id = mo.id "
                    + "INNER JOIN marcas AS ma "
                    + "ON mo.marca_id = ma.id "
                    + "WHERE "
                    + "v.PLACA ILIKE '%" + placa + "%' AND "
                    + "ve.NOME ILIKE '%" + versao + "%' AND "
                    + "mo.NOME ILIKE '%" + modelo + "%' AND "
                    + "v.criado_em BETWEEN " + "'" + Formatacao.ajustaDataAMD(data_de) + "' AND "
                    + "'" + Formatacao.ajustaDataAMD(data_ate) + " 23:59:00" + "' AND "
                    + marca + " AND "
                    + situacao + " "
//                    + "ORDER BY v.CRIADO_EM DESC "
                    + "ORDER BY v.id DESC "
                    + "LIMIT 50");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = Formatacao.ajustaDataDMA(resultadoQ.getString("criado_em"));
                dadosTabela[lin][2] = resultadoQ.getString("situacao");
                dadosTabela[lin][3] = resultadoQ.getString("placa");
                dadosTabela[lin][4] = resultadoQ.getString("versao");
                dadosTabela[lin][5] = resultadoQ.getString("modelo");
                dadosTabela[lin][6] = resultadoQ.getString("marca");

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

    public double valorVeiculo(int id) {
        Veiculo veiculo = null;
        double valor = 0;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT valor "
                    + "FROM veiculos "
                    + "WHERE id = " + id;

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            valor = rs.getDouble(1);

        } catch (Exception e) {
            System.out.println("Erro consultar valor = " + e);
        }

        return valor;
    }

    public String atualizarSituacao(String situacao, String veiculo) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "UPDATE veiculos "
                    + "SET situacao_veiculo_id = '" + situacao + "' "
                    + "WHERE id = " + veiculo;

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro atualizar situação = " + e);
            return e.toString();
        }
    }

    public double calcularValorTotal(double valorVeiculo, double valorEntrada, double juros) {
        double taxaJuros = (juros / 100);
        double valorJuros;
        double valorTotal;
        valorJuros = (valorVeiculo - valorEntrada) * taxaJuros;
        valorTotal = (valorVeiculo + valorJuros);

        return valorTotal;
    }

    public void listarVeiculo(JTable tabela, String placa, String situacao_id) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[6];
        cabecalho[0] = "Código";
        cabecalho[1] = "Placa";
        cabecalho[2] = "Valor";
        cabecalho[3] = "Versão";
        cabecalho[4] = "Modelo";
        cabecalho[5] = "Marca";
        
        String situacao = situacao_id != "" ? "v.SITUACAO_VEICULO_ID = " + situacao_id + " " : " 1 = 1 ";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM veiculos AS v WHERE PLACA ILIKE '%" + placa + "%' AND "
                    + situacao + " ");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][6];

        } catch (Exception e) {
            System.out.println("Erro ao consultar veículo: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT v.id AS id" + ","
                    + "v.placa AS placa" + ","
                    + "ma.nome AS marca" + ","
                    + "mo.nome AS modelo " + ","
                    + "v.valor AS valor " + ","
                    + "ve.nome AS versao "
                    + "FROM veiculos AS v "
                    + " LEFT JOIN versoes AS ve "
                    + " ON v.versao_id = ve.id "
                    + " LEFT JOIN modelos AS mo "
                    + " ON ve.modelo_id = mo.id "
                    + " LEFT JOIN marcas AS ma "
                    + " ON mo.marca_id = ma.id "
                    + "WHERE "
                    + "v.PLACA ILIKE '%" + placa + "%' AND "
                    + situacao
                    + "ORDER BY v.CRIADO_EM DESC");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("placa");
                dadosTabela[lin][2] = Formatacao.formatarDecimal(resultadoQ.getDouble("valor"));
                dadosTabela[lin][3] = resultadoQ.getString("versao");
                dadosTabela[lin][4] = resultadoQ.getString("modelo");
                dadosTabela[lin][5] = resultadoQ.getString("marca");

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

    public Conforto obterVeiculoConforto(JTable tabela, int veiculoId) {
        Conforto conforto = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT c.nome, c.id "
                    + "FROM "
                    + "veiculos_confortos AS vc "
                    + "INNER JOIN "
                    + "confortos AS c "
                    + "ON "
                    + "vc.conforto_id = c.id "
                    + "WHERE "
                    + "vc.veiculo_id = " + veiculoId;

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                conforto = new Conforto();

                conforto.setId(resultadoQ.getInt("id"));
                conforto.setNome(resultadoQ.getString("nome"));

                int id = resultadoQ.getInt("id");

                for (int i = 0; i < tabela.getRowCount(); i++) {

                    if (id == Integer.parseInt((String) tabela.getValueAt(i, 1))) {
                        tabela.setValueAt(true, i, 0);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro consultar confortos = " + e);
        }

        return conforto;
    }

    public Seguranca obterVeiculoSeguranca(JTable tabela, int veiculoId) {
        Seguranca seguranca = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT s.nome, s.id "
                    + "FROM "
                    + "veiculos_segurancas AS vs "
                    + "INNER JOIN "
                    + "segurancas AS s "
                    + "ON "
                    + "vs.seguranca_id = s.id "
                    + "WHERE "
                    + "vs.veiculo_id = " + veiculoId;

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                seguranca = new Seguranca();

                seguranca.setId(resultadoQ.getInt("id"));
                seguranca.setNome(resultadoQ.getString("nome"));

                int id = resultadoQ.getInt("id");

                for (int i = 0; i < tabela.getRowCount(); i++) {

                    if (id == Integer.parseInt((String) tabela.getValueAt(i, 1))) {
                        tabela.setValueAt(true, i, 0);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro consultar seguranças = " + e);
        }

        return seguranca;
    }

    public Tecnologia obterVeiculoTecnologia(JTable tabela, int veiculoId) {
        Tecnologia tecnologia = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT t.nome, t.id "
                    + "FROM "
                    + "veiculos_tecnologias AS vt "
                    + "INNER JOIN "
                    + "tecnologias AS t "
                    + "ON "
                    + "vt.tecnologia_id = t.id "
                    + "WHERE "
                    + "vt.veiculo_id = " + veiculoId;

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                tecnologia = new Tecnologia();

                tecnologia.setId(resultadoQ.getInt("id"));
                tecnologia.setNome(resultadoQ.getString("nome"));

                int id = resultadoQ.getInt("id");

                for (int i = 0; i < tabela.getRowCount(); i++) {

                    if (id == Integer.parseInt((String) tabela.getValueAt(i, 1))) {
                        tabela.setValueAt(true, i, 0);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro consultar tecnologias = " + e);
        }

        return tecnologia;
    }

    public Estilo obterVeiculoEstilo(JTable tabela, int veiculoId) {
        Estilo estilo = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT e.nome, e.id "
                    + "FROM "
                    + "veiculos_estilos AS ve "
                    + "INNER JOIN "
                    + "estilos AS e "
                    + "ON "
                    + "ve.estilo_id = e.id "
                    + "WHERE "
                    + "ve.veiculo_id = " + veiculoId;

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                estilo = new Estilo();

                estilo.setId(resultadoQ.getInt("id"));
                estilo.setNome(resultadoQ.getString("nome"));

                int id = resultadoQ.getInt("id");

                for (int i = 0; i < tabela.getRowCount(); i++) {

                    if (id == Integer.parseInt((String) tabela.getValueAt(i, 1))) {
                        tabela.setValueAt(true, i, 0);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro consultar estilos = " + e);
        }

        return estilo;
    }

    public Extra obterVeiculoExtra(JTable tabela, int veiculoId) {
        Extra extra = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT e.nome, e.id "
                    + "FROM "
                    + "veiculos_extras AS ve "
                    + "INNER JOIN "
                    + "extras AS e "
                    + "ON "
                    + "ve.extra_id = e.id "
                    + "WHERE "
                    + "ve.veiculo_id = " + veiculoId;

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                extra = new Extra();

                extra.setId(resultadoQ.getInt("id"));
                extra.setNome(resultadoQ.getString("nome"));

                int id = resultadoQ.getInt("id");

                for (int i = 0; i < tabela.getRowCount(); i++) {

                    if (id == Integer.parseInt((String) tabela.getValueAt(i, 1))) {
                        tabela.setValueAt(true, i, 0);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro consultar extras = " + e);
        }

        return extra;
    }
}
