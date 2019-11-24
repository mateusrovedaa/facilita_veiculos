package entidade;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
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
@Table(name = "vendas_veiculos")

public class VendaVeiculo implements Serializable {

    @Id
    @SequenceGenerator(name = "VENDAVEICULO_SEQ", sequenceName = "seq_vendas_veiculos", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "VENDAVEICULO_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "id", nullable = false)
    private int id;

    @JoinColumn(name = "venda_id", nullable = false)
    @ManyToOne
    private Venda venda_id;

    @Column(name = "data_vencimento", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_vencimento;

    @Column(name = "valor_parcela", nullable = false)
    private double valor_parcela;

    @Column(name = "status", nullable = false)
    private boolean status;

    @Column(name = "criado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar criadoEm;

    @Column(name = "alterado_em", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar alteradoEm;

    public VendaVeiculo() {
    }

    public VendaVeiculo(VendaVeiculo vendaVeiculo) {
        this.id = vendaVeiculo.id;
        this.venda_id = vendaVeiculo.venda_id;
        this.data_vencimento = vendaVeiculo.data_vencimento;
        this.valor_parcela = vendaVeiculo.valor_parcela;
        this.status = vendaVeiculo.status;
        this.criadoEm = vendaVeiculo.criadoEm;
        this.alteradoEm = vendaVeiculo.alteradoEm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Venda getVenda_id() {
        return venda_id;
    }

    public void setVenda_id(Venda venda_id) {
        this.venda_id = venda_id;
    }

    public Date getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(Date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public double getValor_parcela() {
        return valor_parcela;
    }

    public void setValor_parcela(double valor_parcela) {
        this.valor_parcela = valor_parcela;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
        final VendaVeiculo other = (VendaVeiculo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
