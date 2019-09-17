package tela;

import dao.DaoGenerico;
import dao.MarcaDao;
import entidade.Carroceria;
import entidade.Marca;
import entidade.Modelo;
import entidade.Procedencia;
import functions.Funcoes;
import functions.GerenciarJanelas;
import functions.Mensagem;
import java.util.Calendar;

public class TelaCadastroModelo extends javax.swing.JInternalFrame {

    private static TelaCadastroModelo tela;
    int codigo = 0;

    public TelaCadastroModelo() {
        initComponents();
        new MarcaDao().popularTabela(tblMarca, campoFiltroMarca.getText());
    }

    public static TelaCadastroModelo getInstancia() {
        if (tela == null) {
            tela = new TelaCadastroModelo();
        }
        return tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abaAdicionar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        marca = new javax.swing.JTextField();
        carroceria = new javax.swing.JTextField();
        procedencia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoFiltroMarca = new javax.swing.JTextField();
        btnLimparBusca = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMarca = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de marcas");

        abaAdicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionar.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nome da marca:");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel3.setText("marca");

        jLabel4.setText("procedencia");

        jLabel5.setText("carroceria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(carroceria, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(procedencia))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        abaAdicionar.addTab("Cadastrar ou editar marca", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome da marca:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBusca)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoFiltroMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBusca)
                    .addComponent(btnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionar.addTab("Pesquisar marcas", jPanel2);

        tblMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMarca);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionar)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Modelo modelo = new Modelo();

        modelo.setNome(campoNome.getText());

        modelo.setMarca(new Marca((Marca) DaoGenerico.getInstance().obterPorId(Marca.class, 5)));
        modelo.setProcedencia(new Procedencia((Procedencia) DaoGenerico.getInstance().obterPorId(Procedencia.class, 1)));
        modelo.setCarroceria(new Carroceria((Carroceria) DaoGenerico.getInstance().obterPorId(Carroceria.class, 2)));

        modelo.setSlug(Funcoes.textoIdentificador(campoNome.getText()));
        modelo.setCriadoEm(Calendar.getInstance());
        modelo.setAlteradoEm(Calendar.getInstance());

        DaoGenerico.getInstance().inserir(modelo);
//
//        marca.setId(codigo);
//        marca.setNome(campoNome.getText());
//        marca.setSlug(Funcoes.textoIdentificador(campoNome.getText()));
//        marca.setCriadoEm(Calendar.getInstance());
//        marca.setAlteradoEm(Calendar.getInstance());
//
//        boolean retornoSalvarMarca = false;
//        String erroMarca = "";
//
//        if (validaCampos() == true) {
//            if (codigo == 0) {
//                retornoSalvarMarca = DaoGenerico.getInstance().inserir(marca);
//            } else {
//                retornoSalvarMarca = DaoGenerico.getInstance().atualizar(marca);
//            }
//        } else {
//            erroMarca = null;
//            Mensagem.erro("Digite uma marca válida!", this);
//        }
//
//        if (retornoSalvarMarca == true && erroMarca != null) {
//            Mensagem.informacao("Marca salva com sucesso!", this);
//
//            campoNome.setText("");
//
//            campoNome.requestFocus();
//
//            campoFiltroMarca.setText("");
//
//            codigo = 0;
//
//            new MarcaDao().popularTabela(tblMarca, campoFiltroMarca.getText());
//        } else {
//            if (erroMarca != null) {
//                Mensagem.aviso("Marca " + campoNome.getText() + " já existe cadastrada!", this);
//
//                campoNome.setText("");
//
//                campoNome.requestFocus();
//
//                campoFiltroMarca.setText("");
//            }
//        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        GerenciarJanelas.fecharJanela(tela);
        tela = null;
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
//        String codigoEditarMarca = String.valueOf(tblMarca.getValueAt(tblMarca.getSelectedRow(), 0));
//        
//        Object object = DaoGenerico.getInstance().obterPorId(Marca.class, Integer.parseInt(codigoEditarMarca));
//        Marca marca = new Marca((Marca) object);
//
//        if (marca != null) {
//            abaAdicionar.setSelectedIndex(0);
//
//            campoNome.setText(marca.getNome());
//
//            campoNome.requestFocus();
//
//            codigo = marca.getId();
//
//        } else {
//            Mensagem.erro("Erro ao consultar marca!", this);
//        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
//        int codigoExcluirMarca = (int) tblMarca.getValueAt(tblMarca.getSelectedRow(), 0);
//        
//        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
//        if (mensagem == 0) {
//            boolean retornoExcluirMarca = DaoGenerico.getInstance().excluir(Marca.class, codigoExcluirMarca);
//
//            if (retornoExcluirMarca == true) {
//                Mensagem.informacao("Marca excluída com sucesso!", this);
//                new MarcaDao().popularTabela(tblMarca, campoFiltroMarca.getText());
//            } else {
//                Mensagem.erro(tblMarca.getValueAt(tblMarca.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
//            }
//        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
//        new MarcaDao().popularTabela(tblMarca, campoFiltroMarca.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimparBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaActionPerformed
        campoFiltroMarca.setText("");
        new MarcaDao().popularTabela(tblMarca, campoFiltroMarca.getText());
    }//GEN-LAST:event_btnLimparBuscaActionPerformed

    private boolean validaCampos() {
        return !campoNome.getText().isEmpty() && campoNome.getText().length() > 2;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimparBusca;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoFiltroMarca;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField carroceria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField procedencia;
    private javax.swing.JTable tblMarca;
    // End of variables declaration//GEN-END:variables
}