/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author jdavi
 */
public class Imprimir {

    public static void mostrarReporte(String nom, String apell, String ciud,
            double[] cal, double prom, String workName, String workDirection) {
        String notas = "";
        for (int i = 0; i < cal.length; i++) {
            notas = String.format("%s%s\n", notas, cal[i]);
        }
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Notas: \n%s"
                + "Promedio: %.2f\n"
                + "Nombre de la empresa: %s\n"
                + "Direccion de la empresa: %s\n",
                nom, apell, ciud, notas, prom, workName, workDirection);

    }

}
