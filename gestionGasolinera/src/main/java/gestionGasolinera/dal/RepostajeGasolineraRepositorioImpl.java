/**
 * 
 */
package gestionGasolinera.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import gestionGasolinera.dal.*;
/**
 * @author yeray
 * Implementación de la interfaz RepostajeGasolineraRepositorio
 */
@Repository
public class RepostajeGasolineraRepositorioImpl implements RepostajeGasolineraRepositorio{

	@PersistenceContext
	private EntityManager em;

	

	public void insert(RepostajeGasolinera repostaje) throws Exception{
		em.persist(repostaje);	
		em.clear();
		em.close();
	}

	public void update(RepostajeGasolinera repostaje) throws Exception{
		// TODO Auto-generated method stub
		
	}

	public void del(RepostajeGasolinera repostaje) throws Exception{
		em.remove(repostaje);
		em.clear();
		em.close();	
	}

	
	public void insert_resp_gas(RepostajeGasolinera repostajeGasolinera) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public List<RepostajeGasolinera> selectAll() throws Exception{
		return em.createQuery("SELECT resp FROM RepostajeGasolinera resp").getResultList();
	}

	

	


}
