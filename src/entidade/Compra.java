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
@Table(name = "compras")

public class Compra implements Serializable {

    @Id
    @SequenceGenerator(name = "COMPRA_SEQ", sequenceName = "seq_compras", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "COMPRA_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id", nullable = false)
    private int id;

    @JoinColumn(name = "veiculo_id", nullable = false)
    @ManyToOne
    private Veiculo veiculo_id;

    @JoinColumn(name = "proprietario_id", nullable = false)
    @ManyToOne
    private Proprietario proprietario_id;

    @JoinColumn(name = "situacao_compra_id", nullable = false)
    @ManyToOne
    private SituacaoCompra situacao_compra_id;
    
    @JoinColumn(name = "contrato_compra_id", nullable = false)
    @ManyToOne
    private ContratoCompra contrato_compra_id;

    @Column(name = "data", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @Column(name = "valor", nullable = false)
    private double valor;

    @Column(name = "observacoes", length = 1000000)
    private String observacoes;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public Compra() {
    }

    public Compra(Compra compra) {
        this.id = compra.id;
        this.veiculo_id = compra.veiculo_id;
        this.proprietario_id = compra.proprietario_id;
        this.situacao_compra_id = compra.situacao_compra_id;
        this.contrato_compra_id = compra.contrato_compra_id;
        this.data = compra.data;
        this.valor = compra.valor;
        this.observacoes = compra.observacoes;
        this.criadoEm = compra.criadoEm;
        this.alteradoEm = compra.alteradoEm;
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

    public Proprietario getProprietario_id() {
        return proprietario_id;
    }

    public void setProprietario_id(Proprietario proprietario_id) {
        this.proprietario_id = proprietario_id;
    }

    public SituacaoCompra getSituacao_compra_id() {
        return situacao_compra_id;
    }

    public void setSituacao_compra_id(SituacaoCompra situacao_compra_id) {
        this.situacao_compra_id = situacao_compra_id;
    }

    public ContratoCompra getContrato_compra_id() {
        return contrato_compra_id;
    }

    public void setContrato_compra_id(ContratoCompra contrato_compra_id) {
        this.contrato_compra_id = contrato_compra_id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
        final Compra other = (Compra) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
