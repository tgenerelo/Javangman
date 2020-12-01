package javangman;

import java.util.Random;
import java.util.Scanner;

public class Metodos {
	
	static String vDiccionario[] = { "ABANDONO","ABDOMEN","ABRIGO","ABUELA","ABUELO","ABURRIMIENTO","ACCION","ACELERACION","ACIERTO","ACTITUD","ACTIVIDAD","ACTO","ACTUACION","ACUERDO","ADMINISTRACION","ADOLESCENTE","ADULTO","AEROPUERTO","AGUA","AGUJA","AIRE","AJEDREZ","ALBONDIGA","ALCALDE","ALEGRIA","ALEMAN","ALFABETO","ALIMENTO","ALMA","ALMACEN","ALMENDRA","ALTO","ALTURA","ALUMNADO","AMANECER","AMAPOLA","AMARILLO","AMBIENTE","AMBULANCIA","AMIGA","AMIGO","AMOR","ANALISIS","ANARANJADO","ANATOMIA","ANCHO","ANCIANO","ANIMAL","ANOCHECER","AÑO","APARATO","APARTAMENTO","APERITIVO","APOYO","ARBOL","AREA","ARITMETICA","ARMA","ARRIBA","ARROZ","ARTE","ARTICULO","ASCENSOR","ASFALTO","ASOCIACION","ASPECTO","ASTRONAUTA","ATAQUE","ATARDECER","ATENCION","ATMOSFERA","AUMENTO","AUTO","AUTOBUS","AUTOMOVIL","AUTOPISTA","AUTOR","AUTORIDAD","AVANCE","AVENA","AVENIDA","AVION","AYER","AYUDA","AZUL","BAMBU","BARBA","BARRO","BASE","BEBE","BEBIDA","BENEFICIO","BIENVENIDA","BIGOTE","BILLETE","BISABUELA","BISABUELO","BISNIETA","BISNIETO","BLANCO","BOCA","BOLETO","BOLSA","BOLSILLO","BOLSO","BOMBEROS","BOMBILLA","BOSQUE","BOTON","BRAGA","BRAZO","BROMISTA","BUS","BUSQUEDA","CABALLERO","CABELLO","CABEZA","CABO","CADERA","CAFE","CAFETERIA","CALCETINES","CALENDARIO","CALIDAD","CALLE","CALOR","CALZON","CALZONCILLO","CAMA","CAMARA","CAMBIO","CAMINO","CAMION","CAMISA","CAMISETA","CAMPAÑA","CAMPO","CAMUFLAJE","CANSANCIO","CANTIDAD","CAPACIDAD","CAPITAL","CARA","CARACTER","CARACTERISTICA","CARGO","CARNE","CARPA","CARRERA","CARRETERA","CARTA","CASA","CASO","CASTAÑA","CASTAÑO","CASTILLO","CAUSA","CAVERNA","CEBADA","CELESTE","CENTIMETRO","CEREBRO","CERO","CERRO","CERVEZA","CESPED","CHAQUETA","CHINO","CHOCOLATE","CHUBASQUERO","CIELO","CIEN","CIENCIA","CIENTO","CIERRE","CINCO","CINE","CINTURA","CINTURON","CIRCENSE","CIRUELA","CIRUJANO","CIUDAD","CLASE","CLAVO","CLIMA","CLUB","COCHE","COCOTERO","CODIGO","CODO","COLA","COLEGA","COLEGIO","COLOR","COMA","COMERCIO","COMIDA","COMIENZO","COMISION","COMPAÑIA","COMPETENCIA","COMPETICION","COMPUTADORA","COMUNICACION","COMUNIDAD","CONCEPTO","CONCIENCIA","CONDICION","CONEXION","CONFIANZA","CONFLICTO","CONGRESISTA","CONGRESO","CONJUNTO","CONOCIDA","CONOCIDO","CONOCIMIENTO","CONSECUENCIA","CONSEJO","CONSTITUCION","CONSTRUCCION","CONSUMO","CONTENIDO","CONTROL","CORAZON","CORDEL","CORDON","CORRIENTE","CORTE","COSA","COSTA","CREACION","CRECIMIENTO","CREMA","CREMALLERA","CRIATURA","CRISIS","CUADRO","CUARTO","CUATRO","CUELLO","CUENTA","CUERDA","CUERPO","CUESTION","CULO","CULTURA","CURA","CURSO","DAMA","DATO","DECADA","DECISION","DECRETO","DEDO","DEFENSA","DELTA","DEMANDA","DEMOCRACIA","DEPARTAMENTO","DEPORTE","DERECHA","DERECHO","DESARROLLO","DESCAPOTABLE","DESEO","DESIERTO","DESPEJADO","DESTINO","DESTRUCCION","DETERIORO","DIA","DIAGONAL","DIARIO","DIARREA","DIBUJO","DICCIONARIO","DICTADURA","DIENTE","DIEZ","DIFERENCIA","DIMINUTO","DINERO","DINOSAURIO","DIOS","DIPUTADO","DIRECCION","DIRECTOR","DOCUMENTO","DOLOR","DOMINGO","DORMITORIO","DOS","DUCHA","DUDA","DURAZNO","ECONOMIA","EDAD","EDIFICIO","EDUCACION","EFECTO","EJEMPLO","ELECCION","ELECTRICIDAD","ELEMENTO","ELEVADOR","EMPATIA","EMPERADOR","EMPERATRIZ","EMPLEO","EMPRESA","ENAMORADO","ENCUENTRO","ENERGIA","ENFADO","ENFERMEDAD","ENOJO","ENTORNO","ENTRADA","ENTRESEMANA","ENTRETENIMIENTO","EPOCA","EPOPEYA","EQUIPO","EQUIVOCACION","ERA","ERROR","ESCALA","ESCALERA","ESCRITORIO","ESCUELA","ESCULTURA","ESFUERZO","ESPACIO","ESPALDA","ESPAÑOL","ESPECIE","ESPECTACULO","ESPECTADOR","ESPERA","ESPINILLA","ESPIRITU","ESPOSA","ESPOSO","ESTACION","ESTADO","ESTE","ESTILO","ESTOMAGO","ESTRELLA","ESTRUCTURA","ESTUDIO","ETAPA","EXISTENCIA","EXITO","EXPERIENCIA","EXPRESION","EXTASIS","EXTERIOR","FABRICA","FALDA","FALTA","FAMILIA","FASE","FAVOR","FECHA","FERROCARRIL","FIGURA","FIN","FINAL","FLOR","FONDO","FORMA","FORMACION","FORMALIDAD","FRACASO","FRANCES","FRENTE","FRUTA","FUEGO","FUENTE","FUERZA","FUNCION","FUTURO","GAFAS","GALAXIA","GAS","GASEOSA","GENTE","GEOGRAFIA","GOBERNADOR","GOBIERNO","GRABADO","GRADO","GRAMO","GRIPE","GRIS","GRUPO","GUERRA","GUISANTE","HABITACION","HERMANA","HERMANO","HIELO","HIERRO","HIGADO","HIJA","HIJO","HILO","HISTORIA","HOGAR","HOJA","HOMBRE","HOMBRO","HONGO","HORA","HORTICULTURA","HOTEL","HOY","HUESO","HUMANIDAD","HUMANO","IDEA","IDIOMA","IMAGEN","IMAN","INFORMACION","INFORME","INGLES","INICIO","INSTANTE","INSTITUTO","INTENDENTE","INTENTO","INTERES","INTERIOR","INTERRUPCION","INVESTIGACION","IZQUIERDA","JAPONES","JUDIA","JUEVES","JUNGLA","KILO","KILOMETRO","KIWI","LABIO","LADO","LADRON","LAGO","LAGUNA","LAMINA","LARGO","LEÑA","LEY","LIBERTAD","LIBRO","LITRO","LLAVE","LLAVERO","LLUVIA","LODO","LOGRO","LONGITUD","LUGAR","LUNA","LUNES","LUZ","MADRE","MANDARINA","MANERA","MANGA","MANIQUI","MANO","MANZANA","MAÑANA","MAQUINA","MAR","MARRON","MARTES","MATRIMONIO","MAYORIA","MEDIDA","MEDIODIA","MEJORA","MEMORIA","MENTE","MENTIRA","MERCADO","MERCENARIO","MES","MESA","MESILLA","META","METAL","METALICO","METRO","MIEDO","MIERCOLES","MIL","MILENIO","MILIMETRO","MILLON","MINISTRO","MINORIA","MINUTO","MODO","MOMENTO","MONTAÑA","MONTE","MOVIMIENTO","MUERTE","MUJER","MULTICOLOR","MUNDO","MUNICIPIO","MUÑECA","MURCIELAGO","MUSCULO","MUSICA","MUSLO","NACIMIENTO","NACION","NADA","NARANJA","NARIZ","NATURALEZA","NECESIDAD","NEGRO","NEVERA","NIETA","NIETO","NIEVE","NIÑA","NIÑO","NIVEL","NOCHE","NOMBRE","NORMA","NORTE","NOTICIA","NUBLADO","NUDO","NUEVE","NUEZ","NUMERO","OBJETIVO","OBJETO","OBLIGACION","OBRA","OCASION","OCEANO","OCHO","OESTE","OFERTA","OFICINA","OIDO","OJO","OLFATO","OMNIBUS","ORDEN","ORDENADOR","OREJA","ORGANIZACION","ORIGEN","ORO","ORQUESTA","PADRE","PAIS","PALABRA","PALMA","PANEL","PANTALLA","PANTALON","PAPA","PAPEL","PARADA","PARAGUAS","PARASOL","PARBULARIO","PAREJA","PARLAMENTARIO","PARTE","PARTIDO","PASADO","PASO","PASTO","PATA","PATATA","PAZ","PECHO","PENSAMIENTO","PERA","PERCEPCION","PERIODICO","PERIODISMO","PERIQUITO","PERJUICIO","PERMISO","PERSONA","PERSONALIDAD","PESO","PIE","PIEL","PIERNA","PINO","PINTURA","PISO","PLACER","PLANETA","PLANTA","PLATA","PLATANO","PLAYA","PLOMO","POBLACION","POLICIA","POLITICA","POLITICO","POMO","POSIBILIDAD","POSICION","POTENCIA","POZO","PRECIO","PREGON","PREGUNTA","PRENDA","PRESENCIA","PRESENTE","PRESIDENTE","PRIMA","PRIMO","PRINCIPIO","PROBABILIDAD","PROBLEMA","PROCESO","PRODUCCION","PRODUCTO","PROFESION","PROGRAMA","PROGRAMADOR","PROGRESO","PROHIBICION","PROVINCIA","PROYECTO","PSIQUIATRICO","PUEBLO","PUERTA","PUNTO","QUIROFANO","QUITANIEVES","RABANO","RAIZ","RATA","RAYO","RAZON","REALIDAD","REBELDE","RECUERDO","REDUCCION","REGION","RELACION","RELIGION","REPRESENTANTE","REPRODUCCION","RESFRIADO","RESPUESTA","RESULTADO","RETROCESO","REUNION","REVISTA","RIO","RODILLA","ROJO","ROPA","ROSA","ROSADO","RUTA","SABADO","SACACORCHOS","SAL","SALUD","SANDIA","SANGRE","SARTEN","SECRETO","SECTOR","SECUENCIA","SEGUNDO","SEGURIDAD","SEIS","SELVA","SEMANA","SEMILLA","SENADOR","SENSACION","SENTIDO","SEÑOR","SEÑORA","SER","SERIE","SERVICIO","SIETE","SIGLO","SIGNIFICADO","SILLA","SIMBOLO","SIMILITUD","SISTEMA","SITUACION","SOBRINA","SOBRINO","SOCIEDAD","SOFA","SOL","SOLAPA","SOLICITUD","SOLUCION","SORPRESA","SOSTEN","SUBTERRANEO","SUELO","SUGERENCIA","SUJETADOR","SUPERFICIE","SUR","SUSTO","TACTO","TALLO","TALON","TAMAÑO","TARDE","TARIFA","TEMA","TEMOR","TERMOSTATO","TERREMOTO","TEXTO","TIA","TIEMPO","TIERRA","TIO","TIPO","TODOTERRENO","TOMATE","TORMENTA","TOTAL","TRABAJO","TRAFICO","TRANCAR","TRANSACCION","TRANSCURSO","TRANSITO","TRANSPORTE","TRAPECIO","TRASERO","TREN","TRES","TRIGO","TRISTEZA","TRUENO","UNICORNIO","UNIDAD","UNIVERSIDAD","UNIVERSO","UNO","UÑA","USO","UTILIZACION","VALOR","VAPOR","VEGETAL","VEHICULO","VELOCIDAD","VENTANA","VENTILADOR","VERDAD","VERDE","VERDURA","VESTIDO","VEZ" };
	static String vDiccionarioPaises[]= {"AFGANISTAN","ALBANIA","ALEMANIA","ANDORRA","ARGELIA","ARGENTINA","ARMENIA","AUSTRALIA","AUSTRIA","AZERBAIYAN","BAHAMAS","BARBADOS","BIELORRUSIA","BELGICA","BELICE","BUTAN","BOLIVIA","BOTSUANA","BRASIL","BULGARIA","BURUNDI","CAMBOYA","CAMERUN","CANADA","CHEQUIA","CHILE","CHINA","CHIPRE","COLOMBIA","CROACIA","CUBA","DINAMARCA","DOMINICA","ECUADOR","EGIPTO","EL SALVADOR","EMIRATOS ARABES UNIDOS","ESLOVAQUIA","ESLOVENIA","ESPAÑA","ESTADOS UNIDOS","ESTONIA","ETIOPIA","FILIPINAS","FINLANDIA","FRANCIA","GEORGIA","GRANADA","GRECIA","GUATEMALA","GUINEA ECUATORIAL","HAITI","HONDURAS","HUNGRIA","INDIA","INDONESIA","IRAN","IRAQ","IRLANDA","ISLANDIA","ISRAEL","ITALIA","JAMAICA","JAPON","JORDANIA","KAZAJISTAN","KENIA","KUWAIT","LAOS","LETONIA","LIBANO","LIBERIA","LIBIA","LIECHTENSTEIN","LITUANIA","LUXEMBURGO","MACEDONIA","MADAGASCAR","MALASIA","MALAUI","MALDIVAS","MALTA","MARRUECOS","MAURICIO","MAURITANIA","MEXICO","MICRONESIA","MOLDAVIA","MONACO","MONGOLIA","MONTENEGRO","MOZAMBIQUE","BIRMANIA","NAMIBIA","NEPAL","NICARAGUA","NIGER","NIGERIA","NORUEGA","NUEVA ZELANDA","OMAN","PAISES BAJOS","PAKISTAN","PANAMA","PAPUA NUEVA GUINEA","PARAGUAY","PERU","POLONIA","PORTUGAL","QATAR","REINO UNIDO","REPUBLICA DOMINICANA","RUMANIA / RUMANIA","RUSIA","SAMOA","SAN MARINO","CIUDAD DEL VATICANO","SENEGAL","SERBIA","SEYCHELLES","SIERRA LEONA","SINGAPUR","SIRIA","SOMALIA","SRI LANKA","SUDAFRICA","SUDAN","SUECIA","SUIZA","TAILANDIA","TANZANIA","TRINIDAD Y TOBAGO","TUNEZ","TURKMENISTAN","TURQUIA","TUVALU","UCRANIA","UGANDA","URUGUAY","UZBEKISTAN","VENEZUELA","VIETNAM","YEMEN","ZAMBIA","ZIMBABUE"};
	static String vDiccionarioAstro[]= {"SISTEMA SOLAR","TIERRA","MARTE","VENUS","ESTRELLA","MERCURIO","LUNA","PHOBOS","DEIMOS","JUPITER","SATURNO","URANO","NEPTUNO","PLUTON","CARONTE","IO","EUROPA","AGUJERO NEGRO","GALAXIA","SUPERNOVA","COMETA","ASTEROIDE","TELESCOPIO","OBSERVATORIO","SATELITE","COSMOS","CONSTELACION","CUMULO","ENANA ROJA","ENANA BLANCA","ENANA MARRON","VACIO","UNIDAD ASTRONOMICA","CIELO","CRATER","GANIMEDES","CERES","ATMOSFERA","PLANETA ENANO","NEBULOSA","METEORITO","ORBITA","COHETE","TRANSBORDADOR ESPACIAL","ESTACION ESPACIAL","ESPACIO","SOL","ANTIMATERIA","ECLIPSE","GRAVEDAD","UMBRA","BIG BANG","UNIVERSO","RAYO COSMICO","PULSAR","NOVA","MATERIA OSCURA","MANCHA SOLAR","EXOPLANETA","ONDA GRAVITATORIA","LUZ","AÑO LUZ","ASTRONAUTA","COSMONAUTA","AURORA"};
	static String vDiccionarioAnimales[]= {"ABEJA","AGUILA","ALMEJA","ANTILOPE","ARAÑA","ARDILLA","ATUN","AVE","AVESTRUZ","AVISPA","BABOSA","BACALAO","BALLENA","BICHO","BOA","BUEY","BUFALO","BUITRE","BURRO","CABALLO","CABRA","CALAMAR","CAMARON","CAMELLO","CANARIO", "CANICHE","CANGREJO","CANGURO","CARACOL","CASTOR","CEBRA","CENTOLLO","CERDO","CHIMPANCE","CIERVO","CIGARRA","CIGÜEÑA","CISNE","COCODRILO","CODORNIZ","COMADREJA","CONEJO","CORDERO","CRUSTACEO","CUCARACHA","CUERVO","DELFIN","DRAGON","DRAGON DE KOMODO","ELEFANTE","ERIZO","ERIZO DE MAR","ESCARABAJO","ESCORPION","FAISAN","FOCA","GACELA","GALLINA","GALLO","GAMBA","GARZA","GATO","GAVIOTA","GOLONDRINA","GORILA","GORRION","GRILLO","GUACAMAYO","GUSANO","HALCON","HIENA","HIPOPOTAMO","HORMIGA","INSECTO","JILGUERO","JIRAFA","KIWI","KOALA","LAGARTO","LANGOSTA","LECHUZA","LEON","LEOPARDO","LIEBRE","LINCE","LIRON","LLAMA","LOBO","LOMBRIZ","LORO","MAMIFERO","MARIPOSA","MARIQUITA","MARISCO","MARMOTA","MEJILLON","MIRLO","MOLUSCO","MONO","MOSCA","MOSQUITO","MURCIELAGO","NUTRIA","OCA","OSO","OSTRA","OVEJA","PAJARO","PAJARO CARPINTERO","PALOMA","PANTERA","PATO","PAVO","PAVO REAL","PELICANO","PERDIZ","PERIQUITO","PERRO","PEZ","POLILLA","POLLO","PULPO","RANA","RATA","RATON","RENO","REPTIL","RINOCERONTE","RUISEÑOR","SALMON","SALTAMONTES","SARDINA","SERPIENTE","TARANTULA","TERNERO","TIGRE","TORO","TORTUGA","TRUCHA","VACA","VIBORA","YEGUA","ZORRO"};
	static String vDiccionarioInstrumentos[]= {"ACORDEON","ARMONICA","ARPA","BAJO ELECTRICO","BANDURRIA","BATERIA","BOMBO","BONGOS","CAJA CHINA","CAMPANA","CARRACA","CASTAÑUELAS","CELESTA","CENCERRO","CLARINETE","CONTRABAJO","CORNETA","DULZAINA","FAGOT","FLAUTA DE PAN","FLAUTA DULCE","FLAUTA TRAVESERA","GAITA","GONG","GUITARRA","GUITARRA ELECTRICA","LAUD","MARACAS","MARIMBA","OBOE","ORGANO","PANDERETA","PIANO","PIANOLA","SALTERIO","SAXOFON","SINTETIZADOR","TAMBOR","TECLADO","TIMBAL","TRIANGULO","TROMBON","TROMPA","TROMPETA","TUBA","UKELELE","VIOLA","VIOLIN","VIOLONCHELO","XILOFONO"};
	static String vDiccionarioEstados[]= {"ALABAMA","ALASKA","ARIZONA","ARKANSAS","CALIFORNIA","CAROLINA DEL NORTE","CAROLINA DEL SUR","COLORADO","CONNECTICUT","DAKOTA DEL NORTE","DAKOTA DEL SUR","DELAWARE","FLORIDA","GEORGIA","HAWAI","IDAHO","ILLINOIS","INDIANA","IOWA","KANSAS","KENTUCKY","LUISIANA","MAINE","MARYLAND","MASSACHUSETTS","MICHIGAN","MINESOTA","MISISIPI","MISURI","MONTANA","NEBRASKA","NEVADA","NUEVA JERSEY","NUEVA YORK","NUEVO HAMPSHIRE","NUEVO MEXICO","OHIO","OKLAHOMA","OREGON","PENSILVANIA","RHODE ISLAND","TENNESSEE","TEXAS","UTAH","VERMONT","VIRGINIA","VIRGINIA OCCIDENTAL","WASHINGTON","WISCONSIN","WYOMING"};
	static String vDiccionarioProfesiones[]= {"ABOGADO","ACTOR","POLICIA","AGRICULTOR","ALBAÑIL","ARQUEOLOGO","ARQUITECTO","ASTRONAUTA","BASURERO","BIOLOGO","BOMBERO","CAJERO","CAMARERO","CAMIONERO","CANTANTE","CARNICERO","CARPINTERO","CARTERO","CINEASTA","CIRUJANO","COCINERO","CONDUCTOR","CONSERJE","DENTISTA","EBANISTA","ECONOMISTA","ELECTRICISTA","ENFERMERO","ESCRITOR","ESTANQUERO","FARMACEUTICO","FISICO","FLORISTA","FONTANERO","FOTOGRAFO","FRUTERO","EMPRESARIO","INGENIERO","JARDINERO","REPOSTERO","CRISTALERO","MARINERO","MECANICO","MEDICO","METEOROLOGO","MINERO","MODISTA","PANADERO","PASTELERO","PAYASO","PELUQUERO","PERIODISTA","PESCADOR","POLITICO","PROFESOR","PROGRAMADOR","PSICOLOGO","PSIQUIATRA","RECEPCIONISTA","SECRETARIO","TAXISTA","VENDEDOR","VETERINARIO","ZAPATERO"};
	
