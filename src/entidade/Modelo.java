package entidade;

import java.util.Calendar;
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
@Table(name = "modelos")

public class Modelo {

    @Id
    @SequenceGenerator(name = "MODELO_SEQ", sequenceName = "seq_modelos", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "MODELO_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id", nullable = false)
    private int id;

    @JoinColumn(name = "marca_id")
    @ManyToOne
    private Marca marca_id;

    @JoinColumn(name = "procedencia_id")
    @ManyToOne
    private Procedencia procedencia_id;

    @JoinColumn(name = "carroceria_id")
    @ManyToOne
    private Carroceria carroceria_id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "slug", length = 200, nullable = false)
    private String slug;

    @Column(name = "comprimento")
    private double comprimento;

    @Column(name = "altura")
    private double altura;

    @Column(name = "largura")
    private double largura;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public Modelo() {
    }

    public Modelo(Modelo modelo) {
        this.id = modelo.id;
        this.marca_id = modelo.marca_id;
        this.procedencia_id = modelo.procedencia_id;
        this.carroceria_id = modelo.carroceria_id;
        this.nome = modelo.nome;
        this.slug = modelo.slug;
        this.comprimento = modelo.comprimento;
        this.altura = modelo.altura;
        this.largura = modelo.largura;
        this.criadoEm = modelo.criadoEm;
        this.alteradoEm = modelo.alteradoEm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Marca getMarca_id() {
        return marca_id;
    }

    public void setMarca_id(Marca marca_id) {
        this.marca_id = marca_id;
    }

    public Procedencia getProcedencia_id() {
        return procedencia_id;
    }

    public void setProcedencia_id(Procedencia procedencia_id) {
        this.procedencia_id = procedencia_id;
    }

    public Carroceria getCarroceria_id() {
        return carroceria_id;
    }

    public void setCarroceria_id(Carroceria carroceria_id) {
        this.carroceria_id = carroceria_id;
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

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
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
        final Modelo other = (Modelo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
