package javangman;

import java.util.Random;
import java.util.Scanner;

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

			palabra = escogerPalabra();

			vPalabraOculta = new String[palabra.length()];
			vLetrasJugadas = new String[palabra.length() + vidas];

			inicializarVectores(palabra, vPalabraOculta, vLetrasJugadas);

			do {
				imprimirDibujo(vidas);

				imprimirPalabra(palabra, vPalabraOculta, vidas);

				mostrarLetrasJugadas(vLetrasJugadas, vPalabraOculta);

				do {
					userInput = "";
					System.out.print("  Escribe una letra: ");
					userInput = leer.next().toUpperCase();
				} while (letraValida(userInput) == false);

				if (compararInput(userInput, palabra, vPalabraOculta, vLetrasJugadas, letrasAcertadas) == false) {
					vidas = restarVida(vidas);
				}

				if (comprobarVictoria(vPalabraOculta)) {
					win = true;
					break;
				}

				System.out.println();

			} while (vidas > 0 && win == false);

			salir = finPartida(win, palabra);

		} while (salir == false);
		
		System.out.println("\nGracias por jugar a Javangman.\nEl programa se cerrará.");

	}

///////////////////////////////////////////////////////////////////////////////////////////////////
// ----------------------------------------FUNCIONES---------------------------------------------//
///////////////////////////////////////////////////////////////////////////////////////////////////

	// INICIALIZAR VECTORES
	public static void inicializarVectores(String palabra, String vPalabraOculta[], String vLetrasJugadas[]) {
		for (int i = 0; i < vPalabraOculta.length; i++) {
			vPalabraOculta[i] = "_";
		}

		for (int i = 0; i < vLetrasJugadas.length; i++) {
			vLetrasJugadas[i] = "";
		}
	}

	// ESCOGER PALABRA
	public static String escogerPalabra() {

		Random azar = new Random();
		String palabra = "";
		int numAzar = 0;

		String vDiccionario[] = { "ABANDONO", "ABDOMEN", "ABRIGO", "ABUELA", "ABUELO", "ABURRIMIENTO", "ACCION",
				"ACELERACION", "ACIERTO", "ACTITUD", "ACTIVIDAD", "ACTO", "ACTUACION", "ACUERDO", "ADMINISTRACION",
				"ADMINISTRATIVO", "ADOLESCENTE", "ADULTO", "AEROPUERTO", "AGUA", "AGUILA", "AGUJA", "AIRE", "AJEDREZ",
				"ALBONDIGA", "ALCALDE", "ALEGRIA", "ALEMAN", "ALFABETO", "ALIMENTO", "ALMA", "ALMACEN", "ALMENDRA",
				"ALTO", "ALTURA", "ALUMNADO", "AMANECER", "AMAPOLA", "AMARILLO", "AMBIENTE", "AMBULANCIA", "AMIGA",
				"AMIGO", "AMOR", "ANALISIS", "ANARANJADO", "ANATOMIA", "ANCHO", "ANCIANO", "ANIMAL", "ANOCHECER", "AÑO",
				"APARATO", "APARTAMENTO", "APERITIVO", "APOYO", "ARAÑA", "ARBOL", "AREA", "ARITMETICA", "ARMA",
				"ARRIBA", "ARROZ", "ARTE", "ARTICULO", "ASCENSOR", "ASFALTO", "ASOCIACION", "ASPECTO", "ASTRONAUTA",
				"ATAQUE", "ATARDECER", "ATENCION", "ATMOSFERA", "ATUN", "AUMENTO", "AUTO", "AUTOBUS", "AUTOMOVIL",
				"AUTOPISTA", "AUTOR", "AUTORIDAD", "AVANCE", "AVENA", "AVENIDA", "AVION", "AYER", "AYUDA", "AZUL",
				"BABOSA", "BAMBU", "BARBA", "BARRO", "BASE", "BEBE", "BEBIDA", "BENEFICIO", "BICHO", "BIENVENIDA",
				"BIGOTE", "BILLETE", "BISABUELA", "BISABUELO", "BISNIETA", "BISNIETO", "BLANCO", "BOCA", "BOLETO",
				"BOLSA", "BOLSILLO", "BOLSO", "BOMBEROS", "BOMBILLA", "BOSQUE", "BOTON", "BRAGA", "BRAZO", "BROMISTA",
				"BUS", "BUSQUEDA", "CABALLERO", "CABALLO", "CABELLO", "CABEZA", "CABO", "CADERA", "CAFE", "CAFETERIA",
				"CALAMAR", "CALCETINES", "CALENDARIO", "CALIDAD", "CALLE", "CALOR", "CALZON", "CALZONCILLO", "CAMA",
				"CAMARA", "CAMARON", "CAMBIO", "CAMINO", "CAMION", "CAMISA", "CAMISETA", "CAMPAÑA", "CAMPO",
				"CAMUFLAJE", "CANICHE", "CANSANCIO", "CANTIDAD", "CAPACIDAD", "CAPITAL", "CARA", "CARACOL", "CARACTER",
				"CARACTERISTICA", "CARGO", "CARNE", "CARPA", "CARRERA", "CARRETERA", "CARTA", "CASA", "CASO", "CASTAÑA",
				"CASTAÑO", "CASTILLO", "CAUSA", "CAVERNA", "CEBADA", "CELESTE", "CENTIMETRO", "CERDO", "CEREBRO",
				"CERO", "CERRO", "CERVEZA", "CESPED", "CHAQUETA", "CHINO", "CHOCOLATE", "CHUBASQUERO", "CIELO", "CIEN",
				"CIENCIA", "CIENTO", "CIERRE", "CIERVO", "CINCO", "CINE", "CINTURA", "CINTURON", "CIRCENSE", "CIRUELA",
				"CIRUJANO", "CIUDAD", "CLASE", "CLAVO", "CLIMA", "CLUB", "COCHE", "COCODRILO", "COCOTERO", "CODIGO",
				"CODO", "COLA", "COLEGA", "COLEGIO", "COLOR", "COMA", "COMERCIO", "COMIDA", "COMIENZO", "COMISION",
				"COMPAÑIA", "COMPETENCIA", "COMPETICION", "COMPUTADORA", "COMUNICACION", "COMUNIDAD", "CONCEPTO",
				"CONCIENCIA", "CONDICION", "CONEJO", "CONEXION", "CONFIANZA", "CONFLICTO", "CONGRESISTA", "CONGRESO",
				"CONJUNTO", "CONOCIDA", "CONOCIDO", "CONOCIMIENTO", "CONSECUENCIA", "CONSEJO", "CONSTITUCION",
				"CONSTRUCCION", "CONSUMO", "CONTENIDO", "CONTROL", "CORAZON", "CORDEL", "CORDON", "CORRIENTE", "CORTE",
				"COSA", "COSTA", "CREACION", "CRECIMIENTO", "CREMA", "CREMALLERA", "CRIATURA", "CRISIS", "CUADRO",
				"CUARTO", "CUATRO", "CUCARACHA", "CUELLO", "CUENTA", "CUERDA", "CUERPO", "CUERVO", "CUESTION", "CULO",
				"CULTURA", "CURA", "CURSO", "DAMA", "DATO", "DECADA", "DECISION", "DECRETO", "DEDO", "DEFENSA", "DELTA",
				"DEMANDA", "DEMOCRACIA", "DEPARTAMENTO", "DEPORTE", "DERECHA", "DERECHO", "DESARROLLO", "DESCAPOTABLE",
				"DESEO", "DESIERTO", "DESPEJADO", "DESTINO", "DESTRUCCION", "DETERIORO", "DIA", "DIAGONAL", "DIARIO",
				"DIARREA", "DIBUJO", "DICCIONARIO", "DICTADURA", "DIENTE", "DIEZ", "DIFERENCIA", "DIMINUTO", "DINERO",
				"DINOSAURIO", "DIOS", "DImejoras mínimasPUTADO", "DIRECCION", "DIRECTOR", "DOCUMENTO", "DOLOR",
				"DOMINGO", "DORMITORIO", "DOS", "DRAGON", "DUCHA", "DUDA", "DURAZNO", "ECONOMIA", "EDAD", "EDIFICIO",
				"EDUCACION", "EFECTO", "EJEMPLO", "ELECCION", "ELECTRICIDAD", "ELEFANTE", "ELEMENTO", "ELEVADOR",
				"EMPATIA", "EMPERADOR", "EMPERATRIZ", "EMPLEO", "EMPRESA", "ENAMORADO", "ENCUENTRO", "ENERGIA",
				"ENFADO", "ENFERMEDAD", "ENOJO", "ENTORNO", "ENTRADA", "ENTRESEMANA", "ENTRETENIMIENTO", "EPOCA",
				"EPOPEYA", "EQUIPO", "EQUIVOCACION", "ERA", "ERROR", "ESCALA", "ESCALERA", "ESCRITORIO", "ESCUELA",
				"ESCULTURA", "ESFUERZO", "ESPACIO", "ESPALDA", "ESPAÑOL", "ESPECIE", "ESPECTACULO", "ESPECTADOR",
				"ESPERA", "ESPINILLA", "ESPIRITU", "ESPOSA", "ESPOSO", "ESTACION", "ESTADO", "ESTE", "ESTILO",
				"ESTOMAGO", "ESTRELLA", "ESTRUCTURA", "ESTUDIO", "ETAPA", "EXISTENCIA", "EXITO", "EXPERIENCIA",
				"EXPRESION", "EXTASIS", "EXTERIOR", "FABRICA", "FALDA", "FALTA", "FAMILIA", "FASE", "FAVOR", "FECHA",
				"FERROCARRIL", "FIGURA", "FIN", "FINAL", "FLOR", "FONDO", "FORMA", "FORMACION", "FORMALIDAD", "FRACASO",
				"FRANCES", "FRENTE", "FRUTA", "FUEGO", "FUENTE", "FUERZA", "FUNCION", "FUTURO", "GAFAS", "GALAXIA",
				"GALLINA", "GAS", "GASEOSA", "GATO", "GENTE", "GEOGRAFIA", "GOBERNADOR", "GOBIERNO", "GORRION",
				"GRABADO", "GRADO", "GRAMO", "GRIPE", "GRIS", "GRUPO", "GUERRA", "GUISANTE", "HABITACION", "HALCON",
				"HERMANA", "HERMANO", "HIELO", "HIERRO", "HIGADO", "HIJA", "HIJO", "HILO", "HISTORIA", "HOGAR", "HOJA",
				"HOMBRE", "HOMBRO", "HONGO", "HORA", "HORTICULTURA", "HOTEL", "HOY", "HUESO", "HUMANIDAD", "HUMANO",
				"IDEA", "IDIOMA", "IMAGEN", "IMAN", "INFORMACION", "INFORME", "INGLES", "INICIO", "INSECTO", "INSTANTE",
				"INSTITUTO", "INTENDENTE", "INTENTO", "INTERES", "INTERIOR", "INTERRUPCION", "INVESTIGACION",
				"IZQUIERDA", "JAPONES", "JIRAFA", "JUDIA", "JUEVES", "JUNGLA", "KILO", "KILOMETRO", "KIWI", "LABIO",
				"LADO", "LADRON", "LAGARTO", "LAGO", "LAGUNA", "LAMINA", "LANGOSTA", "LARGO", "LEÑA", "LEON", "LEY",
				"LIBERTAD", "LIBRO", "LITRO", "LLAVE", "LLAVERO", "LLUVIA", "LODO", "LOGRO", "LOMBRIZ", "LONGITUD",
				"LUGAR", "LUNA", "LUNES", "LUZ", "MADRE", "MANDARINA", "MANERA", "MANGA", "MANIQUI", "MANO", "MANZANA",
				"MAÑANA", "MAQUINA", "MAR", "MARIPOSA", "MARISCO", "MARRON", "MARTES", "MARTIR", "MATRIMONIO",
				"MAYORIA", "MEDIDA", "MEDIODIA", "MEJORA", "MEMORIA", "MENTE", "MENTIRA", "MERCADO", "MERCENARIO",
				"MES", "MESA", "MESILLA", "META", "METAL", "METALICO", "METRO", "MIEDO", "MIERCOLES", "MIL", "MILENIO",
				"MILIMETRO", "MILLON", "MINISTRO", "MINORIA", "MINUTO", "MODO", "MOLUSCO", "MOMENTO", "MONO", "MONTAÑA",
				"MONTE", "MOSCA", "MOSQUITO", "MOVIMIENTO", "MUERTE", "MUJER", "MULTICOLOR", "MUNDO", "MUNICIPIO",
				"MUÑECA", "MURCIELAGO", "MUSCULO", "MUSICA", "MUSLO", "NACIMIENTO", "NACION", "NADA", "NARANJA",
				"NARIZ", "NATURALEZA", "NECESIDAD", "NEGRO", "NEVERA", "NIETA", "NIETO", "NIEVE", "NIÑA", "NIÑO",
				"NIVEL", "NOCHE", "NOMBRE", "NORMA", "NORTE", "NOTICIA", "NUBLADO", "NUDO", "NUEVE", "NUEZ", "NUMERO",
				"OBJETIVO", "OBJETO", "OBLIGACION", "OBRA", "OCASION", "OCEANO", "OCHO", "OESTE", "OFERTA", "OFICINA",
				"OIDO", "OJO", "OLFATO", "OMNIBUS", "ORDEN", "ORDENADOR", "OREJA", "ORGANIZACION", "ORIGEN", "ORO",
				"ORQUESTA", "OVEJA", "PADRE", "PAIS", "PAJARO", "PALABRA", "PALMA", "PANEL", "PANTALLA", "PANTALON",
				"PAPA", "PAPEL", "PARADA", "PARAGUAS", "PARASOL", "PARBULARIO", "PAREJA", "PARLAMENTARIO", "PARTE",
				"PARTIDO", "PASADO", "PASO", "PASTO", "PATA", "PATATA", "PAZ", "PECHO", "PENSAMIENTO", "PERA",
				"PERCEPCION", "PERIODICO", "PERIODISMO", "PERIQUITO", "PERJUICIO", "PERMISO", "PERRO", "PERSONA",
				"PERSONALIDAD", "PESO", "PEZ", "PIE", "PIEL", "PIERNA", "PINO", "PINTURA", "PISO", "PLACER", "PLANETA",
				"PLANTA", "PLATA", "PLATANO", "PLAYA", "PLOMO", "POBLACION", "POLICIA", "POLILLA", "POLITICA",
				"POLITICO", "POMO", "POSIBILIDAD", "POSICION", "POTENCIA", "POZO", "PRECIO", "PREGON", "PREGUNTA",
				"PRENDA", "PRESENCIA", "PRESENTE", "PRESIDENTE", "PRIMA", "PRIMO", "PRINCIPIO", "PROBABILIDAD",
				"PROBLEMA", "PROCESO", "PRODUCCION", "PRODUCTO", "PROFESION", "PROGRAMA", "PROGRAMADOR", "PROGRESO",
				"PROHIBICION", "PROVINCIA", "PROYECTO", "PSIQUIATRICO", "PUEBLO", "PUERTA", "PULPO", "PUNTO",
				"QUIROFANO", "QUITANIEVES", "RABANO", "RAIZ", "RAMA", "RAMO", "RANA", "RATA", "RATON", "RAYO", "RAZON",
				"REALIDAD", "REBELDE", "RECUERDO", "REDUCCION", "REGION", "RELACION", "RELIGION", "REPRESENTANTE",
				"REPRODUCCION", "RESFRIADO", "RESPUESTA", "RESULTADO", "RETROCESO", "REUNION", "REVISTA", "RIO",
				"RODILLA", "ROJO", "ROPA", "ROSA", "ROSADO", "RUTA", "SABADO", "SACACORCHOS", "SAL", "SALTAMONTES",
				"SALUD", "SANDIA", "SANGRE", "SARDINA", "SARTEN", "SECRETO", "SECTOR", "SECUENCIA", "SEGUNDO",
				"SEGURIDAD", "SEIS", "SELVA", "SEMANA", "SEMILLA", "SENADOR", "SENSACION", "SENTIDO", "SEÑOR", "SEÑORA",
				"SER", "SERIE", "SERPIENTE", "SERVICIO", "SIETE", "SIGLO", "SIGNIFICADO", "SILLA", "SIMBOLO",
				"SIMILITUD", "SISTEMA", "SITUACION", "SOBRINA", "SOBRINO", "SOCIEDAD", "SOFA", "SOL", "SOLAPA",
				"SOLICITUD", "SOLUCION", "SORPRESA", "SOSTEN", "SUBTERRANEO", "SUELO", "SUGERENCIA", "SUJETADOR",
				"SUPERFICIE", "SUR", "SUSTO", "TACTO", "TALLO", "TALON", "TAMAÑO", "TARDE", "TARIFA", "TEMA", "TEMOR",
				"TERMOSTATO", "TERREMOTO", "TEXTO", "TIA", "TIEMPO", "TIERRA", "TIGRE", "TIO", "TIPO", "TODOTERRENO",
				"TOMATE", "TORMENTA", "TOTAL", "TRABAJO", "TRAFICO", "TRANCAR", "TRANSACCION", "TRANSCURSO", "TRANSITO",
				"TRANSPORTE", "TRAPECIO", "TRASERO", "TREN", "TRES", "TRIGO", "TRISTEZA", "TRUENO", "UNICORNIO",
				"UNIDAD", "UNIVERSIDAD", "UNIVERSO", "UNO", "UÑA", "USO", "UTILIZACION", "VACA", "VALOR", "VAPOR",
				"VEGETAL", "VEHICULO", "VELOCIDAD", "VENTANA", "VENTILADOR", "VERDAD", "VERDE", "VERDURA", "VESTIDO",
				"VEZ", "VIA", "VIDA", "VIENTO", "VIERNES", "VILLA", "VIOLETA", "VIRUS", "VISTA", "VOLUMEN", "VOZ",
				"VUELTO", "YEGUA", "ZANAHORIA", "ZAPATILLA", "ZAPATO", "ZONA" };

		do {
			numAzar = azar.nextInt(vDiccionario.length);
			palabra = vDiccionario[numAzar];
		} while (vDiccionario[numAzar].equals(""));

		return palabra;
	}

	// LETRA VALIDA
	public static boolean letraValida(String userInput) {
		boolean letraValida = false;
		String numeros = "1234567890";

		if (userInput.length() == 1) {
			for (int i = 0; i < numeros.length(); i++) {
				if (userInput.substring(0, 1).equals(numeros.substring(i, i + 1))) {
					letraValida = false;
					break;
				} else {
					letraValida = true;
				}
			}
		}

		return letraValida;
	}

	// MOSTRAR LETRAS JUGADAS
	public static void mostrarLetrasJugadas(String vLetrasJugadas[], String vPalabraOculta[]) {
		System.out.print("  Letras jugadas: ");
		for (int i = 0; i < vLetrasJugadas.length; i++) {
			System.out.print(vLetrasJugadas[i]);
		}

		System.out.println();
		System.out.println();
	}

	// COMPARAR INPUT
	public static boolean compararInput(String userInput, String palabra, String vPalabraOculta[],
			String vLetrasJugadas[], String letrasAcertadas) {

		boolean exito, letraYaJugada;

		exito = false;
		letraYaJugada = false;

		for (int i = 0; i < vLetrasJugadas.length; i++) {
			if (userInput.equals(vLetrasJugadas[i])) {
				letraYaJugada = true;
				break;
			} else {
				if (vLetrasJugadas[i].equals("")) {
					vLetrasJugadas[i] = userInput;
					break;
				}
			}
		}

		for (int i = 0; i < userInput.length(); i++) {
			for (int j = 0; j < palabra.length(); j++) {
				if (userInput.substring(i, i + 1).equalsIgnoreCase(palabra.substring(j, j + 1))) {
					vPalabraOculta[j] = userInput;
					exito = true;
				}
			}
		}

		if (letraYaJugada == true) {
			exito = true;
		}
		return exito;
	}

	// RESTAR VIDA //
	public static int restarVida(int vidas) {
		vidas--;
		return vidas;
	}

	// IMPRIMIR DIBUJO
	public static void imprimirDibujo(int vidas) {

		switch (vidas) {
		case 7: {
			System.out.println("  _______________________");
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
			System.out.println("  _______________________");
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
			System.out.println("  _______________________");
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
			System.out.println("  _______________________");
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
			System.out.println("  _______________________");
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
			System.out.println("  _______________________");
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
			System.out.println("  _______________________");
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
		}

		System.out.println();
	}

	// IMPRIMIR PALABRA
	public static void imprimirPalabra(String palabra, String vPalabraOculta[], int vidas) {

		System.out.print("  ->  ");

		for (int i = 0; i < vPalabraOculta.length; i++) {
			System.out.print(vPalabraOculta[i] + " ");
		}

		System.out.print(" <-");

//		System.out.println(" (" + palabra + ")");    // Esto muestra la palabra al lado de vPalabraOculta

		System.out.println();
		System.out.println();

	}

	// COMPROBAR VICTORIA
	public static boolean comprobarVictoria(String vPalabraOculta[]) {
		boolean win = true;

		for (int i = 0; i < vPalabraOculta.length; i++) {
			if (vPalabraOculta[i].equals("_")) {
				win = false;
				break;
			}
		}

		return win;

	}

	// FIN DE PARTIDA
	public static boolean finPartida(boolean win, String palabra) {
		Scanner leer = new Scanner(System.in);
		String userInput = "";
		boolean salir = false, error = false;

		if (win == true) {
			System.out.println("  _______________________");
			System.out.println(" |                       |");
			System.out.println(" |       ________        |");
			System.out.println(" |       | /             |");
			System.out.println(" |       |/   \\O/        |");
			System.out.println(" |       |     |         |");
			System.out.println(" |       |   _/_\\_       |");
			System.out.println(" |      /|\\  |   |       |");
			System.out.println(" |     /_|_\\_|___|_      |");
			System.out.println(" |                       |");
			System.out.println(" |_______________________|");
			System.out.println();
			System.out.println("       ¡HAS GANADO!");
			System.out.println("  La palabra era " + palabra.toUpperCase());
			System.out.println();
			System.out.println();
		} else {
			System.out.println("  _______________________");
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
			System.out.println();
			System.out.println("       GAME OVER");
			System.out.println("  La palabra era " + palabra.toUpperCase());
			System.out.println();
			System.out.println();

		}

		do {
			System.out.print("¿Quieres jugar otra vez? (S/N): ");
			userInput = leer.next();

			if (userInput.equalsIgnoreCase("s")) {
				salir = false;
				error = false;
			} else {
				if (userInput.equalsIgnoreCase("n")) {
					salir = true;
					error = false;
				} else {
					if (userInput.equalsIgnoreCase("about")) {
						about();
					}
					error = true;
				}
			}
		} while (error);

		return salir;

	}
	
	// ABOUT
	public static void about() {
		
		System.out.println("\n------------------------------");
		System.out.println("|  ACERCA DE  Javangman 1.5  |");
		System.out.println("------------------------------");
		System.out.println("|    Programado con Java.    |");
		System.out.println("|                            |");
		System.out.println("|  (c) Tomás Generelo, 2020  |");
		System.out.println("------------------------------\n");
	}

}
