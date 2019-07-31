package tela;

import dao.CombustivelDao;
import dao.ModeloDao;
import dao.VersaoDao;
import entidade.Combustivel;
import entidade.Modelo;
import entidade.Versao;
import functions.ComboItem;
import functions.Validacao;
import javax.swing.JOptionPane;

public class TelaCadastroVersao extends javax.swing.JInternalFrame {

    int codigo = 0;

    public TelaCadastroVersao() {
        initComponents();
        campoIdModeloBusca.setEditable(false);
        campoNomeModeloBusca.setEditable(false);
        campoIdCombustivelBusca.setEditable(false);
        campoNomeCombustivelBusca.setEditable(false);
        new VersaoDao().popularTabela(tblVersao, campoFiltroVersao.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        abaVersao = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        campoIdCombustivelBusca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoNomeCombustivelBusca = new javax.swing.JTextField();
        buscarCombustivel = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        campoIdModeloBusca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoNomeModeloBusca = new javax.swing.JTextField();
        buscarModelo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        campoTorqueRpm = new javax.swing.JTextField();
        campoTorque = new javax.swing.JTextField();
        campoCavalosPotenciaRpm = new javax.swing.JTextField();
        campoCavalosPotencia = new javax.swing.JTextField();
        campoMotor = new javax.swing.JTextField();
        campoConsumoEstrada = new javax.swing.JTextField();
        campoConsumoCidade = new javax.swing.JTextField();
        campoNumeroPortas = new javax.swing.JTextField();
        campoNumeroAssentos = new javax.swing.JTextField();
        campoPeso = new javax.swing.JTextField();
        campoAnoModelo = new javax.swing.JTextField();
        campoAnoFabricacao = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoObservacoes = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVersao = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        campoFiltroVersao = new javax.swing.JTextField();
        btnFiltrarVersao = new javax.swing.JButton();
        btnLimparVersao = new javax.swing.JButton();
        btnFecharVersao = new javax.swing.JButton();
        btnEditarVersao = new javax.swing.JButton();
        btnExcluirVersao = new javax.swing.JButton();
        btnSalvarVersao = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setTitle("Cadastro de versões");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar / editar versão:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:*");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Combustível:*"));

        jLabel7.setText("Código:");

        jLabel8.setText("Nome:");

        buscarCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        buscarCombustivel.setText("Procurar");
        buscarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCombustivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdCombustivelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeCombustivelBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarCombustivel)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoIdCombustivelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(campoNomeCombustivelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarCombustivel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelo:*"));

        jLabel10.setText("Código:");

        jLabel11.setText("Nome:");

        buscarModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        buscarModelo.setText("Procurar");
        buscarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarModeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdModeloBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeModeloBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarModelo)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoIdModeloBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(campoNomeModeloBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarModelo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ano de fabricação:*");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Ano do modelo:*");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Peso:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Número de assentos:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Número de portas:");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Consumo na cidade:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Consumo na estrada:");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Motor:*");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Cavalos de potência:*");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Cavalos de potência RPM:");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Torque:");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Torque RPM:");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Observações:");

        campoObservacoes.setColumns(20);
        campoObservacoes.setRows(5);
        jScrollPane2.setViewportView(campoObservacoes);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNumeroPortas, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(campoMotor)
                            .addComponent(campoConsumoEstrada)
                            .addComponent(campoConsumoCidade)
                            .addComponent(campoNumeroAssentos)
                            .addComponent(campoPeso)
                            .addComponent(campoAnoModelo)
                            .addComponent(campoAnoFabricacao)
                            .addComponent(campoNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoTorqueRpm, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoTorque, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoCavalosPotenciaRpm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoCavalosPotencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(campoAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(campoAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campoNumeroAssentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoNumeroPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCavalosPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(campoConsumoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCavalosPotenciaRpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(campoConsumoEstrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTorque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(campoMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTorqueRpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaVersao.addTab("Cadastrar versão", jPanel1);

        tblVersao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Modelo", "Ano fabricação"
            }
        ));
        jScrollPane1.setViewportView(tblVersao);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel9.setText("Nome:");

        btnFiltrarVersao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnFiltrarVersao.setText("Filtrar");
        btnFiltrarVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarVersaoActionPerformed(evt);
            }
        });

        btnLimparVersao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btnLimparVersao.setText("Limprar");
        btnLimparVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparVersaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFiltroVersao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarVersao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparVersao)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9)
                .addComponent(campoFiltroVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnFiltrarVersao)
                .addComponent(btnLimparVersao))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaVersao.addTab("Listar versões", jPanel4);

        btnFecharVersao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnFecharVersao.setText("Fechar");
        btnFecharVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharVersaoActionPerformed(evt);
            }
        });

        btnEditarVersao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditarVersao.setText("Editar");
        btnEditarVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVersaoActionPerformed(evt);
            }
        });

        btnExcluirVersao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluirVersao.setText("Excluir");
        btnExcluirVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVersaoActionPerformed(evt);
            }
        });

        btnSalvarVersao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvarVersao.setText("Salvar");
        btnSalvarVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarVersaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirVersao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarVersao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarVersao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharVersao))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(abaVersao)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaVersao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharVersao)
                    .addComponent(btnSalvarVersao)
                    .addComponent(btnEditarVersao)
                    .addComponent(btnExcluirVersao))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarVersaoActionPerformed
        Versao versao = new Versao();

        versao.setId(codigo);
        versao.setNome(campoNome.getText());

        if (!campoIdModeloBusca.getText().equals("")) {
            versao.setModeloId(Integer.parseInt(campoIdModeloBusca.getText()));
        }

        if (!campoIdCombustivelBusca.getText().equals("")) {
            versao.setCombustivelId(Integer.parseInt(campoIdCombustivelBusca.getText()));
        }

        versao.setAnoFabricacao(campoAnoFabricacao.getText());
        versao.setAnoModelo(campoAnoModelo.getText());

        if (!campoPeso.getText().equals("")) {
            versao.setPeso(Double.parseDouble(campoPeso.getText().replace(",", ".")));
        }

        if (!campoNumeroAssentos.getText().equals("")) {
            versao.setNumeroAssentos(Integer.parseInt(campoNumeroAssentos.getText()));
        }

        if (!campoNumeroPortas.getText().equals("")) {
            versao.setNumeroPortas(Integer.parseInt(campoNumeroPortas.getText()));
        }

        if (!campoConsumoCidade.getText().equals("")) {
            versao.setConsumoCidade(Double.parseDouble(campoConsumoCidade.getText().replace(",", ".")));
        }

        if (!campoConsumoEstrada.getText().equals("")) {
            versao.setConsumoEstrada(Double.parseDouble(campoConsumoEstrada.getText().replace(",", ".")));
        }

        versao.setMotor(campoMotor.getText());
        versao.setCavalosPotencia(campoCavalosPotencia.getText());
        versao.setCavalosPotenciaRpm(campoCavalosPotenciaRpm.getText());
        versao.setTorque(campoTorque.getText());
        versao.setTorqueRpm(campoTorqueRpm.getText());
        versao.setObservacoes(campoObservacoes.getText());

        VersaoDao versaoDao = new VersaoDao();
        String retornoSalvarVersao = null;

        if (validaCampos() == true) {
            if (codigo == 0) {
                retornoSalvarVersao = versaoDao.salvar(versao);
            } else {
                retornoSalvarVersao = versaoDao.atualizar(versao);
            }
            JOptionPane.showMessageDialog(null, "Versão salva com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios (*) devem ser preenchidos corretamente!");
        }

        if (retornoSalvarVersao == null) {

            campoNome.setText("");
            campoAnoFabricacao.setText("");
            campoAnoModelo.setText("");
            campoPeso.setText("");
            campoNumeroAssentos.setText("");
            campoNumeroPortas.setText("");
            campoConsumoCidade.setText("");
            campoConsumoEstrada.setText("");
            campoMotor.setText("");
            campoIdModeloBusca.setText("");
            campoNomeModeloBusca.setText("");
            campoIdCombustivelBusca.setText("");
            campoNomeCombustivelBusca.setText("");
            campoCavalosPotencia.setText("");
            campoCavalosPotenciaRpm.setText("");
            campoTorque.setText("");
            campoTorqueRpm.setText("");
            campoObservacoes.setText("");

            codigo = 0;

            new VersaoDao().popularTabela(tblVersao, campoFiltroVersao.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Deu erro: \n\nMensagem técnica:" + retornoSalvarVersao);
        }
    }//GEN-LAST:event_btnSalvarVersaoActionPerformed

    private void btnFiltrarVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarVersaoActionPerformed
        new VersaoDao().popularTabela(tblVersao, campoFiltroVersao.getText());
    }//GEN-LAST:event_btnFiltrarVersaoActionPerformed

    private void btnFecharVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharVersaoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharVersaoActionPerformed

    private void btnEditarVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVersaoActionPerformed
        String codigoEditarVersao = String.valueOf(tblVersao.getValueAt(tblVersao.getSelectedRow(), 0));

        Versao versao = new VersaoDao().consultarId(Integer.parseInt(codigoEditarVersao));
        Modelo modelo = new ModeloDao().consultarId(Integer.parseInt(Integer.toString(versao.getModeloId())));
        Combustivel combustivel = new CombustivelDao().consultarId(Integer.parseInt(Integer.toString(versao.getCombustivelId())));

        if (versao != null) {
            abaVersao.setSelectedIndex(0);

            campoNome.setText(versao.getNome());
            campoAnoFabricacao.setText(versao.getAnoFabricacao());
            campoAnoModelo.setText(versao.getAnoModelo());
            campoPeso.setText(Double.toString(versao.getPeso()).replace(".", ","));
            campoNumeroAssentos.setText(Integer.toString(versao.getNumeroAssentos()));
            campoNumeroPortas.setText(Integer.toString(versao.getNumeroPortas()));
            campoConsumoCidade.setText(Double.toString(versao.getConsumoCidade()).replace(".", ","));
            campoConsumoEstrada.setText(Double.toString(versao.getConsumoEstrada()).replace(".", ","));
            campoMotor.setText(versao.getMotor());
            campoIdModeloBusca.setText(Integer.toString(versao.getModeloId()));
            campoNomeModeloBusca.setText(modelo.getNome());
            campoIdCombustivelBusca.setText(Integer.toString(versao.getCombustivelId()));
            campoNomeCombustivelBusca.setText(combustivel.getNome());
            campoCavalosPotencia.setText(versao.getCavalosPotencia());
            campoCavalosPotenciaRpm.setText(versao.getCavalosPotenciaRpm());
            campoTorque.setText(versao.getTorque());
            campoTorqueRpm.setText(versao.getTorqueRpm());
            campoObservacoes.setText(versao.getObservacoes());

            campoNome.requestFocus();

            codigo = versao.getId();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao consultar versão!");
        }
    }//GEN-LAST:event_btnEditarVersaoActionPerformed

    private void btnExcluirVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVersaoActionPerformed
        String codigoExcluirVersao = String.valueOf(tblVersao.getValueAt(tblVersao.getSelectedRow(), 0));

        String retornoExcluirVersao = new VersaoDao().excluir(Integer.parseInt(codigoExcluirVersao));

        if (retornoExcluirVersao == null) {
            JOptionPane.showMessageDialog(null, "Versão excluída com sucesso!");
            new VersaoDao().popularTabela(tblVersao, campoFiltroVersao.getText());
        } else {
            JOptionPane.showMessageDialog(null, tblVersao.getValueAt(tblVersao.getSelectedRow(), 1) + " está sendo usado(a) para outros cadastros!");
        }
    }//GEN-LAST:event_btnExcluirVersaoActionPerformed

    private void buscarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCombustivelActionPerformed
        TelaBuscaCombustivel buscaCombustivel = new TelaBuscaCombustivel(null, true, this);
        buscaCombustivel.setLocationRelativeTo(this);
        buscaCombustivel.setVisible(true);
    }//GEN-LAST:event_buscarCombustivelActionPerformed

    private void buscarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarModeloActionPerformed
        TelaBuscaModelo buscaModelo = new TelaBuscaModelo(null, true, this);
        buscaModelo.setLocationRelativeTo(this);
        buscaModelo.setVisible(true);
    }//GEN-LAST:event_buscarModeloActionPerformed

    private void btnLimparVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparVersaoActionPerformed
        campoFiltroVersao.setText("");
        new VersaoDao().popularTabela(tblVersao, campoFiltroVersao.getText());
    }//GEN-LAST:event_btnLimparVersaoActionPerformed

    public void definirModelo(int id, String nome) {
        campoIdModeloBusca.setText(Integer.toString(id));
        campoNomeModeloBusca.setText(nome);
    }

    public void definirCombustivel(int id, String nome) {
        campoIdCombustivelBusca.setText(Integer.toString(id));
        campoNomeCombustivelBusca.setText(nome);
    }

    public boolean validaCampos() {

        return !campoNome.getText().equals("") && !campoAnoFabricacao.getText().equals("")
                && !campoAnoModelo.getText().equals("") && !campoMotor.getText().equals("")
                && !campoIdModeloBusca.getText().equals("") && !campoNomeModeloBusca.getText().equals("")
                && !campoIdCombustivelBusca.getText().equals("") && !campoNomeCombustivelBusca.getText().equals("")
                && !campoCavalosPotencia.getText().equals("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaVersao;
    private javax.swing.JButton btnEditarVersao;
    private javax.swing.JButton btnExcluirVersao;
    private javax.swing.JButton btnFecharVersao;
    private javax.swing.JButton btnFiltrarVersao;
    private javax.swing.JButton btnLimparVersao;
    private javax.swing.JButton btnSalvarVersao;
    private javax.swing.JButton buscarCombustivel;
    private javax.swing.JButton buscarModelo;
    private javax.swing.JTextField campoAnoFabricacao;
    private javax.swing.JTextField campoAnoModelo;
    private javax.swing.JTextField campoCavalosPotencia;
    private javax.swing.JTextField campoCavalosPotenciaRpm;
    private javax.swing.JTextField campoConsumoCidade;
    private javax.swing.JTextField campoConsumoEstrada;
    private javax.swing.JTextField campoFiltroVersao;
    private javax.swing.JTextField campoIdCombustivelBusca;
    private javax.swing.JTextField campoIdModeloBusca;
    private javax.swing.JTextField campoMotor;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNomeCombustivelBusca;
    private javax.swing.JTextField campoNomeModeloBusca;
    private javax.swing.JTextField campoNumeroAssentos;
    private javax.swing.JTextField campoNumeroPortas;
    private javax.swing.JTextArea campoObservacoes;
    private javax.swing.JTextField campoPeso;
    private javax.swing.JTextField campoTorque;
    private javax.swing.JTextField campoTorqueRpm;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblVersao;
    // End of variables declaration//GEN-END:variables
}
