package gestionGasolinera.dto;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import gestionGasolinera.dal.TiposCombustible;

public class dtoVehiculo {



/**
 * @author yeray
 */
public class VehiculoDTO {
	
	//Propiedades
	
	Calendar md_fch_resp_veh;
	int id_rep_veh;
	int importe_resp_veh;	
	String dni_resp_veh;	
	String matrícula_resp_veh;	
	String combustible;
	
//constructor general
	public VehiculoDTO(int id_rep_veh,  int importe_resp_veh,
			String dNI, String matrícula_resp_veh, String combustible) {
		super();
		this.md_uuid_resp_veh = ValorRandom();
		this.id_rep_veh = id_rep_veh;
		this.importe_resp_veh = importe_resp_veh;
		dni_resp_veh = dni_resp_veh;
		this.matrícula_resp_veh = matrícula_resp_veh;
		this.combustible = combustible;
		this.md_fch_resp_veh = Calendar.getInstance();
	}
	
	
	// Construtor Vacío
	public VehiculoDTO() {
		
	}


	//GETTERS AND SETTERS
	String md_uuid_resp_veh;
	public String getMd_uuid_resp_veh() {
		return md_uuid_resp_veh;
	}
	public void setMd_uuid_resp_veh(String md_uuid_resp_veh) {
		this.md_uuid_resp_veh = md_uuid_resp_veh;
	}


	public Calendar getMd_fch_resp_veh() {
		return md_fch_resp_veh;
	}


	public void setMd_fch_resp_veh(Calendar md_fch_resp_veh) {
		this.md_fch_resp_veh = md_fch_resp_veh;
	}


	public int getId_rep_veh() {
		return id_rep_veh;
	}


	public void setId_rep_veh(int id_rep_veh) {
		this.id_rep_veh = id_rep_veh;
	}


	public int getImporte_resp_veh() {
		return importe_resp_veh;
	}


	public void setImporte_resp_veh(int importe_resp_veh) {
		this.importe_resp_veh = importe_resp_veh;
	}


	public String getDni_resp_veh() {
		return dni_resp_veh;
	}


	public void setDni_resp_veh(String dni_resp_veh) {
		this.dni_resp_veh = dni_resp_veh;
	}


	public String getMatrícula_resp_veh() {
		return matrícula_resp_veh;
	}


	public void setMatrícula_resp_veh(String matrícula_resp_veh) {
		this.matrícula_resp_veh = matrícula_resp_veh;
	}


	public String getCombustible() {
		return combustible;
	}


	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	//ToString metodo que hace legible a la clase
	@Override
	public String toString() {
		return "VehiculoDTO [md_uuid_resp_veh=" + md_uuid_resp_veh + ", md_fch_resp_veh=" + md_fch_resp_veh + ", id_rep_veh="
				+ id_rep_veh +  ", importe_resp_veh=" + importe_resp_veh + ", dni_resp_veh=" + dni_resp_veh
				+ ", matrícula_resp_veh=" + matrícula_resp_veh + ", combustible=" + combustible + "]";
	}

	//Método que genera un valor aleatorio para el campo MdUuid       
	 String ValorRandom()
	    {
	    	int random = (int)Math.floor(Math.random()*20+20);
	        return (String.valueOf(random));
	    }
	}
}
