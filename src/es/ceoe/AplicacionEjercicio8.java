/**
 * 
 */
package es.ceoe;

import es.ceoe.ejercicios.Ejercicio8;
import es.ceoe.utils.UtilidadesTeclado;

/**
 * Pide por teclado el nombre, edad y salario y muestra el salario.
      <br/>Si es menor de 16 no tiene edad para trabajar
	  <br/>Entre 19 y 50 a�os el salario es un 5 por ciento m�s
	  <br/>Entre 51 y 60 a�os el salario es un 10 por ciento m�s
	  <br/>Si es mayor de 60 el salario es un 15 por ciento m�s

 * 
 * @author jgarcia7
 *
 */
public class AplicacionEjercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Escriba el n�mero del que deseas calcular el factorial");
		int number = Integer.valueOf(UtilidadesTeclado.readLine());
		
		Ejercicio8 ejercicio8 = new Ejercicio8();
		ejercicio8.calculateFactorial(number);
	}

}
