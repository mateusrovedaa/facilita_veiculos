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
@Table(name = "proprietarios")

public class Proprietario implements Serializable {

    @Id
    @SequenceGenerator(name = "PROPRIETARIO_SEQ", sequenceName = "seq_proprietarios", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "PROPRIETARIO_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id", nullable = false)
    private int id;

    @JoinColumn(name = "cidade_id")
    @ManyToOne
    private Cidade cidade_id;

    @Column(name = "nome", length = 200, nullable = false)
    private String nome;

    @Column(name = "rg", length = 50, nullable = false, unique = true)
    private String rg;

    @Column(name = "cpf", length = 45, nullable = false, unique = true)
    private String cpf;

    @Column(name = "data_nascimento", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_nascimento;

    @Column(name = "endereco", length = 200, nullable = false)
    private String endereco;

    @Column(name = "telefone", length = 50, nullable = false)
    private String telefone;

    @Column(name = "email", length = 200, nullable = false, unique = true)
    private String email;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public Proprietario() {
    }

    public Proprietario(Proprietario proprietario) {
        this.id = proprietario.id;
        this.cidade_id = proprietario.cidade_id;
        this.nome = proprietario.nome;
        this.rg = proprietario.rg;
        this.cpf = proprietario.cpf;
        this.data_nascimento = proprietario.data_nascimento;
        this.endereco = proprietario.endereco;
        this.telefone = proprietario.telefone;
        this.email = proprietario.email;
        this.criadoEm = proprietario.criadoEm;
        this.alteradoEm = proprietario.alteradoEm;
    }

    public Proprietario(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cidade getCidade_id() {
        return cidade_id;
    }

    public void setCidade_id(Cidade cidade_id) {
        this.cidade_id = cidade_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        final Proprietario other = (Proprietario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
