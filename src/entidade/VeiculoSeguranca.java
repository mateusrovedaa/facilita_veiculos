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
@Table(name = "veiculos_segurancas")

public class VeiculoSeguranca implements Serializable {

    @Id
    @SequenceGenerator(name = "VEICULOSEGURANCA_SEQ", sequenceName = "seq_veiculos_segurancas", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "VEICULOSEGURANCA_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id", nullable = false)
    private int id;

    @JoinColumn(name = "veiculo_id")
    @ManyToOne
    private Veiculo veiculo_id;

    @JoinColumn(name = "seguranca_id")
    @ManyToOne
    private Seguranca seguranca_id;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public VeiculoSeguranca() {
    }

    public VeiculoSeguranca(VeiculoSeguranca veiculoSeguranca) {
        this.id = veiculoSeguranca.id;
        this.veiculo_id = veiculoSeguranca.veiculo_id;
        this.seguranca_id = veiculoSeguranca.seguranca_id;
        this.criadoEm = veiculoSeguranca.criadoEm;
        this.alteradoEm = veiculoSeguranca.alteradoEm;
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

    public Seguranca getSeguranca_id() {
        return seguranca_id;
    }

    public void setSeguranca_id(Seguranca seguranca_id) {
        this.seguranca_id = seguranca_id;
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
        final VeiculoSeguranca other = (VeiculoSeguranca) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
