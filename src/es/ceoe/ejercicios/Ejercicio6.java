/**
 * 
 */
package es.ceoe.ejercicios;

/**
 * Eliminar la última palabra de una frase.
 * @author jgarcia7
 *
 */
public class Ejercicio6 {

	private String phrase;
	
	public Ejercicio6(String phrase) {
		super();
		this.phrase = phrase;
	}
	
	public void removeLastWord() {
		int indexOfLastSpace = phrase.lastIndexOf(" ");
		String phraseRemovedLastWord = phrase.substring(0, indexOfLastSpace);
		String message = String.format("La frase \"%s\" quedaría \"%s\"", phrase, phraseRemovedLastWord);
		System.out.println(message);
	}
}
