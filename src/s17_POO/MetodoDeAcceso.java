package s17_POO;

public class MetodoDeAcceso {
	
	public final static int DESCONECTADO = 0;
	public final static int CONECTADO = 1;
	public final static int BLOQUEADO = 2;
	
	private int estadoAcceso;
	private String usuario;
	private String password;
	private int numIntentos;
	private String PUK;
	
	public MetodoDeAcceso(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.numIntentos = 5;
		this.PUK = "ASDF123QWE";
		this.estadoAcceso = DESCONECTADO;
	}

	public MetodoDeAcceso(String usuario, String password, int numIntentos) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.numIntentos = numIntentos;
		this.PUK = "ASDF123QWE";
		this.estadoAcceso = DESCONECTADO;
	}
	
	

	public int getEstadoAcceso() {
		return estadoAcceso;
	}

	public void setEstadoAcceso(int estadoAcceso) {
		this.estadoAcceso = estadoAcceso;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getNumIntentos() {
		return numIntentos;
	}

	public void setNumIntentos(int numIntentos) {
		this.numIntentos = numIntentos;
	}

	public String getPUK() {
		return PUK;
	}

	public void setPUK(String pUK) {
		PUK = pUK;
	}

	@Override
	public String toString() {
		
		String estadoEnTexto="";
		if (this.estadoAcceso == CONECTADO) {
			estadoEnTexto ="Dispo Conectado";
		}else if (this.estadoAcceso == DESCONECTADO) {
			estadoEnTexto = "Dispo Desconectado";
		}else { 
			estadoEnTexto = "Dispo bloqueado";
		}
		
		return "MetodoDeAcceso [estadoAcceso=" + estadoEnTexto + ", usuario=" + usuario + ", password=" + password
				+ ", numIntentos=" + numIntentos + ", PUK=" + PUK + "]";
	}
	
	public boolean estadoConectado() {
		if (this.estadoAcceso == CONECTADO) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public boolean estadoBloqueado() {
		if (this.estadoAcceso == BLOQUEADO) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public int obtenerNumeroIntentos(){
		return this.numIntentos;
	}
	
	public boolean conectando(String user, String pass) {
		
		if (this.estadoAcceso == BLOQUEADO) {
			
		} else {
			if (this.estadoAcceso == DESCONECTADO) {
				
				if (user.equals(this.usuario) && pass.equals(this.password)) {
					this.estadoAcceso = CONECTADO; 
					return true;
				}else {
					numIntentos --;
					
					if (numIntentos == 0) {
						this.estadoAcceso = BLOQUEADO;
					}
					
				}

		} else {
			return true; 
		}
	}
	
	return false;
	
	}
	
	public boolean desbloquear(String PUK) {
		if(this.estadoAcceso == BLOQUEADO) {
			if (this.PUK.equals(PUK)) {
				this.estadoAcceso =DESCONECTADO;
				this.numIntentos = 5;
			}else {
						
				return false;
			}
			
		}
		return true;
	}
	

}
