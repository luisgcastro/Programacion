package ejemploRelacionesAplicacionPago;

public class PlataformaCliente {

	public static void main(String[] args) {
		
Cliente cliente = new Cliente();
		
		TarjetaDeCredito tarjeta = new TarjetaDeCredito();
		cliente.setTarjetaDeCredito(tarjeta);
		
		cliente.getTarjetaDeCredito().toString();
		
	}

}
