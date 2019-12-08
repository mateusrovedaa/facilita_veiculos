package entidade;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
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
@Table(name = "revisoes")

public class Revisao implements Serializable {

    @Id
    @SequenceGenerator(name = "REVISAO_SEQ", sequenceName = "seq_revisoes", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "REVISAO_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id", nullable = false)
    private int id;

    @JoinColumn(name = "veiculo_id", nullable = false)
    @ManyToOne
    private Veiculo veiculo_id;

    @JoinColumn(name = "empresa_vistoria_id", nullable = false)
    @ManyToOne
    private EmpresaVistoria empresa_vistoria_id;

    @Column(name = "data", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(name = "manutencoes_realizadas", length = 1000000, nullable = false)
    private String manutencoes_realizadas;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public Revisao() {
    }

    public Revisao(Revisao revisao) {
        this.id = revisao.id;
        this.veiculo_id = revisao.veiculo_id;
        this.empresa_vistoria_id = revisao.empresa_vistoria_id;
        this.data = revisao.data;
        this.manutencoes_realizadas = revisao.manutencoes_realizadas;
        this.criadoEm = revisao.criadoEm;
        this.alteradoEm = revisao.alteradoEm;
    }

    public Revisao(int id) {
        this.id = id;
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

    public EmpresaVistoria getEmpresa_vistoria_id() {
        return empresa_vistoria_id;
    }

    public void setEmpresa_vistoria_id(EmpresaVistoria empresa_vistoria_id) {
        this.empresa_vistoria_id = empresa_vistoria_id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getManutencoes_realizadas() {
        return manutencoes_realizadas;
    }

    public void setManutencoes_realizadas(String manutencoes_realizadas) {
        this.manutencoes_realizadas = manutencoes_realizadas;
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
        final Revisao other = (Revisao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
