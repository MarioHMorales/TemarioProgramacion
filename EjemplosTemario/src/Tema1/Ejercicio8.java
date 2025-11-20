package Tema1;


import java.util.Scanner;

/**
 *
 * @author Hinojos Morales, Mario
 * 
 * Para un concurso de TV se solicitan personas cuyo nombre comience y termine por la misma letra, y además sus apellidos tengan la misma cantidad de letras.

Escribe un programa en Java que reciba como entradas el nombre, el primer apellido y el segundo apellido de una persona y muestre por pantalla:

"La persona es APTA para el concurso" si es apta para participar en el concurso.
"La persona es NO APTA para el concurso" si no lo es.
La primera letra del nombre y de los apellidos debe escribirse en mayúscula y el resto en minúscula. No se admiten acentos ni eñes.
 */
public class Ejercicio8 {
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes
        final char DISTANCIA= 'a' - 'A';

        // Variables de entrada
        String nombre, apellido1, apellido2;
        
        // Variables de salida
        String resultado;


        // Variables auxiliares
        boolean nombreApto, apellidosAptos, concursanteApto;
        
        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("CONCURSO DE TV");
        System.out.println("--------------");
        System.out.println();
        System.out.println("Nombre del concursante: ");
        nombre= teclado.nextLine();
        System.out.println("Primer apellido del concursante: ");
        apellido1= teclado.nextLine();
        System.out.println("Segundo apellido del concursante: ");
        apellido2= teclado.nextLine();

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        nombreApto= nombre.charAt(0) + DISTANCIA == nombre.charAt(nombre.length()-1);
        apellidosAptos= apellido1.length() == apellido2.length();
        concursanteApto= nombreApto && apellidosAptos;
        
        resultado= concursanteApto ? "APTA" : "NO APTA";
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------        
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        System.out.println ("La persona es " + resultado + " para el concurso.");
        
        System.out.println ();
        System.out.println ("Fin del programa. Bye!");
    }  

}
