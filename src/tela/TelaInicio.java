package tela;

import dao.MarcaDao;
import functions.GerenciarJanelas;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

public class TelaInicio extends javax.swing.JFrame {

    int id = 0;
    GerenciarJanelas gerenciarJanelas;

    public TelaInicio() {
        initComponents();
        this.gerenciarJanelas = new GerenciarJanelas(dktInicial);
        setIcon();
    }

    public TelaInicio(int usuario) {
        initComponents();
        id = usuario;
        this.gerenciarJanelas = new GerenciarJanelas(dktInicial);
        setIcon();
    }

    public JDesktopPane JDesktopPane() {
        return this.dktInicial;
    }

    public int idUser() {
        return this.id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dktInicial = new javax.swing.JDesktopPane();
        btnAtalhoCCliente = new javax.swing.JButton();
        btnAtalhoCProprietario = new javax.swing.JButton();
        btnAtalhoCVeiculo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCUsuario = new javax.swing.JMenuItem();
        btnCCliente = new javax.swing.JMenuItem();
        btnCProprietario = new javax.swing.JMenuItem();
        btnCGeral = new javax.swing.JMenuItem();
        btnCEmpresaVistoria = new javax.swing.JMenuItem();
        btnCMarca = new javax.swing.JMenuItem();
        btnCModelo = new javax.swing.JMenuItem();
        btnCVersao = new javax.swing.JMenuItem();
        btnCVeiculo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facilita Veículos");

        dktInicial.setForeground(new java.awt.Color(60, 63, 65));

        btnAtalhoCCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtalhoCCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/network.png"))); // NOI18N
        btnAtalhoCCliente.setText("Clientes");
        btnAtalhoCCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtalhoCCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtalhoCCliente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoCCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoCCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtalhoCClienteActionPerformed(evt);
            }
        });

        btnAtalhoCProprietario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtalhoCProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team.png"))); // NOI18N
        btnAtalhoCProprietario.setText("Proprietários");
        btnAtalhoCProprietario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtalhoCProprietario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtalhoCProprietario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoCProprietario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoCProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtalhoCProprietarioActionPerformed(evt);
            }
        });

        btnAtalhoCVeiculo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtalhoCVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ExecutiveCar_Black_icon-icons.com_54904.png"))); // NOI18N
        btnAtalhoCVeiculo.setText("Veículos");
        btnAtalhoCVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtalhoCVeiculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtalhoCVeiculo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoCVeiculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoCVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtalhoCVeiculoActionPerformed(evt);
            }
        });

        dktInicial.setLayer(btnAtalhoCCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dktInicial.setLayer(btnAtalhoCProprietario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dktInicial.setLayer(btnAtalhoCVeiculo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dktInicialLayout = new javax.swing.GroupLayout(dktInicial);
        dktInicial.setLayout(dktInicialLayout);
        dktInicialLayout.setHorizontalGroup(
            dktInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dktInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dktInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAtalhoCVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(dktInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAtalhoCProprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtalhoCCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(486, Short.MAX_VALUE))
        );
        dktInicialLayout.setVerticalGroup(
            dktInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dktInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtalhoCCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtalhoCProprietario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtalhoCVeiculo)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-property-16.png"))); // NOI18N
        jMenu1.setText("Cadastros");

        btnCUsuario.setText("Usuários");
        btnCUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(btnCUsuario);

        btnCCliente.setText("Clientes");
        btnCCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCClienteActionPerformed(evt);
            }
        });
        jMenu1.add(btnCCliente);

        btnCProprietario.setText("Proprietários");
        btnCProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCProprietarioActionPerformed(evt);
            }
        });
        jMenu1.add(btnCProprietario);

        btnCGeral.setText("Gerais");
        btnCGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCGeralActionPerformed(evt);
            }
        });
        jMenu1.add(btnCGeral);

        btnCEmpresaVistoria.setText("Empresas de vistorias");
        btnCEmpresaVistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEmpresaVistoriaActionPerformed(evt);
            }
        });
        jMenu1.add(btnCEmpresaVistoria);

        btnCMarca.setText("Marcas");
        btnCMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCMarcaActionPerformed(evt);
            }
        });
        jMenu1.add(btnCMarca);

        btnCModelo.setText("Modelos");
        btnCModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCModeloActionPerformed(evt);
            }
        });
        jMenu1.add(btnCModelo);

        btnCVersao.setText("Versões");
        btnCVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCVersaoActionPerformed(evt);
            }
        });
        jMenu1.add(btnCVersao);

        btnCVeiculo.setText("Veículos");
        btnCVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCVeiculoActionPerformed(evt);
            }
        });
        jMenu1.add(btnCVeiculo);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-money-16.png"))); // NOI18N
        jMenu2.setText("Financeiro");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dktInicial)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dktInicial)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCUsuarioActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroUsuario.getInstancia());
    }//GEN-LAST:event_btnCUsuarioActionPerformed

    private void btnCVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCVersaoActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroVersao.getInstancia());
    }//GEN-LAST:event_btnCVersaoActionPerformed

    private void btnCMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCMarcaActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroMarca.getInstancia());
        //Funcoes.controlaIframes(TelaCadastroMarca.getInstancia(), dktGeral);
