package inmobiliaria;

public class EnVenta extends Vivienda{
	
	private double precio;
	private double señal;
	private double comision;
	
	public EnVenta(int altura, int habitaciones, int codPostal, double precio, double señal, double comision) {
		super(altura, habitaciones, codPostal, codPostal);
		this.precio = precio;
		this.señal = señal;
		this.comision = comision;

	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getSeñal() {
		return señal;
	}

	public void setSeñal(double señal) {
		this.señal = señal;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	

	
}
