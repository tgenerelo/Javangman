package javangman;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class Javangman {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String palabra = "", userInput = "", letrasAcertadas = "";
		String vPalabraOculta[], vLetrasJugadas[];
		int vidas;
		boolean win, salir = false;

		do {
			win = false;
			vidas = 7;

			palabra = Metodos.escogerPalabra();

			vPalabraOculta = new String[palabra.length()];
			vLetrasJugadas = new String[palabra.length() + vidas];

			Metodos.inicializarVectores(palabra, vPalabraOculta, vLetrasJugadas);

			do {
				Metodos.imprimirDibujo(vidas);

				Metodos.imprimirPalabra(palabra, vPalabraOculta, vidas);

				Metodos.mostrarLetrasJugadas(vLetrasJugadas, vPalabraOculta);

				do {
					userInput = "";
					System.out.print("  Escribe una letra: ");
					userInput = leer.next().toUpperCase();
				} while (Metodos.letraValida(userInput) == false);

				if (Metodos.compararInput(userInput, palabra, vPalabraOculta, vLetrasJugadas, letrasAcertadas) == false) {
					vidas = Metodos.restarVida(vidas);
				}

				if (Metodos.comprobarVictoria(vPalabraOculta)) {
					win = true;
					break;
				}

				System.out.println();

			} while (vidas > 0 && win == false);

			salir = Metodos.finPartida(win, palabra);

		} while (salir == false);

		System.out.println("\n Gracias por jugar a Javangman.\n El programa se cerrará.");
	}

}
