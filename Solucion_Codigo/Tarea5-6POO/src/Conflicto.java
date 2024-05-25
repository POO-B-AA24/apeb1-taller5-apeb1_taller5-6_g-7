import java.util.ArrayList;

public class Conflicto {
    private String nombreConflicto;
    private ArrayList<String> paisesInvolucradosConflicto;
    private String fechaInicioConflicto;
    private String estadoActualConflicto;
    private ArrayList<Evento> eventosConflicto;

    public Conflicto(String nombreConflicto, ArrayList<String> paisesInvolucradosConflicto, String fechaInicioConflicto) {
        this.nombreConflicto = nombreConflicto;
        this.paisesInvolucradosConflicto = paisesInvolucradosConflicto;
        this.fechaInicioConflicto = fechaInicioConflicto;
        this.estadoActualConflicto = "Activo";
        this.eventosConflicto = new ArrayList<>();
    }

    public void agregarEventoConflicto(Evento eventoConflicto) {
        eventosConflicto.add(eventoConflicto);
        actualizarEstadoConflicto();
    }

    private void actualizarEstadoConflicto() {
        int totalPaisesConflicto = paisesInvolucradosConflicto.size();
        ArrayList<String> paisesConBatallasConflicto = new ArrayList<>();
        
        for (Evento eventoConflicto : eventosConflicto) {
            if (eventoConflicto.getTipoEvento().equals("Batalla") && !paisesConBatallasConflicto.contains(eventoConflicto.getUbicacionEvento())) {
                paisesConBatallasConflicto.add(eventoConflicto.getUbicacionEvento());
            }
        }
        
        double porcentajePaisesConBatallasConflicto = (double) paisesConBatallasConflicto.size() / totalPaisesConflicto;
        
        if (porcentajePaisesConBatallasConflicto > 0.5) {
            estadoActualConflicto = "Guerra Mundial";
        } else if (porcentajePaisesConBatallasConflicto >= 0.3) {
            estadoActualConflicto = "Convocar a la ONU a reunión urgente";
        }

        String[] paisesPrimerMundoConflicto = {"EEUU", "Rusia", "Reino Unido", "Francia", "Alemania"};

        boolean batallasNuclearesConflicto = false;
        for (Evento eventoConflicto : eventosConflicto) {
            for (String paisConflicto : paisesPrimerMundoConflicto) {
                if (eventoConflicto.getUbicacionEvento().equals(paisConflicto) && eventoConflicto.siUsaArmasNucleares()) {
                    batallasNuclearesConflicto = true;
                    break;
                }
            }
        }
        
        if (batallasNuclearesConflicto) {
            estadoActualConflicto = "Guerra Mundial";
        }

        for (Evento eventoConflicto : eventosConflicto) {
            if (eventoConflicto.getBajasPorcentualesEvento() >= 50) {
                estadoActualConflicto = "Convocar a la ONU a reunión urgente";
                break;
            }
        }
    }

    public ArrayList<Evento> consultarEventosConflicto() {
        return eventosConflicto;
    }

    public String getNombreConflicto() {
        return nombreConflicto;
    }

    public String getEstadoActualConflicto() {
        return estadoActualConflicto;
    }
    
    @Override
    public String toString() {
        return "Conflicto{" + "nombreConflicto=" + nombreConflicto + ", paisesInvolucradosConflicto=" + paisesInvolucradosConflicto + ", fechaInicioConflicto=" + fechaInicioConflicto + ", estadoActualConflicto=" + estadoActualConflicto + ", eventosConflicto=" + eventosConflicto + '}';
    }
}
