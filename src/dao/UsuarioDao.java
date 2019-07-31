package dao;

import entidade.Usuario;
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

public class UsuarioDao implements IDAO_T<Usuario> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(Usuario usuario) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO usuarios VALUES "
                    + "(DEFAULT, "
                    + "'" + usuario.getPerfilId() + "',"
                    + "'" + usuario.getNome() + "',"
                    + "'" + usuario.getEmail() + "',"
                    + "'" + usuario.getDataNascimento() + "',"
                    + "'" + usuario.getSenha() + "',"
                    + "'" + usuario.getConfirmaSenha() + "', "
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
            System.out.println("Erro salvar usuário = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Usuario usuario) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "UPDATE usuarios "
                    + "SET perfil_id = '" + usuario.getPerfilId() + "',"
                    + "nome = '" + usuario.getNome() + "',"
                    + "email = '" + usuario.getEmail() + "',"
                    + "data_nascimento = '" + usuario.getDataNascimento() + "',"
                    + "senha = '" + usuario.getSenha() + "',"
                    + "confirma_senha = '" + usuario.getConfirmaSenha() + "',"
                    + "alterado_em = '" + now + "'"
                    + "WHERE id = " + usuario.getId();

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro atualizar usuário = " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "DELETE FROM usuarios" + " "
                    + "WHERE id = " + id;

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro excluir usuário = " + e);
            return e.toString();
        }
    }

    public int validarLogin(String login, String senha) {
        int id = 0;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT id, email, senha "
                    + "FROM usuarios "
                    + "WHERE email = '" + login + "' "
                    + "AND senha = '" + senha + "'";

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            id = rs.getInt(1);

            Usuario x = new Usuario();
            x.setId(id);

            System.out.println("Sql: " + sql);

            if (id != 0) {
                System.out.println(id);
                return id;
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e);
            return 0;
        }

        return 0;
    }

    @Override
    public ArrayList<Usuario> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Usuario> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario consultarId(int id) {
        Usuario usuario = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM usuarios "
                    + "WHERE id = " + id;

            System.out.println("Sql: " + sql);

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                usuario = new Usuario();

                usuario.setId(id);
                usuario.setPerfilId(resultadoQ.getInt("perfil_id"));
                usuario.setNome(resultadoQ.getString("nome"));
                usuario.setEmail(resultadoQ.getString("email"));
                usuario.setDataNascimento(resultadoQ.getString("data_nascimento"));
                usuario.setSenha(resultadoQ.getString("senha"));
                usuario.setConfirmaSenha(resultadoQ.getString("confirma_senha"));
            }

        } catch (Exception e) {
            System.out.println("Erro consultar usuário = " + e);
        }

        return usuario;
    }

    public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[5];
        cabecalho[0] = "Código";
        cabecalho[1] = "Perfil";
        cabecalho[2] = "Nome";
        cabecalho[3] = "Data de nascimento";
        cabecalho[4] = "Email";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM usuarios WHERE NOME ILIKE '%" + criterio + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][5];

        } catch (Exception e) {
            System.out.println("Erro ao consultar usuário: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT u.id AS id" + ","
                    + "p.nome AS perfil_id" + ","
                    + "u.nome AS nome" + ","
                    + "u.data_nascimento AS data_nascimento" + ","
                    + "u.email AS email "
                    + "FROM usuarios AS u "
                    + " INNER JOIN perfis AS p "
                    + " ON u.perfil_id = p.id "
                    + "WHERE "
                    + "u.NOME ILIKE '%" + criterio + "%' "
                    + "ORDER BY u.CRIADO_EM DESC");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("perfil_id");
                dadosTabela[lin][2] = resultadoQ.getString("nome");
                String data_nascimento = Formatacao.ajustaDataDMA(resultadoQ.getString("data_nascimento"));
                dadosTabela[lin][3] = data_nascimento;
                dadosTabela[lin][4] = resultadoQ.getString("email");

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

    public int obterTotalUsuarios() {
        int total = 0;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT COUNT(*) "
                    + "FROM usuarios";

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            total = rs.getInt(1);

        } catch (Exception e) {
            System.out.println("Erro consultar total = " + e);
        }
        return total;
    }

}
