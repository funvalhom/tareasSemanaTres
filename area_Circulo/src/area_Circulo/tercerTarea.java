package area_Circulo;

import java.util.Scanner;

public class tercerTarea {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Ingresa radio del circulo : " );
		double radio = input.nextFloat();
		
		double area = Math.PI * (radio * radio);
		
		System.out.println("El area del circulo es : " + area);
		

	}

}
