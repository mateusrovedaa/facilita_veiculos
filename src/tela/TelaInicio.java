package tela;

import dao.ClienteDao;
import dao.CompraDao;
import dao.MarcaDao;
import dao.ModeloDao;
import dao.ProprietarioDao;
import dao.VeiculoDao;
import dao.VendaDao;
import dao.VersaoDao;
import functions.ConexaoBD;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class TelaInicio extends javax.swing.JFrame {

    int id = 0;

    public TelaInicio() {
        initComponents();
        VeiculoDao veiculoDao = new VeiculoDao();
        VersaoDao versaoDao = new VersaoDao();
        ModeloDao modeloDao = new ModeloDao();
        MarcaDao marcaDao = new MarcaDao();
        ProprietarioDao proprietarioDao = new ProprietarioDao();
        CompraDao compraDao = new CompraDao();
        ClienteDao clienteDao = new ClienteDao();
        VendaDao vendaDao = new VendaDao();
    }

    public TelaInicio(int usuario) {
        initComponents();
        id = usuario;
        VeiculoDao veiculoDao = new VeiculoDao();
        VersaoDao versaoDao = new VersaoDao();
        ModeloDao modeloDao = new ModeloDao();
        MarcaDao marcaDao = new MarcaDao();
        ProprietarioDao proprietarioDao = new ProprietarioDao();
        CompraDao compraDao = new CompraDao();
        ClienteDao clienteDao = new ClienteDao();
        VendaDao vendaDao = new VendaDao();
    }

    public int idUser() {
        return this.id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnCliente1 = new javax.swing.JButton();
        btnVeiculo = new javax.swing.JButton();
        btnCompra = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
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

        btnCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-pessoas.png"))); // NOI18N
        btnCliente.setText("Clientes");
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCliente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnCliente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N
        btnCliente1.setText("Proprietários");
        btnCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCliente1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCliente1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCliente1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliente1ActionPerformed(evt);
            }
        });

        btnVeiculo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-carro.png"))); // NOI18N
        btnVeiculo.setText("Veículos");
        btnVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVeiculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVeiculo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVeiculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeiculoActionPerformed(evt);
            }
        });

        btnCompra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-compra.png"))); // NOI18N
        btnCompra.setText("Compras");
        btnCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });

        btnVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hammer.png"))); // NOI18N
        btnVenda.setText("Vendas");
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCliente1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(731, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo.png"))); // NOI18N
        jMenu3.setText("Cadastros");

        jMenuItem4.setText("Clientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Proprietários");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem3.setText("Marcas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem7.setText("Modelos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Versões");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem1.setText("Gerais");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem9.setText("Veículos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem2.setText("Perfis");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem6.setText("Usuários");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hand.png"))); // NOI18N
        jMenu1.setText("Financeiro");

        jMenuItem10.setText("Compras");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Vendas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/my.png"))); // NOI18N
        jMenu2.setText("Relatórios");

        jMenuItem15.setText("Compras");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem13.setText("Vendas");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem17.setText("Vendas por usuário");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem17);

        jMenuItem12.setText("Veículos situação");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem16.setText("Totais");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
        TelaCadastroCliente cliente = new TelaCadastroCliente();
        jPanel3.add(cliente);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = cliente.getWidth();
        int aIFrame = cliente.getHeight();
        cliente.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        cliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaCadastroGeral geral = new TelaCadastroGeral();
        jPanel3.add(geral);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = geral.getWidth();
        int aIFrame = geral.getHeight();
        geral.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        geral.setVisible(true);
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
        TelaCadastroProprietario proprietario = new TelaCadastroProprietario();
        jPanel3.add(proprietario);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = proprietario.getWidth();
        int aIFrame = proprietario.getHeight();
        proprietario.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        proprietario.setVisible(true);
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
        TelaCadastroVersao versao = new TelaCadastroVersao();
        jPanel3.add(versao);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = versao.getWidth();
        int aIFrame = versao.getHeight();
        versao.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        versao.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        TelaCadastroCompra compra = new TelaCadastroCompra();
        jPanel3.add(compra);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = compra.getWidth();
        int aIFrame = compra.getHeight();
        compra.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        compra.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        TelaCadastroVenda venda = new TelaCadastroVenda(idUser());
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = venda.getWidth();
        int aIFrame = venda.getHeight();
        venda.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        jPanel3.add(venda);
        venda.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        TelaCadastroVeiculo veiculo = new TelaCadastroVeiculo();
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = veiculo.getWidth();
        int aIFrame = veiculo.getHeight();
        veiculo.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        jPanel3.add(veiculo);
        veiculo.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        TelaCadastroCliente cliente = new TelaCadastroCliente();
        jPanel3.add(cliente);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = cliente.getWidth();
        int aIFrame = cliente.getHeight();
        cliente.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        cliente.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        TelaCadastroVenda venda = new TelaCadastroVenda(idUser());
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = venda.getWidth();
        int aIFrame = venda.getHeight();
        venda.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        jPanel3.add(venda);
        venda.setVisible(true);
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeiculoActionPerformed
        TelaCadastroVeiculo veiculo = new TelaCadastroVeiculo();
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = veiculo.getWidth();
        int aIFrame = veiculo.getHeight();
        veiculo.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        jPanel3.add(veiculo);
        veiculo.setVisible(true);
    }//GEN-LAST:event_btnVeiculoActionPerformed

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        TelaCadastroCompra compra = new TelaCadastroCompra();
        jPanel3.add(compra);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = compra.getWidth();
        int aIFrame = compra.getHeight();
        compra.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        compra.setVisible(true);
    }//GEN-LAST:event_btnCompraActionPerformed

    private void btnCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliente1ActionPerformed
        TelaCadastroProprietario proprietario = new TelaCadastroProprietario();
        jPanel3.add(proprietario);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = proprietario.getWidth();
        int aIFrame = proprietario.getHeight();
        proprietario.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        proprietario.setVisible(true);
    }//GEN-LAST:event_btnCliente1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        TelaTotal total = new TelaTotal();
        jPanel3.add(total);
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = total.getWidth();
        int aIFrame = total.getHeight();
        total.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        total.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        RelatorioVenda relatorioVenda = new RelatorioVenda();
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = relatorioVenda.getWidth();
        int aIFrame = relatorioVenda.getHeight();
        relatorioVenda.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        jPanel3.add(relatorioVenda);
        relatorioVenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        RelatorioCompra relatorioCompra = new RelatorioCompra();
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = relatorioCompra.getWidth();
        int aIFrame = relatorioCompra.getHeight();
        relatorioCompra.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        jPanel3.add(relatorioCompra);
        relatorioCompra.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        RelatorioVendaUsuario relatorioVendaUsuario = new RelatorioVendaUsuario();
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = relatorioVendaUsuario.getWidth();
        int aIFrame = relatorioVendaUsuario.getHeight();
        relatorioVendaUsuario.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        jPanel3.add(relatorioVendaUsuario);
        relatorioVendaUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        RelatorioVeiculoSituacao relatorioVeiculoSituacao = new RelatorioVeiculoSituacao();
        int lDesk = jPanel3.getWidth();
        int aDesk = jPanel3.getHeight();
        int lIFrame = relatorioVeiculoSituacao.getWidth();
        int aIFrame = relatorioVeiculoSituacao.getHeight();
        relatorioVeiculoSituacao.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        jPanel3.add(relatorioVeiculoSituacao);
        relatorioVeiculoSituacao.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

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
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnCliente1;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVeiculo;
    private javax.swing.JButton btnVenda;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
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
