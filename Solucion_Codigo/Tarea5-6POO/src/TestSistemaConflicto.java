
import java.util.ArrayList;


public class TestSistemaConflicto {
    public static void main(String[] args) {
        ArrayList<String> paisesInvolucrados = new ArrayList<>();
        paisesInvolucrados.add("Pais1");
        paisesInvolucrados.add("Pais2");
        Conflicto conflicto = new Conflicto("Conflicto A", paisesInvolucrados, "2023-01-13");
        Evento evento1 = new Evento("Evento 1", "2023-03-09", "Pais1", "Batalla", "Descripción de la batalla", true, 30);
        Evento evento2 = new Evento("Evento 2", "2023-07-04", "Pais2", "Batalla", "Descripción de la batalla", true, 20);
        conflicto.agregarEventoConflicto(evento1);
        conflicto.agregarEventoConflicto(evento2);
        System.out.println("Nombre del conflicto: " + conflicto.getNombreConflicto());
        System.out.println("Estado actual del conflicto: " + conflicto.getEstadoActualConflicto());
        for (Evento evento : conflicto.consultarEventosConflicto()) {
            System.out.println("Evento: " + evento.getNombreEvento() + ", Tipo: " + evento.getTipoEvento() + ", Fecha: " + evento.getFechaEvento());
        }
    }
}
