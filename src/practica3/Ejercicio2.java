package practica3;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variables
		int numero;
		Scanner in = new Scanner(System.in);

		//Tratamiento
		System.out.println("Informar numero: ");
		numero = in.nextInt();
		if (numero%2!=0) {
			System.out.println("El numero " + numero + " es impar");
		}
	    else{
			System.out.println("El numero " + numero + " es par");
        }
		in.close();
	}

}
