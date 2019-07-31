package tela;

import functions.ConexaoBD;
import functions.Formatacao;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioCompra extends javax.swing.JInternalFrame {

    public RelatorioCompra() {
        initComponents();
        Formatacao.formatarData(campoDataDe);
        Formatacao.formatarData(campoDataAte);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoDataDe = new javax.swing.JFormattedTextField();
        campoDataAte = new javax.swing.JFormattedTextField();
        btnGerarRelatorioCompra = new javax.swing.JButton();
        btnFecharRelatorioCompra = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setTitle("Relatório de compras");

        jLabel1.setText("Data de:");

        jLabel2.setText("Date até:");

        btnGerarRelatorioCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gerar.png"))); // NOI18N
        btnGerarRelatorioCompra.setText("Gerar");
        btnGerarRelatorioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioCompraActionPerformed(evt);
            }
        });

        btnFecharRelatorioCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharRelatorioCompra.setText("Fechar");
        btnFecharRelatorioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharRelatorioCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDataDe)
                            .addComponent(campoDataAte)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 93, Short.MAX_VALUE)
                        .addComponent(btnFecharRelatorioCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGerarRelatorioCompra)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerarRelatorioCompra)
                    .addComponent(btnFecharRelatorioCompra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarRelatorioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioCompraActionPerformed
        this.dispose();

        try {
            // Compila o relatorio
            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/compras.jrxml"));

            // Mapeia campos de parametros para o relatorio, mesmo que nao existam
            Map parametros = new HashMap();

            String dataDe = campoDataDe.getText();
            String dataAte = campoDataAte.getText();

            String dataDeFormatada = Formatacao.ajustaDataAMD(dataDe);
            String dataAteFormatada = Formatacao.ajustaDataAMD(dataAte);
            // adiciona parametros
            parametros.put("data_de", dataDeFormatada);
            parametros.put("data_ate", dataAteFormatada);
            //parametros.put("nomeParametro2", "valorParametro2");

            // Executa relatoio
            JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());

            // Exibe resultado em video
            JasperViewer.viewReport(impressao, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
        }
    }//GEN-LAST:event_btnGerarRelatorioCompraActionPerformed

    private void btnFecharRelatorioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharRelatorioCompraActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharRelatorioCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFecharRelatorioCompra;
    private javax.swing.JButton btnGerarRelatorioCompra;
    private javax.swing.JFormattedTextField campoDataAte;
    private javax.swing.JFormattedTextField campoDataDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
