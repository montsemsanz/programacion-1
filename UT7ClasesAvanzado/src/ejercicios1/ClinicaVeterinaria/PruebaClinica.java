package ejercicios1.ClinicaVeterinaria;

public class PruebaClinica {

	public static void main(String[] args) {

		Animales[] animales = new Animales[20];
		int numAnimales=0;
		
		String[] opcionesClinica = { "A�adir animal", "Borrar animal", "Listar", "Salir" };
		String[] opcionesAnimales = { "A�adir mam�fero", "A�adir reptil",
				"A�adir pez", "Salir" };
		String[] opcionesMamiferos = { "A�adir perro", "A�adir gato", "Salir" };

		Menu menuClinicaAnimales = new Menu(opcionesClinica, 4);
		Menu menuAnimales = new Menu(opcionesAnimales, 4);
		Menu menuMamiferos = new Menu(opcionesMamiferos, 3);

		int respuesta;
		System.out.println("\n*  CLINICA DE ANIMALES  *");
		do {
			System.out.println("==Men� cl�nica de animales:==");
			do {
				respuesta = menuClinicaAnimales.imprimirYPreguntar();
			} while (respuesta != 1 && respuesta != 2 && respuesta != 3);

			switch (respuesta) {
			case 1: // CREAR ANIMAL
				do {
					System.out.println("==Men� cl�nica de animales:==");
					do {
						respuesta = menuAnimales.imprimirYPreguntar();
					} while (respuesta != 1 && respuesta != 2 && respuesta != 3
							&& respuesta != 4);

					switch (respuesta) {
					case 1: //"A�adir mam�fero"
						do {
							System.out.println("==Men� cl�nica de animales:==");
							do {
								respuesta = menuMamiferos.imprimirYPreguntar();
							} while (respuesta != 1 && respuesta != 2
									&& respuesta != 3);

							switch (respuesta) {
							case 1: // Perro
								Perro perro=new Perro(new Cliente("Antonio C.","C/ Guadamur"),
										"Chinico",12.6,"20/2/2010","Chihuahua",23345,false);
								animales[numAnimales++]=perro;
								break;
							case 2: // Gato
								Gato gato=new Gato(new Cliente("Antonio C.","C/ Guadamur"),
										"Gatico", 4.5, "20/2/2010", "Angora");
								animales[numAnimales++]=gato;
								break;
							case 3: // Salir
	
							}
						} while (respuesta != 3);

						break;
					case 2: // "A�adir reptil",
					 

						break;
					case 3: // "A�adir pez"

						break;
					case 4:

					}
				} while (respuesta != 4);

				break;
			case 2: // Borrar animal
				// 3º
				animales[2]=animales[--numAnimales];
				animales[numAnimales]=null;
				break;
			case 3: // Listar
				for(int i=0;i<numAnimales;i++)
					System.out.println(animales[i]); 
				break;
			case 4:
				System.out.println("FIN DEL PROGRAMA");
			}

		} while (respuesta != 3);
	}
}

/*
 * Gato gato1 = new Gato("Rodrigo", "Calle Azarquiel, n�25", "Minino", 2,
 * "05/12/2011", "Raza Gato");
 * 
 * Reptiles reptil1 = new Reptiles("Antonio", "Calle San Pablo, n�2", "culebra",
 * 0.200, "25/01/2014"); String[] alimentos = new String[] { "insectos",
 * "rat�n", "peque�os reptiles" }; reptil1.setAlimentos(alimentos);
 * 
 * System.out.println(gato1); System.out.println(reptil1);
 */

