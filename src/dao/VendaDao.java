package dao;

import entidade.Cidade;
import entidade.Venda;
import functions.ConexaoBD;
import functions.Formatacao;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class VendaDao implements IDAO_T<Venda> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(Venda o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String atualizar(Venda o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Venda> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Venda> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Venda consultarId(int id) {
        return null;
    }

    public void popularTabela(JTable tabela, String placa, String versao, String modelo, String marca_id, String situacao_venda_id, String cliente, String data_de, String data_ate) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[7];
        cabecalho[0] = "Código";
        cabecalho[1] = "Data";
        cabecalho[2] = "Usuário";
        cabecalho[3] = "Veículo";
        cabecalho[4] = "Cliente";
        cabecalho[5] = "Valor";
        cabecalho[6] = "Situação da venda";

        String marca = marca_id != "" ? "ma.ID = " + marca_id + " " : " 1 = 1 ";
        String situacao = situacao_venda_id != "" ? "sc.ID = " + situacao_venda_id + " " : " 1 = 1 ";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM vendas AS v INNER JOIN clientes AS c "
                    + "ON v.cliente_id = c.id "
                    + "INNER JOIN situacoes_vendas AS sv "
                    + "ON v.situacao_venda_id = sv.id "
                    + "INNER JOIN veiculos AS ve "
                    + "ON v.veiculo_id = ve.id "
                    + "INNER JOIN versoes AS vs "
                    + "ON ve.versao_id = vs.id "
                    + "INNER JOIN modelos AS mo "
                    + "ON vs.modelo_id = mo.id "
                    + "INNER JOIN marcas AS ma "
                    + "ON mo.marca_id = ma.id "
                    + "INNER JOIN usuarios AS u "
                    + "ON v.usuario_id = u.id "
                    + "WHERE ve.PLACA ILIKE '%" + placa + "%' AND "
                    + "c.NOME ILIKE '%" + cliente + "%' AND "
                    + "vs.NOME ILIKE '%" + versao + "%' AND "
                    + "mo.NOME ILIKE '%" + modelo + "%' AND "
                    + "v.data BETWEEN " + "'" + Formatacao.ajustaDataAMD(data_de) + "' AND "
                    + "'" + Formatacao.ajustaDataAMD(data_ate) + " 23:59:00" + "' AND "
                    + marca + " AND "
                    + situacao + " AND "
                    + "v.id IN (SELECT v.id FROM vendas AS v INNER JOIN clientes AS c "
                    + "ON v.cliente_id = c.id "
                    + "INNER JOIN situacoes_vendas AS sv "
                    + "ON v.situacao_venda_id = sv.id "
                    + "INNER JOIN veiculos AS ve "
                    + "ON v.veiculo_id = ve.id "
                    + "INNER JOIN versoes AS vs "
                    + "ON ve.versao_id = vs.id "
                    + "INNER JOIN modelos AS mo "
                    + "ON vs.modelo_id = mo.id "
                    + "INNER JOIN marcas AS ma "
                    + "ON mo.marca_id = ma.id "
                    + "INNER JOIN usuarios AS u "
                    + "ON v.usuario_id = u.id "
                    + "WHERE ve.PLACA ILIKE '%" + placa + "%' AND "
                    + "c.NOME ILIKE '%" + cliente + "%' AND "
                    + "vs.NOME ILIKE '%" + versao + "%' AND "
                    + "mo.NOME ILIKE '%" + modelo + "%' AND "
                    + "v.data BETWEEN " + "'" + Formatacao.ajustaDataAMD(data_de) + "' AND "
                    + "'" + Formatacao.ajustaDataAMD(data_ate) + " 23:59:00" + "' AND "
                    + marca + " AND "
                    + situacao
                    + "LIMIT 50)");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][7];

        } catch (Exception e) {
            System.out.println("Erro ao consultar venda: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT v.id AS id" + ","
                    + "v.data AS data" + ","
                    + "CONCAT(vs.nome, ' - ', mo.nome, ' - ', ma.nome, ' - ', ve.placa) AS veiculo " + ","
                    + "c.nome AS cliente " + ","
                    + "v.valor_total AS valor " + ","
                    + "sv.nome AS situacao " + ","
                    + "u.nome AS usuario "
                    + "FROM vendas AS v "
                    + "INNER JOIN clientes AS c "
                    + "ON v.cliente_id = c.id "
                    + "INNER JOIN situacoes_vendas AS sv "
                    + "ON v.situacao_venda_id = sv.id "
                    + "INNER JOIN veiculos AS ve "
                    + "ON v.veiculo_id = ve.id "
                    + "INNER JOIN versoes AS vs "
                    + "ON ve.versao_id = vs.id "
                    + "INNER JOIN modelos AS mo "
                    + "ON vs.modelo_id = mo.id "
                    + "INNER JOIN marcas AS ma "
                    + "ON mo.marca_id = ma.id "
                    + "INNER JOIN usuarios AS u "
                    + "ON v.usuario_id = u.id "
                    + "WHERE "
                    + "ve.PLACA ILIKE '%" + placa + "%' AND "
                    + "c.NOME ILIKE '%" + cliente + "%' AND "
                    + "vs.NOME ILIKE '%" + versao + "%' AND "
                    + "mo.NOME ILIKE '%" + modelo + "%' AND "
                    + "v.data BETWEEN " + "'" + Formatacao.ajustaDataAMD(data_de) + "' AND "
                    + "'" + Formatacao.ajustaDataAMD(data_ate) + " 23:59:00" + "' AND "
                    + marca + " AND "
                    + situacao
                    + "ORDER BY c.CRIADO_EM DESC "
                    + "LIMIT 50");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = Formatacao.ajustaDataDMA(resultadoQ.getString("data"));
                dadosTabela[lin][2] = resultadoQ.getString("usuario");
                dadosTabela[lin][3] = resultadoQ.getString("veiculo");
                dadosTabela[lin][4] = resultadoQ.getString("cliente");
                dadosTabela[lin][5] = Formatacao.formatarDecimal(resultadoQ.getDouble("valor"));
                dadosTabela[lin][6] = resultadoQ.getString("situacao");

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

//    public int obterTotalModelos() {
//        int total = 0;
//
//        try {
//            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
//
//            String sql = ""
//                    + "SELECT COUNT(*) "
//                    + "FROM modelos";
//
//            ResultSet rs = st.executeQuery(sql);
//            rs.next();
//            total = rs.getInt(1);
//
//        } catch (Exception e) {
//            System.out.println("Erro consultar total = " + e);
//        }
//        return total;
//    }
}