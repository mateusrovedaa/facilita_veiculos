//package dao;
//
//import entidade.Modelo;
//import functions.ConexaoBD;
//import functions.Formatacao;
//import functions.IDAO_T;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableColumn;
//
//public class ModeloDao implements IDAO_T<Modelo> {
//
//    ResultSet resultadoQ = null;
//    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
//
//    @Override
//    public String salvar(Modelo modelo) {
//        try {
//            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
//
//            String sql = "INSERT INTO modelos VALUES "
//                    + "(DEFAULT, "
//                    + "'" + modelo.getMarcaId() + "', "
//                    + "'" + modelo.getProcedenciaId() + "', "
//                    + "'" + modelo.getCarroceriaId() + "', "
//                    + "'" + modelo.getNome() + "',"
//                    + "'" + Formatacao.textoIdentificador(modelo.getNome()) + "',"
//                    + "'" + modelo.getComprimento() + "', "
//                    + "'" + modelo.getAltura() + "', "
//                    + "'" + modelo.getLargura() + "', "
//                    + "'" + now + "', "
//                    + "'" + now + "'"
//                    + ")";
//
//            System.out.println("Sql: " + sql);
//
//            int resultado = st.executeUpdate(sql);
//
//            if (resultado == 0) {
//                return "Erro ao inserir";
//            } else {
//                return null;
//            }
//
//        } catch (Exception e) {
//            System.out.println("Erro salvar modelo = " + e);
//            return e.toString();
//        }
//    }
//
//    @Override
//    public String atualizar(Modelo modelo) {
//        try {
//            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
//
//            String sql = ""
//                    + "UPDATE modelos "
//                    + "SET nome = '" + modelo.getNome() + "', "
//                    + "slug = '" + Formatacao.textoIdentificador(modelo.getNome()) + "', "
//                    + "marca_id = '" + modelo.getMarcaId() + "', "
//                    + "procedencia_id = '" + modelo.getProcedenciaId() + "', "
//                    + "carroceria_id = '" + modelo.getCarroceriaId() + "', "
//                    + "comprimento = '" + modelo.getComprimento() + "', "
//                    + "altura = '" + modelo.getAltura() + "', "
//                    + "largura = '" + modelo.getLargura() + "', "
//                    + "alterado_em = '" + now + "' "
//                    + "WHERE id = " + modelo.getId();
//
//            System.out.println("Sql: " + sql);
//
//            int resultado = st.executeUpdate(sql);
//
//            if (resultado == 0) {
//                return "Erro ao atualizar";
//            } else {
//                return null;
//            }
//
//        } catch (Exception e) {
//            System.out.println("Erro atualizar modelo = " + e);
//            return e.toString();
//        }
//    }
//
//    @Override
//    public String excluir(int id) {
//        try {
//            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
//
//            String sql = ""
//                    + "DELETE FROM modelos" + " "
//                    + "WHERE id = " + id;
//
//            System.out.println("Sql: " + sql);
//
//            int resultado = st.executeUpdate(sql);
//
//            if (resultado == 0) {
//                return "Erro ao atualizar";
//            } else {
//                return null;
//            }
//
//        } catch (Exception e) {
//            System.out.println("Erro excluir modelo = " + e);
//            return e.toString();
//        }
//    }
//
//    @Override
//    public ArrayList<Modelo> consultarTodos() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public ArrayList<Modelo> consultar(String criterio) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Modelo consultarId(int id) {
//        Modelo modelo = null;
//
//        try {
//            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
//
//            String sql = ""
//                    + "SELECT * "
//                    + "FROM modelos "
//                    + "WHERE id = " + id;
//
//            resultadoQ = st.executeQuery(sql);
//
//            while (resultadoQ.next()) {
//                modelo = new Modelo();
//
//                modelo.setId(id);
//                modelo.setNome(resultadoQ.getString("nome"));
//                modelo.setMarcaId(resultadoQ.getInt("marca_id"));
//                modelo.setProcedenciaId(resultadoQ.getInt("procedencia_id"));
//                modelo.setCarroceriaId(resultadoQ.getInt("carroceria_id"));
//                modelo.setComprimento(resultadoQ.getDouble("comprimento"));
//                modelo.setAltura(resultadoQ.getDouble("altura"));
//                modelo.setLargura(resultadoQ.getDouble("largura"));
//            }
//
//        } catch (Exception e) {
//            System.out.println("Erro consultar modelo = " + e);
//        }
//
//        return modelo;
//    }
//
//    public void popularTabela(JTable tabela, String criterio) {
//        // dados da tabela
//        Object[][] dadosTabela = null;
//
//        // cabecalho da tabela
//        Object[] cabecalho = new Object[4];
//        cabecalho[0] = "Código";
//        cabecalho[1] = "Nome";
//        cabecalho[2] = "Marca";
//        cabecalho[3] = "Procedência";
//
//        // cria matriz de acordo com nº de registros da tabela
//        try {
//            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
//                    + "SELECT count(*) FROM modelos AS m WHERE m.NOME ILIKE '%" + criterio + "%' AND "
//                    + "m.id IN (SELECT id FROM modelos WHERE NOME ILIKE '%" + criterio + "%' LIMIT 50)");
//
//            resultadoQ.next();
//
//            dadosTabela = new Object[resultadoQ.getInt(1)][4];
//
//        } catch (Exception e) {
//            System.out.println("Erro ao consultar modelo: " + e);
//        }
//
//        int lin = 0;
//
//        // efetua consulta na tabela
//        try {
//            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
//                    + "SELECT mo.id AS id" + ","
//                    + "mo.nome AS nome" + ","
//                    + "ma.nome AS marca_id" + ","
//                    + "p.nome AS procedencia_id "
//                    + "FROM modelos AS mo "
//                    + " LEFT JOIN marcas AS ma "
//                    + " ON mo.marca_id = ma.id "
//                    + " LEFT JOIN procedencias AS p "
//                    + " ON mo.procedencia_id = p.id "
//                    + "WHERE "
//                    + "mo.NOME ILIKE '%" + criterio + "%' "
//                    + "ORDER BY mo.CRIADO_EM DESC "
//                    + "LIMIT 50");
//
//            while (resultadoQ.next()) {
//
//                dadosTabela[lin][0] = resultadoQ.getInt("id");
//                dadosTabela[lin][1] = resultadoQ.getString("nome");
//                dadosTabela[lin][2] = resultadoQ.getString("marca_id");
//                dadosTabela[lin][3] = resultadoQ.getString("procedencia_id");
//
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
//
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
//}
