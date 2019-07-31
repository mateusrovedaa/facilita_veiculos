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

public class RelatorioVenda extends javax.swing.JInternalFrame {

    public RelatorioVenda() {
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
        btnGerarRelatorioVenda = new javax.swing.JButton();
        btnFecharRelatorioVenda = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setTitle("Relatório de vendas");

        jLabel1.setText("Data de:");

        jLabel2.setText("Date até:");

        btnGerarRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gerar.png"))); // NOI18N
        btnGerarRelatorioVenda.setText("Gerar");
        btnGerarRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioVendaActionPerformed(evt);
            }
        });

        btnFecharRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharRelatorioVenda.setText("Fechar");
        btnFecharRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharRelatorioVendaActionPerformed(evt);
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
                        .addComponent(btnFecharRelatorioVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGerarRelatorioVenda)))
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
                    .addComponent(btnGerarRelatorioVenda)
                    .addComponent(btnFecharRelatorioVenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioVendaActionPerformed
        this.dispose();

        try {
            // Compila o relatorio
            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/vendas.jrxml"));

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
    }//GEN-LAST:event_btnGerarRelatorioVendaActionPerformed

    private void btnFecharRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharRelatorioVendaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharRelatorioVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFecharRelatorioVenda;
    private javax.swing.JButton btnGerarRelatorioVenda;
    private javax.swing.JFormattedTextField campoDataAte;
    private javax.swing.JFormattedTextField campoDataDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
