/**
 * 
 */
package es.ceoe;

import es.ceoe.ejercicios.Ejercicio12;
import es.ceoe.utils.UtilidadesTeclado;

/**
 * Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.

 * 
 * @author jgarcia7
 *
 */
public class AplicacionEjercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Introduzca el precio del producto\n");
		double precio = Double.valueOf(UtilidadesTeclado.readLine());
		Ejercicio12 ejercicio12 = new Ejercicio12();
		ejercicio12.calculaPrecioFinal(precio);
	}

}
