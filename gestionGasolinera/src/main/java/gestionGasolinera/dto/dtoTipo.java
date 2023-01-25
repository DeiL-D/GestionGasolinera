package gestionGasolinera.dto;

import java.util.Calendar;

public class dtoTipo {
	/**
	 * @author yeray
	 */
	// Propiedades
	String md_uuid;
	Calendar md_fch;
	int litros_combustible;
	String combustible;
	
//constuctor general
	public dtoTipo(int id_repostaje_gasolinera, int litros_combustible,String combustible) {
		this.md_uuid = ValorRandom();
		this.litros_combustible = litros_combustible;
		this.combustible = combustible;
		this.md_fch = Calendar.getInstance();
	}


	
 // constuctor Vacío
	 
	public dtoTipo() {
		super();
	}

	
	//GETTERS AND SETTERS
	public String getMd_uuid() {
		return md_uuid;
	}


	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}


	public Calendar getMd_fch() {
		return md_fch;
	}


	public void setMd_fch(Calendar md_fch) {
		this.md_fch = md_fch;
	}




	public int getLitros_combustible() {
		return litros_combustible;
	}


	public void setLitros_combustible(int litros_combustible) {
		this.litros_combustible = litros_combustible;
	}


	public String getTipo_combustible_gasolinera() {
		return combustible;
	}


	public void setTipo_combustible_gasolinera(String combustible) {
		this.combustible = combustible;
	}
	
	
	//ToString metodo que hace legible a la clase
	@Override
	public String toString() {
		return "GasolineraDTO [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", litros_combustible=" + litros_combustible
				+ ", combustible=" + combustible + "]";
	}


	//Método que genera un valor aleatorio para el campo MdUuid       
    String ValorRandom()
    {
    	int random = (int)Math.floor(Math.random()*20+20);
        return (String.valueOf(random));
    }
}
