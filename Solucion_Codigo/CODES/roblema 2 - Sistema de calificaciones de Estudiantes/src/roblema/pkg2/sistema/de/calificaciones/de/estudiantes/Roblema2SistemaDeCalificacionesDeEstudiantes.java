
package roblema.pkg2.sistema.de.calificaciones.de.estudiantes;
import java.util.Scanner;

public class Roblema2SistemaDeCalificacionesDeEstudiantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.println("Ingrese la materia:");
        String materia = sc.nextLine();

        System.out.println("Ingrese nota ACD:");
        double acd = sc.nextDouble();

        System.out.println("Ingrese nota APE:");
        double ape = sc.nextDouble();

        System.out.println("Ingrese nota AA:");
        double aa = sc.nextDouble();

        Estudiante est = new Estudiante(nombre, edad);
        Materia mat = new Materia(materia, acd, ape, aa);

        est.asignarMateria(mat);
        est.verificarAprobacion();
    }
}