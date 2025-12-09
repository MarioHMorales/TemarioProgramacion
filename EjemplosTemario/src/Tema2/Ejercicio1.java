package Tema2;

import java.util.Scanner;

/**
 *
 * @author Hinojos Morales, Mario
 * 
 * Escribe un programa en Java que lea dos valores reales a y b 
 * desde teclado e intercambie esos valores de a y b si el contenido
 * de a fuera mayor que el de b. En caso contrario no se llevará 
 * a cabo el intercambio.
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Variables de entrada y de salida
        double a, b;

        // Variables auxiliares
        double auxiliar;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println ("INTERCAMBIO DE VALORES");
        System.out.println ("----------------------");
        System.out.print ("Introduce un valor real para la variable a:");
        a = teclado.nextDouble();
        System.out.print ("Introduce un valor real para la variable b:");
        b = teclado.nextDouble();
        System.out.println ("Inicialmente, los valores de las variables son:");
        System.out.println ("a = " + a + ", b = " + b + ".");


        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Intercambiamos los valores solo si "a" es mayor que "b"
        if (a > b) {
            auxiliar = a;
            a = b;
            b = auxiliar;
        }

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------  
        System.out.println ("Tras el intercambio,  los valores de las variables son: ");
        System.out.println ("a = " + a + ", b = " + b + ".");
    }
}

