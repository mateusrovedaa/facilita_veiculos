package tela;

import dao.ClienteDao;
import dao.ComboDao;
import dao.VeiculoDao;
import dao.VendaDao;
import dao.VendaVeiculoDao;
import entidade.Cliente;
import entidade.Veiculo;
import entidade.Venda;
import functions.ComboItem;
import functions.Formatacao;
import functions.Validacao;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class TelaCadastroVenda extends javax.swing.JInternalFrame {

    int codigo = 0;
    int id = 0;
    LocalDate now = LocalDate.now();

    public TelaCadastroVenda() {
        initComponents();
        new VendaDao().listarTipoPagamento(comboTipoPagamento);
        new VendaDao().listarNumeroParcelas(comboNumeroParcelas);
        Formatacao.formatarData(campoDataVenda);
    }

    public TelaCadastroVenda(int usuario) {
        initComponents();
        id = usuario;
        campoIdVeiculoBusca.setEditable(false);
        campoPlacaVeiculoBusca.setEditable(false);
        campoIdClienteBusca.setEditable(false);
        campoNomeClienteBusca.setEditable(false);
        campoValorVeiculo.setEditable(false);
        campoDataVenda.setEditable(false);
        new VendaDao().listarTipoPagamento(comboTipoPagamento);
        new VendaDao().listarNumeroParcelas(comboNumeroParcelas);
        Formatacao.formatarData(campoFiltroDataInicial);
        Formatacao.formatarData(campoFiltroDataFinal);
        Formatacao.formatarData(campoDataVenda);
        campoDataVenda.setText(Formatacao.ajustaDataDMA(now.toString()));
        campoFiltroDataInicial.setText(Formatacao.ajustaDataDMA(now.toString()));
        campoFiltroDataFinal.setText(Formatacao.ajustaDataDMA(now.toString()));
        new VendaDao().popularTabela(tblVenda, campoFiltroDataInicial.getText(), campoFiltroDataFinal.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        abaVenda = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnSalvarVenda = new javax.swing.JButton();
        btnAdicionarVenda = new javax.swing.JButton();
        btnFecharVenda = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        campoIdVeiculoBusca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campoPlacaVeiculoBusca = new javax.swing.JTextField();
        buscarVeiculo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        campoIdClienteBusca = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        campoNomeClienteBusca = new javax.swing.JTextField();
        buscarCliente = new javax.swing.JButton();
        nada = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoObservacoes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        campoDataVenda = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        campoValorVeiculo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboTipoPagamento = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        campoValorEntrada = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboNumeroParcelas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        campoJuros = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenda = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        campoFiltroDataInicial = new javax.swing.JFormattedTextField();
        btnFiltrarVenda = new javax.swing.JButton();
        btnLimparVenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoFiltroDataFinal = new javax.swing.JFormattedTextField();
        btnExcluirVenda = new javax.swing.JButton();
        btnInformacoesVenda = new javax.swing.JButton();
        btnVerParcelas = new javax.swing.JButton();
        btnFecharVenda2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setTitle("Cadastro de vendas");

        btnSalvarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarVenda.setText("Salvar");
        btnSalvarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarVendaActionPerformed(evt);
            }
        });

        btnAdicionarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo.png"))); // NOI18N
        btnAdicionarVenda.setText("Adicionar nova venda");
        btnAdicionarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarVendaActionPerformed(evt);
            }
        });

        btnFecharVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharVenda.setText("Fechar");
        btnFecharVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharVendaActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Veículo:*"));

        jLabel10.setText("Código:");

        jLabel12.setText("Placa:");

        buscarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        buscarVeiculo.setText("Procurar");
        buscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdVeiculoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPlacaVeiculoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarVeiculo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoIdVeiculoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(campoPlacaVeiculoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarVeiculo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente:*"));

        jLabel13.setText("Código:");

        jLabel14.setText("Nome:");

        buscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        buscarCliente.setText("Procurar");
        buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdClienteBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeClienteBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(campoIdClienteBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(campoNomeClienteBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nada.setText("Observações:");

        campoObservacoes.setColumns(20);
        campoObservacoes.setRows(5);
        jScrollPane2.setViewportView(campoObservacoes);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Data da venda:*");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Valor veículo:*");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tipo de pagamento:*");

        comboTipoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Valor de entrada:*");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Número de parcelas:");

        comboNumeroParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Porcentagem de juros:*");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(nada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoValorVeiculo)
                            .addComponent(campoDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoJuros))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboNumeroParcelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoValorVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(campoValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nada)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(comboNumeroParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(campoJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdicionarVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharVenda)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharVenda)
                    .addComponent(btnSalvarVenda)
                    .addComponent(btnAdicionarVenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaVenda.addTab("Cadastrar venda", jPanel1);

        tblVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Data", "Cliente", "Usuário", "Veículo", "Valor do veículo", "Valor entrada", "Valor total", "Parcelas"
            }
        ));
        jScrollPane1.setViewportView(tblVenda);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Data inicial:");

        btnFiltrarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarVenda.setText("Filtrar");
        btnFiltrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarVendaActionPerformed(evt);
            }
        });

        btnLimparVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparVenda.setText("Limpar");
        btnLimparVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparVendaActionPerformed(evt);
            }
        });

        jLabel1.setText("Data final:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFiltrarVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparVenda)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(campoFiltroDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnFiltrarVenda)
                .addComponent(btnLimparVenda)
                .addComponent(jLabel9)
                .addComponent(jLabel1)
                .addComponent(campoFiltroDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnExcluirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirVenda.setText("Excluir");
        btnExcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVendaActionPerformed(evt);
            }
        });

        btnInformacoesVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        btnInformacoesVenda.setText("Ver informações da venda");
        btnInformacoesVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacoesVendaActionPerformed(evt);
            }
        });

        btnVerParcelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alterar.png"))); // NOI18N
        btnVerParcelas.setText("Ver parcelas");
        btnVerParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerParcelasActionPerformed(evt);
            }
        });

        btnFecharVenda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharVenda2.setText("Fechar");
        btnFecharVenda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharVenda2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVerParcelas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInformacoesVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharVenda2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirVenda)
                    .addComponent(btnInformacoesVenda)
                    .addComponent(btnVerParcelas)
                    .addComponent(btnFecharVenda2))
                .addContainerGap())
        );

        abaVenda.addTab("Listar vendas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaVenda)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharVendaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharVendaActionPerformed

    private void btnSalvarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarVendaActionPerformed
        campoValorVeiculo.setEditable(false);

        Venda venda = new Venda();
        VendaVeiculoDao vendaVeiculoDao = new VendaVeiculoDao();
        Veiculo veiculo = new Veiculo();
        VeiculoDao veiculoDao = new VeiculoDao();

        ComboItem tipoPagamento = (ComboItem) comboTipoPagamento.getSelectedItem();
        ComboItem numeroParcelas = (ComboItem) comboNumeroParcelas.getSelectedItem();

        venda.setId(codigo);
        venda.setUsuarioId(id);

        if (!campoIdClienteBusca.getText().equals("")) {
            venda.setClienteId(Integer.parseInt(campoIdClienteBusca.getText()));
        }

        if (!campoIdVeiculoBusca.getText().equals("")) {
            venda.setVeiculoId(Integer.parseInt(campoIdVeiculoBusca.getText()));
        }

        if (!campoDataVenda.getText().equals("")) {
            String data = Formatacao.ajustaDataAMD(campoDataVenda.getText());
            venda.setData(data);
        }

        venda.setTipoPagamento(tipoPagamento.getDescricao());

        if (!campoValorEntrada.getText().equals("")) {
            venda.setValorEntrada(Double.parseDouble(campoValorEntrada.getText().replace(",", ".")));
        }

        venda.setNumeroParcelas(numeroParcelas.getCodigo());
        venda.setObservacoes(campoObservacoes.getText());

        if (!campoJuros.getText().equals("")) {
            venda.setJuros(Integer.parseInt(campoJuros.getText()));
        }

        if (!campoValorVeiculo.getText().equals("") && !campoValorEntrada.getText().equals("") && !campoJuros.getText().equals("")) {
            venda.setValorTotal(veiculoDao.calcularValorTotal(Double.parseDouble(campoValorVeiculo.getText().replace(",", ".")), Double.parseDouble(campoValorEntrada.getText().replace(",", ".")), Double.parseDouble(campoJuros.getText().replace(",", "."))));
        }

        VendaDao vendaDao = new VendaDao();
        String retornoSalvarVenda = null;

        veiculo.setId(Integer.parseInt(campoIdVeiculoBusca.getText()));
        veiculo.setSituacao("Vendido");

        if (validaCampos() == true) {
            if (codigo == 0) {
                retornoSalvarVenda = vendaDao.salvar(venda);
                if (numeroParcelas.getCodigo() != 0) {
                    vendaVeiculoDao.gerarParcelas(numeroParcelas.getCodigo(), veiculoDao.calcularValorTotal(Double.parseDouble(campoValorVeiculo.getText().replace(",", ".")), Double.parseDouble(campoValorEntrada.getText().replace(",", ".")), Double.parseDouble(campoJuros.getText().replace(",", "."))), retornoSalvarVenda);
                }
                veiculoDao.atualizarSituacao(veiculo);
            } else {
                retornoSalvarVenda = vendaDao.atualizar(venda);
                veiculoDao.atualizarSituacao(veiculo);
            }
            JOptionPane.showMessageDialog(null, "Venda salva com sucesso!");

        } else {
            campoIdVeiculoBusca.setText("");
            campoPlacaVeiculoBusca.setText("");
            campoIdClienteBusca.setText("");
            campoNomeClienteBusca.setText("");
            campoValorVeiculo.setText("");
            comboTipoPagamento.setSelectedIndex(0);
            campoValorEntrada.setText("");
            comboNumeroParcelas.setSelectedIndex(0);
            campoJuros.setText("");
            campoObservacoes.setText("");
        }

        if (retornoSalvarVenda != null) {

            campoIdVeiculoBusca.setText("");
            campoPlacaVeiculoBusca.setText("");
            campoIdClienteBusca.setText("");
            campoNomeClienteBusca.setText("");
            comboTipoPagamento.setSelectedIndex(0);
            campoValorVeiculo.setText("");
            campoValorEntrada.setText("");
            comboNumeroParcelas.setSelectedIndex(0);
            campoJuros.setText("");
            campoObservacoes.setText("");
            campoJuros.setText("");

            codigo = 0;

            new VendaDao().popularTabela(tblVenda, campoFiltroDataInicial.getText(), campoFiltroDataFinal.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios (*) devem ser preenchidos corretamente!");
            //JOptionPane.showMessageDialog(null, "Deu erro: \n\nMensagem técnica:" + retorno_salvar_venda);
        }
    }//GEN-LAST:event_btnSalvarVendaActionPerformed

    private void btnVerParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerParcelasActionPerformed
        String codigoEditarVenda = String.valueOf(tblVenda.getValueAt(tblVenda.getSelectedRow(), 0));

        Venda venda = new VendaDao().consultarId(Integer.parseInt(codigoEditarVenda));

        TelaParcela parcela = new TelaParcela(venda.getId());
        int lDesk = this.getWidth();
        int aDesk = this.getHeight();
        int lIFrame = parcela.getWidth();
        int aIFrame = parcela.getHeight();
        parcela.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        parcela.setVisible(true);
    }//GEN-LAST:event_btnVerParcelasActionPerformed

    private void btnExcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVendaActionPerformed
        String codigoExcluirVenda = String.valueOf(tblVenda.getValueAt(tblVenda.getSelectedRow(), 0));

        String retornoExcluirVenda = new VendaDao().excluir(Integer.parseInt(codigoExcluirVenda));

        if (retornoExcluirVenda == null) {
            JOptionPane.showMessageDialog(null, "Venda excluída com sucesso!");
            new VendaDao().popularTabela(tblVenda, campoFiltroDataInicial.getText(), campoFiltroDataFinal.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir venda!");
        }
    }//GEN-LAST:event_btnExcluirVendaActionPerformed

    private void btnFiltrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarVendaActionPerformed
        if (Validacao.validarDataFormatada(campoFiltroDataInicial.getText()) || Validacao.validarDataFormatada(campoFiltroDataFinal.getText())) {
            new VendaDao().popularTabela(tblVenda, campoFiltroDataInicial.getText(), campoFiltroDataFinal.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Digite uma data válida!");
            campoFiltroDataInicial.setText(Formatacao.ajustaDataDMA(now.toString()));
            campoFiltroDataFinal.setText(Formatacao.ajustaDataDMA(now.toString()));
        }
    }//GEN-LAST:event_btnFiltrarVendaActionPerformed

    private void btnLimparVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparVendaActionPerformed
        campoFiltroDataInicial.setText(Formatacao.ajustaDataDMA(now.toString()));
        campoFiltroDataFinal.setText(Formatacao.ajustaDataDMA(now.toString()));
        new VendaDao().popularTabela(tblVenda, campoFiltroDataInicial.getText(), campoFiltroDataFinal.getText());
    }//GEN-LAST:event_btnLimparVendaActionPerformed

    private void btnInformacoesVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacoesVendaActionPerformed
        campoValorVeiculo.setEditable(false);
        btnSalvarVenda.setEnabled(false);

        String codigoEditarVenda = String.valueOf(tblVenda.getValueAt(tblVenda.getSelectedRow(), 0));

        Venda venda = new VendaDao().consultarId(Integer.parseInt(codigoEditarVenda));
        Veiculo veiculo = new VeiculoDao().consultarId(Integer.parseInt(Integer.toString(venda.getVeiculoId())));
        Cliente cliente = new ClienteDao().consultarId(Integer.parseInt(Integer.toString(venda.getClienteId())));

        ComboItem clienteId = new ComboItem();
        clienteId.setCodigo(venda.getClienteId());

        ComboItem veiculoId = new ComboItem();
        veiculoId.setCodigo(venda.getVeiculoId());

        ComboItem tipoPagamento = new ComboItem();

        if ("Dinheiro".equals(venda.getTipoPagamento())) {
            tipoPagamento.setCodigo(1);
        } else if ("Cartão de crédito".equals(venda.getTipoPagamento())) {
            tipoPagamento.setCodigo(2);
        } else if ("Cartão de débito".equals(venda.getTipoPagamento())) {
            tipoPagamento.setCodigo(3);
        } else if ("Boleto bancário".equals(venda.getTipoPagamento())) {
            tipoPagamento.setCodigo(4);
        }

        ComboItem numeroParcelas = new ComboItem();
        numeroParcelas.setCodigo(venda.getNumeroParcelas());

        if (venda != null) {
            abaVenda.setSelectedIndex(0);

            campoIdVeiculoBusca.setText(Integer.toString(veiculo.getId()));
            campoPlacaVeiculoBusca.setText(veiculo.getPlaca());
            campoIdClienteBusca.setText(Integer.toString(cliente.getId()));
            campoNomeClienteBusca.setText(cliente.getNome());
            campoDataVenda.setText(String.valueOf(Formatacao.ajustaDataDMA(venda.getData())));
            campoValorVeiculo.setText(Formatacao.formatarDecimal(veiculo.getValor()));
            new ComboDao().definirItemCombo(comboTipoPagamento, tipoPagamento);
            campoValorEntrada.setText(Formatacao.formatarDecimal(venda.getValorEntrada()));
            new ComboDao().definirItemCombo(comboNumeroParcelas, numeroParcelas);
            campoJuros.setText(Integer.toString(venda.getJuros()));
            campoObservacoes.setText(String.valueOf(venda.getObservacoes()));

            codigo = venda.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar venda!");
        }
    }//GEN-LAST:event_btnInformacoesVendaActionPerformed

    private void btnFecharVenda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharVenda2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharVenda2ActionPerformed

    private void btnAdicionarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarVendaActionPerformed
        btnSalvarVenda.setEnabled(true);
        codigo = 0;
        campoIdVeiculoBusca.setText("");
        campoPlacaVeiculoBusca.setText("");
        campoIdClienteBusca.setText("");
        campoNomeClienteBusca.setText("");
        comboTipoPagamento.setSelectedIndex(0);
        campoValorVeiculo.setText("");
        campoValorEntrada.setText("");
        comboNumeroParcelas.setSelectedIndex(0);
        campoJuros.setText("");
        campoObservacoes.setText("");
        campoJuros.setText("");
    }//GEN-LAST:event_btnAdicionarVendaActionPerformed

    private void buscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarVeiculoActionPerformed
        TelaBuscaVeiculoVenda buscaVeiculo = new TelaBuscaVeiculoVenda(null, true, this);
        buscaVeiculo.setLocationRelativeTo(this);
        buscaVeiculo.setVisible(true);
    }//GEN-LAST:event_buscarVeiculoActionPerformed

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed
        TelaBuscaCliente buscaCliente = new TelaBuscaCliente(null, true, this);
        buscaCliente.setLocationRelativeTo(this);
        buscaCliente.setVisible(true);
    }//GEN-LAST:event_buscarClienteActionPerformed

    public void definirVeiculo(int id, String placa, double valorVeiculo) {
        campoIdVeiculoBusca.setText(Integer.toString(id));
        campoPlacaVeiculoBusca.setText(placa);
        campoValorVeiculo.setText(Double.toString(valorVeiculo).replace(".", ","));
    }

    public void definirCliente(int id, String nome) {
        campoIdClienteBusca.setText(Integer.toString(id));
        campoNomeClienteBusca.setText(nome);
    }

    public boolean validaCampos() {
        ComboItem tipoPagamento = (ComboItem) comboTipoPagamento.getSelectedItem();

        return !campoIdVeiculoBusca.getText().equals("") && !campoPlacaVeiculoBusca.getText().equals("")
                && !campoValorVeiculo.getText().equals("") && !campoIdClienteBusca.getText().equals("")
                && !campoNomeClienteBusca.getText().equals("") && !campoValorEntrada.getText().equals("")
                && tipoPagamento.getCodigo() != 0 && !campoJuros.getText().equals("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaVenda;
    private javax.swing.JButton btnAdicionarVenda;
    private javax.swing.JButton btnExcluirVenda;
    private javax.swing.JButton btnFecharVenda;
    private javax.swing.JButton btnFecharVenda2;
    private javax.swing.JButton btnFiltrarVenda;
    private javax.swing.JButton btnInformacoesVenda;
    private javax.swing.JButton btnLimparVenda;
    private javax.swing.JButton btnSalvarVenda;
    private javax.swing.JButton btnVerParcelas;
    private javax.swing.JButton buscarCliente;
    private javax.swing.JButton buscarVeiculo;
    private javax.swing.JFormattedTextField campoDataVenda;
    private javax.swing.JFormattedTextField campoFiltroDataFinal;
    private javax.swing.JFormattedTextField campoFiltroDataInicial;
    private javax.swing.JTextField campoIdClienteBusca;
    private javax.swing.JTextField campoIdVeiculoBusca;
    private javax.swing.JTextField campoJuros;
    private javax.swing.JTextField campoNomeClienteBusca;
    private javax.swing.JTextArea campoObservacoes;
    private javax.swing.JTextField campoPlacaVeiculoBusca;
    private javax.swing.JTextField campoValorEntrada;
    private javax.swing.JTextField campoValorVeiculo;
    private javax.swing.JComboBox<String> comboNumeroParcelas;
    private javax.swing.JComboBox<String> comboTipoPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nada;
    private javax.swing.JTable tblVenda;
    // End of variables declaration//GEN-END:variables
}