	static String diccionario="";
	
	static int numCategorias=7, victoriasConsecutivas=0, record=0;
	
	/**
	 * INICIALIZAR VECTORES
	 * 
	 * @param palabra        La palabra escogida al azar para la partida.
	 * @param vPalabraOculta Vector que separa cada letra de la palabra y la
	 *                       sustituye por "_".
	 * @param vLetrasJugadas Vector que almacenará las letras jugadas durante la
	 *                       partida.
	 */
	public static void inicializarVectores(String palabra, String vPalabraOculta[], String vLetrasJugadas[]) {
		for (int i = 0; i < vPalabraOculta.length; i++) {
			if (palabra.substring(i, i + 1).equals(" ")) {
				vPalabraOculta[i] = "-";
			} else {
				vPalabraOculta[i] = "_";
			}

		}

		for (int i = 0; i < vLetrasJugadas.length; i++) {
			vLetrasJugadas[i] = "";
		}
	}

	/**
	 * ESCOGER PALABRA
	 * 
	 * @return Devuelve una palabra escogida al azar del diccionario
	 */
	public static String escogerPalabra() {

		Random azar = new Random();
		String palabra = "";
		int numAzar = 0;

		numAzar = azar.nextInt(numCategorias);
		diccionario="";

		switch (numAzar) {
		case 0: {
			numAzar = azar.nextInt(vDiccionarioPaises.length);
			palabra = vDiccionarioPaises[numAzar];
			diccionario="PAÍSES";
			break;
		}
		case 1: {
			numAzar = azar.nextInt(vDiccionario.length);
			palabra = vDiccionario[numAzar];
			diccionario="GENERAL";
			break;
		}
		case 2: {
			numAzar = azar.nextInt(vDiccionarioAstro.length);
			palabra = vDiccionarioAstro[numAzar];
			diccionario="ASTRONOMÍA";
			break;
		}
		case 3: {
			numAzar = azar.nextInt(vDiccionarioAnimales.length);
			palabra = vDiccionarioAnimales[numAzar];
			diccionario="ANIMALES";
			break;
		}
		case 4: {
			numAzar = azar.nextInt(vDiccionarioInstrumentos.length);
			palabra = vDiccionarioInstrumentos[numAzar];
			diccionario="INSTRUMENTOS MUSICALES";
			break;
		}
		case 5: {
			numAzar = azar.nextInt(vDiccionarioEstados.length);
			palabra = vDiccionarioEstados[numAzar];
			diccionario="ESTADOS DE EE.UU.";
			break;
		}
		case 6: {
			numAzar = azar.nextInt(vDiccionarioProfesiones.length);
			palabra = vDiccionarioProfesiones[numAzar];
			diccionario="PROFESIONES";
			break;
		}
		}

		return palabra;
	}

