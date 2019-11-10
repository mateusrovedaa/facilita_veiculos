package entidade;

import java.io.Serializable;
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
@Table(name = "versoes")

public class Versao implements Serializable {

    @Id
    @SequenceGenerator(name = "VERSAO_SEQ", sequenceName = "seq_versoes", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "VERSAO_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "nome", length = 200, nullable = false)
    private String nome;

    @JoinColumn(name = "modelo_id")
    @ManyToOne
    private Modelo modelo_id;

    @JoinColumn(name = "combustivel_id")
    @ManyToOne
    private Combustivel combustivel_id;

    @Column(name = "ano_fabricacao", length = 4, nullable = false)
    private String ano_fabricacao;

    @Column(name = "ano_modelo", length = 4, nullable = false)
    private String ano_modelo;

    @Column(name = "numero_assentos")
    private int numero_assentos;

    @Column(name = "numero_portas")
    private int numero_portas;

    @Column(name = "consumo_cidade", length = 10)
    private double consumo_cidade;

    @Column(name = "consumo_estrada", length = 10)
    private double consumo_estrada;

    @Column(name = "motor", length = 10, nullable = false)
    private String motor;

    @Column(name = "peso", length = 10)
    private double peso;

    @Column(name = "cavalos_potencia", length = 100, nullable = false)
    private String cavalos_potencia;

    @Column(name = "cavalos_potencia_rpm", length = 100)
    private String cavalos_potencia_rpm;

    @Column(name = "torque", length = 100)
    private String torque;

    @Column(name = "torque_rpm", length = 100)
    private String torque_rpm;

    @Column(name = "observacoes", length = 10000)
    private String observacoes;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public Versao() {
    }

    public Versao(Versao versao) {
        this.id = versao.id;
        this.nome = versao.nome;
        this.modelo_id = versao.modelo_id;
        this.combustivel_id = versao.combustivel_id;
        this.ano_fabricacao = versao.ano_fabricacao;
        this.ano_modelo = versao.ano_modelo;
        this.numero_assentos = versao.numero_assentos;
        this.numero_portas = versao.numero_portas;
        this.consumo_cidade = versao.consumo_cidade;
        this.consumo_estrada = versao.consumo_estrada;
        this.motor = versao.motor;
        this.cavalos_potencia = versao.cavalos_potencia;
        this.cavalos_potencia_rpm = versao.cavalos_potencia_rpm;
        this.torque = versao.torque;
        this.torque_rpm = versao.torque_rpm;
        this.observacoes = versao.observacoes;
        this.criadoEm = versao.criadoEm;
        this.alteradoEm = versao.alteradoEm;
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

    public Modelo getModelo_id() {
        return modelo_id;
    }

    public void setModelo_id(Modelo modelo_id) {
        this.modelo_id = modelo_id;
    }

    public Combustivel getCombustivel_id() {
        return combustivel_id;
    }

    public void setCombustivel_id(Combustivel combustivel_id) {
        this.combustivel_id = combustivel_id;
    }

    public String getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(String ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public String getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(String ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public int getNumero_assentos() {
        return numero_assentos;
    }

    public void setNumero_assentos(int numero_assentos) {
        this.numero_assentos = numero_assentos;
    }

    public int getNumero_portas() {
        return numero_portas;
    }

    public void setNumero_portas(int numero_portas) {
        this.numero_portas = numero_portas;
    }

    public double getConsumo_cidade() {
        return consumo_cidade;
    }

    public void setConsumo_cidade(double consumo_cidade) {
        this.consumo_cidade = consumo_cidade;
    }

    public double getConsumo_estrada() {
        return consumo_estrada;
    }

    public void setConsumo_estrada(double consumo_estrada) {
        this.consumo_estrada = consumo_estrada;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCavalos_potencia() {
        return cavalos_potencia;
    }

    public void setCavalos_potencia(String cavalos_potencia) {
        this.cavalos_potencia = cavalos_potencia;
    }

    public String getCavalos_potencia_rpm() {
        return cavalos_potencia_rpm;
    }

    public void setCavalos_potencia_rpm(String cavalos_potencia_rpm) {
        this.cavalos_potencia_rpm = cavalos_potencia_rpm;
    }

    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }

    public String getTorque_rpm() {
        return torque_rpm;
    }

    public void setTorque_rpm(String torque_rpm) {
        this.torque_rpm = torque_rpm;
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
        final Versao other = (Versao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
