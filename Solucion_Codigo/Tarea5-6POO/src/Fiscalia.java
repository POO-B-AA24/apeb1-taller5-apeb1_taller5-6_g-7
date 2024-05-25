public class Fiscalia {
    public int estadoCaso;
    public CasoCorrupcion[] casoCorrupcion;

    public Fiscalia(int numCasos) {
        this.casoCorrupcion = new CasoCorrupcion[numCasos];
    }

    public void verificarEstado() {
        for (CasoCorrupcion caso : casoCorrupcion) {
            if (caso != null) {
                if (diasTranscurridos(caso) > 14) {
                    caso.estadoCaso = 3; // Urgente
                } else if (diasTranscurridos(caso) > 7) {
                    caso.estadoCaso = 2; // Alerta
                }
            }
        }
    }

    private int diasTranscurridos(CasoCorrupcion caso) {
        // Método simplificado para calcular días transcurridos desde el inicio del caso
        int currentDay = 15; // Suponer que la fecha actual es 15/5/2024
        int currentMonth = 5;
        int currentYear = 2024;

        int daysInYear = 365;
        int daysInMonth = 30;

        int daysFromStart = (currentYear - caso.year) * daysInYear +
                            (currentMonth - caso.mes) * daysInMonth +
                            (currentDay - caso.dia);
        return daysFromStart;
    }
}
