/**
 * 
 */
package es.ceoe.ejercicios;

/**
 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
 * @author jgarcia7
 *
 */
public class Ejercicio2 {

	private int numero1;
	private int numero2;
	
	public Ejercicio2(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public void checkStatus() {
		String resultado = "";
		if(numero1 == numero2) {
			resultado = String.format("Los números %s y %s son iguales", numero1, numero2);
		} else if(numero1 < numero2) {
			resultado = String.format("%s es mayor que %s", numero2, numero1);
		} else {
			resultado = String.format("%s es mayor que %s", numero1, numero2);
		}
		System.out.println(resultado);
	}
}
