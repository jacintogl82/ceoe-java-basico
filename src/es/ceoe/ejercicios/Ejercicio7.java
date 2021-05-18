/**
 * 
 */
package es.ceoe.ejercicios;

/**
* Pide por teclado el nombre, edad y salario y muestra el salario.
      <br/>Si es menor de 16 no tiene edad para trabajar
	  <br/>Entre 19 y 50 años el salario es un 5 por ciento más
	  <br/>Entre 51 y 60 años el salario es un 10 por ciento más
	  <br/>Si es mayor de 60 el salario es un 15 por ciento más
 * @author jgarcia7
 *
 */
public class Ejercicio7 {

	private String nombre;
	private int edad;
	private double salario;
	
	public Ejercicio7(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public void calculateSalary() {
		String message = "";
		if(edad < 16) {
			message = String.format("El empleado \"%s\" no tiene edad para trabajar", nombre);
		} else if(edad >= 19 && edad <= 50 ) {
			double calculateSalary = salario + (salario * 5 / 100);
			message = String.format("El empleado \"%s\" tiene un salario de %s", nombre, calculateSalary);
		} else if(edad >= 51 && edad <= 60 ) {
			double calculateSalary = salario + (salario * 10 / 100);
			message = String.format("El empleado \"%s\" tiene un salario de %s", nombre, calculateSalary);
		} else if(edad > 60) {
			double calculateSalary = salario + (salario * 15 / 100);
			message = String.format("El empleado \"%s\" tiene un salario de %s", nombre, calculateSalary);
		} else {
			message = String.format("El empleado %s tiene un salario de %s", nombre, salario);
		}
		System.out.println(message);
	}
}
