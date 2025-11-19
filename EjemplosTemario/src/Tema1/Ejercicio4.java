package Tema1;

import java.util.Scanner;

/**
 *
 * @author Hinojos Morales, Mario
 * 
 * Escribe un programa en Java que solicite la altura y la longitud del lado 
 * (en metros) de una pirámide de base cuadrángular y calcule su volumen en 
 * metros cúbicos.

Después de realizar ese cálculo, muestra a cuántas piscinas olímpicas 
* equivale dicho volumen, teniendo en cuenta que una piscina olímpica tiene 
* 2500 metros cúbicos.
 */

public class Ejercicio4 {
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes
        
        final double piscinaOlimpica = 2500;


        // Variables de entrada
        int alturaPiramide, ladoPiramide;
        
        
        // Variables de salida
        double volumenPiramide;
        int volumenPiscina;
        


        // Variables auxiliares
        int basePiramide;


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("""
                           ------------------------
                           VOLUMEN DE UNA PIRÁMIDE
                           ------------------------
                           """);
        System.out.print("Introduce la altura de la pirámide (metros): ");
        alturaPiramide = teclado.nextInt();
        System.out.print("Introduce la longitud del lado de la base (metros): ");
        ladoPiramide = teclado.nextInt();
        System.out.println();
        
        

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        //Calcular la base de la piramide
        basePiramide = ladoPiramide * ladoPiramide;
        
        //Calcular el volumen de la piramide
        volumenPiramide = (1.0 / 3) * basePiramide * alturaPiramide;
        
        //Calcular a cuantas piscinas olimpicas equivale dicho volumen
        volumenPiscina = (int) (volumenPiramide / piscinaOlimpica) ;
        
        

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
        System.out.println ("""
                            ---------
                            RESULTADO
                            ---------
                            """);
        
        System.out.println("Volumen de la piramide: " + volumenPiramide + " metros cúbicos");
        System.out.println("Equivale aproximadamente a " + volumenPiscina + " piscinas olimpicas");
        
        
        System.out.println ();
	System.out.println ("Fin del programa.");
        
        
    }
    
}

