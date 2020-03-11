package s15_POO;

public class MainFecha {

	public static void main(String[] args) {
		
		Fecha fecha = new Fecha(9, 2020, 3);
		System.out.println(fecha);
		
		System.out.println(fecha.comprobarFecha());
		
		for (int i = 0; i < 100; i++) {
			fecha.incrementar();
			System.out.println(fecha);
			
		}

	}

}
