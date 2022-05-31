package practica3;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variables
		double nota, nota2, nota3, promedio;
		String alumno = new String();
		String evaluacion = new String();
		Scanner in = new Scanner(System.in);

		//Tratamiento
		System.out.println("Alumno :");
		alumno = in.nextLine();
		System.out.println("Nota :");
		nota = in.nextDouble();
		System.out.println("Nota 2 :");
		nota2 = in.nextDouble();
		System.out.println("Nota 3:");
		nota3 = in.nextDouble();
		promedio = (nota + nota2 + nota3) / 3 ;
		if (promedio < 7 ) {
			evaluacion = "Suspendido";
		}
		else {
			evaluacion = "Aprobado";
		}
		System.out.println("El alumno " + alumno + " con notas " + nota + ", " + nota2 + " y " + nota3 + " ha sido evaludado con " + evaluacion);

		in.close();
	}

}
