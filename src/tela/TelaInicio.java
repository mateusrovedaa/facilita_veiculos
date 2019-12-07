package tela;

import dao.PermissaoDao;
import dao.UsuarioDao;
import functions.GerenciarJanelas;
import functions.Mensagem;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

public class TelaInicio extends javax.swing.JFrame {

    int id = 0;
    GerenciarJanelas gerenciarJanelas;
    PermissaoDao peDAO = new PermissaoDao();

    public TelaInicio() {
        initComponents();
        this.gerenciarJanelas = new GerenciarJanelas(dktInicial);
        setIcon();
    }

    public TelaInicio(int usuario) {
        initComponents();
        id = usuario;
        PermissaoDao.idUser = idUser();
        this.gerenciarJanelas = new GerenciarJanelas(dktInicial);
        verificarPermissoes();
        new UsuarioDao().listarAniversariantes(tblAniversariantes);
        setIcon();
    }

    public JDesktopPane JDesktopPane() {
        return this.dktInicial;
    }

    public int idUser() {
        return this.id;
    }

    private void verificarPermissoes() {
        if (!peDAO.consultarPermissao("Acessar", "versao")) {
            btnCVersao.setEnabled(false);
        } else {
            btnCVersao.setEnabled(true);
        }
        if (!peDAO.consultarPermissao("Acessar", "usuario")) {
            btnCUsuario.setEnabled(false);
        } else {
            btnCUsuario.setEnabled(true);
        }
        if (!peDAO.consultarPermissao("Acessar", "cliente")) {
            btnCCliente.setEnabled(false);
            btnAtalhoCCliente.setEnabled(false);
        } else {
            btnCCliente.setEnabled(true);
            btnAtalhoCCliente.setEnabled(true);
        }
        if (!peDAO.consultarPermissao("Acessar", "proprietario")) {
            btnCProprietario.setEnabled(false);
            btnAtalhoCProprietario.setEnabled(false);
        } else {
            btnCProprietario.setEnabled(true);
            btnAtalhoCProprietario.setEnabled(true);
        }
        if (!peDAO.consultarPermissao("Acessar", "geralacab")) {
            btnCGeral.setEnabled(false);
        } else {
            btnCGeral.setEnabled(true);
        }
        if (!peDAO.consultarPermissao("Acessar", "empvistoria")) {
            btnCEmpresaVistoria.setEnabled(false);
        } else {
            btnCEmpresaVistoria.setEnabled(true);
        }
        if (!peDAO.consultarPermissao("Acessar", "marca")) {
            btnCMarca.setEnabled(false);
        } else {
            btnCMarca.setEnabled(true);
        }
        if (!peDAO.consultarPermissao("Acessar", "modelo")) {
            btnCModelo.setEnabled(false);
        } else {
            btnCModelo.setEnabled(true);
        }
        if (!peDAO.consultarPermissao("Acessar", "veiculoinfo")) {
            btnCVeiculo.setEnabled(false);
            btnAtalhoCVeiculo.setEnabled(false);
        } else {
            btnCVeiculo.setEnabled(true);
            btnAtalhoCVeiculo.setEnabled(true);
        }
        if (!peDAO.consultarPermissao("Acessar", "compra")) {
            btnCCompra.setEnabled(false);
            btnAtalhoCCompra.setEnabled(false);
        } else {
            btnCCompra.setEnabled(true);
            btnAtalhoCCompra.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dktInicial = new javax.swing.JDesktopPane();
        btnAtalhoCCliente = new javax.swing.JButton();
        btnAtalhoCProprietario = new javax.swing.JButton();
        btnAtalhoCVeiculo = new javax.swing.JButton();
        btnAtalhoCCompra = new javax.swing.JButton();
        btnAtalhoCVenda = new javax.swing.JButton();
        btnAtalhoCSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAniversariantes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
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
        btnCCompra = new javax.swing.JMenuItem();
        btnCVenda = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facilita Veículos");

        dktInicial.setForeground(new java.awt.Color(60, 63, 65));

        btnAtalhoCCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtalhoCCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/network1.png"))); // NOI18N
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
        btnAtalhoCProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team (1).png"))); // NOI18N
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
        btnAtalhoCVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ExecutiveCar_Black_icon-icons.com_549041.png"))); // NOI18N
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

        btnAtalhoCCompra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtalhoCCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payment-method.png"))); // NOI18N
        btnAtalhoCCompra.setText("Compras");
        btnAtalhoCCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtalhoCCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtalhoCCompra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoCCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoCCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtalhoCCompraActionPerformed(evt);
            }
        });

        btnAtalhoCVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtalhoCVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carsell.png"))); // NOI18N
        btnAtalhoCVenda.setText("Vendas");
        btnAtalhoCVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtalhoCVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtalhoCVenda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoCVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoCVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtalhoCVendaActionPerformed(evt);
            }
        });

        btnAtalhoCSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtalhoCSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/power-off.png"))); // NOI18N
        btnAtalhoCSair.setText("Sair");
        btnAtalhoCSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtalhoCSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtalhoCSair.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoCSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoCSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtalhoCSairActionPerformed(evt);
            }
        });

        tblAniversariantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAniversariantes);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aniversariantes do mês");
        jLabel1.setToolTipText("");

        dktInicial.setLayer(btnAtalhoCCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dktInicial.setLayer(btnAtalhoCProprietario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dktInicial.setLayer(btnAtalhoCVeiculo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dktInicial.setLayer(btnAtalhoCCompra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dktInicial.setLayer(btnAtalhoCVenda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dktInicial.setLayer(btnAtalhoCSair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dktInicial.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dktInicial.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dktInicialLayout = new javax.swing.GroupLayout(dktInicial);
        dktInicial.setLayout(dktInicialLayout);
        dktInicialLayout.setHorizontalGroup(
            dktInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dktInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dktInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAtalhoCSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtalhoCVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtalhoCCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtalhoCVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtalhoCProprietario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtalhoCCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(dktInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dktInicialLayout.setVerticalGroup(
            dktInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dktInicialLayout.createSequentialGroup()
                .addGroup(dktInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dktInicialLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dktInicialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtalhoCCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtalhoCProprietario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtalhoCVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtalhoCCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtalhoCVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtalhoCSair)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-property-16.png"))); // NOI18N
        jMenu1.setText("Cadastros");
        jMenu1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenu1StateChanged(evt);
            }
        });

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

        btnCCompra.setText("Compras");
        btnCCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCompraActionPerformed(evt);
            }
        });
        jMenu2.add(btnCCompra);

        btnCVenda.setText("Vendas");
        btnCVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCVendaActionPerformed(evt);
            }
        });
        jMenu2.add(btnCVenda);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-gráfico-combinado-16.png"))); // NOI18N
        jMenu3.setText("Gráficos");

        jMenuItem1.setText("Gráfico 1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

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

    private void btnCMarcaActionPerformed(java.awt.event.ActionEvent evt) {
        gerenciarJanelas.abreJanela(TelaCadastroMarca.getInstancia());
    }

    private void btnCGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCGeraisActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroGeral.getInstancia());
    }//GEN-LAST:event_btnCGeraisActionPerformed

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
        gerenciarJanelas.abreJanela(TelaCadastroVeiculo_OLD.getInstancia());
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

    private void jMenu1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenu1StateChanged
        verificarPermissoes();
    }//GEN-LAST:event_jMenu1StateChanged

    private void btnAtalhoCCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoCCompraActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroCompra.getInstancia());
    }//GEN-LAST:event_btnAtalhoCCompraActionPerformed

    private void btnAtalhoCVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoCVendaActionPerformed
        //gerenciarJanelas.abreJanela(TelaCadastroVenda.getInstancia());
        TelaCadastroVenda venda = new TelaCadastroVenda(idUser());
        int lDesk = dktInicial.getWidth();
        int aDesk = dktInicial.getHeight();
        int lIFrame = venda.getWidth();
        int aIFrame = venda.getHeight();
        venda.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        dktInicial.add(venda);
        venda.setVisible(true);
    }//GEN-LAST:event_btnAtalhoCVendaActionPerformed

    private void btnAtalhoCSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoCSairActionPerformed
        int sair = Mensagem.confirmacao("Deseja sair do sistema?", this);
        if (sair == 0) {
            System.exit(0);
        }

        //this.dispose();
    }//GEN-LAST:event_btnAtalhoCSairActionPerformed

    private void btnCCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCompraActionPerformed
        gerenciarJanelas.abreJanela(TelaCadastroCompra.getInstancia());
    }//GEN-LAST:event_btnCCompraActionPerformed

    private void btnCVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCVendaActionPerformed
        //gerenciarJanelas.abreJanela(TelaCadastroVenda.getInstancia());
        TelaCadastroVenda venda = new TelaCadastroVenda(idUser());
        int lDesk = dktInicial.getWidth();
        int aDesk = dktInicial.getHeight();
        int lIFrame = venda.getWidth();
        int aIFrame = venda.getHeight();
        venda.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        dktInicial.add(venda);
        venda.setVisible(true);
    }//GEN-LAST:event_btnCVendaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        gerenciarJanelas.abreJanela(TelaGrafico.getInstancia());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnAtalhoCCompra;
    private javax.swing.JButton btnAtalhoCProprietario;
    private javax.swing.JButton btnAtalhoCSair;
    private javax.swing.JButton btnAtalhoCVeiculo;
    private javax.swing.JButton btnAtalhoCVenda;
    private javax.swing.JMenuItem btnCCliente;
    private javax.swing.JMenuItem btnCCompra;
    private javax.swing.JMenuItem btnCEmpresaVistoria;
    private javax.swing.JMenuItem btnCGeral;
    private javax.swing.JMenuItem btnCMarca;
    private javax.swing.JMenuItem btnCModelo;
    private javax.swing.JMenuItem btnCProprietario;
    private javax.swing.JMenuItem btnCUsuario;
    private javax.swing.JMenuItem btnCVeiculo;
    private javax.swing.JMenuItem btnCVenda;
    private javax.swing.JMenuItem btnCVersao;
    private javax.swing.JDesktopPane dktInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAniversariantes;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../images/Car-32.png")));
    }
}
