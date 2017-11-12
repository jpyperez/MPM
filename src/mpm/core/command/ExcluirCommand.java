package mpm.core.command;

import mpm.core.app.Resultado;
import mpm.core.dominio.EntidadeDominio;

public class ExcluirCommand extends AbstractCommand{

	
	public Resultado execute(EntidadeDominio entidade) {
		
		return fachada.excluir(entidade);
	}

}
