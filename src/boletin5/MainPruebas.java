package boletin5;

import java.util.Scanner;

public class MainPruebas {

	public static void main(String[] args) {
		
		/*Ej6MetodoDeAcceso acceso = new Ej6MetodoDeAcceso("pepe", "1234");
		System.out.println(acceso);
		System.out.println("estadoConectado:" +acceso.estadoConectado());
		System.out.println("estadoBloqueado:" +acceso.estaBloqueado());
		System.out.println("intentos:" +acceso.obtenerNumeroIntentos());
		
		System.out.println(acceso.conectado("ddd", "222"));
		System.out.println("estadoConectado:" +acceso.estadoConectado());
		System.out.println("estadoBloqueado:" +acceso.estaBloqueado());
		System.out.println("intentos:" +acceso.obtenerNumeroIntentos());
		
		System.out.println(acceso.conectado("pepe", "1234"));
		System.out.println("estadoConectado:" +acceso.estadoConectado());
		System.out.println("estadoBloqueado:" +acceso.estaBloqueado());
		System.out.println("intentos:" +acceso.obtenerNumeroIntentos());
		
		System.out.println(acceso.desconectar());
		System.out.println("estadoConectado:" +acceso.estadoConectado());
		System.out.println("estadoBloqueado:" +acceso.estaBloqueado());
		System.out.println("intentos:" +acceso.obtenerNumeroIntentos());
		

	}*/
//	Ej8JuegoAdivinar juego = new Ej8JuegoAdivinar();
//	//Ej8JuegoAdivinar juego2 = new Ej8JuegoAdivinar(60);
//	
////	System.out.println(juego.nuevoIntento(50));
////	System.out.println(juego.nuevoIntento(70));
////	System.out.println(juego.nuevoIntento(60));
////	
////	System.out.println(juego);
////	
////	juego.nuevaPartida();
//	
//	// Una interfaz donde el usuario va metiendo numeros hasta que reciba el "ACERTASTES".
//	Scanner entradaEscaner = new Scanner(System.in);
//	String respuesta="";
//	do {
//		System.out.println("Usuario introduzca un numero");
//		respuesta = juego.nuevoIntento(entradaEscaner.nextInt());
//		System.out.println("resultado: "+respuesta);
//	}while(respuesta!="ACERTASTES");

	Ej9ConversorEuros.convertirDivisas(222,Ej9ConversorEuros.CONVERTIR_LIBRA);
	Ej9ConversorEuros.convertirDivisas(100, Ej9ConversorEuros.CONVERTIR_YEN);
	Ej9ConversorEuros.convertirDivisas(100, "AFDSFA");
	
	Ej9ConversorEuros.convertirDivisas(100);




	}

}
