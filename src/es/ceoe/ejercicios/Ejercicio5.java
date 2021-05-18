/**
 * 
 */
package es.ceoe.ejercicios;

/**
 * Comprueba si dos palabras son iguales
 * @author jgarcia7
 *
 */
public class Ejercicio5 {

	private String word1;
	private String word2;
	
	public Ejercicio5(String word1, String word2) {
		super();
		this.word1 = word1;
		this.word2 = word2;
	}

	public void wordsAreEquals() {
		boolean equals = word1.equals(word2);
		String message = "";
		if(equals) {
			message = String.format("Las palabras \"%s\" y \"%s\" son iguales", word1, word2);
		} else {
			message = String.format("Las palabras \"%s\" y \"%s\" son distintas", word1, word2);
		}
		System.out.println(message);
	}
}
