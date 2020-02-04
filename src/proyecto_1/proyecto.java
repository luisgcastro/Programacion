package proyecto_1;
/**
 * @author luisgarciacastro
 * Version 1.0
 * 
 * 
 * 
 */
import java.util.Scanner;
/**
 * 
 * @author luisgarciacastro
 * @exception proyecto
 * 
 */

public class proyecto {
	
	private static final String Luis = null;
/**
 * Esta clase crea un método calculadora, que nos realiza una suma y una resta de los númeroas que introducimos.
 * @param args
 */
	public static void main(String[] args) {
		Scanner escaner =new Scanner(System.in);
		int numero1=0;
		int numero2=0;
		System.out.println("Intrduce un número");
		numero1=escaner.nextInt();
		
		
		System.out.println("Introduce un numero");
		numero2=escaner.nextInt();
		
		int suma = numero1+ numero2;
		
		
		System.out.println("La suma es" + suma);
		
		int resta = numero1 - numero2;
		
		System.out.println("la resta es " + resta);
	
		if (suma == 0) ;
		System.out.println("La suma es correcta" );
		if (resta == 0) ;
		 System.out.println("la suma y la resta son correctas");
		
		
		String nombre=new String("nombre");
		
		System.out.println("Introduce tu nombre");
		nombre=escaner.nextLine();
		
		if (nombre == Luis );
		System.out.println("el nombre es correcto");
		
		
		
			
			
				
		
				
				
				
				
	}

	
	

}
