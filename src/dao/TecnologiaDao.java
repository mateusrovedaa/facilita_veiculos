package dao;

import entidade.Tecnologia;
import static facilitaveiculos.FacilitaVeiculos.conexao;
import functions.ConexaoBD;
import functions.Formatacao;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TecnologiaDao implements IDAO_T<Tecnologia> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(Tecnologia o) {
        return null;
    }

    @Override
    public String atualizar(Tecnologia o) {
        return null;
    }

    @Override
    public String excluir(int id) {
        return null;
    }

    @Override
    public ArrayList<Tecnologia> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Tecnologia> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tecnologia consultarId(int id) {
        Tecnologia tecnologia = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM tecnologias "
                    + "WHERE id = " + id;

            System.out.println("Sql: " + sql);

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                tecnologia = new Tecnologia();

                tecnologia.setId(id);
                tecnologia.setNome(resultadoQ.getString("nome"));
            }

        } catch (Exception e) {
            System.out.println("Erro consultar tecnologia = " + e);
        }

        return tecnologia;
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
                    + "SELECT count(*) FROM tecnologias AS t WHERE t.NOME ILIKE '%" + criterio + "%' AND "
                    + "t.id IN (SELECT id FROM tecnologias WHERE NOME ILIKE '%" + criterio + "%' LIMIT 50)");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][2];

        } catch (Exception e) {
            System.out.println("Erro ao consultar tecnologia: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM tecnologias "
                    + "WHERE "
                    + "NOME ILIKE '%" + criterio + "%' "
                    + "ORDER BY CRIADO_EM DESC "
                    + "LIMIT 50");

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

    public void listarTecnologia(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;
        JCheckBox checkbox = new JCheckBox();

        // cabecalho da tabela
        Object[] cabecalho = new Object[3];
        cabecalho[0] = "";
        cabecalho[1] = "Código";
        cabecalho[2] = "Nome";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM tecnologias WHERE NOME ILIKE '%" + criterio + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][3];

        } catch (Exception e) {
            System.out.println("Erro ao consultar tecnologia: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM tecnologias "
                    + "WHERE "
                    + "NOME ILIKE '%" + criterio + "%' "
                    + "ORDER BY NOME ASC");

            while (resultadoQ.next()) {

//                dadosTabela[lin][0] = "";
                dadosTabela[lin][1] = resultadoQ.getString("id");
                dadosTabela[lin][2] = resultadoQ.getString("nome");

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
                //              return false;

                if (column == 0) {  // apenas a coluna 3 sera editavel
                    return true;
                } else {
                    return false;
                }

            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 0) {
                    return Boolean.class;
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
            }
        }
    }
}
