package dao;

import entidade.Conforto;
import entidade.Estilo;
import entidade.Extra;
import entidade.Seguranca;
import entidade.Tecnologia;
import entidade.Veiculo;
import functions.ConexaoBD;
import functions.Formatacao;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class VeiculoDao implements IDAO_T<Veiculo> {

    ResultSet resultadoQ = null;

    @Override
    public String salvar(Veiculo veiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String atualizar(Veiculo veiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Veiculo> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Veiculo> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Veiculo consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                    + "INNER JOIN marcas AS ma"
                    + "ON mo.marca_id = ma.id "
                    + "WHERE v.PLACA ILIKE '%" + placa + "%' AND "
                    + "ve.NOME ILIKE '%" + versao + "%' AND "
                    + "mo.NOME ILIKE '%" + modelo + "%' AND "
                    + marca + " AND "
                    + situacao + " AND "
                    + "v.id IN (SELECT v.id FROM veiculos AS v INNER JOIN situacoes_veiculos AS sv "
                    + "ON v.situacao_veiculo_id = sv.id "
                    + "INNER JOIN versoes AS ve "
                    + "ON v.versao_id = ve.id "
                    + "INNER JOIN modelos AS mo "
                    + "ON ve.modelo_id = mo.id "
                    + "INNER JOIN marcas AS ma"
                    + "ON mo.marca_id = ma.id "
                    + "WHERE v.PLACA ILIKE '%" + placa + "%' AND "
                    + "ve.NOME ILIKE '%" + versao + "%' AND "
                    + "mo.NOME ILIKE '%" + modelo + "%' AND "
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
                    + marca + " AND "
                    + situacao + " "
                    + "ORDER BY v.CRIADO_EM DESC "
                    + "LIMIT 50");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = Formatacao.ajustaDataDMA(resultadoQ.getString("criado_em"));
                dadosTabela[lin][2] = resultadoQ.getString("situacao");
                dadosTabela[lin][3] = resultadoQ.getString("placa");
                dadosTabela[lin][4] = resultadoQ.getString("versao");
                dadosTabela[lin][4] = resultadoQ.getString("modelo");
                dadosTabela[lin][4] = resultadoQ.getString("marca");

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
