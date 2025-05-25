package analisisdeconflictos;

public class Conflicto {

    private String nombre;
    private int eventosViolentos;

    public Conflicto(String nom, int eventos) {
        this.nombre = nom;
        this.eventosViolentos = eventos;
    }

    public int getEventosViolentos() {
        return eventosViolentos;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Conflicto: " + nombre + ", Eventos violentos: " + eventosViolentos;
    }
}
