package boletin3;
import java.util.Scanner;

public class ej17 {
	
	





	public static void main(String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		
		int num1 = entradaEscaner.nextInt();
		int num2 = entradaEscaner.nextInt();
		int num3 = entradaEscaner.nextInt();
		int num4 = entradaEscaner.nextInt();
		int num5 = entradaEscaner.nextInt();
		
		int contadorImparesObtenido = contadorImpar(num1, num2, num3, num4, num5);
		System.out.println("ContadorImparesObtenido: "+contadorImparesObtenido);
	}
	
	public static int contadorImpar(int num1, int num2, int num3, int num4, int num5) {
		int contador_impares = 0;
		if (num1%2==0) {
			System.out.println("Par encontrado: "+num1);
		}else {
			contador_impares++;
		}
		
		if (num2%2==0) {
			System.out.println("Par encontrado: "+num2);
		}else {
			contador_impares++;
		}
		
		if (num3%2==0) {
			System.out.println("Par encontrado: "+num3);
		}else {
			contador_impares++;
		}
		
		if (num4%2==0) {
			System.out.println("Par encontrado: "+num4);
		}else {
			contador_impares++;
		}
		
		if (num5%2==0) {
			System.out.println("Par encontrado: "+num5);
		}else {
			contador_impares++;
		}
		
		return contador_impares;
	}

}

