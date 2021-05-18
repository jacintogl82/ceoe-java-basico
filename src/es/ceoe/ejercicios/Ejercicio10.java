/**
 * 
 */
package es.ceoe.ejercicios;

/**
* Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
 * @author jgarcia7
 *
 */
public class Ejercicio10 {
	
	public void print100Numbers() {
		String message = "";
		for(int index = 1; index <= 100; index++) {
			message += index;
			if(index != 100) {
				message += ", ";
			}
			
		}
		System.out.println(message);
	}
}
