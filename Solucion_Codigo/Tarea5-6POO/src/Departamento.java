public class Departamento {
    public String nombre;
    public int numEmpleados;
    public double prodAnual;
    public String categoria;

    public Departamento(String nombre, int numEmpleados, double prodAnual) {
        this.nombre = nombre;
        this.numEmpleados = numEmpleados;
        this.prodAnual = prodAnual;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombre=" + nombre + ", numEmpleados=" + numEmpleados + ", prodAnual=" + prodAnual + ", categoria=" + categoria + '}';
    }
    
}