	/**
	 * LETRA VÁLIDA
	 * 
	 * @param userInput Letra introducida por el usuario.
	 * @return Devuelve si la letra aparece en la palabra o no.
	 */
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

	/**
	 * MOSTRAR LETRAS JUGADAS
	 * 
	 * @param vLetrasJugadas Vector con las letras jugadas durante la partida.
	 * @param vPalabraOculta Vector con las letras de la palabra separadas y
	 *                       sustituidas por "_".
	 */
	public static void mostrarLetrasJugadas(String vLetrasJugadas[], String vPalabraOculta[]) {
		System.out.print("  Letras jugadas: ");
		for (int i = 0; i < vLetrasJugadas.length; i++) {
			System.out.print(vLetrasJugadas[i]);
		}

		System.out.println();
		System.out.println();
	}

	/**
	 * COMPARAR INPUT
	 * 
	 * @param userInput       La letra introducida por el usuario.
	 * @param palabra         La palabra escogida al azar para la partida.
	 * @param vPalabraOculta  Vector con las letras de la palabra separadas y
	 *                        sustituidas por "_".
	 * @param vLetrasJugadas  Vector con las letras jugadas durante la partida.
	 * @param letrasAcertadas Las letras jugadas que están en la palabra.
	 * @return
	 */
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

