/**
 * 
 */
package gestionGasolinera.dal;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Yeray
 * RepostajeVehiculo: Entidad que refiera a la tabla de base de datos dlk_gga_tch_repostajeVehiculo.
 * Registro de los repostajes hechos por cliente.
 */
@Entity
@Table(name="dlk_tch_resp_respvehiculo", schema="dlk_gestorgasolinera")
public class RepostajeVehiculo {
	
	//Propiedades
		@Column(name="md_uuid_resp_veh", nullable=false)
		String md_uuid_resp_veh;
		@Column(name="md_fch_resp_veh", nullable=false)
		@Temporal(TemporalType.DATE) 
		Calendar md_fch_resp_veh;
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id_rep_veh", nullable=false)
		int id_rep_veh;
		
		@Column(name="importe_resp_veh", nullable=false) 
		int importe_resp_veh;
		
		@Column(name="dni_resp_veh", nullable=false)
		String dni_resp_veh;
		
		@Column(name="matrícula_resp_veh", nullable=false)
		String matrícula_resp_veh;
		@Column(name="combustible", nullable=false)
		int litros_combustible;
		@Column(name="combustible", nullable=false)
		String combustible;
		@ManyToOne
	    @JoinColumn(name = "litros_combustible")
		TiposCombustible TiposCombustibles;
//GETTERS AND SETTERS
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
		public int getLitros_combustible() {
			return litros_combustible;
		}

		public void setLitros_combustible(int litros_combustible) {
			this.litros_combustible = litros_combustible;
		}
}
