package gestionGasolinera.dal;

import java.util.Calendar;

import javax.persistence.*;

import org.hibernate.type.CalendarType;

/**
 * @author Yeray 
 * RepostajeGasolinera: Entidad que refiera a la tabla de base de datos dlk_gga_tch_repostajeGasolinera.
 * Registros de la recepción de combustible de la gasolinera.
 */

/*
 * IMPORTANTE: La base de datos y el esquema si hay que crearlo. La tabla se generará sola.
 */

@Entity
@Table(name="dlk_tch_gasolinera",schema="dlk_gestorgasolinerara")
public class RepostajeGasolinera {

	//ATRIBUTOS

	@Column(name="md_uuid_resp_ga")
	private String md_uuid_resp_ga;

	@Column (name="dni_usuario_resp_ga")
	private String dni_usuario_resp_ga;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_resp_ga")
	private int id_resp_ga;
	
	@Column (name="importe_resp_ga")
	private int importe_resp_ga;
	
	@Column(name="esfactura")
	private boolean esfactura;
	
	@Column(name="md_fch_resp_ga")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar  md_fch_resp_ga;
	
	@Column(name="matricula_resp_ga", insertable=false)
	private String matricula_resp_ga;
	
	@Column(name="litros_combustible", nullable=false)
	private int litros_combustible;
	@ManyToOne
    @JoinColumn(name = "litros_combustible")
	TiposCombustible TiposCombustibles;
	//GETTERS SETTERS
	public String getMd_uuid_resp_ga() {
		return md_uuid_resp_ga;
	}

	public void setMd_uuid_resp_ga(String md_uuid_resp_ga) {
		this.md_uuid_resp_ga = md_uuid_resp_ga;
	}

	public String getDni_usuario_resp_ga() {
		return dni_usuario_resp_ga;
	}

	public void setDni_usuario_resp_ga(String dni_usuario_resp_ga) {
		this.dni_usuario_resp_ga = dni_usuario_resp_ga;
	}

	public int getId_resp_ga() {
		return id_resp_ga;
	}

	public void setId_resp_ga(int id_resp_ga) {
		this.id_resp_ga = id_resp_ga;
	}

	public int getImporte_resp_ga() {
		return importe_resp_ga;
	}

	public void setImporte_resp_ga(int importe_resp_ga) {
		this.importe_resp_ga = importe_resp_ga;
	}

	public boolean isEsfactura() {
		return esfactura;
	}

	public void setEsfactura(boolean esfactura) {
		this.esfactura = esfactura;
	}

	public Calendar getMd_fch_resp_ga() {
		return md_fch_resp_ga;
	}

	public void setMd_fch_resp_ga(Calendar md_fch_resp_ga) {
		this.md_fch_resp_ga = md_fch_resp_ga;
	}

	public String getMatricula_resp_ga() {
		return matricula_resp_ga;
	}

	public void setMatricula_resp_ga(String matricula_resp_ga) {
		this.matricula_resp_ga = matricula_resp_ga;
	}
	public int getlitros_combustible() {
		return litros_combustible;
	}

	public void setlitros_combustible(int litros_combustible) {
		this.litros_combustible = litros_combustible;
	}
	@Override
	public String toString() {
		return "RepostajeGasolinera [id_resp_ga=" + id_resp_ga + ", matricula_resp_ga="
				+ matricula_resp_ga + ", factura=" + esfactura
				+ ", dni_usuario_resp_ga=" + dni_usuario_resp_ga
				+ ", importe_resp_ga=" + importe_resp_ga + ", md_fch_resp_ga="
				+ md_fch_resp_ga + "]";
	}	
	
}
