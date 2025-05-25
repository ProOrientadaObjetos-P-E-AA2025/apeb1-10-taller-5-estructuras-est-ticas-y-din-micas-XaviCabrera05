package analisisdeconflictos;

public class AnalistaPolitico {

    private Conflicto conflicto;

    public void cargarConflicto(Conflicto c) {
        this.conflicto = c;
    }

    public void analizarConflicto() {
        if (conflicto.getEventosViolentos() > 10) {
            System.out.println("El conflicto \"" + conflicto.getNombre() + "\" es delicado y requiere intervencion!");
        } else {
            System.out.println("El conflicto \"" + conflicto.getNombre() + "\" esta bajo control por ahora.");
        }
    }
}
