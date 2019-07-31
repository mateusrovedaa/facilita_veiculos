package tela;

import dao.ClienteDao;
import entidade.Cliente;
import functions.Formatacao;
import static functions.Validacao.validarCPF;
import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaCadastroCliente extends javax.swing.JInternalFrame {

    int codigo = 0;
    Color red = Color.decode("#e66874");

    public TelaCadastroCliente() {
        initComponents();
        Formatacao.formatarRg(campoRg);
        Formatacao.formatarCpf(campoCpf);
        Formatacao.formatarTelefone(campoTelefone);
        new ClienteDao().popularTabela(tblCliente, campoFiltroCliente.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        campoFiltroCliente = new javax.swing.JTextField();
        btnFiltrarCliente = new javax.swing.JButton();
        btnLimparFiltroCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setTitle("Cadastro de clientes");

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
                        .addComponent(campoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cadastrar cliente", jPanel1);

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblCliente);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel8.setText("Nome:");

        btnFiltrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarCliente.setText("Filtrar");
        btnFiltrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarClienteActionPerformed(evt);
            }
        });

        btnLimparFiltroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparFiltroCliente.setText("Limpar");
        btnLimparFiltroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFiltroClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparFiltroCliente)
                .addGap(6, 6, 6))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(campoFiltroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnFiltrarCliente)
                .addComponent(btnLimparFiltroCliente))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Listar clientes", jPanel2);

        btnExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluirCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar))
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditarCliente)
                    .addComponent(btnExcluirCliente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarClienteActionPerformed
        new ClienteDao().popularTabela(tblCliente, campoFiltroCliente.getText());
    }//GEN-LAST:event_btnFiltrarClienteActionPerformed

    private void btnLimparFiltroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFiltroClienteActionPerformed
        campoFiltroCliente.setText("");
        new ClienteDao().popularTabela(tblCliente, campoFiltroCliente.getText());
    }//GEN-LAST:event_btnLimparFiltroClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        String codigoExcluirCliente = String.valueOf(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0));

        String retornoExcluirCliente = new ClienteDao().excluir(Integer.parseInt(codigoExcluirCliente));

        if (retornoExcluirCliente == null) {
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
            new ClienteDao().popularTabela(tblCliente, campoFiltroCliente.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblCliente.getValueAt(tblCliente.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        String codigoEditarCliente = String.valueOf(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0));

        Cliente cliente = new ClienteDao().consultarId(Integer.parseInt(codigoEditarCliente));

        if (cliente != null) {
            jTabbedPane2.setSelectedIndex(0);

            campoNome.setText(cliente.getNome());
            campoRg.setText(String.valueOf(cliente.getRg()));
            campoCpf.setText(String.valueOf(cliente.getCpf()));
            campoCidade.setText(String.valueOf(cliente.getCidade()));
            campoEndereco.setText(String.valueOf(cliente.getEndereco()));
            campoTelefone.setText(String.valueOf(cliente.getTelefone()));
            campoEmail.setText(String.valueOf(cliente.getEmail()));

            campoNome.requestFocus();

            codigo = cliente.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar cliente!");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Cliente cliente = new Cliente();

        cliente.setId(codigo);
        cliente.setNome(campoNome.getText());
        cliente.setRg(campoRg.getText());
        cliente.setCpf(campoCpf.getText());
        cliente.setCidade(campoCidade.getText());
        cliente.setEndereco(campoEndereco.getText());
        cliente.setTelefone(campoTelefone.getText());
        cliente.setEmail(campoEmail.getText());

        ClienteDao clienteDao = new ClienteDao();
        String retornoSalvarCliente = null;
        String erroCliente = "";

        if (validaCampos() == true) {
            if (codigo == 0) {
                retornoSalvarCliente = clienteDao.salvar(cliente);
            } else {
                retornoSalvarCliente = clienteDao.atualizar(cliente);
            }
        } else {
            erroCliente = null;
            JOptionPane.showMessageDialog(null, "Campos obrigatórios (*) devem ser preenchidos corretamente. \n Verifique seus dados!");
        }

        if (retornoSalvarCliente == null && erroCliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");

            campoNome.setText("");
            campoRg.setText("");
            campoCpf.setText("");
            campoCidade.setText("");
            campoEndereco.setText("");
            campoTelefone.setText("");
            campoEmail.setText("");

            campoNome.requestFocus();

            codigo = 0;

            new ClienteDao().popularTabela(tblCliente, campoFiltroCliente.getText());
        } else {
            if (erroCliente != null) {
                JOptionPane.showMessageDialog(null, "Cliente já está cadastrado(a)!");
                campoNome.setText("");
                campoRg.setText("");
                campoCpf.setText("");
                campoCidade.setText("");
                campoEndereco.setText("");
                campoTelefone.setText("");
                campoEmail.setText("");

                campoNome.requestFocus();
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    public boolean validaCampos() {

        return !campoNome.getText().equals("") && campoNome.getText().length() > 2
                && !campoTelefone.getText().equals("(  )     -    ") && !campoCpf.getText().equals("")
                && !campoRg.getText().equals("") && !campoCidade.getText().equals("")
                && !campoEndereco.getText().equals("") && !campoEmail.getText().equals("")
                && !validarCPF(campoCpf.getText());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFiltrarCliente;
    private javax.swing.JButton btnLimparFiltroCliente;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoFiltroCliente;
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
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables
}
