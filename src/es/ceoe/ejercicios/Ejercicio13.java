/**
 * 
 */
package es.ceoe.ejercicios;

/**
 * Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas
 * vocales hay en total (recorre el String con charAt)
 * 
 * @author jgarcia7
 *
 */
public class Ejercicio13 {

	private final String phrase = "La lluvia en Sevilla es una maravilla";

	public void cuentaVocales() {
		int vocales = 0;
		for (int index = 0; index < phrase.length(); index++) {
			if(phrase.charAt(index) == 'a' || 
					phrase.charAt(index) == 'e' || 
					phrase.charAt(index) == 'i' || 
					phrase.charAt(index) == 'o' || 
					phrase.charAt(index) == 'u') {
				vocales++;
			}
		}
		String message = String.format("La frase \"%s\" tiene %s vocales", phrase, vocales);
		System.out.println(message);
	}
}
