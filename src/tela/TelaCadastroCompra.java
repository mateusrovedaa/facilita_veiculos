package tela;

import dao.ComboDao;
import dao.CompraDao;
import dao.DaoGenerico;
import dao.PermissaoDao;
import dao.ProprietarioDao;
import dao.VeiculoDao;
import dao.VersaoDao;
import entidade.Combustivel;
import entidade.Compra;
import entidade.ContratoCompra;
import entidade.Modelo;
import entidade.Proprietario;
import entidade.SituacaoCompra;
import entidade.SituacaoVeiculo;
import entidade.Veiculo;
import entidade.Versao;
import functions.ComboItem;
import functions.ConexaoBD;
import functions.Formatacao;
import functions.GerenciarJanelas;
import functions.Mensagem;
import functions.Validacao;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class TelaCadastroCompra extends javax.swing.JInternalFrame {

    private static TelaCadastroCompra tela;
    int codigo = 0;
    PermissaoDao peDAO = new PermissaoDao();
    LocalDate now = LocalDate.now();

    public TelaCadastroCompra() {
        initComponents();
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("images/car.png"));
        this.setFrameIcon(icon);
        campoIdVeiculoBusca.setEditable(false);
        campoPlacaVeiculoBusca.setEditable(false);
        campoIdProprietarioBusca.setEditable(false);
        campoNomeProprietarioBusca.setEditable(false);
        Formatacao.formatarData(campoFiltroDataDe);
        Formatacao.formatarData(campoFiltroDataAte);
        Formatacao.formatarData(campoData);
        campoFiltroDataDe.setText(Formatacao.getDataMes());
        campoFiltroDataAte.setText(Formatacao.ajustaDataDMA(now.toString()));
        new ComboDao().popularCombo("situacoes_compras", 1, 4, comboSituacaoCompraId, "");
        new ComboDao().popularCombo("situacoes_compras", 1, 4, comboFiltroSituacaoCompraId, "");
        new ComboDao().popularCombo("marcas", 1, 4, comboFiltroMarcaId, "");
        verificaPermissoes();
    }

    public static TelaCadastroCompra getInstancia() {
        if (tela == null) {
            tela = new TelaCadastroCompra();
        }
        return tela;
    }

    private void funcaoFechar() {
        GerenciarJanelas.fecharJanela(tela);
        tela = null;
    }

    private void verificaPermissoes() {
        if (!peDAO.consultarPermissao("Salvar", "compra")) {
            btnSalvar.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("Excluir", "compra")) {
            btnExcluir.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("Buscar", "compra")) {
            btnBuscar.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("LimparBusca", "compra")) {
            btnLimparBusca.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("Editar", "compra")) {
            btnEditar.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("GerarContrato", "compra")) {
            btnGerarContrato.setEnabled(false);
        }
        if (peDAO.consultarPermissao("Listar", "compra")) {
            new CompraDao().criaTabela(tblCompra, jScrollPane1);
//            new CompraDao().popularTabela(tblCompra, "", "", "", "", "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
        }
        if (!peDAO.consultarPermissao("Procurar", "compra")) {
            btnBuscaVeiculo.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("Procurar2", "compra")) {
            btnBuscaProprietario.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("ComboSitCompra1", "compra")) {
            comboSituacaoCompraId.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("ComboSitCompra2", "compra")) {
            comboFiltroSituacaoCompraId.setEnabled(false);
        }
        if (!peDAO.consultarPermissao("ComboMarca", "compra")) {
            comboFiltroMarcaId.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        abaCompra = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        campoIdVeiculoBusca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoPlacaVeiculoBusca = new javax.swing.JTextField();
        btnBuscaVeiculo = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        campoIdProprietarioBusca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoNomeProprietarioBusca = new javax.swing.JTextField();
        btnBuscaProprietario = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoData = new javax.swing.JFormattedTextField();
        comboSituacaoCompraId = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        campoObservacoes = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnFecharCadastro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnLimparBusca = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        campoFiltroPlaca = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboFiltroMarcaId = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        campoFiltroDataDe = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        campoFiltroDataAte = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        campoFiltroVersao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        campoFiltroModelo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        comboFiltroSituacaoCompraId = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        campoFiltroProprietario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompra = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFecharLista = new javax.swing.JButton();
        btnGerarContrato = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de compras");
        setToolTipText("");

        abaCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campos obrigatórios (*)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Veículo*"));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Placa:");

        btnBuscaVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscaVeiculo.setText("Procurar");
        btnBuscaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaVeiculoActionPerformed(evt);
            }
        });

        jLabel16.setText("Código:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdVeiculoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPlacaVeiculoBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaVeiculo)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscaVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoPlacaVeiculoBusca)
                    .addComponent(campoIdVeiculoBusca)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Proprietário*"));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Nome:");

        btnBuscaProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-16.png"))); // NOI18N
        btnBuscaProprietario.setText("Procurar");
        btnBuscaProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaProprietarioActionPerformed(evt);
            }
        });

        jLabel17.setText("Código:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdProprietarioBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeProprietarioBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaProprietario)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscaProprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoNomeProprietarioBusca)
                    .addComponent(campoIdProprietarioBusca)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Data:*");

        comboSituacaoCompraId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Situação da compra:*");

        jLabel4.setText("Observações:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Valor:*");

        campoObservacoes.setColumns(20);
        campoObservacoes.setRows(5);
        jScrollPane3.setViewportView(campoObservacoes);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(809, 809, 809))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboSituacaoCompraId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoData)
                            .addComponent(campoValor)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSituacaoCompraId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6))
        );

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaCompra.addTab("Cadastrar ou editar compra", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Placa:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Marca:");

        comboFiltroMarcaId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Data de:");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Data de:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Versão:");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Modelo:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Situação da compra:");

        comboFiltroSituacaoCompraId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Proprietário:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(comboFiltroMarcaId, javax.swing.GroupLayout.Alignment.LEADING, 0, 241, Short.MAX_VALUE)
                    .addComponent(comboFiltroSituacaoCompraId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoFiltroPlaca, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(campoFiltroProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(campoFiltroDataDe))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoFiltroVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoFiltroDataAte, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(campoFiltroModelo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparBusca)))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFiltroMarcaId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFiltroSituacaoCompraId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimparBusca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCompra);

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

        btnGerarContrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-view-16.png"))); // NOI18N
        btnGerarContrato.setText("Gerar contrato");
        btnGerarContrato.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnGerarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(btnGerarContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(btnFecharLista)
                    .addComponent(btnGerarContrato))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        abaCompra.addTab("Listar compras", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(abaCompra)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaCompra)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscaActionPerformed
        campoFiltroPlaca.setText("");
        campoFiltroVersao.setText("");
        campoFiltroModelo.setText("");
        comboFiltroMarcaId.setSelectedIndex(0);
        comboFiltroSituacaoCompraId.setSelectedIndex(0);
        campoFiltroProprietario.setText("");
        campoFiltroDataDe.setText(Formatacao.getDataMes());
        campoFiltroDataAte.setText(Formatacao.ajustaDataDMA(now.toString()));
        if (peDAO.consultarPermissao("Listar", "compra")) {
            new CompraDao().criaTabela(tblCompra, jScrollPane1);
//            new CompraDao().popularTabela(tblCompra, "", "", "", "", "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
        }
    }//GEN-LAST:event_btnLimparBuscaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ComboItem filtroMarcaId = (ComboItem) comboFiltroMarcaId.getSelectedItem();
        String filtroMarca;
        if (filtroMarcaId.getCodigo() == 0) {
            filtroMarca = "";
        } else {
            filtroMarca = String.valueOf(filtroMarcaId.getCodigo());
        }

        ComboItem filtroSituacaoCompraId = (ComboItem) comboFiltroSituacaoCompraId.getSelectedItem();
        String filtroSituacaoCompra;
        if (filtroSituacaoCompraId.getCodigo() == 0) {
            filtroSituacaoCompra = "";
        } else {
            filtroSituacaoCompra = String.valueOf(filtroSituacaoCompraId.getCodigo());
        }

        if (Validacao.validarDataFormatada(campoFiltroDataDe.getText()) || Validacao.validarDataFormatada(campoFiltroDataAte.getText())) {
            if (peDAO.consultarPermissao("Listar", "compra")) {
                new CompraDao().popularTabela(tblCompra, campoFiltroPlaca.getText(), campoFiltroVersao.getText(), campoFiltroModelo.getText(), filtroMarca, filtroSituacaoCompra, campoFiltroProprietario.getText(), campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
            }
        } else {
            Mensagem.aviso("Digite uma data válida!", this);
            campoFiltroDataDe.setText(Formatacao.getDataMes());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String codigoEditarCompra = String.valueOf(tblCompra.getValueAt(tblCompra.getSelectedRow(), 0));

        Object objectCompra = DaoGenerico.getInstance().obterPorId(Compra.class, Integer.parseInt(codigoEditarCompra));
        Compra compra = new Compra((Compra) objectCompra);

        Object objectVeiculo = DaoGenerico.getInstance().obterPorId(Veiculo.class, compra.getVeiculo_id().getId());
        Veiculo veiculo = new Veiculo((Veiculo) objectVeiculo);

        Object objectProprietario = DaoGenerico.getInstance().obterPorId(Proprietario.class, compra.getProprietario_id().getId());
        Proprietario proprietario = new Proprietario((Proprietario) objectProprietario);

        ComboItem situacaoCompraId = new ComboItem();
        situacaoCompraId.setCodigo(compra.getSituacao_compra_id().getId());

        if (compra != null) {
            abaCompra.setSelectedIndex(0);

            campoIdVeiculoBusca.setText(Integer.toString(compra.getVeiculo_id().getId()));
            campoPlacaVeiculoBusca.setText(veiculo.getPlaca());
            campoIdProprietarioBusca.setText(Integer.toString(compra.getProprietario_id().getId()));
            campoNomeProprietarioBusca.setText(proprietario.getNome());
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = dateFormat.format(compra.getData());
            campoData.setText(dataFormatada);
            new ComboDao().definirItemCombo(comboSituacaoCompraId, situacaoCompraId);
            campoValor.setText(Formatacao.formatarDecimal(compra.getValor()));
            campoObservacoes.setText(String.valueOf(compra.getObservacoes()));

            codigo = compra.getId();

        } else {
            Mensagem.erro("Erro ao consultar compra!", this);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int codigoExcluirCompra = (int) tblCompra.getValueAt(tblCompra.getSelectedRow(), 0);

        int mensagem = Mensagem.confirmacao("Deseja excluir?", this);
        if (mensagem == 0) {
            boolean retornoExcluirCompra = DaoGenerico.getInstance().excluir(Compra.class, codigoExcluirCompra);

            if (retornoExcluirCompra == true) {
                Mensagem.informacao("Compra excluída com sucesso!", this);
                if (peDAO.consultarPermissao("Listar", "compra")) {
                    new CompraDao().criaTabela(tblCompra, jScrollPane1);
//                    new CompraDao().popularTabela(tblCompra, "", "", "", "", "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
                }
            } else {
                Mensagem.erro(tblCompra.getValueAt(tblCompra.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!", this);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnFecharListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharListaActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharListaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Compra compra = new Compra();
        Veiculo veiculo = new Veiculo();
        VeiculoDao veiculoDao = new VeiculoDao();

        Veiculo veiculoBusca = null;
        if (!campoIdVeiculoBusca.getText().equals("")) {
            Object objectVeiculo = DaoGenerico.getInstance().obterPorId(Veiculo.class, Integer.parseInt(campoIdVeiculoBusca.getText()));
            veiculoBusca = new Veiculo((Veiculo) objectVeiculo);
        }

        Proprietario proprietarioBusca = null;
        if (!campoIdProprietarioBusca.getText().equals("")) {
            Object objectProprietario = DaoGenerico.getInstance().obterPorId(Proprietario.class, Integer.parseInt(campoIdProprietarioBusca.getText()));
            proprietarioBusca = new Proprietario((Proprietario) objectProprietario);
        }

        ComboItem situacaoCompraId = (ComboItem) comboSituacaoCompraId.getSelectedItem();
        SituacaoCompra situacao = null;
        if (situacaoCompraId.getCodigo() != 0) {
            Object objectSituacaoCompra = DaoGenerico.getInstance().obterPorId(SituacaoCompra.class, situacaoCompraId.getCodigo());
            situacao = new SituacaoCompra((SituacaoCompra) objectSituacaoCompra);
        }

        ContratoCompra contrato = null;
        Object objectContratoCompra = DaoGenerico.getInstance().obterPorId(ContratoCompra.class, 1);
        contrato = new ContratoCompra((ContratoCompra) objectContratoCompra);

        compra.setId(codigo);
        compra.setProprietario_id(proprietarioBusca);
        compra.setVeiculo_id(veiculoBusca);
        if (!campoData.getText().equals("  /  /    ")) {
            String data = campoData.getText();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(data, formato);
            Date dataFormatada = java.sql.Date.valueOf(localDate);
            compra.setData(dataFormatada);
        }
        compra.setSituacao_compra_id(situacao);
        compra.setContrato_compra_id(contrato);
        if (!campoValor.getText().equals("")) {
            compra.setValor(Double.parseDouble(campoValor.getText().replace(",", ".")));
        }
        compra.setObservacoes(campoObservacoes.getText());
        compra.setCriadoEm(Calendar.getInstance());
        compra.setAlteradoEm(Calendar.getInstance());

        CompraDao compraDao = new CompraDao();
        boolean retornoSalvarCompra = true;

        veiculo.setId(Integer.parseInt(campoIdVeiculoBusca.getText()));

        if (validaCampos() == true) {
            if (codigo == 0) {
                retornoSalvarCompra = DaoGenerico.getInstance().inserir(compra);
                veiculoDao.atualizarSituacao(campoIdVeiculoBusca.getText(), "1");
            } else {
                retornoSalvarCompra = DaoGenerico.getInstance().atualizar(compra);
                veiculoDao.atualizarSituacao(campoIdVeiculoBusca.getText(), "1");
            }

            Mensagem.informacao("Compra salva com sucesso!", this);

        } else {
            Mensagem.aviso("Campos obrigatórios (*) devem ser preenchidos corretamente!", this);
        }

        if (retornoSalvarCompra == true) {

            campoIdVeiculoBusca.setText("");
            campoPlacaVeiculoBusca.setText("");
            campoIdProprietarioBusca.setText("");
            campoNomeProprietarioBusca.setText("");
            campoData.setText("");
            comboSituacaoCompraId.setSelectedIndex(0);
            campoValor.setText("");
            campoObservacoes.setText("");

            codigo = 0;

            if (peDAO.consultarPermissao("Listar", "compra")) {
                new CompraDao().criaTabela(tblCompra, jScrollPane1);
//            new CompraDao().popularTabela(tblCompra, "", "", "", "", "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
        }
        } else {
            Mensagem.erro("Erro ao cadastrar compra!", this);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCadastroActionPerformed
        funcaoFechar();
    }//GEN-LAST:event_btnFecharCadastroActionPerformed

    private void btnBuscaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaVeiculoActionPerformed
        TelaBuscaVeiculo buscaVeiculo = new TelaBuscaVeiculo(null, true, this);
        buscaVeiculo.setLocationRelativeTo(this);
        buscaVeiculo.setVisible(true);
    }//GEN-LAST:event_btnBuscaVeiculoActionPerformed

    private void btnBuscaProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaProprietarioActionPerformed
        TelaBuscaProprietario buscaProprietario = new TelaBuscaProprietario(null, true, this);
        buscaProprietario.setLocationRelativeTo(this);
        buscaProprietario.setVisible(true);
    }//GEN-LAST:event_btnBuscaProprietarioActionPerformed

    private void btnGerarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarContratoActionPerformed
        int idInt = Integer.parseInt(tblCompra.getValueAt(tblCompra.getSelectedRow(), 0).toString());
        if (idInt == 0) {
            Mensagem.aviso("Selecione um registro para imprimir!", this);
        } else {
            try {
                // Compila o relatorio
                URL web = getClass().getResource("/relatorios/");
                JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/contrato_compra.jrxml"));

                // Mapeia campos de parametros para o relatorio, mesmo que nao existam
                Map parametros = new HashMap();

                // adiciona parametros
                parametros.put("idcompra", idInt);

                // Executa relatoio
                JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());

                // Exibe resultado em video
                JasperViewer.viewReport(impressao, false);
            } catch (JRException e) {
                Mensagem.erro("Erro ao gerar relatório: " + e, this);
            }
        }
    }//GEN-LAST:event_btnGerarContratoActionPerformed

    public void definirVeiculo(int id, String placa) {
        campoIdVeiculoBusca.setText(Integer.toString(id));
        campoPlacaVeiculoBusca.setText(placa);
    }

    public void definirProprietario(int id, String nome) {
        campoIdProprietarioBusca.setText(Integer.toString(id));
        campoNomeProprietarioBusca.setText(nome);
    }

    public boolean validaCampos() {

        ComboItem situacaoCompraId = (ComboItem) comboSituacaoCompraId.getSelectedItem();

        return situacaoCompraId.getCodigo() != 0 && !campoIdVeiculoBusca.getText().equals("")
                && !campoPlacaVeiculoBusca.getText().equals("")
                && !campoIdProprietarioBusca.getText().equals("") && !campoNomeProprietarioBusca.getText().equals("")
                && !campoValor.getText().equals("") && !campoData.getText().equals("  /  /    ")
                && Validacao.validarDataFormatada(campoData.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaCompra;
    private javax.swing.JButton btnBuscaProprietario;
    private javax.swing.JButton btnBuscaVeiculo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFecharCadastro;
    private javax.swing.JButton btnFecharLista;
    private javax.swing.JButton btnGerarContrato;
    private javax.swing.JButton btnLimparBusca;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField campoData;
    private javax.swing.JFormattedTextField campoFiltroDataAte;
    private javax.swing.JFormattedTextField campoFiltroDataDe;
    private javax.swing.JTextField campoFiltroModelo;
    private javax.swing.JTextField campoFiltroPlaca;
    private javax.swing.JTextField campoFiltroProprietario;
    private javax.swing.JTextField campoFiltroVersao;
    private javax.swing.JTextField campoIdProprietarioBusca;
    private javax.swing.JTextField campoIdVeiculoBusca;
    private javax.swing.JTextField campoNomeProprietarioBusca;
    private javax.swing.JTextArea campoObservacoes;
    private javax.swing.JTextField campoPlacaVeiculoBusca;
    private javax.swing.JTextField campoValor;
    private javax.swing.JComboBox<String> comboFiltroMarcaId;
    private javax.swing.JComboBox<String> comboFiltroSituacaoCompraId;
    private javax.swing.JComboBox<String> comboSituacaoCompraId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCompra;
    // End of variables declaration//GEN-END:variables
}
