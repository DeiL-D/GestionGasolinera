/**
 * 
 */
package gestionGasolinera.dal;

import java.util.List;

/**
 * @author Yeray
 * TiposCombustibleServicio: Interfaz con las operaciones básicas contra base de datos para la tabla dlk_gga_tch_TiposCombustible.
 */
public interface TiposCombustibleServicio {

	/**
	 * insertarRepostajeGasolinera: inserta un nuevo repostaje
	 * @param repostajeGasolinera DAO con el nuevo repostaje
	 */
	public void insert_tipocom(TiposCombustible TiposCombustible) throws Exception;

	/**
	 * Método que inserta un nuevo repostage en base de datos.
	 * @param repostaje
	 */
	public void insert(TiposCombustible TiposCombustible) throws Exception;
	
	
	/**
	 * Método que trae todos los registros de la tabla dlk_tch_RepostajeGasolinera
	 * @return List<RepostajeGasolinera>
	 */
	public List<TiposCombustible> selectAll() throws Exception;
	
	
	/**
	 * Método que elimina un repostage en base de datos.
	 * @param repostaje
	 */
	public void del(TiposCombustible TiposCombustible) throws Exception;
	
	/**
	 * Método que actualiza la base de datos
	 * @param repostaje
	 */
	public void update(TiposCombustible TiposCombustible) throws Exception;
}
