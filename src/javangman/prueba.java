package javangman;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palabra="";
		String palabra2="asiudrnvasdry";
		
		for (int i=0; i<5; i++) {
			palabra=palabra+palabra2.substring(i, i+1);
		}
		
		System.out.println(palabra);
		
	}

}
