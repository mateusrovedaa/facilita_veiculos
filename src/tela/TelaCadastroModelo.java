package tela;

import dao.CarroceriaDao;
import dao.ComboDao;
import dao.MarcaDao;
import dao.ModeloDao;
import entidade.Carroceria;
import entidade.Marca;
import entidade.Modelo;
import functions.ComboItem;
import functions.Mensagem;

public class TelaCadastroModelo extends javax.swing.JInternalFrame {

    int codigo = 0;

    public TelaCadastroModelo() {
        initComponents();
        campoIdMarcaBusca.setEditable(false);
        campoNomeMarcaBusca.setEditable(false);
        campoIdCarroceriaBusca.setEditable(false);
        campoNomeCarroceriaBusca.setEditable(false);
        new ComboDao().popularCombo("procedencias", comboProcedenciaId);
        new ModeloDao().popularTabela(tblModelo, campoFiltroModelo.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        abaModelo = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        labelcomprimento = new javax.swing.JLabel();
        campoComprimento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoAltura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoLargura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboProcedenciaId = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        campoIdMarcaBusca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoNomeMarcaBusca = new javax.swing.JTextField();
        buscar_marca = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoIdCarroceriaBusca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoNomeCarroceriaBusca = new javax.swing.JTextField();
        buscarCarroceria = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblModelo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        campoFiltroModelo = new javax.swing.JTextField();
        btnFiltrarModelo = new javax.swing.JButton();
        btnLimparModelo = new javax.swing.JButton();
        btnFecharModelo = new javax.swing.JButton();
        btnEditarModelo = new javax.swing.JButton();
        btnExcluirModelo = new javax.swing.JButton();
        btnSalvarModelo = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setTitle("Cadastro de modelos");
        setPreferredSize(new java.awt.Dimension(800, 380));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar modelo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:*");

        labelcomprimento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelcomprimento.setText("Comprimento:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Altura:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Largura:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Procedência:*");

        comboProcedenciaId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca:*"));

        jLabel7.setText("Código:");

        jLabel8.setText("Nome:");

        buscar_marca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        buscar_marca.setText("Procurar");
        buscar_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_marcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdMarcaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeMarcaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar_marca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoIdMarcaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(campoNomeMarcaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_marca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Carroceria:*"));

        jLabel2.setText("Código:");

        jLabel10.setText("Nome:");

        buscarCarroceria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        buscarCarroceria.setText("Procurar");
        buscarCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCarroceriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdCarroceriaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeCarroceriaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarCarroceria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoIdCarroceriaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(campoNomeCarroceriaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarCarroceria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelcomprimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoLargura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(campoAltura, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoComprimento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoNome)
                    .addComponent(comboProcedenciaId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelcomprimento)
                            .addComponent(campoComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboProcedenciaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(0, 66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaModelo.addTab("Cadastrar modelo", jPanel1);

        tblModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Marca", "Procedência"
            }
        ));
        jScrollPane1.setViewportView(tblModelo);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel9.setText("Nome do modelo:");

        btnFiltrarModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarModelo.setText("Filtrar");
        btnFiltrarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarModeloActionPerformed(evt);
            }
        });

        btnLimparModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparModelo.setText("Limpar");
        btnLimparModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparModeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparModelo)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9)
                .addComponent(campoFiltroModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnLimparModelo)
                .addComponent(btnFiltrarModelo))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        abaModelo.addTab("Listar modelos", jPanel4);

        btnFecharModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharModelo.setText("Fechar");
        btnFecharModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharModeloActionPerformed(evt);
            }
        });

        btnEditarModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarModelo.setText("Editar");
        btnEditarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarModeloActionPerformed(evt);
            }
        });

        btnExcluirModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirModelo.setText("Excluir");
        btnExcluirModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirModeloActionPerformed(evt);
            }
        });

        btnSalvarModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarModelo.setText("Salvar");
        btnSalvarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarModeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaModelo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharModelo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(abaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharModelo)
                    .addComponent(btnSalvarModelo)
                    .addComponent(btnEditarModelo)
                    .addComponent(btnExcluirModelo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarModeloActionPerformed
        Modelo modelo = new Modelo();

        ComboItem procedenciaId = (ComboItem) comboProcedenciaId.getSelectedItem();

        modelo.setId(codigo);
        modelo.setNome(campoNome.getText());

        if (!campoIdMarcaBusca.getText().equals("")) {
            modelo.setMarcaId(Integer.parseInt(campoIdMarcaBusca.getText()));
        }

        modelo.setProcedenciaId(procedenciaId.getCodigo());

        if (!campoIdCarroceriaBusca.getText().equals("")) {
            modelo.setCarroceriaId(Integer.parseInt(campoIdCarroceriaBusca.getText()));
        }

        if (!campoComprimento.getText().equals("")) {
            modelo.setComprimento(Double.parseDouble(campoComprimento.getText().replace(",", ".")));
        }

        if (!campoAltura.getText().equals("")) {
            modelo.setAltura(Double.parseDouble(campoAltura.getText().replace(",", ".")));
        }

        if (!campoLargura.getText().equals("")) {
            modelo.setLargura(Double.parseDouble(campoLargura.getText().replace(",", ".")));
        }

        ModeloDao modeloDao = new ModeloDao();
        String retornoSalvarModelo = null;

        if (validaCampos() == true) {
            if (codigo == 0) {
                retornoSalvarModelo = modeloDao.salvar(modelo);
            } else {
                retornoSalvarModelo = modeloDao.atualizar(modelo);
            }
            Mensagem.informacao("Modelo salvo com sucesso!", this);
        } else {
            Mensagem.aviso("Campos obrigatórios (*) devem ser preenchidos corretamente!", this);
        }

        if (retornoSalvarModelo == null) {

            campoNome.setText("");
            campoComprimento.setText("");
            campoAltura.setText("");
            campoLargura.setText("");
            comboProcedenciaId.setSelectedIndex(0);
            campoIdMarcaBusca.setText("");
            campoNomeMarcaBusca.setText("");
            campoIdCarroceriaBusca.setText("");
            campoNomeCarroceriaBusca.setText("");

            campoNome.requestFocus();

            codigo = 0;

            new ModeloDao().popularTabela(tblModelo, campoFiltroModelo.getText());
        } else {
            Mensagem.erro("Deu erro: \n\nMensagem técnica:" + retornoSalvarModelo, this);
        }
    }//GEN-LAST:event_btnSalvarModeloActionPerformed

    private void btnFiltrarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarModeloActionPerformed
        new ModeloDao().popularTabela(tblModelo, campoFiltroModelo.getText());
    }//GEN-LAST:event_btnFiltrarModeloActionPerformed

    private void btnFecharModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharModeloActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharModeloActionPerformed

    private void btnEditarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarModeloActionPerformed
        String codigoEditarModelo = String.valueOf(tblModelo.getValueAt(tblModelo.getSelectedRow(), 0));

        Modelo modelo = new ModeloDao().consultarId(Integer.parseInt(codigoEditarModelo));
        Marca marca = new MarcaDao().consultarId(Integer.parseInt(Integer.toString(modelo.getMarcaId())));
        Carroceria carroceria = new CarroceriaDao().consultarId(Integer.parseInt(Integer.toString(modelo.getCarroceriaId())));

        ComboItem procedenciaId = new ComboItem();
        procedenciaId.setCodigo(modelo.getProcedenciaId());
        if (modelo != null) {
            abaModelo.setSelectedIndex(0);

            campoNome.setText(modelo.getNome());
            campoComprimento.setText(Double.toString(modelo.getComprimento()).replace(".", ","));
            campoAltura.setText(Double.toString(modelo.getAltura()).replace(".", ","));
            campoLargura.setText(Double.toString(modelo.getLargura()).replace(".", ","));
            new ComboDao().definirItemCombo(comboProcedenciaId, procedenciaId);
            campoIdMarcaBusca.setText(Integer.toString(modelo.getMarcaId()));
            campoNomeMarcaBusca.setText(marca.getNome());
            campoIdCarroceriaBusca.setText(Integer.toString(modelo.getCarroceriaId()));
            campoNomeCarroceriaBusca.setText(carroceria.getNome());

            campoNome.requestFocus();

            codigo = modelo.getId();

        } else {
            Mensagem.erro("Erro ao consultar modelo!", this);
        }
    }//GEN-LAST:event_btnEditarModeloActionPerformed

    private void btnExcluirModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirModeloActionPerformed
        String codigoExcluirModelo = String.valueOf(tblModelo.getValueAt(tblModelo.getSelectedRow(), 0));

        String retornoExcluirModelo = new ModeloDao().excluir(Integer.parseInt(codigoExcluirModelo));

        if (retornoExcluirModelo == null) {
            Mensagem.informacao("Modelo excluído com sucesso!", this);
            new MarcaDao().popularTabela(tblModelo, campoFiltroModelo.getText());
        } else {
            Mensagem.erro(tblModelo.getValueAt(tblModelo.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
        }
    }//GEN-LAST:event_btnExcluirModeloActionPerformed

    private void buscar_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_marcaActionPerformed
        TelaBuscaMarca buscaMarca = new TelaBuscaMarca(null, true, this);
        buscaMarca.setLocationRelativeTo(this);
        buscaMarca.setVisible(true);
    }//GEN-LAST:event_buscar_marcaActionPerformed

    private void buscarCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCarroceriaActionPerformed
        TelaBuscaCarroceria buscaCarroceria = new TelaBuscaCarroceria(null, true, this);
        buscaCarroceria.setLocationRelativeTo(this);
        buscaCarroceria.setVisible(true);
    }//GEN-LAST:event_buscarCarroceriaActionPerformed

    private void btnLimparModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparModeloActionPerformed
        campoFiltroModelo.setText("");
        new ModeloDao().popularTabela(tblModelo, campoFiltroModelo.getText());
    }//GEN-LAST:event_btnLimparModeloActionPerformed

    public void definirMarca(int id, String nome) {
        campoIdMarcaBusca.setText(Integer.toString(id));
        campoNomeMarcaBusca.setText(nome);
    }

    public void definirCarroceria(int id, String nome) {
        campoIdCarroceriaBusca.setText(Integer.toString(id));
        campoNomeCarroceriaBusca.setText(nome);
    }

    public boolean validaCampos() {
        ComboItem procedenciaId = (ComboItem) comboProcedenciaId.getSelectedItem();

        return procedenciaId.getCodigo() != 0 && !campoNome.getText().equals("")
                && !campoIdMarcaBusca.getText().equals("")
                && !campoNomeMarcaBusca.getText().equals("")
                && !campoIdCarroceriaBusca.getText().equals("")
                && !campoNomeCarroceriaBusca.getText().equals("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaModelo;
    private javax.swing.JButton btnEditarModelo;
    private javax.swing.JButton btnExcluirModelo;
    private javax.swing.JButton btnFecharModelo;
    private javax.swing.JButton btnFiltrarModelo;
    private javax.swing.JButton btnLimparModelo;
    private javax.swing.JButton btnSalvarModelo;
    private javax.swing.JButton buscarCarroceria;
    private javax.swing.JButton buscar_marca;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoComprimento;
    private javax.swing.JTextField campoFiltroModelo;
    private javax.swing.JTextField campoIdCarroceriaBusca;
    private javax.swing.JTextField campoIdMarcaBusca;
    private javax.swing.JTextField campoLargura;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNomeCarroceriaBusca;
    private javax.swing.JTextField campoNomeMarcaBusca;
    private javax.swing.JComboBox<String> comboProcedenciaId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelcomprimento;
    private javax.swing.JTable tblModelo;
    // End of variables declaration//GEN-END:variables
}
