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
@Table(name = "propostas")

public class Proposta implements Serializable {

    @Id
    @SequenceGenerator(name = "PROPOSTA_SEQ", sequenceName = "seq_propostas", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "PROPOSTA_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id", nullable = false)
    private int id;

    @JoinColumn(name = "veiculo_id", nullable = false)
    @ManyToOne
    private Veiculo veiculo_id;

    @JoinColumn(name = "cliente_id", nullable = false)
    @ManyToOne
    private Cliente cliente_id;

    @JoinColumn(name = "situacao_proposta_id", nullable = false)
    @ManyToOne
    private SituacaoProposta situacao_proposta_id;

    @Column(name = "valor_proposta", nullable = false)
    private double valor_proposta;

    @Column(name = "observacoes", length = 1000000)
    private String observacoes;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public Proposta() {
    }

    public Proposta(Proposta proposta) {
        this.id = proposta.id;
        this.veiculo_id = proposta.veiculo_id;
        this.cliente_id = proposta.cliente_id;
        this.situacao_proposta_id = proposta.situacao_proposta_id;
        this.valor_proposta = proposta.valor_proposta;
        this.observacoes = proposta.observacoes;
        this.criadoEm = proposta.criadoEm;
        this.alteradoEm = proposta.alteradoEm;
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

    public Cliente getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Cliente cliente_id) {
        this.cliente_id = cliente_id;
    }

    public SituacaoProposta getSituacao_proposta_id() {
        return situacao_proposta_id;
    }

    public void setSituacao_proposta_id(SituacaoProposta situacao_proposta_id) {
        this.situacao_proposta_id = situacao_proposta_id;
    }

    public double getValor_proposta() {
        return valor_proposta;
    }

    public void setValor_proposta(double valor_proposta) {
        this.valor_proposta = valor_proposta;
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
        final Proposta other = (Proposta) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
