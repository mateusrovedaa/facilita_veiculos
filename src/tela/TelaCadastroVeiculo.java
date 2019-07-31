package tela;

import dao.CambioDao;
import dao.ComboDao;
import dao.ConfortoDao;
import dao.EstiloDao;
import dao.ExtraDao;
import dao.SegurancaDao;
import dao.TecnologiaDao;
import dao.VeiculoConfortoDao;
import dao.VeiculoDao;
import dao.VeiculoEstiloDao;
import dao.VeiculoExtraDao;
import dao.VeiculoSegurancaDao;
import dao.VeiculoTecnologiaDao;
import dao.VersaoDao;
import entidade.Cambio;
import entidade.Veiculo;
import entidade.Versao;
import functions.ComboItem;
import functions.Formatacao;
import functions.Funcoes;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaCadastroVeiculo extends javax.swing.JInternalFrame {

    int codigo = 0;
    LocalDate now = LocalDate.now();

    public TelaCadastroVeiculo() {
        initComponents();
        campoIdVersaoBusca.setEditable(false);
        campoNomeVersaoBusca.setEditable(false);
        campoIdCambioBusca.setEditable(false);
        campoNomeCambioBusca.setEditable(false);
        new ComboDao().popularCombo("cores_internas", comboCorInternaId);
        new ComboDao().popularCombo("cores_externas", comboCorExternaId);
        new ComboDao().popularCombo("acabamentos_internos", comboAcabamentoInternoId);
        new VeiculoDao().listarSituacaoVeiculo(comboSituacao);
        new VeiculoDao().listarSituacaoVeiculo(comboFiltroSituacao);
        new ConfortoDao().listarConforto(tblConforto, "");
        new SegurancaDao().listarSeguranca(tblSeguranca, "");
        new TecnologiaDao().listarTecnologia(tblTecnologia, "");
        new EstiloDao().listarEstilo(tblEstilo, "");
        new ExtraDao().listarExtra(tblExtra, "");
        Formatacao.formatarData(campoFiltroDataDe);
        Formatacao.formatarData(campoFiltroDataAte);
        campoFiltroDataDe.setText(Formatacao.ajustaDataDMA(now.toString()));
        campoFiltroDataAte.setText(Formatacao.ajustaDataDMA(now.toString()));
        new VeiculoDao().popularTabela(tblVeiculo, "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        agrupadorChaveReserva = new javax.swing.ButtonGroup();
        agrupadorManual = new javax.swing.ButtonGroup();
        agrupadorVistoriado = new javax.swing.ButtonGroup();
        abaVeiculo = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        abaInformacoes = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        comboAcabamentoInternoId = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        radioChaveReservaSim = new javax.swing.JRadioButton();
        radioChaveReservaNao = new javax.swing.JRadioButton();
        campoNumeroProprietarios = new javax.swing.JTextField();
        campoNumeroOcorrencias = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        radioManualSim = new javax.swing.JRadioButton();
        radioManualNao = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        radioVistoriadoSim = new javax.swing.JRadioButton();
        radioVistoriadoNao = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoInformacoes = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        campoIdVersaoBusca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoNomeVersaoBusca = new javax.swing.JTextField();
        buscarVersao = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        campoIdCambioBusca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoNomeCambioBusca = new javax.swing.JTextField();
        buscarCambio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboCorInternaId = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboCorExternaId = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboSituacao = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        campoQuilometragem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoPlaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoChassi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoRenavam = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConforto = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSeguranca = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTecnologia = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblEstilo = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblExtra = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblVeiculo = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        campoFiltroPlaca = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        comboFiltroSituacao = new javax.swing.JComboBox<>();
        btnLimparFiltroVeiculo = new javax.swing.JButton();
        btnFiltrarVeiculo = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        campoFiltroDataAte = new javax.swing.JFormattedTextField();
        campoFiltroDataDe = new javax.swing.JFormattedTextField();
        btnFecharVeiculo = new javax.swing.JButton();
        btnSalvarVeiculo = new javax.swing.JButton();
        btnEditarVeiculo = new javax.swing.JButton();
        btnExcluirVeiculo = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setTitle("Cadastro de veículos");

        jPanel1.setPreferredSize(new java.awt.Dimension(996, 500));

        abaInformacoes.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações adicionais:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Acabamento interno:*");

        comboAcabamentoInternoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Número de proprietários:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Número de ocorrencias:");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Chave reserva:");

        agrupadorChaveReserva.add(radioChaveReservaSim);
        radioChaveReservaSim.setText("Sim");

        agrupadorChaveReserva.add(radioChaveReservaNao);
        radioChaveReservaNao.setText("Não");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Manual do veículo:");

        agrupadorManual.add(radioManualSim);
        radioManualSim.setText("Sim");

        agrupadorManual.add(radioManualNao);
        radioManualNao.setText("Não");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Veículo vistoriado:");

        agrupadorVistoriado.add(radioVistoriadoSim);
        radioVistoriadoSim.setText("Sim");

        agrupadorVistoriado.add(radioVistoriadoNao);
        radioVistoriadoNao.setText("Não");

        jLabel19.setText("Informações sobre o veículo:");

        campoInformacoes.setColumns(20);
        campoInformacoes.setRows(5);
        jScrollPane1.setViewportView(campoInformacoes);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboAcabamentoInternoId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoNumeroOcorrencias, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(radioChaveReservaSim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radioChaveReservaNao))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioManualSim)
                                            .addComponent(radioVistoriadoSim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(radioVistoriadoNao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radioManualNao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addComponent(campoNumeroProprietarios)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(comboAcabamentoInternoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(campoNumeroProprietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(campoNumeroOcorrencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(radioChaveReservaSim)
                    .addComponent(radioChaveReservaNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(radioManualSim)
                    .addComponent(radioManualNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(radioVistoriadoSim)
                    .addComponent(radioVistoriadoNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Versão:*"));

        jLabel7.setText("Código:");

        jLabel8.setText("Nome:");

        buscarVersao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        buscarVersao.setText("Procurar");
        buscarVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarVersaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdVersaoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeVersaoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarVersao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoIdVersaoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(campoNomeVersaoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarVersao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Câmbio:*"));

        jLabel9.setText("Código:");

        jLabel10.setText("Nome:");

        buscarCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        buscarCambio.setText("Procurar");
        buscarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdCambioBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeCambioBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarCambio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoIdCambioBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(campoNomeCambioBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarCambio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cor interna:*");

        comboCorInternaId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cor externa:*");

        comboCorExternaId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Situação:*");

        comboSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Quilometragem:*");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Placa:*");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Chassi:*");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Renavam:*");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Valor:*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoChassi)
                            .addComponent(comboCorInternaId, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                            .addComponent(comboCorExternaId, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboSituacao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoQuilometragem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPlaca)
                            .addComponent(campoRenavam)
                            .addComponent(campoValor, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(comboCorInternaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboCorExternaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(comboSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(campoRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        abaInformacoes.addTab("Informações do veículo", jPanel3);

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
        jScrollPane2.setViewportView(tblConforto);
        if (tblConforto.getColumnModel().getColumnCount() > 0) {
            tblConforto.getColumnModel().getColumn(0).setMinWidth(25);
            tblConforto.getColumnModel().getColumn(0).setMaxWidth(25);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaInformacoes.addTab("Confortos", jPanel4);

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
        jScrollPane3.setViewportView(tblSeguranca);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaInformacoes.addTab("Seguranças", jPanel5);

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
        jScrollPane4.setViewportView(tblTecnologia);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaInformacoes.addTab("Tecnologias", jPanel6);

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
        jScrollPane5.setViewportView(tblEstilo);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaInformacoes.addTab("Estilos", jPanel7);

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
        jScrollPane6.setViewportView(tblExtra);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaInformacoes.addTab("Extras", jPanel11);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(abaInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );

        abaVeiculo.addTab("Cadastrar veículo", jPanel1);

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
        jScrollPane7.setViewportView(tblVeiculo);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel23.setText("Placa:");

        jLabel26.setText("Situação:");

        comboFiltroSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnLimparFiltroVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparFiltroVeiculo.setText("Limpar");
        btnLimparFiltroVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFiltroVeiculoActionPerformed(evt);
            }
        });

        btnFiltrarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarVeiculo.setText("Filtrar");
        btnFiltrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarVeiculoActionPerformed(evt);
            }
        });

        jLabel20.setText("Date de:");

        jLabel21.setText("Data até:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboFiltroSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFiltrarVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparFiltroVeiculo)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(campoFiltroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(comboFiltroSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparFiltroVeiculo)
                    .addComponent(btnFiltrarVeiculo)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(campoFiltroDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFiltroDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaVeiculo.addTab("Listar veículos", jPanel2);

        btnFecharVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharVeiculo.setText("Fechar");
        btnFecharVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharVeiculoActionPerformed(evt);
            }
        });

        btnSalvarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarVeiculo.setText("Salvar");
        btnSalvarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarVeiculoActionPerformed(evt);
            }
        });

        btnEditarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarVeiculo.setText("Editar");
        btnEditarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVeiculoActionPerformed(evt);
            }
        });

        btnExcluirVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirVeiculo.setText("Excluir");
        btnExcluirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharVeiculo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(abaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharVeiculo)
                    .addComponent(btnSalvarVeiculo)
                    .addComponent(btnEditarVeiculo)
                    .addComponent(btnExcluirVeiculo))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarVeiculoActionPerformed
        Veiculo veiculo = new Veiculo();
        Funcoes funcoes = new Funcoes();

        ComboItem corInternaId = (ComboItem) comboCorInternaId.getSelectedItem();
        ComboItem corExternaId = (ComboItem) comboCorExternaId.getSelectedItem();
        ComboItem situacao = (ComboItem) comboSituacao.getSelectedItem();
        ComboItem acabamentoInternoId = (ComboItem) comboAcabamentoInternoId.getSelectedItem();

        veiculo.setId(codigo);

        if (!campoIdVersaoBusca.getText().equals("")) {
            veiculo.setVersaoId(Integer.parseInt(campoIdVersaoBusca.getText()));
        }

        if (!campoIdCambioBusca.getText().equals("")) {
            veiculo.setCambioId(Integer.parseInt(campoIdCambioBusca.getText()));
        }

        veiculo.setCorInternaId(corInternaId.getCodigo());
        veiculo.setCorExternaId(corExternaId.getCodigo());
        veiculo.setCorExternaId(corExternaId.getCodigo());
        veiculo.setSituacao(situacao.getDescricao());

        if (!campoQuilometragem.getText().equals("")) {
            veiculo.setQuilometragem(Double.parseDouble(campoQuilometragem.getText().replace(",", ".")));
        }

        veiculo.setPlaca(campoPlaca.getText());
        veiculo.setChassi(campoChassi.getText());
        veiculo.setRenavam(campoRenavam.getText());

        if (!campoValor.getText().equals("")) {
            veiculo.setValor(Double.parseDouble(campoValor.getText().replace(",", ".")));
        }

        veiculo.setAcabamentoInternoId(acabamentoInternoId.getCodigo());

        if (!campoNumeroProprietarios.getText().equals("")) {
            veiculo.setNumeroProprietarios(Integer.parseInt(campoNumeroProprietarios.getText()));
        }

        if (!campoNumeroOcorrencias.getText().equals("")) {
            veiculo.setNumeroOcorrencias(Integer.parseInt(campoNumeroOcorrencias.getText()));
        }
        if (radioChaveReservaSim.isSelected() == true) {
            veiculo.setChaveReserva(true);
        } else {
            veiculo.setChaveReserva(false);
        }

        if (radioManualSim.isSelected() == true) {
            veiculo.setManualVeiculo(true);
        } else {
            veiculo.setManualVeiculo(false);
        }

        if (radioVistoriadoSim.isSelected() == true) {
            veiculo.setVistoriado(true);
        } else {
            veiculo.setVistoriado(false);
        }
        veiculo.setInformacoesVeiculo(campoInformacoes.getText());

        VeiculoDao veiculoDao = new VeiculoDao();
        VeiculoConfortoDao veiculoConofortoDao = new VeiculoConfortoDao();
        VeiculoSegurancaDao veiculoSegurancaDao = new VeiculoSegurancaDao();
        VeiculoTecnologiaDao veiculoTecnologiaDao = new VeiculoTecnologiaDao();
        VeiculoEstiloDao veiculoEstiloDao = new VeiculoEstiloDao();
        VeiculoExtraDao veiculoExtraDao = new VeiculoExtraDao();

        String retornoSalvarVeiculo = null;
        String retornoExcluirConforto = null;
        String retornoExcluirSeguranca = null;
        String retornoExcluirTecnologia = null;
        String retornoExcluirEstilo = null;
        String retornoExcluirExtra = null;

        if (validaCampos() == true) {
            if (codigo == 0) {
                retornoSalvarVeiculo = veiculoDao.salvar(veiculo);
                veiculoConofortoDao.salvarVeiculoConforto(tblConforto, Integer.parseInt(retornoSalvarVeiculo));
                veiculoSegurancaDao.salvarVeiculoSeguranca(tblSeguranca, Integer.parseInt(retornoSalvarVeiculo));
                veiculoTecnologiaDao.salvarVeiculoTecnologia(tblTecnologia, Integer.parseInt(retornoSalvarVeiculo));
                veiculoEstiloDao.salvarVeiculoEstilo(tblEstilo, Integer.parseInt(retornoSalvarVeiculo));
                veiculoExtraDao.salvarVeiculoExtra(tblExtra, Integer.parseInt(retornoSalvarVeiculo));
            } else {
                retornoSalvarVeiculo = veiculoDao.atualizar(veiculo);
                retornoExcluirConforto = veiculoConofortoDao.excluir(Integer.parseInt(retornoSalvarVeiculo));
                if (retornoExcluirConforto == null) {
                    veiculoConofortoDao.salvarVeiculoConforto(tblConforto, Integer.parseInt(retornoSalvarVeiculo));
                }
                retornoExcluirSeguranca = veiculoSegurancaDao.excluir(Integer.parseInt(retornoSalvarVeiculo));
                if (retornoExcluirSeguranca == null) {
                    veiculoSegurancaDao.salvarVeiculoSeguranca(tblSeguranca, Integer.parseInt(retornoSalvarVeiculo));
                }
                retornoExcluirTecnologia = veiculoTecnologiaDao.excluir(Integer.parseInt(retornoSalvarVeiculo));
                if (retornoExcluirTecnologia == null) {
                    veiculoTecnologiaDao.salvarVeiculoTecnologia(tblTecnologia, Integer.parseInt(retornoSalvarVeiculo));
                }
                retornoExcluirEstilo = veiculoEstiloDao.excluir(Integer.parseInt(retornoSalvarVeiculo));
                if (retornoExcluirEstilo == null) {
                    veiculoEstiloDao.salvarVeiculoEstilo(tblEstilo, Integer.parseInt(retornoSalvarVeiculo));
                }
                retornoExcluirExtra = veiculoExtraDao.excluir(Integer.parseInt(retornoSalvarVeiculo));
                if (retornoExcluirExtra == null) {
                    veiculoExtraDao.salvarVeiculoExtra(tblExtra, Integer.parseInt(retornoSalvarVeiculo));
                }
            }
            JOptionPane.showMessageDialog(null, "Veículo salvo com sucesso!");
        } else {
            campoIdVersaoBusca.setText("");
            campoNomeVersaoBusca.setText("");
            campoIdCambioBusca.setText("");
            campoNomeCambioBusca.setText("");
            comboCorInternaId.setSelectedIndex(0);
            comboCorExternaId.setSelectedIndex(0);
            comboSituacao.setSelectedIndex(0);
            campoQuilometragem.setText("");
            campoPlaca.setText("");
            campoChassi.setText("");
            campoRenavam.setText("");
            campoValor.setText("");
            comboAcabamentoInternoId.setSelectedIndex(0);
            campoNumeroProprietarios.setText("");
            campoNumeroOcorrencias.setText("");
            campoInformacoes.setText("");
            agrupadorChaveReserva.clearSelection();
            agrupadorManual.clearSelection();
            agrupadorVistoriado.clearSelection();
            funcoes.limparCheckTabela(tblConforto);
            funcoes.limparCheckTabela(tblSeguranca);
            funcoes.limparCheckTabela(tblTecnologia);
            funcoes.limparCheckTabela(tblEstilo);
            funcoes.limparCheckTabela(tblExtra);
        }

        if (retornoSalvarVeiculo != null) {

            campoIdVersaoBusca.setText("");
            campoNomeVersaoBusca.setText("");
            campoIdCambioBusca.setText("");
            campoNomeCambioBusca.setText("");
            comboCorInternaId.setSelectedIndex(0);
            comboCorExternaId.setSelectedIndex(0);
            comboSituacao.setSelectedIndex(0);
            campoQuilometragem.setText("");
            campoPlaca.setText("");
            campoChassi.setText("");
            campoRenavam.setText("");
            campoValor.setText("");
            comboAcabamentoInternoId.setSelectedIndex(0);
            campoNumeroProprietarios.setText("");
            campoNumeroOcorrencias.setText("");
            campoInformacoes.setText("");
            agrupadorChaveReserva.clearSelection();
            agrupadorManual.clearSelection();
            agrupadorVistoriado.clearSelection();
            funcoes.limparCheckTabela(tblConforto);
            funcoes.limparCheckTabela(tblSeguranca);
            funcoes.limparCheckTabela(tblTecnologia);
            funcoes.limparCheckTabela(tblEstilo);
            funcoes.limparCheckTabela(tblExtra);

            codigo = 0;

            campoFiltroPlaca.setText("");
            comboFiltroSituacao.setSelectedIndex(0);
            campoFiltroDataDe.setText(Formatacao.ajustaDataDMA(now.toString()));
            campoFiltroDataAte.setText(Formatacao.ajustaDataDMA(now.toString()));
            new VeiculoDao().popularTabela(tblVeiculo, "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios (*) devem ser preenchidos corretamente!");
            //JOptionPane.showMessageDialog(null, "Deu erro: \n\nMensagem técnica:" + retornoSalvarVeiculo);
        }
    }//GEN-LAST:event_btnSalvarVeiculoActionPerformed

    private void buscarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCambioActionPerformed
        TelaBuscaCambio buscaCambio = new TelaBuscaCambio(null, true, this);
        buscaCambio.setLocationRelativeTo(this);
        buscaCambio.setVisible(true);
    }//GEN-LAST:event_buscarCambioActionPerformed

    private void buscarVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarVersaoActionPerformed
        TelaBuscaVersao buscaVersao = new TelaBuscaVersao(null, true, this);
        buscaVersao.setLocationRelativeTo(this);
        buscaVersao.setVisible(true);
    }//GEN-LAST:event_buscarVersaoActionPerformed

    private void btnFecharVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharVeiculoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharVeiculoActionPerformed

    private void btnEditarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVeiculoActionPerformed
        Funcoes funcoes = new Funcoes();
        funcoes.limparCheckTabela(tblConforto);
        funcoes.limparCheckTabela(tblSeguranca);
        funcoes.limparCheckTabela(tblTecnologia);
        funcoes.limparCheckTabela(tblEstilo);
        funcoes.limparCheckTabela(tblExtra);

        String codigoEditarVeiculo = String.valueOf(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 0));

        Veiculo veiculo = new VeiculoDao().consultarId(Integer.parseInt(codigoEditarVeiculo));
        Versao versao = new VersaoDao().consultarId(Integer.parseInt(Integer.toString(veiculo.getVersaoId())));
        Cambio cambio = new CambioDao().consultarId(Integer.parseInt(Integer.toString(veiculo.getCambioId())));

        ComboItem corInternaId = new ComboItem();
        corInternaId.setCodigo(veiculo.getCorInternaId());

        ComboItem corExternaId = new ComboItem();
        corExternaId.setCodigo(veiculo.getCorExternaId());
        System.out.println(veiculo.getPlaca());

        ComboItem situacao = new ComboItem();

        if ("À venda".equals(veiculo.getSituacao())) {
            situacao.setCodigo(1);
        } else if ("Em negociação".equals(veiculo.getSituacao())) {
            situacao.setCodigo(2);
        } else if ("Vendido".equals(veiculo.getSituacao())) {
            situacao.setCodigo(3);
        }

        ComboItem acabamentoInternoId = new ComboItem();
        acabamentoInternoId.setCodigo(veiculo.getAcabamentoInternoId());

        if (versao != null) {
            abaVeiculo.setSelectedIndex(0);

            campoIdVersaoBusca.setText(Integer.toString(veiculo.getVersaoId()));
            campoNomeVersaoBusca.setText(versao.getNome());
            campoIdCambioBusca.setText(Integer.toString(veiculo.getCambioId()));
            campoNomeCambioBusca.setText(cambio.getNome());
            new ComboDao().definirItemCombo(comboCorInternaId, corInternaId);
            new ComboDao().definirItemCombo(comboCorExternaId, corExternaId);
            new ComboDao().definirItemCombo(comboSituacao, situacao);
            campoQuilometragem.setText(Double.toString(veiculo.getQuilometragem()));
            campoPlaca.setText(veiculo.getPlaca());
            campoChassi.setText(veiculo.getChassi());
            campoRenavam.setText(veiculo.getRenavam());
            new ComboDao().definirItemCombo(comboAcabamentoInternoId, acabamentoInternoId);
            campoValor.setText(Double.toString(veiculo.getValor()).replace(".", ","));
            campoNumeroProprietarios.setText(Integer.toString(veiculo.getNumeroProprietarios()));
            campoNumeroOcorrencias.setText(Integer.toString(veiculo.getNumeroOcorrencias()));
            if (veiculo.isChaveReserva()) {
                radioChaveReservaSim.setSelected(true);
            } else {
                radioChaveReservaNao.setSelected(true);
            }

            if (veiculo.isManualVeiculo()) {
                radioManualSim.setSelected(true);
            } else {
                radioManualNao.setSelected(true);
            }

            if (veiculo.isVistoriado()) {
                radioVistoriadoSim.setSelected(true);
            } else {
                radioVistoriadoNao.setSelected(true);
            }

            campoInformacoes.setText(veiculo.getInformacoesVeiculo());

            VeiculoDao veiculoDao = new VeiculoDao();
            veiculoDao.obterVeiculoConforto(tblConforto, Integer.parseInt(codigoEditarVeiculo));
            veiculoDao.obterVeiculoSeguranca(tblSeguranca, Integer.parseInt(codigoEditarVeiculo));
            veiculoDao.obterVeiculoTecnologia(tblTecnologia, Integer.parseInt(codigoEditarVeiculo));
            veiculoDao.obterVeiculoEstilo(tblEstilo, Integer.parseInt(codigoEditarVeiculo));
            veiculoDao.obterVeiculoExtra(tblExtra, Integer.parseInt(codigoEditarVeiculo));

            codigo = veiculo.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar veículo!");
        }
    }//GEN-LAST:event_btnEditarVeiculoActionPerformed

    private void btnLimparFiltroVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFiltroVeiculoActionPerformed
        campoFiltroPlaca.setText("");
        comboFiltroSituacao.setSelectedIndex(0);
        campoFiltroDataDe.setText(Formatacao.ajustaDataDMA(now.toString()));
        campoFiltroDataAte.setText(Formatacao.ajustaDataDMA(now.toString()));
        new VeiculoDao().popularTabela(tblVeiculo, "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
    }//GEN-LAST:event_btnLimparFiltroVeiculoActionPerformed

    private void btnFiltrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarVeiculoActionPerformed
        ComboItem filtroSituacao = (ComboItem) comboFiltroSituacao.getSelectedItem();
        String filtro;
        if (filtroSituacao.getCodigo() == 0) {
            filtro = "";
        } else {
            filtro = filtroSituacao.getDescricao();
        }
        new VeiculoDao().popularTabela(tblVeiculo, campoFiltroPlaca.getText(), filtro, campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
    }//GEN-LAST:event_btnFiltrarVeiculoActionPerformed

    private void btnExcluirVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVeiculoActionPerformed
        String codigoExcluirVeiculo = String.valueOf(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 0));

        String retornoExcluirCliente = new VeiculoDao().excluir(Integer.parseInt(codigoExcluirVeiculo));

        if (retornoExcluirCliente == null) {
            JOptionPane.showMessageDialog(null, "Veículo excluído com sucesso!");
            campoFiltroPlaca.setText("");
            comboFiltroSituacao.setSelectedIndex(0);
            campoFiltroDataDe.setText(Formatacao.ajustaDataDMA(now.toString()));
            campoFiltroDataAte.setText(Formatacao.ajustaDataDMA(now.toString()));
            new VeiculoDao().popularTabela(tblVeiculo, "", "", campoFiltroDataDe.getText(), campoFiltroDataAte.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");;
        }
    }//GEN-LAST:event_btnExcluirVeiculoActionPerformed

    public void definirVersao(int id, String nome) {
        campoIdVersaoBusca.setText(Integer.toString(id));
        campoNomeVersaoBusca.setText(nome);
    }

    public void definirCambio(int id, String nome) {
        campoIdCambioBusca.setText(Integer.toString(id));
        campoNomeCambioBusca.setText(nome);
    }

    public boolean validaCampos() {

        ComboItem corInternaId = (ComboItem) comboCorInternaId.getSelectedItem();
        ComboItem corExternaId = (ComboItem) comboCorExternaId.getSelectedItem();
        ComboItem situacao = (ComboItem) comboSituacao.getSelectedItem();
        ComboItem acabamentoInternoId = (ComboItem) comboAcabamentoInternoId.getSelectedItem();

        return !campoIdVersaoBusca.getText().equals("") && !campoNomeVersaoBusca.getText().equals("")
                && !campoIdCambioBusca.getText().equals("") && !campoNomeCambioBusca.getText().equals("")
                && corInternaId.getCodigo() != 0 && corExternaId.getCodigo() != 0
                && situacao.getCodigo() != 0 && !campoQuilometragem.getText().equals("")
                && !campoPlaca.getText().equals("") && !campoChassi.getText().equals("")
                && !campoRenavam.getText().equals("") && !campoValor.getText().equals("")
                && acabamentoInternoId.getCodigo() != 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaInformacoes;
    private javax.swing.JTabbedPane abaVeiculo;
    private javax.swing.ButtonGroup agrupadorChaveReserva;
    private javax.swing.ButtonGroup agrupadorManual;
    private javax.swing.ButtonGroup agrupadorVistoriado;
    private javax.swing.JButton btnEditarVeiculo;
    private javax.swing.JButton btnExcluirVeiculo;
    private javax.swing.JButton btnFecharVeiculo;
    private javax.swing.JButton btnFiltrarVeiculo;
    private javax.swing.JButton btnLimparFiltroVeiculo;
    private javax.swing.JButton btnSalvarVeiculo;
    private javax.swing.JButton buscarCambio;
    private javax.swing.JButton buscarVersao;
    private javax.swing.JTextField campoChassi;
    private javax.swing.JFormattedTextField campoFiltroDataAte;
    private javax.swing.JFormattedTextField campoFiltroDataDe;
    private javax.swing.JTextField campoFiltroPlaca;
    private javax.swing.JTextField campoIdCambioBusca;
    private javax.swing.JTextField campoIdVersaoBusca;
    private javax.swing.JTextArea campoInformacoes;
    private javax.swing.JTextField campoNomeCambioBusca;
    private javax.swing.JTextField campoNomeVersaoBusca;
    private javax.swing.JTextField campoNumeroOcorrencias;
    private javax.swing.JTextField campoNumeroProprietarios;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoQuilometragem;
    private javax.swing.JTextField campoRenavam;
    private javax.swing.JTextField campoValor;
    private javax.swing.JComboBox<String> comboAcabamentoInternoId;
    private javax.swing.JComboBox<String> comboCorExternaId;
    private javax.swing.JComboBox<String> comboCorInternaId;
    private javax.swing.JComboBox<String> comboFiltroSituacao;
    private javax.swing.JComboBox<String> comboSituacao;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JPanel jPanel15;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton radioChaveReservaNao;
    private javax.swing.JRadioButton radioChaveReservaSim;
    private javax.swing.JRadioButton radioManualNao;
    private javax.swing.JRadioButton radioManualSim;
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
