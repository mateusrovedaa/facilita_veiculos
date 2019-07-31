package entidade;

public class Compra {

    private int id;
    private int proprietarioId;
    private int veiculoId;
    private String data;
    private double valor;
    private String observacoes;
    private String criadoEm;
    private String alteradoEm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProprietarioId() {
        return proprietarioId;
    }

    public void setProprietarioId(int proprietarioId) {
        this.proprietarioId = proprietarioId;
    }

    public int getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(int veiculoId) {
        this.veiculoId = veiculoId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(String criadoEm) {
        this.criadoEm = criadoEm;
    }

    public String getAlteradoEm() {
        return alteradoEm;
    }

    public void setAlteradoEm(String alteradoEm) {
        this.alteradoEm = alteradoEm;
    }

}
