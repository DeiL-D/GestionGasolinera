/**
 * 
 */
package gestionGasolinera.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author yeray
 * Implementación de la interfaz TiposCombustibleServicio
 */
public class TiposCombustibleServicioImpl implements TiposCombustibleServicio {

	@PersistenceContext
	private EntityManager em;

	

	public void insert(TiposCombustible TiposCombustible) throws Exception{
		em.persist(TiposCombustible);	
		em.clear();
		em.close();
	}

	public void update(TiposCombustible TiposCombustible) throws Exception{
		// TODO Auto-generated method stub
		
	}

	public void del(TiposCombustible TiposCombustible) throws Exception{
		em.remove(TiposCombustible);
		em.clear();
		em.close();	
	}

	
	public void insert_tipocom(TiposCombustible TiposCombustible) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public List<TiposCombustible> selectAll() throws Exception{
		return em.createQuery("SELECT rsp FROM RepostajeVehiculo rsp").getResultList();
	
	}
}
