package practica3;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variables
		// int para solicitar valor1, valor2 y valor3   
		int  valor1 , valor2 , valor3 ;
		// Variable para solicitar datos por pantalla 
		Scanner in = new Scanner(System.in);
		//Tratamiento
		
		System.out.println("Informar valor 1:");
		valor1  = in.nextInt();
		System.out.println("Informar valor 2:");
		valor2  = in.nextInt();
		System.out.println("Informar valor 3:");
		valor3  = in.nextInt();
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("Valor1 mayor: " + valor1);
		}			
		else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("Valor2 mayor: " + valor2);
		}
		else if (valor3 > valor1 && valor3 > valor2) {
			System.out.println("Valor3 mayor: " + valor3);
		}
		else {
			System.out.println("Existen valores repetidos");
		}
	
		in.close();
	}

}
