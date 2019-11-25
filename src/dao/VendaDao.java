package dao;

import entidade.Cidade;
import entidade.Venda;
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

//    public void popularTabela(JTable tabela, String usuario, String cliente, String placa, String data_de, String data_ate) {
//        // dados da tabela
//        Object[][] dadosTabela = null;
//
//        // cabecalho da tabela
//        Object[] cabecalho = new Object[9];
//        cabecalho[0] = "Código";
//        cabecalho[1] = "Data";
//        cabecalho[2] = "Cliente";
//        cabecalho[3] = "Usuário";
//        cabecalho[4] = "Veículo";
//        cabecalho[5] = "Valor veículo";
//        cabecalho[6] = "Valor entrada";
//        cabecalho[7] = "Valor total";
//        cabecalho[8] = "Parcelas";
//        
//        String usuario = usuario_id != "" ? "ma.ID = " + usuario_id + " " : " 1 = 1 ";
//        String situacao = situacao_id != "" ? "sv.ID = " + situacao_id + " " : " 1 = 1 ";
//
//        // cria matriz de acordo com nº de registros da tabela
//        try {
//            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
//                    + "SELECT count(*) FROM vendas AS v INNER JOIN clientes AS c"
//                    + "ON v.cliente_id = c.id "
//                    + "INNER JOIN usuarios AS u "
//                    + "ON v.usuario_id = u.id"
//                    + "INNER JOIN veiculos AS ve "
//                    + "ON v.veiculo_id = ve.id "
//                    + "WHERE ve.PLACA ILIKE '%" + placa + "%' AND "
//                    + "id IN (SELECT id FROM cidades WHERE NOME ILIKE '%" + criterio + "%' LIMIT 50)");
//
//            resultadoQ.next();
//
//            dadosTabela = new Object[resultadoQ.getInt(1)][9];
//
//        } catch (Exception e) {
//            System.out.println("Erro ao consultar cidade: " + e);
//        }
//
//        int lin = 0;
//
//        // efetua consulta na tabela
//        try {
//            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
//                    + "SELECT c.id, c.nome, e.nome AS estado FROM cidades AS c "
//                    + "INNER JOIN estados AS e "
//                    + "ON c.estado_id = e.id "
//                    + "WHERE "
//                    + "c.NOME ILIKE '%" + criterio + "%' "
//                    + "ORDER BY c.CRIADO_EM DESC "
//                    + "LIMIT 50");
//
//            while (resultadoQ.next()) {
//
//                dadosTabela[lin][0] = resultadoQ.getInt("id");
//                dadosTabela[lin][1] = resultadoQ.getString("nome");
//                dadosTabela[lin][2] = resultadoQ.getString("estado");
//                // caso a coluna precise exibir uma imagem
////                if (resultadoQ.getBoolean("Situacao")) {
////                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
////                } else {
////                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
////                }
//                lin++;
//            }
//        } catch (Exception e) {
//            System.out.println("problemas para popular tabela...");
//            System.out.println(e);
//        }
//
//        // configuracoes adicionais no componente tabela
//        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
//            @Override
//            // quando retorno for FALSE, a tabela nao é editavel
//            public boolean isCellEditable(int row, int column) {
//                return false;
//                /*  
//                 if (column == 3) {  // apenas a coluna 3 sera editavel
//                 return true;
//                 } else {
//                 return false;
//                 }
//                 */
//            }
//
//            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
//            @Override
//            public Class getColumnClass(int column) {
//
//                if (column == 2) {
////                    return ImageIcon.class;
//                }
//                return Object.class;
//            }
//        });
//
//        // permite seleção de apenas uma linha da tabela
//        tabela.setSelectionMode(0);
//
//        // redimensiona as colunas de uma tabela
//        TableColumn column = null;
//        for (int i = 0; i < tabela.getColumnCount(); i++) {
//            column = tabela.getColumnModel().getColumn(i);
//            switch (i) {
//                case 0:
//                    column.setPreferredWidth(17);
//                    break;
//                case 1:
//                    column.setPreferredWidth(140);
//                    break;
////                case 2:
////                    column.setPreferredWidth(14);
////                    break;
//            }
//        }
//        // renderizacao das linhas da tabela = mudar a cor
////        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
////
////            @Override
////            public Component getTableCellRendererComponent(JTable table, Object value,
////                    boolean isSelected, boolean hasFocus, int row, int column) {
////                super.getTableCellRendererComponent(table, value, isSelected,
////                        hasFocus, row, column);
////                if (row % 2 == 0) {
////                    setBackground(Color.GREEN);
////                } else {
////                    setBackground(Color.LIGHT_GRAY);
////                }
////                return this;
////            }
////        });
//    }
}
