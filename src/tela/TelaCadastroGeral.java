package tela;

import dao.AcabamentoInternoDao;
import dao.CambioDao;
import dao.CarroceriaDao;
import dao.CidadeDao;
import dao.ComboDao;
import dao.CombustivelDao;
import dao.ConfortoDao;
import dao.CorExternaDao;
import dao.CorInternaDao;
import dao.DaoGenerico;
import dao.EstadoDao;
import dao.EstiloDao;
import dao.ExtraDao;
import dao.PerfilDao;
import dao.SegurancaDao;
import dao.TecnologiaDao;
import entidade.AcabamentoInterno;
import entidade.Cambio;
import entidade.Carroceria;
import entidade.Cidade;
import entidade.Combustivel;
import entidade.Conforto;
import entidade.CorExterna;
import entidade.CorInterna;
import entidade.Estado;
import entidade.Estilo;
import entidade.Extra;
import entidade.Perfil;
import entidade.Seguranca;
import entidade.Tecnologia;
import functions.ComboItem;
import functions.Funcoes;
import functions.GerenciarJanelas;
import functions.Mensagem;
import java.awt.Dimension;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TelaCadastroGeral extends javax.swing.JInternalFrame {

    int codigo = 0;
    private static TelaCadastroGeral tela;

    public TelaCadastroGeral() {
        initComponents();
        setaTbnInfos();
        new AcabamentoInternoDao().popularTabela(tblAcabamentoInterno, campoFiltroAcabamentoInterno.getText());
        new CambioDao().popularTabela(tblCambio, campoFiltroCambio.getText());
        new CarroceriaDao().popularTabela(tblCarroceria, campoFiltroCarroceria.getText());
        new CombustivelDao().popularTabela(tblCombustivel, campoFiltroCombustivel.getText());
        new ConfortoDao().popularTabela(tblConforto, campoFiltroConforto.getText());
        new CorExternaDao().popularTabela(tblCorExterna, campoFiltroCorExterna.getText());
        new CorInternaDao().popularTabela(tblCorInterna, campoFiltroCorInterna.getText());
        new EstiloDao().popularTabela(tblEstilo, campoFiltroEstilo.getText());
        new ExtraDao().popularTabela(tblExtra, campoFiltroExtra.getText());
        new SegurancaDao().popularTabela(tblSeguranca, campoFiltroSeguranca.getText());
        new TecnologiaDao().popularTabela(tblTecnologia, campoFiltroTecnologia.getText());
        new PerfilDao().popularTabela(tblPerfil, campoFiltroPerfil.getText());
        new EstadoDao().popularTabela(tblEstado, campoFiltroEstado.getText());
        new ComboDao().popularCombo("estados", 1, 4, comboEstadoId, "");
        new CidadeDao().popularTabela(tblCidade, campoFiltroCidade.getText());
    }

    public static TelaCadastroGeral getInstancia() {
        if (tela == null) {
            tela = new TelaCadastroGeral();
        }
        return tela;
    }

    private void setaTbnInfos() {
        //seta os textos de cada aba
        JLabel lab1 = new JLabel("Acabamentos internos", SwingConstants.CENTER);
        JLabel lab2 = new JLabel("Câmbios", SwingConstants.CENTER);
        JLabel lab3 = new JLabel("Carrocerias", SwingConstants.CENTER);
        JLabel lab4 = new JLabel("Combustíveis", SwingConstants.CENTER);
        JLabel lab5 = new JLabel("Confortos", SwingConstants.CENTER);
        JLabel lab6 = new JLabel("Cores externas", SwingConstants.CENTER);
        JLabel lab7 = new JLabel("Cores internas", SwingConstants.CENTER);
        JLabel lab8 = new JLabel("Estilos", SwingConstants.CENTER);
        JLabel lab9 = new JLabel("Extras", SwingConstants.CENTER);
        JLabel lab10 = new JLabel("Seguranças", SwingConstants.CENTER);
        JLabel lab11 = new JLabel("Tecnologias", SwingConstants.CENTER);
        JLabel lab12 = new JLabel("Cidades", SwingConstants.CENTER);
        JLabel lab13 = new JLabel("Estados", SwingConstants.CENTER);
        JLabel lab14 = new JLabel("Perfis", SwingConstants.CENTER);

        //seta o tamanho das abas
        int largura = 155;
        int altura = 45;
        lab1.setPreferredSize(new Dimension(largura, altura));
        lab2.setPreferredSize(new Dimension(largura, altura));
        lab3.setPreferredSize(new Dimension(largura, altura));
        lab4.setPreferredSize(new Dimension(largura, altura));
        lab5.setPreferredSize(new Dimension(largura, altura));
        lab6.setPreferredSize(new Dimension(largura, altura));
        lab7.setPreferredSize(new Dimension(largura, altura));
        lab8.setPreferredSize(new Dimension(largura, altura));
        lab9.setPreferredSize(new Dimension(largura, altura));
        lab10.setPreferredSize(new Dimension(largura, altura));
        lab11.setPreferredSize(new Dimension(largura, altura));
        lab12.setPreferredSize(new Dimension(largura, altura));
        lab13.setPreferredSize(new Dimension(largura, altura));
        lab14.setPreferredSize(new Dimension(largura, altura));

        //coloca as abas no jTabbedPane
        abaAcabamentoInterno.setTabComponentAt(0, lab1);  // tab 1, Acabamentos internos
        abaAcabamentoInterno.setTabComponentAt(1, lab2);  // tab 2, Câmbios
        abaAcabamentoInterno.setTabComponentAt(2, lab3);  // tab 3, Carrocerias
        abaAcabamentoInterno.setTabComponentAt(3, lab4);  // tab 4, Combustíveis
        abaAcabamentoInterno.setTabComponentAt(4, lab5);  // tab 5, Confortos
        abaAcabamentoInterno.setTabComponentAt(5, lab6);  // tab 6, Cores externas
        abaAcabamentoInterno.setTabComponentAt(6, lab7);  // tab 7, Cores internas
        abaAcabamentoInterno.setTabComponentAt(7, lab8);  // tab 8, Estilos
        abaAcabamentoInterno.setTabComponentAt(8, lab9);  // tab 9, Extras
        abaAcabamentoInterno.setTabComponentAt(9, lab10);  // tab 10, Seguranças
        abaAcabamentoInterno.setTabComponentAt(10, lab11);  // tab 11, Tecnologias
        abaPerfil.setTabComponentAt(0, lab12);  // tab 11, Cidades
        abaPerfil.setTabComponentAt(1, lab13);  // tab 11, Estados
        abaPerfil.setTabComponentAt(2, lab14);  // tab 11, Perfis

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
        abaPerfil = new javax.swing.JTabbedPane();
        PainelCidade = new javax.swing.JPanel();
        abaAdicionarCidade = new javax.swing.JTabbedPane();
        jPanel41 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        campoNomeCidade = new javax.swing.JTextField();
        btnSalvarCidade = new javax.swing.JButton();
        comboEstadoId = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        campoFiltroCidade = new javax.swing.JTextField();
        btnLimparBuscaCidade = new javax.swing.JButton();
        btnBuscarCidade = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
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
        jLabel29 = new javax.swing.JLabel();
        campoUf = new javax.swing.JTextField();
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
        abaAdicionarPerfil2 = new javax.swing.JTabbedPane();
        jPanel35 = new javax.swing.JPanel();
        campoNomePerfil = new javax.swing.JTextField();
        btnSalvarPerfil = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
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

        jLabel1.setText("Acabamento interno:");

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
                .addComponent(campoNomeAcabamentoInterno, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarAcabamentoInterno)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvarAcabamentoInterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoNomeAcabamentoInterno, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        abaAdicionarAcabamentoInterno.addTab("Cadastrar ou editar acabamento interno", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Acabamento interno:");

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
                .addComponent(campoFiltroAcabamentoInterno, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarAcabamentoInterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuscaAcabamentoInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLimparBuscaAcabamentoInterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarAcabamentoInterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroAcabamentoInterno))
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(abaAdicionarAcabamentoInterno))
                .addContainerGap())
        );
        PainelAcabamentoInternoLayout.setVerticalGroup(
            PainelAcabamentoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcabamentoInternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarAcabamentoInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Acabamentos internos", PainelAcabamentoInterno);

        PainelCambio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarCambio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarCambio.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Câmbio:");

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
                .addComponent(campoNomeCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCambio)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeCambio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvarCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        abaAdicionarCambio.addTab("Cadastrar ou editar câmbio", jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Câmbio:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroCambio)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnBuscarCambio)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnLimparBuscaCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Câmbios", PainelCambio);

        PainelCarroceria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarCarroceria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarCarroceria.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Carroceria:");

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
                .addComponent(campoNomeCarroceria, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCarroceria)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeCarroceria, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvarCarroceria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        abaAdicionarCarroceria.addTab("Cadastrar ou editar carroceria", jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Carroceria:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoFiltroCarroceria)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarCarroceria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparBuscaCarroceria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Carrocerias", PainelCarroceria);

        PainelCombustivel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarCombustivel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarCombustivel.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Combustível:");

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
                .addComponent(campoNomeCombustivel, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCombustivel)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeCombustivel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvarCombustivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        abaAdicionarCombustivel.addTab("Cadastrar ou editar combustível", jPanel11);

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Combustível:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroCombustivel)
                    .addComponent(btnBuscarCombustivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparBuscaCombustivel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Combustíveis", PainelCombustivel);

        PainelConforto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarConforto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarConforto.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Conforto:");

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
                .addComponent(campoNomeConforto, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarConforto)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeConforto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvarConforto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        abaAdicionarConforto.addTab("Cadastrar ou editar conforto", jPanel14);

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Conforto:");

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
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoFiltroConforto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarConforto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparBuscaConforto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Confortos", PainelConforto);

        PainelCorExterna.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarCorExterna.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarCorExterna.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Cor externa:");

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
                .addComponent(campoNomeCorExterna, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCorExterna)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeCorExterna, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvarCorExterna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        abaAdicionarCorExterna.addTab("Cadastrar ou editar cor externa", jPanel17);

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("Cor externa:");

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
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarCorExterna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroCorExterna, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimparBuscaCorExterna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Cores externas", PainelCorExterna);

        PainelCorInterna.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarCorInterna.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarCorInterna.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setText("Cor interna:");

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
                .addComponent(campoNomeCorInterna, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCorInterna)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeCorInterna, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvarCorInterna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        abaAdicionarCorInterna.addTab("Cadastrar ou editar cor interna", jPanel20);

        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Cor interna:");

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
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarCorInterna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroCorInterna, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimparBuscaCorInterna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Cores internas", PainelCorInterna);

        PainelEstilo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarEstilo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarEstilo.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setText("Estilo:");

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
                .addComponent(campoNomeEstilo, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarEstilo)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeEstilo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvarEstilo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        abaAdicionarEstilo.addTab("Cadastrar ou editar estilo", jPanel23);

        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setText("Estilo:");

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
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarEstilo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparBuscaEstilo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroEstilo))
                .addContainerGap())
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
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Estilos", PainelEstilo);

        PainelExtra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarExtra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarExtra.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setText("Extra:");

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
                .addComponent(campoNomeExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarExtra)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeExtra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvarExtra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        abaAdicionarExtra.addTab("Cadastrar ou editar extra", jPanel26);

        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setText("Extra:");

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
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroExtra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimparBuscaExtra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Extras", PainelExtra);

        PainelSeguranca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarSeguranca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarSeguranca.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setText("Segurança:");

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
                .addComponent(campoNomeSeguranca, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarSeguranca)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeSeguranca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvarSeguranca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        abaAdicionarSeguranca.addTab("Cadastrar ou editar segurança", jPanel29);

        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setText("Segurança:");

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
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroSeguranca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarSeguranca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparBuscaSeguranca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Seguranças", PainelSeguranca);

        PainelTecnologia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarTecnologia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarTecnologia.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel21.setText("Tecnologia:");

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
                .addComponent(campoNomeTecnologia, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarTecnologia)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeTecnologia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvarTecnologia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        abaAdicionarTecnologia.addTab("Cadastrar ou editar tecnologia", jPanel32);

        jPanel33.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel22.setText("Tecnologia:");

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
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarTecnologia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparBuscaTecnologia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroTecnologia, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
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
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaAcabamentoInterno.addTab("Tecnologias", PainelTecnologia);

        abaVeiculo.addTab("Veículos", abaAcabamentoInterno);

        abaPerfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaPerfil.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        PainelCidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarCidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarCidade.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel41.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel27.setText("Cidade:");

        btnSalvarCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarCidade.setText("Salvar");
        btnSalvarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCidadeActionPerformed(evt);
            }
        });

        comboEstadoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel30.setText("Estado:");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboEstadoId, 0, 242, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvarCidade)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarCidade)
                    .addComponent(comboEstadoId)
                    .addComponent(campoNomeCidade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        abaAdicionarCidade.addTab("Cadastrar ou editar cidade", jPanel41);

        jPanel42.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jLabel32.setText("Cidade:");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimparBuscaCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                    .addComponent(jScrollPane14)
                    .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PainelCidadeLayout.createSequentialGroup()
                        .addComponent(abaAdicionarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 95, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelCidadeLayout.setVerticalGroup(
            PainelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaPerfil.addTab("Cidades", PainelCidade);

        PainelEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarEstado.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel38.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel25.setText("Estado:");

        btnSalvarEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarEstado.setText("Salvar");
        btnSalvarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEstadoActionPerformed(evt);
            }
        });

        jLabel29.setText("UF:");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoUf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarEstado)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoNomeEstado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvarEstado, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(campoUf))
                .addContainerGap())
        );

        abaAdicionarEstado.addTab("Cadastrar ou editar estado", jPanel38);

        jPanel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel26.setText("Estado:");

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
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparBuscaEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcluirEstado)
                            .addComponent(btnFecharEstado))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout PainelEstadoLayout = new javax.swing.GroupLayout(PainelEstado);
        PainelEstado.setLayout(PainelEstadoLayout);
        PainelEstadoLayout.setHorizontalGroup(
            PainelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abaAdicionarEstado))
                .addContainerGap())
        );
        PainelEstadoLayout.setVerticalGroup(
            PainelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaPerfil.addTab("Estados", PainelEstado);

        PainelPerfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        abaAdicionarPerfil2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abaAdicionarPerfil2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSalvarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvarPerfil.setText("Salvar");
        btnSalvarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPerfilActionPerformed(evt);
            }
        });

        jLabel31.setText("Perfil:");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomePerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarPerfil)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoNomePerfil, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        abaAdicionarPerfil2.addTab("Cadastrar ou editar perfil", jPanel35);

        jPanel36.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel24.setText("Perfil:");

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
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroPerfil, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparBuscaPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAdicionarPerfil2.addTab("Pesquisar perfil", jPanel36);

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
                    .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane12)
                    .addComponent(abaAdicionarPerfil, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        PainelPerfilLayout.setVerticalGroup(
            PainelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAdicionarPerfil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaPerfil.addTab("Perfis", PainelPerfil);

        abaVeiculo.addTab("Pessoal", abaPerfil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharPerfilActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharPerfilActionPerformed

    private void btnExcluirPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPerfilActionPerformed
        int codigoExcluirPerfil = (int) tblPerfil.getValueAt(tblPerfil.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirPerfil = DaoGenerico.getInstance().excluir(Perfil.class, codigoExcluirPerfil);

            if (retornoExcluirPerfil == true) {
                Mensagem.informacao("Perfil excluído com sucesso!", this);
                new PerfilDao().popularTabela(tblPerfil, campoFiltroPerfil.getText());
            } else {
                Mensagem.erro(tblPerfil.getValueAt(tblPerfil.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirPerfilActionPerformed

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed
        String codigoEditarPerfil = String.valueOf(tblPerfil.getValueAt(tblPerfil.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(Perfil.class, Integer.parseInt(codigoEditarPerfil));
        Perfil perfil = new Perfil((Perfil) object);

        if (perfil != null) {
            abaAdicionarPerfil2.setSelectedIndex(0);

            campoNomePerfil.setText(perfil.getNome());

            campoNomePerfil.requestFocus();

            codigo = perfil.getId();

        } else {
            Mensagem.erro("Erro ao consultar perfil!", this);
        }
    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    private void btnBuscarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPerfilActionPerformed
        new PerfilDao().popularTabela(tblPerfil, campoFiltroPerfil.getText());
    }//GEN-LAST:event_btnBuscarPerfilActionPerformed

    private void btnLimparBuscaPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaPerfilActionPerformed
        campoFiltroPerfil.setText("");
        new PerfilDao().popularTabela(tblPerfil, campoFiltroPerfil.getText());
    }//GEN-LAST:event_btnLimparBuscaPerfilActionPerformed

    private void btnSalvarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPerfilActionPerformed
        Perfil perfil = new Perfil();

        perfil.setId(codigo);
        perfil.setNome(campoNomePerfil.getText());
        perfil.setSlug(Funcoes.textoIdentificador(campoNomePerfil.getText()));
        perfil.setCriadoEm(Calendar.getInstance());
        perfil.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarPerfil = false;
        String erroPerfil = "";

        if (campoNomePerfil.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarPerfil = DaoGenerico.getInstance().inserir(perfil);
            } else {
                retornoSalvarPerfil = DaoGenerico.getInstance().atualizar(perfil);
            }
        } else {
            erroPerfil = null;
            Mensagem.erro("Digite um perfil válido!", this);
        }

        if (retornoSalvarPerfil == true && erroPerfil != null) {
            Mensagem.informacao("Perfil salvo com sucesso!", this);

            campoNomePerfil.setText("");

            campoNomePerfil.requestFocus();

            campoFiltroPerfil.setText("");

            codigo = 0;

            new PerfilDao().popularTabela(tblPerfil, campoFiltroPerfil.getText());
        } else {
            if (erroPerfil != null) {
                Mensagem.aviso("Perfil " + campoNomePerfil.getText() + " já existe cadastrado!", this);

                campoNomePerfil.setText("");

                campoNomePerfil.requestFocus();

                campoFiltroPerfil.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarPerfilActionPerformed

    private void btnFecharEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharEstadoActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharEstadoActionPerformed

    private void btnExcluirEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEstadoActionPerformed
        int codigoExcluirEstado = (int) tblEstado.getValueAt(tblEstado.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirEstado = DaoGenerico.getInstance().excluir(Estado.class, codigoExcluirEstado);

            if (retornoExcluirEstado == true) {
                Mensagem.informacao("Estado excluído com sucesso!", this);
                new EstadoDao().popularTabela(tblEstado, campoFiltroEstado.getText());
                new ComboDao().popularCombo("estados", 1, 4, comboEstadoId, "");
            } else {
                Mensagem.erro(tblEstado.getValueAt(tblEstado.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirEstadoActionPerformed

    private void btnEditarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstadoActionPerformed
        String codigoEditarEstado = String.valueOf(tblEstado.getValueAt(tblEstado.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(Estado.class, Integer.parseInt(codigoEditarEstado));
        Estado estado = new Estado((Estado) object);

        if (estado != null) {
            abaAdicionarEstado.setSelectedIndex(0);

            campoNomeEstado.setText(estado.getNome());
            campoUf.setText(estado.getUf());

            campoNomeEstado.requestFocus();

            codigo = estado.getId();

        } else {
            Mensagem.erro("Erro ao consultar estado!", this);
        }
    }//GEN-LAST:event_btnEditarEstadoActionPerformed

    private void btnBuscarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstadoActionPerformed
        new EstadoDao().popularTabela(tblEstado, campoFiltroEstado.getText());
    }//GEN-LAST:event_btnBuscarEstadoActionPerformed

    private void btnLimparBuscaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaEstadoActionPerformed
        campoFiltroEstado.setText("");
        new EstadoDao().popularTabela(tblEstado, campoFiltroEstado.getText());
    }//GEN-LAST:event_btnLimparBuscaEstadoActionPerformed

    private void btnSalvarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEstadoActionPerformed
        Estado estado = new Estado();

        estado.setId(codigo);
        estado.setNome(campoNomeEstado.getText());
        estado.setSlug(Funcoes.textoIdentificador(campoNomeEstado.getText()));
        estado.setUf(campoUf.getText());
        estado.setCriadoEm(Calendar.getInstance());
        estado.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarEstado = false;
        String erroEstado = "";

        if (campoNomeEstado.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarEstado = DaoGenerico.getInstance().inserir(estado);
            } else {
                retornoSalvarEstado = DaoGenerico.getInstance().atualizar(estado);
            }
        } else {
            erroEstado = null;
            Mensagem.erro("Digite um estado válido!", this);
        }

        if (retornoSalvarEstado == true && erroEstado != null) {
            Mensagem.informacao("Estado salvo com sucesso!", this);

            campoNomeEstado.setText("");
            campoUf.setText("");

            campoNomeEstado.requestFocus();

            campoFiltroEstado.setText("");

            codigo = 0;

            new EstadoDao().popularTabela(tblEstado, campoFiltroEstado.getText());
            new ComboDao().popularCombo("estados", 1, 4, comboEstadoId, "");
        } else {
            if (erroEstado != null) {
                Mensagem.aviso("Estado " + campoNomeEstado.getText() + " já existe cadastrado!", this);

                campoNomeEstado.setText("");

                campoNomeEstado.requestFocus();

                campoFiltroEstado.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarEstadoActionPerformed

    private void btnFecharCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCidadeActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharCidadeActionPerformed

    private void btnExcluirCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCidadeActionPerformed
        int codigoExcluirCidade = (int) tblCidade.getValueAt(tblCidade.getSelectedRow(), 0);
        
        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirCidade = DaoGenerico.getInstance().excluir(Cidade.class, codigoExcluirCidade);

            if (retornoExcluirCidade == true) {
                Mensagem.informacao("Cidade excluída com sucesso!", this);
                new CidadeDao().popularTabela(tblCidade, campoFiltroCidade.getText());
            } else {
                Mensagem.erro(tblCidade.getValueAt(tblCidade.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirCidadeActionPerformed

    private void btnEditarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCidadeActionPerformed
        String codigoEditarCidade = String.valueOf(tblCidade.getValueAt(tblCidade.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(Cidade.class, Integer.parseInt(codigoEditarCidade));
        Cidade cidade = new Cidade((Cidade) object);

        ComboItem estadoId = new ComboItem();
        estadoId.setCodigo(cidade.getEstado_id().getId());
        if (cidade != null) {
            abaAdicionarCidade.setSelectedIndex(0);

            campoNomeCidade.setText(cidade.getNome());
            new ComboDao().definirItemCombo(comboEstadoId, estadoId);

            campoNomeCidade.requestFocus();

            codigo = cidade.getId();

        } else {
            Mensagem.erro("Erro ao consultar cidade!", this);
        }
    }//GEN-LAST:event_btnEditarCidadeActionPerformed

    private void btnBuscarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCidadeActionPerformed
        new CidadeDao().popularTabela(tblCidade, campoFiltroCidade.getText());
    }//GEN-LAST:event_btnBuscarCidadeActionPerformed

    private void btnLimparBuscaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaCidadeActionPerformed
        campoFiltroCidade.setText("");
        new CidadeDao().popularTabela(tblCidade, campoFiltroCidade.getText());
    }//GEN-LAST:event_btnLimparBuscaCidadeActionPerformed

    private void btnSalvarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCidadeActionPerformed
        Cidade cidade = new Cidade();

        ComboItem estadoId = (ComboItem) comboEstadoId.getSelectedItem();

        Object object = DaoGenerico.getInstance().obterPorId(Estado.class, estadoId.getCodigo());
        Estado estado = new Estado((Estado) object);

        cidade.setId(codigo);
        cidade.setEstado_id(estado);
        cidade.setNome(campoNomeCidade.getText());
        cidade.setSlug(Funcoes.textoIdentificador(campoNomeCidade.getText()));
        cidade.setCriadoEm(Calendar.getInstance());
        cidade.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarCidade = false;
        String erroCidade = "";

        if (campoNomeCidade.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarCidade = DaoGenerico.getInstance().inserir(cidade);
            } else {
                retornoSalvarCidade = DaoGenerico.getInstance().atualizar(cidade);
            }
        } else {
            erroCidade = null;
            Mensagem.erro("Digite uma cidade válida!", this);
        }

        if (retornoSalvarCidade == true && erroCidade != null) {
            Mensagem.informacao("Cidade salva com sucesso!", this);

            campoNomeCidade.setText("");
            comboEstadoId.setSelectedIndex(0);

            campoNomeCidade.requestFocus();

            campoFiltroCidade.setText("");

            codigo = 0;

            new CidadeDao().popularTabela(tblCidade, campoFiltroCidade.getText());
        } else {
            if (erroCidade != null) {
                Mensagem.aviso("Cidade " + campoNomeCidade.getText() + " já existe cadastrada!", this);

                campoNomeCidade.setText("");

                campoNomeCidade.requestFocus();

                campoFiltroCidade.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarCidadeActionPerformed

    private void btnFecharTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharTecnologiaActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharTecnologiaActionPerformed

    private void btnExcluirTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTecnologiaActionPerformed
        int codigoExcluirTecnologia = (int) tblTecnologia.getValueAt(tblTecnologia.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirTecnologia = DaoGenerico.getInstance().excluir(Tecnologia.class, codigoExcluirTecnologia);

            if (retornoExcluirTecnologia == true) {
                Mensagem.informacao("Tecnologia excluída com sucesso!", this);
                new TecnologiaDao().popularTabela(tblTecnologia, campoFiltroTecnologia.getText());
            } else {
                Mensagem.erro(tblTecnologia.getValueAt(tblTecnologia.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirTecnologiaActionPerformed

    private void btnEditarTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTecnologiaActionPerformed
        String codigoEditarTecnologia = String.valueOf(tblTecnologia.getValueAt(tblTecnologia.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(Tecnologia.class, Integer.parseInt(codigoEditarTecnologia));
        Tecnologia tecnologia = new Tecnologia((Tecnologia) object);

        if (tecnologia != null) {
            abaAdicionarTecnologia.setSelectedIndex(0);

            campoNomeTecnologia.setText(tecnologia.getNome());

            campoNomeTecnologia.requestFocus();

            codigo = tecnologia.getId();

        } else {
            Mensagem.erro("Erro ao consultar tecnologia!", this);
        }
    }//GEN-LAST:event_btnEditarTecnologiaActionPerformed

    private void btnBuscarTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTecnologiaActionPerformed
        new TecnologiaDao().popularTabela(tblTecnologia, campoFiltroTecnologia.getText());
    }//GEN-LAST:event_btnBuscarTecnologiaActionPerformed

    private void btnLimparBuscaTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaTecnologiaActionPerformed
        campoFiltroTecnologia.setText("");
        new TecnologiaDao().popularTabela(tblTecnologia, campoFiltroTecnologia.getText());
    }//GEN-LAST:event_btnLimparBuscaTecnologiaActionPerformed

    private void btnSalvarTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTecnologiaActionPerformed
        Tecnologia tecnologia = new Tecnologia();

        tecnologia.setId(codigo);
        tecnologia.setNome(campoNomeTecnologia.getText());
        tecnologia.setSlug(Funcoes.textoIdentificador(campoNomeTecnologia.getText()));
        tecnologia.setCriadoEm(Calendar.getInstance());
        tecnologia.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarTecnologia = false;
        String erroTecnologia = "";

        if (campoNomeTecnologia.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarTecnologia = DaoGenerico.getInstance().inserir(tecnologia);
            } else {
                retornoSalvarTecnologia = DaoGenerico.getInstance().atualizar(tecnologia);
            }
        } else {
            erroTecnologia = null;
            Mensagem.erro("Digite uma tecnologia válida!", this);
        }

        if (retornoSalvarTecnologia == true && erroTecnologia != null) {
            Mensagem.informacao("Tecnologia salva com sucesso!", this);

            campoNomeTecnologia.setText("");

            campoNomeTecnologia.requestFocus();

            campoFiltroTecnologia.setText("");

            codigo = 0;

            new TecnologiaDao().popularTabela(tblTecnologia, campoFiltroTecnologia.getText());
        } else {
            if (erroTecnologia != null) {
                Mensagem.aviso("Tecnologia " + campoNomeTecnologia.getText() + " já existe cadastrada!", this);

                campoNomeTecnologia.setText("");

                campoNomeTecnologia.requestFocus();

                campoFiltroTecnologia.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarTecnologiaActionPerformed

    private void btnFecharSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharSegurancaActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharSegurancaActionPerformed

    private void btnExcluirSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirSegurancaActionPerformed
        int codigoExcluirSeguranca = (int) tblSeguranca.getValueAt(tblSeguranca.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirSeguranca = DaoGenerico.getInstance().excluir(Seguranca.class, codigoExcluirSeguranca);

            if (retornoExcluirSeguranca == true) {
                Mensagem.informacao("Segurança excluída com sucesso!", this);
                new SegurancaDao().popularTabela(tblSeguranca, campoFiltroSeguranca.getText());
            } else {
                Mensagem.erro(tblSeguranca.getValueAt(tblSeguranca.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirSegurancaActionPerformed

    private void btnEditarSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSegurancaActionPerformed
        String codigoEditarSeguranca = String.valueOf(tblSeguranca.getValueAt(tblSeguranca.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(Seguranca.class, Integer.parseInt(codigoEditarSeguranca));
        Seguranca seguranca = new Seguranca((Seguranca) object);

        if (seguranca != null) {
            abaAdicionarSeguranca.setSelectedIndex(0);

            campoNomeSeguranca.setText(seguranca.getNome());

            campoNomeSeguranca.requestFocus();

            codigo = seguranca.getId();

        } else {
            Mensagem.erro("Erro ao consultar segurança!", this);
        }
    }//GEN-LAST:event_btnEditarSegurancaActionPerformed

    private void btnBuscarSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSegurancaActionPerformed
        new SegurancaDao().popularTabela(tblSeguranca, campoFiltroSeguranca.getText());
    }//GEN-LAST:event_btnBuscarSegurancaActionPerformed

    private void btnLimparBuscaSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaSegurancaActionPerformed
        campoFiltroSeguranca.setText("");
        new SegurancaDao().popularTabela(tblSeguranca, campoFiltroSeguranca.getText());
    }//GEN-LAST:event_btnLimparBuscaSegurancaActionPerformed

    private void btnSalvarSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSegurancaActionPerformed
        Seguranca seguranca = new Seguranca();

        seguranca.setId(codigo);
        seguranca.setNome(campoNomeSeguranca.getText());
        seguranca.setSlug(Funcoes.textoIdentificador(campoNomeSeguranca.getText()));
        seguranca.setCriadoEm(Calendar.getInstance());
        seguranca.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarSeguranca = false;
        String erroSeguranca = "";

        if (campoNomeSeguranca.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarSeguranca = DaoGenerico.getInstance().inserir(seguranca);
            } else {
                retornoSalvarSeguranca = DaoGenerico.getInstance().atualizar(seguranca);
            }
        } else {
            erroSeguranca = null;
            Mensagem.erro("Digite uma segurança válida!", this);
        }

        if (retornoSalvarSeguranca == true && erroSeguranca != null) {
            Mensagem.informacao("Segurança salva com sucesso!", this);

            campoNomeSeguranca.setText("");

            campoNomeSeguranca.requestFocus();

            campoFiltroSeguranca.setText("");

            codigo = 0;

            new SegurancaDao().popularTabela(tblSeguranca, campoFiltroSeguranca.getText());
        } else {
            if (erroSeguranca != null) {
                Mensagem.aviso("Segurança " + campoNomeSeguranca.getText() + " já existe cadastrada!", this);

                campoNomeSeguranca.setText("");

                campoNomeSeguranca.requestFocus();

                campoFiltroSeguranca.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarSegurancaActionPerformed

    private void btnFecharExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharExtraActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharExtraActionPerformed

    private void btnExcluirExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirExtraActionPerformed
        int codigoExcluirExtra = (int) tblExtra.getValueAt(tblExtra.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirExtra = DaoGenerico.getInstance().excluir(Extra.class, codigoExcluirExtra);

            if (retornoExcluirExtra == true) {
                Mensagem.informacao("Extra excluído com sucesso!", this);
                new ExtraDao().popularTabela(tblExtra, campoFiltroExtra.getText());
            } else {
                Mensagem.erro(tblExtra.getValueAt(tblExtra.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirExtraActionPerformed

    private void btnEditarExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarExtraActionPerformed
        String codigoEditarExtra = String.valueOf(tblExtra.getValueAt(tblExtra.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(Extra.class, Integer.parseInt(codigoEditarExtra));
        Extra extra = new Extra((Extra) object);

        if (extra != null) {
            abaAdicionarExtra.setSelectedIndex(0);

            campoNomeExtra.setText(extra.getNome());

            campoNomeExtra.requestFocus();

            codigo = extra.getId();

        } else {
            Mensagem.erro("Erro ao consultar extra!", this);
        }
    }//GEN-LAST:event_btnEditarExtraActionPerformed

    private void btnBuscarExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarExtraActionPerformed
        new ExtraDao().popularTabela(tblExtra, campoFiltroExtra.getText());
    }//GEN-LAST:event_btnBuscarExtraActionPerformed

    private void btnLimparBuscaExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaExtraActionPerformed
        campoFiltroExtra.setText("");
        new ExtraDao().popularTabela(tblExtra, campoFiltroExtra.getText());
    }//GEN-LAST:event_btnLimparBuscaExtraActionPerformed

    private void btnSalvarExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarExtraActionPerformed
        Extra extra = new Extra();

        extra.setId(codigo);
        extra.setNome(campoNomeExtra.getText());
        extra.setSlug(Funcoes.textoIdentificador(campoNomeExtra.getText()));
        extra.setCriadoEm(Calendar.getInstance());
        extra.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarExtra = false;
        String erroExtra = "";

        if (campoNomeExtra.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarExtra = DaoGenerico.getInstance().inserir(extra);
            } else {
                retornoSalvarExtra = DaoGenerico.getInstance().atualizar(extra);
            }
        } else {
            erroExtra = null;
            Mensagem.erro("Digite um extra válido!", this);
        }

        if (retornoSalvarExtra == true && erroExtra != null) {
            Mensagem.informacao("Extra salvo com sucesso!", this);

            campoNomeExtra.setText("");

            campoNomeExtra.requestFocus();

            campoFiltroExtra.setText("");

            codigo = 0;

            new ExtraDao().popularTabela(tblExtra, campoFiltroExtra.getText());
        } else {
            if (erroExtra != null) {
                Mensagem.aviso("Extra " + campoNomeExtra.getText() + " já existe cadastrado!", this);

                campoNomeExtra.setText("");

                campoNomeExtra.requestFocus();

                campoFiltroExtra.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarExtraActionPerformed

    private void btnFecharEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharEstiloActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharEstiloActionPerformed

    private void btnExcluirEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEstiloActionPerformed
        int codigoExcluirEstilo = (int) tblEstilo.getValueAt(tblEstilo.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirEstilo = DaoGenerico.getInstance().excluir(Estilo.class, codigoExcluirEstilo);

            if (retornoExcluirEstilo == true) {
                Mensagem.informacao("Estilo excluído com sucesso!", this);
                new EstiloDao().popularTabela(tblEstilo, campoFiltroEstilo.getText());
            } else {
                Mensagem.erro(tblEstilo.getValueAt(tblEstilo.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirEstiloActionPerformed

    private void btnEditarEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstiloActionPerformed
        String codigoEditarEstilo = String.valueOf(tblEstilo.getValueAt(tblEstilo.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(Estilo.class, Integer.parseInt(codigoEditarEstilo));
        Estilo estilo = new Estilo((Estilo) object);

        if (estilo != null) {
            abaAdicionarEstilo.setSelectedIndex(0);

            campoNomeEstilo.setText(estilo.getNome());

            campoNomeEstilo.requestFocus();

            codigo = estilo.getId();

        } else {
            Mensagem.erro("Erro ao consultar estilo!", this);
        }
    }//GEN-LAST:event_btnEditarEstiloActionPerformed

    private void btnBuscarEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstiloActionPerformed
        new EstiloDao().popularTabela(tblEstilo, campoFiltroEstilo.getText());
    }//GEN-LAST:event_btnBuscarEstiloActionPerformed

    private void btnLimparBuscaEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaEstiloActionPerformed
        campoFiltroEstilo.setText("");
        new EstiloDao().popularTabela(tblEstilo, campoFiltroEstilo.getText());
    }//GEN-LAST:event_btnLimparBuscaEstiloActionPerformed

    private void btnSalvarEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEstiloActionPerformed
        Estilo estilo = new Estilo();

        estilo.setId(codigo);
        estilo.setNome(campoNomeEstilo.getText());
        estilo.setSlug(Funcoes.textoIdentificador(campoNomeEstilo.getText()));
        estilo.setCriadoEm(Calendar.getInstance());
        estilo.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarEstilo = false;
        String erroEstilo = "";

        if (campoNomeEstilo.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarEstilo = DaoGenerico.getInstance().inserir(estilo);
            } else {
                retornoSalvarEstilo = DaoGenerico.getInstance().atualizar(estilo);
            }
        } else {
            erroEstilo = null;
            Mensagem.erro("Digite um estilo válido!", this);
        }

        if (retornoSalvarEstilo == true && erroEstilo != null) {
            Mensagem.informacao("Estilo salvo com sucesso!", this);

            campoNomeEstilo.setText("");

            campoNomeEstilo.requestFocus();

            campoFiltroEstilo.setText("");

            codigo = 0;

            new EstiloDao().popularTabela(tblEstilo, campoFiltroEstilo.getText());
        } else {
            if (erroEstilo != null) {
                Mensagem.aviso("Estilo " + campoNomeEstilo.getText() + " já existe cadastrado!", this);

                campoNomeEstilo.setText("");

                campoNomeEstilo.requestFocus();

                campoFiltroEstilo.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarEstiloActionPerformed

    private void btnFecharCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCorInternaActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharCorInternaActionPerformed

    private void btnExcluirCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCorInternaActionPerformed
        int codigoExcluirCorInterna = (int) tblCorInterna.getValueAt(tblCorInterna.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirCorInterna = DaoGenerico.getInstance().excluir(CorInterna.class, codigoExcluirCorInterna);

            if (retornoExcluirCorInterna == true) {
                Mensagem.informacao("Cor interna excluída com sucesso!", this);
                new CorInternaDao().popularTabela(tblCorInterna, campoFiltroCorInterna.getText());
            } else {
                Mensagem.erro(tblCorInterna.getValueAt(tblCorInterna.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirCorInternaActionPerformed

    private void btnEditarCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCorInternaActionPerformed
        String codigoEditarCorInterna = String.valueOf(tblCorInterna.getValueAt(tblCorInterna.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(CorInterna.class, Integer.parseInt(codigoEditarCorInterna));
        CorInterna corInterna = new CorInterna((CorInterna) object);

        if (corInterna != null) {
            abaAdicionarCorInterna.setSelectedIndex(0);

            campoNomeCorInterna.setText(corInterna.getNome());

            campoNomeCorInterna.requestFocus();

            codigo = corInterna.getId();

        } else {
            Mensagem.erro("Erro ao consultar cor interna!", this);
        }
    }//GEN-LAST:event_btnEditarCorInternaActionPerformed

    private void btnBuscarCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCorInternaActionPerformed
        new CorInternaDao().popularTabela(tblCorInterna, campoFiltroCorInterna.getText());
    }//GEN-LAST:event_btnBuscarCorInternaActionPerformed

    private void btnLimparBuscaCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaCorInternaActionPerformed
        campoFiltroCorInterna.setText("");
        new CorInternaDao().popularTabela(tblCorInterna, campoFiltroCorInterna.getText());
    }//GEN-LAST:event_btnLimparBuscaCorInternaActionPerformed

    private void btnSalvarCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCorInternaActionPerformed
        CorInterna corInterna = new CorInterna();

        corInterna.setId(codigo);
        corInterna.setNome(campoNomeCorInterna.getText());
        corInterna.setSlug(Funcoes.textoIdentificador(campoNomeCorInterna.getText()));
        corInterna.setCriadoEm(Calendar.getInstance());
        corInterna.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarCorInterna = false;
        String erroCorInterna = "";

        if (campoNomeCorInterna.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarCorInterna = DaoGenerico.getInstance().inserir(corInterna);
            } else {
                retornoSalvarCorInterna = DaoGenerico.getInstance().atualizar(corInterna);
            }
        } else {
            erroCorInterna = null;
            Mensagem.erro("Digite uma cor interna válida!", this);
        }

        if (retornoSalvarCorInterna == true && erroCorInterna != null) {
            Mensagem.informacao("Cor interna salva com sucesso!", this);

            campoNomeCorInterna.setText("");

            campoNomeCorInterna.requestFocus();

            campoFiltroCorInterna.setText("");

            codigo = 0;

            new CorInternaDao().popularTabela(tblCorInterna, campoFiltroCorInterna.getText());
        } else {
            if (erroCorInterna != null) {
                Mensagem.aviso("Cor interna " + campoNomeCorInterna.getText() + " já existe cadastrada!", this);

                campoNomeCorInterna.setText("");

                campoNomeCorInterna.requestFocus();

                campoFiltroCorInterna.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarCorInternaActionPerformed

    private void btnFecharCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCorExternaActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharCorExternaActionPerformed

    private void btnExcluirCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCorExternaActionPerformed
        int codigoExcluirCorExterna = (int) tblCorExterna.getValueAt(tblCorExterna.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirCorExterna = DaoGenerico.getInstance().excluir(CorExterna.class, codigoExcluirCorExterna);

            if (retornoExcluirCorExterna == true) {
                Mensagem.informacao("Cor externa excluída com sucesso!", this);
                new CorExternaDao().popularTabela(tblCorExterna, campoFiltroCorExterna.getText());
            } else {
                Mensagem.erro(tblCorExterna.getValueAt(tblCorExterna.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirCorExternaActionPerformed

    private void btnEditarCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCorExternaActionPerformed
        String codigoEditarCorExterna = String.valueOf(tblCorExterna.getValueAt(tblCorExterna.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(CorExterna.class, Integer.parseInt(codigoEditarCorExterna));
        CorExterna corExterna = new CorExterna((CorExterna) object);

        if (corExterna != null) {
            abaAdicionarCorExterna.setSelectedIndex(0);

            campoNomeCorExterna.setText(corExterna.getNome());

            campoNomeCorExterna.requestFocus();

            codigo = corExterna.getId();

        } else {
            Mensagem.erro("Erro ao consultar cor externa!", this);
        }
    }//GEN-LAST:event_btnEditarCorExternaActionPerformed

    private void btnBuscarCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCorExternaActionPerformed
        new CorExternaDao().popularTabela(tblCorExterna, campoFiltroCorExterna.getText());
    }//GEN-LAST:event_btnBuscarCorExternaActionPerformed

    private void btnLimparBuscaCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaCorExternaActionPerformed
        campoFiltroCorExterna.setText("");
        new CorExternaDao().popularTabela(tblCorExterna, campoFiltroCorExterna.getText());
    }//GEN-LAST:event_btnLimparBuscaCorExternaActionPerformed

    private void btnSalvarCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCorExternaActionPerformed
        CorExterna corExterna = new CorExterna();

        corExterna.setId(codigo);
        corExterna.setNome(campoNomeCorExterna.getText());
        corExterna.setSlug(Funcoes.textoIdentificador(campoNomeCorExterna.getText()));
        corExterna.setCriadoEm(Calendar.getInstance());
        corExterna.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarCorExterna = false;
        String erroCorExterna = "";

        if (campoNomeCorExterna.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarCorExterna = DaoGenerico.getInstance().inserir(corExterna);
            } else {
                retornoSalvarCorExterna = DaoGenerico.getInstance().atualizar(corExterna);
            }
        } else {
            erroCorExterna = null;
            Mensagem.erro("Digite uma cor externa válida!", this);
        }

        if (retornoSalvarCorExterna == true && erroCorExterna != null) {
            Mensagem.informacao("Cor externa salva com sucesso!", this);

            campoNomeCorExterna.setText("");

            campoNomeCorExterna.requestFocus();

            campoFiltroCorExterna.setText("");

            codigo = 0;

            new CorExternaDao().popularTabela(tblCorExterna, campoFiltroCorExterna.getText());
        } else {
            if (erroCorExterna != null) {
                Mensagem.aviso("Cor externa " + campoNomeCorExterna.getText() + " já existe cadastrada!", this);

                campoNomeCorExterna.setText("");

                campoNomeCorExterna.requestFocus();

                campoFiltroCorExterna.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarCorExternaActionPerformed

    private void btnFecharConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharConfortoActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharConfortoActionPerformed

    private void btnExcluirConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirConfortoActionPerformed
        int codigoExcluirConforto = (int) tblConforto.getValueAt(tblConforto.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirConforto = DaoGenerico.getInstance().excluir(Conforto.class, codigoExcluirConforto);

            if (retornoExcluirConforto == true) {
                Mensagem.informacao("Conforto excluído com sucesso!", this);
                new ConfortoDao().popularTabela(tblConforto, campoFiltroConforto.getText());
            } else {
                Mensagem.erro(tblConforto.getValueAt(tblConforto.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirConfortoActionPerformed

    private void btnEditarConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarConfortoActionPerformed
        String codigoEditarConforto = String.valueOf(tblConforto.getValueAt(tblConforto.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(Conforto.class, Integer.parseInt(codigoEditarConforto));
        Conforto conforto = new Conforto((Conforto) object);

        if (conforto != null) {
            abaAdicionarConforto.setSelectedIndex(0);

            campoNomeConforto.setText(conforto.getNome());

            campoNomeConforto.requestFocus();

            codigo = conforto.getId();

        } else {
            Mensagem.erro("Erro ao consultar conforto!", this);
        }
    }//GEN-LAST:event_btnEditarConfortoActionPerformed

    private void btnBuscarConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConfortoActionPerformed
        new ConfortoDao().popularTabela(tblConforto, campoFiltroConforto.getText());
    }//GEN-LAST:event_btnBuscarConfortoActionPerformed

    private void btnLimparBuscaConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaConfortoActionPerformed
        campoFiltroConforto.setText("");
        new ConfortoDao().popularTabela(tblConforto, campoFiltroConforto.getText());
    }//GEN-LAST:event_btnLimparBuscaConfortoActionPerformed

    private void btnSalvarConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarConfortoActionPerformed
        Conforto conforto = new Conforto();

        conforto.setId(codigo);
        conforto.setNome(campoNomeConforto.getText());
        conforto.setSlug(Funcoes.textoIdentificador(campoNomeConforto.getText()));
        conforto.setCriadoEm(Calendar.getInstance());
        conforto.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarConforto = false;
        String erroConforto = "";

        if (campoNomeConforto.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarConforto = DaoGenerico.getInstance().inserir(conforto);
            } else {
                retornoSalvarConforto = DaoGenerico.getInstance().atualizar(conforto);
            }
        } else {
            erroConforto = null;
            Mensagem.erro("Digite um conforto válido!", this);
        }

        if (retornoSalvarConforto == true && erroConforto != null) {
            Mensagem.informacao("Conforto salvo com sucesso!", this);

            campoNomeConforto.setText("");

            campoNomeConforto.requestFocus();

            campoFiltroConforto.setText("");

            codigo = 0;

            new ConfortoDao().popularTabela(tblConforto, campoFiltroConforto.getText());
        } else {
            if (erroConforto != null) {
                Mensagem.aviso("Conforto " + campoNomeConforto.getText() + " já existe cadastrado!", this);

                campoNomeConforto.setText("");

                campoNomeConforto.requestFocus();

                campoFiltroConforto.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarConfortoActionPerformed

    private void btnFecharCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCombustivelActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharCombustivelActionPerformed

    private void btnExcluirCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCombustivelActionPerformed
        int codigoExcluirCombustivel = (int) tblCombustivel.getValueAt(tblCombustivel.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirCombustivel = DaoGenerico.getInstance().excluir(Combustivel.class, codigoExcluirCombustivel);

            if (retornoExcluirCombustivel == true) {
                Mensagem.informacao("Combustível excluído com sucesso!", this);
                new CombustivelDao().popularTabela(tblCombustivel, campoFiltroCombustivel.getText());
            } else {
                Mensagem.erro(tblCombustivel.getValueAt(tblCombustivel.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirCombustivelActionPerformed

    private void btnEditarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCombustivelActionPerformed
        String codigoEditarCombustivel = String.valueOf(tblCombustivel.getValueAt(tblCombustivel.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(Combustivel.class, Integer.parseInt(codigoEditarCombustivel));
        Combustivel combustivel = new Combustivel((Combustivel) object);

        if (combustivel != null) {
            abaAdicionarCombustivel.setSelectedIndex(0);

            campoNomeCombustivel.setText(combustivel.getNome());

            campoNomeCombustivel.requestFocus();

            codigo = combustivel.getId();

        } else {
            Mensagem.erro("Erro ao consultar combustível!", this);
        }
    }//GEN-LAST:event_btnEditarCombustivelActionPerformed

    private void btnBuscarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCombustivelActionPerformed
        new CombustivelDao().popularTabela(tblCombustivel, campoFiltroCombustivel.getText());
    }//GEN-LAST:event_btnBuscarCombustivelActionPerformed

    private void btnLimparBuscaCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaCombustivelActionPerformed
        campoFiltroCombustivel.setText("");
        new CombustivelDao().popularTabela(tblCombustivel, campoFiltroCombustivel.getText());
    }//GEN-LAST:event_btnLimparBuscaCombustivelActionPerformed

    private void btnSalvarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCombustivelActionPerformed
        Combustivel combustivel = new Combustivel();

        combustivel.setId(codigo);
        combustivel.setNome(campoNomeCombustivel.getText());
        combustivel.setSlug(Funcoes.textoIdentificador(campoNomeCombustivel.getText()));
        combustivel.setCriadoEm(Calendar.getInstance());
        combustivel.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarCombustivel = false;
        String erroCombustivel = "";

        if (campoNomeCombustivel.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarCombustivel = DaoGenerico.getInstance().inserir(combustivel);
            } else {
                retornoSalvarCombustivel = DaoGenerico.getInstance().atualizar(combustivel);
            }
        } else {
            erroCombustivel = null;
            Mensagem.erro("Digite um combustível válido!", this);
        }

        if (retornoSalvarCombustivel == true && erroCombustivel != null) {
            Mensagem.informacao("Combustível salvo com sucesso!", this);

            campoNomeCombustivel.setText("");

            campoNomeCombustivel.requestFocus();

            campoFiltroCombustivel.setText("");

            codigo = 0;

            new CombustivelDao().popularTabela(tblCombustivel, campoFiltroCombustivel.getText());
        } else {
            if (erroCombustivel != null) {
                Mensagem.aviso("Combustível " + campoNomeCombustivel.getText() + " já existe cadastrado!", this);

                campoNomeCombustivel.setText("");

                campoNomeCombustivel.requestFocus();

                campoFiltroCombustivel.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarCombustivelActionPerformed

    private void btnFecharCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCarroceriaActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharCarroceriaActionPerformed

    private void btnExcluirCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCarroceriaActionPerformed
        int codigoExcluirCarroceria = (int) tblCarroceria.getValueAt(tblCarroceria.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirCarroceria = DaoGenerico.getInstance().excluir(Carroceria.class, codigoExcluirCarroceria);

            if (retornoExcluirCarroceria == true) {
                Mensagem.informacao("Carroceria excluída com sucesso!", this);
                new CarroceriaDao().popularTabela(tblCarroceria, campoFiltroCarroceria.getText());
            } else {
                Mensagem.erro(tblCarroceria.getValueAt(tblCarroceria.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirCarroceriaActionPerformed

    private void btnEditarCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCarroceriaActionPerformed
        String codigoEditarCarroceria = String.valueOf(tblCarroceria.getValueAt(tblCarroceria.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(Carroceria.class, Integer.parseInt(codigoEditarCarroceria));
        Carroceria carroceria = new Carroceria((Carroceria) object);

        if (carroceria != null) {
            abaAdicionarCarroceria.setSelectedIndex(0);

            campoNomeCarroceria.setText(carroceria.getNome());

            campoNomeCarroceria.requestFocus();

            codigo = carroceria.getId();

        } else {
            Mensagem.erro("Erro ao consultar carroceria!", this);
        }
    }//GEN-LAST:event_btnEditarCarroceriaActionPerformed

    private void btnBuscarCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCarroceriaActionPerformed
        new CarroceriaDao().popularTabela(tblCarroceria, campoFiltroCarroceria.getText());
    }//GEN-LAST:event_btnBuscarCarroceriaActionPerformed

    private void btnLimparBuscaCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaCarroceriaActionPerformed
        campoFiltroCarroceria.setText("");
        new CarroceriaDao().popularTabela(tblCarroceria, campoFiltroCarroceria.getText());
    }//GEN-LAST:event_btnLimparBuscaCarroceriaActionPerformed

    private void btnSalvarCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCarroceriaActionPerformed
        Carroceria carroceria = new Carroceria();

        carroceria.setId(codigo);
        carroceria.setNome(campoNomeCarroceria.getText());
        carroceria.setSlug(Funcoes.textoIdentificador(campoNomeCarroceria.getText()));
        carroceria.setCriadoEm(Calendar.getInstance());
        carroceria.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarCarroceria = false;
        String erroCarroceria = "";

        if (campoNomeCarroceria.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarCarroceria = DaoGenerico.getInstance().inserir(carroceria);
            } else {
                retornoSalvarCarroceria = DaoGenerico.getInstance().atualizar(carroceria);
            }
        } else {
            erroCarroceria = null;
            Mensagem.erro("Digite uma carroceria válida!", this);
        }

        if (retornoSalvarCarroceria == true && erroCarroceria != null) {
            Mensagem.informacao("Carroceria salva com sucesso!", this);

            campoNomeCarroceria.setText("");

            campoNomeCarroceria.requestFocus();

            campoFiltroCarroceria.setText("");

            codigo = 0;

            new CarroceriaDao().popularTabela(tblCarroceria, campoFiltroCarroceria.getText());
        } else {
            if (erroCarroceria != null) {
                Mensagem.aviso("Carroceria " + campoNomeCarroceria.getText() + " já existe cadastrada!", this);

                campoNomeCarroceria.setText("");

                campoNomeCarroceria.requestFocus();

                campoFiltroCarroceria.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarCarroceriaActionPerformed

    private void btnFecharCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCambioActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharCambioActionPerformed

    private void btnExcluirCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCambioActionPerformed
        int codigoExcluirCambio = (int) tblCambio.getValueAt(tblCambio.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirCambio = DaoGenerico.getInstance().excluir(Cambio.class, codigoExcluirCambio);

            if (retornoExcluirCambio == true) {
                Mensagem.informacao("Câmbio excluído com sucesso!", this);
                new CambioDao().popularTabela(tblCambio, campoFiltroCambio.getText());
            } else {
                Mensagem.erro(tblCambio.getValueAt(tblCambio.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirCambioActionPerformed

    private void btnEditarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCambioActionPerformed
        String codigoEditarCambio = String.valueOf(tblCambio.getValueAt(tblCambio.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(Cambio.class, Integer.parseInt(codigoEditarCambio));
        Cambio cambio = new Cambio((Cambio) object);

        if (cambio != null) {
            abaAdicionarCambio.setSelectedIndex(0);

            campoNomeCambio.setText(cambio.getNome());

            campoNomeCambio.requestFocus();

            codigo = cambio.getId();

        } else {
            Mensagem.erro("Erro ao consultar câmbio!", this);
        }
    }//GEN-LAST:event_btnEditarCambioActionPerformed

    private void btnBuscarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCambioActionPerformed
        new CambioDao().popularTabela(tblCambio, campoFiltroCambio.getText());
    }//GEN-LAST:event_btnBuscarCambioActionPerformed

    private void btnLimparBuscaCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaCambioActionPerformed
        campoFiltroCambio.setText("");
        new CambioDao().popularTabela(tblCambio, campoFiltroCambio.getText());
    }//GEN-LAST:event_btnLimparBuscaCambioActionPerformed

    private void btnSalvarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCambioActionPerformed
        Cambio cambio = new Cambio();

        cambio.setId(codigo);
        cambio.setNome(campoNomeCambio.getText());
        cambio.setSlug(Funcoes.textoIdentificador(campoNomeCambio.getText()));
        cambio.setCriadoEm(Calendar.getInstance());
        cambio.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarCambio = false;
        String erroCambio = "";

        if (campoNomeCambio.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarCambio = DaoGenerico.getInstance().inserir(cambio);
            } else {
                retornoSalvarCambio = DaoGenerico.getInstance().atualizar(cambio);
            }
        } else {
            erroCambio = null;
            Mensagem.erro("Digite um câmbio válido!", this);
        }

        if (retornoSalvarCambio == true && erroCambio != null) {
            Mensagem.informacao("Câmbio salvo com sucesso!", this);

            campoNomeCambio.setText("");

            campoNomeCambio.requestFocus();

            campoFiltroCambio.setText("");

            codigo = 0;

            new CambioDao().popularTabela(tblCambio, campoFiltroCambio.getText());
        } else {
            if (erroCambio != null) {
                Mensagem.aviso("Cambio " + campoNomeCambio.getText() + " já existe cadastrado!", this);

                campoNomeCambio.setText("");

                campoNomeCambio.requestFocus();

                campoFiltroCambio.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarCambioActionPerformed

    private void btnFecharAcabamentoInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharAcabamentoInternoActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharAcabamentoInternoActionPerformed

    private void btnExcluirAcabamentoInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAcabamentoInternoActionPerformed
        int codigoExcluirAcabamentoInterno = (int) tblAcabamentoInterno.getValueAt(tblAcabamentoInterno.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirAcabamentoInterno = DaoGenerico.getInstance().excluir(AcabamentoInterno.class, codigoExcluirAcabamentoInterno);

            if (retornoExcluirAcabamentoInterno == true) {
                Mensagem.informacao("Acabamento interno excluído com sucesso!", this);
                new AcabamentoInternoDao().popularTabela(tblAcabamentoInterno, campoFiltroAcabamentoInterno.getText());
            } else {
                Mensagem.erro(tblAcabamentoInterno.getValueAt(tblAcabamentoInterno.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirAcabamentoInternoActionPerformed

    private void btnEditarAcabamentoInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAcabamentoInternoActionPerformed
        String codigoEditarAcabamentoInterno = String.valueOf(tblAcabamentoInterno.getValueAt(tblAcabamentoInterno.getSelectedRow(), 0));

        Object object = DaoGenerico.getInstance().obterPorId(AcabamentoInterno.class, Integer.parseInt(codigoEditarAcabamentoInterno));
        AcabamentoInterno acabamentoInterno = new AcabamentoInterno((AcabamentoInterno) object);

        if (acabamentoInterno != null) {
            abaAdicionarAcabamentoInterno.setSelectedIndex(0);

            campoNomeAcabamentoInterno.setText(acabamentoInterno.getNome());

            campoNomeAcabamentoInterno.requestFocus();

            codigo = acabamentoInterno.getId();

        } else {
            Mensagem.erro("Erro ao consultar acabamento interno!", this);
        }
    }//GEN-LAST:event_btnEditarAcabamentoInternoActionPerformed

    private void btnBuscarAcabamentoInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAcabamentoInternoActionPerformed
        new AcabamentoInternoDao().popularTabela(tblAcabamentoInterno, campoFiltroAcabamentoInterno.getText());
    }//GEN-LAST:event_btnBuscarAcabamentoInternoActionPerformed

    private void btnLimparBuscaAcabamentoInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaAcabamentoInternoActionPerformed
        campoFiltroAcabamentoInterno.setText("");
        new AcabamentoInternoDao().popularTabela(tblAcabamentoInterno, campoFiltroAcabamentoInterno.getText());
    }//GEN-LAST:event_btnLimparBuscaAcabamentoInternoActionPerformed

    private void btnSalvarAcabamentoInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAcabamentoInternoActionPerformed
        AcabamentoInterno acabamentoInterno = new AcabamentoInterno();

        acabamentoInterno.setId(codigo);
        acabamentoInterno.setNome(campoNomeAcabamentoInterno.getText());
        acabamentoInterno.setSlug(Funcoes.textoIdentificador(campoNomeAcabamentoInterno.getText()));
        acabamentoInterno.setCriadoEm(Calendar.getInstance());
        acabamentoInterno.setAlteradoEm(Calendar.getInstance());

        boolean retornoSalvarAcabamentoInterno = false;
        String erroAcabamentoInterno = "";

        if (campoNomeAcabamentoInterno.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarAcabamentoInterno = DaoGenerico.getInstance().inserir(acabamentoInterno);
            } else {
                retornoSalvarAcabamentoInterno = DaoGenerico.getInstance().atualizar(acabamentoInterno);
            }
        } else {
            erroAcabamentoInterno = null;
            Mensagem.erro("Digite um acabamento interno válido!", this);
        }

        if (retornoSalvarAcabamentoInterno == true && erroAcabamentoInterno != null) {
            Mensagem.informacao("Acabamento interno salvo com sucesso!", this);

        Object object = DaoGenerico.getInstance().obterPorId(Cidade.class, Integer.parseInt(codigoEditarCidade));
        Cidade cidade = new Cidade((Cidade) object);

        ComboItem estadoId = new ComboItem();
        estadoId.setCodigo(cidade.getEstado_id().getId());
        if (cidade != null) {
            abaAdicionarCidade.setSelectedIndex(0);

            campoNomeAcabamentoInterno.requestFocus();

            campoFiltroAcabamentoInterno.setText("");

            codigo = 0;

            new AcabamentoInternoDao().popularTabela(tblAcabamentoInterno, campoFiltroAcabamentoInterno.getText());
        } else {
            if (erroAcabamentoInterno != null) {
                Mensagem.aviso("Acabamento interno " + campoNomeAcabamentoInterno.getText() + " já existe cadastrado!", this);

                campoNomeAcabamentoInterno.setText("");

                campoNomeAcabamentoInterno.requestFocus();

                campoFiltroAcabamentoInterno.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarAcabamentoInternoActionPerformed


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
    private javax.swing.JTabbedPane abaAdicionarPerfil2;
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
    private javax.swing.JTextField campoUf;
    private javax.swing.JComboBox<String> comboEstadoId;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
