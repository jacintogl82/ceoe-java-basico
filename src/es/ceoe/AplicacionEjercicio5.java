/**
 * 
 */
package es.ceoe;

import es.ceoe.ejercicios.Ejercicio5;
import es.ceoe.utils.UtilidadesTeclado;

/**
 * Aplicacion de consola de comandos
 * 
 * @author jgarcia7
 *
 */
public class AplicacionEjercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String word1 = "";
		String word2;
		do {
			System.out.println("Introduce la primera palabra");
			word1 = UtilidadesTeclado.readLine();
			System.out.println("Introduce la segunda palabra");
			word2 = UtilidadesTeclado.readLine();
			Ejercicio5 ejercicio5 = new Ejercicio5(word1, word2);
			ejercicio5.wordsAreEquals();
		} while(!word1.equals("exit"));
	}

}
