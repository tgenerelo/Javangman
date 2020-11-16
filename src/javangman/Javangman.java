package javangman;

import java.util.Random;
import java.util.Scanner;

public class Javangman {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String palabra = "", userInput = "", letrasJugadas = "", letrasAcertadas = "";
		int vidas = 7;
		boolean win = false;

		palabra = escogerPalabra();

		// PRIMERA VEZ
		imprimirDibujo(vidas);

		userInput = "";
		System.out.print("Escribe una letra: ");
		userInput = leer.next().toUpperCase();

		do {
			imprimirDibujo(vidas);

			System.out.println();
			System.out.print(palabra + " || ");
			imprimirPalabra(palabra, letrasAcertadas, vidas);
			System.out.println("Letras jugadas: " + letrasJugadas + "     Letras acertadas: " + letrasAcertadas);

			System.out.println();

			userInput = "";
			System.out.print("Escribe una letra: ");
			userInput = leer.next().toUpperCase();

			letrasJugadas = letrasJugadas + userInput.substring(0, 1);
			if (letrasAcertadas.equals(compararInput(userInput, palabra, letrasAcertadas))) {
				vidas = restarVida(vidas);
			} else {
				letrasAcertadas = compararInput(userInput, palabra, letrasAcertadas);
			}

			if (palabra.length() == letrasAcertadas.length()) {
				win = true;
				break;
			}

			if (vidas <= 0) {
				break;
			}

			System.out.println();
		} while (vidas > 0 || win == false); // ¿POR ALGÚN MOTIVO NO TERMINA LA PARTIDA AL LLEGAR A 0 VIDAS?

		finPartida(win);

	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////////////////////////////////////
	// ----------------------------------------FUNCIONES-----------------------------------------------
	// ////////////////////////////////////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////////////////////////////////////

	// ESCOGER PALABRA //
	public static String escogerPalabra() {
		/*
		 * Escoger palabra al azar VARIABLES: palabra, userInput RETURN: palabra Las
		 * palabras se almacenan en un vector.
		 */

		Random azar = new Random();
		String vPalabras[], palabra = "";
		int numAzar = 0;

		vPalabras = new String[100];
		for (int i = 0; i < vPalabras.length; i++) {
			vPalabras[i] = "";
		}

		vPalabras[0] = "CAMION";
		vPalabras[1] = "PERRO";
		vPalabras[2] = "NIÑO";
		vPalabras[3] = "PLATANO";
		vPalabras[4] = "PERSONA";
		vPalabras[5] = "IMAN";
		vPalabras[6] = "SARTEN";
		vPalabras[7] = "SOFA";
		vPalabras[8] = "CASTILLO";
		vPalabras[9] = "BOMBILLA";
		vPalabras[10] = "CAMA";
		vPalabras[11] = "CAFETERIA";
		vPalabras[12] = "NEVERA";
		vPalabras[13] = "BOSQUE";
		vPalabras[14] = "VESTIDO";
		vPalabras[15] = "EDIFICIO";
		vPalabras[16] = "PAJARO";
		vPalabras[17] = "LUNA";
		vPalabras[18] = "ASFALTO";
		vPalabras[19] = "DIARIO";
		vPalabras[20] = "VENTILADOR";
		vPalabras[21] = "HUMANO";
		vPalabras[22] = "HORTICULTURA";
		vPalabras[23] = "MURCIELAGO";
		vPalabras[24] = "CAMUFLAJE";
		vPalabras[25] = "UNIDAD";
		vPalabras[26] = "AJEDREZ";
		vPalabras[27] = "UNICORNIO";
		vPalabras[28] = "DELTA";
		vPalabras[29] = "NUDO";
		vPalabras[30] = "EPOPEYA";
		vPalabras[31] = "MANDARINA";
		vPalabras[32] = "CHOCOLATE";
		vPalabras[33] = "QUIROFANO";
		vPalabras[34] = "VIRUS";
		vPalabras[35] = "QUITANIEVES";

		do {
			numAzar = azar.nextInt(99);
			palabra = vPalabras[numAzar];
		} while (vPalabras[numAzar].equalsIgnoreCase(""));

		return palabra;
	}

	// COMPARAR INPUT //
	public static String compararInput(String userInput, String palabra, String letrasAcertadas) {
		/*
		 * VARIABLES: palabra, userInput, letrasJugadas, letrasAcertadas RETURN:
		 * letrasAcertadas Cada vez que se introduce un userInput se añade a
		 * letrasJugadas y se compara con palabra. Si la letra aparece en la palabra, se
		 * añadirá también a letrasAcertadas. Si la palabra ya estaba presente en
		 * letrasJugadas, mostrar error y volver a Pintar muñeco / pedir input
		 */

		for (int i = 0; i < palabra.length(); i++) {
			for (int j = 0; j < userInput.length(); j++) {
				if (palabra.substring(i, i + 1).equalsIgnoreCase(userInput.substring(j, j + 1))) {
					letrasAcertadas = letrasAcertadas + userInput.substring(j, j + 1);
				}
			}
		}

		return letrasAcertadas;

	}

