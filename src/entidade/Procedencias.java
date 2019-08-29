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
@Table(name = "procedencias")

public class Procedencias implements Serializable
{

    @Id
    @SequenceGenerator(name = "MARCA_SEQ", sequenceName = "seq_marcas", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "MARCA_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id")
    private Long id;

    @Column(name = "nome", length = 200, nullable = false)
    private String nome;

    @Column(name = "slug", length = 200)
    private String slug;

    @Column(name = "criado_em")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public Procedencias()
    {
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSlug()
    {
        return slug;
    }

    public void setSlug(String slug)
    {
        this.slug = slug;
    }

    public Calendar getCriadoEm()
    {
        return criadoEm;
    }

    public void setCriadoEm(Calendar criadoEm)
    {
        this.criadoEm = criadoEm;
    }

    public Calendar getAlteradoEm()
    {
        return alteradoEm;
    }

    public void setAlteradoEm(Calendar alteradoEm)
    {
        this.alteradoEm = alteradoEm;
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Procedencias other = (Procedencias) obj;
        if (!Objects.equals(this.id, other.id))
        {
            return false;
        }
        return true;
    }


}
