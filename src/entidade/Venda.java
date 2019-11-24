package entidade;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vendas")

public class Venda implements Serializable {

    @Id
    @SequenceGenerator(name = "VENDA_SEQ", sequenceName = "seq_vendas", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "VENDA_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id", nullable = false)
    private int id;

    @JoinColumn(name = "veiculo_id", nullable = false)
    @ManyToOne
    private Veiculo veiculo_id;

    @JoinColumn(name = "parcela_id", nullable = false)
    @ManyToOne
    private Parcela parcela_id;

    @JoinColumn(name = "tipo_pagamento_id", nullable = false)
    @ManyToOne
    private TipoPagamento tipo_pagamento_id;

    @JoinColumn(name = "cliente_id", nullable = false)
    @ManyToOne
    private Cliente cliente_id;

    @JoinColumn(name = "usuario_id", nullable = false)
    @ManyToOne
    private Usuario usuario_id;

    @JoinColumn(name = "contrato_venda_id", nullable = false)
    @ManyToOne
    private ContratoVenda contrato_venda_id;

    @JoinColumn(name = "situacao_venda_id", nullable = false)
    @ManyToOne
    private SituacaoVenda situacao_venda_id;

    @Column(name = "data", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @Column(name = "valor_total", nullable = false)
    private double valor_total;

    @Column(name = "valor_entrada", nullable = false)
    private double valor_entrada;

    @Column(name = "juros", nullable = false)
    private int juros;

    @Column(name = "observacoes", length = 1000000)
    private String observacoes;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public Venda() {
    }

    public Venda(Venda venda) {
        this.id = venda.id;
        this.veiculo_id = venda.veiculo_id;
        this.parcela_id = venda.parcela_id;
        this.tipo_pagamento_id = venda.tipo_pagamento_id;
        this.cliente_id = venda.cliente_id;
        this.usuario_id = venda.usuario_id;
        this.contrato_venda_id = venda.contrato_venda_id;
        this.situacao_venda_id = venda.situacao_venda_id;
        this.data = venda.data;
        this.valor_total = venda.valor_total;
        this.valor_entrada = venda.valor_entrada;
        this.juros = venda.juros;
        this.observacoes = venda.observacoes;
        this.criadoEm = venda.criadoEm;
        this.alteradoEm = venda.alteradoEm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Veiculo getVeiculo_id() {
        return veiculo_id;
    }

    public void setVeiculo_id(Veiculo veiculo_id) {
        this.veiculo_id = veiculo_id;
    }

    public Parcela getParcela_id() {
        return parcela_id;
    }

    public void setParcela_id(Parcela parcela_id) {
        this.parcela_id = parcela_id;
    }

    public TipoPagamento getTipo_pagamento_id() {
        return tipo_pagamento_id;
    }

    public void setTipo_pagamento_id(TipoPagamento tipo_pagamento_id) {
        this.tipo_pagamento_id = tipo_pagamento_id;
    }

    public Cliente getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Cliente cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }

    public ContratoVenda getContrato_venda_id() {
        return contrato_venda_id;
    }

    public void setContrato_venda_id(ContratoVenda contrato_venda_id) {
        this.contrato_venda_id = contrato_venda_id;
    }

    public SituacaoVenda getSituacao_venda_id() {
        return situacao_venda_id;
    }

    public void setSituacao_venda_id(SituacaoVenda situacao_venda_id) {
        this.situacao_venda_id = situacao_venda_id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public double getValor_entrada() {
        return valor_entrada;
    }

    public void setValor_entrada(double valor_entrada) {
        this.valor_entrada = valor_entrada;
    }

    public int getJuros() {
        return juros;
    }

    public void setJuros(int juros) {
        this.juros = juros;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
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
        final Venda other = (Venda) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
