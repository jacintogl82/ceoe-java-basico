/**
 * 
 */
package es.ceoe;

import es.ceoe.ejercicios.Ejercicio7;
import es.ceoe.utils.UtilidadesTeclado;

/**
 * Pide por teclado el nombre, edad y salario y muestra el salario.
      <br/>Si es menor de 16 no tiene edad para trabajar
	  <br/>Entre 19 y 50 años el salario es un 5 por ciento más
	  <br/>Entre 51 y 60 años el salario es un 10 por ciento más
	  <br/>Si es mayor de 60 el salario es un 15 por ciento más

 * 
 * @author jgarcia7
 *
 */
public class AplicacionEjercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Escriba el nombre del empleado");
		String nombre = UtilidadesTeclado.readLine();
		System.out.println("Escriba la edad del empleado");
		int edad = Integer.valueOf(UtilidadesTeclado.readLine());
		System.out.println("Escriba el salario del empleado");
		double salario = Double.valueOf(UtilidadesTeclado.readLine());
		
		Ejercicio7 ejercicio7 = new Ejercicio7(nombre, edad, salario);
		ejercicio7.calculateSalary();
	}

}
