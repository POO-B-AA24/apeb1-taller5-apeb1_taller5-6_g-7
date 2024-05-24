package problema.nro2_calificaciones_estu;

public class Materia {
    private String nombre;
    private double acd;
    private double ape;
    private double aa;

    public Materia(String nombre, double acd, double ape, double aa) {
        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public String getNombre() {
        return nombre;
    }

    public String verificarAprobacion() {
        double totalAcumulado = acd + ape + aa;
        if (totalAcumulado >= 7.0) {
            return "Aprobado con una calificación total de " + totalAcumulado + "/10.";
        } else {
            double notaRequerida = (3.5 - totalAcumulado * 0.6);
            return String.format("No aprobado. Necesita un examen de recuperación con una calificación mínima de %.2f/3.5.", notaRequerida);
        }
    }
}

