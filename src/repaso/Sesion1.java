package repaso;

import java.util.Scanner;

public class Sesion1 {
	
	public static void main(String[] args) {
		
		
		Scanner entrada_escaner = new Scanner(System.in);
		
		int alumnos;
		int alumnas;
		int total; 
		double porcentajeAlumnos;
		double porcentajeAlumnas;
		
		System.out.println("Dame cuantos alumnos hay?");
		alumnos = entrada_escaner.nextInt();
		
		System.out.println("Dame cuantos alumnas hay?");
		alumnas = entrada_escaner.nextInt();
		
		total = alumnos + alumnas; 
		System.out.println("total"+total);
		
		porcentajeAlumnos = (alumnos * 100)/total;
		porcentajeAlumnas = (alumnas * 100)/total;
		
		System.out.println("PorcentajeAlumnos:"+porcentajeAlumnos);
		System.out.println("PorcentajeAlumnas:"+porcentajeAlumnas);	
	}
	
}