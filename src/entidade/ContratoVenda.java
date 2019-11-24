package entidade;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
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
@Table(name = "contratos_vendas")

public class ContratoVenda implements Serializable {

    @Id
    @SequenceGenerator(name = "CONTRATOVENDA_SEQ", sequenceName = "seq_contratos_vendas", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "CONTRATOVENDA_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id", nullable = false)
    private int id;

    @JoinColumn(name = "situacao_contrato_id")
    @ManyToOne
    private SituacaoContrato situacao_contrato_id;

    @Column(name = "imagem", length = 100)
    private String imagem;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public ContratoVenda() {
    }

    public ContratoVenda(ContratoVenda contratoVenda) {
        this.id = contratoVenda.id;
        this.situacao_contrato_id = contratoVenda.situacao_contrato_id;
        this.imagem = contratoVenda.imagem;
        this.criadoEm = contratoVenda.criadoEm;
        this.alteradoEm = contratoVenda.alteradoEm;
    }

    public ContratoVenda(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SituacaoContrato getSituacao_contrato_id() {
        return situacao_contrato_id;
    }

    public void setSituacao_contrato_id(SituacaoContrato situacao_contrato_id) {
        this.situacao_contrato_id = situacao_contrato_id;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
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
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final ContratoVenda other = (ContratoVenda) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
