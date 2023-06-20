package area_Circulo;

import java.util.Scanner;

public class Grados {
	public static void main (String [] arg) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Ingresa temperarura en Celcius : " );
		
		double celsius = input.nextDouble();
	    double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("La temperatura en grados Farenheit es: " + fahrenheit);
		
	}

}
