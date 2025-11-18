

package Tema1;

import javax.swing.plaf.basic.BasicButtonListener;

/**
 *
 * @author Hinojos Morales, Mario
 * 
 * Escribe un pequeño programa en Java que defina un enumerado con los 
 * nombres de los palos de la baraja española: OROS, COPAS, BASTOS, ESPADAS, 
 * para posteriormente mostrar por pantalla cada valor del enumerado declarado.
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
    
        enum palosBaraja{OROS,COPAS,BASTOS,SOTA};
        
        System.out.println("""
                           ----------------------
                           PALOS BARAJA ESPAÑOLA
                           ----------------------
                           """); 
        System.out.println("Palo 1: " + palosBaraja.OROS);
        System.out.println("Palo 2: " + palosBaraja.COPAS);
        System.out.println("Palo 3: " + palosBaraja.BASTOS);
        System.out.println("Palo 4: " + palosBaraja.SOTA);

    }

}
