package dao;

import entidade.AcabamentoInterno;
import java.sql.Statement;
import functions.ConexaoBD;
import functions.Formatacao;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class AcabamentoInternoDao implements IDAO_T<AcabamentoInterno> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    public String salvarAcabamentoInterno(AcabamentoInterno acabamentoInterno) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO acabamentos_internos VALUES "
                    + "(DEFAULT, "
                    + "'" + acabamentoInterno.getNome() + "'"
                    + ")";

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao inserir";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro salvar acabamento interno = " + e);
            return e.toString();
        }
    }

    @Override
    public String salvar(AcabamentoInterno o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO acabamentos_internos VALUES "
                    + "(DEFAULT, "
                    + "'" + o.getNome() + "', "
                    + "'" + Formatacao.textoIdentificador(o.getNome()) + "', "
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
            System.out.println("Erro salvar acabamento interno = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(AcabamentoInterno o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "UPDATE acabamentos_internos "
                    + "SET nome = '" + o.getNome() + "', "
                    + "slug = '" + Formatacao.textoIdentificador(o.getNome()) + "', "
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
            System.out.println("Erro atualizar acabamento interno = " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "DELETE FROM acabamentos_internos" + " "
                    + "WHERE id = " + id;

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro excluir acabamento interno = " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<AcabamentoInterno> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AcabamentoInterno> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AcabamentoInterno consultarId(int id) {
        AcabamentoInterno acabamentoInterno = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM acabamentos_internos "
                    + "WHERE id = " + id;

            System.out.println("Sql: " + sql);

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                acabamentoInterno = new AcabamentoInterno();

                acabamentoInterno.setId(id);
                acabamentoInterno.setNome(resultadoQ.getString("nome"));
            }

        } catch (Exception e) {
            System.out.println("Erro consultar acabamento interno = " + e);
        }

        return acabamentoInterno;
    }

    public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[2];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM acabamentos_internos WHERE NOME ILIKE '%" + criterio + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][2];

        } catch (Exception e) {
            System.out.println("Erro ao consultar acabamento interno: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM acabamentos_internos "
                    + "WHERE "
                    + "NOME ILIKE '%" + criterio + "%' "
                    + "ORDER BY CRIADO_EM DESC");

            while (resultadoQ.next()) {

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
}
