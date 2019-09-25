package entidade;

import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    @OneToOne(cascade = CascadeType.ALL)
    private Marca marca;

    @JoinColumn(name = "procedencia_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Procedencia procedencia;

    @JoinColumn(name = "carroceria_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Carroceria carroceria;

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
        this.marca = modelo.marca;
        this.procedencia = modelo.procedencia;
        this.carroceria = modelo.carroceria;
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

    public Marca getMarcaId() {
        return marca;
    }

    public void setMarcaId(Marca marca) {
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(Procedencia procedencia) {
        this.procedencia = procedencia;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
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
