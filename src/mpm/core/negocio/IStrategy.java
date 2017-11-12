package mpm.core.negocio;

import mpm.core.dominio.EntidadeDominio;


public interface IStrategy 
{

	public String processar(EntidadeDominio entidade);
	
}
