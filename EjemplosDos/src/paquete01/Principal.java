/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete02.DatoTrabajo;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete06.Imprimir;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String nombreEmpresa;
        String direccionEmpresa;

        double[] misNotas;
        double promedio;

        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        nombreEmpresa = DatoTrabajo.obtenerNombreEmpresa();
        direccionEmpresa = DatoTrabajo.obtenerDireccionEmpresa();
        Imprimir.mostrarReporte(nombre, apellidoRetornado, ciudad, misNotas,
                promedio, nombreEmpresa, direccionEmpresa);

    }

}
/*
Generar una solucion que permita obtener los datos (ingresados por teclado)
de un usuario (estudiante) mediante la importacion de paquetes en el metodo 
principal del paquete01. Estos paquetes importaran clases que 
tambien importaran metodos, todos estos creados por el desarrollador. El
programa debe presentar un reporte, utilizando variables que
seran valores retornados de cada funcion invocada exclusivamente en el main.
Ejemplo:

Los datos ingresados son:
Nombre: Mateo
Apellido: Guachizaca
Ciudad: Loja
Promedio: 9.67

En donde: 
- nombre y apelldio deben ser valores retornados por una funcion de una
clase llamada DatoPersonal.
- ciudad deber ser un valor retornado por una funcion de una clase llamada 
DatoUbicacion.
- las notas del estudiante deben ser valores ingresados por teclado en una 
funcion de una clase llamada DatoAcademico que debera recibir
como argumentos un total de 4 calificaciones y almacenarlas en un arreglo
unidimensional.
- promedio debera ser un valor retornado por una funcion de una clase llamada
DatoFinal que debera recibir el arreglo unidmensional como argumento para 
asi poder obtener el promedio.
 */
