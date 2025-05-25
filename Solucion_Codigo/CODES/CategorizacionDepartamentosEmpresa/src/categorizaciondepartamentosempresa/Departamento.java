package categorizaciondepartamentosempresa;

public class Departamento {

    private String nombre;
    private int empleados;

    public Departamento(String nom, int emp) {
        this.nombre = nom;
        this.empleados = emp;
    }

    public int getEmpleados() {
        return empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Departamento: " + nombre + ", Empleados: " + empleados;
    }
}
