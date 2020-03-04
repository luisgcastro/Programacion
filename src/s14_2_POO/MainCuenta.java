package s14_2_POO;

public class MainCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("Manuel");
		Cuenta cuenta2 = new Cuenta("Pepe", 1.000);

	
	System.out.println(cuenta1);
	System.out.println(cuenta2);
	
	System.out.println("--------------------");
	
	cuenta1.ingresar(400);
	System.out.println(cuenta1);
	
	cuenta2.retirar(400);
	System.out.println(cuenta2);

}
}
