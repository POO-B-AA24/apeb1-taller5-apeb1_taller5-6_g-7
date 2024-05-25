public class PersonasImplicada {
    public String nombre;
    public int edad;
    public String ocupacion;
    public int tipoImpli; // 1: Testigo, 2: Acusado, 3: Víctima
    public int tiempoCondena;
    public double fianza;

    public PersonasImplicada(String nombre, int edad, String ocupacion, int tipoImpli, int tiempoCondena) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.tipoImpli = tipoImpli;
        this.tiempoCondena = tiempoCondena;
    }

    public void verificarTipoImplicidad(String opc) {
        if (opc.equals("s") && this.tipoImpli == 2) {
            this.tiempoCondena -= 3;
            this.fianza = 6000.98;
        }
    }

    @Override
    public String toString() {
        return "PersonasImplicada{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ocupacion='" + ocupacion + '\'' +
                ", tipoImpli=" + tipoImpli +
                ", tiempoCondena=" + tiempoCondena +
                ", fianza=" + fianza +
                '}';
    }
}
