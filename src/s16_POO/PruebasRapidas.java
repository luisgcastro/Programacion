package s16_POO;

public class PruebasRapidas {
	
	public static void main(String[] args) {
		int multli = 100000000;
		int num8Digitos = (int)(Math.random()*multli);
		
		System.out.println(num8Digitos);
		
		System.out.println(num8Digitos%23);
		
		String caracteresDNI="TRWAGMYFPDXBNJZSQVHLCKE";
		
		System.out.println(caracteresDNI.charAt(num8Digitos%23));
		
		String DNI_completo = String.valueOf(num8Digitos)+caracteresDNI.charAt(num8Digitos%23);
		
		System.out.println(DNI_completo);
		
		
		
				
	}

}
