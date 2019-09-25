package tela;

import dao.MarcaDao;
import functions.Funcoes;
import functions.GerenciarJanelas;
import javax.swing.JDesktopPane;

public class TelaInicio extends javax.swing.JFrame {

    int id = 0;
    GerenciarJanelas gerenciarJanelas;

    public TelaInicio() {
        initComponents();
        this.gerenciarJanelas = new GerenciarJanelas(dktGeral);
    }

    public TelaInicio(int usuario) {
        initComponents();
        id = usuario;
        MarcaDao marcaDao = new MarcaDao();
        this.gerenciarJanelas = new GerenciarJanelas(dktGeral);
    }

    public JDesktopPane JDesktopPane() {
        return this.dktGeral;
    }

    public int idUser() {
        return this.id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dktGeral = new javax.swing.JDesktopPane();
        btnMarcas = new javax.swing.JButton();
        btnCGerais = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dktGeral.setForeground(new java.awt.Color(60, 63, 65));

        btnMarcas.setText("Cadastro de marcas");
        btnMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcasActionPerformed(evt);
            }
        });

        btnCGerais.setText("Cadastro gerais");
        btnCGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCGeraisActionPerformed(evt);
            }
        });

        dktGeral.setLayer(btnMarcas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dktGeral.setLayer(btnCGerais, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dktGeralLayout = new javax.swing.GroupLayout(dktGeral);
        dktGeral.setLayout(dktGeralLayout);
        dktGeralLayout.setHorizontalGroup(
            dktGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dktGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dktGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMarcas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCGerais, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addContainerGap(253, Short.MAX_VALUE))
        );

        dktGeralLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCGerais, btnMarcas});

        dktGeralLayout.setVerticalGroup(
            dktGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dktGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMarcas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCGerais)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        dktGeralLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCGerais, btnMarcas});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dktGeral, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dktGeral)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcasActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroMarca.getInstancia());
//Funcoes.controlaIframes(TelaCadastroMarca.getInstancia(), dktGeral);
//        jPanel1.add(marca);
//        int lDesk = jPanel1.getWidth();
//        int aDesk = jPanel1.getHeight();
//        int lIFrame = marca.getWidth();
//        int aIFrame = marca.getHeight();
//        marca.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
//        marca.setVisible(true);
    }//GEN-LAST:event_btnMarcasActionPerformed

    private void btnCGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCGeraisActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroGeral.getInstancia());
//        jPanel1.add(geral);
//        int lDesk = jPanel1.getWidth();
//        int aDesk = jPanel1.getHeight();
//        int lIFrame = geral.getWidth();
//        int aIFrame = geral.getHeight();
//        geral.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
//        geral.setVisible(true);
    }//GEN-LAST:event_btnCGeraisActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCGerais;
    private javax.swing.JButton btnMarcas;
    private javax.swing.JDesktopPane dktGeral;
    // End of variables declaration//GEN-END:variables
}
