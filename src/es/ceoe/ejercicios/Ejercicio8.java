/**
 * 
 */
package es.ceoe.ejercicios;

/**
* Leer un número N y calcular el factorial de los números desde 0 hasta N.
 * @author jgarcia7
 *
 */
public class Ejercicio8 {
	
	public void calculateFactorial(int number) {
		long factorial = number;
		for(int index = number - 1; index > 1; index--) {
			factorial *= index;
		}
		String message = String.format("El factorial de %s es %s", number, factorial);
		System.out.println(message);
	}
}
