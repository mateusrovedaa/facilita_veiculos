package entidade;

public class Modelo {

    private int id;
    private int marcaId;
    private int procedenciaId;
    private int carroceriaId;
    private String nome;
    private String slug;
    private double comprimento;
    private double altura;
    private double largura;
    private String criadoEm;
    private String alteradoEm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(int marcaId) {
        this.marcaId = marcaId;
    }

    public int getProcedenciaId() {
        return procedenciaId;
    }

    public void setProcedenciaId(int procedenciaId) {
        this.procedenciaId = procedenciaId;
    }

    public int getCarroceriaId() {
        return carroceriaId;
    }

    public void setCarroceriaId(int carroceriaId) {
        this.carroceriaId = carroceriaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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