//        jPanel1.add(marca);
//        int lDesk = jPanel1.getWidth();
//        int aDesk = jPanel1.getHeight();
//        int lIFrame = marca.getWidth();
//        int aIFrame = marca.getHeight();
//        marca.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
//        marca.setVisible(true);
    }//GEN-LAST:event_btnCMarcaActionPerformed

    private void btnCModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCModeloActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroModelo.getInstancia());
    }//GEN-LAST:event_btnCModeloActionPerformed

    private void btnCGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCGeralActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroGeral.getInstancia());
    }//GEN-LAST:event_btnCGeralActionPerformed

    private void btnCClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCClienteActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroCliente.getInstancia());
    }//GEN-LAST:event_btnCClienteActionPerformed

    private void btnCProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCProprietarioActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroProprietario.getInstancia());
    }//GEN-LAST:event_btnCProprietarioActionPerformed

    private void btnCEmpresaVistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEmpresaVistoriaActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroEmpresaVistoria.getInstancia());
    }//GEN-LAST:event_btnCEmpresaVistoriaActionPerformed

    private void btnCVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCVeiculoActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroVeiculo.getInstancia());
    }//GEN-LAST:event_btnCVeiculoActionPerformed

    private void btnAtalhoCProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoCProprietarioActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroProprietario.getInstancia());
    }//GEN-LAST:event_btnAtalhoCProprietarioActionPerformed

    private void btnAtalhoCClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoCClienteActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroCliente.getInstancia());
    }//GEN-LAST:event_btnAtalhoCClienteActionPerformed

    private void btnAtalhoCVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoCVeiculoActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroVeiculo.getInstancia());
    }//GEN-LAST:event_btnAtalhoCVeiculoActionPerformed

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
    private javax.swing.JButton btnAtalhoCCliente;
    private javax.swing.JButton btnAtalhoCProprietario;
    private javax.swing.JButton btnAtalhoCVeiculo;
    private javax.swing.JMenuItem btnCCliente;
    private javax.swing.JMenuItem btnCEmpresaVistoria;
    private javax.swing.JMenuItem btnCGeral;
    private javax.swing.JMenuItem btnCMarca;
    private javax.swing.JMenuItem btnCModelo;
    private javax.swing.JMenuItem btnCProprietario;
    private javax.swing.JMenuItem btnCUsuario;
    private javax.swing.JMenuItem btnCVeiculo;
    private javax.swing.JMenuItem btnCVersao;
    private javax.swing.JDesktopPane dktInicial;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../images/Car-32.png")));
    }
}
