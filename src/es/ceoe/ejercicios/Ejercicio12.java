/**
 * 
 */
package es.ceoe.ejercicios;

/**
* Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 * @author jgarcia7
 *
 */
public class Ejercicio12 {
	
	private final int IVA = 21;
	
	public void calculaPrecioFinal(double precio) {
		double precioFinal = precio + (precio * IVA / 100);
		String message = String.format("El precio final es %s", precioFinal);
		System.out.println(message);
	}
}
