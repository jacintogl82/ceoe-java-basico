/**
 * 
 */
package es.ceoe;

import es.ceoe.ejercicios.Ejercicio14;
import es.ceoe.utils.UtilidadesTeclado;

/**
 * Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.

 * 
 * @author jgarcia7
 *
 */
public class AplicacionEjercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Introduce un día de la semana");
		String dia = UtilidadesTeclado.readLine();
		Ejercicio14 ejercicio14 = new Ejercicio14();
		ejercicio14.esLaboral(dia);
	}

}
