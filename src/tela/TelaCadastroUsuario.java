package tela;

import dao.ComboDao;
import dao.UsuarioDao;
import entidade.Usuario;
import functions.ComboItem;
import functions.Formatacao;
import functions.Mensagem;
import functions.Validacao;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaCadastroUsuario extends javax.swing.JInternalFrame {

    int codigo = 0;
    Color red = Color.decode("#e66874");

    public TelaCadastroUsuario() {
        initComponents();
        Formatacao.formatarData(campoDataNascimento);
        new ComboDao().popularCombo("perfis", comboPerfilId);
        new UsuarioDao().popularTabela(tblUsuario, campoFiltroUsuario.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        campoConfirmaSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        comboPerfilId = new javax.swing.JComboBox<>();
        label77 = new javax.swing.JLabel();
        campoDataNascimento = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        campoFiltroUsuario = new javax.swing.JTextField();
        btnLimparFiltroUsuario = new javax.swing.JButton();
        btnFiltrarUsuario = new javax.swing.JButton();
        btnExcluirUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnSalvarUsuario = new javax.swing.JButton();
        btnFecharUsuario = new javax.swing.JButton();

        setTitle("Cadastro de usuários");
        setPreferredSize(new java.awt.Dimension(712, 325));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar usuário:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Nome:*");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Senha:*");

        jLabel4.setText("Confirmar senha:*");

        jLabel2.setText("Perfil:*");

        comboPerfilId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        label77.setText("Data de nascimento:*");

        jLabel7.setText("Email:*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(label77))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboPerfilId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoEmail)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(campoConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboPerfilId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label77)
                    .addComponent(campoDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Cadastrar usuário", jPanel1);

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Perfil", "Nome", "Data de nascimento", "Email"
            }
        ));
        jScrollPane2.setViewportView(tblUsuario);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel8.setText("Nome:");

        btnLimparFiltroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparFiltroUsuario.setText("Limpar");
        btnLimparFiltroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFiltroUsuarioActionPerformed(evt);
            }
        });

        btnFiltrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarUsuario.setText("Filtrar");
        btnFiltrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparFiltroUsuario)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(campoFiltroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnFiltrarUsuario)
                .addComponent(btnLimparFiltroUsuario))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Listar usuários", jPanel2);

        btnExcluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        btnEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnSalvarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarUsuario.setText("Salvar");
        btnSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuarioActionPerformed(evt);
            }
        });

        btnFecharUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharUsuario.setText("Fechar");
        btnFecharUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharUsuario)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharUsuario)
                    .addComponent(btnSalvarUsuario)
                    .addComponent(btnEditarUsuario)
                    .addComponent(btnExcluirUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarUsuarioActionPerformed
        new UsuarioDao().popularTabela(tblUsuario, campoFiltroUsuario.getText());
    }//GEN-LAST:event_btnFiltrarUsuarioActionPerformed

    private void btnLimparFiltroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFiltroUsuarioActionPerformed
        campoFiltroUsuario.setText("");
        new UsuarioDao().popularTabela(tblUsuario, campoFiltroUsuario.getText());
    }//GEN-LAST:event_btnLimparFiltroUsuarioActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        String codigoExcluirCliente = String.valueOf(tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 0));

        String retornoExcluirCliente = new UsuarioDao().excluir(Integer.parseInt(codigoExcluirCliente));

        if (retornoExcluirCliente == null) {
            Mensagem.informacao("Usuário excluído com sucesso!", this);
            new UsuarioDao().popularTabela(tblUsuario, campoFiltroUsuario.getText());
        } else {
            Mensagem.erro(tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
        }
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        String codigoEditarUsuario = String.valueOf(tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 0));

        Usuario usuario = new UsuarioDao().consultarId(Integer.parseInt(codigoEditarUsuario));

        ComboItem perfilId = new ComboItem();
        perfilId.setCodigo(usuario.getPerfilId());

        if (usuario != null) {
            jTabbedPane2.setSelectedIndex(0);

            campoNome.setText(usuario.getNome());
            new ComboDao().definirItemCombo(comboPerfilId, perfilId);
            campoDataNascimento.setText(String.valueOf(Formatacao.ajustaDataDMA(usuario.getDataNascimento())));
            campoEmail.setText(String.valueOf(usuario.getEmail()));

            codigo = usuario.getId();

        } else {
            Mensagem.erro("Erro ao consultar cliente!", this);
        }
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuarioActionPerformed
        Usuario usuario = new Usuario();

        ComboItem perfilId = (ComboItem) comboPerfilId.getSelectedItem();

        System.out.println("ID: " + perfilId.getCodigo());
        System.out.println("Nome: " + perfilId.getDescricao());

        usuario.setId(codigo);
        usuario.setNome(campoNome.getText());
        usuario.setPerfilId(perfilId.getCodigo());

        if (!campoDataNascimento.getText().equals("")) {
            String data_nascimento = Formatacao.ajustaDataAMD(campoDataNascimento.getText());
            usuario.setDataNascimento(data_nascimento);
        }

        usuario.setEmail(campoEmail.getText());

        String senha = null;
        try {
            senha = Validacao.criptografarSenha(campoSenha.getText());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        usuario.setSenha(senha);

        String confirmaSenha = null;
        try {
            confirmaSenha = Validacao.criptografarSenha(campoConfirmaSenha.getText());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        usuario.setConfirmaSenha(confirmaSenha);

        UsuarioDao usuarioDao = new UsuarioDao();
        String retornoSalvarUsuario = null;

        if (validaCampos() == true) {
            if (codigo == 0) {
                retornoSalvarUsuario = usuarioDao.salvar(usuario);
            } else {
                retornoSalvarUsuario = usuarioDao.atualizar(usuario);
            }
            Mensagem.aviso("Usuário salvo com sucesso!", this);
        } else {
            Mensagem.aviso("Campos obrigatórios (*) devem ser preenchidos corretamente!", this);
        }

        if (retornoSalvarUsuario == null) {

            campoNome.setText("");
            comboPerfilId.setSelectedIndex(0);
            campoDataNascimento.setText("");
            campoEmail.setText("");
            campoSenha.setText("");
            campoConfirmaSenha.setText("");

            codigo = 0;

            new UsuarioDao().popularTabela(tblUsuario, campoFiltroUsuario.getText());
        } else {
            Mensagem.erro("Deu erro: \n\nMensagem técnica:" + retornoSalvarUsuario, this);
        }
    }//GEN-LAST:event_btnSalvarUsuarioActionPerformed

    private void btnFecharUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharUsuarioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharUsuarioActionPerformed

    public boolean validaCampos() {

        ComboItem perfilId = (ComboItem) comboPerfilId.getSelectedItem();

        String senha = null;
        try {
            senha = Validacao.criptografarSenha(campoSenha.getText());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        String confirmaSenha = null;
        try {
            confirmaSenha = Validacao.criptografarSenha(campoConfirmaSenha.getText());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return !campoNome.getText().equals("") && campoNome.getText().length() > 2
                && senha.equals(confirmaSenha) && !campoEmail.getText().equals("")
                && !senha.equals("") && !confirmaSenha.equals("") && !campoDataNascimento.getText().equals("  /  /    ")
                && !campoEmail.getText().equals("") && perfilId.getCodigo() != 0
                && Validacao.validarDataFormatada(campoDataNascimento.getText());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnFecharUsuario;
    private javax.swing.JButton btnFiltrarUsuario;
    private javax.swing.JButton btnLimparFiltroUsuario;
    private javax.swing.JButton btnSalvarUsuario;
    private javax.swing.JPasswordField campoConfirmaSenha;
    private javax.swing.JFormattedTextField campoDataNascimento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoFiltroUsuario;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JComboBox<String> comboPerfilId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel label77;
    private javax.swing.JTable tblUsuario;
    // End of variables declaration//GEN-END:variables
}
