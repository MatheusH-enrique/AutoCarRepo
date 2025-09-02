public class ClasseAutomotores {
    // Atributos
    private String corAt;
    private String marcaAt;
    private String modeloAt;
    private String tipoAt;

    // Construtor vazio
    public ClasseAutomotores() {
        this.corAt = "";
        this.marcaAt = "";
        this.modeloAt = "";
        this.tipoAt = "";
    }

    // Construtor com parâmetros
    public ClasseAutomotores(String corAt, String marcaAt, String modeloAt, String tipoAt) {
        this.corAt = corAt;
        this.marcaAt = marcaAt;
        this.modeloAt = modeloAt;
        this.tipoAt = tipoAt;
    }

    // Getters e Setters
    public String getCorAt() {
        return corAt;
    }

    public void setCorAt(String corAt) {
        this.corAt = corAt;
    }

    public String getMarcaAt() {
        return marcaAt;
    }

    public void setMarcaAt(String marcaAt) {
        this.marcaAt = marcaAt;
    }

    public String getModeloAt() {
        return modeloAt;
    }

    public void setModeloAt(String modeloAt) {
        this.modeloAt = modeloAt;
    }

    public String getTipoAt() {
        return tipoAt;
    }

    public void setTipoAt(String tipoAt) {
        this.tipoAt = tipoAt;
    }
}
