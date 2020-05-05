package lecciones.T6_UTILIZACION_AVANZADA_DE_CLASES.HerenciaClaseAbstractaInterfaz.Herencia;

public class Tigre extends Animal {
	
	private int velocidad;

	public Tigre(String especie, String color, String tipoAlimentacion, int velocidad) {
		super(especie, color, tipoAlimentacion);
		this.velocidad = velocidad;
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		super.comer();
		System.out.println("El tigre tras comer se relame");
	}
	
	@Override
	public void dormir() {
		System.out.println("el tigre ronca bastante");
	}
	
	public void rugir() {
		System.out.println("El tigre ruge");
		super.dormir();
	}
	
	public int getVelocidad() {
		return velocidad;
	}


}
