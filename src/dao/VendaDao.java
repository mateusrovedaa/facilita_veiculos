package dao;

import entidade.Venda;
import functions.ComboItem;
import functions.ConexaoBD;
import functions.Formatacao;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class VendaDao implements IDAO_T<Venda> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(Venda venda) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO vendas VALUES "
                    + "(DEFAULT, "
                    + "'" + venda.getVeiculoId() + "', "
                    + "'" + venda.getClienteId() + "', "
                    + "'" + venda.getUsuarioId() + "', "
                    + "'" + venda.getData() + "', "
                    + "'" + venda.getValorTotal() + "', "
                    + "'" + venda.getValorEntrada() + "', "
                    + "'" + venda.getNumeroParcelas() + "', "
                    + "'" + venda.getTipoPagamento() + "', "
                    + "'" + venda.getJuros() + "', "
                    + "'" + venda.getObservacoes() + "', "
                    + "'" + now + "', "
                    + "'" + now + "'"
                    + ") RETURNING id";

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            String venda_id = Integer.toString(rs.getInt(1));

            System.out.println("Sql: " + venda_id);

//            int resultado = st.executeUpdate(sql);
//
//            if (resultado == 0) {
//                return "Erro ao inserir";
//            } else {
//                return null;
//            }
            return venda_id;

        } catch (Exception e) {
            System.out.println("Erro salvar venda = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Venda venda) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "UPDATE vendas "
                    + "SET veiculo_id = '" + venda.getVeiculoId() + "', "
                    + "cliente_id = '" + venda.getClienteId() + "', "
                    + "usuario_id = '" + venda.getUsuarioId() + "', "
                    + "data = '" + venda.getData() + "', "
                    + "valor_total = '" + venda.getValorTotal() + "', "
                    + "valor_entrada = '" + venda.getValorEntrada() + "', "
                    + "numero_parcelas = '" + venda.getNumeroParcelas() + "', "
                    + "tipo_pagamento = '" + venda.getTipoPagamento() + "', "
                    + "juros = '" + venda.getJuros() + "', "
                    + "observacoes = '" + venda.getObservacoes() + "', "
                    + "alterado_em = '" + now + "'"
                    + "WHERE id = " + venda.getId();

            System.out.println("Sql: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro atualizar venda = " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "DELETE FROM vendas" + " "
                    + "WHERE id = " + id;
            String sql2 = ""
                    + "DELETE FROM vendas_veiculos" + " "
                    + "WHERE venda_id = " + id;

            System.out.println("Sql: " + sql);

            st.executeUpdate(sql2);
            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro excluir venda = " + e);
            return e.toString();
        }
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
        Venda venda = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM vendas "
                    + "WHERE id = " + id;

            System.out.println("Sql: " + sql);

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                venda = new Venda();

                venda.setId(id);
                venda.setVeiculoId(resultadoQ.getInt("veiculo_id"));
                venda.setClienteId(resultadoQ.getInt("cliente_id"));
                venda.setUsuarioId(resultadoQ.getInt("usuario_id"));
                venda.setData(resultadoQ.getString("data"));
                venda.setValorTotal(resultadoQ.getDouble("valor_total"));
                venda.setTipoPagamento(resultadoQ.getString("tipo_pagamento"));
                venda.setObservacoes(resultadoQ.getString("observacoes"));
                venda.setValorEntrada(resultadoQ.getDouble("valor_entrada"));
                venda.setNumeroParcelas(resultadoQ.getInt("numero_parcelas"));
                venda.setJuros(resultadoQ.getInt("juros"));
            }

        } catch (Exception e) {
            System.out.println("Erro consultar venda = " + e);
        }

        return venda;
    }

    public void listarTipoPagamento(JComboBox combo) {

        combo.removeAllItems();

        ComboItem selecione = new ComboItem();
        ComboItem dinheiro = new ComboItem();
        ComboItem cartaoCredito = new ComboItem();
        ComboItem cartaoDebito = new ComboItem();
        ComboItem boleto = new ComboItem();

        selecione.setCodigo(0);
        selecione.setDescricao("Selecione");

        dinheiro.setCodigo(1);
        dinheiro.setDescricao("Dinheiro");

        cartaoCredito.setCodigo(2);
        cartaoCredito.setDescricao("Cartão de crédito");

        cartaoDebito.setCodigo(3);
        cartaoDebito.setDescricao("Cartão de débito");

        boleto.setCodigo(4);
        boleto.setDescricao("Boleto bancário");

        combo.addItem(selecione);
        combo.addItem(dinheiro);
        combo.addItem(cartaoCredito);
        combo.addItem(cartaoDebito);
        combo.addItem(boleto);
    }

    public void listarNumeroParcelas(JComboBox combo) {

        combo.removeAllItems();

        ComboItem selecione = new ComboItem();
        ComboItem p34 = new ComboItem();
        ComboItem p36 = new ComboItem();
        ComboItem p60 = new ComboItem();
        ComboItem p80 = new ComboItem();
        ComboItem p84 = new ComboItem();

        selecione.setCodigo(0);
        selecione.setDescricao("Selecione");

        p34.setCodigo(34);
        p34.setDescricao("34 parcelas");

        p36.setCodigo(36);
        p36.setDescricao("36 parcelas");

        p60.setCodigo(60);
        p60.setDescricao("60 parcelas");

        p80.setCodigo(80);
        p80.setDescricao("80 parcelas");

        p84.setCodigo(84);
        p84.setDescricao("84 parcelas");

        combo.addItem(selecione);
        combo.addItem(p34);
        combo.addItem(p36);
        combo.addItem(p60);
        combo.addItem(p80);
        combo.addItem(p84);
    }

    public void popularTabela(JTable tabela, String dataInicial, String dataFinal) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[9];
        cabecalho[0] = "Código";
        cabecalho[1] = "Data";
        cabecalho[2] = "Cliente";
        cabecalho[3] = "Usuário";
        cabecalho[4] = "Veículo";
        cabecalho[5] = "Valor veículo";
        cabecalho[6] = "Valor entrada";
        cabecalho[7] = "Valor total";
        cabecalho[8] = "Parcelas";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*)" + " "
                    + "FROM vendas AS v "
                    + " INNER JOIN veiculos AS ve "
                    + " ON v.veiculo_id = ve.id "
                    + " INNER JOIN clientes AS c "
                    + " ON v.cliente_id = c.id "
                    + " INNER JOIN usuarios AS u "
                    + " ON v.usuario_id = u.id "
                    + "WHERE "
                    + "v.data BETWEEN " + "'" + Formatacao.ajustaDataAMD(dataInicial) + "'" + " AND " + "'" + Formatacao.ajustaDataAMD(dataFinal) + "'"
                    + "AND v.id IN (SELECT v.id FROM vendas AS v WHERE "
                    + "v.data BETWEEN " + "'" + Formatacao.ajustaDataAMD(dataInicial) + "'" + " AND " + "'" + Formatacao.ajustaDataAMD(dataFinal) + "'" + " "
                    + "LIMIT 50)"
            );

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][9];

        } catch (Exception e) {
            System.out.println("Erro ao consultar venda: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT v.id AS id" + ","
                    + "c.nome AS cliente_id" + ","
                    + "u.nome AS usuario_id" + ","
                    + "ve.placa AS veiculo_id" + ","
                    + "ve.valor AS valor" + ","
                    + "v.data AS data" + ","
                    + "v.valor_total AS valor_total" + ", "
                    + "v.valor_entrada AS valor_entrada" + ", "
                    + "v.numero_parcelas AS numero_parcelas" + " "
                    + "FROM vendas AS v "
                    + " INNER JOIN clientes AS c "
                    + " ON v.cliente_id = c.id "
                    + " INNER JOIN veiculos AS ve "
                    + " ON v.veiculo_id = ve.id "
                    + " INNER JOIN usuarios AS u "
                    + " ON v.usuario_id = u.id "
                    + "WHERE "
                    + "v.data BETWEEN " + "'" + Formatacao.ajustaDataAMD(dataInicial) + "'" + " AND " + "'" + Formatacao.ajustaDataAMD(dataFinal) + "' "
                    + "ORDER BY v.data DESC "
                    + "LIMIT 50");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = Formatacao.ajustaDataDMA(resultadoQ.getString("data"));
                dadosTabela[lin][2] = resultadoQ.getString("cliente_id");
                dadosTabela[lin][3] = resultadoQ.getString("usuario_id");
                dadosTabela[lin][4] = resultadoQ.getString("veiculo_id");
                dadosTabela[lin][5] = Formatacao.formatarDecimal(resultadoQ.getDouble("valor"));
                dadosTabela[lin][6] = Formatacao.formatarDecimal(resultadoQ.getDouble("valor_entrada"));
                dadosTabela[lin][7] = Formatacao.formatarDecimal(resultadoQ.getDouble("valor_total"));
                dadosTabela[lin][8] = resultadoQ.getInt("numero_parcelas");

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

    public int obterTotalVendas() {
        int total = 0;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT COUNT(*) "
                    + "FROM vendas";

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            total = rs.getInt(1);

        } catch (Exception e) {
            System.out.println("Erro consultar total = " + e);
        }
        return total;
    }
}
