package entidade;

public class Versao {

    private int id;
    private String nome;
    private String slug;
    private int modeloId;
    private int combustivelId;
    private String anoFabricacao;
    private String anoModelo;
    private double peso;
    private int numeroAssentos;
    private int numeroPortas;
    private double consumoCidade;
    private double consumoEstrada;
    private String motor;
    private String cavalosPotencia;
    private String cavalosPotenciaRpm;
    private String torque;
    private String torqueRpm;
    private String observacoes;
    private String criadoEm;
    private String alteradoEm;

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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getModeloId() {
        return modeloId;
    }

    public void setModeloId(int modeloId) {
        this.modeloId = modeloId;
    }

    public int getCombustivelId() {
        return combustivelId;
    }

    public void setCombustivelId(int combustivelId) {
        this.combustivelId = combustivelId;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNumeroAssentos() {
        return numeroAssentos;
    }

    public void setNumeroAssentos(int numeroAssentos) {
        this.numeroAssentos = numeroAssentos;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public double getConsumoCidade() {
        return consumoCidade;
    }

    public void setConsumoCidade(double consumoCidade) {
        this.consumoCidade = consumoCidade;
    }

    public double getConsumoEstrada() {
        return consumoEstrada;
    }

    public void setConsumoEstrada(double consumoEstrada) {
        this.consumoEstrada = consumoEstrada;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCavalosPotencia() {
        return cavalosPotencia;
    }

    public void setCavalosPotencia(String cavalosPotencia) {
        this.cavalosPotencia = cavalosPotencia;
    }

    public String getCavalosPotenciaRpm() {
        return cavalosPotenciaRpm;
    }

    public void setCavalosPotenciaRpm(String cavalosPotenciaRpm) {
        this.cavalosPotenciaRpm = cavalosPotenciaRpm;
    }

    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }

    public String getTorqueRpm() {
        return torqueRpm;
    }

    public void setTorqueRpm(String torqueRpm) {
        this.torqueRpm = torqueRpm;
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
