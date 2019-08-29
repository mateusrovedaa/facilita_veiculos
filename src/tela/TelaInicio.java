package tela;

//import dao.MarcaDao;
//import dao.ModeloDao;

public class TelaInicio extends javax.swing.JFrame {

    int id = 0;

    public TelaInicio() {
        initComponents();
//        ModeloDao modeloDao = new ModeloDao();
//        MarcaDao marcaDao = new MarcaDao();
    }

    public TelaInicio(int usuario) {
        initComponents();
        id = usuario;
//        ModeloDao modeloDao = new ModeloDao();
//        MarcaDao marcaDao = new MarcaDao();
    }

    public int idUser() {
        return this.id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel3 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facilita Veículos");

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(731, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(btnSair)
                .addContainerGap())
        );

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo.png"))); // NOI18N
        jMenu3.setText("Cadastros");

        jMenuItem4.setText("Clientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Proprietários");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem3.setText("Marcas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem7.setText("Modelos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Versões");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem1.setText("Gerais");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem9.setText("Veículos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem2.setText("Perfis");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem6.setText("Usuários");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem14.setText("Procedências");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hand.png"))); // NOI18N
        jMenu1.setText("Financeiro");

        jMenuItem10.setText("Compras");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Vendas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/my.png"))); // NOI18N
        jMenu2.setText("Relatórios");

        jMenuItem15.setText("Compras");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem13.setText("Vendas");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem17.setText("Vendas por usuário");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem17);

        jMenuItem12.setText("Veículos situação");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem16.setText("Totais");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaCadastroMarca marca = new TelaCadastroMarca();
        jPanel3.add(marca);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = marca.getWidth();
        int aIFrame = marca.getHeight();
        marca.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        marca.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaCadastroPerfil perfil = new TelaCadastroPerfil();
        jPanel3.add(perfil);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = perfil.getWidth();
        int aIFrame = perfil.getHeight();
        perfil.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        perfil.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        TelaCadastroUsuario usuario = new TelaCadastroUsuario();
        jPanel3.add(usuario);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = usuario.getWidth();
        int aIFrame = usuario.getHeight();
        usuario.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        usuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        TelaCadastroModelo modelo = new TelaCadastroModelo();
        jPanel3.add(modelo);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = modelo.getWidth();
        int aIFrame = modelo.getHeight();
        modelo.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        modelo.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed

    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed

    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed

    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed

    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed

    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed

    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem14ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem14ActionPerformed
        TelaCadastroProcedencia procedencia = new TelaCadastroProcedencia();
        jPanel3.add(procedencia);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = procedencia.getWidth();
        int aIFrame = procedencia.getHeight();
        procedencia.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        procedencia.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
