package dao;

import entidade.Compra;
import functions.ConexaoBD;
import functions.Formatacao;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class CompraDao implements IDAO_T<Compra> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(Compra compra) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO compras VALUES "
                    + "(DEFAULT, "
                    + "'" + compra.getProprietarioId() + "', "
                    + "'" + compra.getVeiculoId() + "', "
                    + "'" + compra.getData() + "', "
                    + "'" + compra.getValor() + "', "
                    + "'" + compra.getObservacoes() + "', "
                    + "'" + now + "', "
                    + "'" + now + "'"
                    + ")";

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao inserir";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro salvar compra = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Compra compra) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "UPDATE compras "
                    + "SET proprietario_id = '" + compra.getProprietarioId() + "', "
                    + "veiculo_id = '" + compra.getVeiculoId() + "', "
                    + "data = '" + compra.getData() + "', "
                    + "valor = '" + compra.getValor() + "', "
                    + "observacoes = '" + compra.getObservacoes() + "', "
                    + "alterado_em = '" + now + "'"
                    + "WHERE id = " + compra.getId();

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro atualizar compra = " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "DELETE FROM compras" + " "
                    + "WHERE id = " + id;

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro excluir compra = " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Compra> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Compra> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compra consultarId(int id) {
        Compra compra = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM compras "
                    + "WHERE id = " + id;

            System.out.println("Sql: " + sql);

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                compra = new Compra();

                compra.setId(id);
                compra.setProprietarioId(resultadoQ.getInt("proprietario_id"));
                compra.setVeiculoId(resultadoQ.getInt("veiculo_id"));
                compra.setData(resultadoQ.getString("data"));
                compra.setValor(resultadoQ.getDouble("valor"));
                compra.setObservacoes(resultadoQ.getString("observacoes"));
            }

        } catch (Exception e) {
            System.out.println("Erro consultar compra = " + e);
        }

        return compra;
    }

    public void popularTabela(JTable tabela, String dataInicial, String dataFinal) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[5];
        cabecalho[0] = "Código";
        cabecalho[1] = "Data";
        cabecalho[2] = "Veículo";
        cabecalho[3] = "Proprietário";
        cabecalho[4] = "Valor";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*)" + " "
                    + "FROM compras AS c "
                    + " INNER JOIN proprietarios AS p "
                    + " ON c.proprietario_id = p.id "
                    + " INNER JOIN veiculos AS v "
                    + " ON c.veiculo_id = v.id "
                    + "WHERE "
                    + "c.data BETWEEN " + "'" + Formatacao.ajustaDataAMD(dataInicial) + "'" + " AND " + "'" + Formatacao.ajustaDataAMD(dataFinal) + "'"
                    + "AND c.id IN (SELECT c.id FROM compras AS c WHERE "
                    + "c.data BETWEEN " + "'" + Formatacao.ajustaDataAMD(dataInicial) + "'" + " AND " + "'" + Formatacao.ajustaDataAMD(dataFinal) + "'" + " "
                    + "LIMIT 50)"
            );

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][5];

        } catch (Exception e) {
            System.out.println("Erro ao consultar compra: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT c.id AS id" + ","
                    + "p.nome AS proprietario_id" + ","
                    + "v.placa AS veiculo_id" + ","
                    + "c.data AS data" + ","
                    + "c.valor AS valor" + " "
                    + "FROM compras AS c "
                    + " INNER JOIN proprietarios AS p "
                    + " ON c.proprietario_id = p.id "
                    + " INNER JOIN veiculos AS v "
                    + " ON c.veiculo_id = v.id "
                    + "WHERE "
                    + "c.data BETWEEN " + "'" + Formatacao.ajustaDataAMD(dataInicial) + "'" + " AND " + "'" + Formatacao.ajustaDataAMD(dataFinal) + "' "
                    + "ORDER BY c.data DESC "
                    + "LIMIT 50");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = Formatacao.ajustaDataDMA(resultadoQ.getString("data"));
                dadosTabela[lin][2] = resultadoQ.getString("veiculo_id");
                dadosTabela[lin][3] = resultadoQ.getString("proprietario_id");
                dadosTabela[lin][4] = Formatacao.formatarDecimal(resultadoQ.getDouble("valor"));

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

    public int obterTotalCompras() {
        int total = 0;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT COUNT(*) "
                    + "FROM compras";

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            total = rs.getInt(1);

        } catch (Exception e) {
            System.out.println("Erro consultar total = " + e);
        }
        return total;
    }
}
