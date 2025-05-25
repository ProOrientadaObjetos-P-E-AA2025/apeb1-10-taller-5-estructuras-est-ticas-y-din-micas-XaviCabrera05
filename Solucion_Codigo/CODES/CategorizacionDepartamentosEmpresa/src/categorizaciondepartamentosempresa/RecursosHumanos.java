
package categorizaciondepartamentosempresa;
public class RecursosHumanos {
    private Departamento departamento;

    public void registrarDepartamento(Departamento depto) {
        this.departamento = depto;
    }

    public void mostrarResumen() {
        if (departamento.getEmpleados() > 20) {
            System.out.println("El depto " + departamento.getNombre() + " tiene buen stok de personal.");
        } else {
            System.out.println("El depto " + departamento.getNombre() + " necesita mas personal.");
        }
    }
}
