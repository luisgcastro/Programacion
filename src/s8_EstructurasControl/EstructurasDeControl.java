package s8_EstructurasControl;

import java.util.Scanner;
import java.util.scanner;


public class EstructurasDeControl {
	public static void main(String[] args) {
		
		Scanner entrada_escaner = new Scanner(System.in);
		System.out.println("Escribe la nota del alumno");
		double nota = entrada_escaner.nextDouble();
		
		if (nota >= 0) {
			System.out.println("Nota válida");
			
			if (nota >= 5) {
				System.out.println("El alumno ha aprobado");
				if (nota == 10 ) {
					System.out.println("El alumno ha conseguido matrícula");
					
					
				}
				else { 
					System.out.println("El alumno no ha conseguido matrícula");
					
				}
				
			} else {System.out.println("El alumno ha suspendido");

			}
			
			
		}
		
		
	}

}
