package boletines.boletin3C.bol3_POO.Apartado1.Ej4;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {
		
final int NUMERO_MAXIMO_LIBROS = 30;
		
		Book libroSeñorAnillos = new Book("SeñorDeLosAnillos", 1234, "Manolete", "Chungitos");
		libroSeñorAnillos.setEditor("JuancosS.A.");
		
		Book[] conjuntoLibros = new Book[NUMERO_MAXIMO_LIBROS];
		for (int i = 0; i < conjuntoLibros.length; i++) {
			conjuntoLibros[i] = libroSeñorAnillos;
		}
		
		// Ver resultado.
		System.out.println(Arrays.toString(conjuntoLibros));
		
		Book book_recuperado = conjuntoLibros[1];
		book_recuperado.setNombre("pepe");
	}
		
	

}
