package practica3;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables
		// String para solicitar categoria 
		String categoria = new String();
		Scanner in = new Scanner(System.in);

		//Tratamiento
		System.out.println("Informar categoria: ");
		categoria = in.nextLine();
		switch (categoria.toUpperCase()) {
		  case "A":
			  System.out.println("hijo");
			  break;
		  case "B":
			  System.out.println("padres");
			  break;
		  case "C":
			  System.out.println("abuelos");
			  break;
	      default:
	    	  // Ejecutar si el valor de varible es distinto del del resto de casos
			  System.out.println("A, B o C no era tan dificil alma de cantaro");
	    	  break;
		}		
		in.close();
	}

}
