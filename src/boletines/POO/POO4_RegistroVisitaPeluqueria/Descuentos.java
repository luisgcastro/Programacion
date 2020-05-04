package boletines.POO.POO4_RegistroVisitaPeluqueria;

public class Descuentos {
	
	NORMAL(0),
	PREMIUM(0.05),
	GOLD(0.1);
	
	private double descuento;

	private Descuentos(double descuento) {
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}
}
