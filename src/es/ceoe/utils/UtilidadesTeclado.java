/**
 * 
 */
package es.ceoe.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jgarcia7
 *
 */
public class UtilidadesTeclado {

	public static String readLine() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			line = reader.readLine();
		} catch (IOException e) {
			line = "";
		}
		return line;
	}
}
