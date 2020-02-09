package sesion11;

import java.util.Arrays; 

/**
 * 
 * @author luisgarciacastro
 *Boletin Extra Arrays Ej1
 */


public class ExtraArray_Ej1_Array2D {
	
	
	public static void main(String[] args) {
		int [][] matriz = new int[3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=(i*3)+j;
				
			}
			
		}
		mostrarContenidoMatriz(matriz);
		
		
	}
	
	public static void mostrarContenidoMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
	}
	

}
