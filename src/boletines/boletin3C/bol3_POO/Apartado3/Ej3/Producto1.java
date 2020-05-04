package boletines.boletin3C.bol3_POO.Apartado3.Ej3;

public class Producto1 {
	
	private String nombre;
	private int unidades;
	private double precio;
	
	public Producto1(String nombre, int unidades, double precio) {
		this.nombre = nombre;
		this.unidades = unidades;
		this.precio = precio;
	}

	public void Producto(String nombre2, int unidades2, double precio2) {
		// TODO Auto-generated constructor stub
	}

	public void Producto1(String nombre2, int unidades2, double precio2) {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", unidades=" + unidades + ", precio=" + precio + "]";
	}

	public double calcular1() {
		return (this.precio*this.unidades);
	}

	public double calcular() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
