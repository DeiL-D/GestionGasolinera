/**
 * 
 */
package gestionGasolinera.dal;

import java.util.List;

/**
 * @author yeray
 * RepostajeVehiculoServicio: Interfaz con las operaciones básicas contra base de datos para la tabla dlk_gga_tch_repostajeVehiculo.
 */
public interface RepostajeVehiculoServicio {

	/**
	 * insertarRepostajeGasolinera: inserta un nuevo repostaje
	 * @param repostajeGasolinera DAO con el nuevo repostaje
	 */
	public void insert_resp_veh(RepostajeVehiculo RepostajeVehiculo) throws Exception;

	/**
	 * Método que inserta un nuevo repostage en base de datos.
	 * @param repostaje
	 */
	public void insert(RepostajeVehiculo RepostajeVehiculo) throws Exception;
	
	
	/**
	 * Método que trae todos los registros de la tabla dlk_tch_RepostajeGasolinera
	 * @return List<RepostajeGasolinera>
	 */
	public List<RepostajeVehiculo> selectAll() throws Exception;
	
	
	/**
	 * Método que elimina un repostage en base de datos.
	 * @param repostaje
	 */
	public void del(RepostajeVehiculo RepostajeVehiculo) throws Exception;
	
	/**
	 * Método que actualiza la base de datos
	 * @param repostaje
	 */
	public void update(RepostajeVehiculo RepostajeVehiculo) throws Exception;
	
}
