/**
 * 
 */
package es.ceoe.ejercicios;

/**
* Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
 * @author jgarcia7
 *
 */
public class Ejercicio11 {
	
	public void print100Numbers() {
		String message = "";
		for(int index = 1; index <= 100; index++) {
			if(index % 2 == 0 || index % 3 == 0) {
				message += index;
				if(index != 100) {
					message += ", ";
				}
			}
		}
		System.out.println(message);
	}
}
