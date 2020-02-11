package s14_POO;

public class Perro {
	
	private String nombre;
	private String raza;
	private int edad;
	private boolean tieneChip;
	
	
	public Perro(String nombre, String raza, int edad, boolean tieneChip) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.tieneChip = tieneChip;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isTieneChip() {
		return tieneChip;
	}


	public void setTieneChip(boolean tieneChip) {
		this.tieneChip = tieneChip;
	}
	
	
	
	

}
