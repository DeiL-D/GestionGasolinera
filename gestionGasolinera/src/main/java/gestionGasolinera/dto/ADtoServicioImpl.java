/**
 * 
 */
package gestionGasolinera.dto;

import java.util.Calendar;

import org.springframework.stereotype.*;

import gestionGasolinera.dal.RepostajeGasolinera;

/**
 * @author garfe
 * Interfaz que implementa la case ADtoServicioImpl
 */
@Service
public class ADtoServicioImpl implements ADtoServicio{

	
	
	public dtoGasolinera ARepostajeGasolineraDTONormal( int importe_resp_ga,boolean esfactura) {
		
		dtoGasolinera rgDTONormal = new dtoGasolinera(importe_resp_ga,esfactura);
		
		return rgDTONormal;
	}



}
