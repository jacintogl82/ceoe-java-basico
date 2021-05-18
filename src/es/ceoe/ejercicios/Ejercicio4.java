/**
 * 
 */
package es.ceoe.ejercicios;

/**
 * Contar el número de palabras de una frase.
 * @author jgarcia7
 *
 */
public class Ejercicio4 {

	private String phrase;
	
	public Ejercicio4(String phrase) {
		super();
		this.phrase = phrase;
	}
	
	public void countWords() {
		String[] words = phrase.split(" ");
		int numberOfWords = words.length;
		String message = String.format("La frase \"%s\" contiene %s palabras", phrase, numberOfWords);
		System.out.println(message);
	}
}
