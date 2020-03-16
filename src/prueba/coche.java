package prueba;

public class coche {
	
	private int plazas;
	private boolean automatico;
	private int ruedas;

	

	public coche(int plazas, boolean automatico, int ruedas) {
		super();
		this.plazas = plazas;
		this.automatico = automatico;
		this.ruedas = ruedas;
	}



	/**
	 * @return the plazas
	 */
	public int getPlazas() {
		return plazas;
	}



	/**
	 * @param plazas the plazas to set
	 */
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}



	/**
	 * @return the automatico
	 */
	public boolean isAutomatico() {
		return automatico;
	}



	/**
	 * @param automatico the automatico to set
	 */
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}



	/**
	 * @return the ruedas
	 */
	public int getRuedas() {
		return ruedas;
	}



	/**
	 * @param ruedas the ruedas to set
	 */
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
}