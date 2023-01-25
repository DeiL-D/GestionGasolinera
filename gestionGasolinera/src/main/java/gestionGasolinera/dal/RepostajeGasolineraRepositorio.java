/**
 * 
 */
package gestionGasolinera.dal;

import java.util.List;

/**
 * @author yeray
 * RepostajeGasolineraRepositorio: Interfaz con las operaciones básicas contra base de datos para la tabla dlk_gga_tch_repostajeGasolinera.
 */
public interface RepostajeGasolineraRepositorio {
	
	/**
	 * insertarRepostajeGasolinera: inserta un nuevo repostaje
	 * @param repostajeGasolinera DAO con el nuevo repostaje
	 */
	public void insert_resp_gas(RepostajeGasolinera repostajeGasolinera) throws Exception;

	/**
	 * Método que inserta un nuevo repostage en base de datos.
	 * @param repostaje
	 */
	public void insert(RepostajeGasolinera repostaje) throws Exception;
	
	
	/**
	 * Método que trae todos los registros de la tabla dlk_tch_RepostajeGasolinera
	 * @return List<RepostajeGasolinera>
	 */
	public List<RepostajeGasolinera> selectAll() throws Exception;
	
	
	/**
	 * Método que elimina un repostage en base de datos.
	 * @param repostaje
	 */
	public void del(RepostajeGasolinera repostaje) throws Exception;
	
	/**
	 * Método que actualiza la base de datos
	 * @param repostaje
	 */
	public void update(RepostajeGasolinera repostaje) throws Exception;
	
	
}
