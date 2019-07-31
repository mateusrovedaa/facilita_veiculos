package tela;

import dao.VendaVeiculoDao;
import entidade.VendaVeiculo;

public class TelaParcela extends javax.swing.JFrame {

    int id = 0;

    public TelaParcela() {
        initComponents();
    }

    public TelaParcela(int vendaId) {
        initComponents();
        this.id = vendaId;
        new VendaVeiculoDao().popularTabela(tblParcela, vendaId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblParcela = new javax.swing.JTable();
        btnFecharParcela = new javax.swing.JButton();
        btnParcelaPaga = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parcelas");

        tblParcela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Data de vencimento", "Valor da parcela", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblParcela);

        btnFecharParcela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharParcela.setText("Fechar");
        btnFecharParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharParcelaActionPerformed(evt);
            }
        });

        btnParcelaPaga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png"))); // NOI18N
        btnParcelaPaga.setText("Alterar status");
        btnParcelaPaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParcelaPagaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnParcelaPaga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharParcela)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharParcela)
                    .addComponent(btnParcelaPaga))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharParcelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharParcelaActionPerformed

    private void btnParcelaPagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParcelaPagaActionPerformed
        String codigoEditarVendaVeiculo = String.valueOf(tblParcela.getValueAt(tblParcela.getSelectedRow(), 0));

        VendaVeiculo vendaVeiculoId = new VendaVeiculoDao().consultarId(Integer.parseInt(codigoEditarVendaVeiculo));

        VendaVeiculo vendaVeiculo = new VendaVeiculo();

        vendaVeiculo.setId(vendaVeiculoId.getId());

        if (vendaVeiculoId.isStatus() == true) {
            vendaVeiculo.setStatus(false);
        } else {
            vendaVeiculo.setStatus(true);
        }

        VendaVeiculoDao vendaVeiculoDao = new VendaVeiculoDao();

        vendaVeiculoDao.alterarStatus(vendaVeiculo);

        new VendaVeiculoDao().popularTabela(tblParcela, this.id);
    }//GEN-LAST:event_btnParcelaPagaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaParcela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFecharParcela;
    private javax.swing.JButton btnParcelaPaga;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tblParcela;
    // End of variables declaration//GEN-END:variables
}