	// RESTAR VIDA //
	public static int restarVida(int vidas) {
		vidas--;
		return vidas;
	}

	// IMPRIMIR DIBUJO //
	public static void imprimirDibujo(int vidas) {

		switch (vidas) {
		case 7: {
			System.out.println(" _________________________");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |_______________________|");
			break;
		}
		case 6: {
			System.out.println(" _________________________");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |      / \\              |");
			System.out.println(" |     /___\\_______      |");
			System.out.println(" |                       |");
			System.out.println(" |_______________________|");
			break;
		}
		case 5: {
			System.out.println(" _________________________");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |       |               |");
			System.out.println(" |       |               |");
			System.out.println(" |       |               |");
			System.out.println(" |       |               |");
			System.out.println(" |      /|\\              |");
			System.out.println(" |     /_|_\\_______      |");
			System.out.println(" |                       |");
			System.out.println(" |_______________________|");
			break;
		}
		case 4: {
			System.out.println(" _________________________");
			System.out.println(" |                       |");
			System.out.println(" |       ________        |");
			System.out.println(" |       | /             |");
			System.out.println(" |       |/              |");
			System.out.println(" |       |               |");
			System.out.println(" |       |               |");
			System.out.println(" |      /|\\              |");
			System.out.println(" |     /_|_\\_______      |");
			System.out.println(" |                       |");
			System.out.println(" |_______________________|");
			break;
		}
		case 3: {
			System.out.println(" _________________________");
			System.out.println(" |                       |");
			System.out.println(" |       ________        |");
			System.out.println(" |       | /   :         |");
			System.out.println(" |       |/              |");
			System.out.println(" |       |               |");
			System.out.println(" |       |               |");
			System.out.println(" |      /|\\              |");
			System.out.println(" |     /_|_\\_______      |");
			System.out.println(" |                       |");
			System.out.println(" |_______________________|");
			break;
		}
		case 2: {
			System.out.println(" _________________________");
			System.out.println(" |                       |");
			System.out.println(" |       ________        |");
			System.out.println(" |       | /   :         |");
			System.out.println(" |       |/              |");
			System.out.println(" |       |               |");
			System.out.println(" |       |   _____       |");
			System.out.println(" |      /|\\  |   |       |");
			System.out.println(" |     /_|_\\_|___|_      |");
			System.out.println(" |                       |");
			System.out.println(" |_______________________|");
			break;
		}
		case 1: {
			System.out.println(" _________________________");
			System.out.println(" |                       |");
			System.out.println(" |       ________        |");
			System.out.println(" |       | /   :         |");
			System.out.println(" |       |/    O         |");
			System.out.println(" |       |    /|\\        |");
			System.out.println(" |       |   _/_\\_       |");
			System.out.println(" |      /|\\  |   |       |");
			System.out.println(" |     /_|_\\_|___|_      |");
			System.out.println(" |                       |");
			System.out.println(" |_______________________|");
			break;
		}
		case 0: {
			System.out.println(" _________________________");
			System.out.println(" |                       |");
			System.out.println(" |       ________        |");
			System.out.println(" |       | /   :         |");
			System.out.println(" |       |/    O         |");
			System.out.println(" |       |    /|\\        |");
			System.out.println(" |       |    / \\        |");
			System.out.println(" |      /|\\              |");
			System.out.println(" |     /_|_\\_______      |");
			System.out.println(" |                       |");
			System.out.println(" |_______________________|");
			break;
		}
		}

	}

	// IMPRIMIR PALABRA //
	public static void imprimirPalabra(String palabra, String letrasAcertadas, int vidas) {
		System.out.print("  -> ");
		for (int i = 0; i < palabra.length(); i++) {
			for (int j = 0; j < letrasAcertadas.length(); j++) {
				if (palabra.substring(i, i + 1).equalsIgnoreCase(letrasAcertadas.substring(j, j + 1))) {
					System.out.print(palabra.substring(i, i + 1) + " ");
					break;
				} else {
					System.out.print("_ ");
					break;
				}
			}
		}
		System.out.println("<-");

		System.out.println(" (Vidas restantes: " + vidas + ")");
	}

	// FIN DE PARTIDA
	public static void finPartida(boolean win) {
		if (win == true) {
			System.out.println(" _________________________");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |        O     O        |");
			System.out.println(" |         _____         |");
			System.out.println(" |         \\___/         |");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |     ¡HAS GANADO!      |");
			System.out.println(" |                       |");
			System.out.println(" |_______________________|");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		} else {
			System.out.println(" _________________________");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |        X     X        |");
			System.out.println(" |          ___          |");
			System.out.println(" |         /   \\         |");
			System.out.println(" |                       |");
			System.out.println(" |                       |");
			System.out.println(" |       GAME OVER       |");
			System.out.println(" |                       |");
			System.out.println(" |_______________________|");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}

}
