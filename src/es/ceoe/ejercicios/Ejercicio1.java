package es.ceoe.ejercicios;

/**
 * Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
 * 
 * @author jgarcia7
 *
 */
public class Ejercicio1 {

	private int operador1;
	private int operador2;
	
	public Ejercicio1(int operador1, int operador2) {
		super();
		this.operador1 = operador1;
		this.operador2 = operador2;
	}
	
	public void print() {
		printSuma();
		printResta();
		printProducto();
		printDivision();
		printModulo();
	}

	private void printSuma() {
		long resultado = operador1 + operador2;
		String print = String.format("La suma de %s y %s es: %s", operador1, operador2, resultado);
		System.out.println(print);
	}
	
	private void printResta() {
		long resultado = operador1 - operador2;
		String print = String.format("La resta de %s y %s es: %s", operador1, operador2, resultado);
		System.out.println(print);
	}
	
	private void printDivision() {
		double resultado = operador1 / operador2;
		String print = String.format("La división de %s y %s es: %s", operador1, operador2, resultado);
		System.out.println(print);
	}
	
	private void printProducto() {
		long resultado = operador1 * operador2;
		String print = String.format("El producto de %s y %s es: %s", operador1, operador2, resultado);
		System.out.println(print);
	}
	
	private void printModulo() {
		double resultado = operador1 % operador2;
		String print = String.format("El módulo de %s y %s es: %s", operador1, operador2, resultado);
		System.out.println(print);
	}
}
