package entidade;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cores_externas")

public class CorExterna implements Serializable {

    @Id
    @SequenceGenerator(name = "COREXTERNA_SEQ", sequenceName = "seq_cores_externas", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "COREXTERNA_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id")
    private int id;

    @Column(name = "nome", length = 200, nullable = false)
    private String nome;

    @Column(name = "slug", length = 200, nullable = false)
    private String slug;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public CorExterna() {
    }

    public CorExterna(CorExterna corExterna) {
        this.id = corExterna.id;
        this.nome = corExterna.nome;
        this.slug = corExterna.slug;
        this.criadoEm = corExterna.criadoEm;
        this.alteradoEm = corExterna.alteradoEm;
    }

    public CorExterna(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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
        final CorExterna other = (CorExterna) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
