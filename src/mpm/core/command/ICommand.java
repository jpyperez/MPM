
package mpm.core.command;

import mpm.core.app.Resultado;
import mpm.core.dominio.EntidadeDominio;


public interface ICommand {

	public Resultado execute(EntidadeDominio entidade);
	
}
