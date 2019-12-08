package tela;

import dao.ComboDao;
import dao.DaoGenerico;
import dao.PermissaoDao;
import dao.VeiculoDao;
import dao.VendaDao;
import dao.VendaVeiculoDao;
import dao.VersaoDao;
import entidade.Cliente;
import entidade.Combustivel;
import entidade.ContratoVenda;
import entidade.Modelo;
import entidade.Parcela;
import entidade.SituacaoVenda;
import entidade.TipoPagamento;
import entidade.Usuario;
import entidade.Veiculo;
import entidade.Venda;
import entidade.Versao;
import functions.ComboItem;
import functions.Formatacao;
import functions.GerenciarJanelas;
import functions.Mensagem;
import functions.Validacao;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaCadastroVenda extends javax.swing.JInternalFrame {

    private static TelaCadastroVenda tela;
    int codigo = 0;
    int id = 0;
    PermissaoDao peDAO = new PermissaoDao();
    LocalDate now = LocalDate.now();

    public TelaCadastroVenda(int usuario_id) {
        initComponents();
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("images/car.png"));
        this.setFrameIcon(icon);
        campoIdVeiculoBusca.setEditable(false);
        campoPlacaVeiculoBusca.setEditable(false);
        campoIdClienteBusca.setEditable(false);
        campoNomeClienteBusca.setEditable(false);
        campoValorVeiculo.setEditable(false);
        id = usuario_id;
        new ComboDao().popularCombo("situacoes_vendas", 1, 4, comboSituacaoVendaId, "");
        new ComboDao().popularCombo("situacoes_vendas", 1, 4, comboFiltroSituacaoVendaId, "");
        new ComboDao().popularCombo("tipos_pagamentos", 1, 4, comboTipoPagamentoId, "");
        new ComboDao().popularCombo("parcelas", 1, 4, comboParcelaId, "");
        new ComboDao().popularCombo("marcas", 1, 4, comboFiltroMarcaId, "");
        Formatacao.formatarData(campoFiltroDataDe);
        Formatacao.formatarData(campoFiltroDataAte);
        Formatacao.formatarData(campoDataVenda);
        campoFiltroDataDe.setText(Formatacao.getDataMes());
        campoFiltroDataAte.setText(Formatacao.ajustaDataDMA(now.toString()));
        new VendaDao().criaTabela(tblVenda, jScrollPane1);
//        new VendaDao().popularTabela(tblVenda, "", "", "", "", "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
    }

    public static TelaCadastroVenda getInstancia(int usuario_id) {
        if (tela == null) {
            tela = new TelaCadastroVenda(usuario_id);
        }
        return tela;
    }

    private void funcaoFechar() {
        GerenciarJanelas.fecharJanela(tela);
        tela = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        abaVenda = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        campoIdVeiculoBusca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoPlacaVeiculoBusca = new javax.swing.JTextField();
        btnBuscaVeiculo = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        campoIdClienteBusca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoNomeClienteBusca = new javax.swing.JTextField();
        btnBuscaCliente = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoDataVenda = new javax.swing.JFormattedTextField();
        comboSituacaoVendaId = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoValorVeiculo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        campoObservacoes = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        comboTipoPagamentoId = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        campoValorEntrada = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        comboParcelaId = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        campoJuros = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnFecharCadastro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnLimparBusca = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        campoFiltroPlaca = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboFiltroMarcaId = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        campoFiltroDataDe = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        campoFiltroDataAte = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        campoFiltroVersao = new javax.swing.JTextField();
        campoFiltroModelo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        comboFiltroSituacaoVendaId = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        campoFiltroCliente = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenda = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnFecharLista = new javax.swing.JButton();
        btnVerInfoVenda = new javax.swing.JButton();
        btnVerParcelas = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de vendas");
        setToolTipText("");

        abaVenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campos obrigatórios (*)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Veículo*"));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Placa:");

        btnBuscaVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscaVeiculo.setText("Procurar");
        btnBuscaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaVeiculoActionPerformed(evt);
            }
        });

        jLabel16.setText("Código:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdVeiculoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPlacaVeiculoBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaVeiculo)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscaVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoPlacaVeiculoBusca)
                    .addComponent(campoIdVeiculoBusca)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente*"));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Nome:");

        btnBuscaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscaCliente.setText("Procurar");
        btnBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaClienteActionPerformed(evt);
            }
        });

        jLabel17.setText("Código:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdClienteBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeClienteBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaCliente)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoNomeClienteBusca)
                    .addComponent(campoIdClienteBusca)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Data da venda:*");

        comboSituacaoVendaId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Situação da venda:*");

        jLabel4.setText("Observações:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Valor do veículo:*");

        campoObservacoes.setColumns(20);
        campoObservacoes.setRows(5);
        jScrollPane3.setViewportView(campoObservacoes);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Tipo de pagamento:*");

        comboTipoPagamentoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Valor de entrada:*");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Número de parcelas:*");

        comboParcelaId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Porcentagem de juros:*");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(809, 809, 809))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDataVenda)
                    .addComponent(comboParcelaId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoValorEntrada)
                    .addComponent(campoJuros)
                    .addComponent(comboTipoPagamentoId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoValorVeiculo)
                    .addComponent(comboSituacaoVendaId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSituacaoVendaId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoValorVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboTipoPagamentoId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboParcelaId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnFecharCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharCadastro.setText("Fechar");
        btnFecharCadastro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnFecharCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaVenda.addTab("Cadastrar ou editar venda", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnLimparBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBusca.setText("Limpar busca");
        btnLimparBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Placa:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Marca:");

        comboFiltroMarcaId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Data de:");

        jLabel12.setText("Data de:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Versão:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Situação da venda:");

        comboFiltroSituacaoVendaId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Cliente:");

        jLabel23.setText("Modelo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(comboFiltroMarcaId, javax.swing.GroupLayout.Alignment.LEADING, 0, 241, Short.MAX_VALUE)
                    .addComponent(comboFiltroSituacaoVendaId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroPlaca, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoFiltroDataDe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroVersao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparBusca))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoFiltroModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(campoFiltroDataAte))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFiltroMarcaId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFiltroSituacaoVendaId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimparBusca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVenda);

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFecharLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharLista.setText("Fechar");
        btnFecharLista.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharListaActionPerformed(evt);
            }
        });

        btnVerInfoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-info-16.png"))); // NOI18N
        btnVerInfoVenda.setText("Ver informações da venda");
        btnVerInfoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInfoVendaActionPerformed(evt);
            }
        });

        btnVerParcelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-view-16.png"))); // NOI18N
        btnVerParcelas.setText("Ver parcelas");
        btnVerParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerParcelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerParcelas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerInfoVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharLista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnFecharLista)
                    .addComponent(btnVerInfoVenda)
                    .addComponent(btnVerParcelas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaVenda.addTab("Listar vendas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(abaVenda)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaVenda)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaActionPerformed
        campoFiltroPlaca.setText("");
        campoFiltroVersao.setText("");
        campoFiltroModelo.setText("");
        comboFiltroMarcaId.setSelectedIndex(0);
        comboFiltroSituacaoVendaId.setSelectedIndex(0);
        campoFiltroCliente.setText("");
        campoFiltroDataDe.setText(Formatacao.getDataMes());
        campoFiltroDataAte.setText(Formatacao.ajustaDataDMA(now.toString()));
        new VendaDao().criaTabela(tblVenda, jScrollPane1);
//        new VendaDao().popularTabela(tblVenda, "", "", "", "", "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
    }//GEN-LAST:event_btnLimparBuscaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ComboItem filtroMarcaId = (ComboItem) comboFiltroMarcaId.getSelectedItem();
        String filtroMarca;
        if (filtroMarcaId.getCodigo() == 0) {
            filtroMarca = "";
        } else {
            filtroMarca = String.valueOf(filtroMarcaId.getCodigo());
        }

        ComboItem filtroSituacaoVendaId = (ComboItem) comboFiltroSituacaoVendaId.getSelectedItem();
        String filtroSituacaoVenda;
        if (filtroSituacaoVendaId.getCodigo() == 0) {
            filtroSituacaoVenda = "";
        } else {
            filtroSituacaoVenda = String.valueOf(filtroSituacaoVendaId.getCodigo());
        }

        if (Validacao.validarDataFormatada(campoFiltroDataDe.getText()) || Validacao.validarDataFormatada(campoFiltroDataAte.getText())) {
            new VendaDao().popularTabela(tblVenda, campoFiltroPlaca.getText(), campoFiltroVersao.getText(), campoFiltroModelo.getText(), filtroMarca, filtroSituacaoVenda, campoFiltroCliente.getText(), campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
        } else {
            Mensagem.aviso("Digite uma data válida!", this);
            campoFiltroDataDe.setText(Formatacao.getDataMes());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int codigoExcluirVenda = (int) tblVenda.getValueAt(tblVenda.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirVenda = DaoGenerico.getInstance().excluir(Venda.class, codigoExcluirVenda);

            if (retornoExcluirVenda == true) {
                Mensagem.informacao("Venda excluída com sucesso!", this);
                new VendaDao().criaTabela(tblVenda, jScrollPane1);
//                new VendaDao().popularTabela(tblVenda, "", "", "", "", "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
            } else {
                Mensagem.erro(tblVenda.getValueAt(tblVenda.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnFecharListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharListaActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharListaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        campoValorVeiculo.setEditable(false);

        Venda venda = new Venda();
        VendaVeiculoDao vendaVeiculoDao = new VendaVeiculoDao();
        Veiculo veiculo = new Veiculo();
        VeiculoDao veiculoDao = new VeiculoDao();

        ComboItem tipoPagamentoId = (ComboItem) comboTipoPagamentoId.getSelectedItem();
        TipoPagamento tipoPagamento = null;
        if (tipoPagamentoId.getCodigo() != 0) {
            Object objectTipoPagamento = DaoGenerico.getInstance().obterPorId(TipoPagamento.class, tipoPagamentoId.getCodigo());
            tipoPagamento = new TipoPagamento((TipoPagamento) objectTipoPagamento);
        }

        ComboItem parcelaId = (ComboItem) comboParcelaId.getSelectedItem();
        Parcela parcela = null;
        if (parcelaId.getCodigo() != 0) {
            Object objectParcela = DaoGenerico.getInstance().obterPorId(Parcela.class, parcelaId.getCodigo());
            parcela = new Parcela((Parcela) objectParcela);
        }

        ComboItem situacaoVendaId = (ComboItem) comboSituacaoVendaId.getSelectedItem();
        SituacaoVenda situacao = null;
        if (situacaoVendaId.getCodigo() != 0) {
            Object objectSituacaoVenda = DaoGenerico.getInstance().obterPorId(SituacaoVenda.class, situacaoVendaId.getCodigo());
            situacao = new SituacaoVenda((SituacaoVenda) objectSituacaoVenda);
        }

        Object objectUsuario = DaoGenerico.getInstance().obterPorId(Usuario.class, id);
        Usuario usuario = new Usuario((Usuario) objectUsuario);

        Object objectCliente = DaoGenerico.getInstance().obterPorId(Cliente.class, Integer.parseInt(campoIdClienteBusca.getText()));
        Cliente cliente = new Cliente((Cliente) objectCliente);

        Object objectVeiculo = DaoGenerico.getInstance().obterPorId(Veiculo.class, Integer.parseInt(campoIdVeiculoBusca.getText()));
        Veiculo veiculoId = new Veiculo((Veiculo) objectVeiculo);

        ContratoVenda contrato = null;
        Object objectContratoVenda = DaoGenerico.getInstance().obterPorId(ContratoVenda.class, 1);
        contrato = new ContratoVenda((ContratoVenda) objectContratoVenda);

        venda.setId(codigo);
        venda.setUsuario_id(usuario);

        if (!campoIdClienteBusca.getText().equals("")) {
            venda.setCliente_id(cliente);
        }

        if (!campoIdVeiculoBusca.getText().equals("")) {
            venda.setVeiculo_id(veiculoId);
        }

        if (!campoDataVenda.getText().equals("  /  /    ")) {
            String data = campoDataVenda.getText();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(data, formato);
            Date dataFormatada = java.sql.Date.valueOf(localDate);
            venda.setData(dataFormatada);
        }

        venda.setTipo_pagamento_id(tipoPagamento);
        venda.setParcela_id(parcela);

        if (!campoValorEntrada.getText().equals("")) {
            venda.setValor_entrada(Double.parseDouble(campoValorEntrada.getText().replace(",", ".")));
        }

        venda.setObservacoes(campoObservacoes.getText());

        if (!campoJuros.getText().equals("")) {
            venda.setJuros(Integer.parseInt(campoJuros.getText()));
        }

        if (!campoValorVeiculo.getText().equals("") && !campoValorEntrada.getText().equals("") && !campoJuros.getText().equals("")) {
            venda.setValor_total(veiculoDao.calcularValorTotal(Double.parseDouble(campoValorVeiculo.getText().replace(",", ".")), Double.parseDouble(campoValorEntrada.getText().replace(",", ".")), Double.parseDouble(campoJuros.getText().replace(",", "."))));
        }

        venda.setSituacao_venda_id(situacao);
        //venda.setContrato_venda_id(contrato);
        venda.setCriadoEm(Calendar.getInstance());
        venda.setAlteradoEm(Calendar.getInstance());

        VendaDao vendaDao = new VendaDao();
        int retornoSalvarVenda = 0;

        if (validaCampos() == true) {
            if (codigo == 0) {
                retornoSalvarVenda = DaoGenerico.getInstance().inserirVenda(venda);
                if (parcelaId.getCodigo() != 0) {

                    String Numeroparcela = parcelaId.getDescricao();
                    String array[] = new String[1];

                    array = Numeroparcela.split(" ");

                    vendaVeiculoDao.gerarParcelas(Integer.parseInt(array[0]), veiculoDao.calcularValorTotal(Double.parseDouble(campoValorVeiculo.getText().replace(",", ".")), Double.parseDouble(campoValorEntrada.getText().replace(",", ".")), Double.parseDouble(campoJuros.getText().replace(",", "."))), retornoSalvarVenda);
                }
            } else {
                boolean retornoUpdate = DaoGenerico.getInstance().atualizar(venda);

                if (retornoUpdate == true) {
                    retornoSalvarVenda = veiculo.getId();
                } else {
                    retornoSalvarVenda = 0;
                }
            }
            Mensagem.informacao("Venda salva com sucesso!", this);

        } else {
            campoIdVeiculoBusca.setText("");
            campoPlacaVeiculoBusca.setText("");
            campoIdClienteBusca.setText("");
            campoNomeClienteBusca.setText("");
            campoDataVenda.setText("");
            comboSituacaoVendaId.setSelectedIndex(0);
            campoValorVeiculo.setText("");
            comboTipoPagamentoId.setSelectedIndex(0);
            campoValorEntrada.setText("");
            comboParcelaId.setSelectedIndex(0);
            campoJuros.setText("");
            campoObservacoes.setText("");
        }

        if (retornoSalvarVenda != 0) {

            campoIdVeiculoBusca.setText("");
            campoPlacaVeiculoBusca.setText("");
            campoIdClienteBusca.setText("");
            campoNomeClienteBusca.setText("");
            campoDataVenda.setText("");
            comboSituacaoVendaId.setSelectedIndex(0);
            campoValorVeiculo.setText("");
            comboTipoPagamentoId.setSelectedIndex(0);
            campoValorEntrada.setText("");
            comboParcelaId.setSelectedIndex(0);
            campoJuros.setText("");
            campoObservacoes.setText("");

            codigo = 0;

            new VendaDao().criaTabela(tblVenda, jScrollPane1);
//            new VendaDao().popularTabela(tblVenda, "", "", "", "", "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
        } else {
            Mensagem.aviso("Campos obrigatórios (*) devem ser preenchidos corretamente!", this);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCadastroActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharCadastroActionPerformed

    private void btnBuscaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaVeiculoActionPerformed
        TelaBuscaVeiculo buscaVeiculo = new TelaBuscaVeiculo(null, true, this);
        buscaVeiculo.setLocationRelativeTo(this);
        buscaVeiculo.setVisible(true);
    }//GEN-LAST:event_btnBuscaVeiculoActionPerformed

    private void btnBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaClienteActionPerformed
        TelaBuscaCliente buscaCliente = new TelaBuscaCliente(null, true, this);
        buscaCliente.setLocationRelativeTo(this);
        buscaCliente.setVisible(true);
    }//GEN-LAST:event_btnBuscaClienteActionPerformed

    private void btnVerParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerParcelasActionPerformed
        String codigoEditarVenda = String.valueOf(tblVenda.getValueAt(tblVenda.getSelectedRow(), 0));

        Object objectVenda = DaoGenerico.getInstance().obterPorId(Venda.class, Integer.parseInt(codigoEditarVenda));
        Venda venda = new Venda((Venda) objectVenda);

        TelaParcela parcela = new TelaParcela(venda.getId());
        int lDesk = this.getWidth();
        int aDesk = this.getHeight();
        int lIFrame = parcela.getWidth();
        int aIFrame = parcela.getHeight();
        parcela.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        parcela.setVisible(true);
    }//GEN-LAST:event_btnVerParcelasActionPerformed

    private void btnVerInfoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInfoVendaActionPerformed
        String codigoEditarVenda = String.valueOf(tblVenda.getValueAt(tblVenda.getSelectedRow(), 0));

        Object objectVenda = DaoGenerico.getInstance().obterPorId(Venda.class, Integer.parseInt(codigoEditarVenda));
        Venda venda = new Venda((Venda) objectVenda);

        Object objectVeiculo = DaoGenerico.getInstance().obterPorId(Veiculo.class, venda.getVeiculo_id().getId());
        Veiculo veiculo = new Veiculo((Veiculo) objectVeiculo);

        Object objectCliente = DaoGenerico.getInstance().obterPorId(Cliente.class, venda.getCliente_id().getId());
        Cliente cliente = new Cliente((Cliente) objectCliente);

        ComboItem situacaoVendaId = new ComboItem();
        situacaoVendaId.setCodigo(venda.getSituacao_venda_id().getId());

        ComboItem tipoPagamentoId = new ComboItem();
        tipoPagamentoId.setCodigo(venda.getTipo_pagamento_id().getId());

        ComboItem parcelaId = new ComboItem();
        parcelaId.setCodigo(venda.getParcela_id().getId());

        if (venda != null) {
            abaVenda.setSelectedIndex(0);

            campoIdVeiculoBusca.setText(Integer.toString(venda.getVeiculo_id().getId()));
            campoPlacaVeiculoBusca.setText(veiculo.getPlaca());
            campoIdClienteBusca.setText(Integer.toString(venda.getCliente_id().getId()));
            campoNomeClienteBusca.setText(cliente.getNome());
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = dateFormat.format(venda.getData());
            campoDataVenda.setText(dataFormatada);
            new ComboDao().definirItemCombo(comboSituacaoVendaId, situacaoVendaId);
            campoValorVeiculo.setText(Formatacao.formatarDecimal(veiculo.getValor()));
            new ComboDao().definirItemCombo(comboTipoPagamentoId, tipoPagamentoId);
            campoValorEntrada.setText(Formatacao.formatarDecimal(venda.getValor_entrada()));
            new ComboDao().definirItemCombo(comboParcelaId, parcelaId);
            campoJuros.setText(Integer.toString(venda.getJuros()));
            campoObservacoes.setText(String.valueOf(venda.getObservacoes()));

            codigo = venda.getId();

        } else {
            Mensagem.erro("Erro ao consultar venda!", this);
        }
    }//GEN-LAST:event_btnVerInfoVendaActionPerformed

    public void definirVeiculo(int id, String placa) {
        campoIdVeiculoBusca.setText(Integer.toString(id));
        campoPlacaVeiculoBusca.setText(placa);
        Object objectVeiculo = DaoGenerico.getInstance().obterPorId(Veiculo.class, id);
        Veiculo veiculo = new Veiculo((Veiculo) objectVeiculo);
        campoValorVeiculo.setText(Double.toString(veiculo.getValor()).replace(".", ","));
    }

    public void definirCliente(int id, String nome) {
        campoIdClienteBusca.setText(Integer.toString(id));
        campoNomeClienteBusca.setText(nome);
    }

    public boolean validaCampos() {
        ComboItem tipoPagamentoId = (ComboItem) comboTipoPagamentoId.getSelectedItem();
        ComboItem situacaoVendaId = (ComboItem) comboSituacaoVendaId.getSelectedItem();
        ComboItem parcelaId = (ComboItem) comboParcelaId.getSelectedItem();

        return !campoIdVeiculoBusca.getText().equals("") && !campoPlacaVeiculoBusca.getText().equals("")
                && !campoValorVeiculo.getText().equals("") && !campoIdClienteBusca.getText().equals("")
                && !campoNomeClienteBusca.getText().equals("") && !campoValorEntrada.getText().equals("")
                && !campoDataVenda.getText().equals("  /  /    ") && situacaoVendaId.getCodigo() != 0
                && tipoPagamentoId.getCodigo() != 0 && !campoJuros.getText().equals("")
                && parcelaId.getCodigo() != 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaVenda;
    private javax.swing.JButton btnBuscaCliente;
    private javax.swing.JButton btnBuscaVeiculo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFecharCadastro;
    private javax.swing.JButton btnFecharLista;
    private javax.swing.JButton btnLimparBusca;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVerInfoVenda;
    private javax.swing.JButton btnVerParcelas;
    private javax.swing.JFormattedTextField campoDataVenda;
    private javax.swing.JTextField campoFiltroCliente;
    private javax.swing.JFormattedTextField campoFiltroDataAte;
    private javax.swing.JFormattedTextField campoFiltroDataDe;
    private javax.swing.JTextField campoFiltroModelo;
    private javax.swing.JTextField campoFiltroPlaca;
    private javax.swing.JTextField campoFiltroVersao;
    private javax.swing.JTextField campoIdClienteBusca;
    private javax.swing.JTextField campoIdVeiculoBusca;
    private javax.swing.JTextField campoJuros;
    private javax.swing.JTextField campoNomeClienteBusca;
    private javax.swing.JTextArea campoObservacoes;
    private javax.swing.JTextField campoPlacaVeiculoBusca;
    private javax.swing.JTextField campoValorEntrada;
    private javax.swing.JTextField campoValorVeiculo;
    private javax.swing.JComboBox<String> comboFiltroMarcaId;
    private javax.swing.JComboBox<String> comboFiltroSituacaoVendaId;
    private javax.swing.JComboBox<String> comboParcelaId;
    private javax.swing.JComboBox<String> comboSituacaoVendaId;
    private javax.swing.JComboBox<String> comboTipoPagamentoId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblVenda;
    // End of variables declaration//GEN-END:variables
}
