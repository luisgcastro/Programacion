package boletines.boletin3C.bol3_POO.Apartado3.Ej3;

public class NoPerecedero extends Producto1 {
	
	private String tipo;

	public NoPerecedero(String nombre, int unidades, double precio, String tipo) {
		super(nombre, unidades, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "NoPerecedero [tipo=" + tipo + "]";
	}
	
	

	

}
