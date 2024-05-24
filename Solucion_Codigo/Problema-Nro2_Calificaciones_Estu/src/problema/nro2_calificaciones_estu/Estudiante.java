package problema.nro2_calificaciones_estu;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private int edad;
    private List<Materia> materias;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = new ArrayList<>();
    }

    public void agregarMateria(Materia materia) {
        this.materias.add(materia);
    }

    public String verificarAprobacion(String nombreMateria) {
        for (Materia materia : materias) {
            if (materia.getNombre().equals(nombreMateria)) {
                return materia.verificarAprobacion();
            }
        }
        return "Materia " + nombreMateria + " no encontrada.";
    }
}

