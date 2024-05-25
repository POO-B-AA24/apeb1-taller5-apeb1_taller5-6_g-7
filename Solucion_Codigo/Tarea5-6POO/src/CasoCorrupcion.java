public class CasoCorrupcion {
    public String nombreCaso;
    public int dia;
    public int mes;
    public int year;
    public int estadoCaso; // 1: Iniciado, 2: Alerta, 3: Urgente
    public int numPersonasImpli;
    public PersonasImplicada[] personasImpli;

    public CasoCorrupcion(String nombreCaso, int dia, int mes, int year, int estadoCaso, int numPersonasImpli) {
        this.nombreCaso = nombreCaso;
        this.dia = dia;
        this.mes = mes;
        this.year = year;
        this.estadoCaso = estadoCaso;
        this.numPersonasImpli = numPersonasImpli;
        this.personasImpli = new PersonasImplicada[numPersonasImpli];
    }

    public void reduccionPena(){
        for (PersonasImplicada persona : personasImpli) {
            if (persona.tipoImpli == 2) { // Acusado
                persona.tiempoCondena -= 3;
                if (persona.tiempoCondena < 1) {
                    persona.fianza = 6000.98; // Ejemplo de fianza, puede ajustarse según los detalles del caso
                }
            }
        }
    }

    @Override
    public String toString() {
        return "CasoCorrupcion{" + "nombreCaso=" + nombreCaso + ", dia=" + dia + ", mes=" + mes + ", year=" + year + ", estadoCaso=" + estadoCaso + ", numPersonasImpli=" + numPersonasImpli + ", personasImpli=" + personasImpli + '}';
    }

    
    
}
