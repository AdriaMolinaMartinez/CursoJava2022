package practica3;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variables
		// String para solicitar mes
		String mes = new String();
		// Tabla de meses
		String meses[] = new String[12];
		// Tabla de dias por mes
		int dias[]  = new int[12];
		//Entero para recorrer tabla
		int j;
		Scanner in = new Scanner(System.in);

		//Informar valores en elementos tablas
		meses [0]  = "Enero";
		meses [1]  = "Febrero";
		meses [2]  = "Marzo";
		meses [3]  = "Abril";
		meses [4]  = "Mayo";
		meses [5]  = "Junio";
		meses [6]  = "Julio";
		meses [7]  = "Agosto";
		meses [8]  = "Septiembre";
		meses [9]  = "Octubre";
		meses [10] = "Noviembre";
		meses [11] = "Diciembre";
		dias [0]   = 31;
		dias [1]   = 28;
		dias [2]   = 31;
		dias [3]   = 30;
		dias [4]   = 31;
		dias [5]   = 30;
		dias [6]   = 31;
		dias [7]   = 31;
		dias [8]   = 30;
		dias [9]   = 31;
		dias [10]  = 30;
		dias [11]  = 31;

		//Tratamiento
		System.out.println("Informar mes: ");
		mes = in.nextLine();
		for(j = 0; j < 12; j++) {
			if (meses[j].equals(mes)) {
				System.out.println(meses[j] + " tiene " + dias[j]);
		  		break;
		    }
        }
		if (j==12) {
			System.out.println("Mes informado " + mes + " no correcto");
		}
		in.close();
	}

}
