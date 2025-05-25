
package roblema.pkg2.sistema.de.calificaciones.de.estudiantes;

public class Estudiante {
    private String nombre;
    private int edad;
    private Materia materia;

    public Estudiante(String nom, int edad) {
        this.nombre = nom;
        this.edad = edad;
    }

    public void asignarMateria(Materia mat) {
        this.materia = mat;
    }

    public void verificarAprobacion() {
        double notaFinal = materia.calcularNotaFinal();
        if (notaFinal >= 7.0) {
            System.out.println(nombre + " aprobo la materia!");
        } else {
            System.out.println(nombre + " tiene que dar examen de recuperacion :(");
        }
    }
}
