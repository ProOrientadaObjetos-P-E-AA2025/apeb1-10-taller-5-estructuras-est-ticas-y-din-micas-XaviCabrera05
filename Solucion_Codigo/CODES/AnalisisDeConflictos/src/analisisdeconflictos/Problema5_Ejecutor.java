package analisisdeconflictos;

import java.util.Scanner;

public class Problema5_Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del conflicto:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la cantidad de eventos violentos:");
        int eventos = sc.nextInt();

        Conflicto conflicto = new Conflicto(nombre, eventos);
        AnalistaPolitico analista = new AnalistaPolitico();

        analista.cargarConflicto(conflicto);
        analista.analizarConflicto();
    }
}
