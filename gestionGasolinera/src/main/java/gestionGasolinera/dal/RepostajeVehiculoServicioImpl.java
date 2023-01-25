/**
 * 
 */
package gestionGasolinera.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author yeray
 * Implementación de la interfaz RepostajeVehiculoServicio
 */
public class RepostajeVehiculoServicioImpl implements RepostajeVehiculoServicio {
	@PersistenceContext
	private EntityManager em;

	

	public void insert(RepostajeVehiculo vehiculo) throws Exception{
		em.persist(vehiculo);	
		em.clear();
		em.close();
	}

	public void update(RepostajeVehiculo vehiculo) throws Exception{
		// TODO Auto-generated method stub
		
	}

	public void del(RepostajeVehiculo vehiculo) throws Exception{
		em.remove(vehiculo);
		em.clear();
		em.close();	
	}

	
	public void insert_resp_veh(RepostajeVehiculo repostajeVehiculo) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public List<RepostajeVehiculo> selectAll() throws Exception{
		return em.createQuery("SELECT resp FROM RepostajeVehiculo resp").getResultList();
	
	}
}
