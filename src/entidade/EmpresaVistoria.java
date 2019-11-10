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
@Table(name = "empresas_vistorias")

public class EmpresaVistoria implements Serializable {

    @Id
    @SequenceGenerator(name = "EMPRESAVISTORIA_SEQ", sequenceName = "seq_empresas_vistorias", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "EMPRESAVISTORIA_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id", nullable = false)
    private int id;

    @JoinColumn(name = "cidade_id")
    @ManyToOne
    private Cidade cidade_id;

    @Column(name = "razao_social", length = 200, nullable = false)
    private String razao_social;

    @Column(name = "nome_fantasia", length = 200, nullable = false)
    private String nome_fantasia;

    @Column(name = "cnpj", length = 50, nullable = false, unique = true)
    private String cnpj;

    @Column(name = "endereco", length = 200, nullable = false)
    private String endereco;

    @Column(name = "telefone", length = 50, nullable = false)
    private String telefone;

    @Column(name = "email", length = 200, nullable = false, unique = true)
    private String email;

    @Column(name = "observacoes", length = 10000)
    private String observacoes;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public EmpresaVistoria() {
    }

    public EmpresaVistoria(EmpresaVistoria empresaVistoria) {
        this.id = empresaVistoria.id;
        this.cidade_id = empresaVistoria.cidade_id;
        this.razao_social = empresaVistoria.razao_social;
        this.nome_fantasia = empresaVistoria.nome_fantasia;
        this.cnpj = empresaVistoria.cnpj;
        this.endereco = empresaVistoria.endereco;
        this.telefone = empresaVistoria.telefone;
        this.email = empresaVistoria.email;
        this.observacoes = empresaVistoria.observacoes;
        this.criadoEm = empresaVistoria.criadoEm;
        this.alteradoEm = empresaVistoria.alteradoEm;
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

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        final EmpresaVistoria other = (EmpresaVistoria) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
