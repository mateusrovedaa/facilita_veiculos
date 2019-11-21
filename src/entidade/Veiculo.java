package entidade;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "veiculos")

public class Veiculo implements Serializable {

    @Id
    @SequenceGenerator(name = "VEICULO_SEQ", sequenceName = "seq_veiculos", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "VEICULO_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id", nullable = false)
    private int id;

    @JoinColumn(name = "versao_id")
    @ManyToOne
    private Versao versao_id;

    @JoinColumn(name = "cambio_id")
    @ManyToOne
    private Cambio cambio_id;

    @JoinColumn(name = "cor_interna_id")
    @ManyToOne
    private CorInterna cor_interna_id;

    @JoinColumn(name = "cor_externa_id")
    @ManyToOne
    private CorExterna cor_externa_id;

    @JoinColumn(name = "acabamento_interno_id")
    @ManyToOne
    private AcabamentoInterno acabamento_interno_id;

    @JoinColumn(name = "situacao_veiculo_id")
    @ManyToOne
    private SituacaoVeiculo situacao_veiculo_id;

    @Column(name = "quilometragem", length = 100, nullable = false)
    private String quilometragem;

    @Column(name = "placa", length = 100, nullable = false)
    private String placa;

    @Column(name = "chassi", length = 100, nullable = false)
    private String chassi;

    @Column(name = "numero_proprietarios")
    private int numero_proprietarios;

    @Column(name = "renavam", length = 100, nullable = false)
    private String renavam;

    @Column(name = "numero_ocorrencias")
    private int numero_ocorrencias;

    @Column(name = "chave_reserva")
    private boolean chave_reserva;

    @Column(name = "manual_veiculo")
    private boolean manual_veiculo;

    @Column(name = "blindado")
    private boolean blindado;

    @Column(name = "ipva_pago")
    private boolean ipva_pago;

    @Column(name = "vistoriado")
    private boolean vistoriado;

    @Column(name = "garantia", length = 100)
    private String garantia;

    @Column(name = "exibir_site")
    private boolean exibir_site;

    @Column(name = "valor", nullable = false)
    private double valor;

    @Column(name = "informacoes_veiculo", length = 100000)
    private String informacoes_veiculo;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public Veiculo() {
    }

    public Veiculo(Veiculo veiculo) {
        this.id = veiculo.id;
        this.versao_id = veiculo.versao_id;
        this.cambio_id = veiculo.cambio_id;
        this.cor_interna_id = veiculo.cor_interna_id;
        this.cor_externa_id = veiculo.cor_externa_id;
        this.acabamento_interno_id = veiculo.acabamento_interno_id;
        this.situacao_veiculo_id = veiculo.situacao_veiculo_id;
        this.quilometragem = veiculo.quilometragem;
        this.placa = veiculo.placa;
        this.chassi = veiculo.chassi;
        this.numero_proprietarios = veiculo.numero_proprietarios;
        this.renavam = veiculo.renavam;
        this.numero_ocorrencias = veiculo.numero_ocorrencias;
        this.chave_reserva = veiculo.chave_reserva;
        this.manual_veiculo = veiculo.manual_veiculo;
        this.blindado = veiculo.blindado;
        this.ipva_pago = veiculo.ipva_pago;
        this.vistoriado = veiculo.vistoriado;
        this.garantia = veiculo.garantia;
        this.exibir_site = veiculo.exibir_site;
        this.valor = veiculo.valor;
        this.informacoes_veiculo = veiculo.informacoes_veiculo;
        this.criadoEm = veiculo.criadoEm;
        this.alteradoEm = veiculo.alteradoEm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Versao getVersao_id() {
        return versao_id;
    }

    public void setVersao_id(Versao versao_id) {
        this.versao_id = versao_id;
    }

    public Cambio getCambio_id() {
        return cambio_id;
    }

    public void setCambio_id(Cambio cambio_id) {
        this.cambio_id = cambio_id;
    }

    public CorInterna getCor_interna_id() {
        return cor_interna_id;
    }

    public void setCor_interna_id(CorInterna cor_interna_id) {
        this.cor_interna_id = cor_interna_id;
    }

    public CorExterna getCor_externa_id() {
        return cor_externa_id;
    }

    public void setCor_externa_id(CorExterna cor_externa_id) {
        this.cor_externa_id = cor_externa_id;
    }

    public AcabamentoInterno getAcabamento_interno_id() {
        return acabamento_interno_id;
    }

    public void setAcabamento_interno_id(AcabamentoInterno acabamento_interno_id) {
        this.acabamento_interno_id = acabamento_interno_id;
    }

    public SituacaoVeiculo getSituacao_veiculo_id() {
        return situacao_veiculo_id;
    }

    public void setSituacao_veiculo_id(SituacaoVeiculo situacao_veiculo_id) {
        this.situacao_veiculo_id = situacao_veiculo_id;
    }

    public String getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(String quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getNumero_proprietarios() {
        return numero_proprietarios;
    }

    public void setNumero_proprietarios(int numero_proprietarios) {
        this.numero_proprietarios = numero_proprietarios;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public int getNumero_ocorrencias() {
        return numero_ocorrencias;
    }

    public void setNumero_ocorrencias(int numero_ocorrencias) {
        this.numero_ocorrencias = numero_ocorrencias;
    }

    public boolean isChave_reserva() {
        return chave_reserva;
    }

    public void setChave_reserva(boolean chave_reserva) {
        this.chave_reserva = chave_reserva;
    }

    public boolean isManual_veiculo() {
        return manual_veiculo;
    }

    public void setManual_veiculo(boolean manual_veiculo) {
        this.manual_veiculo = manual_veiculo;
    }

    public boolean isBlindado() {
        return blindado;
    }

    public void setBlindado(boolean blindado) {
        this.blindado = blindado;
    }

    public boolean isIpva_pago() {
        return ipva_pago;
    }

    public void setIpva_pago(boolean ipva_pago) {
        this.ipva_pago = ipva_pago;
    }

    public boolean isVistoriado() {
        return vistoriado;
    }

    public void setVistoriado(boolean vistoriado) {
        this.vistoriado = vistoriado;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public boolean isExibir_site() {
        return exibir_site;
    }

    public void setExibir_site(boolean exibir_site) {
        this.exibir_site = exibir_site;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getInformacoes_veiculo() {
        return informacoes_veiculo;
    }

    public void setInformacoes_veiculo(String informacoes_veiculo) {
        this.informacoes_veiculo = informacoes_veiculo;
    }

    public Calendar getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Calendar criadoEm) {
        this.criadoEm = criadoEm;
    }

    public Calendar getAlteradoEm() {
        return alteradoEm;
    }

    public void setAlteradoEm(Calendar alteradoEm) {
        this.alteradoEm = alteradoEm;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
