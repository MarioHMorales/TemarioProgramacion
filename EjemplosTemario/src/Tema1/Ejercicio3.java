

package Tema1;

import java.util.Scanner;

/**
 *
 * @author Hinojos Morales, Mario
 * 
 * A nuestro equipo de desarrollo le han propuesto que implemente un 
 * pequeño programa para transformar longitudes medidas en el sistema 
 * internacional a submúltiplos de éstas así como también al sistema 
 * anglosajón.
 */
public class Ejercicio3 {
    
public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes
        final float pulgadas = 39.3701f;
        final float pies = 3.28084f;
        final float yardas = 1.09361f;


        // Variables de entrada
        double metros;
        
        
        // Variables de salida
        double decimetros, centimetros, milimetros;
        double calculoPulgadas, calculoPies, calculoYardas;



        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        
        System.out.print("Introduzca la longitud en metros que desea transformar: ");
        metros = teclado.nextDouble();
        System.out.println();
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        //Pasar metros a decimetros
        decimetros = metros * 10;
        
        //Pasar metros a centimetros
        centimetros = metros * 100;
        
        //Pasar metros a milimetros
        milimetros = metros * 1000;
        
        //Pasar metros a pulgadas
        calculoPulgadas = metros * pulgadas ;
        
        //Pasar metros a pies
        calculoPies = metros * pies;
        
        //Pasar metros a yardas
        calculoYardas = metros * yardas;
        

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
        System.out.println("""
                           ------------------------
                           RESULTADO
                           ------------------------
                           """);
        
        System.out.println("""
                           SISTEMA INTERNACIONAL
                           ----------------------""");
        
        System.out.println("La medida " + metros + " metros son: ");
        System.out.println(decimetros +" decimetros");
        System.out.println(centimetros +" centimetros");
        System.out.println(milimetros +" milimetros\n");


        System.out.println("""
                           SISTEMA ANGLOSAJÓN
                           ----------------------""");
        System.out.println("La medida " + metros + " metros son: ");
        System.out.println(calculoPulgadas + " pulgadas");
        System.out.println(calculoPies + " pies");
        System.out.println(calculoYardas + " yardas");

        
        System.out.println ();
	System.out.println ("Fin del programa.");
        
        
    }
    
}