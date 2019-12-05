/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.PermissaoDao;
import entidade.Usuario;
import functions.Funcoes;
import functions.Mensagem;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author mateus
 */
public class TelaPermissao extends javax.swing.JDialog {

    private Usuario usuario;
    private PermissaoDao peDAO = new PermissaoDao();
    private ArrayList<String> perm = new ArrayList();
    private ArrayList<JCheckBox> checks = new ArrayList();

    //acoes
    private final String acessar = "Acessar";
    private final String editar = "Editar";
    private final String excluir = "Excluir";
    private final String salvar = "Salvar";
    private final String buscar = "Buscar";
    private final String limparBusca = "LimparBusca";
    private final String listar = "Listar";
    private final String permissao = "Permissao";
    private final String procurar = "Procurar";
    private final String comboCadastro = "ComboCadastro";
    private final String comboProcedencia = "ComboProcedencia";
    private final String comboCarroceria = "ComboCarroceria";
    private final String comboListar = "ComboListar";
    private final String comboEstado = "ComboEstado";
    private final String comboSituacao = "ComboSituacao";
    private final String comboCorExt = "ComboCorExt";
    private final String comboCorInt = "ComboCorInt";
    private final String comboCambio = "ComboCambio";
    private final String comboAcabInt = "ComboAcabInt";
    private final String comboMarca = "ComboMarca";

    //telas
    private final String telaMarca = "marca";
    private final String telaModelo = "modelo";
    private final String telaUsuario = "usuario";
    private final String telaVersao = "versao";
    private final String telaCliente = "cliente";
    private final String telaEmpVistoria = "empvistoria";
    private final String telaVeiculoInfos = "veiculoinfo";
    private final String telaVeiculoConf = "veiculoconf";
    private final String telaVeiculoEsti = "veiculoesti";
    private final String telaVeiculoExtr = "veiculoextr";
    private final String telaVeiculoSegu = "veiculosegu";
    private final String telaVeiculoTecn = "veiculotecn";
    private final String telaVeiculoList = "veiculolist";
    private final String telaProprietario = "proprietario";
    private final String telaGeralAcab = "geralacab";
    private final String telaGeralCamb = "geralcamb";
    private final String telaGeralCarr = "geralcarr";
    private final String telaGeralComb = "geralcomb";
    private final String telaGeralConf = "geralconf";
    private final String telaGeralCorE = "geralcore";
    private final String telaGeralCorI = "geralcori";
    private final String telaGeralEsti = "geralesti";
    private final String telaGeralExtr = "geralextr";
    private final String telaGeralSegu = "geralsegu";
    private final String telaGeralTecn = "geraltecn";
    private final String telaGeralCida = "geralcida";
    private final String telaGeralEsta = "geralesta";
    private final String telaGeralPerf = "geralperf";

