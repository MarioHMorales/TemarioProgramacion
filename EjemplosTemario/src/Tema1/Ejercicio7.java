package Tema1;

import java.util.Scanner;

/**
 *
 * @author Hinojos Morales, Mario
 *
 * Una factoría papelera confecciona cuadernos en los que se van alternando
 * hojas de color rojo, verde y azul. Siempre se comienza por el color rojo,
 * siguiéndole el verde, luego el azul y comenzando nuevamente con el rojo.
 *
 * Por ejemplo, si un cuaderno está compuesto por 100 hojas, 34 serían de color
 * rojo, 33 de color verde y 33 de color azul.
 *
 * Sin embargo, si el cuaderno tuviera 200 hojas, 67 serían de color rojo, 67 de
 * color verde y 66 de color azul.
 *
 * Por otro lado, si el cuaderno tuviera 201 hojas, 67 serían rojas, 67 verdes y
 * 67 azules.
 *
 * Escribe un programa en Java que solicite por teclado el número de hojas del
 * cuaderno y calcule y muestre por pantalla la cantidad de hojas que contiene
 * de cada color.
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        int hojasTotales;

        // Variables de salida
        int hojasRojas, hojasVerdes, hojasAzules;

        // Variables auxiliares
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("CUADERNOS DE COLORES");
        System.out.println("--------------------");
        System.out.println(" ");

        System.out.print("Introduce la cantidad de hojas del cuaderno: ");
        hojasTotales = teclado.nextInt();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        hojasRojas = hojasTotales / 3 + (hojasTotales % 3 > 0 ? 1 : 0);
        hojasVerdes = hojasTotales / 3 + (hojasTotales % 3 > 1 ? 1 : 0);
        hojasAzules = hojasTotales / 3;

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------       
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("Cantidad total de hojas del cuaderno: " + hojasTotales);
        System.out.println("Cantidad de hojas rojas: " + hojasRojas);
        System.out.println("Cantidad de hojas verdes: " + hojasVerdes);
        System.out.println("Cantidad de hojas azules: " + hojasAzules);

        System.out.println();
        System.out.println("Fin del programa. Bye!");

    }
}
