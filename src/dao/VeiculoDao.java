package dao;

import entidade.Conforto;
import entidade.Estilo;
import entidade.Extra;
import entidade.Seguranca;
import entidade.Tecnologia;
import entidade.Veiculo;
import functions.ComboItem;
import functions.ConexaoBD;
import functions.Formatacao;
import functions.IDAO_T;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class VeiculoDao implements IDAO_T<Veiculo> {

    ResultSet resultadoQ = null;
    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

    @Override
    public String salvar(Veiculo veiculo) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO veiculos VALUES "
                    + "(DEFAULT, "
                    + "'" + veiculo.getVersaoId() + "',"
                    + "'" + veiculo.getCambioId() + "',"
                    + "'" + veiculo.getCorExternaId() + "',"
                    + "'" + veiculo.getCorInternaId() + "',"
                    + "'" + veiculo.getAcabamentoInternoId() + "',"
                    + "'" + veiculo.getSituacao() + "', "
                    + "'" + veiculo.getQuilometragem() + "', "
                    + "'" + veiculo.getPlaca() + "', "
                    + "'" + veiculo.getChassi() + "', "
                    + "'" + veiculo.getRenavam() + "', "
                    + "'" + veiculo.getNumeroProprietarios() + "', "
                    + "'" + veiculo.getNumeroOcorrencias() + "', "
                    + "'" + veiculo.isChaveReserva() + "', "
                    + "'" + veiculo.isManualVeiculo() + "', "
                    + "'" + veiculo.isVistoriado() + "', "
                    + "'" + veiculo.getValor() + "', "
                    + "'" + veiculo.getInformacoesVeiculo() + "', "
                    + "'" + null + "', "
                    + "'" + now + "', "
                    + "'" + now + "'"
                    + ") RETURNING id";

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            String id = Integer.toString(rs.getInt(1));

//            if (id == 0) {
//                return "Erro ao inserir";
//            } else {
//                return null;
//            }
            return id;

        } catch (Exception e) {
            System.out.println("Erro salvar veículo = " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Veiculo veiculo) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "UPDATE veiculos "
                    + "SET versao_id = '" + veiculo.getVersaoId() + "',"
                    + "cambio_id = '" + veiculo.getCambioId() + "',"
                    + "cor_externa_id = '" + veiculo.getCorExternaId() + "',"
                    + "cor_interna_id = '" + veiculo.getCorInternaId() + "',"
                    + "acabamento_interno_id = '" + veiculo.getAcabamentoInternoId() + "',"
                    + "situacao = '" + veiculo.getSituacao() + "', "
                    + "quilometragem = '" + veiculo.getQuilometragem() + "', "
                    + "placa = '" + veiculo.getPlaca() + "', "
                    + "chassi = '" + veiculo.getChassi() + "', "
                    + "renavam = '" + veiculo.getRenavam() + "', "
                    + "numero_proprietarios = '" + veiculo.getNumeroProprietarios() + "', "
                    + "numero_ocorrencias = '" + veiculo.getNumeroOcorrencias() + "', "
                    + "chave_reserva = '" + veiculo.isChaveReserva() + "', "
                    + "manual_veiculo = '" + veiculo.isManualVeiculo() + "', "
                    + "vistoriado = '" + veiculo.isVistoriado() + "', "
                    + "valor = '" + veiculo.getValor() + "', "
                    + "informacoes_veiculo = '" + veiculo.getInformacoesVeiculo() + "', "
                    + "galeria = '" + null + "', "
                    + "alterado_em = '" + now + "'"
                    + "WHERE id = " + veiculo.getId() + " "
                    + "RETURNING id";

//            int resultado = st.executeUpdate(sql);
//
//            if (resultado == 0) {
//                return "Erro ao atualizar";
//            } else {
//                return null;
//            }
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            String id = Integer.toString(rs.getInt(1));

            return id;

        } catch (Exception e) {
            System.out.println("Erro atualizar veículo = " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "DELETE FROM veiculos" + " "
                    + "WHERE id = " + id;

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro excluir veículo = " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Veiculo> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Veiculo> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Veiculo consultarId(int id) {
        Veiculo veiculo = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM veiculos "
                    + "WHERE id = " + id;

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                veiculo = new Veiculo();

                veiculo.setId(id);
                veiculo.setVersaoId(resultadoQ.getInt("versao_id"));
                veiculo.setCambioId(resultadoQ.getInt("cambio_id"));
                veiculo.setCorInternaId(resultadoQ.getInt("cor_interna_id"));
                veiculo.setCorExternaId(resultadoQ.getInt("cor_externa_id"));
                veiculo.setAcabamentoInternoId(resultadoQ.getInt("acabamento_interno_id"));
                veiculo.setSituacao(resultadoQ.getString("situacao"));
                veiculo.setQuilometragem(resultadoQ.getDouble("quilometragem"));
                veiculo.setPlaca(resultadoQ.getString("placa"));
                veiculo.setChassi(resultadoQ.getString("chassi"));
                veiculo.setRenavam(resultadoQ.getString("renavam"));
                veiculo.setNumeroProprietarios(resultadoQ.getInt("numero_proprietarios"));
                veiculo.setNumeroOcorrencias(resultadoQ.getInt("numero_ocorrencias"));
                veiculo.setChaveReserva(resultadoQ.getBoolean("chave_reserva"));
                veiculo.setManualVeiculo(resultadoQ.getBoolean("manual_veiculo"));
                veiculo.setVistoriado(resultadoQ.getBoolean("vistoriado"));
                veiculo.setValor(resultadoQ.getDouble("valor"));
                veiculo.setInformacoesVeiculo(resultadoQ.getString("informacoes_veiculo"));
            }

        } catch (Exception e) {
            System.out.println("Erro consultar veículo = " + e);
        }

        return veiculo;
    }

    public double valorVeiculo(int id) {
        Veiculo veiculo = null;
        double valor = 0;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT valor "
                    + "FROM veiculos "
                    + "WHERE id = " + id;

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            valor = rs.getDouble(1);

        } catch (Exception e) {
            System.out.println("Erro consultar valor = " + e);
        }

        return valor;
    }

    public void listarSituacaoVeiculo(JComboBox combo) {

        combo.removeAllItems();

        ComboItem selecione = new ComboItem();
        ComboItem aVenda = new ComboItem();
        ComboItem emNegociacao = new ComboItem();
        ComboItem vendido = new ComboItem();

        selecione.setCodigo(0);
        selecione.setDescricao("Selecione");

        aVenda.setCodigo(1);
        aVenda.setDescricao("À venda");

        emNegociacao.setCodigo(2);
        emNegociacao.setDescricao("Em negociação");

        vendido.setCodigo(3);
        vendido.setDescricao("Vendido");

        combo.addItem(selecione);
        combo.addItem(aVenda);
        combo.addItem(emNegociacao);
        combo.addItem(vendido);
    }

    public int obterTotalVeiculos(String situacao) {
        int total = 0;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT COUNT(*) "
                    + "FROM veiculos "
                    + "WHERE situacao = '" + situacao + "'";
            System.out.println(sql);

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            total = rs.getInt(1);

        } catch (Exception e) {
            System.out.println("Erro consultar total = " + e);
        }
        return total;
    }

    public void listarVeiculo(JTable tabela, String placa, String situacao) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[6];
        cabecalho[0] = "Código";
        cabecalho[1] = "Placa";
        cabecalho[2] = "Valor";
        cabecalho[3] = "Marca";
        cabecalho[4] = "Modelo";
        cabecalho[5] = "Versão";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM veiculos WHERE PLACA ILIKE '%" + placa + "%' "
                    + "AND SITUACAO ILIKE '%" + situacao + "%' ");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][6];

        } catch (Exception e) {
            System.out.println("Erro ao consultar veículo: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT v.id AS id" + ","
                    + "v.placa AS placa" + ","
                    + "ma.nome AS marca" + ","
                    + "mo.nome AS modelo " + ","
                    + "v.valor AS valor " + ","
                    + "ve.nome AS versao "
                    + "FROM veiculos AS v "
                    + " LEFT JOIN versoes AS ve "
                    + " ON v.versao_id = ve.id "
                    + " LEFT JOIN modelos AS mo "
                    + " ON ve.modelo_id = mo.id "
                    + " LEFT JOIN marcas AS ma "
                    + " ON mo.marca_id = ma.id "
                    + "WHERE "
                    + "v.PLACA ILIKE '%" + placa + "%' "
                    + "AND v.SITUACAO ILIKE '%" + situacao + "%' "
                    + "ORDER BY v.CRIADO_EM DESC");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("placa");
                dadosTabela[lin][2] = Formatacao.formatarDecimal(resultadoQ.getDouble("valor"));
                dadosTabela[lin][3] = resultadoQ.getString("marca");
                dadosTabela[lin][4] = resultadoQ.getString("modelo");
                dadosTabela[lin][5] = resultadoQ.getString("versao");

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

    public String atualizarSituacao(Veiculo veiculo) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "UPDATE veiculos "
                    + "SET situacao = '" + veiculo.getSituacao() + "' "
                    + "WHERE id = " + veiculo.getId();

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar";
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro atualizar situação = " + e);
            return e.toString();
        }
    }

    public double calcularValorTotal(double valorVeiculo, double valorEntrada, double juros) {
        double taxaJuros = (juros / 100);
        double valorJuros;
        double valorTotal;
        valorJuros = (valorVeiculo - valorEntrada) * taxaJuros;
        valorTotal = (valorVeiculo + valorJuros);

        return valorTotal;
    }

    public void popularTabela(JTable tabela, String placa, String situacao, String dataDe, String dataAte) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[8];
        cabecalho[0] = "Código";
        cabecalho[1] = "Placa";
        cabecalho[2] = "Situação";
        cabecalho[3] = "Valor";
        cabecalho[4] = "Marca";
        cabecalho[5] = "Modelo";
        cabecalho[6] = "Versão";
        cabecalho[7] = "Criado em";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM veiculos WHERE PLACA ILIKE '%" + placa + "%' AND SITUACAO ILIKE '%" + situacao + "%' "
                    + "AND criado_em BETWEEN " + "'" + Formatacao.ajustaDataAMD(dataDe) + "' "
                    + "AND " + "'" + Formatacao.ajustaDataAMD(dataAte) + " 23:59:00" + "' "
                    + "AND id IN (SELECT id FROM veiculos "
                    + "WHERE PLACA ILIKE '%" + placa + "%' AND SITUACAO ILIKE '%" + situacao + "%' "
                    + "AND criado_em BETWEEN " + "'" + Formatacao.ajustaDataAMD(dataDe) + "' "
                    + "AND " + "'" + Formatacao.ajustaDataAMD(dataAte) + " 23:59:00" + "' "
                    + "LIMIT 50)");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][8];

        } catch (Exception e) {
            System.out.println("Erro ao consultar veículo: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT v.id AS id" + ","
                    + "v.placa AS placa" + ","
                    + "ma.nome AS marca" + ","
                    + "mo.nome AS modelo " + ","
                    + "v.valor AS valor " + ","
                    + "v.situacao AS situacao " + ","
                    + "v.criado_em AS criado_em " + ","
                    + "ve.nome AS versao "
                    + "FROM veiculos AS v "
                    + " LEFT JOIN versoes AS ve "
                    + " ON v.versao_id = ve.id "
                    + " LEFT JOIN modelos AS mo "
                    + " ON ve.modelo_id = mo.id "
                    + " LEFT JOIN marcas AS ma "
                    + " ON mo.marca_id = ma.id "
                    + "WHERE "
                    + "v.PLACA ILIKE '%" + placa + "%' "
                    + "AND v.SITUACAO ILIKE '%" + situacao + "%' "
                    + "AND v.criado_em BETWEEN " + "'" + Formatacao.ajustaDataAMD(dataDe) + "' "
                    + "AND " + "'" + Formatacao.ajustaDataAMD(dataAte) + " 23:59:00" + "' "
                    + "ORDER BY v.CRIADO_EM DESC "
                    + "LIMIT 50");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("placa");
                dadosTabela[lin][2] = resultadoQ.getString("situacao");
                dadosTabela[lin][3] = Formatacao.formatarDecimal(resultadoQ.getDouble("valor"));
                dadosTabela[lin][4] = resultadoQ.getString("marca");
                dadosTabela[lin][5] = resultadoQ.getString("modelo");
                dadosTabela[lin][6] = resultadoQ.getString("versao");
                dadosTabela[lin][7] = Formatacao.ajustaDataDMA(resultadoQ.getString("criado_em"));

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

    public Conforto obterVeiculoConforto(JTable tabela, int veiculoId) {
        Conforto conforto = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT c.nome, c.id "
                    + "FROM "
                    + "veiculos_confortos AS vc "
                    + "INNER JOIN "
                    + "confortos AS c "
                    + "ON "
                    + "vc.conforto_id = c.id "
                    + "WHERE "
                    + "vc.veiculo_id = " + veiculoId;

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                conforto = new Conforto();

                conforto.setId(resultadoQ.getInt("id"));
                conforto.setNome(resultadoQ.getString("nome"));

                int id = resultadoQ.getInt("id");

                for (int i = 0; i < tabela.getRowCount(); i++) {

                    if (id == Integer.parseInt((String) tabela.getValueAt(i, 1))) {
                        tabela.setValueAt(true, i, 0);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro consultar confortos = " + e);
        }

        return conforto;
    }

    public Seguranca obterVeiculoSeguranca(JTable tabela, int veiculoId) {
        Seguranca seguranca = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT s.nome, s.id "
                    + "FROM "
                    + "veiculos_segurancas AS vs "
                    + "INNER JOIN "
                    + "segurancas AS s "
                    + "ON "
                    + "vs.seguranca_id = s.id "
                    + "WHERE "
                    + "vs.veiculo_id = " + veiculoId;

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                seguranca = new Seguranca();

                seguranca.setId(resultadoQ.getInt("id"));
                seguranca.setNome(resultadoQ.getString("nome"));

                int id = resultadoQ.getInt("id");

                for (int i = 0; i < tabela.getRowCount(); i++) {

                    if (id == Integer.parseInt((String) tabela.getValueAt(i, 1))) {
                        tabela.setValueAt(true, i, 0);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro consultar seguranças = " + e);
        }

        return seguranca;
    }

    public Tecnologia obterVeiculoTecnologia(JTable tabela, int veiculoId) {
        Tecnologia tecnologia = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT t.nome, t.id "
                    + "FROM "
                    + "veiculos_tecnologias AS vt "
                    + "INNER JOIN "
                    + "tecnologias AS t "
                    + "ON "
                    + "vt.tecnologia_id = t.id "
                    + "WHERE "
                    + "vt.veiculo_id = " + veiculoId;

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                tecnologia = new Tecnologia();

                tecnologia.setId(resultadoQ.getInt("id"));
                tecnologia.setNome(resultadoQ.getString("nome"));

                int id = resultadoQ.getInt("id");

                for (int i = 0; i < tabela.getRowCount(); i++) {

                    if (id == Integer.parseInt((String) tabela.getValueAt(i, 1))) {
                        tabela.setValueAt(true, i, 0);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro consultar tecnologias = " + e);
        }

        return tecnologia;
    }

    public Estilo obterVeiculoEstilo(JTable tabela, int veiculoId) {
        Estilo estilo = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT e.nome, e.id "
                    + "FROM "
                    + "veiculos_estilos AS ve "
                    + "INNER JOIN "
                    + "estilos AS e "
                    + "ON "
                    + "ve.estilo_id = e.id "
                    + "WHERE "
                    + "ve.veiculo_id = " + veiculoId;

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                estilo = new Estilo();

                estilo.setId(resultadoQ.getInt("id"));
                estilo.setNome(resultadoQ.getString("nome"));

                int id = resultadoQ.getInt("id");

                for (int i = 0; i < tabela.getRowCount(); i++) {

                    if (id == Integer.parseInt((String) tabela.getValueAt(i, 1))) {
                        tabela.setValueAt(true, i, 0);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro consultar estilos = " + e);
        }

        return estilo;
    }

    public Extra obterVeiculoExtra(JTable tabela, int veiculoId) {
        Extra extra = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT e.nome, e.id "
                    + "FROM "
                    + "veiculos_extras AS ve "
                    + "INNER JOIN "
                    + "extras AS e "
                    + "ON "
                    + "ve.extra_id = e.id "
                    + "WHERE "
                    + "ve.veiculo_id = " + veiculoId;

            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                extra = new Extra();

                extra.setId(resultadoQ.getInt("id"));
                extra.setNome(resultadoQ.getString("nome"));

                int id = resultadoQ.getInt("id");

                for (int i = 0; i < tabela.getRowCount(); i++) {

                    if (id == Integer.parseInt((String) tabela.getValueAt(i, 1))) {
                        tabela.setValueAt(true, i, 0);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro consultar extras = " + e);
        }

        return extra;
    }
}
