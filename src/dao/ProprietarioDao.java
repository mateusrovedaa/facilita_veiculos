package dao;

import entidade.Proprietario;
import static facilitaveiculos.FacilitaVeiculos.conexao;
import functions.ConexaoBD;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ProprietarioDao implements IDAO_T<Proprietario> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    public String salvarProprietario(Proprietario proprietario) {
        try {
            Statement st = conexao.createStatement();

            String sql = "INSERT INTO proprietarios VALUES "
                    + "(DEFAULT, "
                    + "'" + proprietario.getNome() + "',"
                    + "'" + proprietario.getRg() + "',"
                    + "'" + proprietario.getCpf() + "',"
                    + "'" + proprietario.getCidade() + "',"
                    + "'" + proprietario.getEndereco() + "',"
                    + "'" + proprietario.getTelefone() + "',"
                    + "'" + proprietario.getEmail() + "'"
                    + ")";

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao inserir";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro salvar proprietário = " + e);
            return e.toString();
        }
    }

    @Override
    public String salvar(Proprietario o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO proprietarios VALUES "
                    + "(DEFAULT, "
                    + "'" + o.getNome() + "',"
                    + "'" + o.getRg() + "',"
                    + "'" + o.getCpf() + "',"
                    + "'" + o.getCidade() + "',"
                    + "'" + o.getEndereco() + "',"
                    + "'" + o.getTelefone() + "',"
                    + "'" + o.getEmail() + "',"
                    + "'" + now + "',"
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
            System.out.println("Erro salvar proprietário = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Proprietario o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "UPDATE proprietarios "
                    + "SET nome = '" + o.getNome() + "',"
                    + "rg = '" + o.getRg() + "', "
                    + "cpf = '" + o.getCpf() + "', "
                    + "cidade = '" + o.getCidade() + "', "
                    + "endereco = '" + o.getEndereco() + "', "
                    + "telefone = '" + o.getTelefone() + "', "
                    + "email = '" + o.getEmail() + "', "
                    + "alterado_em = '" + now + "'"
                    + "WHERE id = " + o.getId();

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro atualizar proprietário = " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "DELETE FROM proprietarios" + " "
                    + "WHERE id = " + id;

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro excluir proprietário = " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Proprietario> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Proprietario> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Proprietario consultarId(int id) {
        Proprietario proprietario = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM proprietarios "
                    + "WHERE id = " + id;

            System.out.println("Sql: " + sql);

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                proprietario = new Proprietario();

                proprietario.setId(id);
                proprietario.setNome(resultadoQ.getString("nome"));
                proprietario.setRg(resultadoQ.getString("rg"));
                proprietario.setCpf(resultadoQ.getString("cpf"));
                proprietario.setCidade(resultadoQ.getString("cidade"));
                proprietario.setEndereco(resultadoQ.getString("endereco"));
                proprietario.setTelefone(resultadoQ.getString("telefone"));
                proprietario.setEmail(resultadoQ.getString("email"));
            }

        } catch (Exception e) {
            System.out.println("Erro consultar proprietário = " + e);
        }

        return proprietario;
    }

    public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[5];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Cidade";
        cabecalho[3] = "Endereço";
        cabecalho[4] = "Telefone";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM proprietarios AS p WHERE NOME ILIKE '%" + criterio + "%' AND "
                    + "p.id IN (SELECT id FROM proprietarios WHERE NOME ILIKE '%" + criterio + "%' LIMIT 50)");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][8];

        } catch (Exception e) {
            System.out.println("Erro ao consultar proprietário: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM proprietarios "
                    + "WHERE "
                    + "NOME ILIKE '%" + criterio + "%' "
                    + "ORDER BY CRIADO_EM DESC "
                    + "LIMIT 50");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("cidade");
                dadosTabela[lin][3] = resultadoQ.getString("endereco");
                dadosTabela[lin][4] = resultadoQ.getString("telefone");

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

    public int obterTotalProprietarios() {
        int total = 0;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT COUNT(*) "
                    + "FROM proprietarios";

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            total = rs.getInt(1);

        } catch (Exception e) {
            System.out.println("Erro consultar total = " + e);
        }
        return total;
    }
}
