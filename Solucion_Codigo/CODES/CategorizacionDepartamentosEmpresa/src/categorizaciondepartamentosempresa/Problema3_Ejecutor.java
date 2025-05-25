/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package categorizaciondepartamentosempresa;

import java.util.Scanner;

public class Problema3_Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del departamento:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la cantidad de empleados:");
        int empleados = sc.nextInt();

        Departamento depto = new Departamento(nombre, empleados);
        RecursosHumanos rh = new RecursosHumanos();

        rh.registrarDepartamento(depto);
        rh.mostrarResumen();
    }
}
