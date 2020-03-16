package prueba;
import java.io.InputStream;
import java.util.*;

public class mercedes {

	public static void main(String[] args) {
		coche mercedes = new coche (5,false, 4);
		coche audi = new coche(5,true,4);
		
		System.out.println(mercedes);
		System.out.println(mercedes.getRuedas());
		System.out.println(mercedes.getPlazas());
		System.out.println(audi);
		System.out.println(audi.equals(mercedes));
		
		
				
	}

}
