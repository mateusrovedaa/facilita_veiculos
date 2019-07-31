package tela;

import dao.ProprietarioDao;
import entidade.Proprietario;
import functions.Formatacao;
import static functions.Validacao.validarCPF;
import javax.swing.JOptionPane;

public class TelaCadastroProprietario extends javax.swing.JInternalFrame {

    int codigo = 0;

    public TelaCadastroProprietario() {
        initComponents();
        Formatacao.formatarRg(campoRg);
        Formatacao.formatarCpf(campoCpf);
        Formatacao.formatarTelefone(campoTelefone);
        new ProprietarioDao().popularTabela(tblProprietario, campoFiltroProprietario.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoRg = new javax.swing.JFormattedTextField();
        campoCpf = new javax.swing.JFormattedTextField();
        campoTelefone = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProprietario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        campoFiltroProprietario = new javax.swing.JTextField();
        btnFiltrarProprietario = new javax.swing.JButton();
        btnLimparFiltroProprietario = new javax.swing.JButton();
        btExcluirProprietario = new javax.swing.JButton();
        btnEditarProprietario = new javax.swing.JButton();
        btnSalvarProprietario = new javax.swing.JButton();
        btnFecharProprietario = new javax.swing.JButton();

        setTitle("Cadastro de proprietários");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar cliente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:*");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("RG:*");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CPF:*");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Telefone:*");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cidade:*");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Endereço:*");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("E-mail:*");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCidade, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                    .addComponent(campoEmail)
                    .addComponent(campoNome, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar proprietários", jPanel2);

        tblProprietario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Cidade", "Endereço", "Telefone"
            }
        ));
        jScrollPane2.setViewportView(tblProprietario);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel8.setText("Nome:");

        btnFiltrarProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarProprietario.setText("Filtrar");
        btnFiltrarProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarProprietarioActionPerformed(evt);
            }
        });

        btnLimparFiltroProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparFiltroProprietario.setText("Limpar");
        btnLimparFiltroProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFiltroProprietarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroProprietario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarProprietario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparFiltroProprietario)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(campoFiltroProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnFiltrarProprietario)
                .addComponent(btnLimparFiltroProprietario))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar proprietários", jPanel3);

        btExcluirProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btExcluirProprietario.setText("Excluir");
        btExcluirProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirProprietarioActionPerformed(evt);
            }
        });

        btnEditarProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarProprietario.setText("Editar");
        btnEditarProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProprietarioActionPerformed(evt);
            }
        });

        btnSalvarProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarProprietario.setText("Salvar");
        btnSalvarProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProprietarioActionPerformed(evt);
            }
        });

        btnFecharProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharProprietario.setText("Fechar");
        btnFecharProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharProprietarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluirProprietario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarProprietario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarProprietario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharProprietario))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharProprietario)
                    .addComponent(btnSalvarProprietario)
                    .addComponent(btnEditarProprietario)
                    .addComponent(btExcluirProprietario))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirProprietarioActionPerformed
        String codigoExcluirProprietario = String.valueOf(tblProprietario.getValueAt(tblProprietario.getSelectedRow(), 0));

        String retornoExcluirProprietario = new ProprietarioDao().excluir(Integer.parseInt(codigoExcluirProprietario));

        if (retornoExcluirProprietario == null) {
            JOptionPane.showMessageDialog(null, "Proprietário excluído com sucesso!");
            new ProprietarioDao().popularTabela(tblProprietario, campoFiltroProprietario.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblProprietario.getValueAt(tblProprietario.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btExcluirProprietarioActionPerformed

    private void btnEditarProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProprietarioActionPerformed
        String codigoEditarProprietario = String.valueOf(tblProprietario.getValueAt(tblProprietario.getSelectedRow(), 0));

        Proprietario proprietario = new ProprietarioDao().consultarId(Integer.parseInt(codigoEditarProprietario));

        if (proprietario != null) {
            jTabbedPane1.setSelectedIndex(0);

            campoNome.setText(proprietario.getNome());
            campoRg.setText(String.valueOf(proprietario.getRg()));
            campoCpf.setText(String.valueOf(proprietario.getCpf()));
            campoCidade.setText(String.valueOf(proprietario.getCidade()));
            campoEndereco.setText(String.valueOf(proprietario.getEndereco()));
            campoTelefone.setText(String.valueOf(proprietario.getTelefone()));
            campoEmail.setText(String.valueOf(proprietario.getEmail()));

            campoNome.requestFocus();

            codigo = proprietario.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar proprietário!");
        }
    }//GEN-LAST:event_btnEditarProprietarioActionPerformed

    private void btnSalvarProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProprietarioActionPerformed
        Proprietario proprietario = new Proprietario();

        proprietario.setId(codigo);
        proprietario.setNome(campoNome.getText());
        proprietario.setRg(campoRg.getText());
        proprietario.setCpf(campoCpf.getText());
        proprietario.setCidade(campoCidade.getText());
        proprietario.setEndereco(campoEndereco.getText());
        proprietario.setTelefone(campoTelefone.getText());
        proprietario.setEmail(campoEmail.getText());

        ProprietarioDao proprietarioDao = new ProprietarioDao();
        String retornoSalvarProprietario = null;
        String erroProprietario = "";

        if (validaCampos() == true) {
            if (codigo == 0) {
                retornoSalvarProprietario = proprietarioDao.salvar(proprietario);
            } else {
                retornoSalvarProprietario = proprietarioDao.atualizar(proprietario);
            }
        } else {
            erroProprietario = null;
            JOptionPane.showMessageDialog(null, "Campos obrigatórios (*) devem ser preenchidos corretamente. \n Verifique seus dados!");
        }
        if (retornoSalvarProprietario == null && erroProprietario != null) {
            JOptionPane.showMessageDialog(null, "Proprietário salvo com sucesso!");

            campoNome.setText("");
            campoRg.setText("");
            campoCpf.setText("");
            campoCidade.setText("");
            campoEndereco.setText("");
            campoTelefone.setText("");
            campoEmail.setText("");

            campoNome.requestFocus();

            codigo = 0;

            new ProprietarioDao().popularTabela(tblProprietario, campoFiltroProprietario.getText());
        } else {
            if (erroProprietario != null) {
                JOptionPane.showMessageDialog(null, "Proprietário(a) já está cadastrado(a)");
            }
        }
    }//GEN-LAST:event_btnSalvarProprietarioActionPerformed

    private void btnFecharProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharProprietarioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharProprietarioActionPerformed

    private void btnFiltrarProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarProprietarioActionPerformed
        new ProprietarioDao().popularTabela(tblProprietario, campoFiltroProprietario.getText());
    }//GEN-LAST:event_btnFiltrarProprietarioActionPerformed

    private void btnLimparFiltroProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFiltroProprietarioActionPerformed
        campoFiltroProprietario.setText("");
        new ProprietarioDao().popularTabela(tblProprietario, campoFiltroProprietario.getText());
    }//GEN-LAST:event_btnLimparFiltroProprietarioActionPerformed

    public boolean validaCampos() {

        return !campoNome.getText().equals("") && campoNome.getText().length() > 2
                && !campoRg.getText().equals("") && !validarCPF(campoCpf.getText())
                && !campoTelefone.getText().equals("(  )     -    ") && !campoCidade.getText().equals("")
                && !campoEndereco.getText().equals("") && !campoEmail.getText().equals("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluirProprietario;
    private javax.swing.JButton btnEditarProprietario;
    private javax.swing.JButton btnFecharProprietario;
    private javax.swing.JButton btnFiltrarProprietario;
    private javax.swing.JButton btnLimparFiltroProprietario;
    private javax.swing.JButton btnSalvarProprietario;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoFiltroProprietario;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoRg;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblProprietario;
    // End of variables declaration//GEN-END:variables
}
