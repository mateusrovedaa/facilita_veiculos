package tela;

import dao.DaoGenerico;
import dao.MarcaDao;
import entidade.Marca;
import functions.Funcoes;
import functions.GerenciarJanelas;
import functions.Mensagem;
import java.util.Calendar;

public class TelaCadastroGeral extends javax.swing.JInternalFrame {

    int codigo = 0;
    private static TelaCadastroGeral tela;

    public TelaCadastroGeral() {
        initComponents();
    }

    public static TelaCadastroGeral getInstancia() {
        if (tela == null) {
            tela = new TelaCadastroGeral();
        }
        return tela;
    }

    private void funcaoFechar() {
        GerenciarJanelas.fecharJanela(tela);
        tela = null;
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
        abaAdicionarCombustivel = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        campoNomeCombustivel = new javax.swing.JTextField();
        btnSalvarCombustivel = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        campoFiltroCombustivel = new javax.swing.JTextField();
        btnLimparBuscaCombustivel = new javax.swing.JButton();
        btnBuscarCombustivel = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCombustivel = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        btnEditarCombustivel = new javax.swing.JButton();
        btnExcluirCombustivel = new javax.swing.JButton();
        btnFecharCombustivel = new javax.swing.JButton();
        PainelConforto = new javax.swing.JPanel();
        abaAdicionarConforto = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        campoNomeConforto = new javax.swing.JTextField();
        btnSalvarConforto = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        campoFiltroConforto = new javax.swing.JTextField();
        btnLimparBuscaConforto = new javax.swing.JButton();
        btnBuscarConforto = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblConforto = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        btnEditarConforto = new javax.swing.JButton();
        btnExcluirConforto = new javax.swing.JButton();
        btnFecharConforto = new javax.swing.JButton();
        PainelCorExterna = new javax.swing.JPanel();
        abaAdicionarCorExterna = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        campoNomeCorExterna = new javax.swing.JTextField();
        btnSalvarCorExterna = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        campoFiltroCorExterna = new javax.swing.JTextField();
        btnLimparBuscaCorExterna = new javax.swing.JButton();
        btnBuscarCorExterna = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCorExterna = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        btnEditarCorExterna = new javax.swing.JButton();
        btnExcluirCorExterna = new javax.swing.JButton();
        btnFecharCorExterna = new javax.swing.JButton();
        PainelCorInterna = new javax.swing.JPanel();
        abaAdicionarCorInterna = new javax.swing.JTabbedPane();
        jPanel20 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        campoNomeCorInterna = new javax.swing.JTextField();
        btnSalvarCorInterna = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        campoFiltroCorInterna = new javax.swing.JTextField();
        btnLimparBuscaCorInterna = new javax.swing.JButton();
        btnBuscarCorInterna = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblCorInterna = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        btnEditarCorInterna = new javax.swing.JButton();
        btnExcluirCorInterna = new javax.swing.JButton();
        btnFecharCorInterna = new javax.swing.JButton();
        PainelEstilo = new javax.swing.JPanel();
        abaAdicionarEstilo = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        campoNomeEstilo = new javax.swing.JTextField();
        btnSalvarEstilo = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        campoFiltroEstilo = new javax.swing.JTextField();
        btnLimparBuscaEstilo = new javax.swing.JButton();
        btnBuscarEstilo = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblEstilo = new javax.swing.JTable();
        jPanel25 = new javax.swing.JPanel();
        btnEditarEstilo = new javax.swing.JButton();
        btnExcluirEstilo = new javax.swing.JButton();
        btnFecharEstilo = new javax.swing.JButton();
        PainelExtra = new javax.swing.JPanel();
        abaAdicionarExtra = new javax.swing.JTabbedPane();
        jPanel26 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        campoNomeExtra = new javax.swing.JTextField();
        btnSalvarExtra = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        campoFiltroExtra = new javax.swing.JTextField();
        btnLimparBuscaExtra = new javax.swing.JButton();
        btnBuscarExtra = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblExtra = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        btnEditarExtra = new javax.swing.JButton();
        btnExcluirExtra = new javax.swing.JButton();
        btnFecharExtra = new javax.swing.JButton();
        PainelSeguranca = new javax.swing.JPanel();
        abaAdicionarSeguranca = new javax.swing.JTabbedPane();
        jPanel29 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        campoNomeSeguranca = new javax.swing.JTextField();
        btnSalvarSeguranca = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        campoFiltroSeguranca = new javax.swing.JTextField();
        btnLimparBuscaSeguranca = new javax.swing.JButton();
        btnBuscarSeguranca = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblSeguranca = new javax.swing.JTable();
        jPanel31 = new javax.swing.JPanel();
        btnEditarSeguranca = new javax.swing.JButton();
        btnExcluirSeguranca = new javax.swing.JButton();
        btnFecharSeguranca = new javax.swing.JButton();
        PainelTecnologia = new javax.swing.JPanel();
        abaAdicionarTecnologia = new javax.swing.JTabbedPane();
        jPanel32 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        campoNomeTecnologia = new javax.swing.JTextField();
        btnSalvarTecnologia = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        campoFiltroTecnologia = new javax.swing.JTextField();
        btnLimparBuscaTecnologia = new javax.swing.JButton();
        btnBuscarTecnologia = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblTecnologia = new javax.swing.JTable();
        jPanel34 = new javax.swing.JPanel();
        btnEditarTecnologia = new javax.swing.JButton();
        btnExcluirTecnologia = new javax.swing.JButton();
        btnFecharTecnologia = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        abaPerfil = new javax.swing.JTabbedPane();
        PainelCidade = new javax.swing.JPanel();
        abaAdicionarCidade = new javax.swing.JTabbedPane();
        jPanel41 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        campoNomeCidade = new javax.swing.JTextField();
        btnSalvarCidade = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        campoFiltroCidade = new javax.swing.JTextField();
        btnLimparBuscaCidade = new javax.swing.JButton();
        btnBuscarCidade = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblCidade = new javax.swing.JTable();
        jPanel43 = new javax.swing.JPanel();
        btnEditarCidade = new javax.swing.JButton();
        btnExcluirCidade = new javax.swing.JButton();
        btnFecharCidade = new javax.swing.JButton();
        PainelEstado = new javax.swing.JPanel();
        abaAdicionarEstado = new javax.swing.JTabbedPane();
        jPanel38 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        campoNomeEstado = new javax.swing.JTextField();
        btnSalvarEstado = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        campoFiltroEstado = new javax.swing.JTextField();
        btnLimparBuscaEstado = new javax.swing.JButton();
        btnBuscarEstado = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblEstado = new javax.swing.JTable();
        jPanel40 = new javax.swing.JPanel();
        btnEditarEstado = new javax.swing.JButton();
        btnExcluirEstado = new javax.swing.JButton();
        btnFecharEstado = new javax.swing.JButton();
        PainelPerfil = new javax.swing.JPanel();
        abaAdicionarPerfil = new javax.swing.JTabbedPane();
        jPanel35 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        campoNomePerfil = new javax.swing.JTextField();
        btnSalvarPerfil = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        campoFiltroPerfil = new javax.swing.JTextField();
        btnLimparBuscaPerfil = new javax.swing.JButton();
        btnBuscarPerfil = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblPerfil = new javax.swing.JTable();
        jPanel37 = new javax.swing.JPanel();
        btnEditarPerfil = new javax.swing.JButton();
        btnExcluirPerfil = new javax.swing.JButton();
        btnFecharPerfil = new javax.swing.JButton();

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Carrocerias", PainelCarroceria);

        PainelCombustivel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarCombustivel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarCombustivel.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Nome do combustível:");

        btnSalvarCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarCombustivel.setText("Salvar");
        btnSalvarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCombustivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeCombustivel, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCombustivel)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoNomeCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCombustivel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarCombustivel.addTab("Cadastrar ou editar combustível", jPanel11);

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Nome do combustível:");

        btnLimparBuscaCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaCombustivel.setText("Limpar busca");
        btnLimparBuscaCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaCombustivelActionPerformed(evt);
            }
        });

        btnBuscarCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarCombustivel.setText("Buscar");
        btnBuscarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCombustivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroCombustivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCombustivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaCombustivel)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoFiltroCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaCombustivel)
                    .addComponent(btnBuscarCombustivel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarCombustivel.addTab("Pesquisar combustíveis", jPanel12);

        tblCombustivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblCombustivel);

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarCombustivel.setText("Editar");
        btnEditarCombustivel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCombustivelActionPerformed(evt);
            }
        });

        btnExcluirCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirCombustivel.setText("Excluir");
        btnExcluirCombustivel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCombustivelActionPerformed(evt);
            }
        });

        btnFecharCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharCombustivel.setText("Fechar");
        btnFecharCombustivel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCombustivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarCombustivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCombustivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharCombustivel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCombustivel)
                    .addComponent(btnExcluirCombustivel)
                    .addComponent(btnFecharCombustivel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelCombustivelLayout = new javax.swing.GroupLayout(PainelCombustivel);
        PainelCombustivel.setLayout(PainelCombustivelLayout);
        PainelCombustivelLayout.setHorizontalGroup(
            PainelCombustivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCombustivelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCombustivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionarCombustivel)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelCombustivelLayout.setVerticalGroup(
            PainelCombustivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCombustivelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Combustíveis", PainelCombustivel);

        PainelConforto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarConforto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarConforto.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Nome do conforto:");

        btnSalvarConforto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarConforto.setText("Salvar");
        btnSalvarConforto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarConfortoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeConforto, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarConforto)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoNomeConforto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarConforto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarConforto.addTab("Cadastrar ou editar conforto", jPanel14);

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Nome do conforto:");

        btnLimparBuscaConforto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaConforto.setText("Limpar busca");
        btnLimparBuscaConforto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaConfortoActionPerformed(evt);
            }
        });

        btnBuscarConforto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarConforto.setText("Buscar");
        btnBuscarConforto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConfortoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroConforto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarConforto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaConforto)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoFiltroConforto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaConforto)
                    .addComponent(btnBuscarConforto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarConforto.addTab("Pesquisar conforto", jPanel15);

        tblConforto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblConforto);

        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarConforto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarConforto.setText("Editar");
        btnEditarConforto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarConforto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarConfortoActionPerformed(evt);
            }
        });

        btnExcluirConforto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirConforto.setText("Excluir");
        btnExcluirConforto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirConforto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirConfortoActionPerformed(evt);
            }
        });

        btnFecharConforto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharConforto.setText("Fechar");
        btnFecharConforto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharConforto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharConfortoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarConforto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirConforto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharConforto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarConforto)
                    .addComponent(btnExcluirConforto)
                    .addComponent(btnFecharConforto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelConfortoLayout = new javax.swing.GroupLayout(PainelConforto);
        PainelConforto.setLayout(PainelConfortoLayout);
        PainelConfortoLayout.setHorizontalGroup(
            PainelConfortoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConfortoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelConfortoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionarConforto)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelConfortoLayout.setVerticalGroup(
            PainelConfortoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConfortoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarConforto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Confortos", PainelConforto);

        PainelCorExterna.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarCorExterna.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarCorExterna.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Nome da cor externa:");

        btnSalvarCorExterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarCorExterna.setText("Salvar");
        btnSalvarCorExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCorExternaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeCorExterna, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCorExterna)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(campoNomeCorExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCorExterna))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarCorExterna.addTab("Cadastrar ou editar cor externa", jPanel17);

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("Nome da cor externa:");

        btnLimparBuscaCorExterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaCorExterna.setText("Limpar busca");
        btnLimparBuscaCorExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaCorExternaActionPerformed(evt);
            }
        });

        btnBuscarCorExterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarCorExterna.setText("Buscar");
        btnBuscarCorExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCorExternaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroCorExterna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCorExterna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaCorExterna)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(campoFiltroCorExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaCorExterna)
                    .addComponent(btnBuscarCorExterna))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarCorExterna.addTab("Pesquisar cor externa", jPanel18);

        tblCorExterna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tblCorExterna);

        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarCorExterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarCorExterna.setText("Editar");
        btnEditarCorExterna.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarCorExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCorExternaActionPerformed(evt);
            }
        });

        btnExcluirCorExterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirCorExterna.setText("Excluir");
        btnExcluirCorExterna.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirCorExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCorExternaActionPerformed(evt);
            }
        });

        btnFecharCorExterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharCorExterna.setText("Fechar");
        btnFecharCorExterna.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharCorExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCorExternaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarCorExterna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCorExterna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharCorExterna)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCorExterna)
                    .addComponent(btnExcluirCorExterna)
                    .addComponent(btnFecharCorExterna))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelCorExternaLayout = new javax.swing.GroupLayout(PainelCorExterna);
        PainelCorExterna.setLayout(PainelCorExternaLayout);
        PainelCorExternaLayout.setHorizontalGroup(
            PainelCorExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCorExternaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCorExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionarCorExterna, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelCorExternaLayout.setVerticalGroup(
            PainelCorExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCorExternaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarCorExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Cores externas", PainelCorExterna);

        PainelCorInterna.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarCorInterna.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarCorInterna.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setText("Nome da cor interna:");

        btnSalvarCorInterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarCorInterna.setText("Salvar");
        btnSalvarCorInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCorInternaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeCorInterna, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCorInterna)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(campoNomeCorInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCorInterna))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarCorInterna.addTab("Cadastrar ou editar cor interna", jPanel20);

        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Nome da cor interna:");

        btnLimparBuscaCorInterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaCorInterna.setText("Limpar busca");
        btnLimparBuscaCorInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaCorInternaActionPerformed(evt);
            }
        });

        btnBuscarCorInterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarCorInterna.setText("Buscar");
        btnBuscarCorInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCorInternaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroCorInterna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCorInterna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaCorInterna)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(campoFiltroCorInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaCorInterna)
                    .addComponent(btnBuscarCorInterna))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarCorInterna.addTab("Pesquisar cor interna", jPanel21);

        tblCorInterna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tblCorInterna);

        jPanel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarCorInterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarCorInterna.setText("Editar");
        btnEditarCorInterna.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarCorInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCorInternaActionPerformed(evt);
            }
        });

        btnExcluirCorInterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirCorInterna.setText("Excluir");
        btnExcluirCorInterna.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirCorInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCorInternaActionPerformed(evt);
            }
        });

        btnFecharCorInterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharCorInterna.setText("Fechar");
        btnFecharCorInterna.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharCorInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCorInternaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarCorInterna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCorInterna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharCorInterna)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCorInterna)
                    .addComponent(btnExcluirCorInterna)
                    .addComponent(btnFecharCorInterna))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelCorInternaLayout = new javax.swing.GroupLayout(PainelCorInterna);
        PainelCorInterna.setLayout(PainelCorInternaLayout);
        PainelCorInternaLayout.setHorizontalGroup(
            PainelCorInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCorInternaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCorInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionarCorInterna, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelCorInternaLayout.setVerticalGroup(
            PainelCorInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCorInternaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarCorInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Cores internas", PainelCorInterna);

        PainelEstilo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarEstilo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarEstilo.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setText("Nome do estilo:");

        btnSalvarEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarEstilo.setText("Salvar");
        btnSalvarEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEstiloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeEstilo, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarEstilo)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(campoNomeEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarEstilo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarEstilo.addTab("Cadastrar ou editar estilo", jPanel23);

        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setText("Nome do estilo:");

        btnLimparBuscaEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaEstilo.setText("Limpar busca");
        btnLimparBuscaEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaEstiloActionPerformed(evt);
            }
        });

        btnBuscarEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarEstilo.setText("Buscar");
        btnBuscarEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstiloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroEstilo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarEstilo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaEstilo)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(campoFiltroEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaEstilo)
                    .addComponent(btnBuscarEstilo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarEstilo.addTab("Pesquisar estilo", jPanel24);

        tblEstilo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(tblEstilo);

        jPanel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarEstilo.setText("Editar");
        btnEditarEstilo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEstiloActionPerformed(evt);
            }
        });

        btnExcluirEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirEstilo.setText("Excluir");
        btnExcluirEstilo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEstiloActionPerformed(evt);
            }
        });

        btnFecharEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharEstilo.setText("Fechar");
        btnFecharEstilo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharEstiloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarEstilo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirEstilo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharEstilo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarEstilo)
                    .addComponent(btnExcluirEstilo)
                    .addComponent(btnFecharEstilo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelEstiloLayout = new javax.swing.GroupLayout(PainelEstilo);
        PainelEstilo.setLayout(PainelEstiloLayout);
        PainelEstiloLayout.setHorizontalGroup(
            PainelEstiloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEstiloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEstiloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionarEstilo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelEstiloLayout.setVerticalGroup(
            PainelEstiloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEstiloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Estilos", PainelEstilo);

        PainelExtra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarExtra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarExtra.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setText("Nome do extra:");

        btnSalvarExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarExtra.setText("Salvar");
        btnSalvarExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarExtraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarExtra)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(campoNomeExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarExtra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarExtra.addTab("Cadastrar ou editar extra", jPanel26);

        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setText("Nome do extra:");

        btnLimparBuscaExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaExtra.setText("Limpar busca");
        btnLimparBuscaExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaExtraActionPerformed(evt);
            }
        });

        btnBuscarExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarExtra.setText("Buscar");
        btnBuscarExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarExtraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroExtra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarExtra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaExtra)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(campoFiltroExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaExtra)
                    .addComponent(btnBuscarExtra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarExtra.addTab("Pesquisar extra", jPanel27);

        tblExtra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(tblExtra);

        jPanel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarExtra.setText("Editar");
        btnEditarExtra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarExtraActionPerformed(evt);
            }
        });

        btnExcluirExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirExtra.setText("Excluir");
        btnExcluirExtra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirExtraActionPerformed(evt);
            }
        });

        btnFecharExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharExtra.setText("Fechar");
        btnFecharExtra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharExtraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarExtra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirExtra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharExtra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarExtra)
                    .addComponent(btnExcluirExtra)
                    .addComponent(btnFecharExtra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelExtraLayout = new javax.swing.GroupLayout(PainelExtra);
        PainelExtra.setLayout(PainelExtraLayout);
        PainelExtraLayout.setHorizontalGroup(
            PainelExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionarExtra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelExtraLayout.setVerticalGroup(
            PainelExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Extras", PainelExtra);

        PainelSeguranca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarSeguranca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarSeguranca.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setText("Nome da segurança:");

        btnSalvarSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarSeguranca.setText("Salvar");
        btnSalvarSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSegurancaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeSeguranca, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarSeguranca)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(campoNomeSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarSeguranca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarSeguranca.addTab("Cadastrar ou editar segurança", jPanel29);

        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setText("Nome da segurança:");

        btnLimparBuscaSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaSeguranca.setText("Limpar busca");
        btnLimparBuscaSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaSegurancaActionPerformed(evt);
            }
        });

        btnBuscarSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarSeguranca.setText("Buscar");
        btnBuscarSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSegurancaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroSeguranca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarSeguranca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaSeguranca)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(campoFiltroSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaSeguranca)
                    .addComponent(btnBuscarSeguranca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarSeguranca.addTab("Pesquisar segurança", jPanel30);

        tblSeguranca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(tblSeguranca);

        jPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarSeguranca.setText("Editar");
        btnEditarSeguranca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSegurancaActionPerformed(evt);
            }
        });

        btnExcluirSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirSeguranca.setText("Excluir");
        btnExcluirSeguranca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirSegurancaActionPerformed(evt);
            }
        });

        btnFecharSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharSeguranca.setText("Fechar");
        btnFecharSeguranca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharSegurancaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarSeguranca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirSeguranca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharSeguranca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarSeguranca)
                    .addComponent(btnExcluirSeguranca)
                    .addComponent(btnFecharSeguranca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelSegurancaLayout = new javax.swing.GroupLayout(PainelSeguranca);
        PainelSeguranca.setLayout(PainelSegurancaLayout);
        PainelSegurancaLayout.setHorizontalGroup(
            PainelSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelSegurancaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionarSeguranca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelSegurancaLayout.setVerticalGroup(
            PainelSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelSegurancaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Seguranças", PainelSeguranca);

        PainelTecnologia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarTecnologia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarTecnologia.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel21.setText("Nome da tecnologia:");

        btnSalvarTecnologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarTecnologia.setText("Salvar");
        btnSalvarTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTecnologiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeTecnologia, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarTecnologia)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(campoNomeTecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarTecnologia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarTecnologia.addTab("Cadastrar ou editar tecnologia", jPanel32);

        jPanel33.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel22.setText("Nome da tecnologia:");

        btnLimparBuscaTecnologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaTecnologia.setText("Limpar busca");
        btnLimparBuscaTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaTecnologiaActionPerformed(evt);
            }
        });

        btnBuscarTecnologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarTecnologia.setText("Buscar");
        btnBuscarTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTecnologiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroTecnologia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarTecnologia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaTecnologia)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(campoFiltroTecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaTecnologia)
                    .addComponent(btnBuscarTecnologia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarTecnologia.addTab("Pesquisar tecnologia", jPanel33);

        tblTecnologia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(tblTecnologia);

        jPanel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarTecnologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarTecnologia.setText("Editar");
        btnEditarTecnologia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTecnologiaActionPerformed(evt);
            }
        });

        btnExcluirTecnologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirTecnologia.setText("Excluir");
        btnExcluirTecnologia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTecnologiaActionPerformed(evt);
            }
        });

        btnFecharTecnologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharTecnologia.setText("Fechar");
        btnFecharTecnologia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharTecnologiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarTecnologia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirTecnologia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharTecnologia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarTecnologia)
                    .addComponent(btnExcluirTecnologia)
                    .addComponent(btnFecharTecnologia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelTecnologiaLayout = new javax.swing.GroupLayout(PainelTecnologia);
        PainelTecnologia.setLayout(PainelTecnologiaLayout);
        PainelTecnologiaLayout.setHorizontalGroup(
            PainelTecnologiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTecnologiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelTecnologiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionarTecnologia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelTecnologiaLayout.setVerticalGroup(
            PainelTecnologiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTecnologiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarTecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Tecnologias", PainelTecnologia);

        abaVeiculo.addTab("Veículos", abaAcabamentoInterno);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        abaPerfil.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        PainelCidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarCidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarCidade.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel41.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel27.setText("Nome da cidade:");

        btnSalvarCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarCidade.setText("Salvar");
        btnSalvarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCidade)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(campoNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCidade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarCidade.addTab("Cadastrar ou editar cidade", jPanel41);

        jPanel42.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel28.setText("Nome da cidade:");

        btnLimparBuscaCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaCidade.setText("Limpar busca");
        btnLimparBuscaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaCidadeActionPerformed(evt);
            }
        });

        btnBuscarCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarCidade.setText("Buscar");
        btnBuscarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaCidade)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(campoFiltroCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaCidade)
                    .addComponent(btnBuscarCidade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarCidade.addTab("Pesquisar cidade", jPanel42);

        tblCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane14.setViewportView(tblCidade);

        jPanel43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarCidade.setText("Editar");
        btnEditarCidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCidadeActionPerformed(evt);
            }
        });

        btnExcluirCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirCidade.setText("Excluir");
        btnExcluirCidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCidadeActionPerformed(evt);
            }
        });

        btnFecharCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharCidade.setText("Fechar");
        btnFecharCidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharCidade)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCidade)
                    .addComponent(btnExcluirCidade)
                    .addComponent(btnFecharCidade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelCidadeLayout = new javax.swing.GroupLayout(PainelCidade);
        PainelCidade.setLayout(PainelCidadeLayout);
        PainelCidadeLayout.setHorizontalGroup(
            PainelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionarCidade)
                    .addComponent(jScrollPane14)
                    .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelCidadeLayout.setVerticalGroup(
            PainelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaPerfil.addTab("Cidades", PainelCidade);

        PainelEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarEstado.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel38.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel25.setText("Nome do estado:");

        btnSalvarEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarEstado.setText("Salvar");
        btnSalvarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarEstado)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(campoNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarEstado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarEstado.addTab("Cadastrar ou editar estado", jPanel38);

        jPanel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel26.setText("Nome do estado:");

        btnLimparBuscaEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaEstado.setText("Limpar busca");
        btnLimparBuscaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaEstadoActionPerformed(evt);
            }
        });

        btnBuscarEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarEstado.setText("Buscar");
        btnBuscarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaEstado)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(campoFiltroEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaEstado)
                    .addComponent(btnBuscarEstado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarEstado.addTab("Pesquisar estado", jPanel39);

        tblEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane13.setViewportView(tblEstado);

        jPanel40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarEstado.setText("Editar");
        btnEditarEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEstadoActionPerformed(evt);
            }
        });

        btnExcluirEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirEstado.setText("Excluir");
        btnExcluirEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEstadoActionPerformed(evt);
            }
        });

        btnFecharEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharEstado.setText("Fechar");
        btnFecharEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharEstado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarEstado)
                    .addComponent(btnExcluirEstado)
                    .addComponent(btnFecharEstado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelEstadoLayout = new javax.swing.GroupLayout(PainelEstado);
        PainelEstado.setLayout(PainelEstadoLayout);
        PainelEstadoLayout.setHorizontalGroup(
            PainelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaAdicionarEstado)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelEstadoLayout.setVerticalGroup(
            PainelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaPerfil.addTab("Estados", PainelEstado);

        PainelPerfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarPerfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarPerfil.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel23.setText("Nome do perfil:");

        btnSalvarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarPerfil.setText("Salvar");
        btnSalvarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomePerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarPerfil)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(campoNomePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarPerfil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarPerfil.addTab("Cadastrar ou editar perfil", jPanel35);

        jPanel36.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel24.setText("Nome do perfil:");

        btnLimparBuscaPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBuscaPerfil.setText("Limpar busca");
        btnLimparBuscaPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaPerfilActionPerformed(evt);
            }
        });

        btnBuscarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscarPerfil.setText("Buscar");
        btnBuscarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaPerfil)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(campoFiltroPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBuscaPerfil)
                    .addComponent(btnBuscarPerfil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarPerfil.addTab("Pesquisar perfil", jPanel36);

        tblPerfil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane12.setViewportView(tblPerfil);

        jPanel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditarPerfil.setText("Editar");
        btnEditarPerfil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilActionPerformed(evt);
            }
        });

        btnExcluirPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluirPerfil.setText("Excluir");
        btnExcluirPerfil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluirPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPerfilActionPerformed(evt);
            }
        });

        btnFecharPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharPerfil.setText("Fechar");
        btnFecharPerfil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharPerfil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarPerfil)
                    .addComponent(btnExcluirPerfil)
                    .addComponent(btnFecharPerfil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelPerfilLayout = new javax.swing.GroupLayout(PainelPerfil);
        PainelPerfil.setLayout(PainelPerfilLayout);
        PainelPerfilLayout.setHorizontalGroup(
            PainelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(abaAdicionarPerfil)
                    .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane12))
                .addContainerGap())
        );
        PainelPerfilLayout.setVerticalGroup(
            PainelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaPerfil.addTab("Perfis", PainelPerfil);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaPerfil)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
        funcaoFechar();
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

    private void btnSalvarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarCombustivelActionPerformed

    private void btnLimparBuscaCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaCombustivelActionPerformed

    private void btnBuscarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCombustivelActionPerformed

    private void btnEditarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCombustivelActionPerformed

    private void btnExcluirCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirCombustivelActionPerformed

    private void btnFecharCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharCombustivelActionPerformed

    private void btnSalvarConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarConfortoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarConfortoActionPerformed

    private void btnLimparBuscaConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaConfortoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaConfortoActionPerformed

    private void btnBuscarConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConfortoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarConfortoActionPerformed

    private void btnEditarConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarConfortoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarConfortoActionPerformed

    private void btnExcluirConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirConfortoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirConfortoActionPerformed

    private void btnFecharConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharConfortoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharConfortoActionPerformed

    private void btnSalvarCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCorExternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarCorExternaActionPerformed

    private void btnLimparBuscaCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaCorExternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaCorExternaActionPerformed

    private void btnBuscarCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCorExternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCorExternaActionPerformed

    private void btnEditarCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCorExternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCorExternaActionPerformed

    private void btnExcluirCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCorExternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirCorExternaActionPerformed

    private void btnFecharCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCorExternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharCorExternaActionPerformed

    private void btnSalvarCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCorInternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarCorInternaActionPerformed

    private void btnLimparBuscaCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaCorInternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaCorInternaActionPerformed

    private void btnBuscarCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCorInternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCorInternaActionPerformed

    private void btnEditarCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCorInternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCorInternaActionPerformed

    private void btnExcluirCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCorInternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirCorInternaActionPerformed

    private void btnFecharCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCorInternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharCorInternaActionPerformed

    private void btnSalvarEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEstiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarEstiloActionPerformed

    private void btnLimparBuscaEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaEstiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaEstiloActionPerformed

    private void btnBuscarEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarEstiloActionPerformed

    private void btnEditarEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarEstiloActionPerformed

    private void btnExcluirEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEstiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirEstiloActionPerformed

    private void btnFecharEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharEstiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharEstiloActionPerformed

    private void btnSalvarExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarExtraActionPerformed

    private void btnLimparBuscaExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaExtraActionPerformed

    private void btnBuscarExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarExtraActionPerformed

    private void btnEditarExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarExtraActionPerformed

    private void btnExcluirExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirExtraActionPerformed

    private void btnFecharExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharExtraActionPerformed

    private void btnSalvarSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSegurancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarSegurancaActionPerformed

    private void btnLimparBuscaSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaSegurancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaSegurancaActionPerformed

    private void btnBuscarSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSegurancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarSegurancaActionPerformed

    private void btnEditarSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSegurancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarSegurancaActionPerformed

    private void btnExcluirSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirSegurancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirSegurancaActionPerformed

    private void btnFecharSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharSegurancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharSegurancaActionPerformed

    private void btnSalvarTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTecnologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarTecnologiaActionPerformed

    private void btnLimparBuscaTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaTecnologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaTecnologiaActionPerformed

    private void btnBuscarTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTecnologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarTecnologiaActionPerformed

    private void btnEditarTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTecnologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarTecnologiaActionPerformed

    private void btnExcluirTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTecnologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirTecnologiaActionPerformed

    private void btnFecharTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharTecnologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharTecnologiaActionPerformed

    private void btnSalvarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarPerfilActionPerformed

    private void btnLimparBuscaPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaPerfilActionPerformed

    private void btnBuscarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarPerfilActionPerformed

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    private void btnExcluirPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirPerfilActionPerformed

    private void btnFecharPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharPerfilActionPerformed

    private void btnSalvarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarEstadoActionPerformed

    private void btnLimparBuscaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaEstadoActionPerformed

    private void btnBuscarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarEstadoActionPerformed

    private void btnEditarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarEstadoActionPerformed

    private void btnExcluirEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirEstadoActionPerformed

    private void btnFecharEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharEstadoActionPerformed

    private void btnSalvarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarCidadeActionPerformed

    private void btnLimparBuscaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscaCidadeActionPerformed

    private void btnBuscarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCidadeActionPerformed

    private void btnEditarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCidadeActionPerformed

    private void btnExcluirCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirCidadeActionPerformed

    private void btnFecharCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharCidadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAcabamentoInterno;
    private javax.swing.JPanel PainelCambio;
    private javax.swing.JPanel PainelCarroceria;
    private javax.swing.JPanel PainelCidade;
    private javax.swing.JPanel PainelCombustivel;
    private javax.swing.JPanel PainelConforto;
    private javax.swing.JPanel PainelCorExterna;
    private javax.swing.JPanel PainelCorInterna;
    private javax.swing.JPanel PainelEstado;
    private javax.swing.JPanel PainelEstilo;
    private javax.swing.JPanel PainelExtra;
    private javax.swing.JPanel PainelPerfil;
    private javax.swing.JPanel PainelSeguranca;
    private javax.swing.JPanel PainelTecnologia;
    private javax.swing.JTabbedPane abaAcabamentoInterno;
    private javax.swing.JTabbedPane abaAdicionarAcabamentoInterno;
    private javax.swing.JTabbedPane abaAdicionarCambio;
    private javax.swing.JTabbedPane abaAdicionarCarroceria;
    private javax.swing.JTabbedPane abaAdicionarCidade;
    private javax.swing.JTabbedPane abaAdicionarCombustivel;
    private javax.swing.JTabbedPane abaAdicionarConforto;
    private javax.swing.JTabbedPane abaAdicionarCorExterna;
    private javax.swing.JTabbedPane abaAdicionarCorInterna;
    private javax.swing.JTabbedPane abaAdicionarEstado;
    private javax.swing.JTabbedPane abaAdicionarEstilo;
    private javax.swing.JTabbedPane abaAdicionarExtra;
    private javax.swing.JTabbedPane abaAdicionarPerfil;
    private javax.swing.JTabbedPane abaAdicionarSeguranca;
    private javax.swing.JTabbedPane abaAdicionarTecnologia;
    private javax.swing.JTabbedPane abaPerfil;
    private javax.swing.JTabbedPane abaVeiculo;
    private javax.swing.JButton btnBuscarAcabamentoInterno;
    private javax.swing.JButton btnBuscarCambio;
    private javax.swing.JButton btnBuscarCarroceria;
    private javax.swing.JButton btnBuscarCidade;
    private javax.swing.JButton btnBuscarCombustivel;
    private javax.swing.JButton btnBuscarConforto;
    private javax.swing.JButton btnBuscarCorExterna;
    private javax.swing.JButton btnBuscarCorInterna;
    private javax.swing.JButton btnBuscarEstado;
    private javax.swing.JButton btnBuscarEstilo;
    private javax.swing.JButton btnBuscarExtra;
    private javax.swing.JButton btnBuscarPerfil;
    private javax.swing.JButton btnBuscarSeguranca;
    private javax.swing.JButton btnBuscarTecnologia;
    private javax.swing.JButton btnEditarAcabamentoInterno;
    private javax.swing.JButton btnEditarCambio;
    private javax.swing.JButton btnEditarCarroceria;
    private javax.swing.JButton btnEditarCidade;
    private javax.swing.JButton btnEditarCombustivel;
    private javax.swing.JButton btnEditarConforto;
    private javax.swing.JButton btnEditarCorExterna;
    private javax.swing.JButton btnEditarCorInterna;
    private javax.swing.JButton btnEditarEstado;
    private javax.swing.JButton btnEditarEstilo;
    private javax.swing.JButton btnEditarExtra;
    private javax.swing.JButton btnEditarPerfil;
    private javax.swing.JButton btnEditarSeguranca;
    private javax.swing.JButton btnEditarTecnologia;
    private javax.swing.JButton btnExcluirAcabamentoInterno;
    private javax.swing.JButton btnExcluirCambio;
    private javax.swing.JButton btnExcluirCarroceria;
    private javax.swing.JButton btnExcluirCidade;
    private javax.swing.JButton btnExcluirCombustivel;
    private javax.swing.JButton btnExcluirConforto;
    private javax.swing.JButton btnExcluirCorExterna;
    private javax.swing.JButton btnExcluirCorInterna;
    private javax.swing.JButton btnExcluirEstado;
    private javax.swing.JButton btnExcluirEstilo;
    private javax.swing.JButton btnExcluirExtra;
    private javax.swing.JButton btnExcluirPerfil;
    private javax.swing.JButton btnExcluirSeguranca;
    private javax.swing.JButton btnExcluirTecnologia;
    private javax.swing.JButton btnFecharAcabamentoInterno;
    private javax.swing.JButton btnFecharCambio;
    private javax.swing.JButton btnFecharCarroceria;
    private javax.swing.JButton btnFecharCidade;
    private javax.swing.JButton btnFecharCombustivel;
    private javax.swing.JButton btnFecharConforto;
    private javax.swing.JButton btnFecharCorExterna;
    private javax.swing.JButton btnFecharCorInterna;
    private javax.swing.JButton btnFecharEstado;
    private javax.swing.JButton btnFecharEstilo;
    private javax.swing.JButton btnFecharExtra;
    private javax.swing.JButton btnFecharPerfil;
    private javax.swing.JButton btnFecharSeguranca;
    private javax.swing.JButton btnFecharTecnologia;
    private javax.swing.JButton btnLimparBuscaAcabamentoInterno;
    private javax.swing.JButton btnLimparBuscaCambio;
    private javax.swing.JButton btnLimparBuscaCarroceria;
    private javax.swing.JButton btnLimparBuscaCidade;
    private javax.swing.JButton btnLimparBuscaCombustivel;
    private javax.swing.JButton btnLimparBuscaConforto;
    private javax.swing.JButton btnLimparBuscaCorExterna;
    private javax.swing.JButton btnLimparBuscaCorInterna;
    private javax.swing.JButton btnLimparBuscaEstado;
    private javax.swing.JButton btnLimparBuscaEstilo;
    private javax.swing.JButton btnLimparBuscaExtra;
    private javax.swing.JButton btnLimparBuscaPerfil;
    private javax.swing.JButton btnLimparBuscaSeguranca;
    private javax.swing.JButton btnLimparBuscaTecnologia;
    private javax.swing.JButton btnSalvarAcabamentoInterno;
    private javax.swing.JButton btnSalvarCambio;
    private javax.swing.JButton btnSalvarCarroceria;
    private javax.swing.JButton btnSalvarCidade;
    private javax.swing.JButton btnSalvarCombustivel;
    private javax.swing.JButton btnSalvarConforto;
    private javax.swing.JButton btnSalvarCorExterna;
    private javax.swing.JButton btnSalvarCorInterna;
    private javax.swing.JButton btnSalvarEstado;
    private javax.swing.JButton btnSalvarEstilo;
    private javax.swing.JButton btnSalvarExtra;
    private javax.swing.JButton btnSalvarPerfil;
    private javax.swing.JButton btnSalvarSeguranca;
    private javax.swing.JButton btnSalvarTecnologia;
    private javax.swing.JTextField campoFiltroAcabamentoInterno;
    private javax.swing.JTextField campoFiltroCambio;
    private javax.swing.JTextField campoFiltroCarroceria;
    private javax.swing.JTextField campoFiltroCidade;
    private javax.swing.JTextField campoFiltroCombustivel;
    private javax.swing.JTextField campoFiltroConforto;
    private javax.swing.JTextField campoFiltroCorExterna;
    private javax.swing.JTextField campoFiltroCorInterna;
    private javax.swing.JTextField campoFiltroEstado;
    private javax.swing.JTextField campoFiltroEstilo;
    private javax.swing.JTextField campoFiltroExtra;
    private javax.swing.JTextField campoFiltroPerfil;
    private javax.swing.JTextField campoFiltroSeguranca;
    private javax.swing.JTextField campoFiltroTecnologia;
    private javax.swing.JTextField campoNomeAcabamentoInterno;
    private javax.swing.JTextField campoNomeCambio;
    private javax.swing.JTextField campoNomeCarroceria;
    private javax.swing.JTextField campoNomeCidade;
    private javax.swing.JTextField campoNomeCombustivel;
    private javax.swing.JTextField campoNomeConforto;
    private javax.swing.JTextField campoNomeCorExterna;
    private javax.swing.JTextField campoNomeCorInterna;
    private javax.swing.JTextField campoNomeEstado;
    private javax.swing.JTextField campoNomeEstilo;
    private javax.swing.JTextField campoNomeExtra;
    private javax.swing.JTextField campoNomePerfil;
    private javax.swing.JTextField campoNomeSeguranca;
    private javax.swing.JTextField campoNomeTecnologia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tblAcabamentoInterno;
    private javax.swing.JTable tblCambio;
    private javax.swing.JTable tblCarroceria;
    private javax.swing.JTable tblCidade;
    private javax.swing.JTable tblCombustivel;
    private javax.swing.JTable tblConforto;
    private javax.swing.JTable tblCorExterna;
    private javax.swing.JTable tblCorInterna;
    private javax.swing.JTable tblEstado;
    private javax.swing.JTable tblEstilo;
    private javax.swing.JTable tblExtra;
    private javax.swing.JTable tblPerfil;
    private javax.swing.JTable tblSeguranca;
    private javax.swing.JTable tblTecnologia;
    // End of variables declaration//GEN-END:variables
}