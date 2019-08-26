package tela;

import dao.AcabamentoInternoDao;
import dao.CambioDao;
import dao.CarroceriaDao;
import dao.ClienteDao;
import dao.CombustivelDao;
import dao.ConfortoDao;
import dao.CorExternaDao;
import dao.CorInternaDao;
import dao.EstiloDao;
import dao.ExtraDao;
import dao.ProcedenciaDao;
import dao.SegurancaDao;
import dao.TecnologiaDao;
import entidade.AcabamentoInterno;
import entidade.Cambio;
import entidade.Carroceria;
import entidade.Cliente;
import entidade.Combustivel;
import entidade.Conforto;
import entidade.CorExterna;
import entidade.CorInterna;
import entidade.Estilo;
import entidade.Extra;
import entidade.Procedencia;
import entidade.Seguranca;
import entidade.Tecnologia;
import javax.swing.JOptionPane;

public class TelaCadastroGeral extends javax.swing.JInternalFrame {

    int codigo = 0;

    public TelaCadastroGeral() {
        initComponents();
        new AcabamentoInternoDao().popularTabela(tblAcabamentoInterno, campoFiltroAcabamento.getText());
        new CombustivelDao().popularTabela(tblCombustivel, campoFiltroCombustivel.getText());
        new CambioDao().popularTabela(tblCambio, campoFiltroCambio.getText());
        new CarroceriaDao().popularTabela(tblCarroceria, campoFiltroCarroceria.getText());
        new ConfortoDao().popularTabela(tblConforto, campoFiltroConforto.getText());
        new CorExternaDao().popularTabela(tblCorExterna, campoFiltroCorExterna.getText());
        new CorInternaDao().popularTabela(tblCorInterna, campoFiltroCorInterna.getText());
        new EstiloDao().popularTabela(tblEstilo, campoFiltroEstilo.getText());
        new ExtraDao().popularTabela(tblExtra, campoFiltroExtra.getText());
        new ProcedenciaDao().popularTabela(tblProcedencia, campoFiltroProcedencia.getText());
        new SegurancaDao().popularTabela(tblSeguranca, campoFiltroSeguranca.getText());
        new TecnologiaDao().popularTabela(tblTecnologia, campoFiltroTecnologia.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        abaAcabamento = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoAcabamento = new javax.swing.JTextField();
        btnSalvarAcabamento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoFiltroAcabamento = new javax.swing.JTextField();
        btnFiltrarAcabamento = new javax.swing.JButton();
        btnLimparAcabamento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAcabamentoInterno = new javax.swing.JTable();
        btnFecharAcabamento = new javax.swing.JButton();
        btnEditarAcabamento = new javax.swing.JButton();
        btnExcluirAcabamento = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        abaCombustivel = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        campoCombustivel = new javax.swing.JTextField();
        btnSalvarCombustivel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        campoFiltroCombustivel = new javax.swing.JTextField();
        btnFiltrarCombustivel = new javax.swing.JButton();
        btnLimparCombustivel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCombustivel = new javax.swing.JTable();
        btnFecharCombustivel = new javax.swing.JButton();
        btnEditaCombustivel = new javax.swing.JButton();
        btnExcluirCombustivel = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        abaCambio = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        campoCambio = new javax.swing.JTextField();
        btnSalvarCambio = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        campoFiltroCambio = new javax.swing.JTextField();
        btnFiltrarCambio = new javax.swing.JButton();
        btnLimparCambio = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCambio = new javax.swing.JTable();
        btnFecharCambio = new javax.swing.JButton();
        btnEditarCambio = new javax.swing.JButton();
        btnExcluirCambio = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        abaCarroceria = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        campoCarroceria = new javax.swing.JTextField();
        btnSalvarCarroceria = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        campoFiltroCarroceria = new javax.swing.JTextField();
        btnLimparCarroceria = new javax.swing.JButton();
        btnFiltrarCarroceria = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCarroceria = new javax.swing.JTable();
        btnFecharCarroceria = new javax.swing.JButton();
        btnEditarCarroceria = new javax.swing.JButton();
        btnExcluirCarroceria = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        abaConforto = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        campoConforto = new javax.swing.JTextField();
        btnSalvarConforto = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        campoFiltroConforto = new javax.swing.JTextField();
        btnLimparConforto = new javax.swing.JButton();
        btnFiltrarConforto = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblConforto = new javax.swing.JTable();
        btnFecharConforto = new javax.swing.JButton();
        btnEditarConforto = new javax.swing.JButton();
        btnExcluirConforto = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        abaCorExterna = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        campoCorExterna = new javax.swing.JTextField();
        btnSalvarCorExterna = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        campoFiltroCorExterna = new javax.swing.JTextField();
        btnFiltrarCorExterna = new javax.swing.JButton();
        btnLimparCorExterna = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCorExterna = new javax.swing.JTable();
        btnFecharCorExterna = new javax.swing.JButton();
        btnEditarCorExterna = new javax.swing.JButton();
        btnExcluirCorExterna = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        abaCorInterna = new javax.swing.JTabbedPane();
        jPanel20 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        campoCorInterna = new javax.swing.JTextField();
        btnSalvarCorInterna = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        campoFiltroCorInterna = new javax.swing.JTextField();
        btnFiltrarCorInterna = new javax.swing.JButton();
        btnLimparCorInterna = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblCorInterna = new javax.swing.JTable();
        btnFecharCorInterna = new javax.swing.JButton();
        btnEditarCorInterna = new javax.swing.JButton();
        btnExcluirCorInterna = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        abaEstilo = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        campoEstilo = new javax.swing.JTextField();
        btnSalvarEstilo = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        campoFiltroEstilo = new javax.swing.JTextField();
        btnLimparEstilo = new javax.swing.JButton();
        btnFiltrarEstilo = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblEstilo = new javax.swing.JTable();
        btnFecharEstilo = new javax.swing.JButton();
        btnEditarEstilo = new javax.swing.JButton();
        btnExcluirEstilo = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        abaExtra = new javax.swing.JTabbedPane();
        jPanel26 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        campoExtra = new javax.swing.JTextField();
        btnSalvarExtra = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        campoFiltroExtra = new javax.swing.JTextField();
        btnLimparExtra = new javax.swing.JButton();
        btnFiltrarExtra = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblExtra = new javax.swing.JTable();
        btnFecharExtra = new javax.swing.JButton();
        btnEditarExtra = new javax.swing.JButton();
        btnExcluirExtra = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        abaProcedencia = new javax.swing.JTabbedPane();
        jPanel29 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        campoProcedencia = new javax.swing.JTextField();
        btnSalvarProcedencia = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        campoFiltroProcedencia = new javax.swing.JTextField();
        btnLimparProcedencia = new javax.swing.JButton();
        btnFiltrarProcedencia = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblProcedencia = new javax.swing.JTable();
        btnFecharProcedencia = new javax.swing.JButton();
        btnEditarProcedencia = new javax.swing.JButton();
        btnExcluirProcedencia = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        abaSeguranca = new javax.swing.JTabbedPane();
        jPanel32 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        campoSeguranca = new javax.swing.JTextField();
        btnSalvarSeguranca = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        campoFiltroSeguranca = new javax.swing.JTextField();
        btnLimparSeguranca = new javax.swing.JButton();
        btnFiltrarSeguranca = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblSeguranca = new javax.swing.JTable();
        btnFecharSeguranca = new javax.swing.JButton();
        btnEditarSeguranca = new javax.swing.JButton();
        btnExcluirSeguranca = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        abaTecnologia = new javax.swing.JTabbedPane();
        jPanel41 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        campoTecnologia = new javax.swing.JTextField();
        btnSalvarTecnologia = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        campoFiltroTecnologia = new javax.swing.JTextField();
        btnFiltrarTecnologia = new javax.swing.JButton();
        btnLimparTecnologia = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblTecnologia = new javax.swing.JTable();
        btnFecharTecnologia = new javax.swing.JButton();
        btnEditarTecnologia = new javax.swing.JButton();
        btnExcluirTecnologia = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setTitle("Cadastro gerais");

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel43.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar acabamentos internos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel1.setText("Nome:");

        btnSalvarAcabamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarAcabamento.setText("Salvar");
        btnSalvarAcabamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAcabamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoAcabamento, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarAcabamento)
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoAcabamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarAcabamento)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaAcabamento.addTab("Cadastrar acabamento interno", jPanel1);

        jPanel44.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel2.setText("Nome:");

        btnFiltrarAcabamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarAcabamento.setText("Filtrar");
        btnFiltrarAcabamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarAcabamentoActionPerformed(evt);
            }
        });

        btnLimparAcabamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparAcabamento.setText("Limpar");
        btnLimparAcabamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparAcabamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroAcabamento, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarAcabamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparAcabamento)
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoFiltroAcabamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarAcabamento)
                    .addComponent(btnLimparAcabamento)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaAcabamento.addTab("Filtrar acabamentos internos", jPanel2);

        tblAcabamentoInterno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane1.setViewportView(tblAcabamentoInterno);

        btnFecharAcabamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharAcabamento.setText("Fechar");
        btnFecharAcabamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharAcabamentoActionPerformed(evt);
            }
        });

        btnEditarAcabamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarAcabamento.setText("Editar");
        btnEditarAcabamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAcabamentoActionPerformed(evt);
            }
        });

        btnExcluirAcabamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirAcabamento.setText("Excluir");
        btnExcluirAcabamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAcabamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(abaAcabamento)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirAcabamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarAcabamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharAcabamento)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAcabamento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharAcabamento)
                    .addComponent(btnEditarAcabamento)
                    .addComponent(btnExcluirAcabamento))
                .addGap(271, 271, 271))
        );

        jTabbedPane2.addTab("Acabamentos internos", jPanel16);

        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar combustíveis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel3.setText("Nome:");

        btnSalvarCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarCombustivel.setText("Salvar");
        btnSalvarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCombustivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCombustivel, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCombustivel)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCombustivel)
                    .addComponent(jLabel3)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaCombustivel.addTab("Cadastrar combustível", jPanel3);

        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel4.setText("Nome:");

        btnFiltrarCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarCombustivel.setText("Filtrar");
        btnFiltrarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCombustivelActionPerformed(evt);
            }
        });

        btnLimparCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparCombustivel.setText("Limpar");
        btnLimparCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCombustivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroCombustivel, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarCombustivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparCombustivel)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoFiltroCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarCombustivel)
                    .addComponent(btnLimparCombustivel)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaCombustivel.addTab("Filtrar combustíveis", jPanel4);

        tblCombustivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane2.setViewportView(tblCombustivel);

        btnFecharCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharCombustivel.setText("Fechar");
        btnFecharCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCombustivelActionPerformed(evt);
            }
        });

        btnEditaCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditaCombustivel.setText("Editar");
        btnEditaCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaCombustivelActionPerformed(evt);
            }
        });

        btnExcluirCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirCombustivel.setText("Excluir");
        btnExcluirCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCombustivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaCombustivel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirCombustivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditaCombustivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharCombustivel)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharCombustivel)
                    .addComponent(btnEditaCombustivel)
                    .addComponent(btnExcluirCombustivel))
                .addGap(271, 271, 271))
        );

        jTabbedPane2.addTab("Combustíveis", jPanel17);

        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar câmbio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel5.setText("Nome:");

        btnSalvarCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarCambio.setText("Salvar");
        btnSalvarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCambio)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCambio)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaCambio.addTab("Cadastrar câmbio", jPanel6);

        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel6.setText("Nome:");

        btnFiltrarCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarCambio.setText("Filtrar");
        btnFiltrarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCambioActionPerformed(evt);
            }
        });

        btnLimparCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparCambio.setText("Limpar");
        btnLimparCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarCambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparCambio)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoFiltroCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarCambio)
                    .addComponent(btnLimparCambio)))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaCambio.addTab("Filtrar câmbios", jPanel7);

        tblCambio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane3.setViewportView(tblCambio);

        btnFecharCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharCambio.setText("Fechar");
        btnFecharCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCambioActionPerformed(evt);
            }
        });

        btnEditarCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarCambio.setText("Editar");
        btnEditarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCambioActionPerformed(evt);
            }
        });

        btnExcluirCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirCambio.setText("Excluir");
        btnExcluirCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaCambio)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirCambio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarCambio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharCambio)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharCambio)
                    .addComponent(btnEditarCambio)
                    .addComponent(btnExcluirCambio))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Câmbios", jPanel5);

        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar carroceria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel7.setText("Nome:");

        btnSalvarCarroceria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarCarroceria.setText("Salvar");
        btnSalvarCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCarroceriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCarroceria, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCarroceria)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCarroceria)))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaCarroceria.addTab("Cadastrar carroceria", jPanel9);

        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel8.setText("Nome:");

        btnLimparCarroceria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparCarroceria.setText("Limpar");
        btnLimparCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCarroceriaActionPerformed(evt);
            }
        });

        btnFiltrarCarroceria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarCarroceria.setText("Filtrar");
        btnFiltrarCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCarroceriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroCarroceria, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarCarroceria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparCarroceria)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoFiltroCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarCarroceria)
                    .addComponent(btnLimparCarroceria)))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaCarroceria.addTab("Filtrar carrocerias", jPanel10);

        tblCarroceria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane4.setViewportView(tblCarroceria);

        btnFecharCarroceria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharCarroceria.setText("Fechar");
        btnFecharCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCarroceriaActionPerformed(evt);
            }
        });

        btnEditarCarroceria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarCarroceria.setText("Editar");
        btnEditarCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCarroceriaActionPerformed(evt);
            }
        });

        btnExcluirCarroceria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirCarroceria.setText("Excluir");
        btnExcluirCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCarroceriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaCarroceria)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirCarroceria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarCarroceria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharCarroceria)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharCarroceria)
                    .addComponent(btnEditarCarroceria)
                    .addComponent(btnExcluirCarroceria))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Carrocerias", jPanel8);

        jPanel45.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar conforto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel10.setText("Nome:");

        btnSalvarConforto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarConforto.setText("Salvar");
        btnSalvarConforto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarConfortoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoConforto, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarConforto)
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoConforto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarConforto)
                    .addComponent(jLabel10)))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaConforto.addTab("Cadastrar conforto", jPanel12);

        jPanel46.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel9.setText("Nome:");

        btnLimparConforto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparConforto.setText("Limpar");
        btnLimparConforto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparConfortoActionPerformed(evt);
            }
        });

        btnFiltrarConforto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarConforto.setText("Filtrar");
        btnFiltrarConforto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarConfortoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroConforto, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarConforto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparConforto)
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFiltroConforto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparConforto)
                    .addComponent(btnFiltrarConforto)
                    .addComponent(jLabel9)))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaConforto.addTab("Filtrar confortos", jPanel13);

        tblConforto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane5.setViewportView(tblConforto);

        btnFecharConforto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharConforto.setText("Fechar");
        btnFecharConforto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharConfortoActionPerformed(evt);
            }
        });

        btnEditarConforto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarConforto.setText("Editar");
        btnEditarConforto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarConfortoActionPerformed(evt);
            }
        });

        btnExcluirConforto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirConforto.setText("Excluir");
        btnExcluirConforto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirConfortoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaConforto)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirConforto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarConforto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharConforto)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaConforto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharConforto)
                    .addComponent(btnEditarConforto)
                    .addComponent(btnExcluirConforto))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Confortos", jPanel11);

        jPanel47.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar cor externa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel11.setText("Nome:");

        btnSalvarCorExterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarCorExterna.setText("Salvar");
        btnSalvarCorExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCorExternaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCorExterna, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCorExterna)
                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(campoCorExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCorExterna)))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaCorExterna.addTab("Cadastrar cor externa", jPanel15);

        jPanel48.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel12.setText("Nome:");

        btnFiltrarCorExterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarCorExterna.setText("Filtrar");
        btnFiltrarCorExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCorExternaActionPerformed(evt);
            }
        });

        btnLimparCorExterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparCorExterna.setText("Limpar");
        btnLimparCorExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCorExternaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroCorExterna, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarCorExterna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparCorExterna)
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFiltroCorExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarCorExterna)
                    .addComponent(btnLimparCorExterna)
                    .addComponent(jLabel12)))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaCorExterna.addTab("Filtrar cores externas", jPanel18);

        tblCorExterna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane6.setViewportView(tblCorExterna);

        btnFecharCorExterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharCorExterna.setText("Fechar");
        btnFecharCorExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCorExternaActionPerformed(evt);
            }
        });

        btnEditarCorExterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarCorExterna.setText("Editar");
        btnEditarCorExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCorExternaActionPerformed(evt);
            }
        });

        btnExcluirCorExterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirCorExterna.setText("Excluir");
        btnExcluirCorExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCorExternaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaCorExterna)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirCorExterna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarCorExterna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharCorExterna)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaCorExterna, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharCorExterna)
                    .addComponent(btnEditarCorExterna)
                    .addComponent(btnExcluirCorExterna))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cores externas", jPanel14);

        jPanel49.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar cor interna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel13.setText("Nome:");

        btnSalvarCorInterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarCorInterna.setText("Salvar");
        btnSalvarCorInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCorInternaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCorInterna, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCorInterna)
                .addContainerGap())
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCorInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCorInterna)
                    .addComponent(jLabel13)))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaCorInterna.addTab("Cadastrar cor interna", jPanel20);

        jPanel50.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel14.setText("Nome:");

        btnFiltrarCorInterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarCorInterna.setText("Filtrar");
        btnFiltrarCorInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCorInternaActionPerformed(evt);
            }
        });

        btnLimparCorInterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparCorInterna.setText("Limpar");
        btnLimparCorInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCorInternaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroCorInterna, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarCorInterna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparCorInterna)
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(campoFiltroCorInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarCorInterna)
                    .addComponent(btnLimparCorInterna)))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaCorInterna.addTab("Filtrar cores internas", jPanel21);

        tblCorInterna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane7.setViewportView(tblCorInterna);

        btnFecharCorInterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharCorInterna.setText("Fechar");
        btnFecharCorInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCorInternaActionPerformed(evt);
            }
        });

        btnEditarCorInterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarCorInterna.setText("Editar");
        btnEditarCorInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCorInternaActionPerformed(evt);
            }
        });

        btnExcluirCorInterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirCorInterna.setText("Excluir");
        btnExcluirCorInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCorInternaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaCorInterna)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirCorInterna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarCorInterna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharCorInterna)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaCorInterna, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharCorInterna)
                    .addComponent(btnEditarCorInterna)
                    .addComponent(btnExcluirCorInterna))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cores internas", jPanel19);

        jPanel52.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar estilo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel15.setText("Nome:");

        btnSalvarEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarEstilo.setText("Salvar");
        btnSalvarEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEstiloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEstilo, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarEstilo)
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarEstilo)
                    .addComponent(jLabel15)))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaEstilo.addTab("Cadastrar estilo", jPanel23);

        jPanel51.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel16.setText("Nome:");

        btnLimparEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparEstilo.setText("Limpar");
        btnLimparEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparEstiloActionPerformed(evt);
            }
        });

        btnFiltrarEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarEstilo.setText("Filtrar");
        btnFiltrarEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarEstiloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroEstilo, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarEstilo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparEstilo)
                .addContainerGap())
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(campoFiltroEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarEstilo)
                    .addComponent(btnLimparEstilo)))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaEstilo.addTab("Filtrar estilos", jPanel25);

        tblEstilo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane8.setViewportView(tblEstilo);

        btnFecharEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharEstilo.setText("Fechar");
        btnFecharEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharEstiloActionPerformed(evt);
            }
        });

        btnEditarEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarEstilo.setText("Editar");
        btnEditarEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEstiloActionPerformed(evt);
            }
        });

        btnExcluirEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirEstilo.setText("Excluir");
        btnExcluirEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEstiloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaEstilo)
                    .addComponent(jScrollPane8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirEstilo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarEstilo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharEstilo)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharEstilo)
                    .addComponent(btnEditarEstilo)
                    .addComponent(btnExcluirEstilo))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Estilos", jPanel22);

        jPanel53.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar extra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel17.setText("Nome:");

        btnSalvarExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarExtra.setText("Salvar");
        btnSalvarExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarExtraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarExtra)
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarExtra)
                    .addComponent(jLabel17)))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaExtra.addTab("Cadastrar extra", jPanel26);

        jPanel54.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel18.setText("Nome:");

        btnLimparExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparExtra.setText("Limpar");
        btnLimparExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparExtraActionPerformed(evt);
            }
        });

        btnFiltrarExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarExtra.setText("Filtrar");
        btnFiltrarExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarExtraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarExtra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparExtra)
                .addContainerGap())
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(campoFiltroExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparExtra)
                    .addComponent(btnFiltrarExtra)))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaExtra.addTab("Filtrar extras", jPanel27);

        tblExtra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane9.setViewportView(tblExtra);

        btnFecharExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharExtra.setText("Fechar");
        btnFecharExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharExtraActionPerformed(evt);
            }
        });

        btnEditarExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarExtra.setText("Editar");
        btnEditarExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarExtraActionPerformed(evt);
            }
        });

        btnExcluirExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirExtra.setText("Excluir");
        btnExcluirExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirExtraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaExtra)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirExtra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarExtra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharExtra)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharExtra)
                    .addComponent(btnEditarExtra)
                    .addComponent(btnExcluirExtra))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Extras", jPanel24);

        jPanel55.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar procedência", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel19.setText("Nome:");

        btnSalvarProcedencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarProcedencia.setText("Salvar");
        btnSalvarProcedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProcedenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoProcedencia, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarProcedencia)
                .addContainerGap())
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(campoProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarProcedencia)))
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaProcedencia.addTab("Cadastrar procedência", jPanel29);

        jPanel56.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel20.setText("Nome:");

        btnLimparProcedencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparProcedencia.setText("Limpar");
        btnLimparProcedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProcedenciaActionPerformed(evt);
            }
        });

        btnFiltrarProcedencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarProcedencia.setText("Filtrar");
        btnFiltrarProcedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarProcedenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroProcedencia, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarProcedencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparProcedencia)
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFiltroProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparProcedencia)
                    .addComponent(btnFiltrarProcedencia)
                    .addComponent(jLabel20)))
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaProcedencia.addTab("Filtrar procedências", jPanel30);

        tblProcedencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane10.setViewportView(tblProcedencia);

        btnFecharProcedencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharProcedencia.setText("Fechar");
        btnFecharProcedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharProcedenciaActionPerformed(evt);
            }
        });

        btnEditarProcedencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarProcedencia.setText("Editar");
        btnEditarProcedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProcedenciaActionPerformed(evt);
            }
        });

        btnExcluirProcedencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirProcedencia.setText("Excluir");
        btnExcluirProcedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProcedenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10)
                    .addComponent(abaProcedencia)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirProcedencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarProcedencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharProcedencia)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharProcedencia)
                    .addComponent(btnEditarProcedencia)
                    .addComponent(btnExcluirProcedencia))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Procedências", jPanel28);

        jPanel58.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar segurança", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel21.setText("Nome:");

        btnSalvarSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarSeguranca.setText("Salvar");
        btnSalvarSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSegurancaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSeguranca, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarSeguranca)
                .addContainerGap())
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(campoSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarSeguranca)))
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaSeguranca.addTab("Cadastrar segurança", jPanel32);

        jPanel57.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel22.setText("Nome:");

        btnLimparSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparSeguranca.setText("Limpar");
        btnLimparSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparSegurancaActionPerformed(evt);
            }
        });

        btnFiltrarSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarSeguranca.setText("Filtrar");
        btnFiltrarSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarSegurancaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroSeguranca, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarSeguranca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparSeguranca)
                .addContainerGap())
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(campoFiltroSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparSeguranca)
                    .addComponent(btnFiltrarSeguranca)))
        );

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaSeguranca.addTab("Filtrar seguranças", jPanel33);

        tblSeguranca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane11.setViewportView(tblSeguranca);

        btnFecharSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharSeguranca.setText("Fechar");
        btnFecharSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharSegurancaActionPerformed(evt);
            }
        });

        btnEditarSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarSeguranca.setText("Editar");
        btnEditarSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSegurancaActionPerformed(evt);
            }
        });

        btnExcluirSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirSeguranca.setText("Excluir");
        btnExcluirSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirSegurancaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaSeguranca)
                    .addComponent(jScrollPane11)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirSeguranca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarSeguranca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharSeguranca)))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharSeguranca)
                    .addComponent(btnEditarSeguranca)
                    .addComponent(btnExcluirSeguranca))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Seguranças", jPanel31);

        jPanel60.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar tecnologia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel27.setText("Nome:");

        btnSalvarTecnologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarTecnologia.setText("Salvar");
        btnSalvarTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTecnologiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTecnologia, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarTecnologia)
                .addContainerGap())
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(campoTecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarTecnologia)))
        );

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaTecnologia.addTab("Cadastrar tecnologia", jPanel41);

        jPanel59.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel28.setText("Nome:");

        btnFiltrarTecnologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarTecnologia.setText("Filtrar");
        btnFiltrarTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarTecnologiaActionPerformed(evt);
            }
        });

        btnLimparTecnologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparTecnologia.setText("Limpar");
        btnLimparTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTecnologiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroTecnologia, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarTecnologia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparTecnologia)
                .addContainerGap())
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(campoFiltroTecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarTecnologia)
                    .addComponent(btnLimparTecnologia)))
        );

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        abaTecnologia.addTab("Filtrar tecnologias", jPanel42);

        tblTecnologia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane14.setViewportView(tblTecnologia);

        btnFecharTecnologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharTecnologia.setText("Fechar");
        btnFecharTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharTecnologiaActionPerformed(evt);
            }
        });

        btnEditarTecnologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarTecnologia.setText("Editar");
        btnEditarTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTecnologiaActionPerformed(evt);
            }
        });

        btnExcluirTecnologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirTecnologia.setText("Excluir");
        btnExcluirTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTecnologiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14)
                    .addComponent(abaTecnologia)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirTecnologia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarTecnologia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharTecnologia)))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaTecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharTecnologia)
                    .addComponent(btnEditarTecnologia)
                    .addComponent(btnExcluirTecnologia))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tecnologias", jPanel40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTecnologiaActionPerformed
        String codigoExcluirTecnologia = String.valueOf(tblTecnologia.getValueAt(tblTecnologia.getSelectedRow(), 0));

        String retornoExcluirTecnologia = new TecnologiaDao().excluir(Integer.parseInt(codigoExcluirTecnologia));

        if (retornoExcluirTecnologia == null) {
            JOptionPane.showMessageDialog(null, "Tecnologia excluída com sucesso!");
            new TecnologiaDao().popularTabela(tblTecnologia, campoFiltroTecnologia.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblTecnologia.getValueAt(tblTecnologia.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirTecnologiaActionPerformed

    private void btnEditarTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTecnologiaActionPerformed
        String codigoEditarTecnologia = String.valueOf(tblTecnologia.getValueAt(tblTecnologia.getSelectedRow(), 0));

        Tecnologia tecnologia = new TecnologiaDao().consultarId(Integer.parseInt(codigoEditarTecnologia));

        if (tecnologia != null) {
            abaTecnologia.setSelectedIndex(0);

            campoTecnologia.setText(tecnologia.getNome());

            campoTecnologia.requestFocus();

            codigo = tecnologia.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar tecnologia!");
        }
    }//GEN-LAST:event_btnEditarTecnologiaActionPerformed

    private void btnFecharTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharTecnologiaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharTecnologiaActionPerformed

    private void btnLimparTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTecnologiaActionPerformed
        campoFiltroTecnologia.setText("");
        new TecnologiaDao().popularTabela(tblTecnologia, campoFiltroTecnologia.getText());
    }//GEN-LAST:event_btnLimparTecnologiaActionPerformed

    private void btnFiltrarTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarTecnologiaActionPerformed
        new TecnologiaDao().popularTabela(tblTecnologia, campoFiltroTecnologia.getText());
    }//GEN-LAST:event_btnFiltrarTecnologiaActionPerformed

    private void btnSalvarTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTecnologiaActionPerformed
        Tecnologia tecnologia = new Tecnologia();

        tecnologia.setId(codigo);
        tecnologia.setNome(campoTecnologia.getText());

        TecnologiaDao tecnologiaDao = new TecnologiaDao();
        String retornoSalvarTecnologia = null;
        String erroTecnologia = "";

        if (campoTecnologia.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarTecnologia = tecnologiaDao.salvar(tecnologia);
            } else {
                retornoSalvarTecnologia = tecnologiaDao.atualizar(tecnologia);
            }
        } else {
            erroTecnologia = null;
            JOptionPane.showMessageDialog(null, "Digite uma informação válida!");
        }

        if (retornoSalvarTecnologia == null && erroTecnologia != null) {
            JOptionPane.showMessageDialog(null, "Tecnologia salva com sucesso!");

            campoTecnologia.setText("");

            campoTecnologia.requestFocus();

            campoFiltroTecnologia.setText("");

            codigo = 0;

            new TecnologiaDao().popularTabela(tblTecnologia, campoFiltroTecnologia.getText());

        } else {
            if (erroTecnologia != null) {
                JOptionPane.showMessageDialog(null, "Tecnologia " + campoTecnologia.getText() + " já está cadastrada!");
                campoTecnologia.setText("");

                campoTecnologia.requestFocus();

                campoFiltroTecnologia.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarTecnologiaActionPerformed

    private void btnExcluirSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirSegurancaActionPerformed
        String codigoExcluirSeguranca = String.valueOf(tblSeguranca.getValueAt(tblSeguranca.getSelectedRow(), 0));

        String retornoExcluirSeguranca = new SegurancaDao().excluir(Integer.parseInt(codigoExcluirSeguranca));

        if (retornoExcluirSeguranca == null) {
            JOptionPane.showMessageDialog(null, "Segurança excluída com sucesso!");
            new SegurancaDao().popularTabela(tblSeguranca, campoFiltroSeguranca.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblSeguranca.getValueAt(tblSeguranca.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirSegurancaActionPerformed

    private void btnEditarSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSegurancaActionPerformed
        String codigoEditarSeguranca = String.valueOf(tblSeguranca.getValueAt(tblSeguranca.getSelectedRow(), 0));

        Seguranca seguranca = new SegurancaDao().consultarId(Integer.parseInt(codigoEditarSeguranca));

        if (seguranca != null) {
            abaSeguranca.setSelectedIndex(0);

            campoSeguranca.setText(seguranca.getNome());

            campoSeguranca.requestFocus();

            codigo = seguranca.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar segurança!");
        }
    }//GEN-LAST:event_btnEditarSegurancaActionPerformed

    private void btnFecharSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharSegurancaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharSegurancaActionPerformed

    private void btnLimparSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparSegurancaActionPerformed
        campoFiltroSeguranca.setText("");
        new SegurancaDao().popularTabela(tblSeguranca, campoFiltroSeguranca.getText());
    }//GEN-LAST:event_btnLimparSegurancaActionPerformed

    private void btnFiltrarSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarSegurancaActionPerformed
        new SegurancaDao().popularTabela(tblSeguranca, campoFiltroSeguranca.getText());
    }//GEN-LAST:event_btnFiltrarSegurancaActionPerformed

    private void btnSalvarSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSegurancaActionPerformed
        Seguranca seguranca = new Seguranca();

        seguranca.setId(codigo);
        seguranca.setNome(campoSeguranca.getText());

        SegurancaDao segurancaDao = new SegurancaDao();
        String retornoSalvarSeguranca = null;
        String erroSeguranca = "";

        if (campoSeguranca.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarSeguranca = segurancaDao.salvar(seguranca);
            } else {
                retornoSalvarSeguranca = segurancaDao.atualizar(seguranca);
            }
        } else {
            erroSeguranca = null;
            JOptionPane.showMessageDialog(null, "Digite uma informação válida!");
        }

        if (retornoSalvarSeguranca == null && erroSeguranca != null) {
            JOptionPane.showMessageDialog(null, "Segurança salva com sucesso!");

            campoSeguranca.setText("");

            campoSeguranca.requestFocus();

            campoFiltroSeguranca.setText("");

            codigo = 0;

            new SegurancaDao().popularTabela(tblSeguranca, campoFiltroSeguranca.getText());

        } else {
            //JOptionPane.showMessageDialog(null, "Deu erro: \n\nMensagem técnica:" + retornoSalvarSeguranca);
            if (erroSeguranca != null) {
                JOptionPane.showMessageDialog(null, "Segurança " + campoSeguranca.getText() + " já está cadastrada!");
                campoSeguranca.setText("");

                campoSeguranca.requestFocus();

                campoFiltroSeguranca.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarSegurancaActionPerformed

    private void btnExcluirProcedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProcedenciaActionPerformed
        String codigoExcluirProcedencia = String.valueOf(tblProcedencia.getValueAt(tblProcedencia.getSelectedRow(), 0));

        String retornoExcluirProcedencia = new ProcedenciaDao().excluir(Integer.parseInt(codigoExcluirProcedencia));

        if (retornoExcluirProcedencia == null) {
            JOptionPane.showMessageDialog(null, "Procedência excluída com sucesso!");
            new ProcedenciaDao().popularTabela(tblProcedencia, campoFiltroProcedencia.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblProcedencia.getValueAt(tblProcedencia.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirProcedenciaActionPerformed

    private void btnEditarProcedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProcedenciaActionPerformed
        String codigoEditarProcedencia = String.valueOf(tblProcedencia.getValueAt(tblProcedencia.getSelectedRow(), 0));

        Procedencia procedencia = new ProcedenciaDao().consultarId(Integer.parseInt(codigoEditarProcedencia));

        if (procedencia != null) {
            abaProcedencia.setSelectedIndex(0);

            campoProcedencia.setText(procedencia.getNome());

            campoProcedencia.requestFocus();

            codigo = procedencia.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar procedência!");
        }
    }//GEN-LAST:event_btnEditarProcedenciaActionPerformed

    private void btnFecharProcedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharProcedenciaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharProcedenciaActionPerformed

    private void btnLimparProcedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProcedenciaActionPerformed
        campoFiltroProcedencia.setText("");
        new ProcedenciaDao().popularTabela(tblProcedencia, campoFiltroProcedencia.getText());
    }//GEN-LAST:event_btnLimparProcedenciaActionPerformed

    private void btnFiltrarProcedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarProcedenciaActionPerformed
        new ProcedenciaDao().popularTabela(tblProcedencia, campoFiltroProcedencia.getText());
    }//GEN-LAST:event_btnFiltrarProcedenciaActionPerformed

    private void btnSalvarProcedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProcedenciaActionPerformed
        Procedencia procedencia = new Procedencia();

        procedencia.setId(codigo);
        procedencia.setNome(campoProcedencia.getText());

        ProcedenciaDao procedenciaDao = new ProcedenciaDao();
        String retornoSalvarProcedencia = null;
        String erroProcedencia = "";

        if (campoProcedencia.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarProcedencia = procedenciaDao.salvar(procedencia);
            } else {
                retornoSalvarProcedencia = procedenciaDao.atualizar(procedencia);
            }
        } else {
            erroProcedencia = null;
            JOptionPane.showMessageDialog(null, "Digite uma informação válida!");
        }

        if (retornoSalvarProcedencia == null && erroProcedencia != null) {
            JOptionPane.showMessageDialog(null, "Procedência salva com sucesso!");

            campoProcedencia.setText("");

            campoProcedencia.requestFocus();

            campoFiltroProcedencia.setText("");

            codigo = 0;

            new ProcedenciaDao().popularTabela(tblProcedencia, campoFiltroProcedencia.getText());

        } else {
            if (erroProcedencia != null) {
                JOptionPane.showMessageDialog(null, "Procedência " + campoProcedencia.getText() + " já está cadastrada!");
                campoProcedencia.setText("");

                campoProcedencia.requestFocus();

                campoFiltroProcedencia.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarProcedenciaActionPerformed

    private void btnExcluirExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirExtraActionPerformed
        String codigoExcluirExtra = String.valueOf(tblExtra.getValueAt(tblExtra.getSelectedRow(), 0));

        String retornoExcluirExtra = new ExtraDao().excluir(Integer.parseInt(codigoExcluirExtra));

        if (retornoExcluirExtra == null) {
            JOptionPane.showMessageDialog(null, "Extra excluído com sucesso!");
            new ExtraDao().popularTabela(tblExtra, campoFiltroExtra.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblExtra.getValueAt(tblExtra.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirExtraActionPerformed

    private void btnEditarExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarExtraActionPerformed
        String codigoEditarExtra = String.valueOf(tblExtra.getValueAt(tblExtra.getSelectedRow(), 0));

        Extra extra = new ExtraDao().consultarId(Integer.parseInt(codigoEditarExtra));

        if (extra != null) {
            abaExtra.setSelectedIndex(0);

            campoExtra.setText(extra.getNome());

            campoExtra.requestFocus();

            codigo = extra.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar extra!");
        }
    }//GEN-LAST:event_btnEditarExtraActionPerformed

    private void btnFecharExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharExtraActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharExtraActionPerformed

    private void btnLimparExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparExtraActionPerformed
        campoFiltroExtra.setText("");
        new ExtraDao().popularTabela(tblExtra, campoFiltroExtra.getText());
    }//GEN-LAST:event_btnLimparExtraActionPerformed

    private void btnFiltrarExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarExtraActionPerformed
        new ExtraDao().popularTabela(tblExtra, campoFiltroExtra.getText());
    }//GEN-LAST:event_btnFiltrarExtraActionPerformed

    private void btnSalvarExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarExtraActionPerformed
        Extra extra = new Extra();

        extra.setId(codigo);
        extra.setNome(campoExtra.getText());

        ExtraDao extraDao = new ExtraDao();
        String retornoSalvarExtra = null;
        String erroExtra = "";

        if (campoExtra.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarExtra = extraDao.salvar(extra);
            } else {
                retornoSalvarExtra = extraDao.atualizar(extra);
            }
        } else {
            erroExtra = null;
            JOptionPane.showMessageDialog(null, "Digite uma informação válida!");
        }

        if (retornoSalvarExtra == null && erroExtra != null) {
            JOptionPane.showMessageDialog(null, "Extra salvo com sucesso!");

            campoExtra.setText("");

            campoExtra.requestFocus();

            campoFiltroExtra.setText("");

            codigo = 0;

            new ExtraDao().popularTabela(tblExtra, campoFiltroExtra.getText());

        } else {
            if (erroExtra != null) {
                JOptionPane.showMessageDialog(null, "Extra " + campoExtra.getText() + " já está cadastrado!");
                campoExtra.setText("");

                campoExtra.requestFocus();

                campoFiltroExtra.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarExtraActionPerformed

    private void btnExcluirEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEstiloActionPerformed
        String codigoExcluirEstilo = String.valueOf(tblEstilo.getValueAt(tblEstilo.getSelectedRow(), 0));

        String retornoExcluirEstilo = new EstiloDao().excluir(Integer.parseInt(codigoExcluirEstilo));

        if (retornoExcluirEstilo == null) {
            JOptionPane.showMessageDialog(null, "Estilo excluído com sucesso!");
            new EstiloDao().popularTabela(tblEstilo, campoFiltroEstilo.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblEstilo.getValueAt(tblEstilo.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirEstiloActionPerformed

    private void btnEditarEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstiloActionPerformed
        String codigoEditarEstilo = String.valueOf(tblEstilo.getValueAt(tblEstilo.getSelectedRow(), 0));

        Estilo estilo = new EstiloDao().consultarId(Integer.parseInt(codigoEditarEstilo));

        if (estilo != null) {
            abaEstilo.setSelectedIndex(0);

            campoEstilo.setText(estilo.getNome());

            campoEstilo.requestFocus();

            codigo = estilo.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar estilo!");
        }
    }//GEN-LAST:event_btnEditarEstiloActionPerformed

    private void btnFecharEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharEstiloActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharEstiloActionPerformed

    private void btnLimparEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparEstiloActionPerformed
        campoFiltroEstilo.setText("");
        new EstiloDao().popularTabela(tblEstilo, campoFiltroEstilo.getText());
    }//GEN-LAST:event_btnLimparEstiloActionPerformed

    private void btnFiltrarEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarEstiloActionPerformed
        new EstiloDao().popularTabela(tblEstilo, campoFiltroEstilo.getText());
    }//GEN-LAST:event_btnFiltrarEstiloActionPerformed

    private void btnSalvarEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEstiloActionPerformed
        Estilo estilo = new Estilo();

        estilo.setId(codigo);
        estilo.setNome(campoEstilo.getText());

        EstiloDao estiloDao = new EstiloDao();
        String retornoSalvarEstilo = null;
        String erroEstilo = "";

        if (campoEstilo.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarEstilo = estiloDao.salvar(estilo);
            } else {
                retornoSalvarEstilo = estiloDao.atualizar(estilo);
            }
        } else {
            erroEstilo = null;
            JOptionPane.showMessageDialog(null, "Digite uma informação válida!");
        }

        if (retornoSalvarEstilo == null && erroEstilo != null) {
            JOptionPane.showMessageDialog(null, "Estilo salvo com sucesso!");

            campoEstilo.setText("");

            campoEstilo.requestFocus();

            campoFiltroEstilo.setText("");

            codigo = 0;

            new EstiloDao().popularTabela(tblEstilo, campoFiltroEstilo.getText());

        } else {
            if (erroEstilo != null) {
                JOptionPane.showMessageDialog(null, "Estilo " + campoEstilo.getText() + " já está cadastrado!");
                campoEstilo.setText("");

                campoEstilo.requestFocus();

                campoFiltroEstilo.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarEstiloActionPerformed

    private void btnExcluirCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCorInternaActionPerformed
        String codigoExcluirCorInterna = String.valueOf(tblCorInterna.getValueAt(tblCorInterna.getSelectedRow(), 0));

        String retornoExcluirCorInterna = new CorInternaDao().excluir(Integer.parseInt(codigoExcluirCorInterna));

        if (retornoExcluirCorInterna == null) {
            JOptionPane.showMessageDialog(null, "Cor interna excluída com sucesso!");
            new CorInternaDao().popularTabela(tblCorInterna, campoFiltroCorInterna.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblCorInterna.getValueAt(tblCorInterna.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirCorInternaActionPerformed

    private void btnEditarCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCorInternaActionPerformed
        String codigoEditarCorInterna = String.valueOf(tblCorInterna.getValueAt(tblCorInterna.getSelectedRow(), 0));

        CorInterna corInterna = new CorInternaDao().consultarId(Integer.parseInt(codigoEditarCorInterna));

        if (corInterna != null) {
            abaCorInterna.setSelectedIndex(0);

            campoCorInterna.setText(corInterna.getNome());

            campoCorInterna.requestFocus();

            codigo = corInterna.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar cor interna!");
        }
    }//GEN-LAST:event_btnEditarCorInternaActionPerformed

    private void btnFecharCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCorInternaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharCorInternaActionPerformed

    private void btnLimparCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCorInternaActionPerformed
        campoFiltroCorInterna.setText("");
        new CorInternaDao().popularTabela(tblCorInterna, campoFiltroCorInterna.getText());
    }//GEN-LAST:event_btnLimparCorInternaActionPerformed

    private void btnFiltrarCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCorInternaActionPerformed
        new CorInternaDao().popularTabela(tblCorInterna, campoFiltroCorInterna.getText());
    }//GEN-LAST:event_btnFiltrarCorInternaActionPerformed

    private void btnSalvarCorInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCorInternaActionPerformed
        CorInterna corInterna = new CorInterna();

        corInterna.setId(codigo);
        corInterna.setNome(campoCorInterna.getText());

        CorInternaDao corInternaDao = new CorInternaDao();
        String retornoSalvarCorInterna = null;
        String erroCorInterna = "";

        if (campoCorInterna.getText().length() >= 4) {
            if (codigo == 0) {
                retornoSalvarCorInterna = corInternaDao.salvar(corInterna);
            } else {
                retornoSalvarCorInterna = corInternaDao.atualizar(corInterna);
            }
        } else {
            erroCorInterna = null;
            JOptionPane.showMessageDialog(null, "Digite uma informação válida!");
        }

        if (retornoSalvarCorInterna == null && erroCorInterna != null) {
            JOptionPane.showMessageDialog(null, "Cor interna salva com sucesso!");

            campoCorInterna.setText("");

            campoCorInterna.requestFocus();

            campoFiltroCorInterna.setText("");

            codigo = 0;

            new CorInternaDao().popularTabela(tblCorInterna, campoFiltroCorInterna.getText());

        } else {
            if (erroCorInterna != null) {
                JOptionPane.showMessageDialog(null, "Cor interna " + campoCorInterna.getText() + " já está cadastrada!");
                campoCorInterna.setText("");

                campoCorInterna.requestFocus();

                campoFiltroCorInterna.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarCorInternaActionPerformed

    private void btnExcluirCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCorExternaActionPerformed
        String codigoExcluirCorExterna = String.valueOf(tblCorExterna.getValueAt(tblCorExterna.getSelectedRow(), 0));

        String retornoExcluirCorExterna = new CorExternaDao().excluir(Integer.parseInt(codigoExcluirCorExterna));

        if (retornoExcluirCorExterna == null) {
            JOptionPane.showMessageDialog(null, "Cor externa excluída com sucesso!");
            new CorExternaDao().popularTabela(tblCorExterna, campoFiltroCorExterna.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblCorExterna.getValueAt(tblCorExterna.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirCorExternaActionPerformed

    private void btnEditarCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCorExternaActionPerformed
        String codigoEditarCorExterna = String.valueOf(tblCorExterna.getValueAt(tblCorExterna.getSelectedRow(), 0));

        CorExterna corExterna = new CorExternaDao().consultarId(Integer.parseInt(codigoEditarCorExterna));

        if (corExterna != null) {
            abaCorExterna.setSelectedIndex(0);

            campoCorExterna.setText(corExterna.getNome());

            campoCorExterna.requestFocus();

            codigo = corExterna.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar cor externa!");
        }
    }//GEN-LAST:event_btnEditarCorExternaActionPerformed

    private void btnFecharCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCorExternaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharCorExternaActionPerformed

    private void btnLimparCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCorExternaActionPerformed
        campoFiltroCorExterna.setText("");
        new CorExternaDao().popularTabela(tblCorExterna, campoFiltroCorExterna.getText());
    }//GEN-LAST:event_btnLimparCorExternaActionPerformed

    private void btnFiltrarCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCorExternaActionPerformed
        new CorExternaDao().popularTabela(tblCorExterna, campoFiltroCorExterna.getText());
    }//GEN-LAST:event_btnFiltrarCorExternaActionPerformed

    private void btnSalvarCorExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCorExternaActionPerformed
        CorExterna corExterna = new CorExterna();

        corExterna.setId(codigo);
        corExterna.setNome(campoCorExterna.getText());

        CorExternaDao corExternaDao = new CorExternaDao();
        String retornoSalvarCorExterna = null;
        String erroCorExterna = "";

        if (campoCorExterna.getText().length() >= 4) {
            if (codigo == 0) {
                retornoSalvarCorExterna = corExternaDao.salvar(corExterna);
            } else {
                retornoSalvarCorExterna = corExternaDao.atualizar(corExterna);
            }
        } else {
            erroCorExterna = null;
            JOptionPane.showMessageDialog(null, "Digite uma informação válida!");
        }

        if (retornoSalvarCorExterna == null && erroCorExterna != null) {
            JOptionPane.showMessageDialog(null, "Cor externa salva com sucesso!");

            campoCorExterna.setText("");

            campoCorExterna.requestFocus();

            campoFiltroCorExterna.setText("");

            codigo = 0;

            new CorExternaDao().popularTabela(tblCorExterna, campoFiltroCorExterna.getText());

        } else {
            if (erroCorExterna != null) {
                JOptionPane.showMessageDialog(null, "Cor externa " + campoCorExterna.getText() + " já está cadastrada!");
                campoCorExterna.setText("");

                campoCorExterna.requestFocus();

                campoFiltroCorExterna.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarCorExternaActionPerformed

    private void btnExcluirConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirConfortoActionPerformed
        String codigoExcluirConforto = String.valueOf(tblConforto.getValueAt(tblConforto.getSelectedRow(), 0));

        String retornoExcluirConforto = new ConfortoDao().excluir(Integer.parseInt(codigoExcluirConforto));

        if (retornoExcluirConforto == null) {
            JOptionPane.showMessageDialog(null, "Conforto excluído com sucesso!");
            new ConfortoDao().popularTabela(tblConforto, campoFiltroConforto.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblConforto.getValueAt(tblConforto.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirConfortoActionPerformed

    private void btnEditarConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarConfortoActionPerformed
        String codigoEditarConforto = String.valueOf(tblConforto.getValueAt(tblConforto.getSelectedRow(), 0));

        Conforto conforto = new ConfortoDao().consultarId(Integer.parseInt(codigoEditarConforto));

        if (conforto != null) {
            abaConforto.setSelectedIndex(0);

            campoConforto.setText(conforto.getNome());

            campoConforto.requestFocus();

            codigo = conforto.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar cor conforto!");
        }
    }//GEN-LAST:event_btnEditarConfortoActionPerformed

    private void btnFecharConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharConfortoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharConfortoActionPerformed

    private void btnLimparConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparConfortoActionPerformed
        campoFiltroConforto.setText("");
        new ConfortoDao().popularTabela(tblConforto, campoFiltroConforto.getText());
    }//GEN-LAST:event_btnLimparConfortoActionPerformed

    private void btnFiltrarConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarConfortoActionPerformed
        new ConfortoDao().popularTabela(tblConforto, campoFiltroConforto.getText());
    }//GEN-LAST:event_btnFiltrarConfortoActionPerformed

    private void btnSalvarConfortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarConfortoActionPerformed
        Conforto conforto = new Conforto();

        conforto.setId(codigo);
        conforto.setNome(campoConforto.getText());

        ConfortoDao confortoDao = new ConfortoDao();
        String retornoSalvarConforto = null;
        String erroConforto = "";

        if (campoConforto.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarConforto = confortoDao.salvar(conforto);
            } else {
                retornoSalvarConforto = confortoDao.atualizar(conforto);
            }
        } else {
            erroConforto = null;
            JOptionPane.showMessageDialog(null, "Digite uma informação válida!");
        }

        if (retornoSalvarConforto == null && erroConforto != null) {
            JOptionPane.showMessageDialog(null, "Conforto salvo com sucesso!");

            campoConforto.setText("");

            campoConforto.requestFocus();

            campoFiltroConforto.setText("");

            codigo = 0;

            new ConfortoDao().popularTabela(tblConforto, campoFiltroConforto.getText());

        } else {
            if (erroConforto != null) {
                JOptionPane.showMessageDialog(null, "Conforto " + campoConforto.getText() + " já está cadastrado!");
                campoConforto.setText("");

                campoConforto.requestFocus();

                campoFiltroConforto.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarConfortoActionPerformed

    private void btnExcluirCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCarroceriaActionPerformed
        String codigoExcluirCarroceria = String.valueOf(tblCarroceria.getValueAt(tblCarroceria.getSelectedRow(), 0));

        String retornoExcluirCarroceria = new CarroceriaDao().excluir(Integer.parseInt(codigoExcluirCarroceria));

        if (retornoExcluirCarroceria == null) {
            JOptionPane.showMessageDialog(null, "Carroceria excluída com sucesso!");
            new CarroceriaDao().popularTabela(tblCarroceria, campoFiltroCarroceria.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblCarroceria.getValueAt(tblCarroceria.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirCarroceriaActionPerformed

    private void btnEditarCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCarroceriaActionPerformed
        String codigoEditarCarroceria = String.valueOf(tblCarroceria.getValueAt(tblCarroceria.getSelectedRow(), 0));

        Carroceria carroceria = new CarroceriaDao().consultarId(Integer.parseInt(codigoEditarCarroceria));

        if (carroceria != null) {
            abaCarroceria.setSelectedIndex(0);

            campoCarroceria.setText(carroceria.getNome());

            campoCarroceria.requestFocus();

            codigo = carroceria.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar cor carroceria!");
        }
    }//GEN-LAST:event_btnEditarCarroceriaActionPerformed

    private void btnFecharCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCarroceriaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharCarroceriaActionPerformed

    private void btnLimparCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCarroceriaActionPerformed
        campoFiltroCarroceria.setText("");
        new CarroceriaDao().popularTabela(tblCarroceria, campoFiltroCarroceria.getText());
    }//GEN-LAST:event_btnLimparCarroceriaActionPerformed

    private void btnFiltrarCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCarroceriaActionPerformed
        new CarroceriaDao().popularTabela(tblCarroceria, campoFiltroCarroceria.getText());
    }//GEN-LAST:event_btnFiltrarCarroceriaActionPerformed

    private void btnSalvarCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCarroceriaActionPerformed
        Carroceria carroceria = new Carroceria();

        carroceria.setId(codigo);
        carroceria.setNome(campoCarroceria.getText());

        CarroceriaDao carroceriaDao = new CarroceriaDao();
        String retornoSalvarCarroceria = null;
        String erroCarroceria = "";

        if (campoCarroceria.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarCarroceria = carroceriaDao.salvar(carroceria);
            } else {
                retornoSalvarCarroceria = carroceriaDao.atualizar(carroceria);
            }
        } else {
            erroCarroceria = null;
            JOptionPane.showMessageDialog(null, "Digite uma informação válida!");
        }

        if (retornoSalvarCarroceria == null && erroCarroceria != null) {
            JOptionPane.showMessageDialog(null, "Carroceria salva com sucesso!");

            campoCarroceria.setText("");

            campoCarroceria.requestFocus();

            codigo = 0;

            campoFiltroCarroceria.setText("");

            new CarroceriaDao().popularTabela(tblCarroceria, campoFiltroCarroceria.getText());

        } else {
            if (erroCarroceria != null) {
                JOptionPane.showMessageDialog(null, "Carroceria " + campoCarroceria.getText() + " já está cadastrada!");
                campoCarroceria.setText("");

                campoCarroceria.requestFocus();

                codigo = 0;

                campoFiltroCarroceria.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarCarroceriaActionPerformed

    private void btnExcluirCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCambioActionPerformed
        String codigoExcluirCambio = String.valueOf(tblCambio.getValueAt(tblCambio.getSelectedRow(), 0));

        String retornoExcluirCambio = new CambioDao().excluir(Integer.parseInt(codigoExcluirCambio));

        if (retornoExcluirCambio == null) {
            JOptionPane.showMessageDialog(null, "Câmbio excluído com sucesso!");
            new CambioDao().popularTabela(tblCambio, campoFiltroCambio.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblCambio.getValueAt(tblCambio.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirCambioActionPerformed

    private void btnEditarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCambioActionPerformed
        String codigoEditarCambio = String.valueOf(tblCambio.getValueAt(tblCambio.getSelectedRow(), 0));

        Cambio cambio = new CambioDao().consultarId(Integer.parseInt(codigoEditarCambio));

        if (cambio != null) {
            abaCambio.setSelectedIndex(0);

            campoCambio.setText(cambio.getNome());

            campoCambio.requestFocus();

            codigo = cambio.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar cor câmbio!");
        }
    }//GEN-LAST:event_btnEditarCambioActionPerformed

    private void btnFecharCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCambioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharCambioActionPerformed

    private void btnLimparCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCambioActionPerformed
        campoFiltroCambio.setText("");
        new CambioDao().popularTabela(tblCambio, campoFiltroCambio.getText());
    }//GEN-LAST:event_btnLimparCambioActionPerformed

    private void btnFiltrarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCambioActionPerformed
        new CambioDao().popularTabela(tblCambio, campoFiltroCambio.getText());
    }//GEN-LAST:event_btnFiltrarCambioActionPerformed

    private void btnSalvarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCambioActionPerformed
        Cambio cambio = new Cambio();

        cambio.setId(codigo);
        cambio.setNome(campoCambio.getText());

        CambioDao cambioDao = new CambioDao();
        String retornoSalvarCambio = null;
        String erroCambio = "";

        if (campoCambio.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarCambio = cambioDao.salvar(cambio);
            } else {
                retornoSalvarCambio = cambioDao.atualizar(cambio);
            }
        } else {
            erroCambio = null;
            JOptionPane.showMessageDialog(null, "Digite uma informação válida!");
        }

        if (retornoSalvarCambio == null && erroCambio != null) {
            JOptionPane.showMessageDialog(null, "Câmbio salvo com sucesso!");

            campoCambio.setText("");

            campoCambio.requestFocus();

            campoFiltroCambio.setText("");

            codigo = 0;

            new CambioDao().popularTabela(tblCambio, campoFiltroCambio.getText());

        } else {
            if (erroCambio != null) {
                JOptionPane.showMessageDialog(null, "Câmbio " + campoCambio.getText() + " já está cadastrado");
                campoCambio.setText("");

                campoCambio.requestFocus();

                campoFiltroCambio.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarCambioActionPerformed

    private void btnExcluirCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCombustivelActionPerformed
        String codigoExcluirCombustivel = String.valueOf(tblCombustivel.getValueAt(tblCombustivel.getSelectedRow(), 0));

        String retornoExcluirCombustivel = new CombustivelDao().excluir(Integer.parseInt(codigoExcluirCombustivel));

        if (retornoExcluirCombustivel == null) {
            JOptionPane.showMessageDialog(null, "Combustível excluído com sucesso!");
            new CombustivelDao().popularTabela(tblCombustivel, campoFiltroCombustivel.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblCombustivel.getValueAt(tblCombustivel.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirCombustivelActionPerformed

    private void btnEditaCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaCombustivelActionPerformed
        String codigoEditarCombustivel = String.valueOf(tblCombustivel.getValueAt(tblCombustivel.getSelectedRow(), 0));

        Combustivel combustivel = new CombustivelDao().consultarId(Integer.parseInt(codigoEditarCombustivel));

        if (combustivel != null) {
            abaCombustivel.setSelectedIndex(0);

            campoCombustivel.setText(combustivel.getNome());

            campoCombustivel.requestFocus();

            codigo = combustivel.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar combustível!");
        }
    }//GEN-LAST:event_btnEditaCombustivelActionPerformed

    private void btnFecharCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCombustivelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharCombustivelActionPerformed

    private void btnLimparCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCombustivelActionPerformed
        campoFiltroCombustivel.setText("");
        new CombustivelDao().popularTabela(tblCombustivel, campoFiltroCombustivel.getText());
    }//GEN-LAST:event_btnLimparCombustivelActionPerformed

    private void btnFiltrarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCombustivelActionPerformed
        new CombustivelDao().popularTabela(tblCombustivel, campoFiltroCombustivel.getText());
    }//GEN-LAST:event_btnFiltrarCombustivelActionPerformed

    private void btnSalvarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCombustivelActionPerformed
        Combustivel combustivel = new Combustivel();

        combustivel.setId(codigo);
        combustivel.setNome(campoCombustivel.getText());

        CombustivelDao combustivelDao = new CombustivelDao();
        String retornoSalvarCombustivel = null;
        String erroCombustivel = "";

        if (campoCombustivel.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarCombustivel = combustivelDao.salvar(combustivel);
            } else {
                retornoSalvarCombustivel = combustivelDao.atualizar(combustivel);
            }
        } else {
            erroCombustivel = null;
            JOptionPane.showMessageDialog(null, "Digite uma informação válida!");
        }

        if (retornoSalvarCombustivel == null && erroCombustivel != null) {
            JOptionPane.showMessageDialog(null, "Combustível salvo com sucesso!");

            campoCombustivel.setText("");

            campoCombustivel.requestFocus();

            campoFiltroCombustivel.setText("");

            codigo = 0;

            new CombustivelDao().popularTabela(tblCombustivel, campoFiltroCombustivel.getText());

        } else {
            if (erroCombustivel != null) {
                JOptionPane.showMessageDialog(null, "Combustível " + campoCombustivel.getText() + " já está cadastrado!");

                campoCombustivel.setText("");

                campoCombustivel.requestFocus();

                campoFiltroCombustivel.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarCombustivelActionPerformed

    private void btnExcluirAcabamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAcabamentoActionPerformed
        String codigoExcluirAcabamento = String.valueOf(tblAcabamentoInterno.getValueAt(tblAcabamentoInterno.getSelectedRow(), 0));

        String retornoExcluirAcabamento = new AcabamentoInternoDao().excluir(Integer.parseInt(codigoExcluirAcabamento));

        if (retornoExcluirAcabamento == null) {
            JOptionPane.showMessageDialog(null, "Acabamento interno excluído com sucesso!");
            new AcabamentoInternoDao().popularTabela(tblAcabamentoInterno, campoFiltroAcabamento.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblAcabamentoInterno.getValueAt(tblAcabamentoInterno.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirAcabamentoActionPerformed

    private void btnEditarAcabamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAcabamentoActionPerformed
        String codigoEditarAcabamento = String.valueOf(tblAcabamentoInterno.getValueAt(tblAcabamentoInterno.getSelectedRow(), 0));

        AcabamentoInterno acabamento = new AcabamentoInternoDao().consultarId(Integer.parseInt(codigoEditarAcabamento));

        if (acabamento != null) {
            abaAcabamento.setSelectedIndex(0);

            campoAcabamento.setText(acabamento.getNome());

            campoAcabamento.requestFocus();

            codigo = acabamento.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar acabamento interno!");
        }
    }//GEN-LAST:event_btnEditarAcabamentoActionPerformed

    private void btnFecharAcabamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharAcabamentoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharAcabamentoActionPerformed

    private void btnLimparAcabamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparAcabamentoActionPerformed
        campoFiltroAcabamento.setText("");
        new AcabamentoInternoDao().popularTabela(tblAcabamentoInterno, campoFiltroAcabamento.getText());
    }//GEN-LAST:event_btnLimparAcabamentoActionPerformed

    private void btnFiltrarAcabamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarAcabamentoActionPerformed
        new AcabamentoInternoDao().popularTabela(tblAcabamentoInterno, campoFiltroAcabamento.getText());
    }//GEN-LAST:event_btnFiltrarAcabamentoActionPerformed

    private void btnSalvarAcabamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAcabamentoActionPerformed
        AcabamentoInterno acabamento = new AcabamentoInterno();

        acabamento.setId(codigo);
        acabamento.setNome(campoAcabamento.getText());

        AcabamentoInternoDao acabamentoDao = new AcabamentoInternoDao();
        String retornoSalvarAcabamento = null;
        String erroAcabamento = "";

        if (campoAcabamento.getText().length() > 1) {
            if (codigo == 0) {
                retornoSalvarAcabamento = acabamentoDao.salvar(acabamento);
            } else {
                retornoSalvarAcabamento = acabamentoDao.atualizar(acabamento);
            }
        } else {
            erroAcabamento = null;
            JOptionPane.showMessageDialog(null, "Digite uma informação válida!");
        }

        if (retornoSalvarAcabamento == null && erroAcabamento != null) {
            JOptionPane.showMessageDialog(null, "Acabamento interno salvo com sucesso!");

            campoAcabamento.setText("");

            campoAcabamento.requestFocus();

            campoFiltroAcabamento.setText("");

            codigo = 0;

            new AcabamentoInternoDao().popularTabela(tblAcabamentoInterno, campoFiltroAcabamento.getText());

        } else {
            if (erroAcabamento != null) {
                JOptionPane.showMessageDialog(null, "Acabamento interno " + campoAcabamento.getText() + " já está cadastrado!");

                campoAcabamento.setText("");

                campoAcabamento.requestFocus();

                campoFiltroAcabamento.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarAcabamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaAcabamento;
    private javax.swing.JTabbedPane abaCambio;
    private javax.swing.JTabbedPane abaCarroceria;
    private javax.swing.JTabbedPane abaCombustivel;
    private javax.swing.JTabbedPane abaConforto;
    private javax.swing.JTabbedPane abaCorExterna;
    private javax.swing.JTabbedPane abaCorInterna;
    private javax.swing.JTabbedPane abaEstilo;
    private javax.swing.JTabbedPane abaExtra;
    private javax.swing.JTabbedPane abaProcedencia;
    private javax.swing.JTabbedPane abaSeguranca;
    private javax.swing.JTabbedPane abaTecnologia;
    private javax.swing.JButton btnEditaCombustivel;
    private javax.swing.JButton btnEditarAcabamento;
    private javax.swing.JButton btnEditarCambio;
    private javax.swing.JButton btnEditarCarroceria;
    private javax.swing.JButton btnEditarConforto;
    private javax.swing.JButton btnEditarCorExterna;
    private javax.swing.JButton btnEditarCorInterna;
    private javax.swing.JButton btnEditarEstilo;
    private javax.swing.JButton btnEditarExtra;
    private javax.swing.JButton btnEditarProcedencia;
    private javax.swing.JButton btnEditarSeguranca;
    private javax.swing.JButton btnEditarTecnologia;
    private javax.swing.JButton btnExcluirAcabamento;
    private javax.swing.JButton btnExcluirCambio;
    private javax.swing.JButton btnExcluirCarroceria;
    private javax.swing.JButton btnExcluirCombustivel;
    private javax.swing.JButton btnExcluirConforto;
    private javax.swing.JButton btnExcluirCorExterna;
    private javax.swing.JButton btnExcluirCorInterna;
    private javax.swing.JButton btnExcluirEstilo;
    private javax.swing.JButton btnExcluirExtra;
    private javax.swing.JButton btnExcluirProcedencia;
    private javax.swing.JButton btnExcluirSeguranca;
    private javax.swing.JButton btnExcluirTecnologia;
    private javax.swing.JButton btnFecharAcabamento;
    private javax.swing.JButton btnFecharCambio;
    private javax.swing.JButton btnFecharCarroceria;
    private javax.swing.JButton btnFecharCombustivel;
    private javax.swing.JButton btnFecharConforto;
    private javax.swing.JButton btnFecharCorExterna;
    private javax.swing.JButton btnFecharCorInterna;
    private javax.swing.JButton btnFecharEstilo;
    private javax.swing.JButton btnFecharExtra;
    private javax.swing.JButton btnFecharProcedencia;
    private javax.swing.JButton btnFecharSeguranca;
    private javax.swing.JButton btnFecharTecnologia;
    private javax.swing.JButton btnFiltrarAcabamento;
    private javax.swing.JButton btnFiltrarCambio;
    private javax.swing.JButton btnFiltrarCarroceria;
    private javax.swing.JButton btnFiltrarCombustivel;
    private javax.swing.JButton btnFiltrarConforto;
    private javax.swing.JButton btnFiltrarCorExterna;
    private javax.swing.JButton btnFiltrarCorInterna;
    private javax.swing.JButton btnFiltrarEstilo;
    private javax.swing.JButton btnFiltrarExtra;
    private javax.swing.JButton btnFiltrarProcedencia;
    private javax.swing.JButton btnFiltrarSeguranca;
    private javax.swing.JButton btnFiltrarTecnologia;
    private javax.swing.JButton btnLimparAcabamento;
    private javax.swing.JButton btnLimparCambio;
    private javax.swing.JButton btnLimparCarroceria;
    private javax.swing.JButton btnLimparCombustivel;
    private javax.swing.JButton btnLimparConforto;
    private javax.swing.JButton btnLimparCorExterna;
    private javax.swing.JButton btnLimparCorInterna;
    private javax.swing.JButton btnLimparEstilo;
    private javax.swing.JButton btnLimparExtra;
    private javax.swing.JButton btnLimparProcedencia;
    private javax.swing.JButton btnLimparSeguranca;
    private javax.swing.JButton btnLimparTecnologia;
    private javax.swing.JButton btnSalvarAcabamento;
    private javax.swing.JButton btnSalvarCambio;
    private javax.swing.JButton btnSalvarCarroceria;
    private javax.swing.JButton btnSalvarCombustivel;
    private javax.swing.JButton btnSalvarConforto;
    private javax.swing.JButton btnSalvarCorExterna;
    private javax.swing.JButton btnSalvarCorInterna;
    private javax.swing.JButton btnSalvarEstilo;
    private javax.swing.JButton btnSalvarExtra;
    private javax.swing.JButton btnSalvarProcedencia;
    private javax.swing.JButton btnSalvarSeguranca;
    private javax.swing.JButton btnSalvarTecnologia;
    private javax.swing.JTextField campoAcabamento;
    private javax.swing.JTextField campoCambio;
    private javax.swing.JTextField campoCarroceria;
    private javax.swing.JTextField campoCombustivel;
    private javax.swing.JTextField campoConforto;
    private javax.swing.JTextField campoCorExterna;
    private javax.swing.JTextField campoCorInterna;
    private javax.swing.JTextField campoEstilo;
    private javax.swing.JTextField campoExtra;
    private javax.swing.JTextField campoFiltroAcabamento;
    private javax.swing.JTextField campoFiltroCambio;
    private javax.swing.JTextField campoFiltroCarroceria;
    private javax.swing.JTextField campoFiltroCombustivel;
    private javax.swing.JTextField campoFiltroConforto;
    private javax.swing.JTextField campoFiltroCorExterna;
    private javax.swing.JTextField campoFiltroCorInterna;
    private javax.swing.JTextField campoFiltroEstilo;
    private javax.swing.JTextField campoFiltroExtra;
    private javax.swing.JTextField campoFiltroProcedencia;
    private javax.swing.JTextField campoFiltroSeguranca;
    private javax.swing.JTextField campoFiltroTecnologia;
    private javax.swing.JTextField campoProcedencia;
    private javax.swing.JTextField campoSeguranca;
    private javax.swing.JTextField campoTecnologia;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblAcabamentoInterno;
    private javax.swing.JTable tblCambio;
    private javax.swing.JTable tblCarroceria;
    private javax.swing.JTable tblCombustivel;
    private javax.swing.JTable tblConforto;
    private javax.swing.JTable tblCorExterna;
    private javax.swing.JTable tblCorInterna;
    private javax.swing.JTable tblEstilo;
    private javax.swing.JTable tblExtra;
    private javax.swing.JTable tblProcedencia;
    private javax.swing.JTable tblSeguranca;
    private javax.swing.JTable tblTecnologia;
    // End of variables declaration//GEN-END:variables
}
