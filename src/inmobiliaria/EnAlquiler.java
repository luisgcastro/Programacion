package inmobiliaria;

public class EnAlquiler extends Vivienda {
	
	private double precioAlquiler;
	private int mesesFianza;
	
	public EnAlquiler(int altura, int habitaciones, int codPostal, int mesesFianza, double precioAlquiler) {
		super(altura, habitaciones, codPostal);
		this.precioAlquiler = precioAlquiler;
		this.mesesFianza = mesesFianza;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	public int getMesesFianza() {
		return mesesFianza;
	}

	public void setMesesFianza(int mesesFianza) {
		this.mesesFianza = mesesFianza;
	}
	

}
