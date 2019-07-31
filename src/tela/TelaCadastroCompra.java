package tela;

import dao.CompraDao;
import dao.ProprietarioDao;
import dao.VeiculoDao;
import entidade.Compra;
import entidade.Proprietario;
import entidade.Veiculo;
import functions.ComboItem;
import functions.Formatacao;
import functions.Validacao;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class TelaCadastroCompra extends javax.swing.JInternalFrame {

    int codigo = 0;
    LocalDate now = LocalDate.now();

    public TelaCadastroCompra() {
        initComponents();
        campoIdVeiculoBusca.setEditable(false);
        campoPlacaVeiculoBusca.setEditable(false);
        campoIdProprietarioBusca.setEditable(false);
        campoNomeProprietarioBusca.setEditable(false);
        Formatacao.formatarData(campoFiltroDataInicial);
        Formatacao.formatarData(campoFiltroDataFinal);
        Formatacao.formatarData(campoData);
        campoFiltroDataInicial.setText(Formatacao.ajustaDataDMA(now.toString()));
        campoFiltroDataFinal.setText(Formatacao.ajustaDataDMA(now.toString()));
        new CompraDao().popularTabela(tblCompra, campoFiltroDataInicial.getText(), campoFiltroDataFinal.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        abaCompra = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        campoIdProprietarioBusca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoNomeProprietarioBusca = new javax.swing.JTextField();
        buscarProprietario = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        campoIdVeiculoBusca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoPlacaVeiculoBusca = new javax.swing.JTextField();
        buscarVeiculo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoData = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoObservacoes = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompra = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnLimparFiltro = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        campoFiltroDataInicial = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        campoFiltroDataFinal = new javax.swing.JFormattedTextField();
        btnFecharCompra = new javax.swing.JButton();
        btnSalvarCompra = new javax.swing.JButton();
        btnEditarCompra = new javax.swing.JButton();
        btnExcluirCompra = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setTitle("Cadastro de compras");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar compra:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Proprietário:*"));

        jLabel7.setText("Código:");

        jLabel9.setText("Nome:");

        buscarProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        buscarProprietario.setText("Procurar");
        buscarProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProprietarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdProprietarioBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeProprietarioBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarProprietario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoIdProprietarioBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(campoNomeProprietarioBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarProprietario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Veículo:*"));

        jLabel10.setText("Código:");

        jLabel11.setText("Placa:");

        buscarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
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
                .addComponent(jLabel11)
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
                    .addComponent(jLabel11)
                    .addComponent(campoPlacaVeiculoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarVeiculo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Data:*");

        jLabel2.setText("Valor:*");

        jLabel3.setText("Observações:");

        campoObservacoes.setColumns(20);
        campoObservacoes.setRows(5);
        jScrollPane2.setViewportView(campoObservacoes);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        abaCompra.addTab("Cadastrar compra", jPanel1);

        tblCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Data", "Veículo", "Proprietário", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tblCompra);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        btnLimparFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparFiltro.setText("Limpar");
        btnLimparFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFiltroActionPerformed(evt);
            }
        });

        btnFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        jLabel8.setText("Data inicial:");

        jLabel4.setText("Data final:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btnFiltrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparFiltro)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoFiltroDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar)
                    .addComponent(btnLimparFiltro)
                    .addComponent(jLabel4)
                    .addComponent(campoFiltroDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaCompra.addTab("Listar compras", jPanel2);

        btnFecharCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharCompra.setText("Fechar");
        btnFecharCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCompraActionPerformed(evt);
            }
        });

        btnSalvarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarCompra.setText("Salvar");
        btnSalvarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCompraActionPerformed(evt);
            }
        });

        btnEditarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarCompra.setText("Editar");
        btnEditarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCompraActionPerformed(evt);
            }
        });

        btnExcluirCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirCompra.setText("Excluir");
        btnExcluirCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharCompra)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharCompra)
                    .addComponent(btnSalvarCompra)
                    .addComponent(btnEditarCompra)
                    .addComponent(btnExcluirCompra))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCompraActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharCompraActionPerformed

    private void btnExcluirCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCompraActionPerformed
        String codigoExcluirCompra = String.valueOf(tblCompra.getValueAt(tblCompra.getSelectedRow(), 0));

        String retornoExcluirCompra = new CompraDao().excluir(Integer.parseInt(codigoExcluirCompra));

        if (retornoExcluirCompra == null) {
            JOptionPane.showMessageDialog(null, "Compra excluída com sucesso!");
            new CompraDao().popularTabela(tblCompra, campoFiltroDataInicial.getText(), campoFiltroDataFinal.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir compra!");
        }
    }//GEN-LAST:event_btnExcluirCompraActionPerformed

    private void btnSalvarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCompraActionPerformed
        Compra compra = new Compra();
        Veiculo veiculo = new Veiculo();
        VeiculoDao veiculoDao = new VeiculoDao();

        compra.setId(codigo);
        compra.setProprietarioId(Integer.parseInt(campoIdProprietarioBusca.getText()));
        compra.setVeiculoId(Integer.parseInt(campoIdVeiculoBusca.getText()));
        String data = Formatacao.ajustaDataAMD(campoData.getText());
        compra.setData(data);
        compra.setValor(Double.parseDouble(campoValor.getText().replace(",", ".")));
        compra.setObservacoes(campoObservacoes.getText());

        CompraDao compraDao = new CompraDao();
        String retornoSalvarCompra = null;

        veiculo.setId(Integer.parseInt(campoIdVeiculoBusca.getText()));
        veiculo.setSituacao("À venda");

        if (validaCampos() == true) {
            if (codigo == 0) {
                retornoSalvarCompra = compraDao.salvar(compra);
                veiculoDao.atualizarSituacao(veiculo);
            } else {
                retornoSalvarCompra = compraDao.atualizar(compra);
                veiculoDao.atualizarSituacao(veiculo);
            }

            JOptionPane.showMessageDialog(null, "Compra salva com sucesso!");

        } else {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios (*) devem ser preenchidos corretamente!");
        }

        if (retornoSalvarCompra == null) {

            campoIdVeiculoBusca.setText("");
            campoPlacaVeiculoBusca.setText("");
            campoIdProprietarioBusca.setText("");
            campoNomeProprietarioBusca.setText("");
            campoData.setText("");
            campoValor.setText("");
            campoObservacoes.setText("");

            codigo = 0;

            new CompraDao().popularTabela(tblCompra, campoFiltroDataInicial.getText(), campoFiltroDataFinal.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Deu erro: \n\nMensagem técnica:" + retornoSalvarCompra);
        }
    }//GEN-LAST:event_btnSalvarCompraActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        if (Validacao.validarDataFormatada(campoFiltroDataInicial.getText()) || Validacao.validarDataFormatada(campoFiltroDataFinal.getText())) {
            new CompraDao().popularTabela(tblCompra, campoFiltroDataInicial.getText(), campoFiltroDataFinal.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Digite uma data válida!");
            campoFiltroDataInicial.setText(Formatacao.ajustaDataDMA(now.toString()));
            campoFiltroDataFinal.setText(Formatacao.ajustaDataDMA(now.toString()));
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnLimparFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFiltroActionPerformed
        campoFiltroDataInicial.setText(Formatacao.ajustaDataDMA(now.toString()));
        campoFiltroDataFinal.setText(Formatacao.ajustaDataDMA(now.toString()));
        new CompraDao().popularTabela(tblCompra, campoFiltroDataInicial.getText(), campoFiltroDataFinal.getText());
    }//GEN-LAST:event_btnLimparFiltroActionPerformed

    private void btnEditarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCompraActionPerformed
        String codigoEditarCompra = String.valueOf(tblCompra.getValueAt(tblCompra.getSelectedRow(), 0));

        Compra compra = new CompraDao().consultarId(Integer.parseInt(codigoEditarCompra));
        Veiculo veiculo = new VeiculoDao().consultarId(Integer.parseInt(Integer.toString(compra.getVeiculoId())));
        Proprietario proprietario = new ProprietarioDao().consultarId(Integer.parseInt(Integer.toString(compra.getProprietarioId())));

        ComboItem proprietarioId = new ComboItem();
        proprietarioId.setCodigo(compra.getProprietarioId());

        ComboItem veiculoId = new ComboItem();
        veiculoId.setCodigo(compra.getVeiculoId());

        if (compra != null) {
            abaCompra.setSelectedIndex(0);

            campoIdVeiculoBusca.setText(Integer.toString(compra.getVeiculoId()));
            campoPlacaVeiculoBusca.setText(veiculo.getPlaca());
            campoIdProprietarioBusca.setText(Integer.toString(compra.getProprietarioId()));
            campoNomeProprietarioBusca.setText(proprietario.getNome());
            campoData.setText(String.valueOf(Formatacao.ajustaDataDMA(compra.getData())));
            campoValor.setText(Formatacao.formatarDecimal(compra.getValor()));
            campoObservacoes.setText(String.valueOf(compra.getObservacoes()));

            codigo = compra.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar compra!");
        }
    }//GEN-LAST:event_btnEditarCompraActionPerformed

    private void buscarProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProprietarioActionPerformed
        TelaBuscaProprietario buscaProprietario = new TelaBuscaProprietario(null, true, this);
        buscaProprietario.setLocationRelativeTo(this);
        buscaProprietario.setVisible(true);
    }//GEN-LAST:event_buscarProprietarioActionPerformed

    private void buscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarVeiculoActionPerformed
        TelaBuscaVeiculoCompra buscaVeiculo = new TelaBuscaVeiculoCompra(null, true, this);
        buscaVeiculo.setLocationRelativeTo(this);
        buscaVeiculo.setVisible(true);
    }//GEN-LAST:event_buscarVeiculoActionPerformed

    public void definirVeiculo(int id, String placa) {
        campoIdVeiculoBusca.setText(Integer.toString(id));
        campoPlacaVeiculoBusca.setText(placa);
    }

    public void definirProprietario(int id, String nome) {
        campoIdProprietarioBusca.setText(Integer.toString(id));
        campoNomeProprietarioBusca.setText(nome);
    }

    public boolean validaCampos() {
        return !campoIdVeiculoBusca.getText().equals("") && !campoPlacaVeiculoBusca.getText().equals("")
                && !campoIdProprietarioBusca.getText().equals("") && !campoNomeProprietarioBusca.getText().equals("")
                && !campoValor.getText().equals("") && !campoData.getText().equals("  /  /    ")
                && Validacao.validarDataFormatada(campoData.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaCompra;
    private javax.swing.JButton btnEditarCompra;
    private javax.swing.JButton btnExcluirCompra;
    private javax.swing.JButton btnFecharCompra;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnLimparFiltro;
    private javax.swing.JButton btnSalvarCompra;
    private javax.swing.JButton buscarProprietario;
    private javax.swing.JButton buscarVeiculo;
    private javax.swing.JFormattedTextField campoData;
    private javax.swing.JFormattedTextField campoFiltroDataFinal;
    private javax.swing.JFormattedTextField campoFiltroDataInicial;
    private javax.swing.JTextField campoIdProprietarioBusca;
    private javax.swing.JTextField campoIdVeiculoBusca;
    private javax.swing.JTextField campoNomeProprietarioBusca;
    private javax.swing.JTextArea campoObservacoes;
    private javax.swing.JTextField campoPlacaVeiculoBusca;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTable tblCompra;
    // End of variables declaration//GEN-END:variables
}
