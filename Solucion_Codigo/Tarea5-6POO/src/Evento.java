public class Evento {
    private String nombreEvento;
    private String fechaEvento;
    private String ubicacionEvento;
    private String tipoEvento;
    private String descripcionEvento;
    private boolean usaArmasNuclearesEvento;
    private int bajasPorcentualesEvento;

    public Evento(String nombreEvento, String fechaEvento, String ubicacionEvento, String tipoEvento, String descripcionEvento, boolean usaArmasNuclearesEvento, int bajasPorcentualesEvento) {
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.ubicacionEvento = ubicacionEvento;
        this.tipoEvento = tipoEvento;
        this.descripcionEvento = descripcionEvento;
        this.usaArmasNuclearesEvento = usaArmasNuclearesEvento;
        this.bajasPorcentualesEvento = bajasPorcentualesEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public String getUbicacionEvento() {
        return ubicacionEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public boolean siUsaArmasNucleares() {
        return usaArmasNuclearesEvento;
    }

    public int getBajasPorcentualesEvento() {
        return bajasPorcentualesEvento;
    }
    
    @Override
    public String toString() {
        return "Evento{" + "nombreEvento=" + nombreEvento + ", fechaEvento=" + fechaEvento + ", ubicacionEvento=" + ubicacionEvento + ", tipoEvento=" + tipoEvento + ", descripcionEvento=" + descripcionEvento + ", usaArmasNuclearesEvento=" + usaArmasNuclearesEvento + ", bajasPorcentualesEvento=" + bajasPorcentualesEvento + '}';
    }
}
