package s16_POO;

public class Ej5Persona {
	
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;
	
	
	private final int PESOBAJO = -1;
	private final int PESOIDEAL = 0;
	private final int SOBREPESO = 1;
    
	
	
	public Ej5Persona() {
		super();
	}



	public Ej5Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}



	public Ej5Persona(String nombre, int edad, String dNI, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public int calcularIMC() {
		
		double peso_ideal = this.peso / Math.pow(this.altura, 2);
		
		if (peso_ideal<20) {
			return PESOBAJO;
			
		}else if (peso_ideal<=25) {
			return PESOIDEAL;
		}else {
			return SOBREPESO;
		}
		
	}
	
	public boolean esMayorDeEdad() {
		
		if (this.edad>=18) {
			return true;
		}else {
			return false;
		}
		
		
	}
	public boolean comprobarSexo(char sexo) {
		
		if (sexo == this.sexo ) {
			return true;
		}else {
			return false;
		}
	}



	@Override
	public String toString() {
		return "Ej5Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	
	
	public void generaDNI() {
		
		System.out.println("Generar DNI");
		int multli = 100000000;
		int num8Digitos = (int)(Math.random()*multli);
		
		String caracteresDNI="TRWAGMYFPDXBNJZSQVHLCKE";
		
		String DNI_completo = String.valueOf(num8Digitos)+caracteresDNI.charAt(num8Digitos%23);
		this.DNI = DNI_completo;
		
		
		
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}



	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}



	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}



	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}



	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}



	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}



	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}



	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}



	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	


	
	
	

}
