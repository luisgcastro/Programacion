package s15_POO;

public class Reloj {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Reloj() {
	}
	
	public Reloj(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	@Override
	public String toString() {
		return "Reloj [hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + "]";
	}
	
	public String dameHora() {
		String out = this.hora+":"+this.minuto+":"+this.segundo;
		return out;
		
	}
	
	public String dameHora(String tipo) {
		String out = "";
		if (tipo.equals("24hrs")) {
			return dameHora();
			
			
		}else if (tipo.equals("12hrs")) {
			if (this.hora>12) {
				out = (this.hora-12)+ ":"+this.minuto+":"+this.segundo + "PM";
					
			}else {
				out = this.hora+ ":"+this.minuto+":"+this.segundo + "AM";
				
			}
			
		}else {
			out = "Formato incorrecto";
		}
		return out;
	}
		
				
	}


