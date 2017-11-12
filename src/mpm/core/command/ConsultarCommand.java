package mpm.core.command;

import mpm.core.app.Resultado;
import mpm.core.dominio.EntidadeDominio;


public class ConsultarCommand extends AbstractCommand{

	
	public Resultado execute(EntidadeDominio entidade) {
		
		return fachada.consultar(entidade);
	}

}
