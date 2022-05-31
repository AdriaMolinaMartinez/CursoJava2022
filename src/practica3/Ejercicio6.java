package practica3;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variables
		// int para solicitar curso  
		int  curso ;
		// Variable para solicitar datos por pantalla 
		Scanner in = new Scanner(System.in);
		//Tratamiento
		
		System.out.println("Informar curso:");
		curso  = in.nextInt();
		if (curso  == 0) {
			System.out.println("jardín de infantes");
		}			
		else if (curso > 0 && curso < 7) {
			System.out.println("primaria");
		}
		else if (curso > 6 && curso < 13) {
			System.out.println("secundaria");
		}
		else {
			System.out.println("El padre se su niño es tonto y no lo saben en casa. De que curso es ?");
		}
	
		in.close();
	}

}
