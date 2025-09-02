public class ClasseCaminhoes extends ClasseAutomotores {
    private double cargaSuportadaAt;

    // Construtor
    public ClasseCaminhoes(String corAt, String marcaAt, String modeloAt, String tipoAt, double cargaSuportadaAt) {
        super(corAt, marcaAt, modeloAt, tipoAt);
        this.cargaSuportadaAt = cargaSuportadaAt;
    }

    // Getter e Setter para cargaSuportadaAt
    public double getCargaSuportadaAt() {
        return cargaSuportadaAt;
    }

    public void setCargaSuportadaAt(double cargaSuportadaAt) {
        this.cargaSuportadaAt = cargaSuportadaAt;
    }
}
