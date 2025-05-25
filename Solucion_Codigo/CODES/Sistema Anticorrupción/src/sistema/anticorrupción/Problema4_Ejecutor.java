
package sistema.anticorrupción;
import java.util.Scanner;

public class Problema4_Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del caso de corrupcion:");
        String nombreCaso = sc.nextLine();

        System.out.println("Ingrese la cantidad de personas implicadas:");
        int implicados = sc.nextInt();

        CasoCorrupcion caso = new CasoCorrupcion(nombreCaso, implicados);
        SistemaJusticia sistema = new SistemaJusticia();

        sistema.ingresarCaso(caso);
        sistema.verificarGravedad();
    }
}
