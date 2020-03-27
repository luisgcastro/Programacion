package inmobiliaria;

public class Vivienda {
	
	private int altura;
	private int habitaciones;
	private int codPostal;
	
	public Vivienda(int altiura, int habitaciones, int codPostal, int altura) {
		
		super();
		this.altura = altura;
		this.habitaciones = habitaciones;
		this.codPostal = codPostal;

	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}
	
	

	

}
