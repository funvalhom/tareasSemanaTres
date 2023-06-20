package area_Circulo;

import java.util.Scanner;

public class Rectangulo {
	
	public static void main (String [] arg) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Ingresa base del rectangulo : " );
		double base = input.nextDouble();
		
		System.out.println("Ingresa altura del rectangulo : " );
		double altura = input.nextDouble();
		
		double area = base * altura;
		
		
		System.out.println("el area del rectangulo es : " + area);
		
	}
		

}