	/**
	 * RESTAR VIDA
	 * 
	 * @param vidas La vida inicial del usuario.
	 * @return La vida final del usuario.
	 */
	public static int restarVida(int vidas) {
		vidas--;
		return vidas;
	}

	/**
	 * IMPRIMIR DIBUJO
	 * 
	 * @param vidas La vida actual del usuario
	 */
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

	/**
	 * IMPRIMIR PALABRA
	 * 
	 * @param palabra        La palabra escogida al azar para la partida.
	 * @param vPalabraOculta Vector con las letras de la palabra separadas y
	 *                       sustituidas por "_".
	 * @param vidas          La vida actual del usuario.
	 */
	public static void imprimirPalabra(String palabra, String vPalabraOculta[], int vidas) {

		System.out.print("  ->  ");

		for (int i = 0; i < vPalabraOculta.length; i++) {
			System.out.print(vPalabraOculta[i] + " ");
		}

		System.out.print(" <-");

//		System.out.println(" (" + palabra + ")");    	// Esto muestra la palabra al lado de vPalabraOculta.
		System.out.println();							// Una de estas dos líneas debe estar sin comentar.
		
		System.out.println();
		System.out.println("  Categoría: " + diccionario);
		System.out.println();


	}

	/**
	 * COMPROBAR VICTORIA
	 * 
	 * @param vPalabraOculta Vector con las letras de la palabra separadas y
	 *                       sustituidas por "_".
	 * @return Asigna un valor true si el usuario ha ganado la partida.
	 */
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

