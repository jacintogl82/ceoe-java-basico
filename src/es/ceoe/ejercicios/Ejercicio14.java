/**
 * 
 */
package es.ceoe.ejercicios;

/**
 * Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello
 * 
 * @author jgarcia7
 *
 */
public class Ejercicio14 {

	public void esLaboral(String dia) {
		
		boolean esLaboral = false;
		switch (dia.toUpperCase()){
		case "LUNES":
			esLaboral = true;
			break;
		case "MARTES":
			esLaboral = true;
			break;
		case "MIERCOLES":
			esLaboral = true;
			break;
		case "JUEVES":
			esLaboral = true;
			break;
		case "VIERNES":
			esLaboral = true;
			break;
		case "SABADO":
			esLaboral = true;
			break;
		case "DOMINGO":
			esLaboral = true;
			break;
		default:
			break;
		}
		String message = "";
		if(esLaboral) {
			message = String.format("El día %s es laboral", dia);
		} else {
			message = String.format("El día %s no es laboral", dia);
		}
		System.out.println(message);
	}
}
