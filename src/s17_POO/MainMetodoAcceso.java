package s17_POO;

public class MainMetodoAcceso {

	public static void main(String[] args) {
		
		MetodoDeAcceso metodo = new MetodoDeAcceso("luis", "1234");
		System.out.println(metodo);
		
		System.out.println(metodo.conectando("sed", "yhbf"));
		System.out.println(metodo);
		
		System.out.println(metodo.conectando("sed", "yhbf"));
		System.out.println(metodo);
		System.out.println(metodo.conectando("sed", "yhbf"));
		System.out.println(metodo);
		System.out.println(metodo.conectando("sed", "yhbf"));
		System.out.println(metodo);
		System.out.println(metodo.conectando("sed", "yhbf"));
		System.out.println(metodo);
		System.out.println(metodo.conectando("sed", "yhbf"));
		System.out.println(metodo);
		System.out.println(metodo.conectando("sed", "yhbf"));
		System.out.println(metodo);
		System.out.println(metodo.conectando("sed", "yhbf"));
		System.out.println(metodo);
		
		metodo.desbloquear("ASDF123QWE");
		
		System.out.println(metodo.conectando("luis", "1234"));
		System.out.println(metodo);
		
		metodo.desconectar();
		System.out.println(metodo);

	}

}
