package entidade;

public class VeiculoSeguranca {

    private int id;
    private int veiculoId;
    private int segurancaId;
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

    public int getSegurancaId() {
        return segurancaId;
    }

    public void setSegurancaId(int segurancaId) {
        this.segurancaId = segurancaId;
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
