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
@Table(name = "veiculos_tecnologias")

public class VeiculoTecnologia implements Serializable {

    @Id
    @SequenceGenerator(name = "VEICULOTECNOLOGIA_SEQ", sequenceName = "seq_veiculos_tecnologias", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "VEICULOTECNOLOGIA_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id", nullable = false)
    private int id;

    @JoinColumn(name = "veiculo_id")
    @ManyToOne
    private Veiculo veiculo_id;

    @JoinColumn(name = "tecnologia_id")
    @ManyToOne
    private Tecnologia tecnologia_id;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public VeiculoTecnologia() {
    }

    public VeiculoTecnologia(VeiculoTecnologia veiculoTecnologia) {
        this.id = veiculoTecnologia.id;
        this.veiculo_id = veiculoTecnologia.veiculo_id;
        this.tecnologia_id = veiculoTecnologia.tecnologia_id;
        this.criadoEm = veiculoTecnologia.criadoEm;
        this.alteradoEm = veiculoTecnologia.alteradoEm;
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

    public Tecnologia getTecnologia_id() {
        return tecnologia_id;
    }

    public void setTecnologia_id(Tecnologia tecnologia_id) {
        this.tecnologia_id = tecnologia_id;
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
        final VeiculoTecnologia other = (VeiculoTecnologia) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
