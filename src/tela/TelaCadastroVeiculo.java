package tela;

import dao.ComboDao;
import dao.ConfortoDao;
import dao.DaoGenerico;
import dao.EstiloDao;
import dao.ExtraDao;
import dao.PermissaoDao;
import dao.SegurancaDao;
import dao.TecnologiaDao;
import dao.VeiculoConfortoDao;
import dao.VeiculoDao;
import dao.VeiculoEstiloDao;
import dao.VeiculoExtraDao;
import dao.VeiculoSegurancaDao;
import dao.VeiculoTecnologiaDao;
import entidade.AcabamentoInterno;
import entidade.Cambio;
import entidade.CorExterna;
import entidade.CorInterna;
import entidade.SituacaoVeiculo;
import entidade.Veiculo;
import entidade.Versao;
import functions.ComboItem;
import functions.Formatacao;
import functions.Funcoes;
import functions.GerenciarJanelas;
import functions.Mensagem;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaCadastroVeiculo extends javax.swing.JInternalFrame {

    private static TelaCadastroVeiculo tela;
    int codigo = 0;
    LocalDate now = LocalDate.now();
    PermissaoDao peDAO = new PermissaoDao();

    public TelaCadastroVeiculo() {
        initComponents();
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("images/car.png"));
        this.setFrameIcon(icon);
        campoIdVersaoBusca.setEditable(false);
        campoNomeVersaoBusca.setEditable(false);
        new ComboDao().popularCombo("cores_internas", 1, 4, comboCorInternaId, "");
        new ComboDao().popularCombo("cores_externas", 1, 4, comboCorExternaId, "");
        new ComboDao().popularCombo("acabamentos_internos", 1, 4, comboAcabamentoInternoId, "");
        new ComboDao().popularCombo("cambios", 1, 4, comboCambioId, "");
        new ComboDao().popularCombo("situacoes_veiculos", comboSituacaoVeiculoId);
        new ComboDao().popularCombo("situacoes_veiculos", comboFiltroSituacaoVeiculoId);
        new ComboDao().popularCombo("marcas", 1, 4, comboFiltroMarcaId, "");
        Formatacao.formatarData(campoFiltroDataDe);
        Formatacao.formatarData(campoFiltroDataAte);
        campoFiltroDataDe.setText(Formatacao.getDataMes());
        campoFiltroDataAte.setText(Formatacao.ajustaDataDMA(now.toString()));
        new VeiculoDao().popularTabela(tblVeiculo, "", "", "", "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
        verificaPermissoes();
    }

    public static TelaCadastroVeiculo getInstancia() {
        if (tela == null) {
            tela = new TelaCadastroVeiculo();
        }
        return tela;
    }

    private void funcaoFechar() {
        GerenciarJanelas.fecharJanela(tela);
        tela = null;
    }

    private void verificaPermissoes() {
        if (!peDAO.consultarPermissao("Salvar", "veiculoinfo")) {
            btnSalvar.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("Procurar", "veiculoinfo")) {
            btnBuscaVersao.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("ComboSituacao", "veiculoinfo")) {
            comboSituacaoVeiculoId.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("ComboCorExt", "veiculoinfo")) {
            comboCorExternaId.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("ComboCorInt", "veiculoinfo")) {
            comboCorInternaId.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("ComboAcabInt", "veiculoinfo")) {
            comboAcabamentoInternoId.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("ComboCambio", "veiculoinfo")) {
            comboCambioId.setEnabled(false);
        }

        if (peDAO.consultarPermissao("Listar", "veiculoconf")) {
            new ConfortoDao().listarConforto(tblConforto, "");
        }

        if (peDAO.consultarPermissao("Listar", "veiculoesti")) {
            new EstiloDao().listarEstilo(tblEstilo, "");
        }

        if (peDAO.consultarPermissao("Listar", "veiculoextr")) {
            new ExtraDao().listarExtra(tblExtra, "");
        }

        if (peDAO.consultarPermissao("Listar", "veiculosegu")) {
            new SegurancaDao().listarSeguranca(tblSeguranca, "");
        }

        if (peDAO.consultarPermissao("Listar", "veiculotecn")) {
            new TecnologiaDao().listarTecnologia(tblTecnologia, "");
        }

        if (!peDAO.consultarPermissao("ComboSituacao", "veiculolist")) {
            comboFiltroSituacaoVeiculoId.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("ComboMarca", "veiculolist")) {
            comboFiltroMarcaId.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("Buscar", "veiculolist")) {
            btnBuscar.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("LimparBusca", "veiculolist")) {
            btnLimparBusca.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("Editar", "veiculolist")) {
            btnEditar.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("Excluir", "veiculolist")) {
            btnExcluir.setEnabled(false);
        }
        if (peDAO.consultarPermissao("Listar", "veiculolist")) {
            new VeiculoDao().popularTabela(tblVeiculo, "", "", "", "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agrupadorManualVeiculo = new javax.swing.ButtonGroup();
        agrupadorBlindado = new javax.swing.ButtonGroup();
        agrupadorChaveReserva = new javax.swing.ButtonGroup();
        agrupadorIpva = new javax.swing.ButtonGroup();
        agrupadorVistoriado = new javax.swing.ButtonGroup();
        agrupadorExibirSite = new javax.swing.ButtonGroup();
        abaVeiculo = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnFecharCadastro = new javax.swing.JButton();
        abaInformacoes = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        campoIdVersaoBusca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoNomeVersaoBusca = new javax.swing.JTextField();
        btnBuscaVersao = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comboCorExternaId = new javax.swing.JComboBox<>();
        comboCorInternaId = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        comboAcabamentoInternoId = new javax.swing.JComboBox<>();
        campoChassi = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        comboCambioId = new javax.swing.JComboBox<>();
        campoRenavam = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        comboSituacaoVeiculoId = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        campoPlaca = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        campoQuilometragem = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoInformacoesVeiculo = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        campoNumeroProprietario = new javax.swing.JTextField();
        campoNumeroOcorrencia = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        radioChaveReservaSim = new javax.swing.JRadioButton();
        radioChaveReservaNao = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        radioManualVeiculoSim = new javax.swing.JRadioButton();
        radioManualVeiculoNao = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        radioBlindadoSim = new javax.swing.JRadioButton();
        radioBlindadoNao = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        radioIpvaPagoSim = new javax.swing.JRadioButton();
        radioIpvaPagoNao = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        radioVistoriadoSim = new javax.swing.JRadioButton();
        radioVistoriadoNao = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        campoGarantia = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        radioExibirSiteSim = new javax.swing.JRadioButton();
        radioExibirSiteNao = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblConforto = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblEstilo = new javax.swing.JTable();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblExtra = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblSeguranca = new javax.swing.JTable();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblTecnologia = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLimparBusca = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        campoFiltroPlaca = new javax.swing.JTextField();
        campoFiltroVersao = new javax.swing.JTextField();
        comboFiltroSituacaoVeiculoId = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoFiltroModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboFiltroMarcaId = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoFiltroDataDe = new javax.swing.JFormattedTextField();
        campoFiltroDataAte = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculo = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFecharLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de veículos");
        setToolTipText("");

        abaVeiculo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnFecharCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharCadastro.setText("Fechar");
        btnFecharCadastro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFecharCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaInformacoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        abaInformacoes.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campos obrigatórios (*)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Versão*"));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Nome:");

        btnBuscaVersao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscaVersao.setText("Procurar");
        btnBuscaVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaVersaoActionPerformed(evt);
            }
        });

        jLabel17.setText("Código:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdVersaoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeVersaoBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaVersao)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoNomeVersaoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscaVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoIdVersaoBusca)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Cor externa:*");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Cor interna:*");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Acabamento interno:*");

        comboCorExternaId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboCorInternaId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Chassi:*");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Renavam:*");

        comboAcabamentoInternoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Câmbio:*");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Informações do veículo:");

        comboCambioId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Situação do veículo:*");

        comboSituacaoVeiculoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Placa:*");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Quilometragem:*");

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Valor:*");

        campoInformacoesVeiculo.setColumns(20);
        campoInformacoesVeiculo.setRows(5);
        jScrollPane2.setViewportView(campoInformacoesVeiculo);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboAcabamentoInternoId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboCorInternaId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboCorExternaId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboCambioId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoChassi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoRenavam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoPlaca)
                            .addComponent(campoQuilometragem)
                            .addComponent(comboSituacaoVeiculoId, 0, 200, Short.MAX_VALUE)
                            .addComponent(campoValor)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSituacaoVeiculoId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCorExternaId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCambioId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCorInternaId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAcabamentoInternoId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel6)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaInformacoes.addTab("Informações do veículo", jPanel10);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campos obrigatórios (*)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Número de proprietários:");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Número de ocorrências:");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Chave reserva:");

        agrupadorChaveReserva.add(radioChaveReservaSim);
        radioChaveReservaSim.setText("Sim");

        agrupadorChaveReserva.add(radioChaveReservaNao);
        radioChaveReservaNao.setText("Não");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Manual do veículo:");

        agrupadorManualVeiculo.add(radioManualVeiculoSim);
        radioManualVeiculoSim.setText("Sim");

        agrupadorManualVeiculo.add(radioManualVeiculoNao);
        radioManualVeiculoNao.setText("Não");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Blindado:");

        agrupadorBlindado.add(radioBlindadoSim);
        radioBlindadoSim.setText("Sim");

        agrupadorBlindado.add(radioBlindadoNao);
        radioBlindadoNao.setText("Não");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("IPVA pago:");

        agrupadorIpva.add(radioIpvaPagoSim);
        radioIpvaPagoSim.setText("Sim");

        agrupadorIpva.add(radioIpvaPagoNao);
        radioIpvaPagoNao.setText("Não");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Vistoriado:");

        agrupadorVistoriado.add(radioVistoriadoSim);
        radioVistoriadoSim.setText("Sim");

        agrupadorVistoriado.add(radioVistoriadoNao);
        radioVistoriadoNao.setText("Não");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Garantia:");

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Exibir no site:");

        agrupadorExibirSite.add(radioExibirSiteSim);
        radioExibirSiteSim.setText("Sim");

        agrupadorExibirSite.add(radioExibirSiteNao);
        radioExibirSiteNao.setText("Não");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNumeroProprietario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(radioVistoriadoSim, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioVistoriadoNao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(radioManualVeiculoSim, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioManualVeiculoNao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoGarantia))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(radioBlindadoSim, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBlindadoNao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoNumeroOcorrencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(radioChaveReservaSim, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioChaveReservaNao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(radioIpvaPagoSim, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioIpvaPagoNao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(radioExibirSiteSim, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioExibirSiteNao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campoNumeroProprietario)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoNumeroOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioChaveReservaNao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioChaveReservaSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioBlindadoSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioBlindadoNao)
                    .addComponent(radioManualVeiculoNao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioManualVeiculoSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioIpvaPagoNao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radioIpvaPagoSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioVistoriadoSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioVistoriadoNao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(radioExibirSiteSim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioExibirSiteNao, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(25, 25, 25))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Galeria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaInformacoes.addTab("Informações adicionais", jPanel5);

        jPanel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

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
        jScrollPane13.setViewportView(tblConforto);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaInformacoes.addTab("Confortos", jPanel25);

        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

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
        jScrollPane14.setViewportView(tblEstilo);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaInformacoes.addTab("Estilos", jPanel26);

        jPanel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

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
        jScrollPane15.setViewportView(tblExtra);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaInformacoes.addTab("Extras", jPanel27);

        jPanel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

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
        jScrollPane16.setViewportView(tblSeguranca);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaInformacoes.addTab("Seguranças", jPanel28);

        jPanel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

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
        jScrollPane17.setViewportView(tblTecnologia);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaInformacoes.addTab("Tecnologias", jPanel29);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abaInformacoes))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaVeiculo.addTab("Cadastrar ou editar veículo", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Versão:");

        btnLimparBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broom-16.png"))); // NOI18N
        btnLimparBusca.setText("Limpar busca");
        btnLimparBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscaActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Situação:");

        comboFiltroSituacaoVeiculoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Placa:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Modelo:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Marca:");

        comboFiltroMarcaId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Data de:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Data ate:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboFiltroSituacaoVeiculoId, 0, 230, Short.MAX_VALUE)
                    .addComponent(campoFiltroPlaca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoFiltroDataDe, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(campoFiltroVersao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoFiltroDataAte, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(campoFiltroModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboFiltroMarcaId, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparBusca)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimparBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboFiltroSituacaoVeiculoId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoFiltroDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoFiltroDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoFiltroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoFiltroVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoFiltroModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboFiltroMarcaId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tblVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVeiculo);

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-16.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFecharLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFecharLista.setText("Fechar");
        btnFecharLista.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFecharLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharLista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnFecharLista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaVeiculo.addTab("Listar veículos", jPanel3);

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
                .addComponent(abaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaActionPerformed
        campoFiltroPlaca.setText("");
        campoFiltroVersao.setText("");
        campoFiltroModelo.setText("");
        comboFiltroMarcaId.setSelectedIndex(0);
        comboFiltroSituacaoVeiculoId.setSelectedIndex(0);
        campoFiltroDataDe.setText(Formatacao.getDataMes());
        campoFiltroDataAte.setText(Formatacao.ajustaDataDMA(now.toString()));
        if (peDAO.consultarPermissao("Listar", "veiculolist")) {
            new VeiculoDao().popularTabela(tblVeiculo, "", "", "", "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
        }
    }//GEN-LAST:event_btnLimparBuscaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ComboItem filtroSituacaoVeiculoId = (ComboItem) comboFiltroSituacaoVeiculoId.getSelectedItem();
        String filtroSituacao;
        if (filtroSituacaoVeiculoId.getCodigo() == 0) {
            filtroSituacao = "";
        } else {
            filtroSituacao = String.valueOf(filtroSituacaoVeiculoId.getCodigo());
        }

        ComboItem filtroMarcaId = (ComboItem) comboFiltroMarcaId.getSelectedItem();
        String filtroMarca;
        if (filtroMarcaId.getCodigo() == 0) {
            filtroMarca = "";
        } else {
            filtroMarca = String.valueOf(filtroMarcaId.getCodigo());
        }
        if (peDAO.consultarPermissao("Listar", "veiculolist")) {
            new VeiculoDao().popularTabela(tblVeiculo, campoFiltroPlaca.getText(), campoFiltroVersao.getText(), campoFiltroModelo.getText(), filtroMarca, filtroSituacao, campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Funcoes funcoes = new Funcoes();
        funcoes.limparCheckTabela(tblConforto);
        funcoes.limparCheckTabela(tblSeguranca);
        funcoes.limparCheckTabela(tblTecnologia);
        funcoes.limparCheckTabela(tblEstilo);
        funcoes.limparCheckTabela(tblExtra);

        String codigoEditarVeiculo = String.valueOf(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 0));

        Object objectVeiculo = DaoGenerico.getInstance().obterPorId(Veiculo.class, Integer.parseInt(codigoEditarVeiculo));
        Veiculo veiculo = new Veiculo((Veiculo) objectVeiculo);

        Object objectVersao = DaoGenerico.getInstance().obterPorId(Versao.class, veiculo.getVersao_id().getId());
        Versao versao = new Versao((Versao) objectVersao);

        ComboItem corInternaId = new ComboItem();
        corInternaId.setCodigo(veiculo.getCor_interna_id().getId());

        ComboItem corExternaId = new ComboItem();
        corExternaId.setCodigo(veiculo.getCor_externa_id().getId());

        ComboItem cambioId = new ComboItem();
        cambioId.setCodigo(veiculo.getCambio_id().getId());

        ComboItem situacaoVeiculoId = new ComboItem();
        situacaoVeiculoId.setCodigo(veiculo.getSituacao_veiculo_id().getId());

        ComboItem acabamentoInternoId = new ComboItem();
        acabamentoInternoId.setCodigo(veiculo.getAcabamento_interno_id().getId());

        if (versao != null) {
            abaVeiculo.setSelectedIndex(0);

            campoIdVersaoBusca.setText(Integer.toString(veiculo.getVersao_id().getId()));
            campoNomeVersaoBusca.setText(versao.getNome());
            new ComboDao().definirItemCombo(comboCorInternaId, corInternaId);
            new ComboDao().definirItemCombo(comboCorExternaId, corExternaId);
            new ComboDao().definirItemCombo(comboCambioId, cambioId);
            new ComboDao().definirItemCombo(comboSituacaoVeiculoId, situacaoVeiculoId);
            new ComboDao().definirItemCombo(comboAcabamentoInternoId, acabamentoInternoId);
            campoQuilometragem.setText(veiculo.getQuilometragem());
            campoPlaca.setText(veiculo.getPlaca());
            campoChassi.setText(veiculo.getChassi());
            campoRenavam.setText(veiculo.getRenavam());
            campoValor.setText(Double.toString(veiculo.getValor()).replace(".", ","));
            campoNumeroProprietario.setText(Integer.toString(veiculo.getNumero_proprietarios()));
            campoNumeroOcorrencia.setText(Integer.toString(veiculo.getNumero_ocorrencias()));
            if (veiculo.isChave_reserva()) {
                radioChaveReservaSim.setSelected(true);
            } else {
                radioChaveReservaNao.setSelected(true);
            }

            if (veiculo.isManual_veiculo()) {
                radioManualVeiculoSim.setSelected(true);
            } else {
                radioManualVeiculoNao.setSelected(true);
            }

            if (veiculo.isVistoriado()) {
                radioVistoriadoSim.setSelected(true);
            } else {
                radioVistoriadoNao.setSelected(true);
            }

            if (veiculo.isBlindado()) {
                radioBlindadoSim.setSelected(true);
            } else {
                radioBlindadoNao.setSelected(true);
            }

            campoGarantia.setText(veiculo.getGarantia());

            if (veiculo.isIpva_pago()) {
                radioIpvaPagoSim.setSelected(true);
            } else {
                radioIpvaPagoNao.setSelected(true);
            }

            if (veiculo.isExibir_site()) {
                radioExibirSiteSim.setSelected(true);
            } else {
                radioExibirSiteNao.setSelected(true);
            }

            campoInformacoesVeiculo.setText(veiculo.getInformacoes_veiculo());

            VeiculoDao veiculoDao = new VeiculoDao();
            veiculoDao.obterVeiculoConforto(tblConforto, Integer.parseInt(codigoEditarVeiculo));
            veiculoDao.obterVeiculoSeguranca(tblSeguranca, Integer.parseInt(codigoEditarVeiculo));
            veiculoDao.obterVeiculoTecnologia(tblTecnologia, Integer.parseInt(codigoEditarVeiculo));
            veiculoDao.obterVeiculoEstilo(tblEstilo, Integer.parseInt(codigoEditarVeiculo));
            veiculoDao.obterVeiculoExtra(tblExtra, Integer.parseInt(codigoEditarVeiculo));

            codigo = veiculo.getId();

        } else {
            Mensagem.erro("Erro ao consultar veículo!", this);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int codigoExcluirVeiculo = (int) tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirVeiculo = DaoGenerico.getInstance().excluir(Veiculo.class, codigoExcluirVeiculo);

            if (retornoExcluirVeiculo == true) {
                Mensagem.informacao("Veículo excluído com sucesso!", this);
                if (peDAO.consultarPermissao("Listar", "veiculolist")) {
                    new VeiculoDao().popularTabela(tblVeiculo, "", "", "", "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
                }
            } else {
                Mensagem.erro(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 3) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnFecharListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharListaActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharListaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Veiculo veiculo = new Veiculo();
        Funcoes funcoes = new Funcoes();

        Versao versao = null;
        if (!campoIdVersaoBusca.getText().equals("")) {
            Object objectVersao = DaoGenerico.getInstance().obterPorId(Versao.class, Integer.parseInt(campoIdVersaoBusca.getText()));
            versao = new Versao((Versao) objectVersao);
        }

        ComboItem corInternaId = (ComboItem) comboCorInternaId.getSelectedItem();
        CorInterna corInterna = null;
        if (corInternaId.getCodigo() != 0) {
            Object objectCorInterna = DaoGenerico.getInstance().obterPorId(CorInterna.class, corInternaId.getCodigo());
            corInterna = new CorInterna((CorInterna) objectCorInterna);
        }

        ComboItem corExternaId = (ComboItem) comboCorExternaId.getSelectedItem();
        CorExterna corExterna = null;
        if (corExternaId.getCodigo() != 0) {
            Object objectCorExterna = DaoGenerico.getInstance().obterPorId(CorExterna.class, corExternaId.getCodigo());
            corExterna = new CorExterna((CorExterna) objectCorExterna);
        }

        ComboItem cambioId = (ComboItem) comboCambioId.getSelectedItem();
        Cambio cambio = null;
        if (cambioId.getCodigo() != 0) {
            Object objectCambio = DaoGenerico.getInstance().obterPorId(Cambio.class, cambioId.getCodigo());
            cambio = new Cambio((Cambio) objectCambio);
        }

        ComboItem situacaoVeiculoId = (ComboItem) comboSituacaoVeiculoId.getSelectedItem();
        SituacaoVeiculo situacaoVeiculo = null;
        if (situacaoVeiculoId.getCodigo() != 0) {
            Object objectSituacaoVeiculo = DaoGenerico.getInstance().obterPorId(SituacaoVeiculo.class, situacaoVeiculoId.getCodigo());
            situacaoVeiculo = new SituacaoVeiculo((SituacaoVeiculo) objectSituacaoVeiculo);
        }

        ComboItem acabamentoInternoId = (ComboItem) comboAcabamentoInternoId.getSelectedItem();
        AcabamentoInterno acabamentoInterno = null;
        if (acabamentoInternoId.getCodigo() != 0) {
            Object objectAcabamentoInterno = DaoGenerico.getInstance().obterPorId(AcabamentoInterno.class, acabamentoInternoId.getCodigo());
            acabamentoInterno = new AcabamentoInterno((AcabamentoInterno) objectAcabamentoInterno);
        }

        veiculo.setId(codigo);

        if (!campoIdVersaoBusca.getText().equals("")) {
            veiculo.setVersao_id(versao);
        }

        veiculo.setCor_interna_id(corInterna);
        veiculo.setCor_externa_id(corExterna);
        veiculo.setCambio_id(cambio);
        veiculo.setSituacao_veiculo_id(situacaoVeiculo);
        veiculo.setAcabamento_interno_id(acabamentoInterno);

        if (!campoQuilometragem.getText().equals("")) {
            veiculo.setQuilometragem(campoQuilometragem.getText());
        }

        veiculo.setPlaca(campoPlaca.getText());
        veiculo.setChassi(campoChassi.getText());
        veiculo.setRenavam(campoRenavam.getText());

        if (!campoValor.getText().equals("")) {
            veiculo.setValor(Double.parseDouble(campoValor.getText().replace(",", ".")));
        }

        veiculo.setInformacoes_veiculo(campoInformacoesVeiculo.getText());
        if (!campoNumeroProprietario.getText().equals("")) {
            veiculo.setNumero_proprietarios(Integer.parseInt(campoNumeroProprietario.getText()));
        }

        if (!campoNumeroOcorrencia.getText().equals("")) {
            veiculo.setNumero_ocorrencias(Integer.parseInt(campoNumeroOcorrencia.getText()));
        }

        veiculo.setGarantia(campoGarantia.getText());

        if (radioChaveReservaSim.isSelected() == true) {
            veiculo.setChave_reserva(true);
        } else {
            veiculo.setChave_reserva(false);
        }

        if (radioManualVeiculoSim.isSelected() == true) {
            veiculo.setManual_veiculo(true);
        } else {
            veiculo.setManual_veiculo(false);
        }

        if (radioVistoriadoSim.isSelected() == true) {
            veiculo.setVistoriado(true);
        } else {
            veiculo.setVistoriado(false);
        }

        if (radioBlindadoSim.isSelected() == true) {
            veiculo.setBlindado(true);
        } else {
            veiculo.setBlindado(false);
        }

        if (radioIpvaPagoSim.isSelected() == true) {
            veiculo.setIpva_pago(true);
        } else {
            veiculo.setIpva_pago(false);
        }

        if (radioExibirSiteSim.isSelected() == true) {
            veiculo.setExibir_site(true);
        } else {
            veiculo.setExibir_site(false);
        }

        veiculo.setCriadoEm(Calendar.getInstance());
        veiculo.setAlteradoEm(Calendar.getInstance());

        VeiculoDao veiculoDao = new VeiculoDao();
        VeiculoConfortoDao veiculoConofortoDao = new VeiculoConfortoDao();
        VeiculoSegurancaDao veiculoSegurancaDao = new VeiculoSegurancaDao();
        VeiculoTecnologiaDao veiculoTecnologiaDao = new VeiculoTecnologiaDao();
        VeiculoEstiloDao veiculoEstiloDao = new VeiculoEstiloDao();
        VeiculoExtraDao veiculoExtraDao = new VeiculoExtraDao();

        int retornoSalvarVeiculo = 0;
        String retornoExcluirConforto = null;
        String retornoExcluirSeguranca = null;
        String retornoExcluirTecnologia = null;
        String retornoExcluirEstilo = null;
        String retornoExcluirExtra = null;

        if (validaCampos() == true) {
            if (codigo == 0) {
                retornoSalvarVeiculo = DaoGenerico.getInstance().inserirVeiculo(veiculo);
                veiculoConofortoDao.salvarVeiculoConforto(tblConforto, retornoSalvarVeiculo);
                veiculoSegurancaDao.salvarVeiculoSeguranca(tblSeguranca, retornoSalvarVeiculo);
                veiculoTecnologiaDao.salvarVeiculoTecnologia(tblTecnologia, retornoSalvarVeiculo);
                veiculoEstiloDao.salvarVeiculoEstilo(tblEstilo, retornoSalvarVeiculo);
                veiculoExtraDao.salvarVeiculoExtra(tblExtra, retornoSalvarVeiculo);
            } else {
                boolean retornoUpdate = DaoGenerico.getInstance().atualizar(veiculo);

                if (retornoUpdate == true) {
                    retornoSalvarVeiculo = veiculo.getId();
                } else {
                    retornoSalvarVeiculo = 0;
                }

                retornoExcluirConforto = veiculoConofortoDao.excluir(retornoSalvarVeiculo);
                if (retornoExcluirConforto == null) {
                    veiculoConofortoDao.salvarVeiculoConforto(tblConforto, retornoSalvarVeiculo);
                }
                retornoExcluirSeguranca = veiculoSegurancaDao.excluir(retornoSalvarVeiculo);
                if (retornoExcluirSeguranca == null) {
                    veiculoSegurancaDao.salvarVeiculoSeguranca(tblSeguranca, retornoSalvarVeiculo);
                }
                retornoExcluirTecnologia = veiculoTecnologiaDao.excluir(retornoSalvarVeiculo);
                if (retornoExcluirTecnologia == null) {
                    veiculoTecnologiaDao.salvarVeiculoTecnologia(tblTecnologia, retornoSalvarVeiculo);
                }
                retornoExcluirEstilo = veiculoEstiloDao.excluir(retornoSalvarVeiculo);
                if (retornoExcluirEstilo == null) {
                    veiculoEstiloDao.salvarVeiculoEstilo(tblEstilo, retornoSalvarVeiculo);
                }
                retornoExcluirExtra = veiculoExtraDao.excluir(retornoSalvarVeiculo);
                if (retornoExcluirExtra == null) {
                    veiculoExtraDao.salvarVeiculoExtra(tblExtra, retornoSalvarVeiculo);
                }
            }
            Mensagem.informacao("Veículo salvo com sucesso!", this);
        } else {
            campoIdVersaoBusca.setText("");
            campoNomeVersaoBusca.setText("");
            comboCorInternaId.setSelectedIndex(0);
            comboCorExternaId.setSelectedIndex(0);
            comboCambioId.setSelectedIndex(0);
            comboSituacaoVeiculoId.setSelectedIndex(0);
            comboAcabamentoInternoId.setSelectedIndex(0);
            campoQuilometragem.setText("");
            campoPlaca.setText("");
            campoChassi.setText("");
            campoRenavam.setText("");
            campoValor.setText("");
            campoNumeroProprietario.setText("");
            campoNumeroOcorrencia.setText("");
            campoGarantia.setText("");
            campoInformacoesVeiculo.setText("");
            agrupadorChaveReserva.clearSelection();
            agrupadorManualVeiculo.clearSelection();
            agrupadorVistoriado.clearSelection();
            agrupadorBlindado.clearSelection();
            agrupadorIpva.clearSelection();
            agrupadorExibirSite.clearSelection();
            funcoes.limparCheckTabela(tblConforto);
            funcoes.limparCheckTabela(tblSeguranca);
            funcoes.limparCheckTabela(tblTecnologia);
            funcoes.limparCheckTabela(tblEstilo);
            funcoes.limparCheckTabela(tblExtra);
        }

        if (retornoSalvarVeiculo != 0) {

            campoIdVersaoBusca.setText("");
            campoNomeVersaoBusca.setText("");
            comboCorInternaId.setSelectedIndex(0);
            comboCorExternaId.setSelectedIndex(0);
            comboCambioId.setSelectedIndex(0);
            comboSituacaoVeiculoId.setSelectedIndex(0);
            comboAcabamentoInternoId.setSelectedIndex(0);
            campoQuilometragem.setText("");
            campoPlaca.setText("");
            campoChassi.setText("");
            campoRenavam.setText("");
            campoValor.setText("");
            campoNumeroProprietario.setText("");
            campoNumeroOcorrencia.setText("");
            campoGarantia.setText("");
            campoInformacoesVeiculo.setText("");
            agrupadorChaveReserva.clearSelection();
            agrupadorManualVeiculo.clearSelection();
            agrupadorVistoriado.clearSelection();
            agrupadorBlindado.clearSelection();
            agrupadorIpva.clearSelection();
            agrupadorExibirSite.clearSelection();
            funcoes.limparCheckTabela(tblConforto);
            funcoes.limparCheckTabela(tblSeguranca);
            funcoes.limparCheckTabela(tblTecnologia);
            funcoes.limparCheckTabela(tblEstilo);
            funcoes.limparCheckTabela(tblExtra);

            codigo = 0;

            campoFiltroPlaca.setText("");
            campoFiltroVersao.setText("");
            campoFiltroModelo.setText("");
            comboFiltroMarcaId.setSelectedIndex(0);
            comboFiltroSituacaoVeiculoId.setSelectedIndex(0);
            campoFiltroDataDe.setText(Formatacao.getDataMes());
            campoFiltroDataAte.setText(Formatacao.ajustaDataDMA(now.toString()));
            if (peDAO.consultarPermissao("Listar", "veiculolist")) {
                new VeiculoDao().popularTabela(tblVeiculo, "", "", "", "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
            }
        } else {
            Mensagem.aviso("Campos obrigatórios (*) devem ser preenchidos corretamente!", this);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCadastroActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharCadastroActionPerformed

    private void btnBuscaVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaVersaoActionPerformed
        TelaBuscaVersao buscaVersao = new TelaBuscaVersao(null, true, this);
        buscaVersao.setLocationRelativeTo(this);
        buscaVersao.setVisible(true);
    }//GEN-LAST:event_btnBuscaVersaoActionPerformed

    public void definirVersao(int id, String nome) {
        campoIdVersaoBusca.setText(Integer.toString(id));
        campoNomeVersaoBusca.setText(nome);
    }

    public boolean validaCampos() {

        ComboItem corInternaId = (ComboItem) comboCorInternaId.getSelectedItem();
        ComboItem corExternaId = (ComboItem) comboCorExternaId.getSelectedItem();
        ComboItem cambioId = (ComboItem) comboCambioId.getSelectedItem();
        ComboItem situacaoVeiculoId = (ComboItem) comboSituacaoVeiculoId.getSelectedItem();
        ComboItem acabamentoInternoId = (ComboItem) comboAcabamentoInternoId.getSelectedItem();

        return !campoIdVersaoBusca.getText().equals("") && !campoNomeVersaoBusca.getText().equals("")
                && cambioId.getCodigo() != 0 && corInternaId.getCodigo() != 0
                && corExternaId.getCodigo() != 0 && acabamentoInternoId.getCodigo() != 0
                && situacaoVeiculoId.getCodigo() != 0 && !campoQuilometragem.getText().equals("")
                && !campoPlaca.getText().equals("") && !campoChassi.getText().equals("")
                && !campoRenavam.getText().equals("") && !campoValor.getText().equals("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaInformacoes;
    private javax.swing.JTabbedPane abaVeiculo;
    private javax.swing.ButtonGroup agrupadorBlindado;
    private javax.swing.ButtonGroup agrupadorChaveReserva;
    private javax.swing.ButtonGroup agrupadorExibirSite;
    private javax.swing.ButtonGroup agrupadorIpva;
    private javax.swing.ButtonGroup agrupadorManualVeiculo;
    private javax.swing.ButtonGroup agrupadorVistoriado;
    private javax.swing.JButton btnBuscaVersao;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFecharCadastro;
    private javax.swing.JButton btnFecharLista;
    private javax.swing.JButton btnLimparBusca;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoChassi;
    private javax.swing.JFormattedTextField campoFiltroDataAte;
    private javax.swing.JFormattedTextField campoFiltroDataDe;
    private javax.swing.JTextField campoFiltroModelo;
    private javax.swing.JTextField campoFiltroPlaca;
    private javax.swing.JTextField campoFiltroVersao;
    private javax.swing.JTextField campoGarantia;
    private javax.swing.JTextField campoIdVersaoBusca;
    private javax.swing.JTextArea campoInformacoesVeiculo;
    private javax.swing.JTextField campoNomeVersaoBusca;
    private javax.swing.JTextField campoNumeroOcorrencia;
    private javax.swing.JTextField campoNumeroProprietario;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoQuilometragem;
    private javax.swing.JTextField campoRenavam;
    private javax.swing.JTextField campoValor;
    private javax.swing.JComboBox<String> comboAcabamentoInternoId;
    private javax.swing.JComboBox<String> comboCambioId;
    private javax.swing.JComboBox<String> comboCorExternaId;
    private javax.swing.JComboBox<String> comboCorInternaId;
    private javax.swing.JComboBox<String> comboFiltroMarcaId;
    private javax.swing.JComboBox<String> comboFiltroSituacaoVeiculoId;
    private javax.swing.JComboBox<String> comboSituacaoVeiculoId;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioBlindadoNao;
    private javax.swing.JRadioButton radioBlindadoSim;
    private javax.swing.JRadioButton radioChaveReservaNao;
    private javax.swing.JRadioButton radioChaveReservaSim;
    private javax.swing.JRadioButton radioExibirSiteNao;
    private javax.swing.JRadioButton radioExibirSiteSim;
    private javax.swing.JRadioButton radioIpvaPagoNao;
    private javax.swing.JRadioButton radioIpvaPagoSim;
    private javax.swing.JRadioButton radioManualVeiculoNao;
    private javax.swing.JRadioButton radioManualVeiculoSim;
    private javax.swing.JRadioButton radioVistoriadoNao;
    private javax.swing.JRadioButton radioVistoriadoSim;
    private javax.swing.JTable tblConforto;
    private javax.swing.JTable tblEstilo;
    private javax.swing.JTable tblExtra;
    private javax.swing.JTable tblSeguranca;
    private javax.swing.JTable tblTecnologia;
    private javax.swing.JTable tblVeiculo;
    // End of variables declaration//GEN-END:variables
}
