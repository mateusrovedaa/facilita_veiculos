package tela;

import dao.MarcaDao;
import entidade.Marca;
import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaCadastroMarca extends javax.swing.JInternalFrame {

    int codigo = 0;
    Color red = Color.decode("#e66874");

    public TelaCadastroMarca() {
        initComponents();
        new MarcaDao().popularTabela(tblMarca, campoFiltroMarca.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abaAdicionar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoFiltroMarca = new javax.swing.JTextField();
        btnFiltrarMarca = new javax.swing.JButton();
        btnLimparMarca = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMarca = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();
        btnEditaMarca = new javax.swing.JButton();
        btnExcluirMarca = new javax.swing.JButton();

        setTitle("Cadastro de marcas");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar/ editar nome da marca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel2.setText("Nome:");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
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
                .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSalvar))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        abaAdicionar.addTab("Adicionar/editar marcas", jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");
        jLabel1.setPreferredSize(new java.awt.Dimension(31, 14));

        btnFiltrarMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarMarca.setText("Filtrar");
        btnFiltrarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarMarcaActionPerformed(evt);
            }
        });

        btnLimparMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparMarca.setText("Limpar");
        btnLimparMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparMarca)
                .addGap(6, 6, 6))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(campoFiltroMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnFiltrarMarca)
                .addComponent(btnLimparMarca))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionar.addTab("Filtrar marcas", jPanel2);

        tblMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane2.setViewportView(tblMarca);

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnEditaMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditaMarca.setText("Editar");
        btnEditaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaMarcaActionPerformed(evt);
            }
        });

        btnExcluirMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirMarca.setText("Excluir");
        btnExcluirMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionar)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditaMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnEditaMarca)
                    .addComponent(btnExcluirMarca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarMarcaActionPerformed
        new MarcaDao().popularTabela(tblMarca, campoFiltroMarca.getText());
    }//GEN-LAST:event_btnFiltrarMarcaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Marca marca = new Marca();

        marca.setId(codigo);
        marca.setNome(campoNome.getText());

        String retornoSalvarMarca = null;
        MarcaDao marcaDao = new MarcaDao();
        String erroMarca = "";

        if (validaCampos() == true) {
            if (codigo == 0) {
                retornoSalvarMarca = marcaDao.salvar(marca);
            } else {
                retornoSalvarMarca = marcaDao.atualizar(marca);
            }
        } else {
            erroMarca = null;
            JOptionPane.showMessageDialog(null, "Digite uma marca válida!");
        }

        if (retornoSalvarMarca == null && erroMarca != null) {
            JOptionPane.showMessageDialog(null, "Marca salva com sucesso!");

            campoNome.setText("");

            campoNome.requestFocus();

            campoFiltroMarca.setText("");

            codigo = 0;

            new MarcaDao().popularTabela(tblMarca, campoFiltroMarca.getText());
        } else {
            if (erroMarca != null) {
                JOptionPane.showMessageDialog(null, "Marca " + campoNome.getText() + " já existe cadastrada!");

                campoNome.setText("");

                campoNome.requestFocus();

                campoFiltroMarca.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMarcaActionPerformed
        String codigoExcluirMarca = String.valueOf(tblMarca.getValueAt(tblMarca.getSelectedRow(), 0));

        String retornoExcluirMarca = new MarcaDao().excluir(Integer.parseInt(codigoExcluirMarca));

        if (retornoExcluirMarca == null) {
            JOptionPane.showMessageDialog(null, "Marca excluída com sucesso!");
            new MarcaDao().popularTabela(tblMarca, campoFiltroMarca.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblMarca.getValueAt(tblMarca.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirMarcaActionPerformed

    private void btnEditaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaMarcaActionPerformed
        String codigoEditarMarca = String.valueOf(tblMarca.getValueAt(tblMarca.getSelectedRow(), 0));

        Marca marca = new MarcaDao().consultarId(Integer.parseInt(codigoEditarMarca));

        if (marca != null) {
            abaAdicionar.setSelectedIndex(0);

            campoNome.setText(marca.getNome());

            campoNome.requestFocus();

            codigo = marca.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar marca!");
        }
    }//GEN-LAST:event_btnEditaMarcaActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnLimparMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparMarcaActionPerformed
        campoFiltroMarca.setText("");
        new MarcaDao().popularTabela(tblMarca, campoFiltroMarca.getText());
    }//GEN-LAST:event_btnLimparMarcaActionPerformed

    public boolean validaCampos() {
        return !campoNome.getText().isEmpty() && campoNome.getText().length() > 2;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaAdicionar;
    private javax.swing.JButton btnEditaMarca;
    private javax.swing.JButton btnExcluirMarca;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFiltrarMarca;
    private javax.swing.JButton btnLimparMarca;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoFiltroMarca;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMarca;
    // End of variables declaration//GEN-END:variables
}
