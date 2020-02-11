package s14_POO;

public class Perrera {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro("boby", "Pastor Aleman", 4, true);
		Perro perro2 = new Perro("Lacie", "Collie",4, false);
	
	System.out.println("Perro1"   );
	System.out.println("Edad:"+perro1.getEdad() );
	System.out.println("Raza:"+perro1.getRaza()   );
	System.out.println("Chip:"+perro1.isTieneChip()  );
	System.out.println("Nombre:"+perro1.getNombre()   );
	
	
	
	if (perro2.isTieneChip()) {
		System.out.println("tiene chip");
		
		
	}
	else {
		System.out.println("no tiene chip");
		System.out.println("vamos a ponerle un chip");
		perro2.setTieneChip(true);
	}
	

	System.out.println("Perro2"   );
	System.out.println("Edad:"+perro2.getEdad() );
	System.out.println("Raza:"+perro2.getRaza()   );
	System.out.println("Chip:"+perro2.isTieneChip()  );
	System.out.println("Nombre:"+perro2.getNombre()   );
	
	}
	
}
