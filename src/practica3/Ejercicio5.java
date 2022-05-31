package practica3;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables
		// int para solicitar posicion 
		int  posicion;
		// Variable para solicitar datos por pantalla 
		Scanner in = new Scanner(System.in);
		//Tratamiento
		
		System.out.println("Informar posicion: ");
		posicion = in.nextInt();
		if (posicion == 0) {
			System.out.println("No es posible quedar el 0 pintismonqui");
		}
		if (posicion == 1) {
			System.out.println("a.	El primero obtiene la medalla de oro");
		}
		if (posicion == 2) {
			System.out.println("b.	El segundo obtiene la medalla de plata");
		}
		if (posicion == 3) {
			System.out.println("c.	Y el tercero obtiene la medalla de bronce");
		}
		if (posicion > 3) {
			System.out.println("d.	Y para el resto siga participando");
		}
		in.close();
	}

}
