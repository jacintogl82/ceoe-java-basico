/**
 * 
 */
package es.ceoe.ejercicios;

/**
 * Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.

 * @author jgarcia7
 *
 */
public class Ejercicio3 {

	private String name;
	
	public Ejercicio3(String name) {
		super();
		this.name = name;
	}
	
	public void printWelcome() {
		String message = String.format("Bienvenido %s", name);
		System.out.println(message);
	}
}
