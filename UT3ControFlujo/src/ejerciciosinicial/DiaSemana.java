package ejerciciosinicial;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero_dia;
		String letra_dia;
		
		System.out.print("Dame el d�a de la semana (en n�mero): ");
		numero_dia = teclado.nextInt();

		/*
		if (numero_dia==1) {
			//letra_dia= new String("Lunes");
			letra_dia= "Lunes";
		} else if (numero_dia==2) {
			letra_dia= "Martes";
		} else if (numero_dia==3) {
			letra_dia= "Miercoles";
		} else if (numero_dia==4) {
			letra_dia= "Jueves";
		} else if (numero_dia==5) {
			letra_dia= "Viernes";
		} else if (numero_dia==6) {
			letra_dia= "Sabado";
		} else if (numero_dia==7) {
			letra_dia= "Domingo";
		} else {
			System.out.println("El n�mero no est� entre [1..7]");
			letra_dia= "Error";
		}
		*/

		switch (numero_dia){
			case 1: 
				letra_dia="Lunes";
				break;
			case 2:
				letra_dia= "Martes";
				break;
			case 3:
				letra_dia= "Miercoles";
				break;
			case 4:
				letra_dia= "Jueves";
				break;
			case 5:
				letra_dia= "Viernes";
				break;
			case 6:
				letra_dia= "Sabado";
				break;
			case 7:
				letra_dia= "Domingo";
				break;
			default:
				System.out.println("El n�mero no est� entre [1..7]");
				letra_dia= "Error";
				break;
		}
		
		if (!letra_dia.equals("Error")) {
			System.out.println("El d�a " + numero_dia +	" corresponde al " + letra_dia);
		}
	}

}


