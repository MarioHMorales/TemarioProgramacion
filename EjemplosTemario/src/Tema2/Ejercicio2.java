package Tema2;

import java.util.Scanner;

/**
 *
 * @author Hinojos Morales, Mario
 *
 * Escribe un programa en Java que calcule el índice de masa corporal (IMC) de
 * una persona e indique el estado en el que se encuentra esa persona en función
 * del valor de IMC.
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        
        
        // Variables de entrada
        double peso, altura;
        
        // Variables de salida
        double imc;
        String mensaje;
        
        
        // Variables auxiliares
        double alturaMetros;
        
        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("""
                           ----------
                           CALCULO DEL ÍNDICE DE MASA CORPORAL (IMC)
                           ----------
                           """);
        System.out.print("Introduce el peso (en kg): ");
        peso = teclado.nextDouble();
        System.out.print("Introduce la altura (en cm): ");
        altura = teclado.nextDouble();
        System.out.println("");
        

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        alturaMetros = altura / 100;
        imc = peso / (alturaMetros * alturaMetros);
        
        if (imc < 16) {
            mensaje= "Necesita ingresar en un hospital.";
        } else if (imc < 17) {
            mensaje= "Tiene infrapeso.";
        } else if (imc < 18) {
            mensaje= "Tiene bajo peso.";
        } else if (imc < 26) {
            mensaje= "Tiene un peso saludable.";
        } else if (imc < 30) {
            mensaje= "Tiene sobrepeso de grado I.";
        } else if (imc < 35) {
            mensaje= "Tiene obesidad de grado II.";
        } else if (imc < 40) {
            mensaje= "Tiene obesidad premórbida o de grado III.";
        } else {
            mensaje= "Tiene obesidad mórbida o de grado IV";
        }
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println("""
                           ----------
                           RESULTADO
                           ----------
                           """);
        System.out.println("Para un peso de " + peso + " y una altura de " + alturaMetros + " metros: ");
        System.out.println(mensaje);

        System.out.println();
        System.out.println("Fin del programa.");

    }

}
