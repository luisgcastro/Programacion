package sesion11;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2_Boletin4_Array1D {
	
	private static int i;

	public static void main (String[] args) {
		
	
	
	
	final int NUMERO_ELEMENTOS = 5;
	Scanner entrada_escaner = new Scanner(System.in);
	
	String[] vectorStrings = new String[NUMERO_ELEMENTOS];
	
	mostrarContenidoVector(vectorStrings);
	for (int i = 0; i < vectorStrings.length; i++) {
		System.out.println("introduzca un vector para la posición:" +i);
		vectorStrings[i] = entrada_escaner.nextLine();
	}
	mostrarContenidoVector(vectorStrings);
}

public static void mostrarContenidoVector(String[] vector) {
	
	
//	for (int = 0; i < vector.length; i++) {
//		System.out.println(vector[i]);
		
//	}
	
	System.out.println(Arrays.toString (vector));
	
	
}
	
	
	
	

}
