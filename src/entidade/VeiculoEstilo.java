package entidade;

public class VeiculoEstilo {

    private int id;
    private int veiculoId;
    private int estiloId;
    private String criadoEm;
    private String alteradoEm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(int veiculoId) {
        this.veiculoId = veiculoId;
    }

    public int getEstiloId() {
        return estiloId;
    }

    public void setEstiloId(int estiloId) {
        this.estiloId = estiloId;
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