	/**
	 * FIN DE PARTIDA
	 * 
	 * @param win     Victoria o derrota del usuario.
	 * @param palabra La palabra escogida al azar para la partida.
	 * @return Devuelve si el usuario desea jugar otra patida o no.
	 */
	public static boolean finPartida(boolean win, String palabra) {
		int temp = 0;
		Scanner leer = new Scanner(System.in);
		String userInput = "";
		boolean salir = false, error = false;

		if (win == true) {
			for (int i = 0; i < 2; i++) {
				try {
					Thread.sleep(temp);
				} catch (InterruptedException ex) {

				}

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
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();

				temp = 400;

				try {
					Thread.sleep(temp);
				} catch (InterruptedException ex) {

				}

				System.out.println("  _______________________");
				System.out.println(" |                       |");
				System.out.println(" |       ________        |");
				System.out.println(" |       | /             |");
				System.out.println(" |       |/    O         |");
				System.out.println(" |       |    /|\\        |");
				System.out.println(" |       |   _/_\\_       |");
				System.out.println(" |      /|\\  |   |       |");
				System.out.println(" |     /_|_\\_|___|_      |");
				System.out.println(" |                       |");
				System.out.println(" |_______________________|");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();

			}

			try {
				Thread.sleep(temp);
			} catch (InterruptedException ex) {

			}

			victoriasConsecutivas++;
			
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
			if (victoriasConsecutivas>0) {
				if (victoriasConsecutivas>record) {
					record=victoriasConsecutivas;
				}
				System.out.println("  Victorias: " + victoriasConsecutivas);
			} else {
				System.out.println();
			}
			System.out.println("  Récord: " + record);
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
			System.out.println();
			System.out.println("        GAME OVER");
			System.out.println("  La palabra era " + palabra.toUpperCase());
			System.out.println();
			System.out.println();
			
			victoriasConsecutivas=0;

		}

		do {
			System.out.print(" ¿Quieres jugar otra vez? (S/N): ");
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

	/**
	 * ABOUT
	 */
	public static void about() {

		System.out.println("\n .---------------------------.");
		System.out.println(" | ACERCA DE Javangman 2.1.2 |");
		System.out.println(" |---------------------------|");
		System.out.println(" |    Programado con Java    |");
		System.out.println(" |                           |");
		System.out.println(" |       " + (vDiccionarioProfesiones.length + vDiccionario.length + vDiccionarioPaises.length + vDiccionarioAstro.length + vDiccionarioAnimales.length + vDiccionarioInstrumentos.length + vDiccionarioEstados.length) + " palabras       |");
		System.out.println(" |                           |");
		System.out.println(" |      Agradecimientos      |");
		System.out.println(" |        Paula Béjar        |");
		System.out.println(" |                           |");
		System.out.println(" |  (c)Tomás Generelo, 2020  |");
		System.out.println(" ·---------------------------·\n");
	}

}
