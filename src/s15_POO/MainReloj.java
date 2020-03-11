package s15_POO;

public class MainReloj {

	public static void main(String[] args) {
		
		Reloj reloj = new Reloj(19, 35, 20);
		System.out.println(reloj);
		System.out.println(reloj.dameHora());
		System.out.println("24hrs: " +reloj.dameHora("24hrs"));
		System.out.println("12hrs: " +reloj.dameHora("12hrs"));
		System.out.println("11hrs: " +reloj.dameHora("11hrs"));

	}

}
