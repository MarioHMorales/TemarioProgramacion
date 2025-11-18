

package Tema1;

import java.util.Scanner;

/**
 *
 * @author Hinojos Morales, Mario
 * 
 * Escribe un programa en Java que solicite dos números reales 
 * y lleve a cabo los siguientes cálculos:

    el doble del primer número,
    la mitad del segundo número,
    el cuadrado de la suma de ambos números,
    La décima parte de la suma los cuadrados de ambos números.
    * 
Para ello tendrás que utilizar operadores aritméticos tales como la suma,
el producto o la división. Además, es posible que en algunos casos necesites 
hacer uso de los paréntesis.
 */
public class Ejercicio2 {
    
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        
        double numero1;
        double numero2;
        
        // Variables de salida
        double resultado1, resultado2, resultado3, resultado4;
        
        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("""
                           ---------------------
                           CÁLCULOS ARITMÉTICOS
                           ---------------------
                           """);
        System.out.println("Introduzca dos número reales");
        System.out.print("Introduce el primer número: ");
        numero1 = teclado.nextDouble();
        System.out.print("Introduce el segundo número: ");
        numero2 = teclado.nextDouble();
        System.out.println("");

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // Primer cálculo: doble del primer número
        resultado1= 2.0 * numero1;
        
        // Segundo cálculo: mitad del segundo número
        resultado2= numero2 / 2.0;

        // Tercer cálculo: cuadrado de la suma
        resultado3= (numero1 + numero2) * (numero1 + numero2);
        
        // Cuarto cálculo: décima parte de la suma de los cuadrados
        resultado4= (numero1*numero1 + numero2*numero2) / 10.0;

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
       System.out.println("""
                           ---------------------
                           RESULTADOS
                           ---------------------
                           """);
        System.out.println("Doble del primer número: " + resultado1);
        System.out.println("Mitad del segundo número: " + resultado2);
        System.out.println("Cuadrado de la suma de ambos número: " + resultado3);
        System.out.println("Decima parte de la suma de los cuadrados de ambos números: " + resultado4);
        
        
        System.out.println ();
	System.out.println ("Fin del programa.");
        
        
    }
    
}
        
        
  
        