package s15_POO;

import java.util.Arrays;

public class ExplicarPasoReferencia {

	public static void main(String[] args) {
		
		int value = 5;
		sumar(value);
		System.out.println("main "+ value);
		
		int[] arr = {1,2,3,4 };
		mostrarArr(arr);
		
		System.out.println(arr);
		
		System.out.println("main: "+Arrays.toString(arr));
	}
	
	public static void mostrarArr(int[] arr) {
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		arr2[1]= 4;
		arr2[2]= 88;
		System.out.println("mostrar: "+Arrays.toString(arr2));
		
	}

	public static void sumar(int value) {
		value = value + 3333;
		System.out.println("sumar:"+value);
		
	}

}
