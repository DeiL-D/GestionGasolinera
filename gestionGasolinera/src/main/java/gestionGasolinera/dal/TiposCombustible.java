/**
 * 
 */
package gestionGasolinera.dal;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import edu.gestionGasolinera.dal.RepostajeGasolinera;
import edu.gestionGasolinera.dal.RepostajeVehiculo;

/**
 * @author Yeray
 * TiposCombustible: Entidad que refiere a la tabla dlk_gga_cat_tiposCombustible.
 * Catálogo de tipos de combustible.
 */
public class TiposCombustible {

	// Propiedades
	@Column(name = "md_uuid", nullable = false)
	String md_uuid;
	
	@Column(name = "md_fch", nullable = false)
	@Temporal(TemporalType.DATE) 
	Calendar md_fch;
	
	@Column(name = "litros_combustible", nullable = false)
	int litros_combustible;
	
	@Column(name = "combustible", nullable = false)
	int combustible;
	   
	//@Column(name = "tipo_combustible", nullable = false)
	@OneToMany(mappedBy="TiposCombustible")
	List<RepostajeGasolinera> repostaje_gasolinera;
	
	@OneToMany(mappedBy="TiposCombustible") 
	List<RepostajeVehiculo> repostaje_vehiculo;
}
