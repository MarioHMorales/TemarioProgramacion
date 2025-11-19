

package Tema1;

import java.util.Scanner;

/**
 *
 * @author Hinojos Morales, Mario
 * 
 * Escribe un programa en Java que solicite un número entero (sin decimales) y lo analice averiguando lo siguiente:
    si es cero,
    si es positivo,
    si es menor que cien,
    si es par.
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        int numeroEntero;
        
        
        // Variables de salida
        String numeroCero, numeroPositivo, menorCien, numeroPar;


        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("""
                           ----------------------
                           ANALISIS DE UN NUMERO
                           ----------------------
                           """);
        System.out.print("Introduce un numero entero: ");
        numeroEntero = teclado.nextInt();
        System.out.println("");
        
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        //Comprobar si un numero es 0
        numeroCero = (numeroEntero == 0) ? " es cero" : " no es cero";
        
        //Comprobar si un numero es positivo o negativo
        numeroPositivo = (numeroEntero > 0) ? " es positivo" : " no es positivo";
        
        //Comprobar si un numero es mayor o menor que 100
        menorCien = (numeroEntero < 100) ?" es menor que 100": " es mayor que 100";
        
        //Comprobar si un numero es impar o par
        numeroPar = (numeroEntero %2 == 0)? " es par":" es impar";
  
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
        System.out.println("""
                           ----------------------
                           ANALISIS DE UN NUMERO
                           ----------------------
                           """);
        System.out.println("El número " + numeroEntero + numeroCero);
        System.out.println("El número " + numeroEntero + numeroPositivo);
        System.out.println("El número " + numeroEntero + menorCien);
        System.out.println("El número " + numeroEntero + numeroPar);

        
        
        System.out.println ();
	System.out.println ("Fin del programa.");
        
        
    }
    
}

