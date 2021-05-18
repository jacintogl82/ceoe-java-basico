/**
 * 
 */
package es.ceoe.ejercicios;

/**
* Muestra los n�meros del 1 al 100 (ambos incluidos). Usa un bucle while.
 * @author jgarcia7
 *
 */
public class Ejercicio9 {
	
	public void print100Numbers() {
		String message = "";
		
		int currentNumber = 1;
		while(currentNumber <= 100) {
			message += currentNumber;
			if(currentNumber != 100) {
				message += ", ";
			}
			currentNumber++;
		}
		
		System.out.println(message);
	}
}
