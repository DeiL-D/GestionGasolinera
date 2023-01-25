/**
 * 
 */
package gestionGasolinera.dto;

import org.hibernate.type.CalendarType;

import gestionGasolinera.dal.RepostajeGasolinera;

/**
 * @author Yeray
 * Implementación de la interfaz ADaoServicio
 */
public class ADaoServicioImpl implements ADaoServicio{
	
	@Override
	public dtoGasolinera normalDaoToDto(dtoGasolinera dtoGasolinera) {
		
		RepostajeGasolinera repostajeGasolinera = new RepostajeGasolinera();
		if(dtoGasolinera != null) {
	
			repostajeGasolinera.setImporte_resp_ga(dtoGasolinera.getImporte_resp_ga());
			repostajeGasolinera.setMd_fch_resp_ga(dtoGasolinera.getMd_fch_resp_ga());
			repostajeGasolinera.setEsfactura(dtoGasolinera.getEsfactura());
			
		}
		return dtoGasolinera;
	}

	
}
