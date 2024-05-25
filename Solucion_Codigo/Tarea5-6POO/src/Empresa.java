public class Empresa {
    public String nombre;
    public int ruc;
    public String dirreccion;
    public Departamento departamento[];

    public Empresa(String nombre, int ruc, String dirreccion, Departamento[] departamento) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.dirreccion = dirreccion;
        this.departamento = departamento;
    }
    
    public void determinarCategoria(){
        for (int i = 0; i < departamento.length; i++) {
            if(departamento[i].numEmpleados > 20 && departamento[i].prodAnual > 1000000){
                departamento[i].categoria = "A";
            } else if(departamento[i].numEmpleados > 10 && departamento[i].prodAnual > 500000){
                departamento[i].categoria = "B";
            } else {
                departamento[i].categoria = "C";
            }
        }
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", ruc=" + ruc + ", dirreccion=" + dirreccion + ", departamento=" + departamento + '}';
    }
    
}