    /**
     * Creates new form TelaPermissao
     *
     * @param parent
     * @param modal
     */
    public TelaPermissao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public TelaPermissao(java.awt.Frame parent, boolean modal, Usuario usuario) {
        super(parent, modal);
        initComponents();
        this.usuario = usuario;
        jLabel2.setText("Aplicando permissões ao usuário: " + usuario.getNome());
        preenchePermissoesMarca();
        preenchePermissoesModelo();
        preenchePermissoesUsuario();
        preenchePermissoesVersao();
        preenchePermissoesGeralAcab();
        preenchePermissoesGeralCamb();
        preenchePermissoesGeralCarr();
        preenchePermissoesGeralComb();
        preenchePermissoesGeralConf();
        preenchePermissoesGeralCorE();
        preenchePermissoesGeralCorI();
        preenchePermissoesGeralEsti();
        preenchePermissoesGeralExtr();
        preenchePermissoesGeralSegu();
        preenchePermissoesGeralTecn();
        preenchePermissoesGeralCida();
        preenchePermissoesGeralEsta();
        preenchePermissoesGeralPerf();
        preenchePermissoesCliente();
        preenchePermissoesEmpVistoria();
        preenchePermissoesProprietario();
        preenchePermissoesVeiculoInfos();
        preenchePermissoesVeiculoConf();
        preenchePermissoesVeiculoEsti();
        preenchePermissoesVeiculoExtr();
        preenchePermissoesVeiculoSegu();
        preenchePermissoesVeiculoTecn();
        preenchePermissoesVeiculoList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnMarcarTodos = new javax.swing.JButton();
        btnDesmarcarTodos = new javax.swing.JButton();
        Painel = new javax.swing.JTabbedPane();
        pnlMarca = new javax.swing.JPanel();
        cbxMarcaAcessar = new javax.swing.JCheckBox();
        cbxMarcaSalvar = new javax.swing.JCheckBox();
        cbxMarcaEditar = new javax.swing.JCheckBox();
        cbxMarcaExcluir = new javax.swing.JCheckBox();
        cbxMarcaBuscar = new javax.swing.JCheckBox();
        cbxMarcaLimparBusca = new javax.swing.JCheckBox();
        cbxMarcaListar = new javax.swing.JCheckBox();
        pnlModelo = new javax.swing.JPanel();
        cbxModeloEditar = new javax.swing.JCheckBox();
        cbxModeloSalvar = new javax.swing.JCheckBox();
        cbxModeloAcessar = new javax.swing.JCheckBox();
        cbxModeloLimparBusca = new javax.swing.JCheckBox();
        cbxModeloBuscar = new javax.swing.JCheckBox();
        cbxModeloExcluir = new javax.swing.JCheckBox();
        cbxModeloListar = new javax.swing.JCheckBox();
        cbxModeloComboMarcaCadastro = new javax.swing.JCheckBox();
        cbxModeloComboProcedencia = new javax.swing.JCheckBox();
        cbxModeloComboCarroceria = new javax.swing.JCheckBox();
        cbxModeloComboMarcaListar = new javax.swing.JCheckBox();
        pnlUsuario = new javax.swing.JPanel();
        cbxUsuarioSalvar = new javax.swing.JCheckBox();
        cbxUsuarioBuscar = new javax.swing.JCheckBox();
        cbxUsuarioComboListar = new javax.swing.JCheckBox();
        cbxUsuarioListar = new javax.swing.JCheckBox();
        cbxUsuarioComboCadastro = new javax.swing.JCheckBox();
        cbxUsuarioExcluir = new javax.swing.JCheckBox();
        cbxUsuarioLimparBusca = new javax.swing.JCheckBox();
        cbxUsuarioEditar = new javax.swing.JCheckBox();
        cbxUsuarioAcessar = new javax.swing.JCheckBox();
        cbxUsuarioPermissao = new javax.swing.JCheckBox();
        pnlVersao = new javax.swing.JPanel();
        cbxVersaoEditar = new javax.swing.JCheckBox();
        cbxVersaoListar = new javax.swing.JCheckBox();
        cbxVersaoSalvar = new javax.swing.JCheckBox();
        cbxVersaoBuscar = new javax.swing.JCheckBox();
        cbxVersaoAcessar = new javax.swing.JCheckBox();
        cbxVersaoComboMarcaListar = new javax.swing.JCheckBox();
        cbxVersaoExcluir = new javax.swing.JCheckBox();
        cbxVersaoComboCombCadastro = new javax.swing.JCheckBox();
        cbxVersaoLimparBusca = new javax.swing.JCheckBox();
        cbxVersaoProcurarModelo = new javax.swing.JCheckBox();
        pnlGeral = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        pnlAcabInterno = new javax.swing.JPanel();
        cbxGeralBuscarAcab = new javax.swing.JCheckBox();
        cbxGeralListarAcab = new javax.swing.JCheckBox();
        cbxGeralExcluirAcab = new javax.swing.JCheckBox();
        cbxGeralSalvarAcab = new javax.swing.JCheckBox();
        cbxGeralLimparBuscaAcab = new javax.swing.JCheckBox();
        cbxGeralEditarAcab = new javax.swing.JCheckBox();
        pnlCambios = new javax.swing.JPanel();
        cbxGeralExcluirCamb = new javax.swing.JCheckBox();
        cbxGeralEditarCamb = new javax.swing.JCheckBox();
        cbxGeralListarCamb = new javax.swing.JCheckBox();
        cbxGeralBuscarCamb = new javax.swing.JCheckBox();
        cbxGeralSalvarCamb = new javax.swing.JCheckBox();
        cbxGeralLimparBuscaCamb = new javax.swing.JCheckBox();
        pnlCarrocerias = new javax.swing.JPanel();
        cbxGeralLimparBuscaCarr = new javax.swing.JCheckBox();
        cbxGeralBuscarCarr = new javax.swing.JCheckBox();
        cbxGeralExcluirCarr = new javax.swing.JCheckBox();
        cbxGeralSalvarCarr = new javax.swing.JCheckBox();
        cbxGeralEditarCarr = new javax.swing.JCheckBox();
        cbxGeralListarCarr = new javax.swing.JCheckBox();
        pnlCombustiveis = new javax.swing.JPanel();
        cbxGeralSalvarComb = new javax.swing.JCheckBox();
        cbxGeralListarComb = new javax.swing.JCheckBox();
        cbxGeralBuscarComb = new javax.swing.JCheckBox();
        cbxGeralExcluirComb = new javax.swing.JCheckBox();
        cbxGeralLimparBuscaComb = new javax.swing.JCheckBox();
        cbxGeralEditarComb = new javax.swing.JCheckBox();
        pnlConfortos = new javax.swing.JPanel();
        cbxGeralSalvarConft = new javax.swing.JCheckBox();
        cbxGeralBuscarConft = new javax.swing.JCheckBox();
        cbxGeralExcluirConft = new javax.swing.JCheckBox();
        cbxGeralLimparBuscaConft = new javax.swing.JCheckBox();
        cbxGeralListarConft = new javax.swing.JCheckBox();
        cbxGeralEditarConft = new javax.swing.JCheckBox();
        pnlCoresExt = new javax.swing.JPanel();
        cbxGeralExcluirCorEx = new javax.swing.JCheckBox();
        cbxGeralLimparBuscaCorEx = new javax.swing.JCheckBox();
        cbxGeralSalvarCorEx = new javax.swing.JCheckBox();
        cbxGeralListarCorEx = new javax.swing.JCheckBox();
        cbxGeralEditarCorEx = new javax.swing.JCheckBox();
        cbxGeralBuscarCorEx = new javax.swing.JCheckBox();
        pnlCoresInt = new javax.swing.JPanel();
        cbxGeralExcluirCorInt = new javax.swing.JCheckBox();
        cbxGeralListarCorInt = new javax.swing.JCheckBox();
        cbxGeralBuscarCorInt = new javax.swing.JCheckBox();
        cbxGeralLimparBuscaCorInt = new javax.swing.JCheckBox();
        cbxGeralSalvarCorInt = new javax.swing.JCheckBox();
        cbxGeralEditarCorInt = new javax.swing.JCheckBox();
        pnlEstilos = new javax.swing.JPanel();
        cbxGeralExcluirEst = new javax.swing.JCheckBox();
        cbxGeralSalvarEst = new javax.swing.JCheckBox();
        cbxGeralListarEst = new javax.swing.JCheckBox();
        cbxGeralLimparBuscaEst = new javax.swing.JCheckBox();
        cbxGeralEditarEst = new javax.swing.JCheckBox();
        cbxGeralBuscarEst = new javax.swing.JCheckBox();
        pnlExtras = new javax.swing.JPanel();
        cbxGeralSalvarExt = new javax.swing.JCheckBox();
        cbxGeralExcluirExt = new javax.swing.JCheckBox();
        cbxGeralLimparBuscaExt = new javax.swing.JCheckBox();
        cbxGeralEditarExt = new javax.swing.JCheckBox();
        cbxGeralListarExt = new javax.swing.JCheckBox();
        cbxGeralBuscarExt = new javax.swing.JCheckBox();
        pnlSegurancas = new javax.swing.JPanel();
        cbxGeralExcluirSeg = new javax.swing.JCheckBox();
        cbxGeralLimparBuscaSeg = new javax.swing.JCheckBox();
        cbxGeralEditarSeg = new javax.swing.JCheckBox();
        cbxGeralSalvarSeg = new javax.swing.JCheckBox();
        cbxGeralBuscarSeg = new javax.swing.JCheckBox();
        cbxGeralListarSeg = new javax.swing.JCheckBox();
        pnlTecnologias = new javax.swing.JPanel();
        cbxGeralLimparBuscaTec = new javax.swing.JCheckBox();
        cbxGeralSalvarTec = new javax.swing.JCheckBox();
        cbxGeralListarTec = new javax.swing.JCheckBox();
        cbxGeralExcluirTec = new javax.swing.JCheckBox();
        cbxGeralBuscarTec = new javax.swing.JCheckBox();
        cbxGeralEditarTec = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        pnlCidades = new javax.swing.JPanel();
        cbxGeralListarCid = new javax.swing.JCheckBox();
        cbxGeralSalvarCid = new javax.swing.JCheckBox();
        cbxGeralBuscarCid = new javax.swing.JCheckBox();
        cbxGeralEditarCid = new javax.swing.JCheckBox();
        cbxGeralExcluirCid = new javax.swing.JCheckBox();
        cbxGeralLimparBuscaCid = new javax.swing.JCheckBox();
        cbxGeralComboCid = new javax.swing.JCheckBox();
        pnlEstados = new javax.swing.JPanel();
        cbxGeralListarEsta = new javax.swing.JCheckBox();
        cbxGeralSalvarEsta = new javax.swing.JCheckBox();
        cbxGeralEditarEsta = new javax.swing.JCheckBox();
        cbxGeralExcluirEsta = new javax.swing.JCheckBox();
        cbxGeralBuscarEsta = new javax.swing.JCheckBox();
        cbxGeralLimparBuscaEsta = new javax.swing.JCheckBox();
        pnlPerfis = new javax.swing.JPanel();
        cbxGeralBuscarPerf = new javax.swing.JCheckBox();
        cbxGeralLimparBuscaPerf = new javax.swing.JCheckBox();
        cbxGeralEditarPerf = new javax.swing.JCheckBox();
        cbxGeralExcluirPerf = new javax.swing.JCheckBox();
        cbxGeralListarPerf = new javax.swing.JCheckBox();
        cbxGeralSalvarPerf = new javax.swing.JCheckBox();
        cbxGeralAcessarAcab = new javax.swing.JCheckBox();
        pnlCliente = new javax.swing.JPanel();
        cbxClienteSalvar = new javax.swing.JCheckBox();
        cbxClienteExcluir = new javax.swing.JCheckBox();
        cbxClienteEditar = new javax.swing.JCheckBox();
        cbxClienteAcessar = new javax.swing.JCheckBox();
        cbxClienteListar = new javax.swing.JCheckBox();
        cbxClienteLimparBusca = new javax.swing.JCheckBox();
        cbxClienteBuscar = new javax.swing.JCheckBox();
        cbxClienteProcCid = new javax.swing.JCheckBox();
        pnlEmpVistoria = new javax.swing.JPanel();
        cbxEmpVistAcessar = new javax.swing.JCheckBox();
        cbxEmpVistListar = new javax.swing.JCheckBox();
        cbxEmpVistBuscar = new javax.swing.JCheckBox();
        cbxEmpVistEditar = new javax.swing.JCheckBox();
        cbxEmpVistSalvar = new javax.swing.JCheckBox();
        cbxEmpVistLimparBusca = new javax.swing.JCheckBox();
        cbxEmpVistExcluir = new javax.swing.JCheckBox();
        cbxEmpVistProcCid = new javax.swing.JCheckBox();
        pnlVeiculo = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlInfosVeic = new javax.swing.JPanel();
        cbxProcurarVersao = new javax.swing.JCheckBox();
        cbxVeiculoCmbSituacao = new javax.swing.JCheckBox();
        cbxVeiculoCmbCorExt = new javax.swing.JCheckBox();
        cbxVeiculoCmbCorInt = new javax.swing.JCheckBox();
        cbxVeiculoCmbCambio = new javax.swing.JCheckBox();
        cbxVeiculoCmbAcabInt = new javax.swing.JCheckBox();
        cbxVeiculoSalvar = new javax.swing.JCheckBox();
        pnlVecConfortos = new javax.swing.JPanel();
        cbxVeiculoListarConf = new javax.swing.JCheckBox();
        pnlVecEstilos = new javax.swing.JPanel();
        cbxVeiculoListarEsti = new javax.swing.JCheckBox();
        pnlVecExtras = new javax.swing.JPanel();
        cbxVeiculoListarExtr = new javax.swing.JCheckBox();
        pnlVecSegurancas = new javax.swing.JPanel();
        cbxVeiculoListarSegu = new javax.swing.JCheckBox();
        pnlVecTecnologias = new javax.swing.JPanel();
        cbxVeiculoListarTecn = new javax.swing.JCheckBox();
        pnlListar = new javax.swing.JPanel();
        cbxVecListCmbSit = new javax.swing.JCheckBox();
        cbxVecListCmbMar = new javax.swing.JCheckBox();
        cbxVecListBuscar = new javax.swing.JCheckBox();
        cbxVecListLimparBusca = new javax.swing.JCheckBox();
        cbxVecListEditar = new javax.swing.JCheckBox();
        cbxVecListExcluir = new javax.swing.JCheckBox();
        cbxListarVeiculos = new javax.swing.JCheckBox();
        cbxVeiculoAcessar = new javax.swing.JCheckBox();
        pnlProprietario = new javax.swing.JPanel();
        cbxProprietarioEditar = new javax.swing.JCheckBox();
        cbxProprietarioSalvar = new javax.swing.JCheckBox();
        cbxProprietarioProcCid = new javax.swing.JCheckBox();
        cbxProprietarioBuscar = new javax.swing.JCheckBox();
        cbxProprietarioListar = new javax.swing.JCheckBox();
        cbxProprietarioExcluir = new javax.swing.JCheckBox();
        cbxProprietarioAcessar = new javax.swing.JCheckBox();
        cbxProprietarioLimparBusca = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Permissões");

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-16.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-16.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnMarcarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-ok-16.png"))); // NOI18N
        btnMarcarTodos.setText("Marcar todos");
        btnMarcarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarTodosActionPerformed(evt);
            }
        });

        btnDesmarcarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-16.png"))); // NOI18N
        btnDesmarcarTodos.setText("Desmarcar todos");
        btnDesmarcarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesmarcarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMarcarTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDesmarcarTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar)
                    .addComponent(btnMarcarTodos)
                    .addComponent(btnDesmarcarTodos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Painel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbxMarcaAcessar.setText("Acessar");

        cbxMarcaSalvar.setText("Botão Salvar");

        cbxMarcaEditar.setText("Botão Editar");

        cbxMarcaExcluir.setText("Botão Excluir");

        cbxMarcaBuscar.setText("Botão Buscar");

        cbxMarcaLimparBusca.setText("Botão Limpar Busca");

        cbxMarcaListar.setText("Listar registros cadastrados");

        javax.swing.GroupLayout pnlMarcaLayout = new javax.swing.GroupLayout(pnlMarca);
        pnlMarca.setLayout(pnlMarcaLayout);
        pnlMarcaLayout.setHorizontalGroup(
            pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxMarcaAcessar)
                    .addComponent(cbxMarcaSalvar)
                    .addComponent(cbxMarcaLimparBusca)
                    .addComponent(cbxMarcaEditar)
                    .addComponent(cbxMarcaExcluir)
                    .addComponent(cbxMarcaBuscar)
                    .addComponent(cbxMarcaListar))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        pnlMarcaLayout.setVerticalGroup(
            pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxMarcaAcessar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxMarcaSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxMarcaEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxMarcaExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxMarcaBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxMarcaLimparBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxMarcaListar)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        Painel.addTab("Marca", pnlMarca);

        cbxModeloEditar.setText("Botão Editar");

        cbxModeloSalvar.setText("Botão Salvar");

        cbxModeloAcessar.setText("Acessar");

        cbxModeloLimparBusca.setText("Botão Limpar Busca");

        cbxModeloBuscar.setText("Botão Buscar");

        cbxModeloExcluir.setText("Botão Excluir");

        cbxModeloListar.setText("Listar registros cadastrados");

        cbxModeloComboMarcaCadastro.setText("Combo Marca (cadastro)");

        cbxModeloComboProcedencia.setText("Combo Procedência");

        cbxModeloComboCarroceria.setText("Combo Carroceria");

        cbxModeloComboMarcaListar.setText("Combo Marca (listagem)");

        javax.swing.GroupLayout pnlModeloLayout = new javax.swing.GroupLayout(pnlModelo);
        pnlModelo.setLayout(pnlModeloLayout);
        pnlModeloLayout.setHorizontalGroup(
            pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModeloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxModeloBuscar)
                    .addComponent(cbxModeloLimparBusca)
                    .addComponent(cbxModeloListar)
                    .addGroup(pnlModeloLayout.createSequentialGroup()
                        .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxModeloSalvar)
                            .addComponent(cbxModeloAcessar))
                        .addGap(112, 112, 112)
                        .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxModeloComboProcedencia)
                            .addComponent(cbxModeloComboCarroceria)))
                    .addGroup(pnlModeloLayout.createSequentialGroup()
                        .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxModeloEditar)
                            .addComponent(cbxModeloExcluir))
                        .addGap(111, 111, 111)
                        .addComponent(cbxModeloComboMarcaListar))
                    .addComponent(cbxModeloComboMarcaCadastro))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        pnlModeloLayout.setVerticalGroup(
            pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModeloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxModeloAcessar)
                    .addComponent(cbxModeloComboProcedencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxModeloSalvar)
                    .addComponent(cbxModeloComboCarroceria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxModeloEditar)
                    .addComponent(cbxModeloComboMarcaListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxModeloExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxModeloBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxModeloLimparBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxModeloListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxModeloComboMarcaCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Painel.addTab("Modelo", pnlModelo);

        cbxUsuarioSalvar.setText("Botão Salvar");

        cbxUsuarioBuscar.setText("Botão Buscar");

        cbxUsuarioComboListar.setText("Combo Perfil (listagem)");

        cbxUsuarioListar.setText("Listar registros cadastrados");

        cbxUsuarioComboCadastro.setText("Combo Perfil (cadastro)");

        cbxUsuarioExcluir.setText("Botão Excluir");

        cbxUsuarioLimparBusca.setText("Botão Limpar Busca");

        cbxUsuarioEditar.setText("Botão Editar");

        cbxUsuarioAcessar.setText("Acessar");

        cbxUsuarioPermissao.setText("Botão Permissões");

        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario);
        pnlUsuario.setLayout(pnlUsuarioLayout);
        pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxUsuarioLimparBusca)
                    .addGroup(pnlUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxUsuarioAcessar)
                            .addComponent(cbxUsuarioSalvar)
                            .addComponent(cbxUsuarioExcluir)
                            .addComponent(cbxUsuarioBuscar)
                            .addComponent(cbxUsuarioEditar))
                        .addGap(108, 108, 108)
                        .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxUsuarioComboCadastro)
                            .addComponent(cbxUsuarioComboListar)))
                    .addComponent(cbxUsuarioPermissao)
                    .addComponent(cbxUsuarioListar))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        pnlUsuarioLayout.setVerticalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxUsuarioAcessar)
                    .addComponent(cbxUsuarioComboCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxUsuarioSalvar)
                    .addComponent(cbxUsuarioComboListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxUsuarioEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxUsuarioExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxUsuarioBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxUsuarioLimparBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxUsuarioPermissao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxUsuarioListar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Painel.addTab("Usuário", pnlUsuario);

        cbxVersaoEditar.setText("Botão Editar");

        cbxVersaoListar.setText("Listar registros cadastrados");

        cbxVersaoSalvar.setText("Botão Salvar");

        cbxVersaoBuscar.setText("Botão Buscar");

        cbxVersaoAcessar.setText("Acessar");

        cbxVersaoComboMarcaListar.setText("Combo Marca (listagem)");

        cbxVersaoExcluir.setText("Botão Excluir");

        cbxVersaoComboCombCadastro.setText("Combo Combustível (cadastro)");

        cbxVersaoLimparBusca.setText("Botão Limpar Busca");

        cbxVersaoProcurarModelo.setText("Botão Procurar Modelo");

        javax.swing.GroupLayout pnlVersaoLayout = new javax.swing.GroupLayout(pnlVersao);
        pnlVersao.setLayout(pnlVersaoLayout);
        pnlVersaoLayout.setHorizontalGroup(
            pnlVersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVersaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxVersaoListar)
                    .addGroup(pnlVersaoLayout.createSequentialGroup()
                        .addGroup(pnlVersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxVersaoAcessar)
                            .addComponent(cbxVersaoSalvar))
                        .addGap(112, 112, 112)
                        .addGroup(pnlVersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxVersaoComboMarcaListar)
                            .addComponent(cbxVersaoComboCombCadastro)))
                    .addComponent(cbxVersaoEditar)
                    .addComponent(cbxVersaoExcluir)
                    .addComponent(cbxVersaoLimparBusca)
                    .addComponent(cbxVersaoBuscar)
                    .addComponent(cbxVersaoProcurarModelo))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        pnlVersaoLayout.setVerticalGroup(
            pnlVersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVersaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxVersaoAcessar)
                    .addComponent(cbxVersaoComboMarcaListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlVersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxVersaoSalvar)
                    .addComponent(cbxVersaoComboCombCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVersaoEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVersaoExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVersaoBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVersaoLimparBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVersaoProcurarModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVersaoListar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Painel.addTab("Versão", pnlVersao);

        jTabbedPane4.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        cbxGeralBuscarAcab.setText("Botão Buscar");

        cbxGeralListarAcab.setText("Listar registros cadastrados");

        cbxGeralExcluirAcab.setText("Botão Excluir");

        cbxGeralSalvarAcab.setText("Botão Salvar");

        cbxGeralLimparBuscaAcab.setText("Botão Limpar Busca");

        cbxGeralEditarAcab.setText("Botão Editar");

        javax.swing.GroupLayout pnlAcabInternoLayout = new javax.swing.GroupLayout(pnlAcabInterno);
        pnlAcabInterno.setLayout(pnlAcabInternoLayout);
        pnlAcabInternoLayout.setHorizontalGroup(
            pnlAcabInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcabInternoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAcabInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralSalvarAcab)
                    .addComponent(cbxGeralEditarAcab)
                    .addComponent(cbxGeralExcluirAcab)
                    .addComponent(cbxGeralBuscarAcab)
                    .addComponent(cbxGeralLimparBuscaAcab)
                    .addComponent(cbxGeralListarAcab))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pnlAcabInternoLayout.setVerticalGroup(
            pnlAcabInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcabInternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarAcab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarAcab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirAcab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarAcab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaAcab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarAcab)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Acabamentos internos", pnlAcabInterno);

        cbxGeralExcluirCamb.setText("Botão Excluir");

        cbxGeralEditarCamb.setText("Botão Editar");

        cbxGeralListarCamb.setText("Listar registros cadastrados");

        cbxGeralBuscarCamb.setText("Botão Buscar");

        cbxGeralSalvarCamb.setText("Botão Salvar");

        cbxGeralLimparBuscaCamb.setText("Botão Limpar Busca");

        javax.swing.GroupLayout pnlCambiosLayout = new javax.swing.GroupLayout(pnlCambios);
        pnlCambios.setLayout(pnlCambiosLayout);
        pnlCambiosLayout.setHorizontalGroup(
            pnlCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCambiosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralBuscarCamb)
                    .addComponent(cbxGeralListarCamb)
                    .addComponent(cbxGeralExcluirCamb)
                    .addComponent(cbxGeralSalvarCamb)
                    .addComponent(cbxGeralLimparBuscaCamb)
                    .addComponent(cbxGeralEditarCamb))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pnlCambiosLayout.setVerticalGroup(
            pnlCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCambiosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarCamb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarCamb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirCamb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarCamb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaCamb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarCamb)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Câmbios", pnlCambios);

        cbxGeralLimparBuscaCarr.setText("Botão Limpar Busca");

        cbxGeralBuscarCarr.setText("Botão Buscar");

        cbxGeralExcluirCarr.setText("Botão Excluir");

        cbxGeralSalvarCarr.setText("Botão Salvar");

        cbxGeralEditarCarr.setText("Botão Editar");

        cbxGeralListarCarr.setText("Listar registros cadastrados");

        javax.swing.GroupLayout pnlCarroceriasLayout = new javax.swing.GroupLayout(pnlCarrocerias);
        pnlCarrocerias.setLayout(pnlCarroceriasLayout);
        pnlCarroceriasLayout.setHorizontalGroup(
            pnlCarroceriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarroceriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCarroceriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralExcluirCarr)
                    .addComponent(cbxGeralEditarCarr)
                    .addComponent(cbxGeralListarCarr)
                    .addComponent(cbxGeralBuscarCarr)
                    .addComponent(cbxGeralSalvarCarr)
                    .addComponent(cbxGeralLimparBuscaCarr))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pnlCarroceriasLayout.setVerticalGroup(
            pnlCarroceriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarroceriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarCarr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarCarr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirCarr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarCarr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaCarr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarCarr)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Carrocerias", pnlCarrocerias);

        cbxGeralSalvarComb.setText("Botão Salvar");

        cbxGeralListarComb.setText("Listar registros cadastrados");

        cbxGeralBuscarComb.setText("Botão Buscar");

        cbxGeralExcluirComb.setText("Botão Excluir");

        cbxGeralLimparBuscaComb.setText("Botão Limpar Busca");

        cbxGeralEditarComb.setText("Botão Editar");

        javax.swing.GroupLayout pnlCombustiveisLayout = new javax.swing.GroupLayout(pnlCombustiveis);
        pnlCombustiveis.setLayout(pnlCombustiveisLayout);
        pnlCombustiveisLayout.setHorizontalGroup(
            pnlCombustiveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCombustiveisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCombustiveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralLimparBuscaComb)
                    .addComponent(cbxGeralBuscarComb)
                    .addComponent(cbxGeralExcluirComb)
                    .addComponent(cbxGeralSalvarComb)
                    .addComponent(cbxGeralEditarComb)
                    .addComponent(cbxGeralListarComb))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pnlCombustiveisLayout.setVerticalGroup(
            pnlCombustiveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCombustiveisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarComb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarComb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirComb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarComb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaComb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarComb)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Combustíveis", pnlCombustiveis);

        cbxGeralSalvarConft.setText("Botão Salvar");

        cbxGeralBuscarConft.setText("Botão Buscar");

        cbxGeralExcluirConft.setText("Botão Excluir");

        cbxGeralLimparBuscaConft.setText("Botão Limpar Busca");

        cbxGeralListarConft.setText("Listar registros cadastrados");

        cbxGeralEditarConft.setText("Botão Editar");

        javax.swing.GroupLayout pnlConfortosLayout = new javax.swing.GroupLayout(pnlConfortos);
        pnlConfortos.setLayout(pnlConfortosLayout);
        pnlConfortosLayout.setHorizontalGroup(
            pnlConfortosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfortosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConfortosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralSalvarConft)
                    .addComponent(cbxGeralListarConft)
                    .addComponent(cbxGeralBuscarConft)
                    .addComponent(cbxGeralExcluirConft)
                    .addComponent(cbxGeralLimparBuscaConft)
                    .addComponent(cbxGeralEditarConft))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pnlConfortosLayout.setVerticalGroup(
            pnlConfortosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfortosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarConft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarConft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirConft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarConft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaConft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarConft)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Confortos", pnlConfortos);

        cbxGeralExcluirCorEx.setText("Botão Excluir");

        cbxGeralLimparBuscaCorEx.setText("Botão Limpar Busca");

        cbxGeralSalvarCorEx.setText("Botão Salvar");

        cbxGeralListarCorEx.setText("Listar registros cadastrados");

        cbxGeralEditarCorEx.setText("Botão Editar");

        cbxGeralBuscarCorEx.setText("Botão Buscar");

        javax.swing.GroupLayout pnlCoresExtLayout = new javax.swing.GroupLayout(pnlCoresExt);
        pnlCoresExt.setLayout(pnlCoresExtLayout);
        pnlCoresExtLayout.setHorizontalGroup(
            pnlCoresExtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoresExtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCoresExtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralSalvarCorEx)
                    .addComponent(cbxGeralBuscarCorEx)
                    .addComponent(cbxGeralExcluirCorEx)
                    .addComponent(cbxGeralLimparBuscaCorEx)
                    .addComponent(cbxGeralListarCorEx)
                    .addComponent(cbxGeralEditarCorEx))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pnlCoresExtLayout.setVerticalGroup(
            pnlCoresExtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoresExtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarCorEx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarCorEx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirCorEx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarCorEx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaCorEx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarCorEx)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Cores externas", pnlCoresExt);

        cbxGeralExcluirCorInt.setText("Botão Excluir");

        cbxGeralListarCorInt.setText("Listar registros cadastrados");

        cbxGeralBuscarCorInt.setText("Botão Buscar");

        cbxGeralLimparBuscaCorInt.setText("Botão Limpar Busca");

        cbxGeralSalvarCorInt.setText("Botão Salvar");

        cbxGeralEditarCorInt.setText("Botão Editar");

        javax.swing.GroupLayout pnlCoresIntLayout = new javax.swing.GroupLayout(pnlCoresInt);
        pnlCoresInt.setLayout(pnlCoresIntLayout);
        pnlCoresIntLayout.setHorizontalGroup(
            pnlCoresIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoresIntLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCoresIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralExcluirCorInt)
                    .addComponent(cbxGeralLimparBuscaCorInt)
                    .addComponent(cbxGeralSalvarCorInt)
                    .addComponent(cbxGeralListarCorInt)
                    .addComponent(cbxGeralEditarCorInt)
                    .addComponent(cbxGeralBuscarCorInt))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pnlCoresIntLayout.setVerticalGroup(
            pnlCoresIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoresIntLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarCorInt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarCorInt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirCorInt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarCorInt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaCorInt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarCorInt)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Cores internas", pnlCoresInt);

        cbxGeralExcluirEst.setText("Botão Excluir");

        cbxGeralSalvarEst.setText("Botão Salvar");

        cbxGeralListarEst.setText("Listar registros cadastrados");

        cbxGeralLimparBuscaEst.setText("Botão Limpar Busca");

        cbxGeralEditarEst.setText("Botão Editar");

        cbxGeralBuscarEst.setText("Botão Buscar");

        javax.swing.GroupLayout pnlEstilosLayout = new javax.swing.GroupLayout(pnlEstilos);
        pnlEstilos.setLayout(pnlEstilosLayout);
        pnlEstilosLayout.setHorizontalGroup(
            pnlEstilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstilosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEstilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralExcluirEst)
                    .addComponent(cbxGeralListarEst)
                    .addComponent(cbxGeralBuscarEst)
                    .addComponent(cbxGeralLimparBuscaEst)
                    .addComponent(cbxGeralSalvarEst)
                    .addComponent(cbxGeralEditarEst))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pnlEstilosLayout.setVerticalGroup(
            pnlEstilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstilosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarEst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarEst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirEst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarEst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaEst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarEst)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Estilos", pnlEstilos);

        cbxGeralSalvarExt.setText("Botão Salvar");

        cbxGeralExcluirExt.setText("Botão Excluir");

        cbxGeralLimparBuscaExt.setText("Botão Limpar Busca");

        cbxGeralEditarExt.setText("Botão Editar");

        cbxGeralListarExt.setText("Listar registros cadastrados");

        cbxGeralBuscarExt.setText("Botão Buscar");

        javax.swing.GroupLayout pnlExtrasLayout = new javax.swing.GroupLayout(pnlExtras);
        pnlExtras.setLayout(pnlExtrasLayout);
        pnlExtrasLayout.setHorizontalGroup(
            pnlExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralExcluirExt)
                    .addComponent(cbxGeralSalvarExt)
                    .addComponent(cbxGeralListarExt)
                    .addComponent(cbxGeralLimparBuscaExt)
                    .addComponent(cbxGeralEditarExt)
                    .addComponent(cbxGeralBuscarExt))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pnlExtrasLayout.setVerticalGroup(
            pnlExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarExt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarExt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirExt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarExt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaExt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarExt)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Extras", pnlExtras);

        cbxGeralExcluirSeg.setText("Botão Excluir");

        cbxGeralLimparBuscaSeg.setText("Botão Limpar Busca");

        cbxGeralEditarSeg.setText("Botão Editar");

        cbxGeralSalvarSeg.setText("Botão Salvar");

        cbxGeralBuscarSeg.setText("Botão Buscar");

        cbxGeralListarSeg.setText("Listar registros cadastrados");

        javax.swing.GroupLayout pnlSegurancasLayout = new javax.swing.GroupLayout(pnlSegurancas);
        pnlSegurancas.setLayout(pnlSegurancasLayout);
        pnlSegurancasLayout.setHorizontalGroup(
            pnlSegurancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSegurancasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSegurancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralSalvarSeg)
                    .addComponent(cbxGeralExcluirSeg)
                    .addComponent(cbxGeralLimparBuscaSeg)
                    .addComponent(cbxGeralEditarSeg)
                    .addComponent(cbxGeralListarSeg)
                    .addComponent(cbxGeralBuscarSeg))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pnlSegurancasLayout.setVerticalGroup(
            pnlSegurancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSegurancasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarSeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarSeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirSeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarSeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaSeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarSeg)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Seguranças", pnlSegurancas);

        cbxGeralLimparBuscaTec.setText("Botão Limpar Busca");

        cbxGeralSalvarTec.setText("Botão Salvar");

        cbxGeralListarTec.setText("Listar registros cadastrados");

        cbxGeralExcluirTec.setText("Botão Excluir");

        cbxGeralBuscarTec.setText("Botão Buscar");

        cbxGeralEditarTec.setText("Botão Editar");

        javax.swing.GroupLayout pnlTecnologiasLayout = new javax.swing.GroupLayout(pnlTecnologias);
        pnlTecnologias.setLayout(pnlTecnologiasLayout);
        pnlTecnologiasLayout.setHorizontalGroup(
            pnlTecnologiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTecnologiasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTecnologiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralExcluirTec)
                    .addComponent(cbxGeralLimparBuscaTec)
                    .addComponent(cbxGeralEditarTec)
                    .addComponent(cbxGeralSalvarTec)
                    .addComponent(cbxGeralBuscarTec)
                    .addComponent(cbxGeralListarTec))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pnlTecnologiasLayout.setVerticalGroup(
            pnlTecnologiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTecnologiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarTec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarTec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirTec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarTec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaTec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarTec)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Tecnologias", pnlTecnologias);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPane2.addTab("Veículos", jPanel6);

        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        cbxGeralListarCid.setText("Listar registros cadastrados");

        cbxGeralSalvarCid.setText("Botão Salvar");

        cbxGeralBuscarCid.setText("Botão Buscar");

        cbxGeralEditarCid.setText("Botão Editar");

        cbxGeralExcluirCid.setText("Botão Excluir");

        cbxGeralLimparBuscaCid.setText("Botão Limpar Busca");

        cbxGeralComboCid.setText("Combo Estado");

        javax.swing.GroupLayout pnlCidadesLayout = new javax.swing.GroupLayout(pnlCidades);
        pnlCidades.setLayout(pnlCidadesLayout);
        pnlCidadesLayout.setHorizontalGroup(
            pnlCidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralBuscarCid)
                    .addComponent(cbxGeralListarCid)
                    .addComponent(cbxGeralExcluirCid)
                    .addComponent(cbxGeralSalvarCid)
                    .addComponent(cbxGeralLimparBuscaCid)
                    .addComponent(cbxGeralEditarCid)
                    .addComponent(cbxGeralComboCid))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        pnlCidadesLayout.setVerticalGroup(
            pnlCidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarCid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarCid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirCid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarCid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaCid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarCid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralComboCid)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Cidades", pnlCidades);

        cbxGeralListarEsta.setText("Listar registros cadastrados");

        cbxGeralSalvarEsta.setText("Botão Salvar");

        cbxGeralEditarEsta.setText("Botão Editar");

        cbxGeralExcluirEsta.setText("Botão Excluir");

        cbxGeralBuscarEsta.setText("Botão Buscar");

        cbxGeralLimparBuscaEsta.setText("Botão Limpar Busca");

        javax.swing.GroupLayout pnlEstadosLayout = new javax.swing.GroupLayout(pnlEstados);
        pnlEstados.setLayout(pnlEstadosLayout);
        pnlEstadosLayout.setHorizontalGroup(
            pnlEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralListarEsta)
                    .addComponent(cbxGeralSalvarEsta)
                    .addComponent(cbxGeralBuscarEsta)
                    .addComponent(cbxGeralEditarEsta)
                    .addComponent(cbxGeralExcluirEsta)
                    .addComponent(cbxGeralLimparBuscaEsta))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        pnlEstadosLayout.setVerticalGroup(
            pnlEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarEsta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarEsta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirEsta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarEsta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaEsta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarEsta)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Estados", pnlEstados);

        cbxGeralBuscarPerf.setText("Botão Buscar");

        cbxGeralLimparBuscaPerf.setText("Botão Limpar Busca");

        cbxGeralEditarPerf.setText("Botão Editar");

        cbxGeralExcluirPerf.setText("Botão Excluir");

        cbxGeralListarPerf.setText("Listar registros cadastrados");

        cbxGeralSalvarPerf.setText("Botão Salvar");

        javax.swing.GroupLayout pnlPerfisLayout = new javax.swing.GroupLayout(pnlPerfis);
        pnlPerfis.setLayout(pnlPerfisLayout);
        pnlPerfisLayout.setHorizontalGroup(
            pnlPerfisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPerfisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPerfisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGeralListarPerf)
                    .addComponent(cbxGeralSalvarPerf)
                    .addComponent(cbxGeralEditarPerf)
                    .addComponent(cbxGeralExcluirPerf)
                    .addComponent(cbxGeralBuscarPerf)
                    .addComponent(cbxGeralLimparBuscaPerf))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        pnlPerfisLayout.setVerticalGroup(
            pnlPerfisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPerfisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralSalvarPerf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralEditarPerf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralExcluirPerf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralBuscarPerf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralLimparBuscaPerf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxGeralListarPerf)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Perfis", pnlPerfis);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane2.addTab("Pessoal", jPanel7);

        cbxGeralAcessarAcab.setText("Acessar");

        javax.swing.GroupLayout pnlGeralLayout = new javax.swing.GroupLayout(pnlGeral);
        pnlGeral.setLayout(pnlGeralLayout);
        pnlGeralLayout.setHorizontalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGeralAcessarAcab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane2)
        );
        pnlGeralLayout.setVerticalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGeralLayout.createSequentialGroup()
                .addComponent(cbxGeralAcessarAcab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Painel.addTab("Geral", pnlGeral);

        cbxClienteSalvar.setText("Botão Salvar");

        cbxClienteExcluir.setText("Botão Excluir");

        cbxClienteEditar.setText("Botão Editar");

        cbxClienteAcessar.setText("Acessar");

        cbxClienteListar.setText("Listar registros cadastrados");

        cbxClienteLimparBusca.setText("Botão Limpar Busca");

        cbxClienteBuscar.setText("Botão Buscar");

        cbxClienteProcCid.setText("Botão Procurar Cidade");

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxClienteAcessar)
                    .addComponent(cbxClienteSalvar)
                    .addComponent(cbxClienteEditar)
                    .addComponent(cbxClienteExcluir)
                    .addComponent(cbxClienteBuscar)
                    .addComponent(cbxClienteLimparBusca)
                    .addComponent(cbxClienteListar)
                    .addComponent(cbxClienteProcCid))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxClienteAcessar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxClienteSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxClienteEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxClienteExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxClienteBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxClienteLimparBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxClienteProcCid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxClienteListar)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        Painel.addTab("Cliente", pnlCliente);

        cbxEmpVistAcessar.setText("Acessar");

        cbxEmpVistListar.setText("Listar registros cadastrados");

        cbxEmpVistBuscar.setText("Botão Buscar");

        cbxEmpVistEditar.setText("Botão Editar");

        cbxEmpVistSalvar.setText("Botão Salvar");

        cbxEmpVistLimparBusca.setText("Botão Limpar Busca");

        cbxEmpVistExcluir.setText("Botão Excluir");

        cbxEmpVistProcCid.setText("Botão Procurar Cidade");

        javax.swing.GroupLayout pnlEmpVistoriaLayout = new javax.swing.GroupLayout(pnlEmpVistoria);
        pnlEmpVistoria.setLayout(pnlEmpVistoriaLayout);
        pnlEmpVistoriaLayout.setHorizontalGroup(
            pnlEmpVistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpVistoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEmpVistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxEmpVistListar)
                    .addComponent(cbxEmpVistProcCid)
                    .addComponent(cbxEmpVistLimparBusca)
                    .addComponent(cbxEmpVistBuscar)
                    .addComponent(cbxEmpVistExcluir)
                    .addComponent(cbxEmpVistEditar)
                    .addComponent(cbxEmpVistSalvar)
                    .addComponent(cbxEmpVistAcessar))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        pnlEmpVistoriaLayout.setVerticalGroup(
            pnlEmpVistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpVistoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxEmpVistAcessar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxEmpVistSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxEmpVistEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxEmpVistExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxEmpVistBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxEmpVistLimparBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxEmpVistProcCid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxEmpVistListar)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        Painel.addTab("Empresa de Vistoria", pnlEmpVistoria);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        cbxProcurarVersao.setText("Procurar Versão");

        cbxVeiculoCmbSituacao.setText("Combo Situação do Veículo");

        cbxVeiculoCmbCorExt.setText("Combo Cor Externa");

        cbxVeiculoCmbCorInt.setText("Combo Cor Interna");

        cbxVeiculoCmbCambio.setText("Combo Câmbio");

        cbxVeiculoCmbAcabInt.setText("Combo Acabamento Interno");

        cbxVeiculoSalvar.setText("Botão Salvar");

        javax.swing.GroupLayout pnlInfosVeicLayout = new javax.swing.GroupLayout(pnlInfosVeic);
        pnlInfosVeic.setLayout(pnlInfosVeicLayout);
        pnlInfosVeicLayout.setHorizontalGroup(
            pnlInfosVeicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfosVeicLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfosVeicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxProcurarVersao)
                    .addComponent(cbxVeiculoCmbSituacao)
                    .addComponent(cbxVeiculoCmbCorExt)
                    .addComponent(cbxVeiculoCmbCorInt)
                    .addComponent(cbxVeiculoCmbCambio)
                    .addComponent(cbxVeiculoCmbAcabInt)
                    .addComponent(cbxVeiculoSalvar))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        pnlInfosVeicLayout.setVerticalGroup(
            pnlInfosVeicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfosVeicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxProcurarVersao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVeiculoCmbSituacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVeiculoCmbCorExt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVeiculoCmbCorInt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVeiculoCmbCambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVeiculoCmbAcabInt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVeiculoSalvar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informações do veículo", pnlInfosVeic);

        cbxVeiculoListarConf.setText("Listar e selecionar registros");

        javax.swing.GroupLayout pnlVecConfortosLayout = new javax.swing.GroupLayout(pnlVecConfortos);
        pnlVecConfortos.setLayout(pnlVecConfortosLayout);
        pnlVecConfortosLayout.setHorizontalGroup(
            pnlVecConfortosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVecConfortosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxVeiculoListarConf)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        pnlVecConfortosLayout.setVerticalGroup(
            pnlVecConfortosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVecConfortosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxVeiculoListarConf)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Confortos", pnlVecConfortos);

        cbxVeiculoListarEsti.setText("Listar e selecionar registros");

        javax.swing.GroupLayout pnlVecEstilosLayout = new javax.swing.GroupLayout(pnlVecEstilos);
        pnlVecEstilos.setLayout(pnlVecEstilosLayout);
        pnlVecEstilosLayout.setHorizontalGroup(
            pnlVecEstilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVecEstilosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxVeiculoListarEsti)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        pnlVecEstilosLayout.setVerticalGroup(
            pnlVecEstilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVecEstilosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxVeiculoListarEsti)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estilos", pnlVecEstilos);

        cbxVeiculoListarExtr.setText("Listar e selecionar registros");

        javax.swing.GroupLayout pnlVecExtrasLayout = new javax.swing.GroupLayout(pnlVecExtras);
        pnlVecExtras.setLayout(pnlVecExtrasLayout);
        pnlVecExtrasLayout.setHorizontalGroup(
            pnlVecExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVecExtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxVeiculoListarExtr)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        pnlVecExtrasLayout.setVerticalGroup(
            pnlVecExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVecExtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxVeiculoListarExtr)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Extras", pnlVecExtras);

        cbxVeiculoListarSegu.setText("Listar e selecionar registros");

        javax.swing.GroupLayout pnlVecSegurancasLayout = new javax.swing.GroupLayout(pnlVecSegurancas);
        pnlVecSegurancas.setLayout(pnlVecSegurancasLayout);
        pnlVecSegurancasLayout.setHorizontalGroup(
            pnlVecSegurancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVecSegurancasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxVeiculoListarSegu)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        pnlVecSegurancasLayout.setVerticalGroup(
            pnlVecSegurancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVecSegurancasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxVeiculoListarSegu)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Seguranças", pnlVecSegurancas);

        cbxVeiculoListarTecn.setText("Listar e selecionar registros");

        javax.swing.GroupLayout pnlVecTecnologiasLayout = new javax.swing.GroupLayout(pnlVecTecnologias);
        pnlVecTecnologias.setLayout(pnlVecTecnologiasLayout);
        pnlVecTecnologiasLayout.setHorizontalGroup(
            pnlVecTecnologiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVecTecnologiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxVeiculoListarTecn)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        pnlVecTecnologiasLayout.setVerticalGroup(
            pnlVecTecnologiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVecTecnologiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxVeiculoListarTecn)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tecnologias", pnlVecTecnologias);

        jTabbedPane5.addTab("Cadastrar ou editar", jTabbedPane1);

        cbxVecListCmbSit.setText("Combo Situação");

        cbxVecListCmbMar.setText("Combo Marca");

        cbxVecListBuscar.setText("Botão Buscar");

        cbxVecListLimparBusca.setText("Botão Limpar Busca");

        cbxVecListEditar.setText("Botão Editar");

        cbxVecListExcluir.setText("Botão Excluir");

        cbxListarVeiculos.setText("Listar Veículos");

        javax.swing.GroupLayout pnlListarLayout = new javax.swing.GroupLayout(pnlListar);
        pnlListar.setLayout(pnlListarLayout);
        pnlListarLayout.setHorizontalGroup(
            pnlListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxVecListCmbSit)
                    .addComponent(cbxVecListCmbMar)
                    .addComponent(cbxVecListBuscar)
                    .addComponent(cbxVecListLimparBusca)
                    .addComponent(cbxVecListEditar)
                    .addComponent(cbxVecListExcluir)
                    .addComponent(cbxListarVeiculos))
                .addContainerGap(423, Short.MAX_VALUE))
        );
        pnlListarLayout.setVerticalGroup(
            pnlListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxVecListCmbSit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVecListCmbMar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVecListBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVecListLimparBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVecListEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxVecListExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxListarVeiculos)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Listar", pnlListar);

        cbxVeiculoAcessar.setText("Acessar");

        javax.swing.GroupLayout pnlVeiculoLayout = new javax.swing.GroupLayout(pnlVeiculo);
        pnlVeiculo.setLayout(pnlVeiculoLayout);
        pnlVeiculoLayout.setHorizontalGroup(
            pnlVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVeiculoLayout.createSequentialGroup()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(pnlVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxVeiculoAcessar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlVeiculoLayout.setVerticalGroup(
            pnlVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVeiculoLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(cbxVeiculoAcessar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Painel.addTab("Veículo", pnlVeiculo);

        cbxProprietarioEditar.setText("Botão Editar");

        cbxProprietarioSalvar.setText("Botão Salvar");

        cbxProprietarioProcCid.setText("Botão Procurar Cidade");

        cbxProprietarioBuscar.setText("Botão Buscar");

        cbxProprietarioListar.setText("Listar registros cadastrados");

        cbxProprietarioExcluir.setText("Botão Excluir");

        cbxProprietarioAcessar.setText("Acessar");

        cbxProprietarioLimparBusca.setText("Botão Limpar Busca");

        javax.swing.GroupLayout pnlProprietarioLayout = new javax.swing.GroupLayout(pnlProprietario);
        pnlProprietario.setLayout(pnlProprietarioLayout);
        pnlProprietarioLayout.setHorizontalGroup(
            pnlProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProprietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxProprietarioListar)
                    .addComponent(cbxProprietarioProcCid)
                    .addComponent(cbxProprietarioLimparBusca)
                    .addComponent(cbxProprietarioBuscar)
                    .addComponent(cbxProprietarioExcluir)
                    .addComponent(cbxProprietarioEditar)
                    .addComponent(cbxProprietarioSalvar)
                    .addComponent(cbxProprietarioAcessar))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        pnlProprietarioLayout.setVerticalGroup(
            pnlProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProprietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxProprietarioAcessar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxProprietarioSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxProprietarioEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxProprietarioExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxProprietarioBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxProprietarioLimparBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxProprietarioProcCid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxProprietarioListar)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        Painel.addTab("Proprietário", pnlProprietario);

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preenchePermissoesMarca() {
        perm = peDAO.consultarPermissoes(telaMarca, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(acessar)) {
                cbxMarcaAcessar.setSelected(true);
            }
            if (perm.get(i).equals(editar)) {
                cbxMarcaEditar.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxMarcaSalvar.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxMarcaExcluir.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxMarcaBuscar.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxMarcaLimparBusca.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxMarcaListar.setSelected(true);
            }
        }
    }

    private void preenchePermissoesModelo() {
        perm = peDAO.consultarPermissoes(telaModelo, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(acessar)) {
                cbxModeloAcessar.setSelected(true);
            }
            if (perm.get(i).equals(editar)) {
                cbxModeloEditar.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxModeloSalvar.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxModeloExcluir.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxModeloBuscar.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxModeloLimparBusca.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxModeloListar.setSelected(true);
            }
            if (perm.get(i).equals(comboCadastro)) {
                cbxModeloComboMarcaCadastro.setSelected(true);
            }
            if (perm.get(i).equals(comboListar)) {
                cbxModeloComboMarcaListar.setSelected(true);
            }
            if (perm.get(i).equals(comboProcedencia)) {
                cbxModeloComboProcedencia.setSelected(true);
            }
            if (perm.get(i).equals(comboCarroceria)) {
                cbxModeloComboCarroceria.setSelected(true);
            }
        }
    }

    private void preenchePermissoesUsuario() {
        perm = peDAO.consultarPermissoes(telaUsuario, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(acessar)) {
                cbxUsuarioAcessar.setSelected(true);
            }
            if (perm.get(i).equals(editar)) {
                cbxUsuarioEditar.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxUsuarioSalvar.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxUsuarioExcluir.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxUsuarioBuscar.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxUsuarioLimparBusca.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxUsuarioListar.setSelected(true);
            }
            if (perm.get(i).equals(comboCadastro)) {
                cbxUsuarioComboCadastro.setSelected(true);
            }
            if (perm.get(i).equals(comboListar)) {
                cbxUsuarioComboListar.setSelected(true);
            }
            if (perm.get(i).equals(permissao)) {
                cbxUsuarioPermissao.setSelected(true);
            }
        }
    }

    private void preenchePermissoesVersao() {
        perm = peDAO.consultarPermissoes(telaVersao, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(acessar)) {
                cbxVersaoAcessar.setSelected(true);
            }
            if (perm.get(i).equals(editar)) {
                cbxVersaoEditar.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxVersaoSalvar.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxVersaoExcluir.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxVersaoBuscar.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxVersaoLimparBusca.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxVersaoListar.setSelected(true);
            }
            if (perm.get(i).equals(comboCadastro)) {
                cbxVersaoComboCombCadastro.setSelected(true);
            }
            if (perm.get(i).equals(comboListar)) {
                cbxVersaoComboMarcaListar.setSelected(true);
            }
            if (perm.get(i).equals(procurar)) {
                cbxVersaoProcurarModelo.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralAcab() {
        perm = peDAO.consultarPermissoes(telaGeralAcab, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(acessar)) {
                cbxGeralAcessarAcab.setSelected(true);
            }
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarAcab.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarAcab.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirAcab.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarAcab.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaAcab.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarAcab.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralCamb() {
        perm = peDAO.consultarPermissoes(telaGeralCamb, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarCamb.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarCamb.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirCamb.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarCamb.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaCamb.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarCamb.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralCarr() {
        perm = peDAO.consultarPermissoes(telaGeralCarr, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarCarr.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarCarr.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirCarr.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarCarr.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaCarr.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarCarr.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralComb() {
        perm = peDAO.consultarPermissoes(telaGeralComb, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarComb.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarComb.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirComb.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarComb.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaComb.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarComb.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralConf() {
        perm = peDAO.consultarPermissoes(telaGeralConf, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarConft.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarConft.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirConft.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarConft.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaConft.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarConft.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralCorE() {
        perm = peDAO.consultarPermissoes(telaGeralCorE, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarCorEx.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarCorEx.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirCorEx.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarCorEx.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaCorEx.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarCorEx.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralCorI() {
        perm = peDAO.consultarPermissoes(telaGeralCorI, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarCorInt.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarCorInt.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirCorInt.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarCorInt.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaCorInt.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarCorInt.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralEsti() {
        perm = peDAO.consultarPermissoes(telaGeralEsti, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarEst.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarEst.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirEst.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarEst.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaEst.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarEst.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralExtr() {
        perm = peDAO.consultarPermissoes(telaGeralExtr, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarExt.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarExt.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirExt.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarExt.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaExt.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarExt.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralSegu() {
        perm = peDAO.consultarPermissoes(telaGeralSegu, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarSeg.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarSeg.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirSeg.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarSeg.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaSeg.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarSeg.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralTecn() {
        perm = peDAO.consultarPermissoes(telaGeralTecn, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarTec.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarTec.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirTec.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarTec.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaTec.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarTec.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralCida() {
        perm = peDAO.consultarPermissoes(telaGeralCida, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarCid.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarCid.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirCid.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarCid.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaCid.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarCid.setSelected(true);
            }
            if (perm.get(i).equals(comboEstado)) {
                cbxGeralComboCid.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralEsta() {
        perm = peDAO.consultarPermissoes(telaGeralEsta, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarEsta.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarEsta.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirEsta.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarEsta.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaEsta.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarEsta.setSelected(true);
            }
        }
    }

    private void preenchePermissoesGeralPerf() {
        perm = peDAO.consultarPermissoes(telaGeralPerf, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(editar)) {
                cbxGeralEditarPerf.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxGeralSalvarPerf.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxGeralExcluirPerf.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxGeralBuscarPerf.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxGeralLimparBuscaPerf.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxGeralListarPerf.setSelected(true);
            }
        }
    }

    private void preenchePermissoesCliente() {
        perm = peDAO.consultarPermissoes(telaCliente, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(acessar)) {
                cbxClienteAcessar.setSelected(true);
            }
            if (perm.get(i).equals(editar)) {
                cbxClienteEditar.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxClienteSalvar.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxClienteExcluir.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxClienteBuscar.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxClienteLimparBusca.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxClienteListar.setSelected(true);
            }
            if (perm.get(i).equals(procurar)) {
                cbxClienteProcCid.setSelected(true);
            }
        }
    }

    private void preenchePermissoesEmpVistoria() {
        perm = peDAO.consultarPermissoes(telaEmpVistoria, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(acessar)) {
                cbxEmpVistAcessar.setSelected(true);
            }
            if (perm.get(i).equals(editar)) {
                cbxEmpVistEditar.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxEmpVistSalvar.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxEmpVistExcluir.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxEmpVistBuscar.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxEmpVistLimparBusca.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxEmpVistListar.setSelected(true);
            }
            if (perm.get(i).equals(procurar)) {
                cbxEmpVistProcCid.setSelected(true);
            }
        }
    }

    private void preenchePermissoesProprietario() {
        perm = peDAO.consultarPermissoes(telaProprietario, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(acessar)) {
                cbxProprietarioAcessar.setSelected(true);
            }
            if (perm.get(i).equals(editar)) {
                cbxProprietarioEditar.setSelected(true);
            }
            if (perm.get(i).equals(salvar)) {
                cbxProprietarioSalvar.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxProprietarioExcluir.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxProprietarioBuscar.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxProprietarioLimparBusca.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxProprietarioListar.setSelected(true);
            }
            if (perm.get(i).equals(procurar)) {
                cbxProprietarioProcCid.setSelected(true);
            }
        }
    }

    private void preenchePermissoesVeiculoInfos() {
        perm = peDAO.consultarPermissoes(telaVeiculoInfos, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(salvar)) {
                cbxVeiculoSalvar.setSelected(true);
            }
            if (perm.get(i).equals(acessar)) {
                cbxVeiculoAcessar.setSelected(true);
            }
            if (perm.get(i).equals(procurar)) {
                cbxProcurarVersao.setSelected(true);
            }
            if (perm.get(i).equals(comboSituacao)) {
                cbxVeiculoCmbSituacao.setSelected(true);
            }
            if (perm.get(i).equals(comboCorExt)) {
                cbxVeiculoCmbCorExt.setSelected(true);
            }
            if (perm.get(i).equals(comboCorInt)) {
                cbxVeiculoCmbCorInt.setSelected(true);
            }
            if (perm.get(i).equals(comboCambio)) {
                cbxVeiculoCmbCambio.setSelected(true);
            }
            if (perm.get(i).equals(comboAcabInt)) {
                cbxVeiculoCmbAcabInt.setSelected(true);
            }
        }
    }

    private void preenchePermissoesVeiculoConf() {
        perm = peDAO.consultarPermissoes(telaVeiculoConf, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(listar)) {
                cbxVeiculoListarConf.setSelected(true);
            }
        }
    }

    private void preenchePermissoesVeiculoEsti() {
        perm = peDAO.consultarPermissoes(telaVeiculoEsti, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(listar)) {
                cbxVeiculoListarEsti.setSelected(true);
            }
        }
    }

    private void preenchePermissoesVeiculoExtr() {
        perm = peDAO.consultarPermissoes(telaVeiculoExtr, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(listar)) {
                cbxVeiculoListarExtr.setSelected(true);
            }
        }
    }

    private void preenchePermissoesVeiculoSegu() {
        perm = peDAO.consultarPermissoes(telaVeiculoSegu, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(listar)) {
                cbxVeiculoListarSegu.setSelected(true);
            }
        }
    }

    private void preenchePermissoesVeiculoTecn() {
        perm = peDAO.consultarPermissoes(telaVeiculoTecn, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(listar)) {
                cbxVeiculoListarTecn.setSelected(true);
            }
        }
    }

    private void preenchePermissoesVeiculoList() {
        perm = peDAO.consultarPermissoes(telaVeiculoList, usuario.getId());
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(comboSituacao)) {
                cbxVecListCmbSit.setSelected(true);
            }
            if (perm.get(i).equals(comboMarca)) {
                cbxVecListCmbMar.setSelected(true);
            }
            if (perm.get(i).equals(buscar)) {
                cbxVecListBuscar.setSelected(true);
            }
            if (perm.get(i).equals(limparBusca)) {
                cbxVecListLimparBusca.setSelected(true);
            }
            if (perm.get(i).equals(editar)) {
                cbxVecListEditar.setSelected(true);
            }
            if (perm.get(i).equals(excluir)) {
                cbxVecListExcluir.setSelected(true);
            }
            if (perm.get(i).equals(listar)) {
                cbxListarVeiculos.setSelected(true);
            }
        }
    }
    
    private Boolean atualizaPerms() {
        boolean ok;
        //marca
        boolean marca = true;
        ok = Funcoes.verificaPermissoes(cbxMarcaAcessar, acessar, telaMarca, usuario, peDAO);
        if (!ok == true) {
            marca = false;
        }
        ok = Funcoes.verificaPermissoes(cbxMarcaEditar, editar, telaMarca, usuario, peDAO);
        if (!ok == true) {
            marca = false;
        }
        ok = Funcoes.verificaPermissoes(cbxMarcaSalvar, salvar, telaMarca, usuario, peDAO);
        if (!ok == true) {
            marca = false;
        }
        ok = Funcoes.verificaPermissoes(cbxMarcaExcluir, excluir, telaMarca, usuario, peDAO);
        if (!ok == true) {
            marca = false;
        }
        ok = Funcoes.verificaPermissoes(cbxMarcaBuscar, buscar, telaMarca, usuario, peDAO);
        if (!ok == true) {
            marca = false;
        }
        ok = Funcoes.verificaPermissoes(cbxMarcaLimparBusca, limparBusca, telaMarca, usuario, peDAO);
        if (!ok == true) {
            marca = false;
        }
        ok = Funcoes.verificaPermissoes(cbxMarcaListar, listar, telaMarca, usuario, peDAO);
        if (!ok == true) {
            marca = false;
        }

        //modelo
        boolean modelo = true;
        ok = Funcoes.verificaPermissoes(cbxModeloAcessar, acessar, telaModelo, usuario, peDAO);
        if (!ok == true) {
            modelo = false;
        }

        ok = Funcoes.verificaPermissoes(cbxModeloEditar, editar, telaModelo, usuario, peDAO);
        if (!ok == true) {
            modelo = false;
        }
        ok = Funcoes.verificaPermissoes(cbxModeloSalvar, salvar, telaModelo, usuario, peDAO);
        if (!ok == true) {
            modelo = false;
        }
        ok = Funcoes.verificaPermissoes(cbxModeloExcluir, excluir, telaModelo, usuario, peDAO);
        if (!ok == true) {
            modelo = false;
        }
        ok = Funcoes.verificaPermissoes(cbxModeloBuscar, buscar, telaModelo, usuario, peDAO);
        if (!ok == true) {
            modelo = false;
        }
        ok = Funcoes.verificaPermissoes(cbxModeloLimparBusca, limparBusca, telaModelo, usuario, peDAO);
        if (!ok == true) {
            modelo = false;
        }
        ok = Funcoes.verificaPermissoes(cbxModeloListar, listar, telaModelo, usuario, peDAO);
        if (!ok == true) {
            modelo = false;
        }
        ok = Funcoes.verificaPermissoes(cbxModeloComboMarcaCadastro, comboCadastro, telaModelo, usuario, peDAO);
        if (!ok == true) {
            modelo = false;
        }
        ok = Funcoes.verificaPermissoes(cbxModeloComboProcedencia, comboProcedencia, telaModelo, usuario, peDAO);
        if (!ok == true) {
            modelo = false;
        }
        ok = Funcoes.verificaPermissoes(cbxModeloComboCarroceria, comboCarroceria, telaModelo, usuario, peDAO);
        if (!ok == true) {
            modelo = false;
        }
        ok = Funcoes.verificaPermissoes(cbxModeloComboMarcaListar, comboListar, telaModelo, usuario, peDAO);
        if (!ok == true) {
            modelo = false;
        }

        //usuario
        boolean user = true;

        ok = Funcoes.verificaPermissoes(cbxUsuarioAcessar, acessar, telaUsuario, usuario, peDAO);
        if (!ok == true) {
            user = false;
        }
        ok = Funcoes.verificaPermissoes(cbxUsuarioEditar, editar, telaUsuario, usuario, peDAO);
        if (!ok == true) {
            user = false;
        }
        ok = Funcoes.verificaPermissoes(cbxUsuarioSalvar, salvar, telaUsuario, usuario, peDAO);
        if (!ok == true) {
            user = false;
        }
        ok = Funcoes.verificaPermissoes(cbxUsuarioExcluir, excluir, telaUsuario, usuario, peDAO);
        if (!ok == true) {
            user = false;
        }
        ok = Funcoes.verificaPermissoes(cbxUsuarioBuscar, buscar, telaUsuario, usuario, peDAO);
        if (!ok == true) {
            user = false;
        }
        ok = Funcoes.verificaPermissoes(cbxUsuarioListar, listar, telaUsuario, usuario, peDAO);
        if (!ok == true) {
            user = false;
        }
        ok = Funcoes.verificaPermissoes(cbxUsuarioLimparBusca, limparBusca, telaUsuario, usuario, peDAO);
        if (!ok == true) {
            user = false;
        }
        ok = Funcoes.verificaPermissoes(cbxUsuarioComboCadastro, comboCadastro, telaUsuario, usuario, peDAO);
        if (!ok == true) {
            user = false;
        }
        ok = Funcoes.verificaPermissoes(cbxUsuarioComboListar, comboListar, telaUsuario, usuario, peDAO);
        if (!ok == true) {
            user = false;
        }
        ok = Funcoes.verificaPermissoes(cbxUsuarioPermissao, permissao, telaUsuario, usuario, peDAO);
        if (!ok == true) {
            user = false;
        }

        //versao
        boolean versao = true;

        ok = Funcoes.verificaPermissoes(cbxVersaoAcessar, acessar, telaVersao, usuario, peDAO);
        if (!ok == true) {
            versao = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVersaoEditar, editar, telaVersao, usuario, peDAO);
        if (!ok == true) {
            versao = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVersaoSalvar, salvar, telaVersao, usuario, peDAO);
        if (!ok == true) {
            versao = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVersaoExcluir, excluir, telaVersao, usuario, peDAO);
        if (!ok == true) {
            versao = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVersaoBuscar, buscar, telaVersao, usuario, peDAO);
        if (!ok == true) {
            versao = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVersaoLimparBusca, limparBusca, telaVersao, usuario, peDAO);
        if (!ok == true) {
            versao = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVersaoComboCombCadastro, comboCadastro, telaVersao, usuario, peDAO);
        if (!ok == true) {
            versao = false;
        }
        ok = Funcoes.verificaPermissoes(cbxUsuarioComboListar, comboListar, telaVersao, usuario, peDAO);
        if (!ok == true) {
            versao = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVersaoProcurarModelo, procurar, telaVersao, usuario, peDAO);
        if (!ok == true) {
            versao = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVersaoListar, listar, telaVersao, usuario, peDAO);
        if (!ok == true) {
            versao = false;
        }

        //geral acab
        boolean gacab = true;

        ok = Funcoes.verificaPermissoes(cbxGeralAcessarAcab, acessar, telaGeralAcab, usuario, peDAO);
        if (!ok == true) {
            gacab = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralEditarAcab, editar, telaGeralAcab, usuario, peDAO);
        if (!ok == true) {
            gacab = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarAcab, salvar, telaGeralAcab, usuario, peDAO);
        if (!ok == true) {
            gacab = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirAcab, excluir, telaGeralAcab, usuario, peDAO);
        if (!ok == true) {
            gacab = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarAcab, buscar, telaGeralAcab, usuario, peDAO);
        if (!ok == true) {
            gacab = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaAcab, limparBusca, telaGeralAcab, usuario, peDAO);
        if (!ok == true) {
            gacab = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarAcab, listar, telaGeralAcab, usuario, peDAO);
        if (!ok == true) {
            gacab = false;
        }

        //geral camb
        boolean gcamb = true;

        ok = Funcoes.verificaPermissoes(cbxGeralEditarCamb, editar, telaGeralCamb, usuario, peDAO);
        if (!ok == true) {
            gcamb = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarCamb, salvar, telaGeralCamb, usuario, peDAO);
        if (!ok == true) {
            gcamb = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirCamb, excluir, telaGeralCamb, usuario, peDAO);
        if (!ok == true) {
            gcamb = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarCamb, buscar, telaGeralCamb, usuario, peDAO);
        if (!ok == true) {
            gcamb = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaCamb, limparBusca, telaGeralCamb, usuario, peDAO);
        if (!ok == true) {
            gcamb = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarCamb, listar, telaGeralCamb, usuario, peDAO);
        if (!ok == true) {
            gcamb = false;
        }

        //geral carr
        boolean gcarr = true;

        ok = Funcoes.verificaPermissoes(cbxGeralEditarCarr, editar, telaGeralCarr, usuario, peDAO);
        if (!ok == true) {
            gcarr = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarCarr, salvar, telaGeralCarr, usuario, peDAO);
        if (!ok == true) {
            gcarr = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirCarr, excluir, telaGeralCarr, usuario, peDAO);
        if (!ok == true) {
            gcarr = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarCarr, buscar, telaGeralCarr, usuario, peDAO);
        if (!ok == true) {
            gcarr = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaCarr, limparBusca, telaGeralCarr, usuario, peDAO);
        if (!ok == true) {
            gcarr = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarCarr, listar, telaGeralCarr, usuario, peDAO);
        if (!ok == true) {
            gcarr = false;
        }

        //geral comb
        boolean gcomb = true;

        ok = Funcoes.verificaPermissoes(cbxGeralEditarComb, editar, telaGeralComb, usuario, peDAO);
        if (!ok == true) {
            gcomb = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarComb, salvar, telaGeralComb, usuario, peDAO);
        if (!ok == true) {
            gcomb = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirComb, excluir, telaGeralComb, usuario, peDAO);
        if (!ok == true) {
            gcomb = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarComb, buscar, telaGeralComb, usuario, peDAO);
        if (!ok == true) {
            gcomb = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaComb, limparBusca, telaGeralComb, usuario, peDAO);
        if (!ok == true) {
            gcomb = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarComb, listar, telaGeralComb, usuario, peDAO);
        if (!ok == true) {
            gcomb = false;
        }

        //geral conf
        boolean gconf = true;

        ok = Funcoes.verificaPermissoes(cbxGeralEditarConft, editar, telaGeralConf, usuario, peDAO);
        if (!ok == true) {
            gconf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarConft, salvar, telaGeralConf, usuario, peDAO);
        if (!ok == true) {
            gconf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirConft, excluir, telaGeralConf, usuario, peDAO);
        if (!ok == true) {
            gconf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarConft, buscar, telaGeralConf, usuario, peDAO);
        if (!ok == true) {
            gconf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaConft, limparBusca, telaGeralConf, usuario, peDAO);
        if (!ok == true) {
            gconf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarConft, listar, telaGeralConf, usuario, peDAO);
        if (!ok == true) {
            gconf = false;
        }

        //geral cor externa
        boolean gcore = true;

        ok = Funcoes.verificaPermissoes(cbxGeralEditarCorEx, editar, telaGeralCorE, usuario, peDAO);
        if (!ok == true) {
            gcore = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarCorEx, salvar, telaGeralCorE, usuario, peDAO);
        if (!ok == true) {
            gcore = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirCorEx, excluir, telaGeralCorE, usuario, peDAO);
        if (!ok == true) {
            gcore = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarCorEx, buscar, telaGeralCorE, usuario, peDAO);
        if (!ok == true) {
            gcore = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaCorEx, limparBusca, telaGeralCorE, usuario, peDAO);
        if (!ok == true) {
            gcore = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarCorEx, listar, telaGeralCorE, usuario, peDAO);
        if (!ok == true) {
            gcore = false;
        }

        //geral cor interna
        boolean gcori = true;

        ok = Funcoes.verificaPermissoes(cbxGeralEditarCorInt, editar, telaGeralCorI, usuario, peDAO);
        if (!ok == true) {
            gcori = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarCorInt, salvar, telaGeralCorI, usuario, peDAO);
        if (!ok == true) {
            gcori = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirCorInt, excluir, telaGeralCorI, usuario, peDAO);
        if (!ok == true) {
            gcori = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarCorInt, buscar, telaGeralCorI, usuario, peDAO);
        if (!ok == true) {
            gcori = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaCorInt, limparBusca, telaGeralCorI, usuario, peDAO);
        if (!ok == true) {
            gcori = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarCorInt, listar, telaGeralCorI, usuario, peDAO);
        if (!ok == true) {
            gcori = false;
        }

        //geral estilos
        boolean gesti = true;

        ok = Funcoes.verificaPermissoes(cbxGeralEditarEst, editar, telaGeralEsti, usuario, peDAO);
        if (!ok == true) {
            gesti = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarEst, salvar, telaGeralEsti, usuario, peDAO);
        if (!ok == true) {
            gesti = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirEst, excluir, telaGeralEsti, usuario, peDAO);
        if (!ok == true) {
            gesti = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarEst, buscar, telaGeralEsti, usuario, peDAO);
        if (!ok == true) {
            gesti = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaEst, limparBusca, telaGeralEsti, usuario, peDAO);
        if (!ok == true) {
            gesti = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarEst, listar, telaGeralEsti, usuario, peDAO);
        if (!ok == true) {
            gesti = false;
        }

        //geral extras
        boolean gextr = true;

        ok = Funcoes.verificaPermissoes(cbxGeralEditarExt, editar, telaGeralExtr, usuario, peDAO);
        if (!ok == true) {
            gextr = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarExt, salvar, telaGeralExtr, usuario, peDAO);
        if (!ok == true) {
            gextr = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirExt, excluir, telaGeralExtr, usuario, peDAO);
        if (!ok == true) {
            gextr = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarExt, buscar, telaGeralExtr, usuario, peDAO);
        if (!ok == true) {
            gextr = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaExt, limparBusca, telaGeralExtr, usuario, peDAO);
        if (!ok == true) {
            gextr = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarExt, listar, telaGeralExtr, usuario, peDAO);
        if (!ok == true) {
            gextr = false;
        }

        //geral segurança
        boolean gsegu = true;

        ok = Funcoes.verificaPermissoes(cbxGeralEditarSeg, editar, telaGeralSegu, usuario, peDAO);
        if (!ok == true) {
            gsegu = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarSeg, salvar, telaGeralSegu, usuario, peDAO);
        if (!ok == true) {
            gsegu = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirSeg, excluir, telaGeralSegu, usuario, peDAO);
        if (!ok == true) {
            gsegu = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarSeg, buscar, telaGeralSegu, usuario, peDAO);
        if (!ok == true) {
            gsegu = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaSeg, limparBusca, telaGeralSegu, usuario, peDAO);
        if (!ok == true) {
            gsegu = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarSeg, listar, telaGeralSegu, usuario, peDAO);
        if (!ok == true) {
            gsegu = false;
        }

        //geral tecnologia
        boolean gtecn = true;

        ok = Funcoes.verificaPermissoes(cbxGeralEditarTec, editar, telaGeralTecn, usuario, peDAO);
        if (!ok == true) {
            gtecn = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarTec, salvar, telaGeralTecn, usuario, peDAO);
        if (!ok == true) {
            gtecn = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirTec, excluir, telaGeralTecn, usuario, peDAO);
        if (!ok == true) {
            gtecn = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarTec, buscar, telaGeralTecn, usuario, peDAO);
        if (!ok == true) {
            gtecn = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaTec, limparBusca, telaGeralTecn, usuario, peDAO);
        if (!ok == true) {
            gtecn = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarTec, listar, telaGeralTecn, usuario, peDAO);
        if (!ok == true) {
            gtecn = false;
        }

        //geral cidade
        boolean gcid = true;

        ok = Funcoes.verificaPermissoes(cbxGeralEditarCid, editar, telaGeralCida, usuario, peDAO);
        if (!ok == true) {
            gcid = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarCid, salvar, telaGeralCida, usuario, peDAO);
        if (!ok == true) {
            gcid = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirCid, excluir, telaGeralCida, usuario, peDAO);
        if (!ok == true) {
            gcid = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarCid, buscar, telaGeralCida, usuario, peDAO);
        if (!ok == true) {
            gcid = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaCid, limparBusca, telaGeralCida, usuario, peDAO);
        if (!ok == true) {
            gcid = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralComboCid, comboEstado, telaGeralCida, usuario, peDAO);
        if (!ok == true) {
            gcid = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarCid, listar, telaGeralCida, usuario, peDAO);
        if (!ok == true) {
            gcid = false;
        }

        //geral estados
        boolean gest = true;

        ok = Funcoes.verificaPermissoes(cbxGeralEditarEsta, editar, telaGeralEsta, usuario, peDAO);
        if (!ok == true) {
            gest = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarEsta, salvar, telaGeralEsta, usuario, peDAO);
        if (!ok == true) {
            gest = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirEsta, excluir, telaGeralEsta, usuario, peDAO);
        if (!ok == true) {
            gest = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarEsta, buscar, telaGeralEsta, usuario, peDAO);
        if (!ok == true) {
            gest = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaEsta, limparBusca, telaGeralEsta, usuario, peDAO);
        if (!ok == true) {
            gest = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarEsta, listar, telaGeralEsta, usuario, peDAO);
        if (!ok == true) {
            gest = false;
        }

        //geral perfis
        boolean gperf = true;

        ok = Funcoes.verificaPermissoes(cbxGeralEditarPerf, editar, telaGeralPerf, usuario, peDAO);
        if (!ok == true) {
            gperf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralSalvarPerf, salvar, telaGeralPerf, usuario, peDAO);
        if (!ok == true) {
            gperf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralExcluirPerf, excluir, telaGeralPerf, usuario, peDAO);
        if (!ok == true) {
            gperf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralBuscarPerf, buscar, telaGeralPerf, usuario, peDAO);
        if (!ok == true) {
            gperf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralLimparBuscaPerf, limparBusca, telaGeralPerf, usuario, peDAO);
        if (!ok == true) {
            gperf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxGeralListarPerf, listar, telaGeralPerf, usuario, peDAO);
        if (!ok == true) {
            gperf = false;
        }

        //cliente
        boolean cliente = true;

        ok = Funcoes.verificaPermissoes(cbxClienteAcessar, acessar, telaCliente, usuario, peDAO);
        if (!ok == true) {
            cliente = false;
        }
        ok = Funcoes.verificaPermissoes(cbxClienteEditar, editar, telaCliente, usuario, peDAO);
        if (!ok == true) {
            cliente = false;
        }
        ok = Funcoes.verificaPermissoes(cbxClienteSalvar, salvar, telaCliente, usuario, peDAO);
        if (!ok == true) {
            cliente = false;
        }
        ok = Funcoes.verificaPermissoes(cbxClienteExcluir, excluir, telaCliente, usuario, peDAO);
        if (!ok == true) {
            cliente = false;
        }
        ok = Funcoes.verificaPermissoes(cbxClienteBuscar, buscar, telaCliente, usuario, peDAO);
        if (!ok == true) {
            cliente = false;
        }
        ok = Funcoes.verificaPermissoes(cbxClienteLimparBusca, limparBusca, telaCliente, usuario, peDAO);
        if (!ok == true) {
            cliente = false;
        }
        ok = Funcoes.verificaPermissoes(cbxClienteListar, listar, telaCliente, usuario, peDAO);
        if (!ok == true) {
            cliente = false;
        }
        ok = Funcoes.verificaPermissoes(cbxClienteProcCid, procurar, telaCliente, usuario, peDAO);
        if (!ok == true) {
            cliente = false;
        }

        //empresa vistoria
        boolean empvist = true;
        ok = Funcoes.verificaPermissoes(cbxEmpVistAcessar, acessar, telaEmpVistoria, usuario, peDAO);
        if (!ok == true) {
            empvist = false;
        }
        ok = Funcoes.verificaPermissoes(cbxEmpVistEditar, editar, telaEmpVistoria, usuario, peDAO);
        if (!ok == true) {
            empvist = false;
        }
        ok = Funcoes.verificaPermissoes(cbxEmpVistSalvar, salvar, telaEmpVistoria, usuario, peDAO);
        if (!ok == true) {
            empvist = false;
        }
        ok = Funcoes.verificaPermissoes(cbxEmpVistExcluir, excluir, telaEmpVistoria, usuario, peDAO);
        if (!ok == true) {
            empvist = false;
        }
        ok = Funcoes.verificaPermissoes(cbxEmpVistBuscar, buscar, telaEmpVistoria, usuario, peDAO);
        if (!ok == true) {
            empvist = false;
        }
        ok = Funcoes.verificaPermissoes(cbxEmpVistLimparBusca, limparBusca, telaEmpVistoria, usuario, peDAO);
        if (!ok == true) {
            empvist = false;
        }
        ok = Funcoes.verificaPermissoes(cbxEmpVistListar, listar, telaEmpVistoria, usuario, peDAO);
        if (!ok == true) {
            empvist = false;
        }
        ok = Funcoes.verificaPermissoes(cbxEmpVistProcCid, procurar, telaEmpVistoria, usuario, peDAO);
        if (!ok == true) {
            empvist = false;
        }

        //proprietario
        boolean prop = true;

        ok = Funcoes.verificaPermissoes(cbxProprietarioAcessar, acessar, telaProprietario, usuario, peDAO);
        if (!ok == true) {
            prop = false;
        }
        ok = Funcoes.verificaPermissoes(cbxProprietarioEditar, editar, telaProprietario, usuario, peDAO);
        if (!ok == true) {
            prop = false;
        }
        ok = Funcoes.verificaPermissoes(cbxProprietarioSalvar, salvar, telaProprietario, usuario, peDAO);
        if (!ok == true) {
            prop = false;
        }
        ok = Funcoes.verificaPermissoes(cbxProprietarioExcluir, excluir, telaProprietario, usuario, peDAO);
        if (!ok == true) {
            prop = false;
        }
        ok = Funcoes.verificaPermissoes(cbxProprietarioBuscar, buscar, telaProprietario, usuario, peDAO);
        if (!ok == true) {
            prop = false;
        }
        ok = Funcoes.verificaPermissoes(cbxProprietarioLimparBusca, limparBusca, telaProprietario, usuario, peDAO);
        if (!ok == true) {
            prop = false;
        }
        ok = Funcoes.verificaPermissoes(cbxProprietarioListar, listar, telaProprietario, usuario, peDAO);
        if (!ok == true) {
            prop = false;
        }
        ok = Funcoes.verificaPermissoes(cbxProprietarioProcCid, procurar, telaProprietario, usuario, peDAO);
        if (!ok == true) {
            prop = false;
        }

        //veiculo info
        boolean veicinf = true;

        ok = Funcoes.verificaPermissoes(cbxProcurarVersao, procurar, telaVeiculoInfos, usuario, peDAO);
        if (!ok == true) {
            veicinf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVeiculoAcessar, acessar, telaVeiculoInfos, usuario, peDAO);
        if (!ok == true) {
            veicinf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVeiculoCmbSituacao, comboSituacao, telaVeiculoInfos, usuario, peDAO);
        if (!ok == true) {
            veicinf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVeiculoCmbCorExt, comboCorExt, telaVeiculoInfos, usuario, peDAO);
        if (!ok == true) {
            veicinf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVeiculoCmbCorInt, comboCorInt, telaVeiculoInfos, usuario, peDAO);
        if (!ok == true) {
            veicinf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVeiculoCmbCambio, comboCambio, telaVeiculoInfos, usuario, peDAO);
        if (!ok == true) {
            veicinf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVeiculoCmbAcabInt, comboAcabInt, telaVeiculoInfos, usuario, peDAO);
        if (!ok == true) {
            veicinf = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVeiculoSalvar, salvar, telaVeiculoInfos, usuario, peDAO);
        if (!ok == true) {
            veicinf = false;
        }

        //veiculo conf
        boolean veicconf = true;
        ok = Funcoes.verificaPermissoes(cbxVeiculoListarConf, listar, telaVeiculoConf, usuario, peDAO);
        if (!ok == true) {
            veicconf = false;
        }

        //veiculo esti
        boolean veicesti = true;
        ok = Funcoes.verificaPermissoes(cbxVeiculoListarEsti, listar, telaVeiculoEsti, usuario, peDAO);
        if (!ok == true) {
            veicesti = false;
        }

        //veiculo extr
        boolean veicextr = true;
        ok = Funcoes.verificaPermissoes(cbxVeiculoListarExtr, listar, telaVeiculoExtr, usuario, peDAO);
        if (!ok == true) {
            veicextr = false;
        }

        //veiculo segu
        boolean veicsegu = true;
        ok = Funcoes.verificaPermissoes(cbxVeiculoListarSegu, listar, telaVeiculoSegu, usuario, peDAO);
        if (!ok == true) {
            veicsegu = false;
        }

        //veiculo tecn
        boolean veictecn = true;
        ok = Funcoes.verificaPermissoes(cbxVeiculoListarTecn, listar, telaVeiculoTecn, usuario, peDAO);
        if (!ok == true) {
            veictecn = false;
        }

        //veiculo listar
        boolean veiclist = true;

        ok = Funcoes.verificaPermissoes(cbxVecListCmbSit, comboSituacao, telaVeiculoList, usuario, peDAO);
        if (!ok == true) {
            veiclist = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVecListCmbMar, comboMarca, telaVeiculoList, usuario, peDAO);
        if (!ok == true) {
            veiclist = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVecListBuscar, buscar, telaVeiculoList, usuario, peDAO);
        if (!ok == true) {
            veiclist = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVecListLimparBusca, limparBusca, telaVeiculoList, usuario, peDAO);
        if (!ok == true) {
            veiclist = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVecListEditar, editar, telaVeiculoList, usuario, peDAO);
        if (!ok == true) {
            veiclist = false;
        }
        ok = Funcoes.verificaPermissoes(cbxVecListExcluir, excluir, telaVeiculoList, usuario, peDAO);
        if (!ok == true) {
            veiclist = false;
        }
        ok = Funcoes.verificaPermissoes(cbxListarVeiculos, listar, telaVeiculoList, usuario, peDAO);
        if (!ok == true) {
            veiclist = false;
        }
        

        return veicsegu && veictecn && veicextr && veicesti && veicconf && veicinf && marca && modelo && user && versao && gacab && gcamb
                && veiclist && gcarr && gcomb && gconf && gcore && gcori && gesti && gextr && gsegu && gtecn && gcid && gest
                && gperf && cliente && empvist && prop;
    }

    private void sucesso() {
        Mensagem.informacao("Permissões aplicadas com sucesso!", this);
    }

    private void erro() {
        Mensagem.informacao("Ocorreu um erro ao aplicar as permissões!", this);
    }

    private void preencheChk() {
        ArrayList<JPanel> paineis = new ArrayList();
        paineis.add(pnlMarca);
        paineis.add(pnlModelo);
        paineis.add(pnlUsuario);
        paineis.add(pnlVersao);
        paineis.add(pnlGeral);
        paineis.add(pnlAcabInterno);
        paineis.add(pnlCambios);
        paineis.add(pnlCarrocerias);
        paineis.add(pnlCombustiveis);
        paineis.add(pnlConfortos);
        paineis.add(pnlCoresExt);
        paineis.add(pnlCoresInt);
        paineis.add(pnlEstilos);
        paineis.add(pnlExtras);
        paineis.add(pnlSegurancas);
        paineis.add(pnlTecnologias);
        paineis.add(pnlCidades);
        paineis.add(pnlEstados);
        paineis.add(pnlPerfis);
        paineis.add(pnlCliente);
        paineis.add(pnlEmpVistoria);
        paineis.add(pnlInfosVeic);
        paineis.add(pnlInfosVeic);
        paineis.add(pnlVecConfortos);
        paineis.add(pnlVecEstilos);
        paineis.add(pnlVecExtras);
        paineis.add(pnlVecSegurancas);
        paineis.add(pnlVecTecnologias);
        paineis.add(pnlListar);
        paineis.add(pnlProprietario);
        paineis.add(pnlVeiculo);

        for (int i = 0; i < paineis.size(); i++) {
            Component c[] = paineis.get(i).getComponents();
            for (int j = 0; j < c.length; j++) {
                if (c[j] instanceof JCheckBox) {
                    JCheckBox ckb = (JCheckBox) c[j];
                    checks.add(ckb);
                }
            }
        }
    }

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Carregando carregando = new Carregando(null, true, "Aguarde...", "Aplicando permissões");

        carregando.setLocationRelativeTo(this);
        new Thread(new Runnable() {
            @Override
            public void run() {
                carregando.setVisible(true);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Boolean ok = true;
                ok = atualizaPerms();
                if (ok) {
                    carregando.dispose();
                    sucesso();
                } else {
                    erro();
                }
            }
        }).start();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnMarcarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarTodosActionPerformed
        preencheChk();
        for (int i = 0; i < checks.size(); i++) {
            checks.get(i).setSelected(true);
        }
    }//GEN-LAST:event_btnMarcarTodosActionPerformed

    private void btnDesmarcarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesmarcarTodosActionPerformed
        preencheChk();
        for (int i = 0; i < checks.size(); i++) {
            checks.get(i).setSelected(false);
        }
    }//GEN-LAST:event_btnDesmarcarTodosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPermissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPermissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPermissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPermissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaPermissao dialog = new TelaPermissao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Painel;
    private javax.swing.JButton btnDesmarcarTodos;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnMarcarTodos;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox cbxClienteAcessar;
    private javax.swing.JCheckBox cbxClienteBuscar;
    private javax.swing.JCheckBox cbxClienteEditar;
    private javax.swing.JCheckBox cbxClienteExcluir;
    private javax.swing.JCheckBox cbxClienteLimparBusca;
    private javax.swing.JCheckBox cbxClienteListar;
    private javax.swing.JCheckBox cbxClienteProcCid;
    private javax.swing.JCheckBox cbxClienteSalvar;
    private javax.swing.JCheckBox cbxEmpVistAcessar;
    private javax.swing.JCheckBox cbxEmpVistBuscar;
    private javax.swing.JCheckBox cbxEmpVistEditar;
    private javax.swing.JCheckBox cbxEmpVistExcluir;
    private javax.swing.JCheckBox cbxEmpVistLimparBusca;
    private javax.swing.JCheckBox cbxEmpVistListar;
    private javax.swing.JCheckBox cbxEmpVistProcCid;
    private javax.swing.JCheckBox cbxEmpVistSalvar;
    private javax.swing.JCheckBox cbxGeralAcessarAcab;
    private javax.swing.JCheckBox cbxGeralBuscarAcab;
    private javax.swing.JCheckBox cbxGeralBuscarCamb;
    private javax.swing.JCheckBox cbxGeralBuscarCarr;
    private javax.swing.JCheckBox cbxGeralBuscarCid;
    private javax.swing.JCheckBox cbxGeralBuscarComb;
    private javax.swing.JCheckBox cbxGeralBuscarConft;
    private javax.swing.JCheckBox cbxGeralBuscarCorEx;
    private javax.swing.JCheckBox cbxGeralBuscarCorInt;
    private javax.swing.JCheckBox cbxGeralBuscarEst;
    private javax.swing.JCheckBox cbxGeralBuscarEsta;
    private javax.swing.JCheckBox cbxGeralBuscarExt;
    private javax.swing.JCheckBox cbxGeralBuscarPerf;
    private javax.swing.JCheckBox cbxGeralBuscarSeg;
    private javax.swing.JCheckBox cbxGeralBuscarTec;
    private javax.swing.JCheckBox cbxGeralComboCid;
    private javax.swing.JCheckBox cbxGeralEditarAcab;
    private javax.swing.JCheckBox cbxGeralEditarCamb;
    private javax.swing.JCheckBox cbxGeralEditarCarr;
    private javax.swing.JCheckBox cbxGeralEditarCid;
    private javax.swing.JCheckBox cbxGeralEditarComb;
    private javax.swing.JCheckBox cbxGeralEditarConft;
    private javax.swing.JCheckBox cbxGeralEditarCorEx;
    private javax.swing.JCheckBox cbxGeralEditarCorInt;
    private javax.swing.JCheckBox cbxGeralEditarEst;
    private javax.swing.JCheckBox cbxGeralEditarEsta;
    private javax.swing.JCheckBox cbxGeralEditarExt;
    private javax.swing.JCheckBox cbxGeralEditarPerf;
    private javax.swing.JCheckBox cbxGeralEditarSeg;
    private javax.swing.JCheckBox cbxGeralEditarTec;
    private javax.swing.JCheckBox cbxGeralExcluirAcab;
    private javax.swing.JCheckBox cbxGeralExcluirCamb;
    private javax.swing.JCheckBox cbxGeralExcluirCarr;
    private javax.swing.JCheckBox cbxGeralExcluirCid;
    private javax.swing.JCheckBox cbxGeralExcluirComb;
    private javax.swing.JCheckBox cbxGeralExcluirConft;
    private javax.swing.JCheckBox cbxGeralExcluirCorEx;
    private javax.swing.JCheckBox cbxGeralExcluirCorInt;
    private javax.swing.JCheckBox cbxGeralExcluirEst;
    private javax.swing.JCheckBox cbxGeralExcluirEsta;
    private javax.swing.JCheckBox cbxGeralExcluirExt;
    private javax.swing.JCheckBox cbxGeralExcluirPerf;
    private javax.swing.JCheckBox cbxGeralExcluirSeg;
    private javax.swing.JCheckBox cbxGeralExcluirTec;
    private javax.swing.JCheckBox cbxGeralLimparBuscaAcab;
    private javax.swing.JCheckBox cbxGeralLimparBuscaCamb;
    private javax.swing.JCheckBox cbxGeralLimparBuscaCarr;
    private javax.swing.JCheckBox cbxGeralLimparBuscaCid;
    private javax.swing.JCheckBox cbxGeralLimparBuscaComb;
    private javax.swing.JCheckBox cbxGeralLimparBuscaConft;
    private javax.swing.JCheckBox cbxGeralLimparBuscaCorEx;
    private javax.swing.JCheckBox cbxGeralLimparBuscaCorInt;
    private javax.swing.JCheckBox cbxGeralLimparBuscaEst;
    private javax.swing.JCheckBox cbxGeralLimparBuscaEsta;
    private javax.swing.JCheckBox cbxGeralLimparBuscaExt;
    private javax.swing.JCheckBox cbxGeralLimparBuscaPerf;
    private javax.swing.JCheckBox cbxGeralLimparBuscaSeg;
    private javax.swing.JCheckBox cbxGeralLimparBuscaTec;
    private javax.swing.JCheckBox cbxGeralListarAcab;
    private javax.swing.JCheckBox cbxGeralListarCamb;
    private javax.swing.JCheckBox cbxGeralListarCarr;
    private javax.swing.JCheckBox cbxGeralListarCid;
    private javax.swing.JCheckBox cbxGeralListarComb;
    private javax.swing.JCheckBox cbxGeralListarConft;
    private javax.swing.JCheckBox cbxGeralListarCorEx;
    private javax.swing.JCheckBox cbxGeralListarCorInt;
    private javax.swing.JCheckBox cbxGeralListarEst;
    private javax.swing.JCheckBox cbxGeralListarEsta;
    private javax.swing.JCheckBox cbxGeralListarExt;
    private javax.swing.JCheckBox cbxGeralListarPerf;
    private javax.swing.JCheckBox cbxGeralListarSeg;
    private javax.swing.JCheckBox cbxGeralListarTec;
    private javax.swing.JCheckBox cbxGeralSalvarAcab;
    private javax.swing.JCheckBox cbxGeralSalvarCamb;
    private javax.swing.JCheckBox cbxGeralSalvarCarr;
    private javax.swing.JCheckBox cbxGeralSalvarCid;
    private javax.swing.JCheckBox cbxGeralSalvarComb;
    private javax.swing.JCheckBox cbxGeralSalvarConft;
    private javax.swing.JCheckBox cbxGeralSalvarCorEx;
    private javax.swing.JCheckBox cbxGeralSalvarCorInt;
    private javax.swing.JCheckBox cbxGeralSalvarEst;
    private javax.swing.JCheckBox cbxGeralSalvarEsta;
    private javax.swing.JCheckBox cbxGeralSalvarExt;
    private javax.swing.JCheckBox cbxGeralSalvarPerf;
    private javax.swing.JCheckBox cbxGeralSalvarSeg;
    private javax.swing.JCheckBox cbxGeralSalvarTec;
    private javax.swing.JCheckBox cbxListarVeiculos;
    private javax.swing.JCheckBox cbxMarcaAcessar;
    private javax.swing.JCheckBox cbxMarcaBuscar;
    private javax.swing.JCheckBox cbxMarcaEditar;
    private javax.swing.JCheckBox cbxMarcaExcluir;
    private javax.swing.JCheckBox cbxMarcaLimparBusca;
    private javax.swing.JCheckBox cbxMarcaListar;
    private javax.swing.JCheckBox cbxMarcaSalvar;
    private javax.swing.JCheckBox cbxModeloAcessar;
    private javax.swing.JCheckBox cbxModeloBuscar;
    private javax.swing.JCheckBox cbxModeloComboCarroceria;
    private javax.swing.JCheckBox cbxModeloComboMarcaCadastro;
    private javax.swing.JCheckBox cbxModeloComboMarcaListar;
    private javax.swing.JCheckBox cbxModeloComboProcedencia;
    private javax.swing.JCheckBox cbxModeloEditar;
    private javax.swing.JCheckBox cbxModeloExcluir;
    private javax.swing.JCheckBox cbxModeloLimparBusca;
    private javax.swing.JCheckBox cbxModeloListar;
    private javax.swing.JCheckBox cbxModeloSalvar;
    private javax.swing.JCheckBox cbxProcurarVersao;
    private javax.swing.JCheckBox cbxProprietarioAcessar;
    private javax.swing.JCheckBox cbxProprietarioBuscar;
    private javax.swing.JCheckBox cbxProprietarioEditar;
    private javax.swing.JCheckBox cbxProprietarioExcluir;
    private javax.swing.JCheckBox cbxProprietarioLimparBusca;
    private javax.swing.JCheckBox cbxProprietarioListar;
    private javax.swing.JCheckBox cbxProprietarioProcCid;
    private javax.swing.JCheckBox cbxProprietarioSalvar;
    private javax.swing.JCheckBox cbxUsuarioAcessar;
    private javax.swing.JCheckBox cbxUsuarioBuscar;
    private javax.swing.JCheckBox cbxUsuarioComboCadastro;
    private javax.swing.JCheckBox cbxUsuarioComboListar;
    private javax.swing.JCheckBox cbxUsuarioEditar;
    private javax.swing.JCheckBox cbxUsuarioExcluir;
    private javax.swing.JCheckBox cbxUsuarioLimparBusca;
    private javax.swing.JCheckBox cbxUsuarioListar;
    private javax.swing.JCheckBox cbxUsuarioPermissao;
    private javax.swing.JCheckBox cbxUsuarioSalvar;
    private javax.swing.JCheckBox cbxVecListBuscar;
    private javax.swing.JCheckBox cbxVecListCmbMar;
    private javax.swing.JCheckBox cbxVecListCmbSit;
    private javax.swing.JCheckBox cbxVecListEditar;
    private javax.swing.JCheckBox cbxVecListExcluir;
    private javax.swing.JCheckBox cbxVecListLimparBusca;
    private javax.swing.JCheckBox cbxVeiculoAcessar;
    private javax.swing.JCheckBox cbxVeiculoCmbAcabInt;
    private javax.swing.JCheckBox cbxVeiculoCmbCambio;
    private javax.swing.JCheckBox cbxVeiculoCmbCorExt;
    private javax.swing.JCheckBox cbxVeiculoCmbCorInt;
    private javax.swing.JCheckBox cbxVeiculoCmbSituacao;
    private javax.swing.JCheckBox cbxVeiculoListarConf;
    private javax.swing.JCheckBox cbxVeiculoListarEsti;
    private javax.swing.JCheckBox cbxVeiculoListarExtr;
    private javax.swing.JCheckBox cbxVeiculoListarSegu;
    private javax.swing.JCheckBox cbxVeiculoListarTecn;
    private javax.swing.JCheckBox cbxVeiculoSalvar;
    private javax.swing.JCheckBox cbxVersaoAcessar;
    private javax.swing.JCheckBox cbxVersaoBuscar;
    private javax.swing.JCheckBox cbxVersaoComboCombCadastro;
    private javax.swing.JCheckBox cbxVersaoComboMarcaListar;
    private javax.swing.JCheckBox cbxVersaoEditar;
    private javax.swing.JCheckBox cbxVersaoExcluir;
    private javax.swing.JCheckBox cbxVersaoLimparBusca;
    private javax.swing.JCheckBox cbxVersaoListar;
    private javax.swing.JCheckBox cbxVersaoProcurarModelo;
    private javax.swing.JCheckBox cbxVersaoSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JPanel pnlAcabInterno;
    private javax.swing.JPanel pnlCambios;
    private javax.swing.JPanel pnlCarrocerias;
    private javax.swing.JPanel pnlCidades;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlCombustiveis;
    private javax.swing.JPanel pnlConfortos;
    private javax.swing.JPanel pnlCoresExt;
    private javax.swing.JPanel pnlCoresInt;
    private javax.swing.JPanel pnlEmpVistoria;
    private javax.swing.JPanel pnlEstados;
    private javax.swing.JPanel pnlEstilos;
    private javax.swing.JPanel pnlExtras;
    private javax.swing.JPanel pnlGeral;
    private javax.swing.JPanel pnlInfosVeic;
    private javax.swing.JPanel pnlListar;
    private javax.swing.JPanel pnlMarca;
    private javax.swing.JPanel pnlModelo;
    private javax.swing.JPanel pnlPerfis;
    private javax.swing.JPanel pnlProprietario;
    private javax.swing.JPanel pnlSegurancas;
    private javax.swing.JPanel pnlTecnologias;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JPanel pnlVecConfortos;
    private javax.swing.JPanel pnlVecEstilos;
    private javax.swing.JPanel pnlVecExtras;
    private javax.swing.JPanel pnlVecSegurancas;
    private javax.swing.JPanel pnlVecTecnologias;
    private javax.swing.JPanel pnlVeiculo;
    private javax.swing.JPanel pnlVersao;
    // End of variables declaration//GEN-END:variables
}
