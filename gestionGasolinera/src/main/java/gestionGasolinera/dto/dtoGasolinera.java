package gestionGasolinera.dto;

import java.util.Calendar;





public class dtoGasolinera {
	
	
	String md_uuid_resp_ga;
	Calendar md_fch_resp_ga;
	int id_resp_ga;
	int litros_combustible;
	String dni_usuario_resp_ga;
	int importe_resp_ga;
	boolean esfactura;
	
	
	//GETTERS AND SETTERS
	public String getMd_uuid_resp_ga() {
		return md_uuid_resp_ga;
	}
	public void setMd_uuid_resp_ga(String md_uuid_resp_ga) {
		this.md_uuid_resp_ga = md_uuid_resp_ga;
	}
	public Calendar getMd_fch_resp_ga() {
		return md_fch_resp_ga;
	}
	public void setMd_fch_resp_ga(Calendar md_fch_resp_ga) {
		this.md_fch_resp_ga = md_fch_resp_ga;
	}
	public int getId_resp_ga() {
		return id_resp_ga;
	}
	public void setId_resp_ga(int id_resp_ga) {
		this.id_resp_ga = id_resp_ga;
	}
	public int getLitros_combustible() {
		return litros_combustible;
	}
	public void setLitros_combustible(int litros_combustible) {
		this.litros_combustible = litros_combustible;
	}
	public String getDni_usuario_resp_ga() {
		return dni_usuario_resp_ga;
	}
	public void setDni_usuario_resp_ga(String dni_usuario_resp_ga) {
		this.dni_usuario_resp_ga = dni_usuario_resp_ga;
	}
	public int getImporte_resp_ga() {
		return importe_resp_ga;
	}
	public void setImporte_resp_ga(int importe_resp_ga) {
		this.importe_resp_ga = importe_resp_ga;
	}
	public boolean getEsfactura() {
		return esfactura;
	}
	public void setEsfactura(boolean esfactura) {
		this.esfactura = esfactura;
	}
	
	//constructor general factura
	public dtoGasolinera(  int id_resp_ga, int litros_combustible,
			String dni_usuario_resp_ga, int importe_resp_ga, boolean esfactura) {
		this.md_uuid_resp_ga = ValorRandom();
		this.md_fch_resp_ga = Calendar.getInstance();
		this.id_resp_ga = id_resp_ga;
		this.litros_combustible = litros_combustible;
		this.dni_usuario_resp_ga = dni_usuario_resp_ga;
		this.importe_resp_ga = importe_resp_ga;
		this.esfactura = esfactura;
	}
	
	//constructor general normal
	public dtoGasolinera(int importe_resp_ga, boolean esfactura) {
		this.md_fch_resp_ga = Calendar.getInstance();
		this.importe_resp_ga = importe_resp_ga;
		this.esfactura = esfactura;
	}
	//cosntructor vacio:
	public dtoGasolinera() {
	
	}
	public String toString() {
		return "dtoGasolinera [md_uuid_resp_ga=" + md_uuid_resp_ga + ", md_fch_resp_ga=" + md_fch_resp_ga + ", id_resp_ga="
				+ id_resp_ga + ", litros_combustible=" + litros_combustible +  ", dni_usuario_resp_ga=" + dni_usuario_resp_ga +", importe_resp_ga=" 
				+importe_resp_ga+  ", esfactura=" + esfactura + "]";
	}
	 String ValorRandom()
	    {
	    	int random = (int)Math.floor(Math.random()*20+20);
	        return (String.valueOf(random));
	    }
}
