package s16_POO;

public class MainEj5Persona {

	public static void main(String[] args) {
		
		Ej5Persona per = new Ej5Persona("Luis", 21, 'H');
		per.setPeso(105);
		per.setAltura(1.85);
		
		System.out.println(per.calcularIMC());

	}

}
