
package problema.nro2_calificaciones_estu;

import java.util.Scanner;

public class Test_Calificaciones_Estu {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        // Solicitar datos del estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = tc.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante = tc.nextInt();
        tc.nextLine(); // Limpiar el buffer
        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante);

        // Solicitar datos de la materia
        System.out.print("Ingrese el nombre de la materia: ");
        String nombreMateria = tc.nextLine();
        System.out.print("Ingrese la calificación de ACD (3.5/10): ");
        double acd = tc.nextDouble();
        System.out.print("Ingrese la calificación de APE (3.5/10): ");
        double ape = tc.nextDouble();
        System.out.print("Ingrese la calificación de AA (3/10): ");
        double aa = tc.nextDouble();

        // Crear la materia y agregarla al estudiante
        Materia materia = new Materia(nombreMateria, acd, ape, aa);
        estudiante.agregarMateria(materia);

        // Verificar si el estudiante ha aprobado la materia
        String resultado = estudiante.verificarAprobacion(nombreMateria);
        System.out.println(resultado);

        tc.close();
    }
}
}
