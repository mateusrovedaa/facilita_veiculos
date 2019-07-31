package dao;

import entidade.Versao;
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

public class VersaoDao implements IDAO_T<Versao> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(Versao versao) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO versoes VALUES "
                    + "(DEFAULT, "
                    + "'" + versao.getNome() + "', "
                    + "'" + Formatacao.textoIdentificador(versao.getNome()) + "', "
                    + "'" + versao.getModeloId() + "', "
                    + "'" + versao.getCombustivelId() + "', "
                    + "'" + versao.getAnoFabricacao() + "',"
                    + "'" + versao.getAnoModelo() + "', "
                    + "'" + versao.getPeso() + "', "
                    + "'" + versao.getNumeroAssentos() + "', "
                    + "'" + versao.getNumeroPortas() + "', "
                    + "'" + versao.getConsumoCidade() + "', "
                    + "'" + versao.getConsumoEstrada() + "', "
                    + "'" + versao.getMotor() + "', "
                    + "'" + versao.getCavalosPotencia() + "', "
                    + "'" + versao.getCavalosPotenciaRpm() + "', "
                    + "'" + versao.getTorque() + "', "
                    + "'" + versao.getTorqueRpm() + "', "
                    + "'" + versao.getObservacoes() + "', "
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
            System.out.println("Erro salvar versão = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Versao versao) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "UPDATE versoes "
                    + "SET nome = '" + versao.getNome() + "', "
                    + "slug = '" + Formatacao.textoIdentificador(versao.getNome()) + "', "
                    + "modelo_id = '" + versao.getModeloId() + "', "
                    + "combustivel_id = '" + versao.getCombustivelId() + "', "
                    + "ano_fabricacao = '" + versao.getAnoFabricacao() + "', "
                    + "ano_modelo = '" + versao.getAnoModelo() + "', "
                    + "peso = '" + versao.getPeso() + "', "
                    + "numero_assentos = '" + versao.getNumeroAssentos() + "', "
                    + "numero_portas = '" + versao.getNumeroPortas() + "', "
                    + "consumo_cidade = '" + versao.getConsumoCidade() + "', "
                    + "consumo_estrada = '" + versao.getConsumoEstrada() + "', "
                    + "motor = '" + versao.getMotor() + "', "
                    + "cavalos_potencia = '" + versao.getCavalosPotencia() + "', "
                    + "cavalos_potencia_rpm = '" + versao.getCavalosPotenciaRpm() + "', "
                    + "torque = '" + versao.getTorque() + "', "
                    + "torque_rpm = '" + versao.getTorqueRpm() + "', "
                    + "observacoes = '" + versao.getObservacoes() + "', "
                    + "alterado_em = '" + now + "' "
                    + "WHERE id = " + versao.getId();

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro atualizar versão = " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "DELETE FROM versoes" + " "
                    + "WHERE id = " + id;

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro excluir versão = " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Versao> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Versao> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Versao consultarId(int id) {
        Versao versao = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM versoes "
                    + "WHERE id = " + id;

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                versao = new Versao();

                versao.setId(id);
                versao.setNome(resultadoQ.getString("nome"));
                versao.setModeloId(resultadoQ.getInt("modelo_id"));
                versao.setCombustivelId(resultadoQ.getInt("combustivel_id"));
                versao.setAnoFabricacao(resultadoQ.getString("ano_fabricacao"));
                versao.setAnoModelo(resultadoQ.getString("ano_modelo"));
                versao.setPeso(resultadoQ.getDouble("peso"));
                versao.setNumeroAssentos(resultadoQ.getInt("numero_assentos"));
                versao.setNumeroPortas(resultadoQ.getInt("numero_portas"));
                versao.setConsumoCidade(resultadoQ.getDouble("consumo_cidade"));
                versao.setConsumoEstrada(resultadoQ.getDouble("consumo_estrada"));
                versao.setMotor(resultadoQ.getString("motor"));
                versao.setCavalosPotencia(resultadoQ.getString("cavalos_potencia"));
                versao.setCavalosPotenciaRpm(resultadoQ.getString("cavalos_potencia_rpm"));
                versao.setTorque(resultadoQ.getString("torque"));
                versao.setTorqueRpm(resultadoQ.getString("torque_rpm"));
                versao.setObservacoes(resultadoQ.getString("observacoes"));
            }

        } catch (Exception e) {
            System.out.println("Erro consultar versão = " + e);
        }

        return versao;
    }

    public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Modelo";
        cabecalho[3] = "Ano de frabricação";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM versoes AS v WHERE v.NOME ILIKE '%" + criterio + "%' AND "
                    + "v.id IN (SELECT id FROM versoes WHERE NOME ILIKE '%" + criterio + "%' LIMIT 50)");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][4];

        } catch (Exception e) {
            System.out.println("Erro ao consultar versão: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT ve.id AS id" + ","
                    + "ve.nome AS nome" + ","
                    + "ve.ano_fabricacao AS ano_fabricacao" + ","
                    + "mo.nome AS modelo_id" + " "
                    + "FROM versoes AS ve "
                    + " INNER JOIN modelos AS mo "
                    + " ON ve.modelo_id = mo.id "
                    + " INNER JOIN combustiveis AS c "
                    + " ON ve.combustivel_id = c.id "
                    + "WHERE "
                    + "ve.NOME ILIKE '%" + criterio + "%' "
                    + "ORDER BY ve.CRIADO_EM DESC "
                    + "LIMIT 50");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("modelo_id");
                dadosTabela[lin][3] = resultadoQ.getString("ano_fabricacao");

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

    public int obterTotalVersoes() {
        int total = 0;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT COUNT(*) "
                    + "FROM versoes";

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            total = rs.getInt(1);

        } catch (Exception e) {
            System.out.println("Erro consultar total = " + e);
        }
        return total;
    }
}
