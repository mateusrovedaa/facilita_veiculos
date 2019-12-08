package dao;

import entidade.Cidade;
import entidade.VendaVeiculo;
import functions.ConexaoBD;
import functions.Data;
import functions.Formatacao;
import functions.IDAO_T;
import functions.Parcelas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class VendaVeiculoDao implements IDAO_T<Cidade> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(Cidade o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String atualizar(Cidade o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cidade> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cidade> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int contarVenda(String datainicio, String datafinal) {
        int i = 0;
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM vendas WHERE data BETWEEN '" + datainicio + "' AND '" + datafinal + "'");
            resultadoQ.next();
            i = resultadoQ.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(CompraDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    @Override
    public Cidade consultarId(int id) {
        Cidade cidade = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM cidades "
                    + "WHERE id = " + id;

            System.out.println("Sql: " + sql);

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                cidade = new Cidade();

                cidade.setId(id);
                cidade.setNome(resultadoQ.getString("nome"));
            }

        } catch (Exception e) {
            System.out.println("Erro consultar cidade = " + e);
        }

        return cidade;
    }

    public String gerarParcelas(int parcelas, double valor, int vendaId) {

        String v = "";
        String valorTotal = "";
        int resultado = 0;
        boolean status = false;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            Data d = new Data();

            Parcelas p = new Parcelas();
            ArrayList<Double> x = p.calculaParcelas(valor, parcelas);

            d.avancarDias(30);

            for (int i = 0; i < x.size(); i++) {

                v = (p.df2.format(x.get(i)));
                valorTotal = v.replace(',', '.');

                VendaVeiculo vv = new VendaVeiculo();

                resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(" SELECT MAX(vv.id) as id FROM vendas_veiculos AS vv");

                resultadoQ.next();

                int max = resultadoQ.getInt("id");

                max = max + 1;

                String sql = " INSERT INTO vendas_veiculos VALUES "
                        + "( "
                        + "'" + max + "', "
                        + "'" + now + "', "
                        + "'" + now + "', "
                        + "'" + d.obterDataFormatada() + "',"
                        + "'" + status + "', "
                        + "'" + valorTotal + "', "
                        + "'" + vendaId + "'"
                        + " )";

                d.avancarDias(30);
                status = false;

                resultado = st.executeUpdate(sql);
            }

            if (resultado == 0) {
                return "Erro ao inserir";
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Erro ao inserir parcelas = " + e);
            return e.toString();

        }
    }

    public void popularTabela(JTable tabela, int vendaId) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Código";
        cabecalho[1] = "Data de vencimento";
        cabecalho[2] = "Valor da parcela";
        cabecalho[3] = "Status";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*)" + " "
                    + "FROM vendas_veiculos AS vv "
                    + " INNER JOIN vendas AS v "
                    + " ON vv.venda_id = " + vendaId
                    + " WHERE "
                    + " v.id = " + vendaId);

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][4];

        } catch (Exception e) {
            System.out.println("Erro ao consultar parcela: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT v.id AS venda_id" + ","
                    + "vv.data_vencimento AS data_vencimento" + ","
                    + "vv.id AS id" + ","
                    + "vv.valor_parcela AS valor_parcela" + ","
                    + "v.data AS data" + ","
                    + "CASE WHEN vv.status = true THEN 'Pago' ELSE 'Pendente' END AS status" + " "
                    + "FROM vendas_veiculos AS vv "
                    + " INNER JOIN vendas AS v "
                    + " ON vv.venda_id = " + vendaId
                    + " WHERE "
                    + " v.id = " + vendaId
                    + "ORDER BY vv.DATA_VENCIMENTO ASC");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = Formatacao.ajustaDataDMA(resultadoQ.getString("data_vencimento"));
                dadosTabela[lin][2] = Formatacao.formatarDecimal(resultadoQ.getDouble("valor_parcela"));
                dadosTabela[lin][3] = resultadoQ.getString("status");
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

    public String alterarStatus(VendaVeiculo venda_veiculo) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "UPDATE vendas_veiculos "
                    + "SET status = '" + venda_veiculo.isStatus() + "' "
                    + "WHERE id = " + venda_veiculo.getId();

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro atualizar parcela = " + e);
            return e.toString();
        }
    }
}
