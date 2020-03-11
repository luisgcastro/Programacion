package s15_POO;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anno;
	
	public Fecha(int dia, int mes, int anno) {
		this.dia = dia;
		this.anno = mes;
		this.mes = anno;
	}

	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * @return the anno
	 */
	public int getAnno() {
		return anno;
	}

	/**
	 * @param anno the anno to set
	 */
	public void setAnno(int anno) {
		this.anno = anno;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anno=" + anno + "]";
	}
	
	public boolean comprobarFecha() {
		if (this.dia<1 || this.dia>31) {
			return false;
		}
		if (this.mes<1 || this.mes>12) {
			return false;
			
		}
		if (this.anno>2020) {
			return false;
		}
		return true;
	}
	
	public void incrementar() {
		this.dia ++;
		if (this.dia>31) {
			this.dia = 1;
			this.mes ++;
		}
		if (this.mes >12) {
			this.mes = 1;
			this.anno++;
		
		}
	}

}
