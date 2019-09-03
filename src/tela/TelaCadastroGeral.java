package tela;

import dao.DaoGenerico;
import dao.MarcaDao;
import entidade.Marca;
import functions.Funcoes;
import functions.Mensagem;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class TelaCadastroGeral extends javax.swing.JInternalFrame {

    int codigo = 0;

    public TelaCadastroGeral() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abaVeiculo = new javax.swing.JTabbedPane();
        abaAcabamentoInterno = new javax.swing.JTabbedPane();
        PainelAcabamentoInterno = new javax.swing.JPanel();
        abaAdicionarAcabamentoInterno = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNomeAcabamentoInterno = new javax.swing.JTextField();
        btnSalvarAcabamentoInterno = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoFiltroAcabamentoInterno = new javax.swing.JTextField();
        btnLimparBuscaAcabamentoInterno = new javax.swing.JButton();
        btnBuscarAcabamentoInterno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAcabamentoInterno = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnEditarAcabamentoInterno = new javax.swing.JButton();
        btnExcluirAcabamentoInterno = new javax.swing.JButton();
        btnFecharAcabamentoInterno = new javax.swing.JButton();
        PainelCambio = new javax.swing.JPanel();
        abaAdicionarCambio = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        campoNomeCambio = new javax.swing.JTextField();
        btnSalvarCambio = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        campoFiltroCambio = new javax.swing.JTextField();
        btnLimparBuscaCambio = new javax.swing.JButton();
        btnBuscarCambio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCambio = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnEditarCambio = new javax.swing.JButton();
        btnExcluirCambio = new javax.swing.JButton();
        btnFecharCambio = new javax.swing.JButton();
        PainelCarroceria = new javax.swing.JPanel();
        abaAdicionarCarroceria = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        campoNomeCarroceria = new javax.swing.JTextField();
        btnSalvarCarroceria = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        campoFiltroCarroceria = new javax.swing.JTextField();
        btnLimparBuscaCarroceria = new javax.swing.JButton();
        btnBuscarCarroceria = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCarroceria = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        btnEditarCarroceria = new javax.swing.JButton();
        btnExcluirCarroceria = new javax.swing.JButton();
        btnFecharCarroceria = new javax.swing.JButton();
        PainelCombustivel = new javax.swing.JPanel();
        PainelConforto = new javax.swing.JPanel();
        PainelCorExterna = new javax.swing.JPanel();
        PainelCorInterna = new javax.swing.JPanel();
        PainelEstilo = new javax.swing.JPanel();
        PainelExtra = new javax.swing.JPanel();
        PainelSeguranca = new javax.swing.JPanel();
        PainelTecnologia = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        abaPerfil = new javax.swing.JTabbedPane();
        PainelPerfil = new javax.swing.JPanel();

        setTitle("Cadastro gerais");

        abaAcabamentoInterno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAcabamentoInterno.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        PainelAcabamentoInterno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarAcabamentoInterno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarAcabamentoInterno.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nome do acabamento interno:");

        btnSalvarAcabamentoInterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarAcabamentoInterno.setText("Salvar");
        btnSalvarAcabamentoInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAcabamentoInternoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeAcabamentoInterno, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarAcabamentoInterno)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNomeAcabamentoInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarAcabamentoInterno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarAcabamentoInterno.addTab("Cadastrar ou editar acabamento interno", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome do acabamento interno:");

        btnLimparBuscaAcabamentoInterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaAcabamentoInterno.setText("Limpar busca");
        btnLimparBuscaAcabamentoInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaAcabamentoInternoActionPerformed(evt);
            }
        });

        btnBuscarAcabamentoInterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarAcabamentoInterno.setText("Buscar");
        btnBuscarAcabamentoInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAcabamentoInternoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroAcabamentoInterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarAcabamentoInterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaAcabamentoInterno)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoFiltroAcabamentoInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaAcabamentoInterno)
                    .addComponent(btnBuscarAcabamentoInterno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarAcabamentoInterno.addTab("Pesquisar acabamentos internos", jPanel3);

        tblAcabamentoInterno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAcabamentoInterno);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarAcabamentoInterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarAcabamentoInterno.setText("Editar");
        btnEditarAcabamentoInterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarAcabamentoInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAcabamentoInternoActionPerformed(evt);
            }
        });

        btnExcluirAcabamentoInterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirAcabamentoInterno.setText("Excluir");
        btnExcluirAcabamentoInterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirAcabamentoInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAcabamentoInternoActionPerformed(evt);
            }
        });

        btnFecharAcabamentoInterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharAcabamentoInterno.setText("Fechar");
        btnFecharAcabamentoInterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharAcabamentoInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharAcabamentoInternoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarAcabamentoInterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirAcabamentoInterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharAcabamentoInterno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarAcabamentoInterno)
                    .addComponent(btnExcluirAcabamentoInterno)
                    .addComponent(btnFecharAcabamentoInterno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelAcabamentoInternoLayout = new javax.swing.GroupLayout(PainelAcabamentoInterno);
        PainelAcabamentoInterno.setLayout(PainelAcabamentoInternoLayout);
        PainelAcabamentoInternoLayout.setHorizontalGroup(
            PainelAcabamentoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcabamentoInternoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelAcabamentoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionarAcabamentoInterno)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        PainelAcabamentoInternoLayout.setVerticalGroup(
            PainelAcabamentoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcabamentoInternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarAcabamentoInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Acabamentos internos", PainelAcabamentoInterno);

        PainelCambio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarCambio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarCambio.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Nome do câmbio:");

        btnSalvarCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarCambio.setText("Salvar");
        btnSalvarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCambio)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoNomeCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCambio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarCambio.addTab("Cadastrar ou editar câmbio", jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Nome do câmbio:");

        btnLimparBuscaCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaCambio.setText("Limpar busca");
        btnLimparBuscaCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaCambioActionPerformed(evt);
            }
        });

        btnBuscarCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarCambio.setText("Buscar");
        btnBuscarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroCambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaCambio)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoFiltroCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaCambio)
                    .addComponent(btnBuscarCambio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarCambio.addTab("Pesquisar câmbios", jPanel6);

        tblCambio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblCambio);

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarCambio.setText("Editar");
        btnEditarCambio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCambioActionPerformed(evt);
            }
        });

        btnExcluirCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirCambio.setText("Excluir");
        btnExcluirCambio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCambioActionPerformed(evt);
            }
        });

        btnFecharCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharCambio.setText("Fechar");
        btnFecharCambio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarCambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharCambio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCambio)
                    .addComponent(btnExcluirCambio)
                    .addComponent(btnFecharCambio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelCambioLayout = new javax.swing.GroupLayout(PainelCambio);
        PainelCambio.setLayout(PainelCambioLayout);
        PainelCambioLayout.setHorizontalGroup(
            PainelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCambioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionarCambio))
                .addContainerGap())
        );
        PainelCambioLayout.setVerticalGroup(
            PainelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCambioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Câmbios", PainelCambio);

        PainelCarroceria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarCarroceria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarCarroceria.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Nome da carroceria:");

        btnSalvarCarroceria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarCarroceria.setText("Salvar");
        btnSalvarCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCarroceriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeCarroceria, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCarroceria)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoNomeCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCarroceria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarCarroceria.addTab("Cadastrar ou editar carroceria", jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Nome da carroceria:");

        btnLimparBuscaCarroceria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaCarroceria.setText("Limpar busca");
        btnLimparBuscaCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaCarroceriaActionPerformed(evt);
            }
        });

        btnBuscarCarroceria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarCarroceria.setText("Buscar");
        btnBuscarCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCarroceriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroCarroceria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCarroceria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaCarroceria)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoFiltroCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaCarroceria)
                    .addComponent(btnBuscarCarroceria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarCarroceria.addTab("Pesquisar carrocerias", jPanel9);

        tblCarroceria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblCarroceria);

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarCarroceria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarCarroceria.setText("Editar");
        btnEditarCarroceria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCarroceriaActionPerformed(evt);
            }
        });

        btnExcluirCarroceria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirCarroceria.setText("Excluir");
        btnExcluirCarroceria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCarroceriaActionPerformed(evt);
            }
        });

        btnFecharCarroceria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharCarroceria.setText("Fechar");
        btnFecharCarroceria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCarroceriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarCarroceria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCarroceria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharCarroceria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCarroceria)
                    .addComponent(btnExcluirCarroceria)
                    .addComponent(btnFecharCarroceria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelCarroceriaLayout = new javax.swing.GroupLayout(PainelCarroceria);
        PainelCarroceria.setLayout(PainelCarroceriaLayout);
        PainelCarroceriaLayout.setHorizontalGroup(
            PainelCarroceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCarroceriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCarroceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionarCarroceria)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelCarroceriaLayout.setVerticalGroup(
            PainelCarroceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCarroceriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Carrocerias", PainelCarroceria);

        javax.swing.GroupLayout PainelCombustivelLayout = new javax.swing.GroupLayout(PainelCombustivel);
        PainelCombustivel.setLayout(PainelCombustivelLayout);
        PainelCombustivelLayout.setHorizontalGroup(
            PainelCombustivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
        );
        PainelCombustivelLayout.setVerticalGroup(
            PainelCombustivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        abaAcabamentoInterno.addTab("Combustíveis", PainelCombustivel);

        PainelConforto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout PainelConfortoLayout = new javax.swing.GroupLayout(PainelConforto);
        PainelConforto.setLayout(PainelConfortoLayout);
        PainelConfortoLayout.setHorizontalGroup(
            PainelConfortoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 935, Short.MAX_VALUE)
        );
        PainelConfortoLayout.setVerticalGroup(
            PainelConfortoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        abaAcabamentoInterno.addTab("Confortos", PainelConforto);

        javax.swing.GroupLayout PainelCorExternaLayout = new javax.swing.GroupLayout(PainelCorExterna);
        PainelCorExterna.setLayout(PainelCorExternaLayout);
        PainelCorExternaLayout.setHorizontalGroup(
            PainelCorExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
        );
        PainelCorExternaLayout.setVerticalGroup(
            PainelCorExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        abaAcabamentoInterno.addTab("Cores externas", PainelCorExterna);

        javax.swing.GroupLayout PainelCorInternaLayout = new javax.swing.GroupLayout(PainelCorInterna);
        PainelCorInterna.setLayout(PainelCorInternaLayout);
        PainelCorInternaLayout.setHorizontalGroup(
            PainelCorInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
        );
        PainelCorInternaLayout.setVerticalGroup(
            PainelCorInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        abaAcabamentoInterno.addTab("Cores internas", PainelCorInterna);

        javax.swing.GroupLayout PainelEstiloLayout = new javax.swing.GroupLayout(PainelEstilo);
        PainelEstilo.setLayout(PainelEstiloLayout);
        PainelEstiloLayout.setHorizontalGroup(
            PainelEstiloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
        );
        PainelEstiloLayout.setVerticalGroup(
            PainelEstiloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        abaAcabamentoInterno.addTab("Estilos", PainelEstilo);

        javax.swing.GroupLayout PainelExtraLayout = new javax.swing.GroupLayout(PainelExtra);
        PainelExtra.setLayout(PainelExtraLayout);
        PainelExtraLayout.setHorizontalGroup(
            PainelExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
        );
        PainelExtraLayout.setVerticalGroup(
            PainelExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        abaAcabamentoInterno.addTab("Extras", PainelExtra);

        javax.swing.GroupLayout PainelSegurancaLayout = new javax.swing.GroupLayout(PainelSeguranca);
        PainelSeguranca.setLayout(PainelSegurancaLayout);
        PainelSegurancaLayout.setHorizontalGroup(
            PainelSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
        );
        PainelSegurancaLayout.setVerticalGroup(
            PainelSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        abaAcabamentoInterno.addTab("Seguranças", PainelSeguranca);

        javax.swing.GroupLayout PainelTecnologiaLayout = new javax.swing.GroupLayout(PainelTecnologia);
        PainelTecnologia.setLayout(PainelTecnologiaLayout);
        PainelTecnologiaLayout.setHorizontalGroup(
            PainelTecnologiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
        );
        PainelTecnologiaLayout.setVerticalGroup(
            PainelTecnologiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        abaAcabamentoInterno.addTab("Tecnologias", PainelTecnologia);

        abaVeiculo.addTab("Veículos", abaAcabamentoInterno);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        abaPerfil.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout PainelPerfilLayout = new javax.swing.GroupLayout(PainelPerfil);
        PainelPerfil.setLayout(PainelPerfilLayout);
        PainelPerfilLayout.setHorizontalGroup(
            PainelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 999, Short.MAX_VALUE)
        );
        PainelPerfilLayout.setVerticalGroup(
            PainelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        abaPerfil.addTab("Perfis", PainelPerfil);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaPerfil)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaPerfil)
                .addContainerGap())
        );

        abaVeiculo.addTab("Pessoal", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaVeiculo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaVeiculo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarAcabamentoInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAcabamentoInternoActionPerformed

        
    }//GEN-LAST:event_btnSalvarAcabamentoInternoActionPerformed

    private void btnLimparBuscaAcabamentoInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaAcabamentoInternoActionPerformed
        
    }//GEN-LAST:event_btnLimparBuscaAcabamentoInternoActionPerformed

    private void btnBuscarAcabamentoInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAcabamentoInternoActionPerformed
       
    }//GEN-LAST:event_btnBuscarAcabamentoInternoActionPerformed

    private void btnEditarAcabamentoInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAcabamentoInternoActionPerformed
        
    }//GEN-LAST:event_btnEditarAcabamentoInternoActionPerformed

    private void btnExcluirAcabamentoInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAcabamentoInternoActionPerformed
        
    }//GEN-LAST:event_btnExcluirAcabamentoInternoActionPerformed

    private void btnFecharAcabamentoInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharAcabamentoInternoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharAcabamentoInternoActionPerformed

    private void btnSalvarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarCambioActionPerformed

    private void btnLimparBuscaCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaCambioActionPerformed

    private void btnBuscarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCambioActionPerformed

    private void btnEditarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCambioActionPerformed

    private void btnExcluirCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirCambioActionPerformed

    private void btnFecharCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharCambioActionPerformed

    private void btnSalvarCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCarroceriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarCarroceriaActionPerformed

    private void btnLimparBuscaCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaCarroceriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaCarroceriaActionPerformed

    private void btnBuscarCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCarroceriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCarroceriaActionPerformed

    private void btnEditarCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCarroceriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCarroceriaActionPerformed

    private void btnExcluirCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCarroceriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirCarroceriaActionPerformed

    private void btnFecharCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCarroceriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharCarroceriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAcabamentoInterno;
    private javax.swing.JPanel PainelCambio;
    private javax.swing.JPanel PainelCarroceria;
    private javax.swing.JPanel PainelCombustivel;
    private javax.swing.JPanel PainelConforto;
    private javax.swing.JPanel PainelCorExterna;
    private javax.swing.JPanel PainelCorInterna;
    private javax.swing.JPanel PainelEstilo;
    private javax.swing.JPanel PainelExtra;
    private javax.swing.JPanel PainelPerfil;
    private javax.swing.JPanel PainelSeguranca;
    private javax.swing.JPanel PainelTecnologia;
    private javax.swing.JTabbedPane abaAcabamentoInterno;
    private javax.swing.JTabbedPane abaAdicionarAcabamentoInterno;
    private javax.swing.JTabbedPane abaAdicionarCambio;
    private javax.swing.JTabbedPane abaAdicionarCarroceria;
    private javax.swing.JTabbedPane abaPerfil;
    private javax.swing.JTabbedPane abaVeiculo;
    private javax.swing.JButton btnBuscarAcabamentoInterno;
    private javax.swing.JButton btnBuscarCambio;
    private javax.swing.JButton btnBuscarCarroceria;
    private javax.swing.JButton btnEditarAcabamentoInterno;
    private javax.swing.JButton btnEditarCambio;
    private javax.swing.JButton btnEditarCarroceria;
    private javax.swing.JButton btnExcluirAcabamentoInterno;
    private javax.swing.JButton btnExcluirCambio;
    private javax.swing.JButton btnExcluirCarroceria;
    private javax.swing.JButton btnFecharAcabamentoInterno;
    private javax.swing.JButton btnFecharCambio;
    private javax.swing.JButton btnFecharCarroceria;
    private javax.swing.JButton btnLimparBuscaAcabamentoInterno;
    private javax.swing.JButton btnLimparBuscaCambio;
    private javax.swing.JButton btnLimparBuscaCarroceria;
    private javax.swing.JButton btnSalvarAcabamentoInterno;
    private javax.swing.JButton btnSalvarCambio;
    private javax.swing.JButton btnSalvarCarroceria;
    private javax.swing.JTextField campoFiltroAcabamentoInterno;
    private javax.swing.JTextField campoFiltroCambio;
    private javax.swing.JTextField campoFiltroCarroceria;
    private javax.swing.JTextField campoNomeAcabamentoInterno;
    private javax.swing.JTextField campoNomeCambio;
    private javax.swing.JTextField campoNomeCarroceria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAcabamentoInterno;
    private javax.swing.JTable tblCambio;
    private javax.swing.JTable tblCarroceria;
    // End of variables declaration//GEN-END:variables
}
