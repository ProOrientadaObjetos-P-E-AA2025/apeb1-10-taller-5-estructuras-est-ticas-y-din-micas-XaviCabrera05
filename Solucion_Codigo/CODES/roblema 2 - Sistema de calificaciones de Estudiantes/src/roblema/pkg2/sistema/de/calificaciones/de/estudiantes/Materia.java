
package roblema.pkg2.sistema.de.calificaciones.de.estudiantes;

public class Materia {
    private String nombre;
    private double acd;
    private double ape;
    private double aa;

    public Materia(String nom, double acd, double ape, double aa) {
        this.nombre = nom;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public double calcularNotaFinal() {
        return acd + ape + aa;
    }

    public String toString() {
        return "Materia: " + nombre + ", Nota Final: " + calcularNotaFinal();
    }
}
